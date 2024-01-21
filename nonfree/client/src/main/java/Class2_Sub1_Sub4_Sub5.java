import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class2_Sub1_Sub4_Sub5 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!td", name = "qb", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!td", name = "sb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!td", name = "vb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!td", name = "Lb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!td", name = "Nb", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!td", name = "Pb", descriptor = "I")
	private int anInt2671;

	@OriginalMember(owner = "client!td", name = "Qb", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!td", name = "Ub", descriptor = "I")
	public int anInt2674;

	@OriginalMember(owner = "client!td", name = "Wb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!td", name = "Zb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!td", name = "yb", descriptor = "I")
	private int anInt2662 = 0;

	@OriginalMember(owner = "client!td", name = "Bb", descriptor = "Z")
	private boolean aBoolean120 = false;

	@OriginalMember(owner = "client!td", name = "Ib", descriptor = "I")
	private int anInt2668 = 0;

	@OriginalMember(owner = "client!td", name = "ac", descriptor = "I")
	private final int anInt2676;

	@OriginalMember(owner = "client!td", name = "Rb", descriptor = "I")
	public final int anInt2672;

	@OriginalMember(owner = "client!td", name = "ub", descriptor = "I")
	public final int anInt2659;

	@OriginalMember(owner = "client!td", name = "Ob", descriptor = "I")
	private final int anInt2670;

	@OriginalMember(owner = "client!td", name = "Cb", descriptor = "I")
	private final int anInt2665;

	@OriginalMember(owner = "client!td", name = "Ab", descriptor = "I")
	public final int anInt2664;

	@OriginalMember(owner = "client!td", name = "Tb", descriptor = "I")
	private final int anInt2673;

	@OriginalMember(owner = "client!td", name = "pb", descriptor = "I")
	private final int anInt2657;

	@OriginalMember(owner = "client!td", name = "xb", descriptor = "I")
	public final int anInt2661;

	@OriginalMember(owner = "client!td", name = "Eb", descriptor = "I")
	private final int anInt2666;

	@OriginalMember(owner = "client!td", name = "Jb", descriptor = "I")
	public final int anInt2669;

	@OriginalMember(owner = "client!td", name = "Sb", descriptor = "Lclient!s;")
	private final Class2_Sub1_Sub14 aClass2_Sub1_Sub14_2;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class2_Sub1_Sub4_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.aBoolean120 = false;
		this.anInt2676 = arg7;
		this.anInt2672 = arg1;
		this.anInt2659 = arg9;
		this.anInt2670 = arg4;
		this.anInt2665 = arg3;
		this.anInt2664 = arg5;
		this.anInt2673 = arg8;
		this.anInt2657 = arg2;
		this.anInt2661 = arg10;
		this.anInt2666 = arg0;
		this.anInt2669 = arg6;
		@Pc(52) int local52 = Static99.method1476(this.anInt2666).anInt1677;
		if (local52 == -1) {
			this.aClass2_Sub1_Sub14_2 = null;
		} else {
			this.aClass2_Sub1_Sub14_2 = Static56.method1045(local52);
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(II)V")
	public void method1879(@OriginalArg(0) int arg0) {
		this.aBoolean120 = true;
		this.aDouble6 += this.aDouble5 * (double) arg0;
		this.aDouble2 += this.aDouble9 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
		this.aDouble7 += this.aDouble4 * (double) arg0;
		this.aDouble9 += (double) arg0 * this.aDouble8;
		this.anInt2674 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
		this.anInt2671 = (int) (Math.atan2(this.aDouble9, this.aDouble3) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub1_Sub14_2 == null) {
			return;
		}
		this.anInt2662 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass2_Sub1_Sub14_2.anIntArray288[this.anInt2668] >= this.anInt2662) {
						return;
					}
					this.anInt2662 -= this.aClass2_Sub1_Sub14_2.anIntArray288[this.anInt2668];
					this.anInt2668++;
				} while (this.aClass2_Sub1_Sub14_2.anIntArray287.length > this.anInt2668);
				this.anInt2668 -= this.aClass2_Sub1_Sub14_2.anInt2386;
			} while (this.anInt2668 >= 0 && this.anInt2668 < this.aClass2_Sub1_Sub14_2.anIntArray287.length);
			this.anInt2668 = 0;
		}
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(B)Lclient!fd;")
	@Override
	public Class2_Sub1_Sub4_Sub1 method2031() {
		@Pc(15) Class2_Sub1_Sub11 local15 = Static99.method1476(this.anInt2666);
		@Pc(21) Class2_Sub1_Sub4_Sub1 local21 = local15.method1152(this.anInt2668);
		if (local21 == null) {
			return null;
		} else {
			local21.method671(this.anInt2671);
			return local21;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V")
	public void method1881(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean120) {
			local8 = arg2 - this.anInt2657;
			@Pc(15) double local15 = (double) (arg3 - this.anInt2665);
			@Pc(24) double local24 = Math.sqrt(local15 * local15 + local8 * local8);
			this.aDouble7 = (double) this.anInt2657 + local8 * (double) this.anInt2673 / local24;
			this.aDouble6 = (double) this.anInt2665 + (double) this.anInt2673 * local15 / local24;
			this.aDouble2 = this.anInt2670;
		}
		local8 = this.anInt2669 + 1 - arg0;
		this.aDouble5 = ((double) arg3 - this.aDouble6) / local8;
		this.aDouble4 = ((double) arg2 - this.aDouble7) / local8;
		this.aDouble3 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble4 * this.aDouble4);
		if (!this.aBoolean120) {
			this.aDouble9 = -this.aDouble3 * Math.tan((double) this.anInt2676 * 0.02454369D);
		}
		this.aDouble8 = ((double) arg1 - this.aDouble2 - this.aDouble9 * local8) * 2.0D / (local8 * local8);
	}
}
