import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!e", name = "s", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!e", name = "E", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!e", name = "F", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!e", name = "G", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!e", name = "I", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!e", name = "J", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!e", name = "R", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!e", name = "T", descriptor = "I")
	public int anInt1008;

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!e", name = "r", descriptor = "I")
	private int anInt992 = 0;

	@OriginalMember(owner = "client!e", name = "P", descriptor = "I")
	private int anInt1004 = 0;

	@OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
	private int anInt1016 = -32768;

	@OriginalMember(owner = "client!e", name = "fb", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
	private final int anInt1005;

	@OriginalMember(owner = "client!e", name = "O", descriptor = "I")
	public final int anInt1003;

	@OriginalMember(owner = "client!e", name = "w", descriptor = "I")
	private final int anInt995;

	@OriginalMember(owner = "client!e", name = "t", descriptor = "I")
	private final int anInt993;

	@OriginalMember(owner = "client!e", name = "K", descriptor = "I")
	public final int anInt999;

	@OriginalMember(owner = "client!e", name = "q", descriptor = "I")
	public final int anInt991;

	@OriginalMember(owner = "client!e", name = "db", descriptor = "I")
	public final int anInt1015;

	@OriginalMember(owner = "client!e", name = "B", descriptor = "I")
	private final int anInt997;

	@OriginalMember(owner = "client!e", name = "L", descriptor = "I")
	private final int anInt1000;

	@OriginalMember(owner = "client!e", name = "X", descriptor = "I")
	private final int anInt1011;

	@OriginalMember(owner = "client!e", name = "u", descriptor = "I")
	public final int anInt994;

	@OriginalMember(owner = "client!e", name = "x", descriptor = "Lclient!ki;")
	private final Class2_Sub2_Sub16 aClass2_Sub2_Sub16_1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class24_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1005 = arg0;
		this.anInt1003 = arg1;
		this.aBoolean55 = false;
		this.anInt995 = arg7;
		this.anInt993 = arg4;
		this.anInt999 = arg9;
		this.anInt991 = arg6;
		this.anInt1015 = arg5;
		this.anInt997 = arg2;
		this.anInt1000 = arg3;
		this.anInt1011 = arg8;
		this.anInt994 = arg10;
		@Pc(55) int local55 = Static158.method2448(this.anInt1005).anInt1240;
		if (local55 == -1) {
			this.aClass2_Sub2_Sub16_1 = null;
		} else {
			this.aClass2_Sub2_Sub16_1 = Static213.method3229(local55);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class24_Sub3 local7 = this.method781();
		if (local7 != null) {
			local7.method2974(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt1016 = local7.method2978();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)Lclient!gj;")
	private Class24_Sub3 method781() {
		@Pc(4) Class2_Sub2_Sub8 local4 = Static158.method2448(this.anInt1005);
		@Pc(19) Class24_Sub3 local19 = local4.method955(this.anInt1004);
		if (local19 == null) {
			return null;
		} else {
			local19.method2736(this.anInt1006);
			return local19;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)V")
	public void method782(@OriginalArg(0) int arg0) {
		this.aDouble4 += this.aDouble5 * (double) arg0;
		this.aDouble3 += (double) arg0 * (double) arg0 * 0.5D * this.aDouble7 + this.aDouble9 * (double) arg0;
		this.aDouble9 += this.aDouble7 * (double) arg0;
		this.aBoolean55 = true;
		this.aDouble8 += this.aDouble2 * (double) arg0;
		this.anInt1008 = (int) (Math.atan2(this.aDouble5, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
		this.anInt1006 = (int) (Math.atan2(this.aDouble9, this.aDouble6) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub2_Sub16_1 == null) {
			return;
		}
		this.anInt992 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass2_Sub2_Sub16_1.anIntArray229[this.anInt1004] >= this.anInt992) {
						return;
					}
					this.anInt992 -= this.aClass2_Sub2_Sub16_1.anIntArray229[this.anInt1004];
					this.anInt1004++;
				} while (this.anInt1004 < this.aClass2_Sub2_Sub16_1.anIntArray232.length);
				this.anInt1004 -= this.aClass2_Sub2_Sub16_1.anInt2341;
			} while (this.anInt1004 >= 0 && this.anInt1004 < this.aClass2_Sub2_Sub16_1.anIntArray232.length);
			this.anInt1004 = 0;
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(IIIII)V")
	public void method787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) double local20;
		if (!this.aBoolean55) {
			@Pc(13) double local13 = (double) (arg2 - this.anInt1000);
			local20 = arg1 - this.anInt997;
			@Pc(29) double local29 = Math.sqrt(local20 * local20 + local13 * local13);
			this.aDouble3 = this.anInt993;
			this.aDouble8 = (double) this.anInt1000 + (double) this.anInt1011 * local13 / local29;
			this.aDouble4 = (double) this.anInt997 + local20 * (double) this.anInt1011 / local29;
		}
		local20 = this.anInt991 + 1 - arg0;
		this.aDouble2 = ((double) arg2 - this.aDouble8) / local20;
		this.aDouble5 = ((double) arg1 - this.aDouble4) / local20;
		this.aDouble6 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble5 * this.aDouble5);
		if (!this.aBoolean55) {
			this.aDouble9 = -this.aDouble6 * Math.tan((double) this.anInt995 * 0.02454369D);
		}
		this.aDouble7 = ((double) arg3 - local20 * this.aDouble9 - this.aDouble3) * 2.0D / (local20 * local20);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()I")
	@Override
	public int method2978() {
		return this.anInt1016;
	}
}
