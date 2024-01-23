import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class75 {

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
	private int anInt3035 = 0;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
	private int anInt3036 = -1;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Lclient!sf;")
	private Class105 aClass105_15 = new Class105();

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "Z")
	public boolean aBoolean134 = false;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
	private int anInt3041;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	private int anInt3033;

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "[Lclient!ja;")
	private Class1_Sub14[] aClass1_Sub14Array1;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(III)V")
	public Class75(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3041 = arg0;
		this.anIntArrayArrayArray5 = new int[this.anInt3041][3][arg2];
		this.anInt3033 = arg1;
		this.aClass1_Sub14Array1 = new Class1_Sub14[this.anInt3033];
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)[[I")
	public int[][] method2410(@OriginalArg(0) int arg0) {
		if (this.anInt3041 == this.anInt3033) {
			this.aBoolean134 = this.aClass1_Sub14Array1[arg0] == null;
			this.aClass1_Sub14Array1[arg0] = Static81.aClass1_Sub14_1;
			return this.anIntArrayArrayArray5[arg0];
		} else if (this.anInt3041 == 1) {
			this.aBoolean134 = arg0 != this.anInt3036;
			this.anInt3036 = arg0;
			return this.anIntArrayArrayArray5[0];
		} else {
			@Pc(48) Class1_Sub14 local48 = this.aClass1_Sub14Array1[arg0];
			if (local48 == null) {
				this.aBoolean134 = true;
				if (this.anInt3035 < this.anInt3041) {
					local48 = new Class1_Sub14(arg0, this.anInt3035);
					this.anInt3035++;
				} else {
					@Pc(79) Class1_Sub14 local79 = (Class1_Sub14) this.aClass105_15.method3112();
					local48 = new Class1_Sub14(arg0, local79.anInt2063);
					this.aClass1_Sub14Array1[local79.anInt2059] = null;
					local79.method3758();
				}
				this.aClass1_Sub14Array1[arg0] = local48;
			} else {
				this.aBoolean134 = false;
			}
			this.aClass105_15.method3116(local48);
			return this.anIntArrayArrayArray5[local48.anInt2063];
		}
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(Z)[[[I")
	public int[][][] method2415() {
		if (this.anInt3033 != this.anInt3041) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt3041; local17++) {
			this.aClass1_Sub14Array1[local17] = Static81.aClass1_Sub14_1;
		}
		return this.anIntArrayArrayArray5;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
	public void method2417() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3041; local7++) {
			this.anIntArrayArrayArray5[local7][0] = null;
			this.anIntArrayArrayArray5[local7][1] = null;
			this.anIntArrayArrayArray5[local7][2] = null;
			this.anIntArrayArrayArray5[local7] = null;
		}
		this.aClass1_Sub14Array1 = null;
		this.anIntArrayArrayArray5 = null;
		this.aClass105_15.method3114();
		this.aClass105_15 = null;
	}
}
