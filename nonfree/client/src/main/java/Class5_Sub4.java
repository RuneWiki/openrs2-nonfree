import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
	public int anInt3438;

	@OriginalMember(owner = "client!qh", name = "u", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!qh", name = "z", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!qh", name = "D", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
	private int anInt3450;

	@OriginalMember(owner = "client!qh", name = "L", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!qh", name = "P", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!qh", name = "Q", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!qh", name = "R", descriptor = "D")
	public double aDouble10;

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
	private int anInt3435 = 0;

	@OriginalMember(owner = "client!qh", name = "A", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
	private int anInt3447 = -32768;

	@OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
	private int anInt3445 = 0;

	@OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
	private final int anInt3434;

	@OriginalMember(owner = "client!qh", name = "S", descriptor = "I")
	private final int anInt3454;

	@OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
	public final int anInt3448;

	@OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
	public final int anInt3451;

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
	public final int anInt3433;

	@OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
	private final int anInt3452;

	@OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
	private final int anInt3441;

	@OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
	public final int anInt3449;

	@OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
	public final int anInt3453;

	@OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
	private final int anInt3443;

	@OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
	private final int anInt3446;

	@OriginalMember(owner = "client!qh", name = "C", descriptor = "Lclient!td;")
	private final Class1_Sub2_Sub22 aClass1_Sub2_Sub22_2;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class5_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.aBoolean159 = false;
		this.anInt3434 = arg7;
		this.anInt3454 = arg4;
		this.anInt3448 = arg5;
		this.anInt3451 = arg1;
		this.anInt3433 = arg6;
		this.anInt3452 = arg8;
		this.anInt3441 = arg0;
		this.anInt3449 = arg10;
		this.anInt3453 = arg9;
		this.anInt3443 = arg2;
		this.anInt3446 = arg3;
		@Pc(55) int local55 = Static72.method1365(this.anInt3441).anInt294;
		if (local55 == -1) {
			this.aClass1_Sub2_Sub22_2 = null;
		} else {
			this.aClass1_Sub2_Sub22_2 = Static85.method2622(local55);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
	public void method2650(@OriginalArg(0) int arg0) {
		this.aDouble10 += (double) arg0 * this.aDouble4 + this.aDouble5 * 0.5D * (double) arg0 * (double) arg0;
		this.aDouble4 += (double) arg0 * this.aDouble5;
		this.aDouble3 += (double) arg0 * this.aDouble7;
		this.aBoolean159 = true;
		this.aDouble6 += this.aDouble9 * (double) arg0;
		this.anInt3438 = (int) (Math.atan2(this.aDouble9, this.aDouble7) * 325.949D) + 1024 & 0x7FF;
		this.anInt3450 = (int) (Math.atan2(this.aDouble4, this.aDouble8) * 325.949D) & 0x7FF;
		if (this.aClass1_Sub2_Sub22_2 == null) {
			return;
		}
		this.anInt3445 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt3445 <= this.aClass1_Sub2_Sub22_2.anIntArray344[this.anInt3435]) {
						return;
					}
					this.anInt3445 -= this.aClass1_Sub2_Sub22_2.anIntArray344[this.anInt3435];
					this.anInt3435++;
				} while (this.anInt3435 < this.aClass1_Sub2_Sub22_2.anIntArray346.length);
				this.anInt3435 -= this.aClass1_Sub2_Sub22_2.anInt4005;
			} while (this.anInt3435 >= 0 && this.anInt3435 < this.aClass1_Sub2_Sub22_2.anIntArray346.length);
			this.anInt3435 = 0;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZII)V")
	public void method2651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) double local15;
		if (!this.aBoolean159) {
			@Pc(9) double local9 = (double) (arg0 - this.anInt3446);
			local15 = arg2 - this.anInt3443;
			@Pc(24) double local24 = Math.sqrt(local9 * local9 + local15 * local15);
			this.aDouble6 = (double) this.anInt3452 * local15 / local24 + (double) this.anInt3443;
			this.aDouble10 = this.anInt3454;
			this.aDouble3 = local9 * (double) this.anInt3452 / local24 + (double) this.anInt3446;
		}
		local15 = this.anInt3433 + 1 - arg3;
		this.aDouble9 = ((double) arg2 - this.aDouble6) / local15;
		this.aDouble7 = ((double) arg0 - this.aDouble3) / local15;
		this.aDouble8 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble9 * this.aDouble9);
		if (!this.aBoolean159) {
			this.aDouble4 = -this.aDouble8 * Math.tan((double) this.anInt3434 * 0.02454369D);
		}
		this.aDouble5 = ((double) arg1 - local15 * this.aDouble4 - this.aDouble10) * 2.0D / (local15 * local15);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)Lclient!lg;")
	private Class5_Sub1 method2652() {
		@Pc(8) Class1_Sub2_Sub3 local8 = Static72.method1365(this.anInt3441);
		@Pc(14) Class5_Sub1 local14 = local8.method299(this.anInt3435);
		if (local14 == null) {
			return null;
		} else {
			local14.method156(this.anInt3450);
			return local14;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class5_Sub1 local7 = this.method2652();
		if (local7 != null) {
			local7.method3164(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt3447 = local7.method3163();
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "()I")
	@Override
	public int method3163() {
		return this.anInt3447;
	}
}
