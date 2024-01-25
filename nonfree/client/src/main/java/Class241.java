import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class241 {

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
	private int anInt7347;

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "Lclient!je;")
	private Class178 aClass178_3;

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "Lclient!pe;")
	private Class278 aClass278_1;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
	private int anInt7352;

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "[Z")
	private boolean[] aBooleanArray41;

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
	private int anInt7356;

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
	private int anInt7358;

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "Lclient!r;")
	private Class2_Sub1_Sub11 aClass2_Sub1_Sub11_4;

	@OriginalMember(owner = "client!nb", name = "N", descriptor = "Lclient!ka;")
	private Class14 aClass14_4;

	@OriginalMember(owner = "client!nb", name = "O", descriptor = "Lclient!eea;")
	public Class15_Sub5 aClass15_Sub5_6;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Z")
	private boolean aBoolean550 = false;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
	private int anInt7343 = -1;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	private int anInt7341 = -1;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
	private int anInt7346 = 0;

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
	private int anInt7355 = 0;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Z")
	private boolean aBoolean549 = false;

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
	private int anInt7359 = -1;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
	public final int anInt7342;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "Lclient!nfa;")
	private final Class15_Sub3 aClass15_Sub3_19;

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
	public final int anInt7362;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "B")
	private final byte aByte101;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "B")
	private final byte aByte100;

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
	public final int anInt7351;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Z")
	private final boolean aBoolean548;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!ha;Lclient!sea;IIIILclient!nfa;ZI)V")
	public Class241(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class331 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class15_Sub3 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt7342 = arg3;
		this.aClass15_Sub3_19 = arg6;
		this.aBoolean550 = arg7;
		this.anInt7362 = arg2;
		this.aByte101 = (byte) arg5;
		this.aByte100 = (byte) arg4;
		this.anInt7351 = arg1.anInt9434;
		this.aBoolean548 = arg0.method8134() && arg1.aBoolean698 && !this.aBoolean550;
		if (arg8 != -1) {
			this.aBoolean549 = true;
		}
		this.method6543(arg8);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
	public void method6535(@OriginalArg(0) int arg0) {
		this.aBoolean549 = true;
		this.method6543(arg0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)I")
	public int method6536() {
		return this.anInt7355;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBILclient!dm;Lclient!ka;IZLclient!ha;I)V")
	public void method6537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class76 arg2, @OriginalArg(4) Class14 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class101 arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class283[] local6 = arg3.method8630();
		@Pc(13) Class123[] local13 = arg3.method8634();
		if ((this.aClass15_Sub5_6 == null || this.aClass15_Sub5_6.aBoolean183) && (local6 != null || local13 != null)) {
			@Pc(30) Class331 local30 = Static251.aClass328_1.method8261(this.anInt7351);
			if (local30.anIntArray486 != null) {
				local30 = local30.method8304(Static113.aClass282_1);
			}
			if (local30 != null) {
				this.aClass15_Sub5_6 = Static128.method2303(Static62.anInt1184, true);
			}
		}
		if (this.aClass15_Sub5_6 == null) {
			return;
		}
		arg3.method8632(arg2);
		if (arg5) {
			this.aClass15_Sub5_6.method2301(arg6, (long) Static62.anInt1184, local6, local13);
		} else {
			this.aClass15_Sub5_6.method2297((long) Static62.anInt1184);
		}
		this.aClass15_Sub5_6.method2309(this.aByte100, arg1, arg7, arg4, arg0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!nfa;)V")
	private void method6539(@OriginalArg(1) Class15_Sub3 arg0) {
		label80: while (true) {
			if (this.aClass178_3 == null) {
				if (this.aBoolean549) {
					return;
				}
				this.method6543(-1);
				if (this.aClass178_3 == null) {
					return;
				}
			}
			@Pc(31) int local31 = Static62.anInt1184 - this.anInt7358;
			if (local31 > 100 && this.aClass178_3.anInt5142 > 0) {
				@Pc(51) int local51 = this.aClass178_3.anIntArray259.length - this.aClass178_3.anInt5142;
				while (this.anInt7347 < local51 && this.aClass178_3.anIntArray257[this.anInt7347] < local31) {
					local31 -= this.aClass178_3.anIntArray257[this.anInt7347];
					this.anInt7347++;
				}
				if (local51 <= this.anInt7347) {
					@Pc(90) int local90 = 0;
					for (@Pc(92) int local92 = local51; local92 < this.aClass178_3.anIntArray259.length; local92++) {
						local90 += this.aClass178_3.anIntArray257[local92];
					}
					local31 %= local90;
				}
				this.anInt7352 = this.anInt7347 + 1;
				if (this.anInt7352 >= this.aClass178_3.anIntArray259.length) {
					this.anInt7352 -= this.aClass178_3.anInt5142;
					if (this.anInt7352 < 0 || this.anInt7352 >= this.aClass178_3.anIntArray259.length) {
						this.anInt7352 = -1;
					}
				}
			}
			while (this.aClass178_3.anIntArray257[this.anInt7347] < local31) {
				Static509.method7938(this.aClass178_3, arg0, this.anInt7347);
				local31 -= this.aClass178_3.anIntArray257[this.anInt7347];
				this.anInt7347++;
				if (this.anInt7347 >= this.aClass178_3.anIntArray259.length) {
					this.anInt7347 -= this.aClass178_3.anInt5142;
					if (this.anInt7347 < 0 || this.aClass178_3.anIntArray259.length <= this.anInt7347) {
						this.aClass178_3 = null;
						continue label80;
					}
				}
				this.anInt7352 = this.anInt7347 + 1;
				if (this.aClass178_3.anIntArray259.length <= this.anInt7352) {
					this.anInt7352 -= this.aClass178_3.anInt5142;
					if (this.anInt7352 < 0 || this.anInt7352 >= this.aClass178_3.anIntArray259.length) {
						this.anInt7352 = -1;
					}
				}
			}
			this.anInt7356 = local31;
			this.anInt7358 = Static62.anInt1184 - local31;
			return;
		}
	}

	@OriginalMember(owner = "client!nb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass15_Sub5_6 != null) {
			this.aClass15_Sub5_6.method2298();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZLclient!ha;IIZ)Lclient!ka;")
	public Class14 method6541(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) Class331 local11 = Static251.aClass328_1.method8261(this.anInt7351);
		if (local11.anIntArray486 != null) {
			local11 = local11.method8304(Static113.aClass282_1);
		}
		if (local11 == null) {
			this.method6547(arg1);
			this.anInt7341 = -1;
			this.anInt7343 = -1;
			this.anInt7359 = -1;
			return null;
		}
		if (!this.aBoolean549 && this.anInt7359 != local11.anInt9434) {
			this.aClass14_4 = null;
			this.method6543(-1);
		}
		this.method6539(this.aClass15_Sub3_19);
		if (arg0) {
			@Pc(76) boolean local76 = arg0 & this.aBoolean548 & Static230.aClass2_Sub54_15.aClass4_Sub18_1.method6164() != 0;
			arg0 = local76 & (local11.anInt9434 != this.anInt7343 || this.aClass178_3 != null && Static230.aClass2_Sub54_15.aClass4_Sub18_1.method6164() >= 2 && (this.anInt7347 != this.anInt7341 || (this.aClass178_3.aBoolean384 || Static135.aBoolean192) && this.anInt7347 != this.anInt7352));
		}
		if (arg3 && !arg0) {
			this.anInt7359 = local11.anInt9434;
			return null;
		}
		if (arg0) {
			Static13.method7472(this.aClass2_Sub1_Sub11_4, this.aByte101, this.aClass15_Sub3_19.anInt11022, this.aClass15_Sub3_19.anInt11024, this.aBooleanArray41);
			this.anInt7343 = -1;
			this.anInt7341 = -1;
		}
		@Pc(163) Class18 local163 = Static245.aClass18Array14[this.aByte101];
		@Pc(181) Class18 local181;
		if (this.aBoolean550) {
			local181 = Static549.aClass18Array30[0];
		} else {
			local181 = this.aByte101 >= 3 ? null : Static245.aClass18Array14[this.aByte101 + 1];
		}
		@Pc(189) Class14 local189 = null;
		if (this.aClass178_3 != null) {
			if (arg0) {
				arg2 |= 0x40000;
			}
			local189 = local11.method8291(this.anInt7362 == 11 ? this.anInt7342 + 4 : this.anInt7342, this.anInt7347, this.aClass178_3, this.anInt7362 == 11 ? 10 : this.anInt7362, local181, local163.method8542(this.aClass15_Sub3_19.anInt11024, this.aClass15_Sub3_19.anInt11022), this.aClass15_Sub3_19.anInt11024, this.aClass278_1, this.aClass15_Sub3_19.anInt11022, arg2, local163, arg1, this.anInt7356, this.anInt7352);
			if (local189 == null) {
				this.anInt7346 = 0;
				this.aBooleanArray41 = null;
				this.aClass2_Sub1_Sub11_4 = null;
				this.anInt7355 = 0;
			} else {
				if (arg0) {
					if (this.aBooleanArray41 == null) {
						this.aBooleanArray41 = new boolean[4];
					}
					this.aClass2_Sub1_Sub11_4 = local189.ba(this.aClass2_Sub1_Sub11_4);
					Static662.method8957(this.aClass2_Sub1_Sub11_4, this.aByte101, this.aClass15_Sub3_19.anInt11022, this.aClass15_Sub3_19.anInt11024, this.aBooleanArray41);
					this.anInt7343 = local11.anInt9434;
					this.anInt7341 = this.anInt7347;
				}
				this.anInt7355 = local189.fa();
				this.anInt7346 = local189.ma();
			}
			this.aClass14_4 = null;
		} else if (this.aClass14_4 != null && arg2 == (arg2 & this.aClass14_4.ua()) && local11.anInt9434 == this.anInt7359) {
			local189 = this.aClass14_4;
		} else {
			if (this.aClass14_4 != null) {
				arg2 |= this.aClass14_4.ua();
			}
			@Pc(390) Class173 local390 = local11.method8293(this.anInt7362 == 11 ? this.anInt7342 + 4 : this.anInt7342, this.anInt7362 == 11 ? 10 : this.anInt7362, this.aClass15_Sub3_19.anInt11024, arg2, arg0, local163.method8542(this.aClass15_Sub3_19.anInt11024, this.aClass15_Sub3_19.anInt11022), local181, this.aClass278_1, this.aClass15_Sub3_19.anInt11022, arg1, local163);
			if (local390 == null) {
				this.anInt7355 = 0;
				this.anInt7346 = 0;
				this.aClass14_4 = null;
				this.aClass2_Sub1_Sub11_4 = null;
				this.aBooleanArray41 = null;
			} else {
				local189 = local390.aClass14_2;
				this.aClass14_4 = local390.aClass14_2;
				if (arg0) {
					this.aClass2_Sub1_Sub11_4 = local390.aClass2_Sub1_Sub11_2;
					this.aBooleanArray41 = null;
					Static662.method8957(this.aClass2_Sub1_Sub11_4, this.aByte101, this.aClass15_Sub3_19.anInt11022, this.aClass15_Sub3_19.anInt11024, (boolean[]) null);
					this.anInt7343 = local11.anInt9434;
					this.anInt7341 = -1;
				}
				this.anInt7355 = local189.fa();
				this.anInt7346 = local189.ma();
			}
		}
		this.anInt7359 = local11.anInt9434;
		return local189;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!pe;Z)V")
	public void method6542(@OriginalArg(0) Class278 arg0) {
		this.aClass278_1 = arg0;
		this.aClass14_4 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)V")
	private void method6543(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(22) Class331 local22 = Static251.aClass328_1.method8261(this.anInt7351);
			@Pc(24) Class331 local24 = local22;
			if (local22.anIntArray486 != null) {
				local22 = local22.method8304(Static113.aClass282_1);
			}
			if (local22 == null) {
				return;
			}
			if (local24 == local22) {
				local24 = null;
			}
			if (local22.anIntArray484 != null) {
				if (this.aClass178_3 != null && local22.method8300(this.aClass178_3.anInt5144)) {
					return;
				}
				local7 = local22.method8289();
				if (this.anInt7359 != local22.anInt9434) {
					local9 = local22.aBoolean685;
				}
			} else if (local22.anInt9432 == -1) {
				if (local24 != null && local24.anIntArray484 != null) {
					if (this.aClass178_3 != null && local24.method8300(this.aClass178_3.anInt5144)) {
						return;
					}
					local7 = local24.method8289();
					if (local24.anInt9434 != this.anInt7359) {
						local9 = local24.aBoolean685;
					}
				} else if (local24 != null && local24.anInt9432 != -1 && this.anInt7359 != local24.anInt9434) {
					local9 = local24.aBoolean685;
					local7 = local24.anInt9432;
				}
			} else if (local22.anInt9434 != this.anInt7359) {
				local9 = local22.aBoolean685;
				local7 = local22.anInt9432;
			}
		}
		if (local7 == -1) {
			this.aClass178_3 = null;
			return;
		}
		this.aClass14_4 = null;
		if (this.aClass178_3 == null || local7 != this.aClass178_3.anInt5144) {
			this.aClass178_3 = Static354.aClass40_2.method1123(local7);
		} else if (this.aClass178_3.anInt5129 == 0) {
			return;
		}
		if (this.aClass178_3.anIntArray259 == null) {
			this.aClass178_3 = null;
			return;
		}
		if (local9) {
			this.anInt7347 = (int) (Math.random() * (double) this.aClass178_3.anIntArray259.length);
			this.anInt7356 = (int) (Math.random() * (double) this.aClass178_3.anIntArray257[this.anInt7347]) + 1;
		} else {
			this.anInt7356 = 1;
			this.anInt7347 = 0;
		}
		this.anInt7352 = this.anInt7347 + 1;
		if (this.anInt7352 < 0 || this.aClass178_3.anIntArray259.length <= this.anInt7352) {
			this.anInt7352 = -1;
		}
		this.anInt7358 = Static62.anInt1184 - this.anInt7356;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Z")
	public boolean method6544() {
		return this.aBoolean548;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ha;B)V")
	public void method6546(@OriginalArg(0) Class101 arg0) {
		this.method6541(true, arg0, 262144, true);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method6547(@OriginalArg(0) Class101 arg0) {
		if (this.aClass2_Sub1_Sub11_4 != null) {
			Static13.method7472(this.aClass2_Sub1_Sub11_4, this.aByte101, this.aClass15_Sub3_19.anInt11022, this.aClass15_Sub3_19.anInt11024, this.aBooleanArray41);
			this.aBooleanArray41 = null;
			this.aClass2_Sub1_Sub11_4 = null;
		}
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)I")
	public int method6548() {
		return this.anInt7346;
	}
}
