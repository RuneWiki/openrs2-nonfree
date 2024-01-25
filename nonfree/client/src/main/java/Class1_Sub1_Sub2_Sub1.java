import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class1_Sub1_Sub2_Sub1 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!hca", name = "wc", descriptor = "I")
	public int anInt3247;

	@OriginalMember(owner = "client!hca", name = "zc", descriptor = "Lclient!jk;")
	public Class146 aClass146_1;

	@OriginalMember(owner = "client!hca", name = "Cc", descriptor = "Ljava/lang/String;")
	public String aString82;

	@OriginalMember(owner = "client!hca", name = "Gc", descriptor = "Ljava/lang/String;")
	public String aString83;

	@OriginalMember(owner = "client!hca", name = "Sc", descriptor = "I")
	private int anInt3263;

	@OriginalMember(owner = "client!hca", name = "dd", descriptor = "I")
	public int anInt3273;

	@OriginalMember(owner = "client!hca", name = "Ac", descriptor = "B")
	private byte aByte48 = 0;

	@OriginalMember(owner = "client!hca", name = "vc", descriptor = "I")
	public int anInt3246 = -1;

	@OriginalMember(owner = "client!hca", name = "Kc", descriptor = "I")
	public int anInt3255 = 0;

	@OriginalMember(owner = "client!hca", name = "Bc", descriptor = "I")
	public int anInt3249 = -1;

	@OriginalMember(owner = "client!hca", name = "Fc", descriptor = "I")
	public int anInt3252 = 0;

	@OriginalMember(owner = "client!hca", name = "yc", descriptor = "I")
	public int anInt3248 = -1;

	@OriginalMember(owner = "client!hca", name = "fd", descriptor = "I")
	public int anInt3274 = -1;

	@OriginalMember(owner = "client!hca", name = "ed", descriptor = "B")
	private byte aByte50 = 0;

	@OriginalMember(owner = "client!hca", name = "Nc", descriptor = "I")
	public int anInt3258 = 0;

	@OriginalMember(owner = "client!hca", name = "Jc", descriptor = "B")
	private byte aByte49 = 0;

	@OriginalMember(owner = "client!hca", name = "gd", descriptor = "Z")
	public boolean aBoolean259 = false;

	@OriginalMember(owner = "client!hca", name = "bd", descriptor = "I")
	public int anInt3271 = -1;

	@OriginalMember(owner = "client!hca", name = "id", descriptor = "I")
	public int anInt3276 = 0;

	@OriginalMember(owner = "client!hca", name = "Xc", descriptor = "I")
	public int anInt3267 = 0;

	@OriginalMember(owner = "client!hca", name = "jd", descriptor = "I")
	public int anInt3277 = -1;

	@OriginalMember(owner = "client!hca", name = "Zc", descriptor = "I")
	public int anInt3269 = 255;

	@OriginalMember(owner = "client!hca", name = "Uc", descriptor = "I")
	public int anInt3265 = -1;

	@OriginalMember(owner = "client!hca", name = "Wc", descriptor = "Z")
	public boolean aBoolean258 = false;

	@OriginalMember(owner = "client!hca", name = "nd", descriptor = "I")
	public int anInt3281 = -1;

	@OriginalMember(owner = "client!hca", name = "sd", descriptor = "Z")
	public boolean aBoolean260 = false;

	static {
		new Class202("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
		new Class202("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILclient!ps;)V")
	public void method2942(@OriginalArg(1) Class2_Sub29 arg0) {
		arg0.anInt6132 = 0;
		@Pc(12) int local12 = arg0.method5170();
		this.aByte49 = (byte) (local12 & 0x1);
		@Pc(26) boolean local26 = (local12 & 0x2) != 0;
		@Pc(37) boolean local37 = (local12 & 0x4) != 0;
		@Pc(41) int local41 = super.method4394();
		this.method4388((local12 >> 3 & 0x7) + 1);
		this.aByte48 = (byte) (local12 >> 6 & 0x3);
		super.anInt7660 += this.method4394() - local41 << 6;
		super.anInt7659 += this.method4394() - local41 << 6;
		this.aByte50 = arg0.method5179();
		this.anInt3265 = arg0.method5179();
		this.anInt3277 = arg0.method5179();
		this.anInt3258 = 0;
		@Pc(111) int local111 = -1;
		@Pc(114) int[] local114 = new int[12];
		@Pc(137) int local137;
		@Pc(144) int local144;
		@Pc(186) int local186;
		for (@Pc(116) int local116 = 0; local116 < 12; local116++) {
			@Pc(122) int local122 = arg0.method5170();
			if (local122 == 0) {
				local114[local116] = 0;
			} else {
				local137 = arg0.method5170();
				local144 = (local122 << 8) + local137;
				if (local116 == 0 && local144 == 65535) {
					local111 = arg0.method5229();
					this.anInt3258 = arg0.method5170();
					break;
				}
				if (local144 >= 32768) {
					local144 = Static286.anIntArray463[local144 - 32768];
					local114[local116] = local144 | 0x40000000;
					local186 = Static464.aClass115_1.method2970(local144).anInt8936;
					if (local186 != 0) {
						this.anInt3258 = local186;
					}
				} else {
					local114[local116] = Integer.MIN_VALUE | local144 - 256;
				}
			}
		}
		@Pc(210) int[] local210 = new int[5];
		for (local137 = 0; local137 < 5; local137++) {
			local144 = arg0.method5170();
			if (local144 < 0 || Static225.aShortArrayArray4[local137].length <= local144) {
				local144 = 0;
			}
			local210[local137] = local144;
		}
		this.anInt3263 = arg0.method5229();
		this.aString82 = arg0.method5194();
		if (local26) {
			this.aString83 = arg0.method5194();
		} else {
			this.aString83 = this.aString82;
		}
		this.anInt3252 = arg0.method5170();
		if (local37) {
			this.anInt3267 = arg0.method5229();
			this.anInt3276 = this.anInt3252;
			this.anInt3274 = -1;
		} else {
			this.anInt3267 = 0;
			this.anInt3276 = arg0.method5170();
			this.anInt3274 = arg0.method5170();
			if (this.anInt3274 == 255) {
				this.anInt3274 = -1;
			}
		}
		local144 = this.anInt3255;
		this.anInt3255 = arg0.method5170();
		@Pc(320) int local320;
		if (this.anInt3255 == 0) {
			Static532.method7663(this);
		} else {
			local186 = this.anInt3281;
			@Pc(317) int local317 = this.anInt3249;
			local320 = this.anInt3246;
			@Pc(323) int local323 = this.anInt3248;
			@Pc(326) int local326 = this.anInt3269;
			this.anInt3281 = arg0.method5229();
			this.anInt3249 = arg0.method5229();
			this.anInt3246 = arg0.method5229();
			this.anInt3248 = arg0.method5229();
			this.anInt3269 = arg0.method5170();
			if (local144 != this.anInt3255 || this.anInt3281 != local186 || this.anInt3249 != local317 || this.anInt3246 != local320 || this.anInt3248 != local323 || this.anInt3269 != local326) {
				Static261.method4060(this);
			}
		}
		if (this.aClass146_1 == null) {
			this.aClass146_1 = new Class146();
		}
		local186 = this.aClass146_1.anInt4084;
		@Pc(415) int[] local415 = this.aClass146_1.anIntArray412;
		this.aClass146_1.method3575(local111, this.aByte49 == 1, local114, local210, this.method4395());
		if (local186 != local111) {
			super.anInt7660 = (super.anIntArray450[0] << 7) + (this.method4394() << 6);
			super.anInt7659 = (super.anIntArray449[0] << 7) + (this.method4394() << 6);
		}
		if (super.anInt5076 == Static174.anInt3154 && local415 != null) {
			for (local320 = 0; local320 < local210.length; local320++) {
				if (local210[local320] != local415[local320]) {
					Static464.aClass115_1.method2974();
					break;
				}
			}
		}
		if (super.aClass6_Sub7_6 != null) {
			super.aClass6_Sub7_6.method6396();
		}
		if (super.anInt5063 == -1 || !super.aBoolean385) {
			return;
		}
		@Pc(515) Class24 local515 = this.method4393();
		if (!local515.method710(super.anInt5063)) {
			super.aBoolean385 = false;
			super.anInt5063 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIILclient!r;ILclient!m;Lclient!qa;Z)V")
	private void method2943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class63 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class181 arg5, @OriginalArg(6) Class39 arg6) {
		@Pc(15) int local15 = arg1 * arg1 + arg2 * arg2;
		if (local15 < 16384 || local15 > arg4) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg2, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
		@Pc(51) Class63 local51 = Static409.method6415(super.anInt5083, local39, arg6, super.anInt5070, super.anInt5072, arg0);
		if (local51 != null) {
			arg6.method6058(false);
			local51.method7700(arg5, null, 0);
			arg6.method6058(true);
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7673(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass146_1 == null || !this.method2945(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class181 local19 = arg1.method6022();
		@Pc(24) int local24 = super.aClass151_7.method3664();
		local19.ma(local24);
		local19.TA(super.anInt7660, super.anInt7657, super.anInt7659);
		@Pc(50) boolean local50 = false;
		for (@Pc(52) int local52 = 0; local52 < super.aClass63Array3.length; local52++) {
			if (super.aClass63Array3[local52] != null && super.aClass63Array3[local52].method7697(arg0, arg2, local19, true)) {
				local50 = true;
				break;
			}
		}
		super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = super.aClass63Array3[3] = null;
		return local50;
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)I")
	@Override
	public int method4384() {
		return -1;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!qa;IB)Z")
	private boolean method2945(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class24 local11 = this.method4393();
		@Pc(37) Class4 local37 = super.anInt5051 != -1 && super.anInt5094 == 0 ? Static396.aClass157_2.method3745(super.anInt5051) : null;
		@Pc(58) Class4 local58 = super.anInt5063 == -1 || this.aBoolean258 || super.aBoolean385 && local37 != null ? null : Static396.aClass157_2.method3745(super.anInt5063);
		@Pc(61) int local61 = local11.anInt649;
		@Pc(64) int local64 = local11.anInt670;
		if (local61 != 0 || local64 != 0 || local11.anInt647 != 0 || local11.anInt654 != 0) {
			arg1 |= 0x7;
		}
		@Pc(96) boolean local96 = super.aByte71 != 0 && super.anInt5091 <= Static115.anInt2326 && Static115.anInt2326 < super.anInt5095;
		if (local96) {
			arg1 |= 0x80000;
		}
		@Pc(137) Class63 local137 = super.aClass63Array3[0] = this.aClass146_1.method3577(super.anInt5030, super.aClass149Array3, super.anInt5029, local37, super.anInt5071, Static396.aClass157_2, Static84.aClass302_1, Static464.aClass115_1, super.anInt5032, Static492.aClass218_1, Static289.aClass125_1, local58, super.anInt5080, arg0, arg1, super.anInt5037, Static21.aClass255_2);
		@Pc(140) int local140 = Static26.method601();
		if (Static78.anInt1651 < 96 && local140 > 50) {
			Static386.method6005();
		}
		@Pc(162) int local162;
		if (Static414.aClass320_17 != Static455.aClass320_15 && local140 < 50) {
			local162 = 50 - local140;
			while (Static279.anInt5136 < local162) {
				Static24.aByteArrayArray1[Static279.anInt5136] = new byte[102400];
				Static279.anInt5136++;
			}
			while (Static279.anInt5136 > local162) {
				Static279.anInt5136--;
				Static24.aByteArrayArray1[Static279.anInt5136] = null;
			}
		} else if (Static455.aClass320_15 != Static414.aClass320_17) {
			Static279.anInt5136 = 0;
			Static24.aByteArrayArray1 = new byte[50][];
		}
		if (local137 == null) {
			return false;
		}
		super.anInt5045 = local137.TA();
		this.method4389(local137);
		local162 = super.aClass151_7.method3664();
		if (local61 == 0 && local64 == 0) {
			this.method4386(local162, 0, this.method4394() << 7, 0, this.method4394() << 7);
		} else {
			this.method4386(local162, local11.anInt674, local64, local11.anInt657, local61);
			if (super.anInt5070 != 0) {
				local137.D(super.anInt5070);
			}
			if (super.anInt5072 != 0) {
				local137.b(super.anInt5072);
			}
			if (super.anInt5083 != 0) {
				local137.ca(0, super.anInt5083, 0);
			}
		}
		if (local96) {
			local137.method7694(super.aByte70, super.aByte72, super.aByte69, super.aByte71 & 0xFF);
		}
		@Pc(323) Class226 local323;
		@Pc(340) boolean local340;
		@Pc(342) int local342;
		@Pc(388) Class63 local388;
		if (this.aBoolean258 || super.anInt5097 == -1 || super.anInt5031 == -1) {
			super.aClass63Array3[1] = null;
		} else {
			local323 = Static305.aClass14_1.method555(super.anInt5097);
			local340 = local323.aByte89 == 3 && (local61 != 0 || local64 != 0);
			local342 = local7;
			if (local340) {
				local342 = local7 | 0x7;
			} else {
				if (super.anInt5077 != 0) {
					local342 = local7 | 0x5;
				}
				if (super.anInt5074 != 0) {
					local342 |= 0x2;
				}
			}
			local388 = super.aClass63Array3[1] = local323.method5917(arg0, local342, super.anInt5050, Static396.aClass157_2, super.anInt5031, super.anInt5081);
			if (local388 != null) {
				if (super.anInt5074 != 0) {
					local388.ca(0, -super.anInt5074 << 0, 0);
				}
				if (super.anInt5077 != 0) {
					local388.OA(super.anInt5077 * 2048);
				}
				if (local340) {
					if (super.anInt5070 != 0) {
						local388.D(super.anInt5070);
					}
					if (super.anInt5072 != 0) {
						local388.b(super.anInt5072);
					}
					if (super.anInt5083 != 0) {
						local388.ca(0, super.anInt5083, 0);
					}
				}
			}
		}
		if (this.aBoolean258 || super.anInt5060 == -1 || super.anInt5034 == -1) {
			super.aClass63Array3[3] = null;
		} else {
			local323 = Static305.aClass14_1.method555(super.anInt5060);
			local340 = local323.aByte89 == 3 && (local61 != 0 || local64 != 0);
			local342 = local7;
			if (local340) {
				local342 = local7 | 0x7;
			} else {
				if (super.anInt5099 != 0) {
					local342 = local7 | 0x5;
				}
				if (super.anInt5067 != 0) {
					local342 |= 0x2;
				}
			}
			local388 = super.aClass63Array3[3] = local323.method5915(super.anInt5034, arg0, super.anInt5041, super.anInt5101, local342, Static396.aClass157_2);
			if (local388 != null) {
				if (super.anInt5067 != 0) {
					local388.ca(0, -super.anInt5067 << 0, 0);
				}
				if (super.anInt5099 != 0) {
					local388.OA(super.anInt5099 * 2048);
				}
				if (local340) {
					if (super.anInt5070 != 0) {
						local388.D(super.anInt5070);
					}
					if (super.anInt5072 != 0) {
						local388.b(super.anInt5072);
					}
					if (super.anInt5083 != 0) {
						local388.ca(0, super.anInt5083, 0);
					}
				}
			}
		}
		super.aClass63Array3[2] = null;
		if (!this.aBoolean258 && super.aClass2_Sub47_3 != null) {
			if (Static115.anInt2326 >= super.aClass2_Sub47_3.anInt9145) {
				super.aClass2_Sub47_3 = null;
			} else if (Static115.anInt2326 >= super.aClass2_Sub47_3.anInt9135) {
				@Pc(626) Class63 local626 = super.aClass2_Sub47_3.method7632(arg0, local7 | 0x7);
				if (local626 != null) {
					local626.ca(super.aClass2_Sub47_3.anInt9136 - super.anInt7660, -super.anInt7657 + super.aClass2_Sub47_3.anInt9143, super.aClass2_Sub47_3.anInt9140 - super.anInt7659);
					if (local162 != 0) {
						local626.OA(-local162 & 0x3FFF);
					}
					super.aClass63Array3[2] = local626;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)V")
	@Override
	public void method7675() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hca", name = "e", descriptor = "(I)I")
	@Override
	public int method6432() {
		return super.anInt5045;
	}

	@OriginalMember(owner = "client!hca", name = "i", descriptor = "(I)Z")
	public boolean method2947() {
		return this.aClass146_1 != null;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method2948() {
		@Pc(7) String local7 = "";
		if (Static154.aStringArray16 != null) {
			local7 = local7 + Static154.aStringArray16[this.aByte48];
		}
		@Pc(36) int[] local36;
		if (this.aByte49 == 1 && Static8.anIntArray16 != null) {
			local36 = Static8.anIntArray16;
		} else {
			local36 = Static490.anIntArray606;
		}
		if (local36 != null && local36[this.aByte48] != -1) {
			@Pc(57) Class251 local57 = Static171.aClass17_1.method621(local36[this.aByte48]);
			if (local57.aChar5 == 's') {
				local7 = local7 + local57.method6537(this.aByte50 & 0xFF);
			} else {
				Static459.method6984("gdn1", new Throwable());
				local36[this.aByte48] = -1;
			}
		}
		local7 = local7 + this.aString82;
		if (Static105.aStringArray9 != null) {
			local7 = local7 + Static105.aStringArray9[this.aByte48];
		}
		return local7;
	}

	@OriginalMember(owner = "client!hca", name = "h", descriptor = "(I)I")
	@Override
	public int method4394() {
		return this.aClass146_1 == null || this.aClass146_1.anInt4084 == -1 ? super.method4394() : Static21.aClass255_2.method6583(this.aClass146_1.anInt4084).anInt313;
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7671() {
		return false;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IZI)V")
	public void method2949(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt5104 = 0;
		super.anIntArray450[0] = arg0;
		super.anInt5102 = 0;
		super.anInt5105 = 0;
		super.anIntArray449[0] = arg1;
		@Pc(32) int local32 = this.method4394();
		super.anInt7659 = super.anIntArray449[0] * 128 + local32 * 64;
		super.anInt7660 = local32 * 64 + super.anIntArray450[0] * 128;
		if (Static266.aClass1_Sub1_Sub2_Sub1_1 == this) {
			Static330.method3998();
		}
		if (super.aClass6_Sub7_6 != null) {
			super.aClass6_Sub7_6.method6396();
		}
	}

	@OriginalMember(owner = "client!hca", name = "f", descriptor = "(B)I")
	@Override
	protected int method4395() {
		return this.anInt3263;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IBII)V")
	public void method2951(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt5102 < 9) {
			super.anInt5102++;
		}
		for (@Pc(20) int local20 = super.anInt5102; local20 > 0; local20--) {
			super.anIntArray450[local20] = super.anIntArray450[local20 - 1];
			super.anIntArray449[local20] = super.anIntArray449[local20 - 1];
			super.aByteArray87[local20] = super.aByteArray87[local20 - 1];
		}
		super.anIntArray450[0] = arg2;
		super.anIntArray449[0] = arg0;
		super.aByteArray87[0] = arg1;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method2952() {
		return this.aString83;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILclient!qa;)Lclient!lb;")
	@Override
	public Class6_Sub5 method7680(@OriginalArg(1) Class39 arg0) {
		if (this.aClass146_1 == null || !this.method2945(arg0, 2048)) {
			return null;
		}
		@Pc(25) Class181 local25 = arg0.method6022();
		@Pc(32) int local32 = super.aClass151_7.method3664();
		local25.ma(local32);
		local25.TA(super.anInt7660, super.anInt7657, super.anInt7659);
		@Pc(46) float local46 = arg0.P();
		@Pc(49) float local49 = arg0.ra();
		@Pc(110) int local110;
		if (Static281.aClass2_Sub19_Sub1_1.aBoolean188) {
			@Pc(56) Class24 local56 = this.method4393();
			if (local56.aBoolean44 && (this.aClass146_1.anInt4084 == -1 || Static21.aClass255_2.method6583(this.aClass146_1.anInt4084).aBoolean24)) {
				@Pc(87) Class4 local87 = super.anInt5051 != -1 && super.anInt5094 == 0 ? Static396.aClass157_2.method3745(super.anInt5051) : null;
				@Pc(108) Class4 local108 = super.anInt5063 == -1 || this.aBoolean258 || super.aBoolean385 && local87 != null ? null : Static396.aClass157_2.method3745(super.anInt5063);
				local110 = 0;
				if (super.anInt5026 != 0) {
					local110 = this.method4392();
				}
				@Pc(152) Class63 local152 = Static70.method1446(super.anInt5070, super.anInt5083, 240, local32, 0, arg0, super.aClass63Array3[0], local108 == null ? super.anInt5080 : super.anInt5032, 160, local108 == null ? local87 : local108, 1, super.anInt5072, 0, local110);
				if (local152 != null) {
					arg0.la(local46, local49 - 128.0F);
					arg0.method6058(false);
					local152.method7700(local25, null, 0);
					arg0.method6058(true);
				}
			}
		}
		if (Static266.aClass1_Sub1_Sub2_Sub1_1 == this) {
			arg0.la(local46, local49 - 144.0F);
			local25.oa(super.anInt7660, super.anInt7657, super.anInt7659);
			for (@Pc(193) int local193 = Static286.aClass132Array1.length - 1; local193 >= 0; local193--) {
				@Pc(199) Class132 local199 = Static286.aClass132Array1[local193];
				if (local199 != null && local199.anInt3731 != -1) {
					@Pc(232) int local232;
					if (local199.anInt3729 == 1) {
						@Pc(220) Class2_Sub11 local220 = (Class2_Sub11) Static71.aClass127_13.method3205((long) local199.anInt3734);
						if (local220 != null) {
							@Pc(225) Class1_Sub1_Sub2_Sub2 local225 = local220.aClass1_Sub1_Sub2_Sub2_1;
							local232 = local225.anInt7660 - Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660;
							@Pc(239) int local239 = local225.anInt7659 - Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659;
							this.method2943(local199.anInt3731, local239, local232, super.aClass63Array3[0], 5760000, local25, arg0);
						}
					}
					if (local199.anInt3729 == 2) {
						@Pc(266) int local266 = local199.anInt3726 + 64 - Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660;
						local110 = local199.anInt3724 + 64 - Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659;
						local232 = local199.anInt3732 << 7;
						local232 *= local232;
						this.method2943(local199.anInt3731, local110, local266, super.aClass63Array3[0], local232, local25, arg0);
					}
					if (local199.anInt3729 == 10 && local199.anInt3734 >= 0 && local199.anInt3734 < Static278.aClass1_Sub1_Sub2_Sub1Array1.length) {
						@Pc(321) Class1_Sub1_Sub2_Sub1 local321 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local199.anInt3734];
						if (local321 != null) {
							local110 = local321.anInt7660 - Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660;
							local232 = local321.anInt7659 - Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659;
							this.method2943(local199.anInt3731, local232, local110, super.aClass63Array3[0], 5760000, local25, arg0);
						}
					}
				}
			}
			local25.ma(local32);
			local25.TA(super.anInt7660, super.anInt7657, super.anInt7659);
		}
		arg0.la(local46, local49);
		@Pc(374) Class6_Sub5 local374 = Static356.method2696(super.aClass63Array3.length);
		if (super.aClass6_Sub7_6 == null) {
			arg0.method6046(super.aClass63Array3, local25, local374.aClass6_Sub4Array1, Static266.aClass1_Sub1_Sub2_Sub1_1 == this ? 1 : 0);
		} else {
			@Pc(396) Class208 local396 = super.aClass6_Sub7_6.method6400();
			arg0.method6030(super.aClass63Array3, local396, local25, local374.aClass6_Sub4Array1, Static266.aClass1_Sub1_Sub2_Sub1_1 == this ? 1 : 0);
		}
		this.method4391(super.aClass63Array3, false, arg0);
		super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = super.aClass63Array3[3] = null;
		super.anInt5065 = Static313.anInt6819;
		return local374;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IBIB)V")
	public void method2953(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt5051 != -1 && Static396.aClass157_2.method3745(super.anInt5051).anInt126 == 1) {
			super.anInt5051 = -1;
		}
		@Pc(31) Class226 local31;
		if (super.anInt5097 != -1) {
			local31 = Static305.aClass14_1.method555(super.anInt5097);
			if (local31.aBoolean524 && local31.anInt6964 != -1 && Static396.aClass157_2.method3745(local31.anInt6964).anInt126 == 1) {
				super.anInt5097 = -1;
			}
		}
		if (super.anInt5060 != -1) {
			local31 = Static305.aClass14_1.method555(super.anInt5060);
			if (local31.aBoolean524 && local31.anInt6964 != -1 && Static396.aClass157_2.method3745(local31.anInt6964).anInt126 == 1) {
				super.anInt5060 = -1;
			}
		}
		this.anInt3271 = -1;
		if (arg0 < 0 || Static363.anInt1158 <= arg0 || arg1 < 0 || Static511.anInt8889 <= arg1) {
			this.method2949(arg0, arg1);
		} else if (super.anIntArray450[0] >= 0 && Static363.anInt1158 > super.anIntArray450[0] && super.anIntArray449[0] >= 0 && super.anIntArray449[0] < Static511.anInt8889) {
			if (arg2 == 2) {
				Static422.method6561(this, arg1, arg0);
			}
			this.method2951(arg1, arg2, arg0);
		} else {
			this.method2949(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILclient!qa;IIZLclient!se;I)V")
	@Override
	public void method7672(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method7677(@OriginalArg(0) Class39 arg0) {
		if (this.aClass146_1 != null && (super.aBoolean387 || this.method2945(arg0, 0))) {
			this.method4391(super.aClass63Array3, super.aBoolean387, arg0);
			super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = super.aClass63Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(BLclient!qa;)Lclient!ed;")
	@Override
	public Class68 method7676(@OriginalArg(1) Class39 arg0) {
		return null;
	}
}
