import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class122 {

	@OriginalMember(owner = "client!le", name = "k", descriptor = "I")
	private int anInt3650 = -1;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "I")
	private int anInt3649 = 0;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "Lclient!bb;")
	private Class16 aClass16_19 = new Class16();

	@OriginalMember(owner = "client!le", name = "s", descriptor = "Z")
	public boolean aBoolean342 = false;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "I")
	private final int anInt3646;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "I")
	private final int anInt3647;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "[Lclient!ub;")
	private Class1_Sub35[] aClass1_Sub35Array1;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(III)V")
	public Class122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3646 = arg1;
		this.anInt3647 = arg0;
		this.aClass1_Sub35Array1 = new Class1_Sub35[this.anInt3646];
		this.anIntArrayArray41 = new int[this.anInt3647][arg2];
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)[[I")
	public int[][] method3384() {
		if (this.anInt3646 != this.anInt3647) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt3647; local29++) {
			this.aClass1_Sub35Array1[local29] = Static170.aClass1_Sub35_1;
		}
		return this.anIntArrayArray41;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)[I")
	public int[] method3385(@OriginalArg(0) int arg0) {
		if (this.anInt3647 == this.anInt3646) {
			this.aBoolean342 = this.aClass1_Sub35Array1[arg0] == null;
			this.aClass1_Sub35Array1[arg0] = Static170.aClass1_Sub35_1;
			return this.anIntArrayArray41[arg0];
		} else if (this.anInt3647 == 1) {
			this.aBoolean342 = arg0 != this.anInt3650;
			this.anInt3650 = arg0;
			return this.anIntArrayArray41[0];
		} else {
			@Pc(48) Class1_Sub35 local48 = this.aClass1_Sub35Array1[arg0];
			if (local48 == null) {
				this.aBoolean342 = true;
				if (this.anInt3649 >= this.anInt3647) {
					@Pc(73) Class1_Sub35 local73 = (Class1_Sub35) this.aClass16_19.method420();
					local48 = new Class1_Sub35(arg0, local73.anInt6126);
					this.aClass1_Sub35Array1[local73.anInt6125] = null;
					local73.method5628();
				} else {
					local48 = new Class1_Sub35(arg0, this.anInt3649);
					this.anInt3649++;
				}
				this.aClass1_Sub35Array1[arg0] = local48;
			} else {
				this.aBoolean342 = false;
			}
			this.aClass16_19.method411(local48);
			return this.anIntArrayArray41[local48.anInt6126];
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public void method3386() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3647; local3++) {
			this.anIntArrayArray41[local3] = null;
		}
		this.aClass1_Sub35Array1 = null;
		this.anIntArrayArray41 = null;
		this.aClass16_19.method421();
		this.aClass16_19 = null;
	}
}
