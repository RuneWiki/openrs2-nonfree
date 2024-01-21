import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!jb", name = "Ab", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!jb", name = "Bb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!jb", name = "Db", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!jb", name = "Kb", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!jb", name = "Pb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!jb", name = "Qb", descriptor = "I")
	private int anInt1578;

	@OriginalMember(owner = "client!jb", name = "Rb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!jb", name = "Yb", descriptor = "I")
	public int anInt1584;

	@OriginalMember(owner = "client!jb", name = "cc", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!jb", name = "mc", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!jb", name = "Fb", descriptor = "I")
	private int anInt1572 = 0;

	@OriginalMember(owner = "client!jb", name = "gc", descriptor = "I")
	private int anInt1588 = 0;

	@OriginalMember(owner = "client!jb", name = "ic", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!jb", name = "Jb", descriptor = "I")
	private final int anInt1574;

	@OriginalMember(owner = "client!jb", name = "lc", descriptor = "I")
	public final int anInt1592;

	@OriginalMember(owner = "client!jb", name = "Sb", descriptor = "I")
	public final int anInt1579;

	@OriginalMember(owner = "client!jb", name = "Mb", descriptor = "I")
	private final int anInt1575;

	@OriginalMember(owner = "client!jb", name = "Nb", descriptor = "I")
	private final int anInt1576;

	@OriginalMember(owner = "client!jb", name = "Ob", descriptor = "I")
	private final int anInt1577;

	@OriginalMember(owner = "client!jb", name = "nc", descriptor = "I")
	public final int anInt1593;

	@OriginalMember(owner = "client!jb", name = "hc", descriptor = "I")
	private final int anInt1589;

	@OriginalMember(owner = "client!jb", name = "oc", descriptor = "I")
	private final int anInt1594;

	@OriginalMember(owner = "client!jb", name = "ec", descriptor = "I")
	public final int anInt1586;

	@OriginalMember(owner = "client!jb", name = "jc", descriptor = "I")
	public final int anInt1590;

	@OriginalMember(owner = "client!jb", name = "Vb", descriptor = "Lclient!h;")
	private final Class1_Sub1_Sub8 aClass1_Sub1_Sub8_2;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1574 = arg4;
		this.anInt1592 = arg6;
		this.anInt1579 = arg9;
		this.anInt1575 = arg0;
		this.anInt1576 = arg2;
		this.anInt1577 = arg7;
		this.aBoolean79 = false;
		this.anInt1593 = arg10;
		this.anInt1589 = arg3;
		this.anInt1594 = arg8;
		this.anInt1586 = arg1;
		this.anInt1590 = arg5;
		@Pc(52) int local52 = Static48.method985(this.anInt1575).anInt1428;
		if (local52 == -1) {
			this.aClass1_Sub1_Sub8_2 = null;
		} else {
			this.aClass1_Sub1_Sub8_2 = Static18.method249(local52);
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)V")
	public void method975(@OriginalArg(1) int arg0) {
		this.aBoolean79 = true;
		this.aDouble4 += (double) arg0 * (double) arg0 * 0.5D * this.aDouble6 + this.aDouble3 * (double) arg0;
		this.aDouble8 += (double) arg0 * this.aDouble5;
		this.aDouble7 += (double) arg0 * this.aDouble2;
		this.aDouble3 += this.aDouble6 * (double) arg0;
		this.anInt1584 = (int) (Math.atan2(this.aDouble2, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
		this.anInt1578 = (int) (Math.atan2(this.aDouble3, this.aDouble1) * 325.949D) & 0x7FF;
		if (this.aClass1_Sub1_Sub8_2 == null) {
			return;
		}
		this.anInt1572 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt1572 <= this.aClass1_Sub1_Sub8_2.anIntArray143[this.anInt1588]) {
						return;
					}
					this.anInt1572 -= this.aClass1_Sub1_Sub8_2.anIntArray143[this.anInt1588];
					this.anInt1588++;
				} while (this.aClass1_Sub1_Sub8_2.anIntArray147.length > this.anInt1588);
				this.anInt1588 -= this.aClass1_Sub1_Sub8_2.anInt1074;
			} while (this.anInt1588 >= 0 && this.anInt1588 < this.aClass1_Sub1_Sub8_2.anIntArray147.length);
			this.anInt1588 = 0;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIBI)V")
	public void method978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) double local14;
		if (!this.aBoolean79) {
			local14 = arg1 - this.anInt1576;
			@Pc(21) double local21 = (double) (arg0 - this.anInt1589);
			@Pc(30) double local30 = Math.sqrt(local21 * local21 + local14 * local14);
			this.aDouble8 = (double) this.anInt1589 + local21 * (double) this.anInt1594 / local30;
			this.aDouble4 = this.anInt1574;
			this.aDouble7 = (double) this.anInt1576 + local14 * (double) this.anInt1594 / local30;
		}
		local14 = this.anInt1592 + 1 - arg2;
		this.aDouble2 = ((double) arg1 - this.aDouble7) / local14;
		this.aDouble5 = ((double) arg0 - this.aDouble8) / local14;
		this.aDouble1 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble2 * this.aDouble2);
		if (!this.aBoolean79) {
			this.aDouble3 = -this.aDouble1 * Math.tan((double) this.anInt1577 * 0.02454369D);
		}
		this.aDouble6 = ((double) arg3 - this.aDouble3 * local14 - this.aDouble4) * 2.0D / (local14 * local14);
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)Lclient!qb;")
	@Override
	public Class1_Sub1_Sub2_Sub6 method1415() {
		@Pc(14) Class1_Sub1_Sub9 local14 = Static48.method985(this.anInt1575);
		@Pc(20) Class1_Sub1_Sub2_Sub6 local20 = local14.method889(this.anInt1588);
		if (local20 == null) {
			return null;
		} else {
			local20.method1422(this.anInt1578);
			return local20;
		}
	}
}
