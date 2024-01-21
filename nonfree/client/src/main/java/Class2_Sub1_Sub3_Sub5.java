import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class2_Sub1_Sub3_Sub5 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!jh", name = "R", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!jh", name = "S", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!jh", name = "Z", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!jh", name = "bb", descriptor = "I")
	public int anInt1858;

	@OriginalMember(owner = "client!jh", name = "ib", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!jh", name = "kb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!jh", name = "nb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!jh", name = "ob", descriptor = "I")
	private int anInt1865;

	@OriginalMember(owner = "client!jh", name = "qb", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!jh", name = "tb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!jh", name = "T", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
	private int anInt1851 = 0;

	@OriginalMember(owner = "client!jh", name = "mb", descriptor = "I")
	private int anInt1864 = 0;

	@OriginalMember(owner = "client!jh", name = "X", descriptor = "I")
	private final int anInt1856;

	@OriginalMember(owner = "client!jh", name = "lb", descriptor = "I")
	public final int anInt1863;

	@OriginalMember(owner = "client!jh", name = "ab", descriptor = "I")
	private final int anInt1857;

	@OriginalMember(owner = "client!jh", name = "rb", descriptor = "I")
	private final int anInt1867;

	@OriginalMember(owner = "client!jh", name = "db", descriptor = "I")
	private final int anInt1859;

	@OriginalMember(owner = "client!jh", name = "sb", descriptor = "I")
	public final int anInt1868;

	@OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
	private final int anInt1852;

	@OriginalMember(owner = "client!jh", name = "pb", descriptor = "I")
	public final int anInt1866;

	@OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
	private final int anInt1853;

	@OriginalMember(owner = "client!jh", name = "fb", descriptor = "I")
	public final int anInt1861;

	@OriginalMember(owner = "client!jh", name = "V", descriptor = "I")
	public final int anInt1855;

	@OriginalMember(owner = "client!jh", name = "cb", descriptor = "Lclient!ke;")
	private final Class2_Sub1_Sub9 aClass2_Sub1_Sub9_2;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class2_Sub1_Sub3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1856 = arg3;
		this.anInt1863 = arg9;
		this.anInt1857 = arg7;
		this.anInt1867 = arg4;
		this.anInt1859 = arg8;
		this.anInt1868 = arg1;
		this.anInt1852 = arg2;
		this.aBoolean80 = false;
		this.anInt1866 = arg6;
		this.anInt1853 = arg0;
		this.anInt1861 = arg10;
		this.anInt1855 = arg5;
		@Pc(52) int local52 = Static76.method1260(this.anInt1853).anInt783;
		if (local52 == -1) {
			this.aClass2_Sub1_Sub9_2 = null;
		} else {
			this.aClass2_Sub1_Sub9_2 = Static19.method325(local52);
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(BI)V")
	public void method1304(@OriginalArg(1) int arg0) {
		this.aBoolean80 = true;
		this.aDouble3 += this.aDouble5 * (double) arg0 + (double) arg0 * (double) arg0 * 0.5D * this.aDouble6;
		this.aDouble5 += (double) arg0 * this.aDouble6;
		this.aDouble7 += this.aDouble4 * (double) arg0;
		this.aDouble1 += this.aDouble2 * (double) arg0;
		this.anInt1858 = (int) (Math.atan2(this.aDouble4, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
		this.anInt1865 = (int) (Math.atan2(this.aDouble5, this.aDouble8) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub1_Sub9_2 == null) {
			return;
		}
		this.anInt1864 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass2_Sub1_Sub9_2.anIntArray217[this.anInt1851] >= this.anInt1864) {
						return;
					}
					this.anInt1864 -= this.aClass2_Sub1_Sub9_2.anIntArray217[this.anInt1851];
					this.anInt1851++;
				} while (this.aClass2_Sub1_Sub9_2.anIntArray214.length > this.anInt1851);
				this.anInt1851 -= this.aClass2_Sub1_Sub9_2.anInt1929;
			} while (this.anInt1851 >= 0 && this.anInt1851 < this.aClass2_Sub1_Sub9_2.anIntArray214.length);
			this.anInt1851 = 0;
		}
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)Lclient!bh;")
	@Override
	public Class2_Sub1_Sub3_Sub3 method2544() {
		@Pc(4) Class2_Sub1_Sub5 local4 = Static76.method1260(this.anInt1853);
		@Pc(14) Class2_Sub1_Sub3_Sub3 local14 = local4.method612(this.anInt1851);
		if (local14 == null) {
			return null;
		} else {
			local14.method811(this.anInt1865);
			return local14;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIB)V")
	public void method1306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean80) {
			local9 = arg0 - this.anInt1852;
			@Pc(16) double local16 = (double) (arg1 - this.anInt1856);
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble1 = (double) this.anInt1856 + local16 * (double) this.anInt1859 / local25;
			this.aDouble7 = (double) this.anInt1859 * local9 / local25 + (double) this.anInt1852;
			this.aDouble3 = this.anInt1867;
		}
		local9 = this.anInt1866 + 1 - arg3;
		this.aDouble4 = ((double) arg0 - this.aDouble7) / local9;
		this.aDouble2 = ((double) arg1 - this.aDouble1) / local9;
		this.aDouble8 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble4 * this.aDouble4);
		if (!this.aBoolean80) {
			this.aDouble5 = -this.aDouble8 * Math.tan((double) this.anInt1857 * 0.02454369D);
		}
		this.aDouble6 = ((double) arg2 - this.aDouble3 - this.aDouble5 * local9) * 2.0D / (local9 * local9);
	}
}
