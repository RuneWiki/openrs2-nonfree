import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class146 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
	private int anInt4276;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!lo;")
	private Class121 aClass121_2;

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Lclient!hc;")
	private Class78 aClass78_5;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Lclient!ek;")
	private Class1_Sub1_Sub8 aClass1_Sub1_Sub8_4;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
	private int anInt4288;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "Lclient!jl;")
	public Class15_Sub5 aClass15_Sub5_4;

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
	private int anInt4295;

	@OriginalMember(owner = "client!ob", name = "E", descriptor = "[Z")
	private boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
	private int anInt4300;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
	private int anInt4286 = -1;

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
	private int anInt4290 = -1;

	@OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
	private int anInt4294 = -32768;

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "Z")
	private boolean aBoolean367 = false;

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "Z")
	private boolean aBoolean368 = false;

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "B")
	private final byte aByte44;

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
	private int anInt4301;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
	private int anInt4281;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
	public final int anInt4279;

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
	public final int anInt4292;

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "B")
	private final byte aByte43;

	@OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
	public final int anInt4296;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Z")
	private final boolean aBoolean366;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!aa;Lclient!sk;IIIIIIZI)V")
	public Class146(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aByte44 = (byte) arg4;
		this.anInt4301 = arg6;
		this.anInt4281 = arg7;
		this.anInt4279 = arg1.anInt5535;
		this.anInt4292 = arg2;
		this.aBoolean367 = arg8;
		this.aByte43 = (byte) arg5;
		this.anInt4296 = arg3;
		this.aBoolean366 = arg0.method3268() && arg1.aBoolean476 && !this.aBoolean367;
		if (arg9 != -1) {
			this.aBoolean368 = true;
		}
		this.method3988(arg9);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)I")
	public int method3982() {
		return this.anInt4294;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)V")
	public void method3983(@OriginalArg(0) int arg0) {
		this.aBoolean368 = true;
		this.method3988(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)Z")
	public boolean method3985() {
		return this.aBoolean366;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILclient!hc;ZLclient!aa;IIB)V")
	public void method3986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) Class154[] local6 = arg2.method4383();
		@Pc(17) Class85[] local17 = arg2.method4376();
		if ((this.aClass15_Sub5_4 == null || this.aClass15_Sub5_4.aBoolean259) && (local6 != null || local17 != null)) {
			@Pc(33) Class188 local33 = Static126.method2405(this.anInt4279);
			if (local33.anIntArray697 != null) {
				local33 = local33.method4915();
			}
			if (local33 != null) {
				this.aClass15_Sub5_4 = new Class15_Sub5(Static215.anInt4246);
			}
		}
		if (this.aClass15_Sub5_4 == null) {
			return;
		}
		if (arg3) {
			this.aClass15_Sub5_4.method2859(arg4, (long) Static215.anInt4246, local6, local17);
		} else {
			this.aClass15_Sub5_4.method2869((long) Static215.anInt4246);
		}
		this.aClass15_Sub5_4.method2861(this.aByte44, arg5, arg1, arg6, arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
	private void method3987(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass121_2 == null) {
				if (this.aBoolean368) {
					return;
				}
				this.method3988(-1);
				if (this.aClass121_2 == null) {
					return;
				}
			}
			@Pc(32) int local32 = Static215.anInt4246 - this.anInt4295;
			if (local32 > 100 && this.aClass121_2.anInt3769 > 0) {
				@Pc(54) int local54 = this.aClass121_2.anIntArray446.length - this.aClass121_2.anInt3769;
				while (this.anInt4276 < local54 && this.aClass121_2.anIntArray444[this.anInt4276] < local32) {
					local32 -= this.aClass121_2.anIntArray444[this.anInt4276];
					this.anInt4276++;
				}
				if (local54 <= this.anInt4276) {
					@Pc(93) int local93 = 0;
					for (@Pc(95) int local95 = local54; local95 < this.aClass121_2.anIntArray446.length; local95++) {
						local93 += this.aClass121_2.anIntArray444[local95];
					}
					local32 %= local93;
				}
				this.anInt4300 = this.anInt4276 + 1;
				if (this.anInt4300 >= this.aClass121_2.anIntArray446.length) {
					this.anInt4300 -= this.aClass121_2.anInt3769;
					if (this.anInt4300 < 0 || this.anInt4300 >= this.aClass121_2.anIntArray446.length) {
						this.anInt4300 = -1;
					}
				}
			}
			while (this.aClass121_2.anIntArray444[this.anInt4276] < local32) {
				Static131.method2490(false, this.aClass121_2, this.anInt4276, arg1, arg0);
				local32 -= this.aClass121_2.anIntArray444[this.anInt4276];
				this.anInt4276++;
				if (this.anInt4276 >= this.aClass121_2.anIntArray446.length) {
					this.anInt4276 -= this.aClass121_2.anInt3769;
					if (this.anInt4276 < 0 || this.aClass121_2.anIntArray446.length <= this.anInt4276) {
						this.aClass121_2 = null;
						continue label80;
					}
				}
				this.anInt4300 = this.anInt4276 + 1;
				if (this.anInt4300 >= this.aClass121_2.anIntArray446.length) {
					this.anInt4300 -= this.aClass121_2.anInt3769;
					if (this.anInt4300 < 0 || this.aClass121_2.anIntArray446.length <= this.anInt4300) {
						this.anInt4300 = -1;
					}
				}
			}
			this.anInt4295 = Static215.anInt4246 - local32;
			this.anInt4288 = local32;
			return;
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(IB)V")
	private void method3988(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(17) Class188 local17 = Static126.method2405(this.anInt4279);
			@Pc(19) Class188 local19 = local17;
			if (local17.anIntArray697 != null) {
				local17 = local17.method4915();
			}
			if (local17 == null) {
				return;
			}
			if (local17 == local19) {
				local19 = null;
			}
			if (local17.anIntArray698 != null) {
				if (this.aClass121_2 != null && local17.method4907(this.aClass121_2.anInt3771)) {
					return;
				}
				local7 = local17.method4911();
				if (this.anInt4286 != local17.anInt5535) {
					local9 = local17.aBoolean475;
				}
			} else if (local17.anInt5542 == -1) {
				if (local19 != null && local19.anIntArray698 != null) {
					if (this.aClass121_2 != null && local19.method4907(this.aClass121_2.anInt3771)) {
						return;
					}
					local7 = local19.method4911();
					if (this.anInt4286 != local19.anInt5535) {
						local9 = local19.aBoolean475;
					}
				} else if (local19 != null && local19.anInt5542 != -1 && local19.anInt5535 != this.anInt4286) {
					local7 = local19.anInt5542;
					local9 = local19.aBoolean475;
				}
			} else if (this.anInt4286 != local17.anInt5535) {
				local7 = local17.anInt5542;
				local9 = local17.aBoolean475;
			}
		}
		if (local7 == -1) {
			this.aClass121_2 = null;
			return;
		}
		this.aClass78_5 = null;
		if (this.aClass121_2 == null || this.aClass121_2.anInt3771 != local7) {
			this.aClass121_2 = Static133.method2520(local7);
		} else if (this.aClass121_2.anInt3780 == 0) {
			return;
		}
		if (this.aClass121_2.anIntArray446 == null) {
			this.aClass121_2 = null;
			return;
		}
		if (local9) {
			this.anInt4276 = (int) (Math.random() * (double) this.aClass121_2.anIntArray446.length);
			this.anInt4288 = (int) (Math.random() * (double) this.aClass121_2.anIntArray444[this.anInt4276]) + 1;
		} else {
			this.anInt4288 = 1;
			this.anInt4276 = 0;
		}
		this.anInt4300 = this.anInt4276 + 1;
		if (this.anInt4300 < 0 || this.aClass121_2.anIntArray446.length <= this.anInt4300) {
			this.anInt4300 = -1;
		}
		this.anInt4295 = Static215.anInt4246 - this.anInt4288;
	}

	@OriginalMember(owner = "client!ob", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass15_Sub5_4 != null) {
			this.aClass15_Sub5_4.method2858();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!aa;IIZZIZ)Lclient!hc;")
	public Class78 method3989(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class188 local10 = Static126.method2405(this.anInt4279);
		if (local10.anIntArray697 != null) {
			local10 = local10.method4915();
		}
		if (local10 == null) {
			this.method3995(arg0);
			this.anInt4286 = -1;
			this.anInt4290 = this.anInt4276;
			return null;
		}
		if (!this.aBoolean368 && this.anInt4286 != local10.anInt5535) {
			this.aClass78_5 = null;
			this.method3988(-1);
		}
		this.method3987(arg2, arg1);
		@Pc(67) boolean local67 = arg4 & this.aBoolean366 & Static158.anInt3147 != 0;
		@Pc(110) boolean local110 = local67 & (local10.anInt5535 != this.anInt4286 || (this.anInt4276 != this.anInt4290 || this.aClass121_2 != null && (this.aClass121_2.aBoolean320 || Static334.aBoolean559) && this.anInt4276 != this.anInt4300) && Static158.anInt3147 >= 2);
		if (arg3 && !local110) {
			this.anInt4290 = this.anInt4276;
			this.anInt4286 = local10.anInt5535;
			return null;
		}
		if (local110) {
			Static120.method2164(this.aClass1_Sub1_Sub8_4, this.aByte43, this.anInt4301, this.anInt4281, this.aBooleanArray23);
		}
		@Pc(149) Class41 local149 = Static7.aClass41Array1[this.aByte43];
		@Pc(167) Class41 local167;
		if (this.aBoolean367) {
			local167 = Static288.aClass41Array5[0];
		} else {
			local167 = this.aByte43 >= 3 ? null : Static7.aClass41Array1[this.aByte43 + 1];
		}
		@Pc(175) Class78 local175 = null;
		if (this.aClass121_2 != null) {
			if (local110) {
				arg5 |= 0x20000;
			}
			local175 = local10.method4902(local149.method5433(this.anInt4301, this.anInt4281), this.anInt4288, this.anInt4301, arg0, this.anInt4276, local149, arg5, this.anInt4292 == 11 ? this.anInt4296 + 4 : this.anInt4296, this.anInt4292 == 11 ? 10 : this.anInt4292, this.anInt4281, this.aClass121_2, this.anInt4300, local167);
			if (local175 == null) {
				this.anInt4294 = 0;
				this.aClass1_Sub1_Sub8_4 = null;
				this.aBooleanArray23 = null;
			} else {
				if (local110) {
					if (this.aBooleanArray23 == null) {
						this.aBooleanArray23 = new boolean[4];
					}
					this.aClass1_Sub1_Sub8_4 = local175.method4403(this.aClass1_Sub1_Sub8_4);
					Static151.method3583(this.aClass1_Sub1_Sub8_4, this.aByte43, arg2, arg1, this.aBooleanArray23);
				}
				this.anInt4294 = local175.method4388();
			}
			this.aClass78_5 = null;
		} else if (this.aClass78_5 != null && arg5 == (arg5 & this.aClass78_5.method4398()) && this.anInt4286 == local10.anInt5535) {
			local175 = this.aClass78_5;
		} else {
			if (this.aClass78_5 != null) {
				arg5 |= this.aClass78_5.method4398();
			}
			@Pc(346) Class212 local346 = local10.method4904(local149.method5433(this.anInt4301, this.anInt4281), local149, this.anInt4292 == 11 ? 10 : this.anInt4292, arg0, this.anInt4292 == 11 ? this.anInt4296 + 4 : this.anInt4296, local167, this.anInt4301, this.anInt4281, local110, arg5);
			if (local346 == null) {
				this.aClass1_Sub1_Sub8_4 = null;
				this.aBooleanArray23 = null;
				this.aClass78_5 = null;
				this.anInt4294 = 0;
			} else {
				local175 = local346.aClass78_6;
				this.aClass78_5 = local346.aClass78_6;
				if (local110) {
					this.aClass1_Sub1_Sub8_4 = local346.aClass1_Sub1_Sub8_5;
					this.aBooleanArray23 = null;
					Static151.method3583(this.aClass1_Sub1_Sub8_4, this.aByte43, arg2, arg1, null);
				}
				this.anInt4294 = local175.method4388();
			}
		}
		this.anInt4286 = local10.anInt5535;
		this.anInt4281 = arg1;
		this.anInt4301 = arg2;
		this.anInt4290 = this.anInt4276;
		return local175;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!aa;B)V")
	public void method3993(@OriginalArg(0) Class2 arg0) {
		this.method3989(arg0, this.anInt4281, this.anInt4301, true, true, 131072);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!aa;I)V")
	public void method3995(@OriginalArg(0) Class2 arg0) {
		if (this.aClass1_Sub1_Sub8_4 != null) {
			Static120.method2164(this.aClass1_Sub1_Sub8_4, this.aByte43, this.anInt4301, this.anInt4281, this.aBooleanArray23);
			this.aBooleanArray23 = null;
			this.aClass1_Sub1_Sub8_4 = null;
		}
	}
}
