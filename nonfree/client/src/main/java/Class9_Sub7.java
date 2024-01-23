import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class9_Sub7 extends Class9 {

	@OriginalMember(owner = "client!rd", name = "u", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!rd", name = "E", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
	private int anInt3635;

	@OriginalMember(owner = "client!rd", name = "N", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
	public int anInt3638;

	@OriginalMember(owner = "client!rd", name = "Y", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!rd", name = "bb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!rd", name = "gb", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!rd", name = "hb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!rd", name = "ib", descriptor = "D")
	private double aDouble10;

	@OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
	private int anInt3637 = 0;

	@OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
	private int anInt3633 = -32768;

	@OriginalMember(owner = "client!rd", name = "W", descriptor = "Z")
	private boolean aBoolean198 = false;

	@OriginalMember(owner = "client!rd", name = "cb", descriptor = "I")
	private int anInt3644 = 0;

	@OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
	public int anInt3636;

	@OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
	private int anInt3625;

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
	public int anInt3624;

	@OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
	public int anInt3630;

	@OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
	private int anInt3628;

	@OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
	private int anInt3631;

	@OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
	public int anInt3627;

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
	private int anInt3626;

	@OriginalMember(owner = "client!rd", name = "db", descriptor = "I")
	private int anInt3645;

	@OriginalMember(owner = "client!rd", name = "X", descriptor = "I")
	private int anInt3642;

	@OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
	public int anInt3639;

	@OriginalMember(owner = "client!rd", name = "x", descriptor = "Lclient!pj;")
	private Class1_Sub1_Sub21 aClass1_Sub1_Sub21_3;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class9_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.aBoolean198 = false;
		this.anInt3636 = arg1;
		this.anInt3625 = arg2;
		this.anInt3624 = arg6;
		this.anInt3630 = arg9;
		this.anInt3628 = arg8;
		this.anInt3631 = arg7;
		this.anInt3627 = arg10;
		this.anInt3626 = arg3;
		this.anInt3645 = arg4;
		this.anInt3642 = arg0;
		this.anInt3639 = arg5;
		@Pc(55) int local55 = Static191.method2988(this.anInt3642).anInt456;
		if (local55 == -1) {
			this.aClass1_Sub1_Sub21_3 = null;
		} else {
			this.aClass1_Sub1_Sub21_3 = Static74.method1343(local55);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class9_Sub2 local7 = this.method2739();
		if (local7 != null) {
			local7.method2903(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt3633 = local7.method2902();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)V")
	public void method2738(@OriginalArg(1) int arg0) {
		this.aDouble6 += (double) arg0 * this.aDouble5 * 0.5D * (double) arg0 + this.aDouble9 * (double) arg0;
		this.aDouble8 += (double) arg0 * this.aDouble7;
		this.aDouble9 += (double) arg0 * this.aDouble5;
		this.aBoolean198 = true;
		this.aDouble3 += this.aDouble10 * (double) arg0;
		this.anInt3638 = (int) (Math.atan2(this.aDouble10, this.aDouble7) * 325.949D) + 1024 & 0x7FF;
		this.anInt3635 = (int) (Math.atan2(this.aDouble9, this.aDouble4) * 325.949D) & 0x7FF;
		if (this.aClass1_Sub1_Sub21_3 == null) {
			return;
		}
		this.anInt3637 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt3637 <= this.aClass1_Sub1_Sub21_3.anIntArray450[this.anInt3644]) {
						return;
					}
					this.anInt3637 -= this.aClass1_Sub1_Sub21_3.anIntArray450[this.anInt3644];
					this.anInt3644++;
				} while (this.aClass1_Sub1_Sub21_3.anIntArray449.length > this.anInt3644);
				this.anInt3644 -= this.aClass1_Sub1_Sub21_3.anInt3439;
			} while (this.anInt3644 >= 0 && this.aClass1_Sub1_Sub21_3.anIntArray449.length > this.anInt3644);
			this.anInt3644 = 0;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "()I")
	@Override
	public int method2902() {
		return this.anInt3633;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)Lclient!cf;")
	private Class9_Sub2 method2739() {
		@Pc(8) Class1_Sub1_Sub4 local8 = Static191.method2988(this.anInt3642);
		@Pc(14) Class9_Sub2 local14 = local8.method326(this.anInt3644);
		if (local14 == null) {
			return null;
		} else {
			local14.method1698(this.anInt3635);
			return local14;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V")
	public void method2740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) double local15;
		if (!this.aBoolean198) {
			@Pc(9) double local9 = (double) (arg1 - this.anInt3626);
			local15 = arg0 - this.anInt3625;
			@Pc(24) double local24 = Math.sqrt(local15 * local15 + local9 * local9);
			this.aDouble8 = (double) this.anInt3626 + (double) this.anInt3628 * local9 / local24;
			this.aDouble6 = this.anInt3645;
			this.aDouble3 = (double) this.anInt3625 + local15 * (double) this.anInt3628 / local24;
		}
		local15 = this.anInt3624 + 1 - arg2;
		this.aDouble10 = ((double) arg0 - this.aDouble3) / local15;
		this.aDouble7 = ((double) arg1 - this.aDouble8) / local15;
		this.aDouble4 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble10 * this.aDouble10);
		if (!this.aBoolean198) {
			this.aDouble9 = -this.aDouble4 * Math.tan((double) this.anInt3631 * 0.02454369D);
		}
		this.aDouble5 = ((double) arg3 - this.aDouble6 - local15 * this.aDouble9) * 2.0D / (local15 * local15);
	}
}
