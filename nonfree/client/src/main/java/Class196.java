import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class196 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Lclient!cc;")
	public Class41_Sub1 aClass41_Sub1_7;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
	private int anInt5724;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
	private int anInt5727;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	private int anInt5728;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "Lclient!sq;")
	private Class235 aClass235_3;

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "Lclient!i;")
	private Class1_Sub1_Sub10 aClass1_Sub1_Sub10_4;

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "Lclient!e;")
	private Class17 aClass17_4;

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "[Z")
	private boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
	private int anInt5741;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "Z")
	private boolean aBoolean365 = false;

	@OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
	private int anInt5743 = -32768;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "Z")
	private boolean aBoolean367 = false;

	@OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
	private int anInt5740 = -1;

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
	private int anInt5736 = -1;

	@OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
	private int anInt5738;

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
	public final int anInt5734;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "B")
	private final byte aByte79;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "B")
	private final byte aByte78;

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
	public final int anInt5733;

	@OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
	public final int anInt5744;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	private int anInt5731;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "Z")
	private final boolean aBoolean366;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!za;Lclient!p;IIIIIIZI)V")
	public Class196(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt5738 = arg6;
		this.anInt5734 = arg1.anInt5642;
		this.aBoolean365 = arg8;
		this.aByte79 = (byte) arg5;
		this.aByte78 = (byte) arg4;
		this.anInt5733 = arg3;
		this.anInt5744 = arg2;
		this.anInt5731 = arg7;
		this.aBoolean366 = arg0.method5930() && arg1.aBoolean359 && !this.aBoolean365;
		if (arg9 != -1) {
			this.aBoolean367 = true;
		}
		this.method4403(arg9);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!za;IILclient!e;IIIZ)V")
	public void method4398(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(6) Class94[] local6 = arg3.method6201();
		@Pc(9) Class114[] local9 = arg3.method6205();
		if ((this.aClass41_Sub1_7 == null || this.aClass41_Sub1_7.aBoolean73) && (local6 != null || local9 != null)) {
			@Pc(26) Class192 local26 = Static455.aClass161_4.method3628(this.anInt5734);
			if (local26.anIntArray532 != null) {
				local26 = local26.method4369(Static366.aClass190_1);
			}
			if (local26 != null) {
				this.aClass41_Sub1_7 = new Class41_Sub1(Static187.anInt3975);
			}
		}
		if (this.aClass41_Sub1_7 == null) {
			return;
		}
		if (arg6) {
			this.aClass41_Sub1_7.method871(arg0, (long) Static187.anInt3975, local6, local9);
		} else {
			this.aClass41_Sub1_7.method878((long) Static187.anInt3975);
		}
		this.aClass41_Sub1_7.method882(this.aByte78, arg2, arg4, arg5, arg1);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
	public void method4399(@OriginalArg(0) int arg0) {
		this.aBoolean367 = true;
		this.method4403(arg0);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBLclient!za;IZIZ)Lclient!e;")
	public Class17 method4400(@OriginalArg(0) int arg0, @OriginalArg(2) Class106 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(18) Class192 local18 = Static455.aClass161_4.method3628(this.anInt5734);
		if (local18.anIntArray532 != null) {
			local18 = local18.method4369(Static366.aClass190_1);
		}
		if (local18 == null) {
			this.method4404(arg1);
			this.anInt5736 = -1;
			this.anInt5740 = this.anInt5741;
			return null;
		}
		if (!this.aBoolean367 && local18.anInt5642 != this.anInt5736) {
			this.aClass17_4 = null;
			this.method4403(-1);
		}
		this.method4401(arg4, arg0);
		@Pc(79) boolean local79 = arg3 & this.aBoolean366 & Static12.aClass34_Sub1_1.method5462(Static262.anInt2805) != 0;
		@Pc(121) boolean local121 = local79 & (this.anInt5736 != local18.anInt5642 || (this.anInt5740 != this.anInt5741 || this.aClass235_3 != null && (this.aClass235_3.aBoolean430 || Static261.aBoolean314) && this.anInt5741 != this.anInt5724) && Static12.aClass34_Sub1_1.method5462(Static262.anInt2805) >= 2);
		if (arg5 && !local121) {
			this.anInt5740 = this.anInt5741;
			this.anInt5736 = local18.anInt5642;
			return null;
		}
		if (local121) {
			Static17.method329(this.aClass1_Sub1_Sub10_4, this.aByte79, this.anInt5738, this.anInt5731, this.aBooleanArray20);
		}
		@Pc(153) Class96 local153 = Static396.aClass96Array5[this.aByte79];
		@Pc(160) Class96 local160;
		if (this.aBoolean365) {
			local160 = Static262.aClass96Array3[0];
		} else {
			local160 = this.aByte79 >= 3 ? null : Static396.aClass96Array5[this.aByte79 + 1];
		}
		@Pc(177) Class17 local177 = null;
		if (this.aClass235_3 != null) {
			if (local121) {
				arg2 |= 0x40000;
			}
			local177 = local18.method4372(this.anInt5741, this.anInt5744 == 11 ? this.anInt5733 + 4 : this.anInt5733, this.anInt5727, local160, local153, this.anInt5724, this.aClass235_3, local153.ca(this.anInt5738, this.anInt5731), this.anInt5731, this.anInt5738, arg1, arg2, this.anInt5744 == 11 ? 10 : this.anInt5744);
			if (local177 == null) {
				this.anInt5743 = 0;
				this.aClass1_Sub1_Sub10_4 = null;
				this.aBooleanArray20 = null;
			} else {
				if (local121) {
					if (this.aBooleanArray20 == null) {
						this.aBooleanArray20 = new boolean[4];
					}
					this.aClass1_Sub1_Sub10_4 = local177.EA(this.aClass1_Sub1_Sub10_4);
					Static124.method2026(this.aClass1_Sub1_Sub10_4, this.aByte79, arg0, arg4, this.aBooleanArray20);
				}
				this.anInt5743 = local177.B();
			}
			this.aClass17_4 = null;
		} else if (this.aClass17_4 != null && (arg2 & this.aClass17_4.RA()) == arg2 && this.anInt5736 == local18.anInt5642) {
			local177 = this.aClass17_4;
		} else {
			if (this.aClass17_4 != null) {
				arg2 |= this.aClass17_4.RA();
			}
			@Pc(250) Class132 local250 = local18.method4371(arg1, this.anInt5738, local153, this.anInt5731, local121, arg2, this.anInt5744 == 11 ? 10 : this.anInt5744, local153.ca(this.anInt5738, this.anInt5731), local160, this.anInt5744 == 11 ? this.anInt5733 + 4 : this.anInt5733);
			if (local250 == null) {
				this.anInt5743 = 0;
				this.aBooleanArray20 = null;
				this.aClass1_Sub1_Sub10_4 = null;
				this.aClass17_4 = null;
			} else {
				local177 = local250.aClass17_1;
				this.aClass17_4 = local250.aClass17_1;
				if (local121) {
					this.aClass1_Sub1_Sub10_4 = local250.aClass1_Sub1_Sub10_1;
					this.aBooleanArray20 = null;
					Static124.method2026(this.aClass1_Sub1_Sub10_4, this.aByte79, arg0, arg4, null);
				}
				this.anInt5743 = local177.B();
			}
		}
		this.anInt5738 = arg0;
		this.anInt5736 = local18.anInt5642;
		this.anInt5731 = arg4;
		this.anInt5740 = this.anInt5741;
		return local177;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBI)V")
	private void method4401(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass235_3 == null) {
				if (this.aBoolean367) {
					return;
				}
				this.method4403(-1);
				if (this.aClass235_3 == null) {
					return;
				}
			}
			@Pc(31) int local31 = Static187.anInt3975 - this.anInt5728;
			if (local31 > 100 && this.aClass235_3.anInt6857 > 0) {
				@Pc(48) int local48 = this.aClass235_3.anIntArray633.length - this.aClass235_3.anInt6857;
				while (local48 > this.anInt5741 && this.aClass235_3.anIntArray632[this.anInt5741] < local31) {
					local31 -= this.aClass235_3.anIntArray632[this.anInt5741];
					this.anInt5741++;
				}
				if (local48 <= this.anInt5741) {
					@Pc(87) int local87 = 0;
					for (@Pc(89) int local89 = local48; local89 < this.aClass235_3.anIntArray633.length; local89++) {
						local87 += this.aClass235_3.anIntArray632[local89];
					}
					local31 %= local87;
				}
				this.anInt5724 = this.anInt5741 + 1;
				if (this.anInt5724 >= this.aClass235_3.anIntArray633.length) {
					this.anInt5724 -= this.aClass235_3.anInt6857;
					if (this.anInt5724 < 0 || this.aClass235_3.anIntArray633.length <= this.anInt5724) {
						this.anInt5724 = -1;
					}
				}
			}
			while (local31 > this.aClass235_3.anIntArray632[this.anInt5741]) {
				Static290.method4258(arg0, this.anInt5741, this.aByte78, arg1, false, this.aClass235_3);
				local31 -= this.aClass235_3.anIntArray632[this.anInt5741];
				this.anInt5741++;
				if (this.anInt5741 >= this.aClass235_3.anIntArray633.length) {
					this.anInt5741 -= this.aClass235_3.anInt6857;
					if (this.anInt5741 < 0 || this.anInt5741 >= this.aClass235_3.anIntArray633.length) {
						this.aClass235_3 = null;
						continue label80;
					}
				}
				this.anInt5724 = this.anInt5741 + 1;
				if (this.anInt5724 >= this.aClass235_3.anIntArray633.length) {
					this.anInt5724 -= this.aClass235_3.anInt6857;
					if (this.anInt5724 < 0 || this.anInt5724 >= this.aClass235_3.anIntArray633.length) {
						this.anInt5724 = -1;
					}
				}
			}
			this.anInt5727 = local31;
			this.anInt5728 = Static187.anInt3975 - local31;
			return;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!za;)V")
	public void method4402(@OriginalArg(1) Class106 arg0) {
		this.method4400(this.anInt5738, arg0, 262144, true, this.anInt5731, true);
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)V")
	private void method4403(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0;
		@Pc(7) boolean local7 = false;
		if (arg0 == -1) {
			@Pc(16) Class192 local16 = Static455.aClass161_4.method3628(this.anInt5734);
			@Pc(18) Class192 local18 = local16;
			if (local16.anIntArray532 != null) {
				local16 = local16.method4369(Static366.aClass190_1);
			}
			if (local16 == null) {
				return;
			}
			if (local18 == local16) {
				local18 = null;
			}
			if (local16.anIntArray533 != null) {
				if (this.aClass235_3 != null && local16.method4363(this.aClass235_3.anInt6847)) {
					return;
				}
				local5 = local16.method4353();
				if (local16.anInt5642 != this.anInt5736) {
					local7 = local16.aBoolean355;
				}
			} else if (local16.anInt5688 == -1) {
				if (local18 != null && local18.anIntArray533 != null) {
					if (this.aClass235_3 != null && local18.method4363(this.aClass235_3.anInt6847)) {
						return;
					}
					local5 = local18.method4353();
					if (this.anInt5736 != local18.anInt5642) {
						local7 = local18.aBoolean355;
					}
				} else if (local18 != null && local18.anInt5688 != -1 && local18.anInt5642 != this.anInt5736) {
					local5 = local18.anInt5688;
					local7 = local18.aBoolean355;
				}
			} else if (local16.anInt5642 != this.anInt5736) {
				local7 = local16.aBoolean355;
				local5 = local16.anInt5688;
			}
		}
		if (local5 == -1) {
			this.aClass235_3 = null;
			return;
		}
		this.aClass17_4 = null;
		if (this.aClass235_3 == null || local5 != this.aClass235_3.anInt6847) {
			this.aClass235_3 = Static107.aClass239_1.method5420(local5);
		} else if (this.aClass235_3.anInt6852 == 0) {
			return;
		}
		if (this.aClass235_3.anIntArray633 == null) {
			this.aClass235_3 = null;
			return;
		}
		if (local7) {
			this.anInt5741 = (int) ((double) this.aClass235_3.anIntArray633.length * Math.random());
			this.anInt5727 = (int) (Math.random() * (double) this.aClass235_3.anIntArray632[this.anInt5741]) + 1;
		} else {
			this.anInt5741 = 0;
			this.anInt5727 = 1;
		}
		this.anInt5724 = this.anInt5741 + 1;
		if (this.anInt5724 < 0 || this.anInt5724 >= this.aClass235_3.anIntArray633.length) {
			this.anInt5724 = -1;
		}
		this.anInt5728 = Static187.anInt3975 - this.anInt5727;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!za;B)V")
	public void method4404(@OriginalArg(0) Class106 arg0) {
		if (this.aClass1_Sub1_Sub10_4 != null) {
			Static17.method329(this.aClass1_Sub1_Sub10_4, this.aByte79, this.anInt5738, this.anInt5731, this.aBooleanArray20);
			this.aClass1_Sub1_Sub10_4 = null;
			this.aBooleanArray20 = null;
		}
	}

	@OriginalMember(owner = "client!pe", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass41_Sub1_7 != null) {
			this.aClass41_Sub1_7.method873();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Z")
	public boolean method4405() {
		return this.aBoolean366;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)I")
	public int method4406() {
		return this.anInt5743;
	}
}
