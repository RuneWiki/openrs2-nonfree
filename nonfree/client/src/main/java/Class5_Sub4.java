import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!kg", name = "A", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!kg", name = "E", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!kg", name = "K", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!kg", name = "P", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!kg", name = "U", descriptor = "I")
	private int anInt2485;

	@OriginalMember(owner = "client!kg", name = "Y", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!kg", name = "bb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!kg", name = "db", descriptor = "D")
	public double aDouble9;

	@OriginalMember(owner = "client!kg", name = "eb", descriptor = "I")
	public int anInt2491;

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!kg", name = "L", descriptor = "I")
	private int anInt2478 = 0;

	@OriginalMember(owner = "client!kg", name = "J", descriptor = "I")
	private int anInt2477 = -32768;

	@OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
	private int anInt2468 = 0;

	@OriginalMember(owner = "client!kg", name = "H", descriptor = "I")
	private int anInt2475;

	@OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
	public int anInt2472;

	@OriginalMember(owner = "client!kg", name = "V", descriptor = "I")
	public int anInt2486;

	@OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
	public int anInt2476;

	@OriginalMember(owner = "client!kg", name = "hb", descriptor = "I")
	private int anInt2493;

	@OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
	public int anInt2481;

	@OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
	private int anInt2469;

	@OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
	private int anInt2480;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
	private int anInt2465;

	@OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
	public int anInt2470;

	@OriginalMember(owner = "client!kg", name = "G", descriptor = "I")
	private int anInt2474;

	@OriginalMember(owner = "client!kg", name = "T", descriptor = "Lclient!c;")
	private Class2_Sub3_Sub3 aClass2_Sub3_Sub3_2;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class5_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt2475 = arg3;
		this.anInt2472 = arg9;
		this.anInt2486 = arg1;
		this.aBoolean107 = false;
		this.anInt2476 = arg10;
		this.anInt2493 = arg0;
		this.anInt2481 = arg6;
		this.anInt2469 = arg4;
		this.anInt2480 = arg2;
		this.anInt2465 = arg8;
		this.anInt2470 = arg5;
		this.anInt2474 = arg7;
		@Pc(55) int local55 = Static19.method266(this.anInt2493).anInt4361;
		if (local55 == -1) {
			this.aClass2_Sub3_Sub3_2 = null;
		} else {
			this.aClass2_Sub3_Sub3_2 = Static187.method3447(local55);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIBII)V")
	public void method1930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean107) {
			local9 = arg3 - this.anInt2480;
			@Pc(15) double local15 = (double) (arg2 - this.anInt2475);
			@Pc(24) double local24 = Math.sqrt(local9 * local9 + local15 * local15);
			this.aDouble9 = this.anInt2469;
			this.aDouble4 = (double) this.anInt2475 + local15 * (double) this.anInt2465 / local24;
			this.aDouble7 = (double) this.anInt2480 + local9 * (double) this.anInt2465 / local24;
		}
		local9 = this.anInt2481 + 1 - arg0;
		this.aDouble6 = ((double) arg2 - this.aDouble4) / local9;
		this.aDouble2 = ((double) arg3 - this.aDouble7) / local9;
		this.aDouble8 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble6 * this.aDouble6);
		if (!this.aBoolean107) {
			this.aDouble3 = -this.aDouble8 * Math.tan((double) this.anInt2474 * 0.02454369D);
		}
		this.aDouble5 = ((double) arg1 - local9 * this.aDouble3 - this.aDouble9) * 2.0D / (local9 * local9);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
	public void method1931(@OriginalArg(1) int arg0) {
		this.aDouble9 += this.aDouble3 * (double) arg0 + (double) arg0 * (double) arg0 * 0.5D * this.aDouble5;
		this.aBoolean107 = true;
		this.aDouble3 += this.aDouble5 * (double) arg0;
		this.aDouble7 += (double) arg0 * this.aDouble2;
		this.aDouble4 += this.aDouble6 * (double) arg0;
		this.anInt2491 = (int) (Math.atan2(this.aDouble2, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
		this.anInt2485 = (int) (Math.atan2(this.aDouble3, this.aDouble8) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub3_Sub3_2 == null) {
			return;
		}
		this.anInt2468 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt2468 <= this.aClass2_Sub3_Sub3_2.anIntArray77[this.anInt2478]) {
						return;
					}
					this.anInt2468 -= this.aClass2_Sub3_Sub3_2.anIntArray77[this.anInt2478];
					this.anInt2478++;
				} while (this.aClass2_Sub3_Sub3_2.anIntArray76.length > this.anInt2478);
				this.anInt2478 -= this.aClass2_Sub3_Sub3_2.anInt448;
			} while (this.anInt2478 >= 0 && this.aClass2_Sub3_Sub3_2.anIntArray76.length > this.anInt2478);
			this.anInt2478 = 0;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class5_Sub3 local7 = this.method1934();
		if (local7 != null) {
			local7.method3779(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt2477 = local7.method3773();
		}
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "()I")
	@Override
	public int method3773() {
		return this.anInt2477;
	}

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)Lclient!qc;")
	private Class5_Sub3 method1934() {
		@Pc(8) Class2_Sub3_Sub27 local8 = Static19.method266(this.anInt2493);
		@Pc(19) Class5_Sub3 local19 = local8.method3452(this.anInt2478);
		if (local19 == null) {
			return null;
		} else {
			local19.method1418(this.anInt2485);
			return local19;
		}
	}
}
