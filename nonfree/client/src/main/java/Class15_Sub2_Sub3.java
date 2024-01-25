import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class15_Sub2_Sub3 extends Class15_Sub2 {

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
	private int anInt3954;

	@OriginalMember(owner = "client!ik", name = "H", descriptor = "Lclient!qp;")
	private Class30_Sub7 aClass30_Sub7_3;

	@OriginalMember(owner = "client!ik", name = "K", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!ik", name = "M", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!ik", name = "Q", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!ik", name = "R", descriptor = "I")
	private int anInt3972;

	@OriginalMember(owner = "client!ik", name = "S", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!ik", name = "T", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ik", name = "W", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ik", name = "ab", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!ik", name = "jb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!ik", name = "w", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
	private int anInt3961 = 0;

	@OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
	private int anInt3967 = -32768;

	@OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
	private int anInt3966 = 0;

	@OriginalMember(owner = "client!ik", name = "L", descriptor = "I")
	private int anInt3968 = -1;

	@OriginalMember(owner = "client!ik", name = "P", descriptor = "I")
	public final int anInt3971;

	@OriginalMember(owner = "client!ik", name = "fb", descriptor = "I")
	private final int anInt3980;

	@OriginalMember(owner = "client!ik", name = "cb", descriptor = "Z")
	private final boolean aBoolean242;

	@OriginalMember(owner = "client!ik", name = "lb", descriptor = "I")
	private final int lb;

	@OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
	public final int anInt3959;

	@OriginalMember(owner = "client!ik", name = "X", descriptor = "I")
	public final int anInt3975;

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
	public final int anInt3956;

	@OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
	private final int anInt3955;

	@OriginalMember(owner = "client!ik", name = "mb", descriptor = "I")
	private final int anInt3984;

	@OriginalMember(owner = "client!ik", name = "E", descriptor = "Lclient!bj;")
	private final Class31 aClass31_1;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class15_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static191.method5464(arg2, arg3, arg1) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt3971 = arg10;
		this.anInt3980 = arg4;
		this.aBoolean242 = arg11;
		this.lb = arg7;
		this.anInt3959 = arg6;
		this.aBoolean241 = false;
		this.anInt3975 = arg9;
		this.anInt3956 = arg5;
		this.anInt3955 = arg0;
		this.anInt3984 = arg8;
		@Pc(78) int local78 = Static501.aClass41_2.method1068(this.anInt3955).anInt1218;
		if (local78 == -1) {
			this.aClass31_1 = null;
		} else {
			this.aClass31_1 = Static155.aClass76_2.method2152(local78);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6862(@OriginalArg(0) Class62 arg0) {
		@Pc(14) Class36 local14 = this.method3428(0, arg0);
		if (local14 == null) {
			return;
		}
		@Pc(20) Class78 local20 = arg0.method6994();
		local20.KA(this.anInt3954);
		local20.XA(this.anInt3972);
		local20.TA((int) this.aDouble2, (int) this.aDouble5, (int) this.aDouble8);
		this.anInt3967 = local14.TA();
		this.method3425(arg0, local14);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V")
	public void method3424(@OriginalArg(0) int arg0) {
		this.aDouble2 += (double) arg0 * this.aDouble6;
		this.aDouble8 += (double) arg0 * this.aDouble1;
		this.aBoolean241 = true;
		if (this.aBoolean242) {
			this.aDouble5 = Static191.method5464((int) this.aDouble2, (int) this.aDouble8, super.aByte91) - this.anInt3980;
		} else if (this.lb == -1) {
			this.aDouble5 += (double) arg0 * this.aDouble3;
		} else {
			this.aDouble5 += (double) arg0 * this.aDouble3 + (double) arg0 * 0.5D * this.aDouble7 * (double) arg0;
			this.aDouble3 += (double) arg0 * this.aDouble7;
		}
		this.anInt3972 = (int) (Math.atan2(this.aDouble6, this.aDouble1) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt3954 = (int) (Math.atan2(this.aDouble3, this.aDouble4) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass31_1 == null) {
			return;
		}
		this.anInt3966 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass31_1.anIntArray68[this.anInt3961] >= this.anInt3966) {
						return;
					}
					this.anInt3966 -= this.aClass31_1.anIntArray68[this.anInt3961];
					this.anInt3961++;
					if (this.aClass31_1.anIntArray69.length <= this.anInt3961) {
						this.anInt3961 -= this.aClass31_1.anInt927;
						if (this.anInt3961 < 0 || this.anInt3961 >= this.aClass31_1.anIntArray69.length) {
							this.anInt3961 = 0;
						}
					}
					this.anInt3968 = this.anInt3961 + 1;
				} while (this.anInt3968 < this.aClass31_1.anIntArray69.length);
				this.anInt3968 -= this.aClass31_1.anInt927;
			} while (this.anInt3968 >= 0 && this.aClass31_1.anIntArray69.length > this.anInt3968);
			this.anInt3968 = -1;
		}
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "(B)V")
	@Override
	public void method6865() {
		super.aShort110 = super.aShort111 = (short) (this.aDouble2 / 128.0D);
		super.aShort109 = super.aShort108 = (short) (this.aDouble8 / 128.0D);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!qa;Lclient!r;I)V")
	private void method3425(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class36 arg1) {
		@Pc(12) Class223[] local12 = arg1.method7350();
		@Pc(15) Class280[] local15 = arg1.method7361();
		if ((this.aClass30_Sub7_3 == null || this.aClass30_Sub7_3.aBoolean513) && (local12 != null || local15 != null)) {
			this.aClass30_Sub7_3 = Static407.method5909(Static481.anInt8318);
		}
		if (this.aClass30_Sub7_3 != null) {
			this.aClass30_Sub7_3.method5901(arg0, (long) Static481.anInt8318, local12, local15);
			this.aClass30_Sub7_3.method5902(super.aByte91, super.aShort110, super.aShort111, super.aShort109, super.aShort108);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!qa;I)Lclient!bi;")
	@Override
	public Class30_Sub1 method6858(@OriginalArg(0) Class62 arg0) {
		@Pc(15) Class36 local15 = this.method3428(2048, arg0);
		if (local15 == null) {
			return null;
		}
		@Pc(22) Class78 local22 = arg0.method6994();
		local22.KA(this.anInt3954);
		local22.XA(this.anInt3972);
		local22.TA((int) this.aDouble2, (int) this.aDouble5, (int) this.aDouble8);
		if (this.aClass30_Sub7_3 == null) {
			local15.method7360(local22, null, 0);
		} else {
			@Pc(55) Class267 local55 = this.aClass30_Sub7_3.method5906();
			arg0.method7066(local15, local55, local22, null);
		}
		this.anInt3967 = local15.TA();
		this.method3425(arg0, local15);
		return null;
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)V")
	@Override
	public void method6860() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ik", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass30_Sub7_3 != null) {
			this.aClass30_Sub7_3.method5903();
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)I")
	@Override
	public int method6864() {
		return this.anInt3967;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(ILclient!qa;)Lclient!km;")
	@Override
	public Class175 method6854(@OriginalArg(1) Class62 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIZ)V")
	public void method3427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(19) double local19;
		if (!this.aBoolean241) {
			local19 = arg2 - super.anInt8492;
			@Pc(25) double local25 = (double) (arg1 - super.anInt8493);
			@Pc(34) double local34 = Math.sqrt(local25 * local25 + local19 * local19);
			this.aDouble8 = (double) super.anInt8493 + (double) this.anInt3984 * local25 / local34;
			this.aDouble2 = (double) this.anInt3984 * local19 / local34 + (double) super.anInt8492;
			if (this.aBoolean242) {
				this.aDouble5 = Static191.method5464((int) this.aDouble2, (int) this.aDouble8, super.aByte91) - this.anInt3980;
			} else {
				this.aDouble5 = super.anInt8494;
			}
		}
		local19 = this.anInt3959 + 1 - arg3;
		this.aDouble6 = ((double) arg2 - this.aDouble2) / local19;
		this.aDouble1 = ((double) arg1 - this.aDouble8) / local19;
		this.aDouble4 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble6 * this.aDouble6);
		if (this.lb == -1) {
			this.aDouble3 = ((double) arg0 - this.aDouble5) / local19;
		} else {
			if (!this.aBoolean241) {
				this.aDouble3 = -this.aDouble4 * Math.tan((double) this.lb * 0.02454369D);
			}
			this.aDouble7 = ((double) arg0 - this.aDouble5 - this.aDouble3 * local19) * 2.0D / (local19 * local19);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLclient!qa;II)Z")
	@Override
	public boolean method6857(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IBLclient!qa;)Lclient!r;")
	private Class36 method3428(@OriginalArg(0) int arg0, @OriginalArg(2) Class62 arg1) {
		@Pc(17) Class48 local17 = Static501.aClass41_2.method1068(this.anInt3955);
		return local17.method1167(arg0, this.anInt3968, this.anInt3961, this.anInt3966, arg1, Static155.aClass76_2);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6861() {
		return false;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	public void method3430() {
		if (this.aClass30_Sub7_3 != null) {
			this.aClass30_Sub7_3.method5903();
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BZILclient!qa;IILclient!cea;)V")
	@Override
	public void method6859(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5) {
		throw new IllegalStateException();
	}
}
