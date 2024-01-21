import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class5_Sub1_Sub1_Sub4 extends Class5_Sub1_Sub1 {

	@OriginalMember(owner = "client!k", name = "gb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!k", name = "hb", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!k", name = "tb", descriptor = "I")
	private int anInt1487;

	@OriginalMember(owner = "client!k", name = "wb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!k", name = "Fb", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!k", name = "Hb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!k", name = "Lb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!k", name = "Mb", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!k", name = "Nb", descriptor = "I")
	public int anInt1497;

	@OriginalMember(owner = "client!k", name = "Pb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!k", name = "rb", descriptor = "I")
	private int anInt1485 = 0;

	@OriginalMember(owner = "client!k", name = "Db", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!k", name = "Ib", descriptor = "I")
	private int anInt1495 = 0;

	@OriginalMember(owner = "client!k", name = "Vb", descriptor = "I")
	private final int anInt1503;

	@OriginalMember(owner = "client!k", name = "zb", descriptor = "I")
	private final int anInt1491;

	@OriginalMember(owner = "client!k", name = "Kb", descriptor = "I")
	public final int anInt1496;

	@OriginalMember(owner = "client!k", name = "xb", descriptor = "I")
	public final int anInt1489;

	@OriginalMember(owner = "client!k", name = "Ob", descriptor = "I")
	public final int anInt1498;

	@OriginalMember(owner = "client!k", name = "Cb", descriptor = "I")
	private final int anInt1492;

	@OriginalMember(owner = "client!k", name = "yb", descriptor = "I")
	public final int anInt1490;

	@OriginalMember(owner = "client!k", name = "Qb", descriptor = "I")
	public final int anInt1499;

	@OriginalMember(owner = "client!k", name = "Ub", descriptor = "I")
	private final int anInt1502;

	@OriginalMember(owner = "client!k", name = "Rb", descriptor = "I")
	private final int anInt1500;

	@OriginalMember(owner = "client!k", name = "ub", descriptor = "I")
	private final int anInt1488;

	@OriginalMember(owner = "client!k", name = "vb", descriptor = "Lclient!wc;")
	private final Class5_Sub1_Sub18 aClass5_Sub1_Sub18_2;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class5_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1503 = arg3;
		this.anInt1491 = arg7;
		this.anInt1496 = arg9;
		this.anInt1489 = arg5;
		this.anInt1498 = arg10;
		this.anInt1492 = arg2;
		this.anInt1490 = arg1;
		this.anInt1499 = arg6;
		this.anInt1502 = arg8;
		this.anInt1500 = arg0;
		this.aBoolean62 = false;
		this.anInt1488 = arg4;
		@Pc(52) int local52 = Static109.method1740(this.anInt1500).anInt2101;
		if (local52 == -1) {
			this.aClass5_Sub1_Sub18_2 = null;
		} else {
			this.aClass5_Sub1_Sub18_2 = Static57.method1017(local52);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)V")
	public void method1018(@OriginalArg(0) int arg0) {
		this.aDouble5 += this.aDouble6 * (double) arg0;
		this.aBoolean62 = true;
		this.aDouble3 += (double) arg0 * 0.5D * this.aDouble4 * (double) arg0 + (double) arg0 * this.aDouble9;
		this.aDouble8 += (double) arg0 * this.aDouble2;
		this.aDouble9 += this.aDouble4 * (double) arg0;
		this.anInt1497 = (int) (Math.atan2(this.aDouble6, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
		this.anInt1487 = (int) (Math.atan2(this.aDouble9, this.aDouble7) * 325.949D) & 0x7FF;
		if (this.aClass5_Sub1_Sub18_2 == null) {
			return;
		}
		this.anInt1485 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass5_Sub1_Sub18_2.anIntArray290[this.anInt1495] >= this.anInt1485) {
						return;
					}
					this.anInt1485 -= this.aClass5_Sub1_Sub18_2.anIntArray290[this.anInt1495];
					this.anInt1495++;
				} while (this.aClass5_Sub1_Sub18_2.anIntArray294.length > this.anInt1495);
				this.anInt1495 -= this.aClass5_Sub1_Sub18_2.anInt2945;
			} while (this.anInt1495 >= 0 && this.anInt1495 < this.aClass5_Sub1_Sub18_2.anIntArray294.length);
			this.anInt1495 = 0;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZII)V")
	public void method1019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean62) {
			local8 = arg1 - this.anInt1492;
			@Pc(14) double local14 = (double) (arg2 - this.anInt1503);
			@Pc(23) double local23 = Math.sqrt(local14 * local14 + local8 * local8);
			this.aDouble8 = (double) this.anInt1503 + local14 * (double) this.anInt1502 / local23;
			this.aDouble3 = this.anInt1488;
			this.aDouble5 = (double) this.anInt1492 + local8 * (double) this.anInt1502 / local23;
		}
		local8 = this.anInt1499 + 1 - arg0;
		this.aDouble2 = ((double) arg2 - this.aDouble8) / local8;
		this.aDouble6 = ((double) arg1 - this.aDouble5) / local8;
		this.aDouble7 = Math.sqrt(this.aDouble6 * this.aDouble6 + this.aDouble2 * this.aDouble2);
		if (!this.aBoolean62) {
			this.aDouble9 = -this.aDouble7 * Math.tan((double) this.anInt1491 * 0.02454369D);
		}
		this.aDouble4 = ((double) arg3 - this.aDouble3 - local8 * this.aDouble9) * 2.0D / (local8 * local8);
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)Lclient!bf;")
	@Override
	public Class5_Sub1_Sub1_Sub2 method1976() {
		@Pc(13) Class5_Sub1_Sub13 local13 = Static109.method1740(this.anInt1500);
		@Pc(19) Class5_Sub1_Sub1_Sub2 local19 = local13.method1435(this.anInt1495);
		if (local19 == null) {
			return null;
		} else {
			local19.method246(this.anInt1487);
			return local19;
		}
	}
}
