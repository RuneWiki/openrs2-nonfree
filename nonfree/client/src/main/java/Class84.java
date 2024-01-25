import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class84 {

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
	private int anInt2332;

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "Lclient!dh;")
	private Class2_Sub10_Sub3 aClass2_Sub10_Sub3_4;

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
	private int anInt2338;

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
	private int anInt2342;

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "Lclient!an;")
	public Class10_Sub1 aClass10_Sub1_3;

	@OriginalMember(owner = "client!gk", name = "x", descriptor = "Lclient!n;")
	private Class66 aClass66_4;

	@OriginalMember(owner = "client!gk", name = "B", descriptor = "[Z")
	private boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!gk", name = "H", descriptor = "I")
	private int anInt2353;

	@OriginalMember(owner = "client!gk", name = "I", descriptor = "Lclient!qp;")
	private Class202 aClass202_1;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
	private int anInt2331 = -32768;

	@OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
	private int anInt2345 = -1;

	@OriginalMember(owner = "client!gk", name = "C", descriptor = "Z")
	private boolean aBoolean183 = false;

	@OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
	private int anInt2348 = -1;

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
	private int anInt2344;

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
	public final int anInt2340;

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
	private int anInt2333;

	@OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
	public final int anInt2350;

	@OriginalMember(owner = "client!gk", name = "D", descriptor = "I")
	public final int anInt2349;

	@OriginalMember(owner = "client!gk", name = "s", descriptor = "B")
	private final byte aByte22;

	@OriginalMember(owner = "client!gk", name = "u", descriptor = "B")
	private final byte aByte23;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "Z")
	private final boolean aBoolean181;

	static {
		new Class32(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!vc;Lclient!nm;IIIIIIZI)V")
	public Class84(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt2344 = arg6;
		this.anInt2340 = arg1.anInt4131;
		this.anInt2333 = arg7;
		this.anInt2350 = arg2;
		this.aBoolean183 = arg8;
		this.anInt2349 = arg3;
		this.aByte22 = (byte) arg5;
		this.aByte23 = (byte) arg4;
		this.aBoolean181 = arg0.method2036() && arg1.aBoolean319 && !this.aBoolean183;
		if (arg9 != -1) {
			this.aBoolean182 = true;
		}
		this.method2286(arg9);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!vc;I)V")
	public void method2280(@OriginalArg(0) Class63 arg0) {
		if (this.aClass2_Sub10_Sub3_4 != null) {
			Static43.method733(this.aClass2_Sub10_Sub3_4, this.aByte22, this.anInt2344, this.anInt2333, this.aBooleanArray16);
			this.aBooleanArray16 = null;
			this.aClass2_Sub10_Sub3_4 = null;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Z")
	public boolean method2281() {
		return this.aBoolean181;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)V")
	public void method2282(@OriginalArg(0) int arg0) {
		this.aBoolean182 = true;
		this.method2286(arg0);
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(Lclient!vc;I)V")
	public void method2283(@OriginalArg(0) Class63 arg0) {
		this.method2290(arg0, true, 131072, this.anInt2333, this.anInt2344, true);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)I")
	public int method2284() {
		return this.anInt2331;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!vc;IIIIZLclient!n;B)V")
	public void method2285(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class66 arg6) {
		@Pc(6) Class176[] local6 = arg6.method5123();
		@Pc(13) Class145[] local13 = arg6.method5156();
		if ((this.aClass10_Sub1_3 == null || this.aClass10_Sub1_3.aBoolean27) && (local6 != null || local13 != null)) {
			@Pc(30) Class172 local30 = Static221.aClass118_6.method2858(this.anInt2340);
			if (local30.anIntArray801 != null) {
				local30 = local30.method3775(Static321.aClass211_1);
			}
			if (local30 != null) {
				this.aClass10_Sub1_3 = new Class10_Sub1(Static253.anInt4469);
			}
		}
		if (this.aClass10_Sub1_3 == null) {
			return;
		}
		if (arg5) {
			this.aClass10_Sub1_3.method224(arg0, (long) Static253.anInt4469, local6, local13);
		} else {
			this.aClass10_Sub1_3.method222((long) Static253.anInt4469);
		}
		this.aClass10_Sub1_3.method228(this.aByte23, arg3, arg2, arg1, arg4);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V")
	private void method2286(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(21) Class172 local21 = Static221.aClass118_6.method2858(this.anInt2340);
			@Pc(23) Class172 local23 = local21;
			if (local21.anIntArray801 != null) {
				local21 = local21.method3775(Static321.aClass211_1);
			}
			if (local21 == null) {
				return;
			}
			if (local23 == local21) {
				local23 = null;
			}
			if (local21.anIntArray803 != null) {
				if (this.aClass202_1 != null && local21.method3776(this.aClass202_1.anInt4931)) {
					return;
				}
				local7 = local21.method3786();
				if (this.anInt2348 != local21.anInt4131) {
					local9 = local21.aBoolean324;
				}
			} else if (local21.anInt4120 == -1) {
				if (local23 != null && local23.anIntArray803 != null) {
					if (this.aClass202_1 != null && local23.method3776(this.aClass202_1.anInt4931)) {
						return;
					}
					local7 = local23.method3786();
					if (this.anInt2348 != local23.anInt4131) {
						local9 = local23.aBoolean324;
					}
				} else if (local23 != null && local23.anInt4120 != -1 && local23.anInt4131 != this.anInt2348) {
					local7 = local23.anInt4120;
					local9 = local23.aBoolean324;
				}
			} else if (local21.anInt4131 != this.anInt2348) {
				local9 = local21.aBoolean324;
				local7 = local21.anInt4120;
			}
		}
		if (local7 == -1) {
			this.aClass202_1 = null;
			return;
		}
		this.aClass66_4 = null;
		if (this.aClass202_1 == null || local7 != this.aClass202_1.anInt4931) {
			this.aClass202_1 = Static36.aClass236_1.method5396(local7);
		} else if (this.aClass202_1.anInt4932 == 0) {
			return;
		}
		if (this.aClass202_1.anIntArray974 == null) {
			this.aClass202_1 = null;
			return;
		}
		if (local9) {
			this.anInt2338 = (int) ((double) this.aClass202_1.anIntArray974.length * Math.random());
			this.anInt2353 = (int) ((double) this.aClass202_1.anIntArray973[this.anInt2338] * Math.random()) + 1;
		} else {
			this.anInt2338 = 0;
			this.anInt2353 = 1;
		}
		this.anInt2332 = this.anInt2338 + 1;
		if (this.anInt2332 < 0 || this.aClass202_1.anIntArray974.length <= this.anInt2332) {
			this.anInt2332 = -1;
		}
		this.anInt2342 = Static253.anInt4469 - this.anInt2353;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
	private void method2287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass202_1 == null) {
				if (this.aBoolean182) {
					return;
				}
				this.method2286(-1);
				if (this.aClass202_1 == null) {
					return;
				}
			}
			@Pc(33) int local33 = Static253.anInt4469 - this.anInt2342;
			if (local33 > 100 && this.aClass202_1.anInt4942 > 0) {
				@Pc(53) int local53 = this.aClass202_1.anIntArray974.length - this.aClass202_1.anInt4942;
				while (local53 > this.anInt2338 && local33 > this.aClass202_1.anIntArray973[this.anInt2338]) {
					local33 -= this.aClass202_1.anIntArray973[this.anInt2338];
					this.anInt2338++;
				}
				if (local53 <= this.anInt2338) {
					@Pc(92) int local92 = 0;
					for (@Pc(94) int local94 = local53; local94 < this.aClass202_1.anIntArray974.length; local94++) {
						local92 += this.aClass202_1.anIntArray973[local94];
					}
					local33 %= local92;
				}
				this.anInt2332 = this.anInt2338 + 1;
				if (this.aClass202_1.anIntArray974.length <= this.anInt2332) {
					this.anInt2332 -= this.aClass202_1.anInt4942;
					if (this.anInt2332 < 0 || this.aClass202_1.anIntArray974.length <= this.anInt2332) {
						this.anInt2332 = -1;
					}
				}
			}
			while (this.aClass202_1.anIntArray973[this.anInt2338] < local33) {
				Static169.method2965(this.anInt2338, false, this.aByte23, arg1, this.aClass202_1, arg0);
				local33 -= this.aClass202_1.anIntArray973[this.anInt2338];
				this.anInt2338++;
				if (this.aClass202_1.anIntArray974.length <= this.anInt2338) {
					this.anInt2338 -= this.aClass202_1.anInt4942;
					if (this.anInt2338 < 0 || this.aClass202_1.anIntArray974.length <= this.anInt2338) {
						this.aClass202_1 = null;
						continue label80;
					}
				}
				this.anInt2332 = this.anInt2338 + 1;
				if (this.anInt2332 >= this.aClass202_1.anIntArray974.length) {
					this.anInt2332 -= this.aClass202_1.anInt4942;
					if (this.anInt2332 < 0 || this.aClass202_1.anIntArray974.length <= this.anInt2332) {
						this.anInt2332 = -1;
					}
				}
			}
			this.anInt2342 = Static253.anInt4469 - local33;
			this.anInt2353 = local33;
			return;
		}
	}

	@OriginalMember(owner = "client!gk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass10_Sub1_3 != null) {
			this.aClass10_Sub1_3.method226();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILclient!vc;ZIIIZ)Lclient!n;")
	public Class66 method2290(@OriginalArg(1) Class63 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(11) Class172 local11 = Static221.aClass118_6.method2858(this.anInt2340);
		if (local11.anIntArray801 != null) {
			local11 = local11.method3775(Static321.aClass211_1);
		}
		if (local11 == null) {
			this.method2280(arg0);
			this.anInt2345 = this.anInt2338;
			this.anInt2348 = -1;
			return null;
		}
		if (!this.aBoolean182 && local11.anInt4131 != this.anInt2348) {
			this.aClass66_4 = null;
			this.method2286(-1);
		}
		this.method2287(arg3, arg4);
		@Pc(67) boolean local67 = arg1 & this.aBoolean181 & Static202.anInt3721 != 0;
		@Pc(102) boolean local102 = local67 & (local11.anInt4131 != this.anInt2348 || (this.anInt2338 != this.anInt2345 || this.aClass202_1 != null && (this.aClass202_1.aBoolean374 || Static298.aBoolean384) && this.anInt2338 != this.anInt2332) && Static202.anInt3721 >= 2);
		if (arg5 && !local102) {
			this.anInt2348 = local11.anInt4131;
			this.anInt2345 = this.anInt2338;
			return null;
		}
		if (local102) {
			Static43.method733(this.aClass2_Sub10_Sub3_4, this.aByte22, this.anInt2344, this.anInt2333, this.aBooleanArray16);
		}
		@Pc(134) Class107 local134 = Static350.aClass107Array4[this.aByte22];
		@Pc(152) Class107 local152;
		if (this.aBoolean183) {
			local152 = Static90.aClass107Array1[0];
		} else {
			local152 = this.aByte22 < 3 ? Static350.aClass107Array4[this.aByte22 + 1] : null;
		}
		@Pc(160) Class66 local160 = null;
		if (this.aClass202_1 != null) {
			if (local102) {
				arg2 |= 0x20000;
			}
			local160 = local11.method3777(arg2, arg0, this.anInt2333, this.anInt2353, local134, this.anInt2350 == 11 ? this.anInt2349 + 4 : this.anInt2349, this.anInt2344, this.anInt2332, this.aClass202_1, this.anInt2350 == 11 ? 10 : this.anInt2350, local152, local134.method4673(this.anInt2344, this.anInt2333), this.anInt2338);
			if (local160 == null) {
				this.anInt2331 = 0;
				this.aBooleanArray16 = null;
				this.aClass2_Sub10_Sub3_4 = null;
			} else {
				if (local102) {
					if (this.aBooleanArray16 == null) {
						this.aBooleanArray16 = new boolean[4];
					}
					this.aClass2_Sub10_Sub3_4 = local160.method5141(this.aClass2_Sub10_Sub3_4);
					Static258.method4008(this.aClass2_Sub10_Sub3_4, this.aByte22, arg4, arg3, this.aBooleanArray16);
				}
				this.anInt2331 = local160.method5140();
			}
			this.aClass66_4 = null;
		} else if (this.aClass66_4 != null && arg2 == (this.aClass66_4.method5127() & arg2) && local11.anInt4131 == this.anInt2348) {
			local160 = this.aClass66_4;
		} else {
			if (this.aClass66_4 != null) {
				arg2 |= this.aClass66_4.method5127();
			}
			@Pc(237) Class37 local237 = local11.method3787(this.anInt2333, local152, local102, this.anInt2350 == 11 ? this.anInt2349 + 4 : this.anInt2349, arg2, arg0, this.anInt2344, this.anInt2350 == 11 ? 10 : this.anInt2350, local134.method4673(this.anInt2344, this.anInt2333), local134);
			if (local237 == null) {
				this.aClass2_Sub10_Sub3_4 = null;
				this.aBooleanArray16 = null;
				this.anInt2331 = 0;
				this.aClass66_4 = null;
			} else {
				local160 = local237.aClass66_2;
				this.aClass66_4 = local237.aClass66_2;
				if (local102) {
					this.aBooleanArray16 = null;
					this.aClass2_Sub10_Sub3_4 = local237.aClass2_Sub10_Sub3_2;
					Static258.method4008(this.aClass2_Sub10_Sub3_4, this.aByte22, arg4, arg3, null);
				}
				this.anInt2331 = local160.method5140();
			}
		}
		this.anInt2345 = this.anInt2338;
		this.anInt2333 = arg3;
		this.anInt2344 = arg4;
		this.anInt2348 = local11.anInt4131;
		return local160;
	}
}
