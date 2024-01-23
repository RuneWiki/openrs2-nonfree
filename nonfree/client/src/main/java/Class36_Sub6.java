import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class36_Sub6 extends Class36 {

	@OriginalMember(owner = "client!s", name = "p", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!s", name = "s", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!s", name = "u", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!s", name = "v", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!s", name = "D", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!s", name = "J", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!s", name = "L", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!s", name = "M", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!s", name = "P", descriptor = "Lclient!rb;")
	private Class105_Sub1 aClass105_Sub1_6;

	@OriginalMember(owner = "client!s", name = "T", descriptor = "I")
	public int anInt4752;

	@OriginalMember(owner = "client!s", name = "X", descriptor = "I")
	private int anInt4756;

	@OriginalMember(owner = "client!s", name = "t", descriptor = "Z")
	private boolean aBoolean381 = false;

	@OriginalMember(owner = "client!s", name = "A", descriptor = "I")
	private int anInt4738 = 0;

	@OriginalMember(owner = "client!s", name = "U", descriptor = "I")
	private int anInt4753 = -1;

	@OriginalMember(owner = "client!s", name = "V", descriptor = "I")
	private int anInt4754 = -32768;

	@OriginalMember(owner = "client!s", name = "O", descriptor = "I")
	private int anInt4748 = 0;

	@OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
	public int anInt4758;

	@OriginalMember(owner = "client!s", name = "R", descriptor = "I")
	private int anInt4750;

	@OriginalMember(owner = "client!s", name = "H", descriptor = "I")
	public int anInt4744;

	@OriginalMember(owner = "client!s", name = "C", descriptor = "I")
	public int anInt4740;

	@OriginalMember(owner = "client!s", name = "r", descriptor = "I")
	public int anInt4733;

	@OriginalMember(owner = "client!s", name = "F", descriptor = "I")
	private int anInt4742;

	@OriginalMember(owner = "client!s", name = "z", descriptor = "I")
	private int anInt4737;

	@OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
	private int anInt4760;

	@OriginalMember(owner = "client!s", name = "n", descriptor = "I")
	public int anInt4731;

	@OriginalMember(owner = "client!s", name = "o", descriptor = "I")
	private int anInt4732;

	@OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
	private int anInt4749;

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "Lclient!hn;")
	private Class76 aClass76_3;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class36_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.aBoolean381 = false;
		this.anInt4758 = arg9;
		this.anInt4750 = arg7;
		this.anInt4744 = arg5;
		this.anInt4740 = arg6;
		this.anInt4733 = arg1;
		this.anInt4742 = arg4;
		this.anInt4737 = arg8;
		this.anInt4760 = arg0;
		this.anInt4731 = arg10;
		this.anInt4732 = arg2;
		this.anInt4749 = arg3;
		@Pc(58) int local58 = Static81.method1346(this.anInt4760).anInt4680;
		if (local58 == -1) {
			this.aClass76_3 = null;
		} else {
			this.aClass76_3 = Static115.method1855(local58);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Lclient!ie;")
	private Class36_Sub2 method3577() {
		@Pc(8) Class144 local8 = Static81.method1346(this.anInt4760);
		@Pc(24) Class36_Sub2 local24 = local8.method3527(this.anInt4748, this.anInt4738, this.anInt4753);
		if (local24 == null) {
			return null;
		} else {
			local24.method3945(this.anInt4756);
			return local24;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)V")
	public void method3579(@OriginalArg(0) int arg0) {
		if (this.anInt4750 == -1) {
			this.aDouble6 += (double) arg0 * this.aDouble2;
		} else {
			this.aDouble6 += (double) arg0 * this.aDouble2 + (double) arg0 * this.aDouble7 * 0.5D * (double) arg0;
			this.aDouble2 += (double) arg0 * this.aDouble7;
		}
		this.aDouble8 += (double) arg0 * this.aDouble5;
		this.aBoolean381 = true;
		this.aDouble4 += (double) arg0 * this.aDouble3;
		this.anInt4752 = (int) (Math.atan2(this.aDouble3, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
		this.anInt4756 = (int) (Math.atan2(this.aDouble2, this.aDouble9) * 325.949D) & 0x7FF;
		if (this.aClass76_3 == null) {
			return;
		}
		this.anInt4738 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt4738 <= this.aClass76_3.anIntArray158[this.anInt4748]) {
						return;
					}
					this.anInt4738 -= this.aClass76_3.anIntArray158[this.anInt4748];
					this.anInt4748++;
					if (this.anInt4748 >= this.aClass76_3.anIntArray159.length) {
						this.anInt4748 -= this.aClass76_3.anInt2214;
						if (this.anInt4748 < 0 || this.aClass76_3.anIntArray159.length <= this.anInt4748) {
							this.anInt4748 = 0;
						}
					}
					this.anInt4753 = this.anInt4748 + 1;
				} while (this.aClass76_3.anIntArray159.length > this.anInt4753);
				this.anInt4753 -= this.aClass76_3.anInt2214;
			} while (this.anInt4753 >= 0 && this.anInt4753 < this.aClass76_3.anIntArray159.length);
			this.anInt4753 = -1;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIBI)V")
	public void method3582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean381) {
			local9 = arg1 - this.anInt4732;
			@Pc(16) double local16 = (double) (arg2 - this.anInt4749);
			@Pc(25) double local25 = Math.sqrt(local9 * local9 + local16 * local16);
			this.aDouble6 = this.anInt4742;
			this.aDouble4 = (double) this.anInt4732 + local9 * (double) this.anInt4737 / local25;
			this.aDouble8 = (double) this.anInt4737 * local16 / local25 + (double) this.anInt4749;
		}
		local9 = this.anInt4740 + 1 - arg0;
		this.aDouble3 = ((double) arg1 - this.aDouble4) / local9;
		this.aDouble5 = ((double) arg2 - this.aDouble8) / local9;
		this.aDouble9 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble5 * this.aDouble5);
		if (this.anInt4750 == -1) {
			this.aDouble2 = ((double) arg3 - this.aDouble6) / local9;
		} else {
			if (!this.aBoolean381) {
				this.aDouble2 = -this.aDouble9 * Math.tan((double) this.anInt4750 * 0.02454369D);
			}
			this.aDouble7 = ((double) arg3 - local9 * this.aDouble2 - this.aDouble6) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "()I")
	@Override
	public int method4175() {
		return this.anInt4754;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIIJILclient!rb;)V")
	@Override
	public void method4173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class105_Sub1 arg10) {
		@Pc(7) Class36_Sub2 local7 = this.method3577();
		if (local7 != null) {
			local7.method4173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass105_Sub1_6);
			this.anInt4754 = local7.method4175();
		}
	}
}
