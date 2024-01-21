import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class6_Sub3_Sub1_Sub4 extends Class6_Sub3_Sub1 {

	@OriginalMember(owner = "client!hd", name = "tb", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!hd", name = "ub", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!hd", name = "vb", descriptor = "I")
	private int anInt1480;

	@OriginalMember(owner = "client!hd", name = "zb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!hd", name = "Cb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!hd", name = "Ob", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!hd", name = "Sb", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!hd", name = "Vb", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!hd", name = "Xb", descriptor = "I")
	public int anInt1498;

	@OriginalMember(owner = "client!hd", name = "dc", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!hd", name = "qb", descriptor = "I")
	private int anInt1478 = 0;

	@OriginalMember(owner = "client!hd", name = "ac", descriptor = "I")
	private int anInt1501 = 0;

	@OriginalMember(owner = "client!hd", name = "fc", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!hd", name = "xb", descriptor = "I")
	public final int anInt1481;

	@OriginalMember(owner = "client!hd", name = "Fb", descriptor = "I")
	private final int anInt1487;

	@OriginalMember(owner = "client!hd", name = "Lb", descriptor = "I")
	private final int anInt1491;

	@OriginalMember(owner = "client!hd", name = "Nb", descriptor = "I")
	public final int anInt1492;

	@OriginalMember(owner = "client!hd", name = "Ab", descriptor = "I")
	private final int anInt1483;

	@OriginalMember(owner = "client!hd", name = "Qb", descriptor = "I")
	public final int anInt1494;

	@OriginalMember(owner = "client!hd", name = "lc", descriptor = "I")
	private final int anInt1505;

	@OriginalMember(owner = "client!hd", name = "Zb", descriptor = "I")
	public final int anInt1500;

	@OriginalMember(owner = "client!hd", name = "Ub", descriptor = "I")
	private final int anInt1497;

	@OriginalMember(owner = "client!hd", name = "jc", descriptor = "I")
	public final int anInt1504;

	@OriginalMember(owner = "client!hd", name = "Pb", descriptor = "I")
	private final int anInt1493;

	@OriginalMember(owner = "client!hd", name = "gc", descriptor = "Lclient!gd;")
	private final Class6_Sub3_Sub7 aClass6_Sub3_Sub7_1;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class6_Sub3_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1481 = arg5;
		this.aBoolean73 = false;
		this.anInt1487 = arg0;
		this.anInt1491 = arg7;
		this.anInt1492 = arg9;
		this.anInt1483 = arg3;
		this.anInt1494 = arg10;
		this.anInt1505 = arg2;
		this.anInt1500 = arg6;
		this.anInt1497 = arg4;
		this.anInt1504 = arg1;
		this.anInt1493 = arg8;
		@Pc(52) int local52 = Static55.method1124(this.anInt1487).anInt2099;
		if (local52 == -1) {
			this.aClass6_Sub3_Sub7_1 = null;
		} else {
			this.aClass6_Sub3_Sub7_1 = Static30.method721(local52);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
	public void method1023(@OriginalArg(0) int arg0) {
		this.aDouble8 += (double) arg0 * this.aDouble1;
		this.aDouble7 += (double) arg0 * this.aDouble4;
		this.aDouble6 += this.aDouble3 * (double) arg0 + (double) arg0 * (double) arg0 * 0.5D * this.aDouble2;
		this.aDouble3 += (double) arg0 * this.aDouble2;
		this.aBoolean73 = true;
		this.anInt1498 = (int) (Math.atan2(this.aDouble1, this.aDouble4) * 325.949D) + 1024 & 0x7FF;
		this.anInt1480 = (int) (Math.atan2(this.aDouble3, this.aDouble5) * 325.949D) & 0x7FF;
		if (this.aClass6_Sub3_Sub7_1 == null) {
			return;
		}
		this.anInt1501 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt1501 <= this.aClass6_Sub3_Sub7_1.anIntArray149[this.anInt1478]) {
						return;
					}
					this.anInt1501 -= this.aClass6_Sub3_Sub7_1.anIntArray149[this.anInt1478];
					this.anInt1478++;
				} while (this.anInt1478 < this.aClass6_Sub3_Sub7_1.anIntArray152.length);
				this.anInt1478 -= this.aClass6_Sub3_Sub7_1.anInt1310;
			} while (this.anInt1478 >= 0 && this.anInt1478 < this.aClass6_Sub3_Sub7_1.anIntArray152.length);
			this.anInt1478 = 0;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
	public void method1026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean73) {
			local13 = arg1 - this.anInt1505;
			@Pc(19) double local19 = (double) (arg3 - this.anInt1483);
			@Pc(28) double local28 = Math.sqrt(local13 * local13 + local19 * local19);
			this.aDouble8 = (double) this.anInt1505 + local13 * (double) this.anInt1493 / local28;
			this.aDouble7 = (double) this.anInt1483 + local19 * (double) this.anInt1493 / local28;
			this.aDouble6 = this.anInt1497;
		}
		local13 = this.anInt1500 + 1 - arg0;
		this.aDouble1 = ((double) arg1 - this.aDouble8) / local13;
		this.aDouble4 = ((double) arg3 - this.aDouble7) / local13;
		this.aDouble5 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble1 * this.aDouble1);
		if (!this.aBoolean73) {
			this.aDouble3 = -this.aDouble5 * Math.tan((double) this.anInt1491 * 0.02454369D);
		}
		this.aDouble2 = ((double) arg2 - this.aDouble3 * local13 - this.aDouble6) * 2.0D / (local13 * local13);
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)Lclient!df;")
	@Override
	public Class6_Sub3_Sub1_Sub3 method2062() {
		@Pc(8) Class6_Sub3_Sub12 local8 = Static55.method1124(this.anInt1487);
		@Pc(19) Class6_Sub3_Sub1_Sub3 local19 = local8.method1417(this.anInt1478);
		if (local19 == null) {
			return null;
		} else {
			local19.method624(this.anInt1480);
			return local19;
		}
	}
}
