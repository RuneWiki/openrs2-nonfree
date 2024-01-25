import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class280 {

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
	private int anInt7537;

	@OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
	private int anInt7538;

	@OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
	private int anInt7541;

	@OriginalMember(owner = "client!pw", name = "l", descriptor = "I")
	private int anInt7544;

	@OriginalMember(owner = "client!pw", name = "o", descriptor = "Lclient!em;")
	public Class4_Sub4 aClass4_Sub4_5;

	@OriginalMember(owner = "client!pw", name = "t", descriptor = "Lclient!ka;")
	private Class187 aClass187_6;

	@OriginalMember(owner = "client!pw", name = "B", descriptor = "[Z")
	private boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!pw", name = "E", descriptor = "Lclient!vga;")
	private Class362 aClass362_1;

	@OriginalMember(owner = "client!pw", name = "H", descriptor = "Lclient!r;")
	private Class5_Sub5_Sub14 aClass5_Sub5_Sub14_5;

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
	private int anInt7536 = 0;

	@OriginalMember(owner = "client!pw", name = "m", descriptor = "Z")
	private boolean aBoolean540 = false;

	@OriginalMember(owner = "client!pw", name = "n", descriptor = "I")
	private int anInt7545 = -1;

	@OriginalMember(owner = "client!pw", name = "v", descriptor = "I")
	private int anInt7549 = -1;

	@OriginalMember(owner = "client!pw", name = "D", descriptor = "I")
	private int anInt7555 = 0;

	@OriginalMember(owner = "client!pw", name = "p", descriptor = "Z")
	private boolean aBoolean541 = false;

	@OriginalMember(owner = "client!pw", name = "r", descriptor = "I")
	private int anInt7547 = -1;

	@OriginalMember(owner = "client!pw", name = "f", descriptor = "Lclient!ov;")
	private final Class4_Sub2 aClass4_Sub2_19;

	@OriginalMember(owner = "client!pw", name = "w", descriptor = "B")
	private final byte aByte108;

	@OriginalMember(owner = "client!pw", name = "s", descriptor = "B")
	private final byte aByte107;

	@OriginalMember(owner = "client!pw", name = "q", descriptor = "I")
	public final int anInt7546;

	@OriginalMember(owner = "client!pw", name = "L", descriptor = "I")
	public final int anInt7560;

	@OriginalMember(owner = "client!pw", name = "K", descriptor = "I")
	public final int anInt7559;

	@OriginalMember(owner = "client!pw", name = "J", descriptor = "Z")
	private final boolean aBoolean542;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lclient!ha;Lclient!jl;IIIILclient!ov;ZI)V")
	public Class280(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class4_Sub2 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.aBoolean541 = arg7;
		this.aClass4_Sub2_19 = arg6;
		this.aByte108 = (byte) arg5;
		this.aByte107 = (byte) arg4;
		this.anInt7546 = arg1.anInt4758;
		this.anInt7560 = arg3;
		this.anInt7559 = arg2;
		this.aBoolean542 = arg0.method7270() && arg1.aBoolean348 && !this.aBoolean541;
		if (arg8 != -1) {
			this.aBoolean540 = true;
		}
		this.method6676(arg8);
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILclient!ha;IILclient!tc;Lclient!ka;ZII)V")
	public void method6675(@OriginalArg(0) int arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class113 arg3, @OriginalArg(5) Class187 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) Class261[] local14 = arg4.method8650();
		@Pc(17) Class320[] local17 = arg4.method8636();
		if ((this.aClass4_Sub4_5 == null || this.aClass4_Sub4_5.aBoolean174) && (local14 != null || local17 != null)) {
			@Pc(34) Class181 local34 = Static61.aClass246_7.method5497(this.anInt7546);
			if (local34.anIntArray235 != null) {
				local34 = local34.method4279(Static301.aClass59_1);
			}
			if (local34 != null) {
				this.aClass4_Sub4_5 = Static131.method1960(Static631.anInt10493, true);
			}
		}
		if (this.aClass4_Sub4_5 == null) {
			return;
		}
		arg4.method8638(arg3);
		if (arg5) {
			this.aClass4_Sub4_5.method1966(arg1, (long) Static631.anInt10493, local14, local17);
		} else {
			this.aClass4_Sub4_5.method1956((long) Static631.anInt10493);
		}
		this.aClass4_Sub4_5.method1965(this.aByte107, arg7, arg6, arg0, arg2);
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(II)V")
	private void method6676(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class181 local19 = Static61.aClass246_7.method5497(this.anInt7546);
			@Pc(21) Class181 local21 = local19;
			if (local19.anIntArray235 != null) {
				local19 = local19.method4279(Static301.aClass59_1);
			}
			if (local19 == null) {
				return;
			}
			if (local21 == local19) {
				local21 = null;
			}
			if (local19.anIntArray236 != null) {
				if (this.aClass362_1 != null && local19.method4271(this.aClass362_1.anInt10004)) {
					return;
				}
				local7 = local19.method4287();
				if (local19.anInt4758 != this.anInt7547) {
					local9 = local19.aBoolean340;
				}
			} else if (local19.anInt4784 == -1) {
				if (local21 != null && local21.anIntArray236 != null) {
					if (this.aClass362_1 != null && local21.method4271(this.aClass362_1.anInt10004)) {
						return;
					}
					local7 = local21.method4287();
					if (local21.anInt4758 != this.anInt7547) {
						local9 = local21.aBoolean340;
					}
				} else if (local21 != null && local21.anInt4784 != -1 && this.anInt7547 != local21.anInt4758) {
					local7 = local21.anInt4784;
					local9 = local21.aBoolean340;
				}
			} else if (local19.anInt4758 != this.anInt7547) {
				local7 = local19.anInt4784;
				local9 = local19.aBoolean340;
			}
		}
		if (local7 == -1) {
			this.aClass362_1 = null;
			return;
		}
		this.aClass187_6 = null;
		if (this.aClass362_1 == null || this.aClass362_1.anInt10004 != local7) {
			this.aClass362_1 = Static435.aClass298_1.method7034(local7);
		} else if (this.aClass362_1.anInt10002 == 0) {
			return;
		}
		if (this.aClass362_1.anIntArray571 == null) {
			this.aClass362_1 = null;
			return;
		}
		if (local9) {
			this.anInt7537 = (int) (Math.random() * (double) this.aClass362_1.anIntArray571.length);
			this.anInt7544 = (int) (Math.random() * (double) this.aClass362_1.anIntArray573[this.anInt7537]) + 1;
		} else {
			this.anInt7544 = 1;
			this.anInt7537 = 0;
		}
		this.anInt7538 = this.anInt7537 + 1;
		if (this.anInt7538 < 0 || this.anInt7538 >= this.aClass362_1.anIntArray571.length) {
			this.anInt7538 = -1;
		}
		this.anInt7541 = Static631.anInt10493 - this.anInt7544;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)Z")
	public boolean method6677() {
		return this.aBoolean542;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)I")
	public int method6678(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.aClass187_6 = null;
		}
		return this.anInt7555;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZZILclient!ha;I)Lclient!ka;")
	public Class187 method6679(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class133 arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class181 local13 = Static61.aClass246_7.method5497(this.anInt7546);
		if (local13.anIntArray235 != null) {
			local13 = local13.method4279(Static301.aClass59_1);
		}
		if (local13 == null) {
			this.method6686(arg2);
			this.anInt7547 = -1;
			this.anInt7549 = -1;
			this.anInt7545 = -1;
			return null;
		}
		if (!this.aBoolean540 && local13.anInt4758 != this.anInt7547) {
			this.aClass187_6 = null;
			this.method6676(-1);
		}
		this.method6681(this.aClass4_Sub2_19);
		if (arg1) {
			@Pc(81) boolean local81 = arg1 & this.aBoolean542 & Static97.aClass5_Sub25_8.aClass6_Sub29_1.method8542() != 0;
			arg1 = local81 & (local13.anInt4758 != this.anInt7549 || this.aClass362_1 != null && Static97.aClass5_Sub25_8.aClass6_Sub29_1.method8542() >= 2 && (this.anInt7537 != this.anInt7545 || (this.aClass362_1.aBoolean721 || Static23.aBoolean14) && this.anInt7538 != this.anInt7537));
		}
		if (arg0 && !arg1) {
			this.anInt7547 = local13.anInt4758;
			return null;
		}
		if (arg1) {
			Static258.method4241(this.aClass5_Sub5_Sub14_5, this.aByte108, this.aClass4_Sub2_19.anInt10231, this.aClass4_Sub2_19.anInt10229, this.aBooleanArray23);
			this.anInt7545 = -1;
			this.anInt7549 = -1;
		}
		@Pc(165) Class61 local165 = Static11.aClass61Array1[this.aByte108];
		@Pc(183) Class61 local183;
		if (this.aBoolean541) {
			local183 = Static20.aClass61Array2[0];
		} else {
			local183 = this.aByte108 >= 3 ? null : Static11.aClass61Array1[this.aByte108 + 1];
		}
		@Pc(191) Class187 local191 = null;
		if (this.aClass362_1 != null) {
			if (arg1) {
				arg3 |= 0x40000;
			}
			local191 = local13.method4288(this.aClass4_Sub2_19.anInt10231, this.aClass362_1, this.anInt7559 == 11 ? 10 : this.anInt7559, this.anInt7537, local183, arg2, local165, this.anInt7559 == 11 ? this.anInt7560 + 4 : this.anInt7560, arg3, local165.method8584(this.aClass4_Sub2_19.anInt10229, this.aClass4_Sub2_19.anInt10231), this.anInt7544, this.aClass4_Sub2_19.anInt10229, this.anInt7538);
			if (local191 == null) {
				this.aBooleanArray23 = null;
				this.anInt7536 = 0;
				this.anInt7555 = 0;
				this.aClass5_Sub5_Sub14_5 = null;
			} else {
				if (arg1) {
					if (this.aBooleanArray23 == null) {
						this.aBooleanArray23 = new boolean[4];
					}
					this.aClass5_Sub5_Sub14_5 = local191.ba(this.aClass5_Sub5_Sub14_5);
					Static208.method3588(this.aClass5_Sub5_Sub14_5, this.aByte108, this.aClass4_Sub2_19.anInt10231, this.aClass4_Sub2_19.anInt10229, this.aBooleanArray23);
					this.anInt7545 = this.anInt7537;
					this.anInt7549 = local13.anInt4758;
				}
				this.anInt7536 = local191.fa();
				this.anInt7555 = local191.ma();
			}
			this.aClass187_6 = null;
		} else if (this.aClass187_6 != null && (this.aClass187_6.ua() & arg3) == arg3 && this.anInt7547 == local13.anInt4758) {
			local191 = this.aClass187_6;
		} else {
			if (this.aClass187_6 != null) {
				arg3 |= this.aClass187_6.ua();
			}
			@Pc(268) Class94 local268 = local13.method4282(this.aClass4_Sub2_19.anInt10231, local165.method8584(this.aClass4_Sub2_19.anInt10229, this.aClass4_Sub2_19.anInt10231), arg3, this.anInt7559 == 11 ? 10 : this.anInt7559, local183, local165, arg1, arg2, this.anInt7559 == 11 ? this.anInt7560 + 4 : this.anInt7560, this.aClass4_Sub2_19.anInt10229);
			if (local268 == null) {
				this.anInt7536 = 0;
				this.anInt7555 = 0;
				this.aBooleanArray23 = null;
				this.aClass5_Sub5_Sub14_5 = null;
				this.aClass187_6 = null;
			} else {
				local191 = local268.aClass187_1;
				this.aClass187_6 = local268.aClass187_1;
				if (arg1) {
					this.aBooleanArray23 = null;
					this.aClass5_Sub5_Sub14_5 = local268.aClass5_Sub5_Sub14_1;
					Static208.method3588(this.aClass5_Sub5_Sub14_5, this.aByte108, this.aClass4_Sub2_19.anInt10231, this.aClass4_Sub2_19.anInt10229, null);
					this.anInt7549 = local13.anInt4758;
					this.anInt7545 = -1;
				}
				this.anInt7536 = local191.fa();
				this.anInt7555 = local191.ma();
			}
		}
		this.anInt7547 = local13.anInt4758;
		return local191;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILclient!ha;)V")
	public void method6680(@OriginalArg(1) Class133 arg0) {
		this.method6679(true, true, arg0, 262144);
	}

	@OriginalMember(owner = "client!pw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub4_5 != null) {
			this.aClass4_Sub4_5.method1962();
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(BLclient!ov;)V")
	private void method6681(@OriginalArg(1) Class4_Sub2 arg0) {
		label80: while (true) {
			if (this.aClass362_1 == null) {
				if (this.aBoolean540) {
					return;
				}
				this.method6676(-1);
				if (this.aClass362_1 == null) {
					return;
				}
			}
			@Pc(34) int local34 = Static631.anInt10493 - this.anInt7541;
			if (local34 > 100 && this.aClass362_1.anInt9996 > 0) {
				@Pc(53) int local53 = this.aClass362_1.anIntArray571.length - this.aClass362_1.anInt9996;
				while (local53 > this.anInt7537 && local34 > this.aClass362_1.anIntArray573[this.anInt7537]) {
					local34 -= this.aClass362_1.anIntArray573[this.anInt7537];
					this.anInt7537++;
				}
				if (this.anInt7537 >= local53) {
					@Pc(92) int local92 = 0;
					for (@Pc(94) int local94 = local53; local94 < this.aClass362_1.anIntArray571.length; local94++) {
						local92 += this.aClass362_1.anIntArray573[local94];
					}
					local34 %= local92;
				}
				this.anInt7538 = this.anInt7537 + 1;
				if (this.anInt7538 >= this.aClass362_1.anIntArray571.length) {
					this.anInt7538 -= this.aClass362_1.anInt9996;
					if (this.anInt7538 < 0 || this.anInt7538 >= this.aClass362_1.anIntArray571.length) {
						this.anInt7538 = -1;
					}
				}
			}
			while (local34 > this.aClass362_1.anIntArray573[this.anInt7537]) {
				Static67.method1108(arg0, this.anInt7537, this.aClass362_1);
				local34 -= this.aClass362_1.anIntArray573[this.anInt7537];
				this.anInt7537++;
				if (this.aClass362_1.anIntArray571.length <= this.anInt7537) {
					this.anInt7537 -= this.aClass362_1.anInt9996;
					if (this.anInt7537 < 0 || this.anInt7537 >= this.aClass362_1.anIntArray571.length) {
						this.aClass362_1 = null;
						continue label80;
					}
				}
				this.anInt7538 = this.anInt7537 + 1;
				if (this.aClass362_1.anIntArray571.length <= this.anInt7538) {
					this.anInt7538 -= this.aClass362_1.anInt9996;
					if (this.anInt7538 < 0 || this.aClass362_1.anIntArray571.length <= this.anInt7538) {
						this.anInt7538 = -1;
					}
				}
			}
			this.anInt7541 = Static631.anInt10493 - local34;
			this.anInt7544 = local34;
			return;
		}
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(II)V")
	public void method6682(@OriginalArg(1) int arg0) {
		this.aBoolean540 = true;
		this.method6676(arg0);
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)I")
	public int method6683() {
		return this.anInt7536;
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(ILclient!ha;)V")
	public void method6686(@OriginalArg(1) Class133 arg0) {
		if (this.aClass5_Sub5_Sub14_5 != null) {
			Static258.method4241(this.aClass5_Sub5_Sub14_5, this.aByte108, this.aClass4_Sub2_19.anInt10231, this.aClass4_Sub2_19.anInt10229, this.aBooleanArray23);
			this.aBooleanArray23 = null;
			this.aClass5_Sub5_Sub14_5 = null;
		}
	}
}
