import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cc")
public final class Class5 {

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
	private static int anInt94;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
	private static int[] anIntArray23;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_3;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "[Lclient!cc;")
	private static Class5[] aClass5Array1;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	private static int anInt95;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "B")
	private static byte aByte11 = 8;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "B")
	private static byte aByte12 = 4;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Z")
	public static boolean aBoolean34 = true;

	@OriginalMember(owner = "client!cc", name = "R", descriptor = "Lclient!s;")
	public static Class35 aClass35_4 = new Class35(2, 50);

	@OriginalMember(owner = "client!cc", name = "S", descriptor = "Lclient!s;")
	public static Class35 aClass35_5 = new Class35(2, 200);

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	private int anInt92;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
	private int anInt97;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
	public int anInt98;

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
	public int anInt99;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
	public int anInt100;

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
	private int anInt101;

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
	private int anInt102;

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
	private int anInt103;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "Z")
	private boolean aBoolean35;

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
	private int anInt104;

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "Z")
	public boolean aBoolean36;

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
	public int anInt105;

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "Z")
	private boolean aBoolean37;

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray3;

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray4;

	@OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
	private int anInt106;

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
	private int anInt107;

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "B")
	private byte aByte13;

	@OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
	private int anInt108;

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
	private int anInt109;

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "B")
	private byte aByte14;

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
	private int anInt110;

	@OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
	private int anInt111;

	@OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
	private int anInt112;

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
	private int anInt113;

	@OriginalMember(owner = "client!cc", name = "N", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
	private int anInt114;

	@OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
	private int anInt115;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	private int anInt93 = 33182;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	public int anInt96 = -1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method52(@OriginalArg(0) Class39 arg0) {
		aClass1_Sub3_Sub3_3 = new Class1_Sub3_Sub3(arg0.method528(aByte12, "obj.dat", null), 0);
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg0.method528(aByte12, "obj.idx", null), 0);
		anInt94 = local21.method385();
		anIntArray23 = new int[anInt94];
		@Pc(29) int local29 = 2;
		for (@Pc(31) int local31 = 0; local31 < anInt94; local31++) {
			anIntArray23[local31] = local29;
			local29 += local21.method385();
		}
		aClass5Array1 = new Class5[10];
		for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
			aClass5Array1[local51] = new Class5();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
	public static void method53(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				aClass35_4 = null;
				aClass35_5 = null;
				anIntArray23 = null;
				aClass5Array1 = null;
				aClass1_Sub3_Sub3_3 = null;
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("85909, " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Lclient!cc;")
	public static Class5 method54(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass5Array1[local1].anInt96 == arg0) {
				return aClass5Array1[local1];
			}
		}
		anInt95 = (anInt95 + 1) % 10;
		@Pc(27) Class5 local27 = aClass5Array1[anInt95];
		aClass1_Sub3_Sub3_3.anInt548 = anIntArray23[arg0];
		local27.anInt96 = arg0;
		local27.method55();
		local27.method56(aByte11, aClass1_Sub3_Sub3_3);
		if (local27.anInt115 != -1) {
			local27.method57();
		}
		if (!aBoolean34 && local27.aBoolean37) {
			local27.aString3 = "Members Object";
			local27.aByteArray3 = "Login to a members' server to use this object.".getBytes();
			local27.aStringArray3 = null;
			local27.aStringArray4 = null;
		}
		return local27;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Lclient!hb;")
	public static Class1_Sub3_Sub2_Sub2 method59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(7) Class1_Sub3_Sub2_Sub2 local7 = (Class1_Sub3_Sub2_Sub2) aClass35_5.method519((long) arg1);
			if (local7 != null && local7.anInt456 != arg0 && local7.anInt456 != -1) {
				local7.method559();
				local7 = null;
			}
			if (local7 != null) {
				return local7;
			}
			@Pc(28) Class5 local28 = method54(arg1);
			if (local28.anIntArray26 == null) {
				arg0 = -1;
			}
			@Pc(38) int local38;
			@Pc(40) int local40;
			if (arg0 > 1) {
				local38 = -1;
				for (local40 = 0; local40 < 10; local40++) {
					if (arg0 >= local28.anIntArray27[local40] && local28.anIntArray27[local40] != 0) {
						local38 = local28.anIntArray26[local40];
					}
				}
				if (local38 != -1) {
					local28 = method54(local38);
				}
			}
			local7 = new Class1_Sub3_Sub2_Sub2(32, 32);
			local38 = Class1_Sub3_Sub2_Sub1.anInt422;
			local40 = Class1_Sub3_Sub2_Sub1.anInt423;
			@Pc(80) int[] local80 = Class1_Sub3_Sub2_Sub1.anIntArray139;
			@Pc(82) int[] local82 = Class1_Sub3_Sub2.anIntArray178;
			@Pc(84) int local84 = Class1_Sub3_Sub2.anInt516;
			@Pc(86) int local86 = Class1_Sub3_Sub2.anInt517;
			@Pc(94) int local94 = Class1_Sub3_Sub2.anInt520;
			@Pc(96) int local96 = Class1_Sub3_Sub2.anInt521;
			@Pc(98) int local98 = Class1_Sub3_Sub2.anInt518;
			@Pc(100) int local100 = Class1_Sub3_Sub2.anInt519;
			Class1_Sub3_Sub2_Sub1.aBoolean104 = false;
			Class1_Sub3_Sub2.method350(local7.anIntArray148, 32, 32, (byte) 6);
			Class1_Sub3_Sub2.method354(0, 32, 0, 0, 32);
			Class1_Sub3_Sub2_Sub1.method286();
			@Pc(121) Class1_Sub3_Sub1 local121 = local28.method58(1);
			@Pc(131) int local131 = Class1_Sub3_Sub2_Sub1.anIntArray137[local28.anInt99] * local28.anInt98 >> 16;
			@Pc(141) int local141 = Class1_Sub3_Sub2_Sub1.anIntArray138[local28.anInt99] * local28.anInt98 >> 16;
			local121.method242(local28.anInt100, local28.anInt101, local28.anInt99, local28.anInt102, local131 + local121.anInt362 / 2 + local28.anInt103, local141 + local28.anInt103);
			for (@Pc(167) int local167 = 31; local167 >= 0; local167--) {
				for (local141 = 31; local141 >= 0; local141--) {
					if (local7.anIntArray148[local167 + local141 * 32] == 0) {
						if (local167 > 0 && local7.anIntArray148[local167 + local141 * 32 - 1] > 1) {
							local7.anIntArray148[local167 + local141 * 32] = 1;
						} else if (local141 > 0 && local7.anIntArray148[local167 + (local141 - 1) * 32] > 1) {
							local7.anIntArray148[local167 + local141 * 32] = 1;
						} else if (local167 < 31 && local7.anIntArray148[local167 + local141 * 32 + 1] > 1) {
							local7.anIntArray148[local167 + local141 * 32] = 1;
						} else if (local141 < 31 && local7.anIntArray148[local167 + (local141 + 1) * 32] > 1) {
							local7.anIntArray148[local167 + local141 * 32] = 1;
						}
					}
				}
			}
			for (@Pc(290) int local290 = 31; local290 >= 0; local290--) {
				for (local141 = 31; local141 >= 0; local141--) {
					if (local7.anIntArray148[local290 + local141 * 32] == 0 && local290 > 0 && local141 > 0 && local7.anIntArray148[local290 + (local141 - 1) * 32 - 1] > 0) {
						local7.anIntArray148[local290 + local141 * 32] = 3153952;
					}
				}
			}
			if (local28.anInt115 != -1) {
				@Pc(347) Class1_Sub3_Sub2_Sub2 local347 = method59(10, local28.anInt114);
				@Pc(350) int local350 = local347.anInt455;
				@Pc(353) int local353 = local347.anInt456;
				local347.anInt455 = 32;
				local347.anInt456 = 32;
				local347.method321(22, 5, 5, 22);
				local347.anInt455 = local350;
				local347.anInt456 = local353;
			}
			aClass35_5.method520(local7, (long) arg1);
			Class1_Sub3_Sub2.method350(local82, local84, local86, (byte) 6);
			Class1_Sub3_Sub2.method352(local94, local98, local96, local100);
			Class1_Sub3_Sub2_Sub1.anInt422 = local38;
			Class1_Sub3_Sub2_Sub1.anInt423 = local40;
			Class1_Sub3_Sub2_Sub1.anIntArray139 = local80;
			Class1_Sub3_Sub2_Sub1.aBoolean104 = true;
			if (local28.aBoolean36) {
				local7.anInt455 = 33;
			} else {
				local7.anInt455 = 32;
			}
			local7.anInt456 = arg0;
			return local7;
		} catch (@Pc(414) RuntimeException local414) {
			signlink.reporterror("90854, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local414.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	private Class5() {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
	private void method55() {
		this.anInt97 = 0;
		this.aString3 = null;
		this.aByteArray3 = null;
		this.anIntArray24 = null;
		this.anIntArray25 = null;
		this.anInt98 = 2000;
		this.anInt99 = 0;
		this.anInt100 = 0;
		this.anInt101 = 0;
		this.anInt102 = 0;
		this.anInt103 = 0;
		this.aBoolean35 = false;
		this.anInt104 = -1;
		this.aBoolean36 = false;
		this.anInt105 = 1;
		this.aBoolean37 = false;
		this.aStringArray3 = null;
		this.aStringArray4 = null;
		this.anInt106 = -1;
		this.anInt107 = -1;
		this.aByte13 = 0;
		this.anInt108 = -1;
		this.anInt109 = -1;
		this.aByte14 = 0;
		this.anInt110 = -1;
		this.anInt111 = -1;
		this.anInt112 = -1;
		this.anInt113 = -1;
		this.anIntArray26 = null;
		this.anIntArray27 = null;
		this.anInt114 = -1;
		this.anInt115 = -1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLclient!kb;)V")
	private void method56(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			if (arg0 != 8) {
				throw new NullPointerException();
			}
			while (true) {
				while (true) {
					@Pc(11) int local11 = arg1.method383();
					if (local11 == 0) {
						return;
					}
					if (local11 == 1) {
						this.anInt97 = arg1.method385();
					} else if (local11 == 2) {
						this.aString3 = arg1.method390();
					} else if (local11 == 3) {
						this.aByteArray3 = arg1.method391();
					} else if (local11 == 4) {
						this.anInt98 = arg1.method385();
					} else if (local11 == 5) {
						this.anInt99 = arg1.method385();
					} else if (local11 == 6) {
						this.anInt100 = arg1.method385();
					} else if (local11 == 7) {
						this.anInt102 = arg1.method385();
						if (this.anInt102 > 32767) {
							this.anInt102 -= 65536;
						}
					} else if (local11 == 8) {
						this.anInt103 = arg1.method385();
						if (this.anInt103 > 32767) {
							this.anInt103 -= 65536;
						}
					} else if (local11 == 9) {
						this.aBoolean35 = true;
					} else if (local11 == 10) {
						this.anInt104 = arg1.method385();
					} else if (local11 == 11) {
						this.aBoolean36 = true;
					} else if (local11 == 12) {
						this.anInt105 = arg1.method388();
					} else if (local11 == 16) {
						this.aBoolean37 = true;
					} else if (local11 == 23) {
						this.anInt106 = arg1.method385();
						this.aByte13 = arg1.method384();
					} else if (local11 == 24) {
						this.anInt107 = arg1.method385();
					} else if (local11 == 25) {
						this.anInt108 = arg1.method385();
						this.aByte14 = arg1.method384();
					} else if (local11 == 26) {
						this.anInt109 = arg1.method385();
					} else if (local11 >= 30 && local11 < 35) {
						if (this.aStringArray3 == null) {
							this.aStringArray3 = new String[5];
						}
						this.aStringArray3[local11 - 30] = arg1.method390();
						if (this.aStringArray3[local11 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray3[local11 - 30] = null;
						}
					} else if (local11 >= 35 && local11 < 40) {
						if (this.aStringArray4 == null) {
							this.aStringArray4 = new String[5];
						}
						this.aStringArray4[local11 - 35] = arg1.method390();
					} else if (local11 == 40) {
						@Pc(261) int local261 = arg1.method383();
						this.anIntArray24 = new int[local261];
						this.anIntArray25 = new int[local261];
						for (@Pc(271) int local271 = 0; local271 < local261; local271++) {
							this.anIntArray24[local271] = arg1.method385();
							this.anIntArray25[local271] = arg1.method385();
						}
					} else if (local11 == 90) {
						this.anInt110 = arg1.method385();
					} else if (local11 == 91) {
						this.anInt112 = arg1.method385();
					} else if (local11 == 92) {
						this.anInt111 = arg1.method385();
					} else if (local11 == 93) {
						this.anInt113 = arg1.method385();
					} else if (local11 == 95) {
						this.anInt101 = arg1.method385();
					} else if (local11 == 97) {
						this.anInt114 = arg1.method385();
					} else if (local11 == 98) {
						this.anInt115 = arg1.method385();
					} else if (local11 >= 100 && local11 < 110) {
						if (this.anIntArray26 == null) {
							this.anIntArray26 = new int[10];
							this.anIntArray27 = new int[10];
						}
						this.anIntArray26[local11 - 100] = arg1.method385();
						this.anIntArray27[local11 - 100] = arg1.method385();
					}
				}
			}
		} catch (@Pc(389) RuntimeException local389) {
			signlink.reporterror("92030, " + arg0 + ", " + arg1 + ", " + local389.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	private void method57() {
		try {
			@Pc(3) Class5 local3 = method54(this.anInt115);
			this.anInt97 = local3.anInt97;
			this.anInt98 = local3.anInt98;
			this.anInt99 = local3.anInt99;
			this.anInt100 = local3.anInt100;
			this.anInt101 = local3.anInt101;
			this.anInt102 = local3.anInt102;
			this.anInt103 = local3.anInt103;
			this.anIntArray24 = local3.anIntArray24;
			this.anIntArray25 = local3.anIntArray25;
			@Pc(43) Class5 local43 = method54(this.anInt114);
			this.aString3 = local43.aString3;
			this.aBoolean37 = local43.aBoolean37;
			this.anInt105 = local43.anInt105;
			@Pc(57) String local57 = "a";
			@Pc(65) char local65 = local43.aString3.charAt(0);
			if (local65 == 'A' || local65 == 'E' || local65 == 'I' || local65 == 'O' || local65 == 'U') {
				local57 = "an";
			}
			this.aByteArray3 = ("Swap this note at any bank for " + local57 + " " + local43.aString3 + ".").getBytes();
			this.aBoolean36 = true;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("95071, " + 0 + ", " + local104.toString());
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
		@Pc(48) Class1_Sub3_Sub1 local48 = (Class1_Sub3_Sub1) aClass35_4.method519((long) this.anInt96);
		if (local48 != null) {
			return local48;
		}
		local48 = new Class1_Sub3_Sub1(this.anInt97, 6);
		if (this.anIntArray24 != null) {
			for (local11 = 0; local11 < this.anIntArray24.length; local11++) {
				local48.method236(this.anIntArray24[local11], this.anIntArray25[local11]);
			}
		}
		local48.method239(64, 768, -50, -10, -50, true);
		local48.aBoolean88 = true;
		aClass35_4.method520(local48, (long) this.anInt96);
		return local48;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!eb;")
	public Class1_Sub3_Sub1 method60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) int local2 = this.anInt106;
			if (arg1 == 1) {
				local2 = this.anInt108;
			}
			if (local2 == -1) {
				return null;
			}
			@Pc(16) int local16 = this.anInt107;
			@Pc(20) boolean local20 = false;
			if (arg1 == 1) {
				local16 = this.anInt109;
			}
			@Pc(32) Class1_Sub3_Sub1 local32 = new Class1_Sub3_Sub1(local2, 6);
			if (local16 != -1) {
				@Pc(41) Class1_Sub3_Sub1 local41 = new Class1_Sub3_Sub1(local16, 6);
				@Pc(52) Class1_Sub3_Sub1[] local52 = new Class1_Sub3_Sub1[] { local32, local41 };
				local32 = new Class1_Sub3_Sub1(20363, local52, 2);
			}
			if (arg1 == 0 && this.aByte13 != 0) {
				local32.method235(0, this.anInt92, 0, this.aByte13);
			}
			if (arg1 == 1 && this.aByte14 != 0) {
				local32.method235(0, this.anInt92, 0, this.aByte14);
			}
			if (this.anIntArray24 != null) {
				for (@Pc(91) int local91 = 0; local91 < this.anIntArray24.length; local91++) {
					local32.method236(this.anIntArray24[local91], this.anIntArray25[local91]);
				}
			}
			return local32;
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("89640, " + arg0 + ", " + arg1 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Lclient!eb;")
	public Class1_Sub3_Sub1 method61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) int local2 = this.anInt110;
			if (arg1 == 1) {
				local2 = this.anInt112;
			}
			if (local2 == -1) {
				return null;
			}
			@Pc(16) int local16 = this.anInt111;
			if (arg1 == 1) {
				local16 = this.anInt113;
			}
			@Pc(28) Class1_Sub3_Sub1 local28 = new Class1_Sub3_Sub1(local2, 6);
			if (arg0 != this.anInt93) {
				throw new NullPointerException();
			}
			if (local16 != -1) {
				@Pc(45) Class1_Sub3_Sub1 local45 = new Class1_Sub3_Sub1(local16, 6);
				@Pc(56) Class1_Sub3_Sub1[] local56 = new Class1_Sub3_Sub1[] { local28, local45 };
				local28 = new Class1_Sub3_Sub1(20363, local56, 2);
			}
			if (this.anIntArray24 != null) {
				for (@Pc(68) int local68 = 0; local68 < this.anIntArray24.length; local68++) {
					local28.method236(this.anIntArray24[local68], this.anIntArray25[local68]);
				}
			}
			return local28;
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("71863, " + arg0 + ", " + arg1 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}
}
