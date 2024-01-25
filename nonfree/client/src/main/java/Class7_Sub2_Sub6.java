import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class7_Sub2_Sub6 extends Class7_Sub2 {

	@OriginalMember(owner = "client!jh", name = "F", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!jh", name = "J", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!jh", name = "K", descriptor = "Lclient!wk;")
	private Class6_Sub8 aClass6_Sub8_6;

	@OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
	private int anInt3772;

	@OriginalMember(owner = "client!jh", name = "V", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!jh", name = "Z", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!jh", name = "hb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!jh", name = "lb", descriptor = "D")
	private double lb;

	@OriginalMember(owner = "client!jh", name = "ob", descriptor = "I")
	private int anInt3790;

	@OriginalMember(owner = "client!jh", name = "rb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!jh", name = "sb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
	private int anInt3768 = 0;

	@OriginalMember(owner = "client!jh", name = "W", descriptor = "I")
	private int anInt3778 = -32768;

	@OriginalMember(owner = "client!jh", name = "U", descriptor = "Z")
	private boolean aBoolean322 = false;

	@OriginalMember(owner = "client!jh", name = "X", descriptor = "I")
	private int anInt3779 = -1;

	@OriginalMember(owner = "client!jh", name = "tb", descriptor = "I")
	private int anInt3793 = 0;

	@OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
	private final int anInt3764;

	@OriginalMember(owner = "client!jh", name = "bb", descriptor = "I")
	private final int anInt3782;

	@OriginalMember(owner = "client!jh", name = "nb", descriptor = "I")
	private final int anInt3789;

	@OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
	public final int anInt3773;

	@OriginalMember(owner = "client!jh", name = "fb", descriptor = "I")
	public final int anInt3786;

	@OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
	private final int anInt3770;

	@OriginalMember(owner = "client!jh", name = "ib", descriptor = "Z")
	private final boolean aBoolean324;

	@OriginalMember(owner = "client!jh", name = "eb", descriptor = "I")
	public final int anInt3785;

	@OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
	public final int anInt3775;

	@OriginalMember(owner = "client!jh", name = "H", descriptor = "Lclient!kf;")
	private final Class128 aClass128_3;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class7_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static231.method3482(arg1, arg2, arg3) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt3764 = arg4;
		this.anInt3782 = arg8;
		this.anInt3789 = arg7;
		this.anInt3773 = arg9;
		this.anInt3786 = arg10;
		this.aBoolean322 = false;
		this.anInt3770 = arg0;
		this.aBoolean324 = arg11;
		this.anInt3785 = arg6;
		this.anInt3775 = arg5;
		@Pc(78) int local78 = Static96.aClass41_2.method1134(this.anInt3770).anInt466;
		if (local78 == -1) {
			this.aClass128_3 = null;
		} else {
			this.aClass128_3 = Static301.aClass170_3.method3936(local78);
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5276() {
		return false;
	}

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "(B)V")
	@Override
	public void method3493() {
		super.aShort71 = super.aShort72 = (short) (this.aDouble8 / 128.0D);
		super.aShort73 = super.aShort70 = (short) (this.aDouble6 / 128.0D);
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)I")
	@Override
	public int method3494() {
		return this.anInt3778;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!qa;Lclient!c;B)V")
	private void method3006(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class9 arg1) {
		@Pc(10) Class269[] local10 = arg1.method5680();
		@Pc(13) Class165[] local13 = arg1.method5685();
		if ((this.aClass6_Sub8_6 == null || this.aClass6_Sub8_6.aBoolean653) && (local10 != null || local13 != null)) {
			this.aClass6_Sub8_6 = new Class6_Sub8(Static253.anInt4787);
		}
		if (this.aClass6_Sub8_6 != null) {
			this.aClass6_Sub8_6.method5920(arg0, (long) Static253.anInt4787, local10, local13);
			this.aClass6_Sub8_6.method5917(super.aByte77, super.aShort71, super.aShort72, super.aShort73, super.aShort70);
		}
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)V")
	@Override
	public void method5268() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5267(@OriginalArg(1) Class172 arg0) {
		@Pc(9) Class9 local9 = this.method3011(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class107 local15 = arg0.method5495();
		local15.YA(this.anInt3772);
		local15.c(this.anInt3790);
		local15.ZA((int) this.aDouble8, (int) this.aDouble5, (int) this.aDouble6);
		this.anInt3778 = local9.b();
		this.method3006(arg0, local9);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIBII)V")
	public void method3008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) double local17;
		if (!this.aBoolean322) {
			local17 = arg3 - super.anInt4318;
			@Pc(24) double local24 = (double) (arg1 - super.anInt4321);
			@Pc(33) double local33 = Math.sqrt(local17 * local17 + local24 * local24);
			this.aDouble8 = local17 * (double) this.anInt3782 / local33 + (double) super.anInt4318;
			this.aDouble6 = (double) super.anInt4321 + (double) this.anInt3782 * local24 / local33;
			if (this.aBoolean324) {
				this.aDouble5 = Static231.method3482(super.aByte77, (int) this.aDouble8, (int) this.aDouble6) - this.anInt3764;
			} else {
				this.aDouble5 = super.anInt4320;
			}
		}
		local17 = this.anInt3785 + 1 - arg2;
		this.aDouble7 = ((double) arg1 - this.aDouble6) / local17;
		this.aDouble2 = ((double) arg3 - this.aDouble8) / local17;
		this.aDouble3 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble7 * this.aDouble7);
		if (this.anInt3789 == -1) {
			this.aDouble4 = ((double) arg0 - this.aDouble5) / local17;
		} else {
			if (!this.aBoolean322) {
				this.aDouble4 = -this.aDouble3 * Math.tan((double) this.anInt3789 * 0.02454369D);
			}
			this.lb = ((double) arg0 - local17 * this.aDouble4 - this.aDouble5) * 2.0D / (local17 * local17);
		}
	}

	@OriginalMember(owner = "client!jh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass6_Sub8_6 != null) {
			this.aClass6_Sub8_6.method5919();
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZLclient!qa;)Lclient!ae;")
	@Override
	public Class6_Sub1 method5274(@OriginalArg(1) Class172 arg0) {
		@Pc(9) Class9 local9 = this.method3011(arg0, 2048);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class107 local16 = arg0.method5495();
		local16.YA(this.anInt3772);
		local16.c(this.anInt3790);
		local16.ZA((int) this.aDouble8, (int) this.aDouble5, (int) this.aDouble6);
		if (this.aClass6_Sub8_6 == null) {
			local9.method5695(local16, null, 0);
		} else {
			@Pc(54) Class227 local54 = this.aClass6_Sub8_6.method5923();
			arg0.method5520(local9, local54, local16, null);
		}
		this.anInt3778 = local9.b();
		this.method3006(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method5270(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!qa;ZLclient!to;III)V")
	@Override
	public void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!qa;II)Lclient!c;")
	private Class9 method3011(@OriginalArg(0) Class172 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class13 local16 = Static96.aClass41_2.method1134(this.anInt3770);
		return local16.method373(arg0, this.anInt3793, this.anInt3779, this.anInt3768, arg1, Static301.aClass170_3);
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V")
	public void method3012() {
		if (this.aClass6_Sub8_6 != null) {
			this.aClass6_Sub8_6.method5919();
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)V")
	public void method3014(@OriginalArg(0) int arg0) {
		this.aDouble8 += this.aDouble2 * (double) arg0;
		this.aDouble6 += this.aDouble7 * (double) arg0;
		this.aBoolean322 = true;
		if (this.aBoolean324) {
			this.aDouble5 = Static231.method3482(super.aByte77, (int) this.aDouble8, (int) this.aDouble6) - this.anInt3764;
		} else if (this.anInt3789 == -1) {
			this.aDouble5 += this.aDouble4 * (double) arg0;
		} else {
			this.aDouble5 += (double) arg0 * this.aDouble4 + (double) arg0 * (double) arg0 * this.lb * 0.5D;
			this.aDouble4 += (double) arg0 * this.lb;
		}
		this.anInt3790 = (int) (Math.atan2(this.aDouble2, this.aDouble7) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt3772 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass128_3 == null) {
			return;
		}
		this.anInt3768 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt3768 <= this.aClass128_3.anIntArray254[this.anInt3793]) {
						return;
					}
					this.anInt3768 -= this.aClass128_3.anIntArray254[this.anInt3793];
					this.anInt3793++;
					if (this.aClass128_3.anIntArray252.length <= this.anInt3793) {
						this.anInt3793 -= this.aClass128_3.anInt3970;
						if (this.anInt3793 < 0 || this.anInt3793 >= this.aClass128_3.anIntArray252.length) {
							this.anInt3793 = 0;
						}
					}
					this.anInt3779 = this.anInt3793 + 1;
				} while (this.anInt3779 < this.aClass128_3.anIntArray252.length);
				this.anInt3779 -= this.aClass128_3.anInt3970;
			} while (this.anInt3779 >= 0 && this.aClass128_3.anIntArray252.length > this.anInt3779);
			this.anInt3779 = -1;
		}
	}
}
