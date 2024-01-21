import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cc")
public final class Class5 {

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
	private static int anInt97;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
	private static int[] anIntArray23;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_3;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "[Lclient!cc;")
	private static Class5[] aClass5Array1;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	private static int anInt98;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Z")
	private static boolean aBoolean32 = true;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "B")
	private static byte aByte6 = 6;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Z")
	private static boolean aBoolean33 = true;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Z")
	private static boolean aBoolean34 = true;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Z")
	public static boolean aBoolean35 = true;

	@OriginalMember(owner = "client!cc", name = "R", descriptor = "Lclient!s;")
	public static Class35 aClass35_4 = new Class35(17295, 50);

	@OriginalMember(owner = "client!cc", name = "S", descriptor = "Lclient!s;")
	public static Class35 aClass35_5 = new Class35(17295, 200);

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
	private int anInt100;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
	public int anInt101;

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
	public int anInt102;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
	public int anInt103;

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
	private int anInt104;

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
	private int anInt105;

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
	private int anInt106;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "Z")
	private boolean aBoolean36;

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
	private int anInt107;

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "Z")
	public boolean aBoolean37;

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
	public int anInt108;

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "Z")
	private boolean aBoolean38;

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray3;

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray4;

	@OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
	private int anInt109;

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
	private int anInt110;

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "B")
	private byte aByte7;

	@OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
	private int anInt111;

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
	private int anInt112;

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "B")
	private byte aByte8;

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
	private int anInt113;

	@OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
	private int anInt114;

	@OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
	private int anInt115;

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
	private int anInt116;

	@OriginalMember(owner = "client!cc", name = "N", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
	private int anInt117;

	@OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
	private int anInt118;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	public int anInt99 = -1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method52(@OriginalArg(0) Class39 arg0) {
		aClass1_Sub3_Sub3_3 = new Class1_Sub3_Sub3(arg0.method516("obj.dat", null), aBoolean33);
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg0.method516("obj.idx", null), aBoolean33);
		anInt97 = local21.method374();
		anIntArray23 = new int[anInt97];
		@Pc(29) int local29 = 2;
		for (@Pc(31) int local31 = 0; local31 < anInt97; local31++) {
			anIntArray23[local31] = local29;
			local29 += local21.method374();
		}
		aClass5Array1 = new Class5[10];
		for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
			aClass5Array1[local51] = new Class5();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
	public static void method53(@OriginalArg(0) boolean arg0) {
		try {
			aClass35_4 = null;
			if (arg0) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			aClass35_5 = null;
			anIntArray23 = null;
			aClass5Array1 = null;
			aClass1_Sub3_Sub3_3 = null;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("79616, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Lclient!cc;")
	public static Class5 method54(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass5Array1[local1].anInt99 == arg0) {
				return aClass5Array1[local1];
			}
		}
		anInt98 = (anInt98 + 1) % 10;
		@Pc(27) Class5 local27 = aClass5Array1[anInt98];
		aClass1_Sub3_Sub3_3.anInt539 = anIntArray23[arg0];
		local27.anInt99 = arg0;
		local27.method55();
		local27.method56(aByte6, aClass1_Sub3_Sub3_3);
		if (local27.anInt118 != -1) {
			local27.method57();
		}
		if (!aBoolean35 && local27.aBoolean38) {
			local27.aString3 = "Members Object";
			local27.aByteArray3 = "Login to a members' server to use this object.".getBytes();
			local27.aStringArray3 = null;
			local27.aStringArray4 = null;
		}
		return local27;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Lclient!hb;")
	public static Class1_Sub3_Sub2_Sub2 method59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) Class1_Sub3_Sub2_Sub2 local7 = (Class1_Sub3_Sub2_Sub2) aClass35_5.method507((long) arg0);
			if (local7 != null && local7.anInt445 != arg1 && local7.anInt445 != -1) {
				local7.method547();
				local7 = null;
			}
			if (local7 != null) {
				return local7;
			}
			@Pc(28) Class5 local28 = method54(arg0);
			if (local28.anIntArray26 == null) {
				arg1 = -1;
			}
			@Pc(38) int local38;
			@Pc(40) int local40;
			if (arg1 > 1) {
				local38 = -1;
				for (local40 = 0; local40 < 10; local40++) {
					if (arg1 >= local28.anIntArray27[local40] && local28.anIntArray27[local40] != 0) {
						local38 = local28.anIntArray26[local40];
					}
				}
				if (local38 != -1) {
					local28 = method54(local38);
				}
			}
			local7 = new Class1_Sub3_Sub2_Sub2(32, 32);
			local38 = Class1_Sub3_Sub2_Sub1.anInt409;
			local40 = Class1_Sub3_Sub2_Sub1.anInt410;
			@Pc(80) int[] local80 = Class1_Sub3_Sub2_Sub1.anIntArray139;
			@Pc(82) int[] local82 = Class1_Sub3_Sub2.anIntArray178;
			@Pc(84) int local84 = Class1_Sub3_Sub2.anInt507;
			@Pc(86) int local86 = Class1_Sub3_Sub2.anInt508;
			@Pc(88) int local88 = Class1_Sub3_Sub2.anInt511;
			@Pc(90) int local90 = Class1_Sub3_Sub2.anInt512;
			@Pc(92) int local92 = Class1_Sub3_Sub2.anInt509;
			@Pc(94) int local94 = Class1_Sub3_Sub2.anInt510;
			Class1_Sub3_Sub2_Sub1.aBoolean110 = false;
			Class1_Sub3_Sub2.method339(32, 32, local7.anIntArray148);
			Class1_Sub3_Sub2.method343(0, 0, 0, 32, 32);
			@Pc(113) boolean local113 = true;
			Class1_Sub3_Sub2_Sub1.method275();
			@Pc(119) Class1_Sub3_Sub1 local119 = local28.method58(1);
			@Pc(129) int local129 = Class1_Sub3_Sub2_Sub1.anIntArray137[local28.anInt102] * local28.anInt101 >> 16;
			@Pc(139) int local139 = Class1_Sub3_Sub2_Sub1.anIntArray138[local28.anInt102] * local28.anInt101 >> 16;
			local119.method231(local28.anInt103, local28.anInt104, local28.anInt102, local28.anInt105, local129 + local119.anInt348 / 2 + local28.anInt106, local139 + local28.anInt106);
			for (@Pc(165) int local165 = 31; local165 >= 0; local165--) {
				for (local139 = 31; local139 >= 0; local139--) {
					if (local7.anIntArray148[local165 + local139 * 32] == 0) {
						if (local165 > 0 && local7.anIntArray148[local165 + local139 * 32 - 1] > 1) {
							local7.anIntArray148[local165 + local139 * 32] = 1;
						} else if (local139 > 0 && local7.anIntArray148[local165 + (local139 - 1) * 32] > 1) {
							local7.anIntArray148[local165 + local139 * 32] = 1;
						} else if (local165 < 31 && local7.anIntArray148[local165 + local139 * 32 + 1] > 1) {
							local7.anIntArray148[local165 + local139 * 32] = 1;
						} else if (local139 < 31 && local7.anIntArray148[local165 + (local139 + 1) * 32] > 1) {
							local7.anIntArray148[local165 + local139 * 32] = 1;
						}
					}
				}
			}
			for (@Pc(288) int local288 = 31; local288 >= 0; local288--) {
				for (local139 = 31; local139 >= 0; local139--) {
					if (local7.anIntArray148[local288 + local139 * 32] == 0 && local288 > 0 && local139 > 0 && local7.anIntArray148[local288 + (local139 - 1) * 32 - 1] > 0) {
						local7.anIntArray148[local288 + local139 * 32] = 3153952;
					}
				}
			}
			if (local28.anInt118 != -1) {
				@Pc(345) Class1_Sub3_Sub2_Sub2 local345 = method59(local28.anInt117, 10, 44);
				@Pc(348) int local348 = local345.anInt444;
				@Pc(351) int local351 = local345.anInt445;
				local345.anInt444 = 32;
				local345.anInt445 = 32;
				local345.method310(22, 22, 5, 5, (byte) 7);
				local345.anInt444 = local348;
				local345.anInt445 = local351;
			}
			aClass35_5.method508((long) arg0, local7, (byte) 3);
			Class1_Sub3_Sub2.method339(local84, local86, local82);
			Class1_Sub3_Sub2.method341(aBoolean34, local88, local92, local90, local94);
			Class1_Sub3_Sub2_Sub1.anInt409 = local38;
			Class1_Sub3_Sub2_Sub1.anInt410 = local40;
			Class1_Sub3_Sub2_Sub1.anIntArray139 = local80;
			Class1_Sub3_Sub2_Sub1.aBoolean110 = true;
			if (local28.aBoolean37) {
				local7.anInt444 = 33;
			} else {
				local7.anInt444 = 32;
			}
			local7.anInt445 = arg1;
			return local7;
		} catch (@Pc(412) RuntimeException local412) {
			signlink.reporterror("37068, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local412.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	private Class5() {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
	private void method55() {
		this.anInt100 = 0;
		this.aString3 = null;
		this.aByteArray3 = null;
		this.anIntArray24 = null;
		this.anIntArray25 = null;
		this.anInt101 = 2000;
		this.anInt102 = 0;
		this.anInt103 = 0;
		this.anInt104 = 0;
		this.anInt105 = 0;
		this.anInt106 = 0;
		this.aBoolean36 = false;
		this.anInt107 = -1;
		this.aBoolean37 = false;
		this.anInt108 = 1;
		this.aBoolean38 = false;
		this.aStringArray3 = null;
		this.aStringArray4 = null;
		this.anInt109 = -1;
		this.anInt110 = -1;
		this.aByte7 = 0;
		this.anInt111 = -1;
		this.anInt112 = -1;
		this.aByte8 = 0;
		this.anInt113 = -1;
		this.anInt114 = -1;
		this.anInt115 = -1;
		this.anInt116 = -1;
		this.anIntArray26 = null;
		this.anIntArray27 = null;
		this.anInt117 = -1;
		this.anInt118 = -1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLclient!kb;)V")
	private void method56(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			if (arg0 != 6) {
				aBoolean32 = !aBoolean32;
			}
			while (true) {
				while (true) {
					@Pc(13) int local13 = arg1.method372();
					if (local13 == 0) {
						return;
					}
					if (local13 == 1) {
						this.anInt100 = arg1.method374();
					} else if (local13 == 2) {
						this.aString3 = arg1.method379();
					} else if (local13 == 3) {
						this.aByteArray3 = arg1.method380(525);
					} else if (local13 == 4) {
						this.anInt101 = arg1.method374();
					} else if (local13 == 5) {
						this.anInt102 = arg1.method374();
					} else if (local13 == 6) {
						this.anInt103 = arg1.method374();
					} else if (local13 == 7) {
						this.anInt105 = arg1.method374();
						if (this.anInt105 > 32767) {
							this.anInt105 -= 65536;
						}
					} else if (local13 == 8) {
						this.anInt106 = arg1.method374();
						if (this.anInt106 > 32767) {
							this.anInt106 -= 65536;
						}
					} else if (local13 == 9) {
						this.aBoolean36 = true;
					} else if (local13 == 10) {
						this.anInt107 = arg1.method374();
					} else if (local13 == 11) {
						this.aBoolean37 = true;
					} else if (local13 == 12) {
						this.anInt108 = arg1.method377();
					} else if (local13 == 16) {
						this.aBoolean38 = true;
					} else if (local13 == 23) {
						this.anInt109 = arg1.method374();
						this.aByte7 = arg1.method373();
					} else if (local13 == 24) {
						this.anInt110 = arg1.method374();
					} else if (local13 == 25) {
						this.anInt111 = arg1.method374();
						this.aByte8 = arg1.method373();
					} else if (local13 == 26) {
						this.anInt112 = arg1.method374();
					} else if (local13 >= 30 && local13 < 35) {
						if (this.aStringArray3 == null) {
							this.aStringArray3 = new String[5];
						}
						this.aStringArray3[local13 - 30] = arg1.method379();
						if (this.aStringArray3[local13 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray3[local13 - 30] = null;
						}
					} else if (local13 >= 35 && local13 < 40) {
						if (this.aStringArray4 == null) {
							this.aStringArray4 = new String[5];
						}
						this.aStringArray4[local13 - 35] = arg1.method379();
					} else if (local13 == 40) {
						@Pc(263) int local263 = arg1.method372();
						this.anIntArray24 = new int[local263];
						this.anIntArray25 = new int[local263];
						for (@Pc(273) int local273 = 0; local273 < local263; local273++) {
							this.anIntArray24[local273] = arg1.method374();
							this.anIntArray25[local273] = arg1.method374();
						}
					} else if (local13 == 90) {
						this.anInt113 = arg1.method374();
					} else if (local13 == 91) {
						this.anInt115 = arg1.method374();
					} else if (local13 == 92) {
						this.anInt114 = arg1.method374();
					} else if (local13 == 93) {
						this.anInt116 = arg1.method374();
					} else if (local13 == 95) {
						this.anInt104 = arg1.method374();
					} else if (local13 == 97) {
						this.anInt117 = arg1.method374();
					} else if (local13 == 98) {
						this.anInt118 = arg1.method374();
					} else if (local13 >= 100 && local13 < 110) {
						if (this.anIntArray26 == null) {
							this.anIntArray26 = new int[10];
							this.anIntArray27 = new int[10];
						}
						this.anIntArray26[local13 - 100] = arg1.method374();
						this.anIntArray27[local13 - 100] = arg1.method374();
					}
				}
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("25999, " + arg0 + ", " + arg1 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	private void method57() {
		try {
			@Pc(3) Class5 local3 = method54(this.anInt118);
			this.anInt100 = local3.anInt100;
			this.anInt101 = local3.anInt101;
			this.anInt102 = local3.anInt102;
			this.anInt103 = local3.anInt103;
			this.anInt104 = local3.anInt104;
			this.anInt105 = local3.anInt105;
			this.anInt106 = local3.anInt106;
			this.anIntArray24 = local3.anIntArray24;
			this.anIntArray25 = local3.anIntArray25;
			@Pc(47) Class5 local47 = method54(this.anInt117);
			this.aString3 = local47.aString3;
			this.aBoolean38 = local47.aBoolean38;
			this.anInt108 = local47.anInt108;
			@Pc(61) String local61 = "a";
			@Pc(66) char local66 = local47.aString3.charAt(0);
			if (local66 == 'A' || local66 == 'E' || local66 == 'I' || local66 == 'O' || local66 == 'U') {
				local61 = "an";
			}
			this.aByteArray3 = ("Swap this note at any bank for " + local61 + " " + local47.aString3 + ".").getBytes();
			this.aBoolean37 = true;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("65932, " + -35356 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)Lclient!eb;")
	public Class1_Sub3_Sub1 method58(@OriginalArg(0) int arg0) {
		@Pc(11) int local11;
		if (this.anIntArray26 != null && arg0 > 1) {
			@Pc(9) int local9 = -1;
			for (local11 = 0; local11 < 10; local11++) {
				if (arg0 >= this.anIntArray27[local11] && this.anIntArray27[local11] != 0) {
					local9 = this.anIntArray26[local11];
				}
			}
			if (local9 != -1) {
				return method54(local9).method58(1);
			}
		}
		@Pc(48) Class1_Sub3_Sub1 local48 = (Class1_Sub3_Sub1) aClass35_4.method507((long) this.anInt99);
		if (local48 != null) {
			return local48;
		}
		local48 = new Class1_Sub3_Sub1(this.anInt100, true);
		if (this.anIntArray24 != null) {
			for (local11 = 0; local11 < this.anIntArray24.length; local11++) {
				local48.method225(this.anIntArray24[local11], this.anIntArray25[local11]);
			}
		}
		local48.method228(64, 768, -50, -10, -50, true);
		local48.aBoolean90 = true;
		aClass35_4.method508((long) this.anInt99, local48, (byte) 3);
		return local48;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)Lclient!eb;")
	public Class1_Sub3_Sub1 method60(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) int local4 = this.anInt109;
			@Pc(9) boolean local9 = false;
			if (arg0 == 1) {
				local4 = this.anInt111;
			}
			if (local4 == -1) {
				return null;
			}
			@Pc(32) int local32 = this.anInt110;
			if (arg0 == 1) {
				local32 = this.anInt112;
			}
			@Pc(44) Class1_Sub3_Sub1 local44 = new Class1_Sub3_Sub1(local4, true);
			if (local32 != -1) {
				@Pc(53) Class1_Sub3_Sub1 local53 = new Class1_Sub3_Sub1(local32, true);
				@Pc(64) Class1_Sub3_Sub1[] local64 = new Class1_Sub3_Sub1[] { local44, local53 };
				local44 = new Class1_Sub3_Sub1(16925, 2, local64);
			}
			if (arg0 == 0 && this.aByte7 != 0) {
				local44.method224(this.aByte7, 0, 0);
			}
			if (arg0 == 1 && this.aByte8 != 0) {
				local44.method224(this.aByte8, 0, 0);
			}
			if (this.anIntArray24 != null) {
				for (@Pc(101) int local101 = 0; local101 < this.anIntArray24.length; local101++) {
					local44.method225(this.anIntArray24[local101], this.anIntArray25[local101]);
				}
			}
			return local44;
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("3113, " + arg0 + ", " + arg1 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)Lclient!eb;")
	public Class1_Sub3_Sub1 method61(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) int local8 = this.anInt113;
			if (arg0 == 1) {
				local8 = this.anInt115;
			}
			if (local8 == -1) {
				return null;
			}
			@Pc(22) int local22 = this.anInt114;
			if (arg0 == 1) {
				local22 = this.anInt116;
			}
			@Pc(34) Class1_Sub3_Sub1 local34 = new Class1_Sub3_Sub1(local8, true);
			if (local22 != -1) {
				@Pc(43) Class1_Sub3_Sub1 local43 = new Class1_Sub3_Sub1(local22, true);
				@Pc(54) Class1_Sub3_Sub1[] local54 = new Class1_Sub3_Sub1[] { local34, local43 };
				local34 = new Class1_Sub3_Sub1(16925, 2, local54);
			}
			if (this.anIntArray24 != null) {
				for (@Pc(66) int local66 = 0; local66 < this.anIntArray24.length; local66++) {
					local34.method225(this.anIntArray24[local66], this.anIntArray25[local66]);
				}
			}
			return local34;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("10566, " + arg0 + ", " + false + ", " + local87.toString());
			throw new RuntimeException();
		}
	}
}
