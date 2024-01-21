import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class5_Sub2_Sub4_Sub4 extends Class5_Sub2_Sub4 {

	@OriginalMember(owner = "client!ke", name = "vb", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!ke", name = "xb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!ke", name = "Bb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!ke", name = "Cb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!ke", name = "Ob", descriptor = "I")
	public int anInt1765;

	@OriginalMember(owner = "client!ke", name = "Qb", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!ke", name = "Xb", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!ke", name = "Yb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!ke", name = "gc", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!ke", name = "hc", descriptor = "I")
	private int anInt1779;

	@OriginalMember(owner = "client!ke", name = "tb", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!ke", name = "sb", descriptor = "I")
	private int anInt1752 = 0;

	@OriginalMember(owner = "client!ke", name = "Ub", descriptor = "I")
	private int anInt1769 = 0;

	@OriginalMember(owner = "client!ke", name = "Ib", descriptor = "I")
	private final int anInt1759;

	@OriginalMember(owner = "client!ke", name = "ec", descriptor = "I")
	public final int anInt1777;

	@OriginalMember(owner = "client!ke", name = "cc", descriptor = "I")
	private final int anInt1775;

	@OriginalMember(owner = "client!ke", name = "ic", descriptor = "I")
	private final int anInt1780;

	@OriginalMember(owner = "client!ke", name = "Nb", descriptor = "I")
	public final int anInt1764;

	@OriginalMember(owner = "client!ke", name = "wb", descriptor = "I")
	public final int anInt1753;

	@OriginalMember(owner = "client!ke", name = "dc", descriptor = "I")
	public final int anInt1776;

	@OriginalMember(owner = "client!ke", name = "Db", descriptor = "I")
	private final int anInt1755;

	@OriginalMember(owner = "client!ke", name = "Gb", descriptor = "I")
	public final int anInt1757;

	@OriginalMember(owner = "client!ke", name = "kc", descriptor = "I")
	private final int anInt1782;

	@OriginalMember(owner = "client!ke", name = "Pb", descriptor = "I")
	private final int anInt1766;

	@OriginalMember(owner = "client!ke", name = "yb", descriptor = "Lclient!ka;")
	private final Class5_Sub2_Sub9 aClass5_Sub2_Sub9_1;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class5_Sub2_Sub4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1759 = arg4;
		this.anInt1777 = arg5;
		this.anInt1775 = arg7;
		this.anInt1780 = arg8;
		this.anInt1764 = arg1;
		this.anInt1753 = arg10;
		this.anInt1776 = arg6;
		this.anInt1755 = arg0;
		this.aBoolean87 = false;
		this.anInt1757 = arg9;
		this.anInt1782 = arg3;
		this.anInt1766 = arg2;
		@Pc(52) int local52 = Static91.method1710(this.anInt1755).anInt2869;
		if (local52 == -1) {
			this.aClass5_Sub2_Sub9_1 = null;
		} else {
			this.aClass5_Sub2_Sub9_1 = Static63.method1252(local52);
		}
	}

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "(I)Lclient!dd;")
	@Override
	public Class5_Sub2_Sub4_Sub2 method1612() {
		@Pc(13) Class5_Sub2_Sub15 local13 = Static91.method1710(this.anInt1755);
		@Pc(21) Class5_Sub2_Sub4_Sub2 local21 = local13.method1965(this.anInt1752);
		if (local21 == null) {
			return null;
		} else {
			local21.method421(this.anInt1779);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V")
	public void method1214(@OriginalArg(0) int arg0) {
		this.aDouble6 += (double) arg0 * this.aDouble7;
		this.aDouble8 += (double) arg0 * (double) arg0 * this.aDouble3 * 0.5D + this.aDouble2 * (double) arg0;
		this.aBoolean87 = true;
		this.aDouble5 += (double) arg0 * this.aDouble4;
		this.aDouble2 += (double) arg0 * this.aDouble3;
		this.anInt1765 = (int) (Math.atan2(this.aDouble7, this.aDouble4) * 325.949D) + 1024 & 0x7FF;
		this.anInt1779 = (int) (Math.atan2(this.aDouble2, this.aDouble1) * 325.949D) & 0x7FF;
		if (this.aClass5_Sub2_Sub9_1 == null) {
			return;
		}
		this.anInt1769 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt1769 <= this.aClass5_Sub2_Sub9_1.anIntArray252[this.anInt1752]) {
						return;
					}
					this.anInt1769 -= this.aClass5_Sub2_Sub9_1.anIntArray252[this.anInt1752];
					this.anInt1752++;
				} while (this.anInt1752 < this.aClass5_Sub2_Sub9_1.anIntArray249.length);
				this.anInt1752 -= this.aClass5_Sub2_Sub9_1.anInt1672;
			} while (this.anInt1752 >= 0 && this.aClass5_Sub2_Sub9_1.anIntArray249.length > this.anInt1752);
			this.anInt1752 = 0;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)V")
	public void method1215(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) double local17;
		if (!this.aBoolean87) {
			local17 = arg1 - this.anInt1766;
			@Pc(23) double local23 = (double) (arg3 - this.anInt1782);
			@Pc(32) double local32 = Math.sqrt(local17 * local17 + local23 * local23);
			this.aDouble8 = this.anInt1759;
			this.aDouble6 = local17 * (double) this.anInt1780 / local32 + (double) this.anInt1766;
			this.aDouble5 = (double) this.anInt1782 + local23 * (double) this.anInt1780 / local32;
		}
		local17 = this.anInt1776 + 1 - arg0;
		this.aDouble4 = ((double) arg3 - this.aDouble5) / local17;
		this.aDouble7 = ((double) arg1 - this.aDouble6) / local17;
		this.aDouble1 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble7 * this.aDouble7);
		if (!this.aBoolean87) {
			this.aDouble2 = -this.aDouble1 * Math.tan((double) this.anInt1775 * 0.02454369D);
		}
		this.aDouble3 = ((double) arg2 - this.aDouble2 * local17 - this.aDouble8) * 2.0D / (local17 * local17);
	}
}
