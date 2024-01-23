import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class12_Sub4 extends Class12 {

	@OriginalMember(owner = "client!h", name = "u", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!h", name = "v", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!h", name = "w", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!h", name = "x", descriptor = "I")
	private int anInt1753;

	@OriginalMember(owner = "client!h", name = "z", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!h", name = "C", descriptor = "I")
	public int anInt1755;

	@OriginalMember(owner = "client!h", name = "M", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!h", name = "N", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!h", name = "Q", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!h", name = "bb", descriptor = "D")
	public double aDouble9;

	@OriginalMember(owner = "client!h", name = "A", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "client!h", name = "B", descriptor = "I")
	private int anInt1754 = 0;

	@OriginalMember(owner = "client!h", name = "t", descriptor = "I")
	private int anInt1752 = -32768;

	@OriginalMember(owner = "client!h", name = "E", descriptor = "I")
	private int anInt1757 = 0;

	@OriginalMember(owner = "client!h", name = "H", descriptor = "I")
	private int anInt1759;

	@OriginalMember(owner = "client!h", name = "R", descriptor = "I")
	public int anInt1766;

	@OriginalMember(owner = "client!h", name = "D", descriptor = "I")
	private int anInt1756;

	@OriginalMember(owner = "client!h", name = "V", descriptor = "I")
	private int anInt1769;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "I")
	public int anInt1751;

	@OriginalMember(owner = "client!h", name = "L", descriptor = "I")
	public int anInt1763;

	@OriginalMember(owner = "client!h", name = "cb", descriptor = "I")
	public int anInt1774;

	@OriginalMember(owner = "client!h", name = "J", descriptor = "I")
	private int anInt1761;

	@OriginalMember(owner = "client!h", name = "W", descriptor = "I")
	private int anInt1770;

	@OriginalMember(owner = "client!h", name = "T", descriptor = "I")
	private int anInt1767;

	@OriginalMember(owner = "client!h", name = "I", descriptor = "I")
	public int anInt1760;

	@OriginalMember(owner = "client!h", name = "o", descriptor = "Lclient!k;")
	private Class2_Sub2_Sub9 aClass2_Sub2_Sub9_2;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class12_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1759 = arg8;
		this.anInt1766 = arg10;
		this.anInt1756 = arg7;
		this.anInt1769 = arg0;
		this.anInt1751 = arg5;
		this.anInt1763 = arg1;
		this.anInt1774 = arg6;
		this.anInt1761 = arg4;
		this.aBoolean95 = false;
		this.anInt1770 = arg3;
		this.anInt1767 = arg2;
		this.anInt1760 = arg9;
		@Pc(55) int local55 = Static56.method1110(this.anInt1769).anInt727;
		if (local55 == -1) {
			this.aClass2_Sub2_Sub9_2 = null;
		} else {
			this.aClass2_Sub2_Sub9_2 = Static14.method299(local55);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V")
	public void method1231(@OriginalArg(1) int arg0) {
		this.aBoolean95 = true;
		this.aDouble4 += (double) arg0 * 0.5D * this.aDouble8 * (double) arg0 + this.aDouble5 * (double) arg0;
		this.aDouble9 += (double) arg0 * this.aDouble7;
		this.aDouble6 += this.aDouble2 * (double) arg0;
		this.aDouble5 += (double) arg0 * this.aDouble8;
		this.anInt1755 = (int) (Math.atan2(this.aDouble7, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
		this.anInt1753 = (int) (Math.atan2(this.aDouble5, this.aDouble3) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub2_Sub9_2 == null) {
			return;
		}
		this.anInt1754 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt1754 <= this.aClass2_Sub2_Sub9_2.anIntArray235[this.anInt1757]) {
						return;
					}
					this.anInt1754 -= this.aClass2_Sub2_Sub9_2.anIntArray235[this.anInt1757];
					this.anInt1757++;
				} while (this.anInt1757 < this.aClass2_Sub2_Sub9_2.anIntArray233.length);
				this.anInt1757 -= this.aClass2_Sub2_Sub9_2.anInt2342;
			} while (this.anInt1757 >= 0 && this.aClass2_Sub2_Sub9_2.anIntArray233.length > this.anInt1757);
			this.anInt1757 = 0;
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)Lclient!cg;")
	private Class12_Sub2 method1232() {
		@Pc(13) Class2_Sub2_Sub5 local13 = Static56.method1110(this.anInt1769);
		@Pc(19) Class12_Sub2 local19 = local13.method565(this.anInt1757);
		if (local19 == null) {
			return null;
		} else {
			local19.method1866(this.anInt1753);
			return local19;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class12_Sub2 local7 = this.method1232();
		if (local7 != null) {
			local7.method2715(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt1752 = local7.method2718();
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "()I")
	@Override
	public int method2718() {
		return this.anInt1752;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
	public void method1234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) double local19;
		if (!this.aBoolean95) {
			@Pc(12) double local12 = (double) (arg3 - this.anInt1770);
			local19 = arg0 - this.anInt1767;
			@Pc(28) double local28 = Math.sqrt(local19 * local19 + local12 * local12);
			this.aDouble9 = local19 * (double) this.anInt1759 / local28 + (double) this.anInt1767;
			this.aDouble6 = (double) this.anInt1770 + (double) this.anInt1759 * local12 / local28;
			this.aDouble4 = this.anInt1761;
		}
		local19 = this.anInt1774 + 1 - arg1;
		this.aDouble2 = ((double) arg3 - this.aDouble6) / local19;
		this.aDouble7 = ((double) arg0 - this.aDouble9) / local19;
		this.aDouble3 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble2 * this.aDouble2);
		if (!this.aBoolean95) {
			this.aDouble5 = -this.aDouble3 * Math.tan((double) this.anInt1756 * 0.02454369D);
		}
		this.aDouble8 = ((double) arg2 - this.aDouble5 * local19 - this.aDouble4) * 2.0D / (local19 * local19);
	}
}
