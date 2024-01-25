import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class335 {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "[Z")
	private boolean[] aBooleanArray33;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
	private int anInt8393;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
	private int anInt8400;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
	private int anInt8404;

	@OriginalMember(owner = "client!ui", name = "w", descriptor = "Lclient!da;")
	private Class57 aClass57_7;

	@OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
	private int anInt8409;

	@OriginalMember(owner = "client!ui", name = "K", descriptor = "Lclient!ha;")
	private Class3_Sub3_Sub10 aClass3_Sub3_Sub10_6;

	@OriginalMember(owner = "client!ui", name = "L", descriptor = "Lclient!gp;")
	public Class9_Sub6 aClass9_Sub6_8;

	@OriginalMember(owner = "client!ui", name = "P", descriptor = "Lclient!as;")
	private Class17 aClass17_3;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
	private int anInt8398 = -1;

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
	private int anInt8407 = 0;

	@OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
	private int anInt8410 = 0;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
	private int anInt8397 = -1;

	@OriginalMember(owner = "client!ui", name = "I", descriptor = "Z")
	private boolean aBoolean652 = false;

	@OriginalMember(owner = "client!ui", name = "M", descriptor = "Z")
	private boolean aBoolean653 = false;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
	private int anInt8395 = -1;

	@OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
	public final int anInt8412;

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
	public final int anInt8405;

	@OriginalMember(owner = "client!ui", name = "A", descriptor = "B")
	private final byte aByte121;

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
	public final int anInt8396;

	@OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
	private int anInt8413;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "B")
	private final byte aByte120;

	@OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
	private int anInt8418;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Z")
	private final boolean aBoolean651;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!r;Lclient!bd;IIIIIIZI)V")
	public Class335(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt8412 = arg1.anInt764;
		this.anInt8405 = arg3;
		this.aByte121 = (byte) arg5;
		this.anInt8396 = arg2;
		this.aBoolean653 = arg8;
		this.anInt8413 = arg7;
		this.aByte120 = (byte) arg4;
		this.anInt8418 = arg6;
		this.aBoolean651 = arg0.method7162() && arg1.aBoolean66 && !this.aBoolean653;
		if (arg9 != -1) {
			this.aBoolean652 = true;
		}
		this.method7052(arg9);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLclient!r;)V")
	public void method7040(@OriginalArg(1) Class43 arg0) {
		if (this.aClass3_Sub3_Sub10_6 != null) {
			Static94.method2077(this.aClass3_Sub3_Sub10_6, this.aByte121, this.anInt8418, this.anInt8413, this.aBooleanArray33);
			this.aBooleanArray33 = null;
			this.aClass3_Sub3_Sub10_6 = null;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!r;I)V")
	public void method7041(@OriginalArg(0) Class43 arg0) {
		this.method7047(262144, this.anInt8413, arg0, true, true, this.anInt8418);
	}

	@OriginalMember(owner = "client!ui", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass9_Sub6_8 != null) {
			this.aClass9_Sub6_8.method3059();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
	private void method7043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass17_3 == null) {
				if (this.aBoolean652) {
					return;
				}
				this.method7052(-1);
				if (this.aClass17_3 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static305.anInt5560 - this.anInt8393;
			if (local30 > 100 && this.aClass17_3.anInt551 > 0) {
				@Pc(47) int local47 = this.aClass17_3.anIntArray55.length - this.aClass17_3.anInt551;
				while (this.anInt8409 < local47 && local30 > this.aClass17_3.anIntArray54[this.anInt8409]) {
					local30 -= this.aClass17_3.anIntArray54[this.anInt8409];
					this.anInt8409++;
				}
				if (local47 <= this.anInt8409) {
					@Pc(90) int local90 = 0;
					for (@Pc(92) int local92 = local47; local92 < this.aClass17_3.anIntArray55.length; local92++) {
						local90 += this.aClass17_3.anIntArray54[local92];
					}
					local30 %= local90;
				}
				this.anInt8404 = this.anInt8409 + 1;
				if (this.anInt8404 >= this.aClass17_3.anIntArray55.length) {
					this.anInt8404 -= this.aClass17_3.anInt551;
					if (this.anInt8404 < 0 || this.aClass17_3.anIntArray55.length <= this.anInt8404) {
						this.anInt8404 = -1;
					}
				}
			}
			while (this.aClass17_3.anIntArray54[this.anInt8409] < local30) {
				Static351.method5300(this.anInt8409, this.aClass17_3, arg1, arg0, this.aByte120, false);
				local30 -= this.aClass17_3.anIntArray54[this.anInt8409];
				this.anInt8409++;
				if (this.anInt8409 >= this.aClass17_3.anIntArray55.length) {
					this.anInt8409 -= this.aClass17_3.anInt551;
					if (this.anInt8409 < 0 || this.aClass17_3.anIntArray55.length <= this.anInt8409) {
						this.aClass17_3 = null;
						continue label80;
					}
				}
				this.anInt8404 = this.anInt8409 + 1;
				if (this.aClass17_3.anIntArray55.length <= this.anInt8404) {
					this.anInt8404 -= this.aClass17_3.anInt551;
					if (this.anInt8404 < 0 || this.anInt8404 >= this.aClass17_3.anIntArray55.length) {
						this.anInt8404 = -1;
					}
				}
			}
			this.anInt8393 = Static305.anInt5560 - local30;
			this.anInt8400 = local30;
			return;
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)I")
	public int method7044() {
		return this.anInt8407;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)Z")
	public boolean method7045() {
		return this.aBoolean651;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
	public void method7046(@OriginalArg(0) int arg0) {
		this.aBoolean652 = true;
		this.method7052(arg0);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBILclient!r;ZZI)Lclient!da;")
	public Class57 method7047(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class43 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(16) Class23 local16 = Static476.aClass69_5.method2181(this.anInt8412);
		if (local16.anIntArray78 != null) {
			local16 = local16.method587(Static427.aClass56_1);
		}
		if (local16 == null) {
			this.method7040(arg2);
			this.anInt8398 = -1;
			this.anInt8395 = -1;
			this.anInt8397 = -1;
			return null;
		}
		if (!this.aBoolean652 && local16.anInt764 != this.anInt8395) {
			this.aClass57_7 = null;
			this.method7052(-1);
		}
		this.method7043(arg5, arg1);
		if (arg4) {
			@Pc(77) boolean local77 = arg4 & this.aBoolean651 & Static278.aClass3_Sub13_Sub1_1.method4464(Static260.anInt4932) != 0;
			arg4 = local77 & (this.anInt8397 != local16.anInt764 || this.aClass17_3 != null && Static278.aClass3_Sub13_Sub1_1.method4464(Static260.anInt4932) >= 2 && (this.anInt8409 != this.anInt8398 || (this.aClass17_3.aBoolean46 || Static233.aBoolean341) && this.anInt8404 != this.anInt8409));
		}
		if (arg3 && !arg4) {
			this.anInt8395 = local16.anInt764;
			return null;
		}
		if (arg4) {
			Static94.method2077(this.aClass3_Sub3_Sub10_6, this.aByte121, this.anInt8418, this.anInt8413, this.aBooleanArray33);
			this.anInt8397 = -1;
			this.anInt8398 = -1;
		}
		@Pc(155) Class139 local155 = Static29.aClass139Array6[this.aByte121];
		@Pc(173) Class139 local173;
		if (this.aBoolean653) {
			local173 = Static374.aClass139Array17[0];
		} else {
			local173 = this.aByte121 < 3 ? Static29.aClass139Array6[this.aByte121 + 1] : null;
		}
		@Pc(181) Class57 local181 = null;
		if (this.aClass17_3 != null) {
			if (arg4) {
				arg0 |= 0x40000;
			}
			local181 = local16.method578(local173, this.anInt8400, arg2, local155, this.anInt8404, this.anInt8418, arg0, this.anInt8409, this.anInt8396 == 11 ? 10 : this.anInt8396, this.anInt8396 == 11 ? this.anInt8405 + 4 : this.anInt8405, local155.method6890(this.anInt8418, this.anInt8413), this.anInt8413, this.aClass17_3);
			if (local181 == null) {
				this.aClass3_Sub3_Sub10_6 = null;
				this.anInt8407 = 0;
				this.anInt8410 = 0;
				this.aBooleanArray33 = null;
			} else {
				if (arg4) {
					if (this.aBooleanArray33 == null) {
						this.aBooleanArray33 = new boolean[4];
					}
					this.aClass3_Sub3_Sub10_6 = local181.S(this.aClass3_Sub3_Sub10_6);
					Static27.method527(this.aClass3_Sub3_Sub10_6, this.aByte121, arg5, arg1, this.aBooleanArray33);
					this.anInt8397 = local16.anInt764;
					this.anInt8398 = this.anInt8409;
				}
				this.anInt8407 = local181.J();
				this.anInt8410 = local181.RA();
			}
			this.aClass57_7 = null;
		} else if (this.aClass57_7 != null && (this.aClass57_7.PA() & arg0) == arg0 && local16.anInt764 == this.anInt8395) {
			local181 = this.aClass57_7;
		} else {
			if (this.aClass57_7 != null) {
				arg0 |= this.aClass57_7.PA();
			}
			@Pc(255) Class163 local255 = local16.method580(arg4, local173, this.anInt8418, arg0, this.anInt8396 == 11 ? this.anInt8405 + 4 : this.anInt8405, this.anInt8396 == 11 ? 10 : this.anInt8396, local155.method6890(this.anInt8418, this.anInt8413), arg2, local155, this.anInt8413);
			if (local255 == null) {
				this.aClass57_7 = null;
				this.anInt8410 = 0;
				this.anInt8407 = 0;
				this.aClass3_Sub3_Sub10_6 = null;
				this.aBooleanArray33 = null;
			} else {
				local181 = local255.aClass57_5;
				this.aClass57_7 = local255.aClass57_5;
				if (arg4) {
					this.aClass3_Sub3_Sub10_6 = local255.aClass3_Sub3_Sub10_4;
					this.aBooleanArray33 = null;
					Static27.method527(this.aClass3_Sub3_Sub10_6, this.aByte121, arg5, arg1, null);
					this.anInt8397 = local16.anInt764;
					this.anInt8398 = -1;
				}
				this.anInt8407 = local181.J();
				this.anInt8410 = local181.RA();
			}
		}
		this.anInt8418 = arg5;
		this.anInt8395 = local16.anInt764;
		this.anInt8413 = arg1;
		return local181;
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)I")
	public int method7049() {
		return this.anInt8410;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIILclient!r;Lclient!q;ILclient!da;IZ)V")
	public void method7050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class43 arg3, @OriginalArg(4) Class109 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class57 arg6, @OriginalArg(8) boolean arg7) {
		@Pc(11) Class323[] local11 = arg6.method7503();
		@Pc(14) Class15[] local14 = arg6.method7516();
		if ((this.aClass9_Sub6_8 == null || this.aClass9_Sub6_8.aBoolean274) && (local11 != null || local14 != null)) {
			@Pc(31) Class23 local31 = Static476.aClass69_5.method2181(this.anInt8412);
			if (local31.anIntArray78 != null) {
				local31 = local31.method587(Static427.aClass56_1);
			}
			if (local31 != null) {
				this.aClass9_Sub6_8 = Static177.method3058(Static305.anInt5560, true);
			}
		}
		if (this.aClass9_Sub6_8 == null) {
			return;
		}
		arg6.method7525(arg4);
		if (arg7) {
			this.aClass9_Sub6_8.method3060(arg3, (long) Static305.anInt5560, local11, local14);
		} else {
			this.aClass9_Sub6_8.method3061((long) Static305.anInt5560);
		}
		this.aClass9_Sub6_8.method3049(this.aByte120, arg0, arg1, arg5, arg2);
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)V")
	private void method7052(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(21) Class23 local21 = Static476.aClass69_5.method2181(this.anInt8412);
			@Pc(23) Class23 local23 = local21;
			if (local21.anIntArray78 != null) {
				local21 = local21.method587(Static427.aClass56_1);
			}
			if (local21 == null) {
				return;
			}
			if (local21 == local23) {
				local23 = null;
			}
			if (local21.anIntArray77 != null) {
				if (this.aClass17_3 != null && local21.method582(this.aClass17_3.anInt561)) {
					return;
				}
				local7 = local21.method581();
				if (this.anInt8395 != local21.anInt764) {
					local9 = local21.aBoolean60;
				}
			} else if (local21.anInt773 == -1) {
				if (local23 != null && local23.anIntArray77 != null) {
					if (this.aClass17_3 != null && local23.method582(this.aClass17_3.anInt561)) {
						return;
					}
					local7 = local23.method581();
					if (this.anInt8395 != local23.anInt764) {
						local9 = local23.aBoolean60;
					}
				} else if (local23 != null && local23.anInt773 != -1 && local23.anInt764 != this.anInt8395) {
					local7 = local23.anInt773;
					local9 = local23.aBoolean60;
				}
			} else if (this.anInt8395 != local21.anInt764) {
				local9 = local21.aBoolean60;
				local7 = local21.anInt773;
			}
		}
		if (local7 == -1) {
			this.aClass17_3 = null;
			return;
		}
		this.aClass57_7 = null;
		if (this.aClass17_3 == null || this.aClass17_3.anInt561 != local7) {
			this.aClass17_3 = Static330.aClass279_2.method6216(local7);
		} else if (this.aClass17_3.anInt555 == 0) {
			return;
		}
		if (this.aClass17_3.anIntArray55 == null) {
			this.aClass17_3 = null;
			return;
		}
		if (local9) {
			this.anInt8409 = (int) (Math.random() * (double) this.aClass17_3.anIntArray55.length);
			this.anInt8400 = (int) (Math.random() * (double) this.aClass17_3.anIntArray54[this.anInt8409]) + 1;
		} else {
			this.anInt8400 = 1;
			this.anInt8409 = 0;
		}
		this.anInt8404 = this.anInt8409 + 1;
		if (this.anInt8404 < 0 || this.anInt8404 >= this.aClass17_3.anIntArray55.length) {
			this.anInt8404 = -1;
		}
		this.anInt8393 = Static305.anInt5560 - this.anInt8400;
	}
}
