import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class33 {

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
	private int anInt1598 = 0;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
	private int anInt1611 = -1;

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "Lclient!s;")
	private Class87 aClass87_10 = new Class87();

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "Z")
	public boolean aBoolean80 = false;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
	private final int anInt1603;

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
	private final int anInt1610;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "[Lclient!ke;")
	private Class1_Sub13[] aClass1_Sub13Array1;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(III)V")
	public Class33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1603 = arg0;
		this.anIntArrayArrayArray3 = new int[this.anInt1603][3][arg2];
		this.anInt1610 = arg1;
		this.aClass1_Sub13Array1 = new Class1_Sub13[this.anInt1610];
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)[[I")
	public int[][] method1274(@OriginalArg(0) int arg0) {
		if (this.anInt1610 == this.anInt1603) {
			this.aBoolean80 = this.aClass1_Sub13Array1[arg0] == null;
			this.aClass1_Sub13Array1[arg0] = Static128.aClass1_Sub13_1;
			return this.anIntArrayArrayArray3[arg0];
		} else if (this.anInt1603 == 1) {
			this.aBoolean80 = arg0 != this.anInt1611;
			this.anInt1611 = arg0;
			return this.anIntArrayArrayArray3[0];
		} else {
			@Pc(50) Class1_Sub13 local50 = this.aClass1_Sub13Array1[arg0];
			if (local50 == null) {
				this.aBoolean80 = true;
				if (this.anInt1603 <= this.anInt1598) {
					@Pc(71) Class1_Sub13 local71 = (Class1_Sub13) this.aClass87_10.method2828();
					local50 = new Class1_Sub13(arg0, local71.anInt2269);
					this.aClass1_Sub13Array1[local71.anInt2265] = null;
					local71.method3563();
				} else {
					local50 = new Class1_Sub13(arg0, this.anInt1598);
					this.anInt1598++;
				}
				this.aClass1_Sub13Array1[arg0] = local50;
			} else {
				this.aBoolean80 = false;
			}
			this.aClass87_10.method2824(local50);
			return this.anIntArrayArrayArray3[local50.anInt2269];
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)[[[I")
	public int[][][] method1280() {
		if (this.anInt1610 != this.anInt1603) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt1603; local22++) {
			this.aClass1_Sub13Array1[local22] = Static128.aClass1_Sub13_1;
		}
		return this.anIntArrayArrayArray3;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public void method1283() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1603; local7++) {
			this.anIntArrayArrayArray3[local7][0] = null;
			this.anIntArrayArrayArray3[local7][1] = null;
			this.anIntArrayArrayArray3[local7][2] = null;
			this.anIntArrayArrayArray3[local7] = null;
		}
		this.aClass1_Sub13Array1 = null;
		this.anIntArrayArrayArray3 = null;
		this.aClass87_10.method2831();
		this.aClass87_10 = null;
	}
}
