import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class34 {

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
	private int anInt903 = -1;

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
	private int anInt905 = 0;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "Lclient!oe;")
	private Class181 aClass181_8 = new Class181();

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "Z")
	public boolean aBoolean47 = false;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
	private final int anInt908;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
	private final int anInt901;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "[Lclient!nd;")
	private Class1_Sub29[] aClass1_Sub29Array1;

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(III)V")
	public Class34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt908 = arg1;
		this.anInt901 = arg0;
		this.aClass1_Sub29Array1 = new Class1_Sub29[this.anInt908];
		this.anIntArrayArrayArray3 = new int[this.anInt901][3][arg2];
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)[[[I")
	public int[][][] method817() {
		if (this.anInt901 != this.anInt908) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(23) int local23 = 0; local23 < this.anInt901; local23++) {
			this.aClass1_Sub29Array1[local23] = Static242.aClass1_Sub29_1;
		}
		return this.anIntArrayArrayArray3;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V")
	public void method822() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt901; local7++) {
			this.anIntArrayArrayArray3[local7][0] = null;
			this.anIntArrayArrayArray3[local7][1] = null;
			this.anIntArrayArrayArray3[local7][2] = null;
			this.anIntArrayArrayArray3[local7] = null;
		}
		this.aClass1_Sub29Array1 = null;
		this.anIntArrayArrayArray3 = null;
		this.aClass181_8.method4101();
		this.aClass181_8 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)[[I")
	public int[][] method823(@OriginalArg(0) int arg0) {
		if (this.anInt908 == this.anInt901) {
			this.aBoolean47 = this.aClass1_Sub29Array1[arg0] == null;
			this.aClass1_Sub29Array1[arg0] = Static242.aClass1_Sub29_1;
			return this.anIntArrayArrayArray3[arg0];
		} else if (this.anInt901 == 1) {
			this.aBoolean47 = arg0 != this.anInt903;
			this.anInt903 = arg0;
			return this.anIntArrayArrayArray3[0];
		} else {
			@Pc(32) Class1_Sub29 local32 = this.aClass1_Sub29Array1[arg0];
			if (local32 == null) {
				this.aBoolean47 = true;
				if (this.anInt905 >= this.anInt901) {
					@Pc(48) Class1_Sub29 local48 = (Class1_Sub29) this.aClass181_8.method4110();
					local32 = new Class1_Sub29(arg0, local48.anInt4649);
					this.aClass1_Sub29Array1[local48.anInt4648] = null;
					local48.method6020();
				} else {
					local32 = new Class1_Sub29(arg0, this.anInt905);
					this.anInt905++;
				}
				this.aClass1_Sub29Array1[arg0] = local32;
			} else {
				this.aBoolean47 = false;
			}
			this.aClass181_8.method4106(local32);
			return this.anIntArrayArrayArray3[local32.anInt4649];
		}
	}
}
