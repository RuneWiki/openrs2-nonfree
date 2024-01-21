import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!zb")
public final class Class41 {

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "I")
	private static int anInt805;

	@OriginalMember(owner = "client!zb", name = "c", descriptor = "[I")
	private static int[] anIntArray217;

	@OriginalMember(owner = "client!zb", name = "d", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_22;

	@OriginalMember(owner = "client!zb", name = "e", descriptor = "[Lclient!zb;")
	private static Class41[] aClass41Array1;

	@OriginalMember(owner = "client!zb", name = "f", descriptor = "I")
	private static int anInt806;

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "I")
	private static int anInt804 = -878;

	@OriginalMember(owner = "client!zb", name = "J", descriptor = "Lclient!s;")
	public static Class32 aClass32_8 = new Class32(-24094, 50);

	@OriginalMember(owner = "client!zb", name = "K", descriptor = "Lclient!s;")
	public static Class32 aClass32_9 = new Class32(-24094, 200);

	@OriginalMember(owner = "client!zb", name = "h", descriptor = "I")
	private int anInt808;

	@OriginalMember(owner = "client!zb", name = "i", descriptor = "Ljava/lang/String;")
	public String aString28;

	@OriginalMember(owner = "client!zb", name = "j", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!zb", name = "k", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!zb", name = "l", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!zb", name = "m", descriptor = "I")
	public int anInt809;

	@OriginalMember(owner = "client!zb", name = "n", descriptor = "I")
	public int anInt810;

	@OriginalMember(owner = "client!zb", name = "o", descriptor = "I")
	public int anInt811;

	@OriginalMember(owner = "client!zb", name = "p", descriptor = "I")
	private int anInt812;

	@OriginalMember(owner = "client!zb", name = "q", descriptor = "I")
	private int anInt813;

	@OriginalMember(owner = "client!zb", name = "r", descriptor = "I")
	private int anInt814;

	@OriginalMember(owner = "client!zb", name = "s", descriptor = "Z")
	private boolean aBoolean163;

	@OriginalMember(owner = "client!zb", name = "t", descriptor = "I")
	private int anInt815;

	@OriginalMember(owner = "client!zb", name = "u", descriptor = "Z")
	public boolean aBoolean164;

	@OriginalMember(owner = "client!zb", name = "v", descriptor = "I")
	public int anInt816;

	@OriginalMember(owner = "client!zb", name = "w", descriptor = "Z")
	private boolean aBoolean165;

	@OriginalMember(owner = "client!zb", name = "x", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray9;

	@OriginalMember(owner = "client!zb", name = "y", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray10;

	@OriginalMember(owner = "client!zb", name = "z", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!zb", name = "A", descriptor = "I")
	private int anInt818;

	@OriginalMember(owner = "client!zb", name = "B", descriptor = "B")
	private byte aByte29;

	@OriginalMember(owner = "client!zb", name = "C", descriptor = "I")
	private int anInt819;

	@OriginalMember(owner = "client!zb", name = "D", descriptor = "I")
	private int anInt820;

	@OriginalMember(owner = "client!zb", name = "E", descriptor = "B")
	private byte aByte30;

	@OriginalMember(owner = "client!zb", name = "F", descriptor = "I")
	private int anInt821;

	@OriginalMember(owner = "client!zb", name = "G", descriptor = "I")
	private int anInt822;

	@OriginalMember(owner = "client!zb", name = "H", descriptor = "I")
	private int anInt823;

	@OriginalMember(owner = "client!zb", name = "I", descriptor = "I")
	private int anInt824;

	@OriginalMember(owner = "client!zb", name = "g", descriptor = "I")
	public int anInt807 = -1;

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method520(@OriginalArg(0) Class36 arg0) {
		aClass1_Sub3_Sub3_22 = new Class1_Sub3_Sub3(arg0.method479((byte) 6, null, "obj.dat"), 4);
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg0.method479((byte) 6, null, "obj.idx"), 4);
		anInt805 = local21.method382();
		anIntArray217 = new int[anInt805];
		@Pc(29) int local29 = 2;
		for (@Pc(31) int local31 = 0; local31 < anInt805; local31++) {
			anIntArray217[local31] = local29;
			local29 += local21.method382();
		}
		aClass41Array1 = new Class41[10];
		for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
			aClass41Array1[local51] = new Class41();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(I)V")
	public static void method521() {
		try {
			aClass32_8 = null;
			aClass32_9 = null;
			anIntArray217 = null;
			aClass41Array1 = null;
			aClass1_Sub3_Sub3_22 = null;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("58670, " + 300 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "(I)Lclient!zb;")
	public static Class41 method522(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass41Array1[local1].anInt807 == arg0) {
				return aClass41Array1[local1];
			}
		}
		anInt806 = (anInt806 + 1) % 10;
		@Pc(27) Class41 local27 = aClass41Array1[anInt806];
		aClass1_Sub3_Sub3_22.anInt433 = anIntArray217[arg0];
		local27.anInt807 = arg0;
		local27.method523();
		local27.method524(aClass1_Sub3_Sub3_22);
		return local27;
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(IB)Lclient!hb;")
	public static Class1_Sub3_Sub2_Sub2 method526(@OriginalArg(0) int arg0) {
		try {
			@Pc(7) Class1_Sub3_Sub2_Sub2 local7 = (Class1_Sub3_Sub2_Sub2) aClass32_9.method470((long) arg0);
			if (local7 != null) {
				return local7;
			}
			@Pc(14) Class41 local14 = method522(arg0);
			local7 = new Class1_Sub3_Sub2_Sub2(32, 32);
			@Pc(22) int local22 = Class1_Sub3_Sub2_Sub1.anInt326;
			@Pc(24) int local24 = Class1_Sub3_Sub2_Sub1.anInt327;
			@Pc(26) int[] local26 = Class1_Sub3_Sub2_Sub1.anIntArray126;
			@Pc(28) int[] local28 = Class1_Sub3_Sub2.anIntArray159;
			@Pc(30) int local30 = Class1_Sub3_Sub2.anInt406;
			@Pc(32) int local32 = Class1_Sub3_Sub2.anInt407;
			Class1_Sub3_Sub2_Sub1.aBoolean94 = false;
			Class1_Sub3_Sub2.method313(32, local7.anIntArray135, 32);
			Class1_Sub3_Sub2.method317(0, anInt804, 32, 0, 32, 0);
			Class1_Sub3_Sub2_Sub1.method252();
			@Pc(52) Class1_Sub3_Sub1 local52 = local14.method525();
			@Pc(62) int local62 = Class1_Sub3_Sub2_Sub1.anIntArray124[local14.anInt810] * local14.anInt809 >> 16;
			@Pc(72) int local72 = Class1_Sub3_Sub2_Sub1.anIntArray125[local14.anInt810] * local14.anInt809 >> 16;
			local52.method219(local14.anInt811, local14.anInt812, local14.anInt810, local14.anInt813, local62 + local52.anInt258 / 2 + local14.anInt814, local72 + local14.anInt814);
			for (@Pc(98) int local98 = 31; local98 >= 0; local98--) {
				for (local72 = 31; local72 >= 0; local72--) {
					if (local7.anIntArray135[local98 + local72 * 32] == 0) {
						if (local98 > 0 && local7.anIntArray135[local98 + local72 * 32 - 1] > 1) {
							local7.anIntArray135[local98 + local72 * 32] = 1;
						} else if (local72 > 0 && local7.anIntArray135[local98 + (local72 - 1) * 32] > 1) {
							local7.anIntArray135[local98 + local72 * 32] = 1;
						} else if (local98 < 31 && local7.anIntArray135[local98 + local72 * 32 + 1] > 1) {
							local7.anIntArray135[local98 + local72 * 32] = 1;
						} else if (local72 < 31 && local7.anIntArray135[local98 + (local72 + 1) * 32] > 1) {
							local7.anIntArray135[local98 + local72 * 32] = 1;
						}
					}
				}
			}
			for (@Pc(221) int local221 = 31; local221 >= 0; local221--) {
				for (local72 = 31; local72 >= 0; local72--) {
					if (local7.anIntArray135[local221 + local72 * 32] == 0 && local221 > 0 && local72 > 0 && local7.anIntArray135[local221 + (local72 - 1) * 32 - 1] > 0) {
						local7.anIntArray135[local221 + local72 * 32] = 3153952;
					}
				}
			}
			aClass32_9.method471((long) arg0, 7, local7);
			Class1_Sub3_Sub2.method313(local30, local28, local32);
			Class1_Sub3_Sub2_Sub1.anInt326 = local22;
			Class1_Sub3_Sub2_Sub1.anInt327 = local24;
			Class1_Sub3_Sub2_Sub1.anIntArray126 = local26;
			Class1_Sub3_Sub2_Sub1.aBoolean94 = true;
			if (local14.aBoolean164) {
				local7.anInt365 = 33;
			} else {
				local7.anInt365 = 32;
			}
			return local7;
		} catch (@Pc(308) RuntimeException local308) {
			signlink.reporterror("49792, " + arg0 + ", " + -11 + ", " + local308.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "<init>", descriptor = "()V")
	private Class41() {
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "()V")
	private void method523() {
		this.anInt808 = 0;
		this.aString28 = null;
		this.aByteArray14 = null;
		this.anIntArray218 = null;
		this.anIntArray219 = null;
		this.anInt809 = 2000;
		this.anInt810 = 0;
		this.anInt811 = 0;
		this.anInt812 = 0;
		this.anInt813 = 0;
		this.anInt814 = 0;
		this.aBoolean163 = false;
		this.anInt815 = -1;
		this.aBoolean164 = false;
		this.anInt816 = 1;
		this.aBoolean165 = false;
		this.aStringArray9 = null;
		this.aStringArray10 = null;
		this.anInt817 = -1;
		this.anInt818 = -1;
		this.aByte29 = 0;
		this.anInt819 = -1;
		this.anInt820 = -1;
		this.aByte30 = 0;
		this.anInt821 = -1;
		this.anInt822 = -1;
		this.anInt823 = -1;
		this.anInt824 = -1;
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(ILclient!kb;)V")
	private void method524(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method380();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt808 = arg0.method382();
				} else if (local10 == 2) {
					this.aString28 = arg0.method387();
				} else if (local10 == 3) {
					this.aByteArray14 = arg0.method388();
				} else if (local10 == 4) {
					this.anInt809 = arg0.method382();
				} else if (local10 == 5) {
					this.anInt810 = arg0.method382();
				} else if (local10 == 6) {
					this.anInt811 = arg0.method382();
				} else if (local10 == 7) {
					this.anInt813 = arg0.method382();
					if (this.anInt813 > 32767) {
						this.anInt813 -= 65536;
					}
				} else if (local10 == 8) {
					this.anInt814 = arg0.method382();
					if (this.anInt814 > 32767) {
						this.anInt814 -= 65536;
					}
				} else if (local10 == 9) {
					this.aBoolean163 = true;
				} else if (local10 == 10) {
					this.anInt815 = arg0.method382();
				} else if (local10 == 11) {
					this.aBoolean164 = true;
				} else if (local10 == 12) {
					this.anInt816 = arg0.method385();
				} else if (local10 == 16) {
					this.aBoolean165 = true;
				} else if (local10 == 23) {
					this.anInt817 = arg0.method382();
					this.aByte29 = arg0.method381();
				} else if (local10 == 24) {
					this.anInt818 = arg0.method382();
				} else if (local10 == 25) {
					this.anInt819 = arg0.method382();
					this.aByte30 = arg0.method381();
				} else if (local10 == 26) {
					this.anInt820 = arg0.method382();
				} else if (local10 >= 30 && local10 < 35) {
					if (this.aStringArray9 == null) {
						this.aStringArray9 = new String[5];
					}
					this.aStringArray9[local10 - 30] = arg0.method387();
				} else if (local10 >= 35 && local10 < 40) {
					if (this.aStringArray10 == null) {
						this.aStringArray10 = new String[5];
					}
					this.aStringArray10[local10 - 35] = arg0.method387();
				} else if (local10 == 40) {
					@Pc(244) int local244 = arg0.method380();
					this.anIntArray218 = new int[local244];
					this.anIntArray219 = new int[local244];
					for (@Pc(254) int local254 = 0; local254 < local244; local254++) {
						this.anIntArray218[local254] = arg0.method382();
						this.anIntArray219[local254] = arg0.method382();
					}
				} else if (local10 == 90) {
					this.anInt821 = arg0.method382();
				} else if (local10 == 91) {
					this.anInt823 = arg0.method382();
				} else if (local10 == 92) {
					this.anInt822 = arg0.method382();
				} else if (local10 == 93) {
					this.anInt824 = arg0.method382();
				} else if (local10 == 95) {
					this.anInt812 = arg0.method382();
				}
			}
		} catch (@Pc(319) RuntimeException local319) {
			signlink.reporterror("38859, " + 213 + ", " + arg0 + ", " + local319.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "()Lclient!eb;")
	public Class1_Sub3_Sub1 method525() {
		@Pc(6) Class1_Sub3_Sub1 local6 = (Class1_Sub3_Sub1) aClass32_8.method470((long) this.anInt807);
		if (local6 != null) {
			return local6;
		}
		local6 = new Class1_Sub3_Sub1(this.anInt808, 298);
		if (this.anIntArray218 != null) {
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray218.length; local22++) {
				local6.method213(this.anIntArray218[local22], this.anIntArray219[local22]);
			}
		}
		local6.method216(64, 768, -50, -10, -50, true);
		local6.aBoolean69 = true;
		aClass32_8.method471((long) this.anInt807, 7, local6);
		return local6;
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(II)Lclient!eb;")
	public Class1_Sub3_Sub1 method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) int local2 = this.anInt817;
			if (arg1 == 1) {
				local2 = this.anInt819;
			}
			if (local2 == -1) {
				return null;
			}
			@Pc(16) int local16 = this.anInt818;
			@Pc(20) boolean local20 = false;
			if (arg1 == 1) {
				local16 = this.anInt820;
			}
			@Pc(32) Class1_Sub3_Sub1 local32 = new Class1_Sub3_Sub1(local2, 298);
			if (local16 != -1) {
				@Pc(41) Class1_Sub3_Sub1 local41 = new Class1_Sub3_Sub1(local16, 298);
				@Pc(52) Class1_Sub3_Sub1[] local52 = new Class1_Sub3_Sub1[] { local32, local41 };
				local32 = new Class1_Sub3_Sub1(false, 2, local52);
			}
			if (arg1 == 0 && this.aByte29 != 0) {
				local32.method212(0, 0, this.aByte29);
			}
			if (arg1 == 1 && this.aByte30 != 0) {
				local32.method212(0, 0, this.aByte30);
			}
			if (this.anIntArray218 != null) {
				for (@Pc(89) int local89 = 0; local89 < this.anIntArray218.length; local89++) {
					local32.method213(this.anIntArray218[local89], this.anIntArray219[local89]);
				}
			}
			return local32;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("62015, " + arg0 + ", " + arg1 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(BI)Lclient!eb;")
	public Class1_Sub3_Sub1 method528(@OriginalArg(1) int arg0) {
		try {
			@Pc(14) int local14 = this.anInt821;
			if (arg0 == 1) {
				local14 = this.anInt823;
			}
			if (local14 == -1) {
				return null;
			}
			@Pc(28) int local28 = this.anInt822;
			if (arg0 == 1) {
				local28 = this.anInt824;
			}
			@Pc(40) Class1_Sub3_Sub1 local40 = new Class1_Sub3_Sub1(local14, 298);
			if (local28 != -1) {
				@Pc(49) Class1_Sub3_Sub1 local49 = new Class1_Sub3_Sub1(local28, 298);
				@Pc(60) Class1_Sub3_Sub1[] local60 = new Class1_Sub3_Sub1[] { local40, local49 };
				local40 = new Class1_Sub3_Sub1(false, 2, local60);
			}
			if (this.anIntArray218 != null) {
				for (@Pc(72) int local72 = 0; local72 < this.anIntArray218.length; local72++) {
					local40.method213(this.anIntArray218[local72], this.anIntArray219[local72]);
				}
			}
			return local40;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("90304, " + 107 + ", " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
