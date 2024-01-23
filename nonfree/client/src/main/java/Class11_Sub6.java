import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class11_Sub6 extends Class11 {

	@OriginalMember(owner = "client!po", name = "H", descriptor = "Lclient!dh;")
	private Class22_Sub3 aClass22_Sub3_7;

	@OriginalMember(owner = "client!po", name = "h", descriptor = "I")
	private int anInt4113 = 0;

	@OriginalMember(owner = "client!po", name = "f", descriptor = "I")
	private int anInt4111 = 0;

	@OriginalMember(owner = "client!po", name = "w", descriptor = "I")
	private int anInt4126 = -32768;

	@OriginalMember(owner = "client!po", name = "u", descriptor = "I")
	private int anInt4124 = -1;

	@OriginalMember(owner = "client!po", name = "k", descriptor = "I")
	private int anInt4116 = -1;

	@OriginalMember(owner = "client!po", name = "t", descriptor = "Z")
	private boolean aBoolean371 = false;

	@OriginalMember(owner = "client!po", name = "C", descriptor = "Lclient!fo;")
	private Class57_Sub1 aClass57_Sub1_31 = null;

	@OriginalMember(owner = "client!po", name = "I", descriptor = "Z")
	private boolean aBoolean373 = true;

	@OriginalMember(owner = "client!po", name = "J", descriptor = "Z")
	private boolean aBoolean374 = false;

	@OriginalMember(owner = "client!po", name = "y", descriptor = "I")
	private int anInt4128 = 0;

	@OriginalMember(owner = "client!po", name = "l", descriptor = "I")
	private int anInt4117;

	@OriginalMember(owner = "client!po", name = "p", descriptor = "I")
	private int anInt4120;

	@OriginalMember(owner = "client!po", name = "q", descriptor = "I")
	private int anInt4121;

	@OriginalMember(owner = "client!po", name = "x", descriptor = "I")
	private int anInt4127;

	@OriginalMember(owner = "client!po", name = "O", descriptor = "I")
	private int anInt4139;

	@OriginalMember(owner = "client!po", name = "n", descriptor = "I")
	private int anInt4119;

	@OriginalMember(owner = "client!po", name = "v", descriptor = "I")
	private int anInt4125;

	@OriginalMember(owner = "client!po", name = "j", descriptor = "I")
	private int anInt4115;

	@OriginalMember(owner = "client!po", name = "B", descriptor = "I")
	private int anInt4131;

	@OriginalMember(owner = "client!po", name = "o", descriptor = "Lclient!sb;")
	private Class152 aClass152_3;

	@OriginalMember(owner = "client!po", name = "P", descriptor = "I")
	private int anInt4140;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(IIIIIIIZLclient!km;)V")
	public Class11_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class11 arg8) {
		this.anInt4117 = arg2;
		this.anInt4120 = arg4;
		this.anInt4121 = arg0;
		this.anInt4127 = arg1;
		this.anInt4139 = arg5;
		this.anInt4119 = arg3;
		if (arg8 != null) {
			this.aBoolean374 = true;
			if (arg8 instanceof Class11_Sub6) {
				@Pc(98) Class11_Sub6 local98 = (Class11_Sub6) arg8;
				if (Static71.aBoolean165) {
					local98.method3560();
				}
				this.anInt4125 = local98.anInt4125;
				this.anInt4115 = local98.anInt4115;
				this.anInt4131 = local98.anInt4131;
				this.aClass152_3 = local98.aClass152_3;
				this.anInt4140 = local98.anInt4140;
			} else if (Static71.aBoolean165) {
				@Pc(67) Class150 local67 = Static160.method2744(this.anInt4121);
				if (local67.anIntArray507 != null) {
					local67 = local67.method3884();
				}
				if (local67 != null) {
					Static254.method3972(this.anInt4139, 0, this.anInt4127, this.anInt4119, this.anInt4120, 0, this.anInt4117, local67);
				}
			}
		}
		if (this.aBoolean374) {
			this.method3558(arg6);
		}
		if (Static71.aBoolean165 && arg8 != null) {
			this.method3562(true);
		}
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(III)V")
	private void method3557(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label88: while (true) {
			if (this.aClass152_3 == null) {
				if (this.aBoolean374) {
					return;
				}
				this.method3558(-1);
				if (this.aClass152_3 == null) {
					return;
				}
			}
			@Pc(33) int local33 = Static167.anInt637 - this.anInt4131;
			if (local33 > 100 && this.aClass152_3.anInt4594 > 0) {
				@Pc(52) int local52 = this.aClass152_3.anIntArray509.length - this.aClass152_3.anInt4594;
				while (this.anInt4140 < local52 && this.aClass152_3.anIntArray512[this.anInt4140] < local33) {
					local33 -= this.aClass152_3.anIntArray512[this.anInt4140];
					this.anInt4140++;
				}
				if (local52 <= this.anInt4140) {
					@Pc(96) int local96 = 0;
					for (@Pc(98) int local98 = local52; local98 < this.aClass152_3.anIntArray509.length; local98++) {
						local96 += this.aClass152_3.anIntArray512[local98];
					}
					local33 %= local96;
				}
				this.anInt4125 = this.anInt4140 + 1;
				if (this.aClass152_3.anIntArray509.length <= this.anInt4125) {
					this.anInt4125 -= this.aClass152_3.anInt4594;
					if (this.anInt4125 < 0 || this.anInt4125 >= this.aClass152_3.anIntArray509.length) {
						this.anInt4125 = -1;
					}
				}
			}
			while (this.aClass152_3.anIntArray512[this.anInt4140] < local33) {
				Static291.method4385(this.aClass152_3, false, arg0, arg1, this.anInt4140);
				local33 -= this.aClass152_3.anIntArray512[this.anInt4140];
				this.anInt4140++;
				if (this.anInt4140 >= this.aClass152_3.anIntArray509.length) {
					this.anInt4140 -= this.aClass152_3.anInt4594;
					if (this.anInt4140 < 0 || this.aClass152_3.anIntArray509.length <= this.anInt4140) {
						this.aClass152_3 = null;
						continue label88;
					}
				}
				this.anInt4125 = this.anInt4140 + 1;
				if (this.aClass152_3.anIntArray509.length <= this.anInt4125) {
					this.anInt4125 -= this.aClass152_3.anInt4594;
					if (this.anInt4125 < 0 || this.aClass152_3.anIntArray509.length <= this.anInt4125) {
						this.anInt4125 = -1;
					}
				}
			}
			this.anInt4131 = Static167.anInt637 - local33;
			this.anInt4115 = local33;
			return;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)V")
	private void method3558(@OriginalArg(0) int arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = arg0;
		if (arg0 == -1) {
			@Pc(20) Class150 local20 = Static160.method2744(this.anInt4121);
			@Pc(22) Class150 local22 = local20;
			if (local20.anIntArray507 != null) {
				local20 = local20.method3884();
			}
			if (local20 == null) {
				return;
			}
			if (local22 == local20) {
				local22 = null;
			}
			if (local20.anIntArray502 != null) {
				if (this.aClass152_3 != null && local20.method3890(this.aClass152_3.anInt4609)) {
					return;
				}
				local9 = local20.method3888();
				if (local20.anInt4558 != this.anInt4116) {
					local7 = local20.aBoolean411;
				}
			} else if (local20.anInt4571 == -1) {
				if (local22 != null && local22.anIntArray502 != null) {
					if (this.aClass152_3 != null && local22.method3890(this.aClass152_3.anInt4609)) {
						return;
					}
					local9 = local22.method3888();
					if (local22.anInt4558 != this.anInt4116) {
						local7 = local22.aBoolean411;
					}
				} else if (local22 != null && local22.anInt4571 != -1 && local22.anInt4558 != this.anInt4116) {
					local7 = local22.aBoolean411;
					local9 = local22.anInt4571;
				}
			} else if (local20.anInt4558 != this.anInt4116) {
				local7 = local20.aBoolean411;
				local9 = local20.anInt4571;
			}
		}
		if (local9 == -1) {
			this.aClass152_3 = null;
			return;
		}
		if (this.aClass152_3 == null || local9 != this.aClass152_3.anInt4609) {
			this.aClass152_3 = Static107.method2016(local9);
		} else if (this.aClass152_3.anInt4603 == 0) {
			return;
		}
		if (local7) {
			this.anInt4140 = (int) ((double) this.aClass152_3.anIntArray509.length * Math.random());
			this.anInt4115 = (int) (Math.random() * (double) this.aClass152_3.anIntArray512[this.anInt4140]) + 1;
		} else {
			this.anInt4140 = 0;
			this.anInt4115 = 1;
		}
		this.anInt4125 = this.anInt4140 + 1;
		if (this.anInt4125 < 0 || this.anInt4125 >= this.aClass152_3.anIntArray509.length) {
			this.anInt4125 = -1;
		}
		this.anInt4131 = Static167.anInt637 - this.anInt4115;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!km;B)V")
	private void method3559(@OriginalArg(0) Class11 arg0) {
		@Pc(38) Class150 local38;
		if (Static71.aBoolean165) {
			@Pc(83) Class11_Sub1_Sub1 local83 = (Class11_Sub1_Sub1) arg0;
			if ((this.aClass22_Sub3_7 == null || this.aClass22_Sub3_7.aBoolean111) && (local83.aClass146Array1 != null || local83.aClass76Array1 != null)) {
				local38 = Static160.method2744(this.anInt4121);
				if (local38.anIntArray507 != null) {
					local38 = local38.method3884();
				}
				if (local38 != null) {
					this.aClass22_Sub3_7 = new Class22_Sub3(Static167.anInt637, local38.anInt4532, local38.anInt4562);
				}
			}
			if (this.aClass22_Sub3_7 != null) {
				this.aClass22_Sub3_7.method971(local83.aClass146Array1, local83.aClass76Array1, false, local83.anIntArray46, local83.anIntArray45, local83.anIntArray41);
			}
		} else {
			@Pc(18) Class11_Sub1_Sub2 local18 = (Class11_Sub1_Sub2) arg0;
			if ((this.aClass22_Sub3_7 == null || this.aClass22_Sub3_7.aBoolean111) && (local18.aClass146Array2 != null || local18.aClass76Array2 != null)) {
				local38 = Static160.method2744(this.anInt4121);
				if (local38.anIntArray507 != null) {
					local38 = local38.method3884();
				}
				if (local38 != null) {
					this.aClass22_Sub3_7 = new Class22_Sub3(Static167.anInt637, local38.anInt4532, local38.anInt4562);
				}
			}
			if (this.aClass22_Sub3_7 != null) {
				this.aClass22_Sub3_7.method971(local18.aClass146Array2, local18.aClass76Array2, false, local18.anIntArray312, local18.anIntArray311, local18.anIntArray319);
			}
		}
		this.aBoolean371 = true;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "()I")
	@Override
	public int method4297() {
		return this.anInt4126;
	}

	@OriginalMember(owner = "client!po", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass22_Sub3_7 != null) {
			this.aClass22_Sub3_7.method955();
		}
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
	public void method3560() {
		if (this.aClass57_Sub1_31 != null) {
			Static15.method215(this.aClass57_Sub1_31, this.anInt4113, this.anInt4128, this.anInt4111);
			this.aClass57_Sub1_31 = null;
		}
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(I)Lclient!km;")
	public Class11 method3561() {
		return this.method3562(false);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) Class11 local5 = null;
		if (Static71.aBoolean165) {
			local5 = this.method3562(true);
		} else {
			this.method3557(arg4, arg3);
		}
		if (!this.aBoolean371) {
			if (local5 == null) {
				local5 = this.method3561();
			}
			if (local5 == null) {
				return;
			}
			this.method3559(local5);
		}
		if (this.aClass22_Sub3_7 != null) {
			this.aClass22_Sub3_7.method972(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BZ)Lclient!km;")
	private Class11 method3562(@OriginalArg(1) boolean arg0) {
		@Pc(12) boolean local12 = Static24.anIntArrayArrayArray3 != Static280.anIntArrayArrayArray13;
		@Pc(17) Class150 local17 = Static160.method2744(this.anInt4121);
		if (local17.anIntArray507 != null) {
			local17 = local17.method3884();
		}
		if (local17 == null) {
			if (Static71.aBoolean165 && !local12) {
				this.method3560();
			}
			this.anInt4116 = -1;
			this.anInt4124 = this.anInt4140;
			return null;
		}
		if (!this.aBoolean374 && local17.anInt4558 != this.anInt4116) {
			this.method3558(-1);
		}
		@Pc(65) int local65 = this.anInt4117 & 0x3;
		@Pc(76) int local76;
		@Pc(79) int local79;
		if (local65 == 1 || local65 == 3) {
			local76 = local17.anInt4562;
			local79 = local17.anInt4532;
		} else {
			local76 = local17.anInt4532;
			local79 = local17.anInt4562;
		}
		@Pc(94) int local94 = (local76 >> 1) + this.anInt4120;
		@Pc(104) int local104 = this.anInt4120 + (local76 + 1 >> 1);
		@Pc(112) int local112 = this.anInt4139 + (local79 >> 1);
		@Pc(122) int local122 = this.anInt4139 + (local79 + 1 >> 1);
		this.method3557(local112 * 128, local94 * 128);
		@Pc(181) boolean local181 = !local12 && local17.aBoolean421 && (this.anInt4116 != local17.anInt4558 || (this.anInt4140 != this.anInt4124 || this.aClass152_3 != null && (this.aClass152_3.aBoolean428 || Static186.aBoolean313) && this.anInt4140 != this.anInt4125) && Static147.anInt5168 >= 2);
		if (arg0 && !local181) {
			this.anInt4124 = this.anInt4140;
			this.anInt4116 = local17.anInt4558;
			return null;
		}
		@Pc(201) int[][] local201 = Static280.anIntArrayArrayArray13[this.anInt4119];
		@Pc(227) int local227 = local201[local94][local122] + local201[local94][local112] + local201[local104][local112] + local201[local104][local122] >> 2;
		@Pc(237) int local237 = (this.anInt4120 << 7) + (local76 << 6);
		@Pc(246) int local246 = (local79 << 6) + (this.anInt4139 << 7);
		@Pc(249) int[][] local249 = null;
		if (local12) {
			local249 = Static24.anIntArrayArrayArray3[0];
		} else if (this.anInt4119 < 3) {
			local249 = Static280.anIntArrayArrayArray13[this.anInt4119 + 1];
		}
		if (Static71.aBoolean165 && local181) {
			Static15.method215(this.aClass57_Sub1_31, this.anInt4113, this.anInt4128, this.anInt4111);
		}
		@Pc(289) boolean local289 = this.aClass57_Sub1_31 == null;
		@Pc(313) Class88 local313;
		if (this.aClass152_3 == null) {
			local313 = local17.method3892(local237, false, local227, this.anInt4117, local181, local289 ? Static112.aClass57_Sub1_44 : this.aClass57_Sub1_31, this.anInt4127, local246, local201, local249);
		} else {
			local313 = local17.method3889(this.anInt4125, local201, this.anInt4127, local289 ? Static112.aClass57_Sub1_44 : this.aClass57_Sub1_31, this.anInt4140, this.anInt4115, local249, this.aClass152_3, local237, local227, local246, this.anInt4117, local181);
		}
		if (local313 == null) {
			this.anInt4124 = this.anInt4140;
			this.anInt4116 = local17.anInt4558;
			return null;
		}
		if (Static71.aBoolean165 && local181) {
			if (local289) {
				Static112.aClass57_Sub1_44 = local313.aClass57_Sub1_24;
			}
			@Pc(367) int local367 = 0;
			if (this.anInt4119 != 0) {
				@Pc(378) int[][] local378 = Static280.anIntArrayArrayArray13[0];
				local367 = local227 - (local378[local104][local112] + local378[local94][local112] + local378[local94][local122] + local378[local104][local122] >> 2);
			}
			@Pc(411) Class57_Sub1 local411 = local313.aClass57_Sub1_24;
			if (this.aBoolean373 && Static15.method227(local411, local237, local367, local246)) {
				this.aBoolean373 = false;
			}
			if (!this.aBoolean373) {
				Static15.method217(local411, local237, local367, local246);
				this.aClass57_Sub1_31 = local411;
				this.anInt4113 = local237;
				if (local289) {
					Static112.aClass57_Sub1_44 = null;
				}
				this.anInt4128 = local367;
				this.anInt4111 = local246;
			}
		}
		this.anInt4124 = this.anInt4140;
		this.anInt4116 = local17.anInt4558;
		return local313.aClass11_9;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIIIIIJILclient!dh;)V")
	@Override
	public void method4299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class22_Sub3 arg10) {
		@Pc(7) Class11 local7 = this.method3561();
		if (local7 != null) {
			this.method3559(local7);
			local7.method4299(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass22_Sub3_7);
		}
	}
}
