import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!lf", name = "mb", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!lf", name = "nb", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!lf", name = "ob", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!lf", name = "rb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!lf", name = "sb", descriptor = "I")
	private int anInt1928;

	@OriginalMember(owner = "client!lf", name = "xb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!lf", name = "yb", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!lf", name = "Cb", descriptor = "I")
	public int anInt1935;

	@OriginalMember(owner = "client!lf", name = "Hb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!lf", name = "Ob", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!lf", name = "Ab", descriptor = "Z")
	private boolean aBoolean103 = false;

	@OriginalMember(owner = "client!lf", name = "Jb", descriptor = "I")
	private int anInt1940 = 0;

	@OriginalMember(owner = "client!lf", name = "Kb", descriptor = "I")
	private int anInt1941 = 0;

	@OriginalMember(owner = "client!lf", name = "Lb", descriptor = "I")
	public final int anInt1942;

	@OriginalMember(owner = "client!lf", name = "ub", descriptor = "I")
	private final int anInt1930;

	@OriginalMember(owner = "client!lf", name = "Tb", descriptor = "I")
	public final int anInt1946;

	@OriginalMember(owner = "client!lf", name = "Pb", descriptor = "I")
	private final int anInt1945;

	@OriginalMember(owner = "client!lf", name = "Nb", descriptor = "I")
	private final int anInt1944;

	@OriginalMember(owner = "client!lf", name = "Mb", descriptor = "I")
	public final int anInt1943;

	@OriginalMember(owner = "client!lf", name = "Bb", descriptor = "I")
	private final int anInt1934;

	@OriginalMember(owner = "client!lf", name = "Gb", descriptor = "I")
	private final int anInt1938;

	@OriginalMember(owner = "client!lf", name = "Db", descriptor = "I")
	public final int anInt1936;

	@OriginalMember(owner = "client!lf", name = "pb", descriptor = "I")
	public final int anInt1926;

	@OriginalMember(owner = "client!lf", name = "Fb", descriptor = "I")
	private final int anInt1937;

	@OriginalMember(owner = "client!lf", name = "lb", descriptor = "Lclient!gd;")
	private final Class1_Sub1_Sub6 aClass1_Sub1_Sub6_1;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1942 = arg9;
		this.anInt1930 = arg3;
		this.anInt1946 = arg6;
		this.anInt1945 = arg2;
		this.anInt1944 = arg0;
		this.anInt1943 = arg5;
		this.anInt1934 = arg4;
		this.anInt1938 = arg8;
		this.anInt1936 = arg1;
		this.aBoolean103 = false;
		this.anInt1926 = arg10;
		this.anInt1937 = arg7;
		@Pc(52) int local52 = Static11.method279(this.anInt1944).anInt2581;
		if (local52 == -1) {
			this.aClass1_Sub1_Sub6_1 = null;
		} else {
			this.aClass1_Sub1_Sub6_1 = Static40.method687(local52);
		}
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)Lclient!ka;")
	@Override
	public Class1_Sub1_Sub1_Sub2 method1842() {
		@Pc(4) Class1_Sub1_Sub11 local4 = Static11.method279(this.anInt1944);
		@Pc(10) Class1_Sub1_Sub1_Sub2 local10 = local4.method1707(this.anInt1940);
		if (local10 == null) {
			return null;
		} else {
			local10.method1102(this.anInt1928);
			return local10;
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
	public void method1289(@OriginalArg(1) int arg0) {
		this.aDouble2 += (double) arg0 * this.aDouble1;
		this.aBoolean103 = true;
		this.aDouble6 += this.aDouble8 * (double) arg0;
		this.aDouble3 += (double) arg0 * 0.5D * this.aDouble4 * (double) arg0 + (double) arg0 * this.aDouble7;
		this.aDouble7 += this.aDouble4 * (double) arg0;
		this.anInt1935 = (int) (Math.atan2(this.aDouble8, this.aDouble1) * 325.949D) + 1024 & 0x7FF;
		this.anInt1928 = (int) (Math.atan2(this.aDouble7, this.aDouble5) * 325.949D) & 0x7FF;
		if (this.aClass1_Sub1_Sub6_1 == null) {
			return;
		}
		this.anInt1941 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass1_Sub1_Sub6_1.anIntArray120[this.anInt1940] >= this.anInt1941) {
						return;
					}
					this.anInt1941 -= this.aClass1_Sub1_Sub6_1.anIntArray120[this.anInt1940];
					this.anInt1940++;
				} while (this.aClass1_Sub1_Sub6_1.anIntArray123.length > this.anInt1940);
				this.anInt1940 -= this.aClass1_Sub1_Sub6_1.anInt1201;
			} while (this.anInt1940 >= 0 && this.aClass1_Sub1_Sub6_1.anIntArray123.length > this.anInt1940);
			this.anInt1940 = 0;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V")
	public void method1290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) double local18;
		if (!this.aBoolean103) {
			local18 = arg3 - this.anInt1945;
			@Pc(25) double local25 = (double) (arg0 - this.anInt1930);
			@Pc(34) double local34 = Math.sqrt(local25 * local25 + local18 * local18);
			this.aDouble6 = (double) this.anInt1945 + local18 * (double) this.anInt1938 / local34;
			this.aDouble2 = local25 * (double) this.anInt1938 / local34 + (double) this.anInt1930;
			this.aDouble3 = this.anInt1934;
		}
		local18 = this.anInt1946 + 1 - arg2;
		this.aDouble8 = ((double) arg3 - this.aDouble6) / local18;
		this.aDouble1 = ((double) arg0 - this.aDouble2) / local18;
		this.aDouble5 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble8 * this.aDouble8);
		if (!this.aBoolean103) {
			this.aDouble7 = -this.aDouble5 * Math.tan((double) this.anInt1937 * 0.02454369D);
		}
		this.aDouble4 = ((double) arg1 - local18 * this.aDouble7 - this.aDouble3) * 2.0D / (local18 * local18);
	}
}
