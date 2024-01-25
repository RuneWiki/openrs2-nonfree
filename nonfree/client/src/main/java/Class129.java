import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class129 {

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
	private int anInt3952 = -1;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
	private int anInt3947 = 0;

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "Lclient!tc;")
	private Class195 aClass195_39 = new Class195();

	@OriginalMember(owner = "client!mi", name = "s", descriptor = "Z")
	public boolean aBoolean338 = false;

	@OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
	private final int anInt3955;

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
	private final int anInt3945;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "[Lclient!ho;")
	private Class1_Sub16[] aClass1_Sub16Array1;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(III)V")
	public Class129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3955 = arg0;
		this.anInt3945 = arg1;
		this.anIntArrayArrayArray9 = new int[this.anInt3955][3][arg2];
		this.aClass1_Sub16Array1 = new Class1_Sub16[this.anInt3945];
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)[[I")
	public int[][] method3671(@OriginalArg(1) int arg0) {
		if (this.anInt3955 == this.anInt3945) {
			this.aBoolean338 = this.aClass1_Sub16Array1[arg0] == null;
			this.aClass1_Sub16Array1[arg0] = Static148.aClass1_Sub16_3;
			return this.anIntArrayArrayArray9[arg0];
		} else if (this.anInt3955 == 1) {
			this.aBoolean338 = arg0 != this.anInt3952;
			this.anInt3952 = arg0;
			return this.anIntArrayArrayArray9[0];
		} else {
			@Pc(61) Class1_Sub16 local61 = this.aClass1_Sub16Array1[arg0];
			if (local61 == null) {
				this.aBoolean338 = true;
				if (this.anInt3947 < this.anInt3955) {
					local61 = new Class1_Sub16(arg0, this.anInt3947);
					this.anInt3947++;
				} else {
					@Pc(92) Class1_Sub16 local92 = (Class1_Sub16) this.aClass195_39.method5030();
					local61 = new Class1_Sub16(arg0, local92.anInt2504);
					this.aClass1_Sub16Array1[local92.anInt2505] = null;
					local92.method5710();
				}
				this.aClass1_Sub16Array1[arg0] = local61;
			} else {
				this.aBoolean338 = false;
			}
			this.aClass195_39.method5024(local61);
			return this.anIntArrayArrayArray9[local61.anInt2504];
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
	public void method3672() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3955; local7++) {
			this.anIntArrayArrayArray9[local7][0] = null;
			this.anIntArrayArrayArray9[local7][1] = null;
			this.anIntArrayArrayArray9[local7][2] = null;
			this.anIntArrayArrayArray9[local7] = null;
		}
		this.aClass1_Sub16Array1 = null;
		this.anIntArrayArrayArray9 = null;
		this.aClass195_39.method5032();
		this.aClass195_39 = null;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)[[[I")
	public int[][][] method3673() {
		if (this.anInt3945 != this.anInt3955) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt3955; local26++) {
			this.aClass1_Sub16Array1[local26] = Static148.aClass1_Sub16_3;
		}
		return this.anIntArrayArrayArray9;
	}
}
