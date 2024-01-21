import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class1_Sub1_Sub2_Sub6 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!m", name = "sb", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!m", name = "xb", descriptor = "I")
	private int anInt1860;

	@OriginalMember(owner = "client!m", name = "Gb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!m", name = "Jb", descriptor = "I")
	public int anInt1866;

	@OriginalMember(owner = "client!m", name = "Kb", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!m", name = "Lb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!m", name = "Ob", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!m", name = "Qb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!m", name = "Tb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!m", name = "Xb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!m", name = "rb", descriptor = "I")
	private int anInt1855 = 0;

	@OriginalMember(owner = "client!m", name = "Mb", descriptor = "Z")
	private boolean aBoolean155 = false;

	@OriginalMember(owner = "client!m", name = "yb", descriptor = "I")
	private int anInt1861 = 0;

	@OriginalMember(owner = "client!m", name = "ac", descriptor = "I")
	public final int anInt1875;

	@OriginalMember(owner = "client!m", name = "Sb", descriptor = "I")
	private final int anInt1870;

	@OriginalMember(owner = "client!m", name = "Db", descriptor = "I")
	private final int anInt1864;

	@OriginalMember(owner = "client!m", name = "Yb", descriptor = "I")
	public final int anInt1873;

	@OriginalMember(owner = "client!m", name = "tb", descriptor = "I")
	public final int anInt1856;

	@OriginalMember(owner = "client!m", name = "ub", descriptor = "I")
	private final int anInt1857;

	@OriginalMember(owner = "client!m", name = "zb", descriptor = "I")
	public final int anInt1862;

	@OriginalMember(owner = "client!m", name = "dc", descriptor = "I")
	private final int anInt1877;

	@OriginalMember(owner = "client!m", name = "bc", descriptor = "I")
	private final int anInt1876;

	@OriginalMember(owner = "client!m", name = "Ub", descriptor = "I")
	private final int anInt1871;

	@OriginalMember(owner = "client!m", name = "Vb", descriptor = "I")
	public final int anInt1872;

	@OriginalMember(owner = "client!m", name = "Eb", descriptor = "Lclient!f;")
	private final Class1_Sub1_Sub7 aClass1_Sub1_Sub7_3;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub1_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1875 = arg6;
		this.anInt1870 = arg7;
		this.anInt1864 = arg0;
		this.anInt1873 = arg10;
		this.anInt1856 = arg5;
		this.anInt1857 = arg3;
		this.anInt1862 = arg9;
		this.anInt1877 = arg2;
		this.anInt1876 = arg8;
		this.anInt1871 = arg4;
		this.aBoolean155 = false;
		this.anInt1872 = arg1;
		@Pc(52) int local52 = Static64.method1146(this.anInt1864).anInt2616;
		if (local52 == -1) {
			this.aClass1_Sub1_Sub7_3 = null;
		} else {
			this.aClass1_Sub1_Sub7_3 = Static82.method1398(local52);
		}
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)Lclient!na;")
	@Override
	public Class1_Sub1_Sub2_Sub7 method1790() {
		@Pc(8) Class1_Sub1_Sub14 local8 = Static64.method1146(this.anInt1864);
		@Pc(14) Class1_Sub1_Sub2_Sub7 local14 = local8.method1840(this.anInt1855);
		if (local14 == null) {
			return null;
		} else {
			local14.method1382(this.anInt1860);
			return local14;
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(IIIII)V")
	public void method1280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) double local16;
		if (!this.aBoolean155) {
			@Pc(9) double local9 = (double) (arg1 - this.anInt1857);
			local16 = arg2 - this.anInt1877;
			@Pc(25) double local25 = Math.sqrt(local9 * local9 + local16 * local16);
			this.aDouble3 = (double) this.anInt1857 + local9 * (double) this.anInt1876 / local25;
			this.aDouble1 = local16 * (double) this.anInt1876 / local25 + (double) this.anInt1877;
			this.aDouble5 = this.anInt1871;
		}
		local16 = this.anInt1875 + 1 - arg0;
		this.aDouble6 = ((double) arg2 - this.aDouble1) / local16;
		this.aDouble4 = ((double) arg1 - this.aDouble3) / local16;
		this.aDouble2 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble6 * this.aDouble6);
		if (!this.aBoolean155) {
			this.aDouble8 = -this.aDouble2 * Math.tan((double) this.anInt1870 * 0.02454369D);
		}
		this.aDouble7 = ((double) arg3 - local16 * this.aDouble8 - this.aDouble5) * 2.0D / (local16 * local16);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZI)V")
	public void method1281(@OriginalArg(1) int arg0) {
		this.aDouble5 += (double) arg0 * (double) arg0 * 0.5D * this.aDouble7 + (double) arg0 * this.aDouble8;
		this.aDouble8 += (double) arg0 * this.aDouble7;
		this.aBoolean155 = true;
		this.aDouble1 += (double) arg0 * this.aDouble6;
		this.aDouble3 += this.aDouble4 * (double) arg0;
		this.anInt1866 = (int) (Math.atan2(this.aDouble6, this.aDouble4) * 325.949D) + 1024 & 0x7FF;
		this.anInt1860 = (int) (Math.atan2(this.aDouble8, this.aDouble2) * 325.949D) & 0x7FF;
		if (this.aClass1_Sub1_Sub7_3 == null) {
			return;
		}
		this.anInt1861 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass1_Sub1_Sub7_3.anIntArray149[this.anInt1855] >= this.anInt1861) {
						return;
					}
					this.anInt1861 -= this.aClass1_Sub1_Sub7_3.anIntArray149[this.anInt1855];
					this.anInt1855++;
				} while (this.anInt1855 < this.aClass1_Sub1_Sub7_3.anIntArray151.length);
				this.anInt1855 -= this.aClass1_Sub1_Sub7_3.anInt1047;
			} while (this.anInt1855 >= 0 && this.anInt1855 < this.aClass1_Sub1_Sub7_3.anIntArray151.length);
			this.anInt1855 = 0;
		}
	}
}
