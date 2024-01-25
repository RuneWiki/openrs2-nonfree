import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class349 {

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
	private int anInt9239;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "Lclient!oa;")
	public Class11_Sub9 aClass11_Sub9_8;

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "Lclient!da;")
	private Class52 aClass52_7;

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
	private int anInt9250;

	@OriginalMember(owner = "client!vi", name = "z", descriptor = "Lclient!ks;")
	private Class197 aClass197_3;

	@OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
	private int anInt9258;

	@OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
	private int anInt9259;

	@OriginalMember(owner = "client!vi", name = "J", descriptor = "[Z")
	private boolean[] aBooleanArray36;

	@OriginalMember(owner = "client!vi", name = "K", descriptor = "Lclient!ha;")
	private Class1_Sub8_Sub4 aClass1_Sub8_Sub4_6;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
	private int anInt9238 = 0;

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "Z")
	private boolean aBoolean689 = false;

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
	private int anInt9244 = -1;

	@OriginalMember(owner = "client!vi", name = "F", descriptor = "Z")
	private boolean aBoolean692 = false;

	@OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
	private int anInt9255 = -1;

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
	private int anInt9254 = 0;

	@OriginalMember(owner = "client!vi", name = "I", descriptor = "I")
	private int anInt9262 = -1;

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "B")
	private final byte aByte119;

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "Lclient!vv;")
	private final Class11_Sub1 aClass11_Sub1_3;

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
	public final int anInt9246;

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
	public final int anInt9248;

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "B")
	private final byte aByte118;

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
	public final int anInt9245;

	@OriginalMember(owner = "client!vi", name = "D", descriptor = "Z")
	private final boolean aBoolean691;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!r;Lclient!js;IIIILclient!vv;ZI)V")
	public Class349(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class11_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.aByte119 = (byte) arg5;
		this.aClass11_Sub1_3 = arg6;
		this.anInt9246 = arg1.anInt4643;
		this.anInt9248 = arg3;
		this.aBoolean692 = arg7;
		this.aByte118 = (byte) arg4;
		this.anInt9245 = arg2;
		this.aBoolean691 = arg0.method6792() && arg1.aBoolean348 && !this.aBoolean692;
		if (arg8 != -1) {
			this.aBoolean689 = true;
		}
		this.method7537(arg8);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!vv;)V")
	private void method7530(@OriginalArg(1) Class11_Sub1 arg0) {
		label80: while (true) {
			if (this.aClass197_3 == null) {
				if (this.aBoolean689) {
					return;
				}
				this.method7537(-1);
				if (this.aClass197_3 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static518.anInt9331 - this.anInt9259;
			if (local30 > 100 && this.aClass197_3.anInt5063 > 0) {
				@Pc(49) int local49 = this.aClass197_3.anIntArray284.length - this.aClass197_3.anInt5063;
				while (local49 > this.anInt9258 && this.aClass197_3.anIntArray279[this.anInt9258] < local30) {
					local30 -= this.aClass197_3.anIntArray279[this.anInt9258];
					this.anInt9258++;
				}
				if (local49 <= this.anInt9258) {
					@Pc(88) int local88 = 0;
					for (@Pc(90) int local90 = local49; local90 < this.aClass197_3.anIntArray284.length; local90++) {
						local88 += this.aClass197_3.anIntArray279[local90];
					}
					local30 %= local88;
				}
				this.anInt9250 = this.anInt9258 + 1;
				if (this.anInt9250 >= this.aClass197_3.anIntArray284.length) {
					this.anInt9250 -= this.aClass197_3.anInt5063;
					if (this.anInt9250 < 0 || this.aClass197_3.anIntArray284.length <= this.anInt9250) {
						this.anInt9250 = -1;
					}
				}
			}
			while (this.aClass197_3.anIntArray279[this.anInt9258] < local30) {
				Static473.method6515(arg0, this.aClass197_3, this.anInt9258);
				local30 -= this.aClass197_3.anIntArray279[this.anInt9258];
				this.anInt9258++;
				if (this.anInt9258 >= this.aClass197_3.anIntArray284.length) {
					this.anInt9258 -= this.aClass197_3.anInt5063;
					if (this.anInt9258 < 0 || this.aClass197_3.anIntArray284.length <= this.anInt9258) {
						this.aClass197_3 = null;
						continue label80;
					}
				}
				this.anInt9250 = this.anInt9258 + 1;
				if (this.anInt9250 >= this.aClass197_3.anIntArray284.length) {
					this.anInt9250 -= this.aClass197_3.anInt5063;
					if (this.anInt9250 < 0 || this.anInt9250 >= this.aClass197_3.anIntArray284.length) {
						this.anInt9250 = -1;
					}
				}
			}
			this.anInt9239 = local30;
			this.anInt9259 = Static518.anInt9331 - local30;
			return;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!r;B)V")
	public void method7531(@OriginalArg(0) Class78 arg0) {
		this.method7534(true, 262144, arg0, true);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)I")
	public int method7532(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method7534(false, 64, null, true);
		}
		return this.anInt9238;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZILclient!da;Lclient!r;IILclient!q;IZ)V")
	public void method7533(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class52 arg2, @OriginalArg(3) Class78 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class34 arg6, @OriginalArg(7) int arg7) {
		@Pc(6) Class244[] local6 = arg2.method7404();
		@Pc(9) Class212[] local9 = arg2.method7395();
		if ((this.aClass11_Sub9_8 == null || this.aClass11_Sub9_8.aBoolean511) && (local6 != null || local9 != null)) {
			@Pc(32) Class178 local32 = Static347.aClass122_4.method2770(this.anInt9246);
			if (local32.anIntArray252 != null) {
				local32 = local32.method3713(Static390.aClass353_29);
			}
			if (local32 != null) {
				this.aClass11_Sub9_8 = Static363.method5341(Static518.anInt9331, true);
			}
		}
		if (this.aClass11_Sub9_8 == null) {
			return;
		}
		arg2.method7410(arg6);
		if (arg0) {
			this.aClass11_Sub9_8.method5339(arg3, (long) Static518.anInt9331, local6, local9);
		} else {
			this.aClass11_Sub9_8.method5343((long) Static518.anInt9331);
		}
		this.aClass11_Sub9_8.method5348(this.aByte118, arg5, arg4, arg1, arg7);
	}

	@OriginalMember(owner = "client!vi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass11_Sub9_8 != null) {
			this.aClass11_Sub9_8.method5342();
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZIILclient!r;Z)Lclient!da;")
	public Class52 method7534(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class78 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) Class178 local11 = Static347.aClass122_4.method2770(this.anInt9246);
		if (local11.anIntArray252 != null) {
			local11 = local11.method3713(Static390.aClass353_29);
		}
		if (local11 == null) {
			this.method7535(arg2);
			this.anInt9244 = -1;
			this.anInt9262 = -1;
			this.anInt9255 = -1;
			return null;
		}
		if (!this.aBoolean689 && local11.anInt4643 != this.anInt9255) {
			this.aClass52_7 = null;
			this.method7537(-1);
		}
		this.method7530(this.aClass11_Sub1_3);
		if (arg0) {
			@Pc(79) boolean local79 = arg0 & this.aBoolean691 & Static86.aClass1_Sub30_Sub1_1.method5023(Static286.anInt5239) != 0;
			arg0 = local79 & (local11.anInt4643 != this.anInt9244 || this.aClass197_3 != null && Static86.aClass1_Sub30_Sub1_1.method5023(Static286.anInt5239) >= 2 && (this.anInt9262 != this.anInt9258 || (this.aClass197_3.aBoolean387 || Static503.aBoolean658) && this.anInt9250 != this.anInt9258));
		}
		if (arg3 && !arg0) {
			this.anInt9255 = local11.anInt4643;
			return null;
		}
		if (arg0) {
			Static279.method4034(this.aClass1_Sub8_Sub4_6, this.aByte119, this.aClass11_Sub1_3.anInt8902, this.aClass11_Sub1_3.anInt8906, this.aBooleanArray36);
			this.anInt9262 = -1;
			this.anInt9244 = -1;
		}
		@Pc(163) Class129 local163 = Static310.aClass129Array5[this.aByte119];
		@Pc(170) Class129 local170;
		if (this.aBoolean692) {
			local170 = Static36.aClass129Array7[0];
		} else {
			local170 = this.aByte119 < 3 ? Static310.aClass129Array5[this.aByte119 + 1] : null;
		}
		@Pc(189) Class52 local189 = null;
		if (this.aClass197_3 != null) {
			if (arg0) {
				arg1 |= 0x40000;
			}
			local189 = local11.method3703(this.anInt9245 == 11 ? this.anInt9248 + 4 : this.anInt9248, this.anInt9258, arg1, this.anInt9250, local163, local163.method6480(this.aClass11_Sub1_3.anInt8906, this.aClass11_Sub1_3.anInt8902), this.anInt9239, this.anInt9245 == 11 ? 10 : this.anInt9245, this.aClass11_Sub1_3.anInt8902, this.aClass11_Sub1_3.anInt8906, local170, this.aClass197_3, arg2);
			if (local189 == null) {
				this.anInt9254 = 0;
				this.aBooleanArray36 = null;
				this.anInt9238 = 0;
				this.aClass1_Sub8_Sub4_6 = null;
			} else {
				if (arg0) {
					if (this.aBooleanArray36 == null) {
						this.aBooleanArray36 = new boolean[4];
					}
					this.aClass1_Sub8_Sub4_6 = local189.S(this.aClass1_Sub8_Sub4_6);
					Static348.method5196(this.aClass1_Sub8_Sub4_6, this.aByte119, this.aClass11_Sub1_3.anInt8902, this.aClass11_Sub1_3.anInt8906, this.aBooleanArray36);
					this.anInt9244 = local11.anInt4643;
					this.anInt9262 = this.anInt9258;
				}
				this.anInt9254 = local189.J();
				this.anInt9238 = local189.RA();
			}
			this.aClass52_7 = null;
		} else if (this.aClass52_7 != null && (this.aClass52_7.PA() & arg1) == arg1 && local11.anInt4643 == this.anInt9255) {
			local189 = this.aClass52_7;
		} else {
			if (this.aClass52_7 != null) {
				arg1 |= this.aClass52_7.PA();
			}
			@Pc(390) Class100 local390 = local11.method3706(this.aClass11_Sub1_3.anInt8902, this.aClass11_Sub1_3.anInt8906, local170, arg0, arg1, arg2, local163, this.anInt9245 == 11 ? 10 : this.anInt9245, local163.method6480(this.aClass11_Sub1_3.anInt8906, this.aClass11_Sub1_3.anInt8902), this.anInt9245 == 11 ? this.anInt9248 + 4 : this.anInt9248);
			if (local390 == null) {
				this.aBooleanArray36 = null;
				this.anInt9254 = 0;
				this.aClass52_7 = null;
				this.anInt9238 = 0;
				this.aClass1_Sub8_Sub4_6 = null;
			} else {
				local189 = local390.aClass52_3;
				this.aClass52_7 = local390.aClass52_3;
				if (arg0) {
					this.aClass1_Sub8_Sub4_6 = local390.aClass1_Sub8_Sub4_3;
					this.aBooleanArray36 = null;
					Static348.method5196(this.aClass1_Sub8_Sub4_6, this.aByte119, this.aClass11_Sub1_3.anInt8902, this.aClass11_Sub1_3.anInt8906, null);
					this.anInt9244 = local11.anInt4643;
					this.anInt9262 = -1;
				}
				this.anInt9254 = local189.J();
				this.anInt9238 = local189.RA();
			}
		}
		this.anInt9255 = local11.anInt4643;
		return local189;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!r;I)V")
	public void method7535(@OriginalArg(0) Class78 arg0) {
		if (this.aClass1_Sub8_Sub4_6 != null) {
			Static279.method4034(this.aClass1_Sub8_Sub4_6, this.aByte119, this.aClass11_Sub1_3.anInt8902, this.aClass11_Sub1_3.anInt8906, this.aBooleanArray36);
			this.aClass1_Sub8_Sub4_6 = null;
			this.aBooleanArray36 = null;
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)I")
	public int method7536() {
		return this.anInt9254;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
	private void method7537(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class178 local18 = Static347.aClass122_4.method2770(this.anInt9246);
			@Pc(20) Class178 local20 = local18;
			if (local18.anIntArray252 != null) {
				local18 = local18.method3713(Static390.aClass353_29);
			}
			if (local18 == null) {
				return;
			}
			if (local20 == local18) {
				local20 = null;
			}
			if (local18.anIntArray256 != null) {
				if (this.aClass197_3 != null && local18.method3716(this.aClass197_3.anInt5070)) {
					return;
				}
				local7 = local18.method3702();
				if (local18.anInt4643 != this.anInt9255) {
					local9 = local18.aBoolean354;
				}
			} else if (local18.anInt4669 == -1) {
				if (local20 != null && local20.anIntArray256 != null) {
					if (this.aClass197_3 != null && local20.method3716(this.aClass197_3.anInt5070)) {
						return;
					}
					local7 = local20.method3702();
					if (local20.anInt4643 != this.anInt9255) {
						local9 = local20.aBoolean354;
					}
				} else if (local20 != null && local20.anInt4669 != -1 && this.anInt9255 != local20.anInt4643) {
					local7 = local20.anInt4669;
					local9 = local20.aBoolean354;
				}
			} else if (this.anInt9255 != local18.anInt4643) {
				local7 = local18.anInt4669;
				local9 = local18.aBoolean354;
			}
		}
		if (local7 == -1) {
			this.aClass197_3 = null;
			return;
		}
		this.aClass52_7 = null;
		if (this.aClass197_3 == null || this.aClass197_3.anInt5070 != local7) {
			this.aClass197_3 = Static223.aClass245_1.method5312(local7);
		} else if (this.aClass197_3.anInt5072 == 0) {
			return;
		}
		if (this.aClass197_3.anIntArray284 == null) {
			this.aClass197_3 = null;
			return;
		}
		if (local9) {
			this.anInt9258 = (int) ((double) this.aClass197_3.anIntArray284.length * Math.random());
			this.anInt9239 = (int) (Math.random() * (double) this.aClass197_3.anIntArray279[this.anInt9258]) + 1;
		} else {
			this.anInt9258 = 0;
			this.anInt9239 = 1;
		}
		this.anInt9250 = this.anInt9258 + 1;
		if (this.anInt9250 < 0 || this.anInt9250 >= this.aClass197_3.anIntArray284.length) {
			this.anInt9250 = -1;
		}
		this.anInt9259 = Static518.anInt9331 - this.anInt9239;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)V")
	public void method7538(@OriginalArg(0) int arg0) {
		this.aBoolean689 = true;
		this.method7537(arg0);
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)Z")
	public boolean method7540() {
		return this.aBoolean691;
	}
}
