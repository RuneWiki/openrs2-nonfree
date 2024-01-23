import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!bl", name = "s", descriptor = "[I")
	public static int[] anIntArray50 = new int[32];

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!bl", name = "u", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!bl", name = "A", descriptor = "Lclient!dc;")
	private Class34_Sub1 aClass34_Sub1_1;

	@OriginalMember(owner = "client!bl", name = "E", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!bl", name = "G", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
	private int anInt574;

	@OriginalMember(owner = "client!bl", name = "K", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!bl", name = "Q", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!bl", name = "W", descriptor = "I")
	public int anInt585;

	@OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
	private int anInt563 = 0;

	@OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
	private int anInt572 = -32768;

	@OriginalMember(owner = "client!bl", name = "I", descriptor = "Z")
	private boolean aBoolean31 = false;

	@OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
	private int anInt579 = -1;

	@OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
	private int anInt577 = 0;

	@OriginalMember(owner = "client!bl", name = "O", descriptor = "Z")
	private boolean aBoolean32 = false;

	@OriginalMember(owner = "client!bl", name = "F", descriptor = "I")
	private int anInt573;

	@OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
	public int anInt582;

	@OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
	public int anInt576;

	@OriginalMember(owner = "client!bl", name = "N", descriptor = "I")
	private int anInt578;

	@OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
	private int anInt562;

	@OriginalMember(owner = "client!bl", name = "R", descriptor = "I")
	private int anInt580;

	@OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
	private int anInt565;

	@OriginalMember(owner = "client!bl", name = "U", descriptor = "I")
	public int anInt583;

	@OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
	private int anInt564;

	@OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
	public int anInt584;

	@OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
	public int anInt569;

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "Lclient!d;")
	private Class32 aClass32_1;

	static {
		@Pc(6) int local6 = 2;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			anIntArray50[local8] = local6 - 1;
			local6 += local6;
		}
	}

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt573 = arg7;
		this.anInt582 = arg10;
		this.anInt576 = arg5;
		this.aBoolean31 = false;
		this.anInt578 = arg4;
		this.anInt562 = arg8;
		this.anInt580 = arg3;
		this.anInt565 = arg2;
		this.anInt583 = arg1;
		this.anInt564 = arg0;
		this.anInt584 = arg6;
		this.anInt569 = arg9;
		@Pc(61) int local61 = Static28.method611(this.anInt564).anInt3368;
		if (local61 == -1) {
			this.aClass32_1 = null;
		} else {
			this.aClass32_1 = Static202.method3231(local61);
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "()I")
	@Override
	public int method3948() {
		return this.anInt572;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!o;I)V")
	private void method452(@OriginalArg(0) Class2_Sub1 arg0) {
		if (Static294.aBoolean367) {
			@Pc(50) Class2_Sub1_Sub1 local50 = (Class2_Sub1_Sub1) arg0;
			if ((this.aClass34_Sub1_1 == null || this.aClass34_Sub1_1.aBoolean73) && (local50.aClass135Array1 != null || local50.aClass86Array1 != null)) {
				this.aClass34_Sub1_1 = new Class34_Sub1(Static133.anInt3061, 1, 1);
			}
			if (this.aClass34_Sub1_1 != null) {
				this.aClass34_Sub1_1.method858(local50.aClass135Array1, local50.aClass86Array1, false, local50.anIntArray6, local50.anIntArray9, local50.anIntArray4);
			}
		} else {
			@Pc(4) Class2_Sub1_Sub2 local4 = (Class2_Sub1_Sub2) arg0;
			if ((this.aClass34_Sub1_1 == null || this.aClass34_Sub1_1.aBoolean73) && (local4.aClass135Array2 != null || local4.aClass86Array2 != null)) {
				this.aClass34_Sub1_1 = new Class34_Sub1(Static133.anInt3061, 1, 1);
			}
			if (this.aClass34_Sub1_1 != null) {
				this.aClass34_Sub1_1.method858(local4.aClass135Array2, local4.aClass86Array2, false, local4.anIntArray61, local4.anIntArray60, local4.anIntArray67);
			}
		}
		this.aBoolean32 = true;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIB)V")
	public void method454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) double local14;
		if (!this.aBoolean31) {
			local14 = arg0 - this.anInt565;
			@Pc(21) double local21 = (double) (arg3 - this.anInt580);
			@Pc(30) double local30 = Math.sqrt(local14 * local14 + local21 * local21);
			this.aDouble7 = (double) this.anInt565 + (double) this.anInt562 * local14 / local30;
			this.aDouble6 = (double) this.anInt580 + local21 * (double) this.anInt562 / local30;
			this.aDouble2 = this.anInt578;
		}
		local14 = this.anInt584 + 1 - arg1;
		this.aDouble1 = ((double) arg0 - this.aDouble7) / local14;
		this.aDouble3 = ((double) arg3 - this.aDouble6) / local14;
		this.aDouble5 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble3 * this.aDouble3);
		if (this.anInt573 == -1) {
			this.aDouble8 = ((double) arg2 - this.aDouble2) / local14;
		} else {
			if (!this.aBoolean31) {
				this.aDouble8 = -this.aDouble5 * Math.tan((double) this.anInt573 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg2 - local14 * this.aDouble8 - this.aDouble2) * 2.0D / (local14 * local14);
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)V")
	public void method456(@OriginalArg(1) int arg0) {
		this.aDouble7 += this.aDouble1 * (double) arg0;
		if (this.anInt573 == -1) {
			this.aDouble2 += (double) arg0 * this.aDouble8;
		} else {
			this.aDouble2 += (double) arg0 * this.aDouble8 + (double) arg0 * 0.5D * this.aDouble4 * (double) arg0;
			this.aDouble8 += this.aDouble4 * (double) arg0;
		}
		this.aDouble6 += this.aDouble3 * (double) arg0;
		this.aBoolean31 = true;
		this.anInt585 = (int) (Math.atan2(this.aDouble1, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
		this.anInt574 = (int) (Math.atan2(this.aDouble8, this.aDouble5) * 325.949D) & 0x7FF;
		if (this.aClass32_1 == null) {
			return;
		}
		this.anInt563 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt563 <= this.aClass32_1.anIntArray121[this.anInt577]) {
						return;
					}
					this.anInt563 -= this.aClass32_1.anIntArray121[this.anInt577];
					this.anInt577++;
					if (this.anInt577 >= this.aClass32_1.anIntArray123.length) {
						this.anInt577 -= this.aClass32_1.anInt968;
						if (this.anInt577 < 0 || this.aClass32_1.anIntArray123.length <= this.anInt577) {
							this.anInt577 = 0;
						}
					}
					this.anInt579 = this.anInt577 + 1;
				} while (this.aClass32_1.anIntArray123.length > this.anInt579);
				this.anInt579 -= this.aClass32_1.anInt968;
			} while (this.anInt579 >= 0 && this.aClass32_1.anIntArray123.length > this.anInt579);
			this.anInt579 = -1;
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)Lclient!o;")
	private Class2_Sub1 method458() {
		@Pc(21) Class94 local21 = Static28.method611(this.anInt564);
		@Pc(31) Class2_Sub1 local31 = local21.method2423(this.anInt563, this.anInt577, this.anInt579);
		if (local31 == null) {
			return null;
		} else {
			local31.method554(this.anInt574);
			return local31;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIIIJILclient!dc;)V")
	@Override
	public void method3951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class34_Sub1 arg10) {
		@Pc(7) Class2_Sub1 local7 = this.method458();
		if (local7 != null) {
			this.method452(local7);
			local7.method3951(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass34_Sub1_1);
			this.anInt572 = local7.method3948();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean32) {
			@Pc(10) Class2_Sub1 local10 = this.method458();
			if (local10 == null) {
				return;
			}
			this.method452(local10);
		}
		if (this.aClass34_Sub1_1 != null) {
			this.aClass34_Sub1_1.method860(arg0, arg1, arg3, arg2, arg4);
		}
	}
}
