import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class1_Sub2_Sub3_Sub6 extends Class1_Sub2_Sub3 {

	@OriginalMember(owner = "client!sd", name = "gb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!sd", name = "ib", descriptor = "I")
	public int anInt2542;

	@OriginalMember(owner = "client!sd", name = "lb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!sd", name = "qb", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!sd", name = "xb", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!sd", name = "zb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!sd", name = "Fb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!sd", name = "Ib", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!sd", name = "Nb", descriptor = "I")
	private int anInt2559;

	@OriginalMember(owner = "client!sd", name = "Ub", descriptor = "D")
	public double aDouble9;

	@OriginalMember(owner = "client!sd", name = "bb", descriptor = "I")
	private int anInt2538 = 0;

	@OriginalMember(owner = "client!sd", name = "eb", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!sd", name = "sb", descriptor = "I")
	private int anInt2549 = 0;

	@OriginalMember(owner = "client!sd", name = "jb", descriptor = "I")
	private final int anInt2543;

	@OriginalMember(owner = "client!sd", name = "Db", descriptor = "I")
	public final int anInt2554;

	@OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
	private final int anInt2540;

	@OriginalMember(owner = "client!sd", name = "rb", descriptor = "I")
	public final int anInt2548;

	@OriginalMember(owner = "client!sd", name = "Rb", descriptor = "I")
	public final int anInt2563;

	@OriginalMember(owner = "client!sd", name = "Bb", descriptor = "I")
	private final int anInt2553;

	@OriginalMember(owner = "client!sd", name = "nb", descriptor = "I")
	public final int anInt2546;

	@OriginalMember(owner = "client!sd", name = "Ob", descriptor = "I")
	private final int anInt2560;

	@OriginalMember(owner = "client!sd", name = "Tb", descriptor = "I")
	private final int anInt2564;

	@OriginalMember(owner = "client!sd", name = "Qb", descriptor = "I")
	public final int anInt2562;

	@OriginalMember(owner = "client!sd", name = "Eb", descriptor = "I")
	private final int anInt2555;

	@OriginalMember(owner = "client!sd", name = "Mb", descriptor = "Lclient!qe;")
	private final Class1_Sub2_Sub17 aClass1_Sub2_Sub17_3;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub2_Sub3_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt2543 = arg4;
		this.anInt2554 = arg5;
		this.anInt2540 = arg7;
		this.anInt2548 = arg9;
		this.anInt2563 = arg1;
		this.anInt2553 = arg0;
		this.anInt2546 = arg10;
		this.anInt2560 = arg2;
		this.anInt2564 = arg3;
		this.anInt2562 = arg6;
		this.aBoolean114 = false;
		this.anInt2555 = arg8;
		@Pc(52) int local52 = Static52.method1009(this.anInt2553).anInt2083;
		if (local52 == -1) {
			this.aClass1_Sub2_Sub17_3 = null;
		} else {
			this.aClass1_Sub2_Sub17_3 = Static34.method755(local52);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIB)V")
	public void method1771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) double local15;
		if (!this.aBoolean114) {
			@Pc(9) double local9 = (double) (arg0 - this.anInt2564);
			local15 = arg2 - this.anInt2560;
			@Pc(24) double local24 = Math.sqrt(local9 * local9 + local15 * local15);
			this.aDouble9 = (double) this.anInt2555 * local9 / local24 + (double) this.anInt2564;
			this.aDouble5 = (double) this.anInt2560 + local15 * (double) this.anInt2555 / local24;
			this.aDouble4 = this.anInt2543;
		}
		local15 = this.anInt2562 + 1 - arg3;
		this.aDouble8 = ((double) arg2 - this.aDouble5) / local15;
		this.aDouble3 = ((double) arg0 - this.aDouble9) / local15;
		this.aDouble2 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble8 * this.aDouble8);
		if (!this.aBoolean114) {
			this.aDouble6 = -this.aDouble2 * Math.tan((double) this.anInt2540 * 0.02454369D);
		}
		this.aDouble7 = ((double) arg1 - this.aDouble4 - this.aDouble6 * local15) * 2.0D / (local15 * local15);
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)Lclient!da;")
	@Override
	public Class1_Sub2_Sub3_Sub2 method1969() {
		@Pc(8) Class1_Sub2_Sub15 local8 = Static52.method1009(this.anInt2553);
		@Pc(20) Class1_Sub2_Sub3_Sub2 local20 = local8.method1553(this.anInt2538);
		if (local20 == null) {
			return null;
		} else {
			local20.method478(this.anInt2559);
			return local20;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V")
	public void method1773(@OriginalArg(0) int arg0) {
		this.aBoolean114 = true;
		this.aDouble5 += (double) arg0 * this.aDouble8;
		this.aDouble9 += (double) arg0 * this.aDouble3;
		this.aDouble4 += this.aDouble7 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.aDouble6;
		this.aDouble6 += this.aDouble7 * (double) arg0;
		this.anInt2542 = (int) (Math.atan2(this.aDouble8, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
		this.anInt2559 = (int) (Math.atan2(this.aDouble6, this.aDouble2) * 325.949D) & 0x7FF;
		if (this.aClass1_Sub2_Sub17_3 == null) {
			return;
		}
		this.anInt2549 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt2549 <= this.aClass1_Sub2_Sub17_3.anIntArray406[this.anInt2538]) {
						return;
					}
					this.anInt2549 -= this.aClass1_Sub2_Sub17_3.anIntArray406[this.anInt2538];
					this.anInt2538++;
				} while (this.anInt2538 < this.aClass1_Sub2_Sub17_3.anIntArray410.length);
				this.anInt2538 -= this.aClass1_Sub2_Sub17_3.anInt2348;
			} while (this.anInt2538 >= 0 && this.anInt2538 < this.aClass1_Sub2_Sub17_3.anIntArray410.length);
			this.anInt2538 = 0;
		}
	}
}
