import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class92 {

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "Lclient!jg;")
	public Class23_Sub3 aClass23_Sub3_2;

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
	private int anInt2478;

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
	private int anInt2480;

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "Lclient!vr;")
	private Class261 aClass261_1;

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
	private int anInt2481;

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "[Z")
	private boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "Lclient!ia;")
	private Class3_Sub3_Sub9 aClass3_Sub3_Sub9_3;

	@OriginalMember(owner = "client!gs", name = "v", descriptor = "Lclient!ka;")
	private Class108 aClass108_3;

	@OriginalMember(owner = "client!gs", name = "B", descriptor = "I")
	private int anInt2494;

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
	private int anInt2483 = -1;

	@OriginalMember(owner = "client!gs", name = "y", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!gs", name = "D", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "client!gs", name = "r", descriptor = "I")
	private int anInt2488 = -32768;

	@OriginalMember(owner = "client!gs", name = "H", descriptor = "I")
	private int anInt2498 = -1;

	@OriginalMember(owner = "client!gs", name = "x", descriptor = "I")
	private int anInt2491;

	@OriginalMember(owner = "client!gs", name = "t", descriptor = "I")
	public final int anInt2489;

	@OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
	private int anInt2482;

	@OriginalMember(owner = "client!gs", name = "o", descriptor = "B")
	private final byte aByte28;

	@OriginalMember(owner = "client!gs", name = "n", descriptor = "I")
	public final int anInt2485;

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
	public final int anInt2477;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "B")
	private final byte aByte27;

	@OriginalMember(owner = "client!gs", name = "w", descriptor = "Z")
	private final boolean aBoolean190;

	static {
		new Class174("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!qa;Lclient!cd;IIIIIIZI)V")
	public Class92(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt2491 = arg6;
		this.anInt2489 = arg2;
		this.anInt2482 = arg7;
		this.aByte28 = (byte) arg5;
		this.anInt2485 = arg3;
		this.anInt2477 = arg1.anInt791;
		this.aBoolean191 = arg8;
		this.aByte27 = (byte) arg4;
		this.aBoolean190 = arg0.method5969() && arg1.aBoolean42 && !this.aBoolean191;
		if (arg9 != -1) {
			this.aBoolean192 = true;
		}
		this.method2146(arg9);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)V")
	private void method2139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass261_1 == null) {
				if (this.aBoolean192) {
					return;
				}
				this.method2146(-1);
				if (this.aClass261_1 == null) {
					return;
				}
			}
			@Pc(31) int local31 = Static172.anInt3107 - this.anInt2478;
			if (local31 > 100 && this.aClass261_1.anInt7413 > 0) {
				@Pc(50) int local50 = this.aClass261_1.anIntArray494.length - this.aClass261_1.anInt7413;
				while (local50 > this.anInt2480 && local31 > this.aClass261_1.anIntArray493[this.anInt2480]) {
					local31 -= this.aClass261_1.anIntArray493[this.anInt2480];
					this.anInt2480++;
				}
				if (this.anInt2480 >= local50) {
					@Pc(89) int local89 = 0;
					for (@Pc(91) int local91 = local50; local91 < this.aClass261_1.anIntArray494.length; local91++) {
						local89 += this.aClass261_1.anIntArray493[local91];
					}
					local31 %= local89;
				}
				this.anInt2481 = this.anInt2480 + 1;
				if (this.anInt2481 >= this.aClass261_1.anIntArray494.length) {
					this.anInt2481 -= this.aClass261_1.anInt7413;
					if (this.anInt2481 < 0 || this.aClass261_1.anIntArray494.length <= this.anInt2481) {
						this.anInt2481 = -1;
					}
				}
			}
			while (this.aClass261_1.anIntArray493[this.anInt2480] < local31) {
				Static192.method3007(this.aClass261_1, this.aByte27, this.anInt2480, arg1, arg0, false);
				local31 -= this.aClass261_1.anIntArray493[this.anInt2480];
				this.anInt2480++;
				if (this.aClass261_1.anIntArray494.length <= this.anInt2480) {
					this.anInt2480 -= this.aClass261_1.anInt7413;
					if (this.anInt2480 < 0 || this.aClass261_1.anIntArray494.length <= this.anInt2480) {
						this.aClass261_1 = null;
						continue label80;
					}
				}
				this.anInt2481 = this.anInt2480 + 1;
				if (this.aClass261_1.anIntArray494.length <= this.anInt2481) {
					this.anInt2481 -= this.aClass261_1.anInt7413;
					if (this.anInt2481 < 0 || this.aClass261_1.anIntArray494.length <= this.anInt2481) {
						this.anInt2481 = -1;
					}
				}
			}
			this.anInt2478 = Static172.anInt3107 - local31;
			this.anInt2494 = local31;
			return;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)Z")
	public boolean method2140() {
		return this.aBoolean190;
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)I")
	public int method2141() {
		return this.anInt2488;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BIZIZILclient!qa;)Lclient!ka;")
	public Class108 method2142(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class167 arg5) {
		@Pc(11) Class31 local11 = Static9.aClass149_1.method3573(this.anInt2477);
		if (local11.anIntArray44 != null) {
			local11 = local11.method863(Static119.aClass47_1);
		}
		if (local11 == null) {
			this.method2144(arg5);
			this.anInt2498 = -1;
			this.anInt2483 = this.anInt2480;
			return null;
		}
		if (!this.aBoolean192 && this.anInt2498 != local11.anInt791) {
			this.aClass108_3 = null;
			this.method2146(-1);
		}
		this.method2139(arg0, arg2);
		@Pc(70) boolean local70 = arg3 & this.aBoolean190 & Static39.aClass79_Sub1_1.method1942(Static402.anInt6656) != 0;
		@Pc(114) boolean local114 = local70 & (this.anInt2498 != local11.anInt791 || (this.anInt2483 != this.anInt2480 || this.aClass261_1 != null && (this.aClass261_1.aBoolean500 || Static454.aBoolean509) && this.anInt2480 != this.anInt2481) && Static39.aClass79_Sub1_1.method1942(Static402.anInt6656) >= 2);
		if (arg1 && !local114) {
			this.anInt2483 = this.anInt2480;
			this.anInt2498 = local11.anInt791;
			return null;
		}
		if (local114) {
			Static369.method5155(this.aClass3_Sub3_Sub9_3, this.aByte28, this.anInt2491, this.anInt2482, this.aBooleanArray9);
		}
		@Pc(146) Class55 local146 = Static178.aClass55Array1[this.aByte28];
		@Pc(162) Class55 local162;
		if (this.aBoolean191) {
			local162 = Static182.aClass55Array2[0];
		} else {
			local162 = this.aByte28 < 3 ? Static178.aClass55Array1[this.aByte28 + 1] : null;
		}
		@Pc(170) Class108 local170 = null;
		if (this.aClass261_1 != null) {
			if (local114) {
				arg4 |= 0x40000;
			}
			local170 = local11.method873(local146, this.anInt2489 == 11 ? 10 : this.anInt2489, arg4, this.anInt2489 == 11 ? this.anInt2485 + 4 : this.anInt2485, this.anInt2491, this.anInt2480, local146.R(this.anInt2491, this.anInt2482), this.aClass261_1, local162, this.anInt2482, arg5, this.anInt2481, this.anInt2494);
			if (local170 == null) {
				this.aBooleanArray9 = null;
				this.anInt2488 = 0;
				this.aClass3_Sub3_Sub9_3 = null;
			} else {
				if (local114) {
					if (this.aBooleanArray9 == null) {
						this.aBooleanArray9 = new boolean[4];
					}
					this.aClass3_Sub3_Sub9_3 = local170.LA(this.aClass3_Sub3_Sub9_3);
					Static279.method3856(this.aClass3_Sub3_Sub9_3, this.aByte28, arg2, arg0, this.aBooleanArray9);
				}
				this.anInt2488 = local170.ja();
			}
			this.aClass108_3 = null;
		} else if (this.aClass108_3 != null && (this.aClass108_3.ma() & arg4) == arg4 && this.anInt2498 == local11.anInt791) {
			local170 = this.aClass108_3;
		} else {
			if (this.aClass108_3 != null) {
				arg4 |= this.aClass108_3.ma();
			}
			@Pc(354) Class130 local354 = local11.method874(local162, this.anInt2489 == 11 ? this.anInt2485 + 4 : this.anInt2485, local146.R(this.anInt2491, this.anInt2482), arg4, arg5, local114, this.anInt2489 == 11 ? 10 : this.anInt2489, local146, this.anInt2482, this.anInt2491);
			if (local354 == null) {
				this.aClass108_3 = null;
				this.anInt2488 = 0;
				this.aClass3_Sub3_Sub9_3 = null;
				this.aBooleanArray9 = null;
			} else {
				local170 = local354.aClass108_6;
				this.aClass108_3 = local354.aClass108_6;
				if (local114) {
					this.aBooleanArray9 = null;
					this.aClass3_Sub3_Sub9_3 = local354.aClass3_Sub3_Sub9_5;
					Static279.method3856(this.aClass3_Sub3_Sub9_3, this.aByte28, arg2, arg0, null);
				}
				this.anInt2488 = local170.ja();
			}
		}
		this.anInt2498 = local11.anInt791;
		this.anInt2491 = arg2;
		this.anInt2483 = this.anInt2480;
		this.anInt2482 = arg0;
		return local170;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)V")
	public void method2143(@OriginalArg(1) int arg0) {
		this.aBoolean192 = true;
		this.method2146(arg0);
	}

	@OriginalMember(owner = "client!gs", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass23_Sub3_2 != null) {
			this.aClass23_Sub3_2.method2967();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZLclient!qa;)V")
	public void method2144(@OriginalArg(1) Class167 arg0) {
		if (this.aClass3_Sub3_Sub9_3 != null) {
			Static369.method5155(this.aClass3_Sub3_Sub9_3, this.aByte28, this.anInt2491, this.anInt2482, this.aBooleanArray9);
			this.aBooleanArray9 = null;
			this.aClass3_Sub3_Sub9_3 = null;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!qa;I)V")
	public void method2145(@OriginalArg(0) Class167 arg0) {
		this.method2142(this.anInt2482, true, this.anInt2491, true, 262144, arg0);
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)V")
	private void method2146(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class31 local18 = Static9.aClass149_1.method3573(this.anInt2477);
			@Pc(20) Class31 local20 = local18;
			if (local18.anIntArray44 != null) {
				local18 = local18.method863(Static119.aClass47_1);
			}
			if (local18 == null) {
				return;
			}
			if (local18 == local20) {
				local20 = null;
			}
			if (local18.anIntArray45 != null) {
				if (this.aClass261_1 != null && local18.method872(this.aClass261_1.anInt7418)) {
					return;
				}
				local7 = local18.method864();
				if (this.anInt2498 != local18.anInt791) {
					local9 = local18.aBoolean55;
				}
			} else if (local18.anInt780 == -1) {
				if (local20 != null && local20.anIntArray45 != null) {
					if (this.aClass261_1 != null && local20.method872(this.aClass261_1.anInt7418)) {
						return;
					}
					local7 = local20.method864();
					if (local20.anInt791 != this.anInt2498) {
						local9 = local20.aBoolean55;
					}
				} else if (local20 != null && local20.anInt780 != -1 && this.anInt2498 != local20.anInt791) {
					local9 = local20.aBoolean55;
					local7 = local20.anInt780;
				}
			} else if (local18.anInt791 != this.anInt2498) {
				local9 = local18.aBoolean55;
				local7 = local18.anInt780;
			}
		}
		if (local7 == -1) {
			this.aClass261_1 = null;
			return;
		}
		this.aClass108_3 = null;
		if (this.aClass261_1 == null || this.aClass261_1.anInt7418 != local7) {
			this.aClass261_1 = Static444.aClass59_3.method1552(local7);
		} else if (this.aClass261_1.anInt7421 == 0) {
			return;
		}
		if (this.aClass261_1.anIntArray494 == null) {
			this.aClass261_1 = null;
			return;
		}
		if (local9) {
			this.anInt2480 = (int) ((double) this.aClass261_1.anIntArray494.length * Math.random());
			this.anInt2494 = (int) ((double) this.aClass261_1.anIntArray493[this.anInt2480] * Math.random()) + 1;
		} else {
			this.anInt2494 = 1;
			this.anInt2480 = 0;
		}
		this.anInt2481 = this.anInt2480 + 1;
		if (this.anInt2481 < 0 || this.anInt2481 >= this.aClass261_1.anIntArray494.length) {
			this.anInt2481 = -1;
		}
		this.anInt2478 = Static172.anInt3107 - this.anInt2494;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIILclient!qa;ZLclient!ka;II)V")
	public void method2147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class167 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class108 arg5, @OriginalArg(7) int arg6) {
		@Pc(6) Class141[] local6 = arg5.method4944();
		@Pc(9) Class95[] local9 = arg5.method4940();
		if ((this.aClass23_Sub3_2 == null || this.aClass23_Sub3_2.aBoolean265) && (local6 != null || local9 != null)) {
			@Pc(26) Class31 local26 = Static9.aClass149_1.method3573(this.anInt2477);
			if (local26.anIntArray44 != null) {
				local26 = local26.method863(Static119.aClass47_1);
			}
			if (local26 != null) {
				this.aClass23_Sub3_2 = new Class23_Sub3(Static172.anInt3107);
			}
		}
		if (this.aClass23_Sub3_2 == null) {
			return;
		}
		if (arg4) {
			this.aClass23_Sub3_2.method2972(arg3, (long) Static172.anInt3107, local6, local9);
		} else {
			this.aClass23_Sub3_2.method2975((long) Static172.anInt3107);
		}
		this.aClass23_Sub3_2.method2971(this.aByte27, arg1, arg6, arg2, arg0);
	}
}
