import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cc")
public final class Class5 {

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	private static int anInt103;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "[I")
	private static int[] anIntArray23;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_3;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[Lclient!cc;")
	private static Class5[] aClass5Array1;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
	private static int anInt104;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "Z")
	public static boolean aBoolean27 = true;

	@OriginalMember(owner = "client!cc", name = "Q", descriptor = "Lclient!s;")
	public static Class35 aClass35_4 = new Class35(-24, 50);

	@OriginalMember(owner = "client!cc", name = "R", descriptor = "Lclient!s;")
	public static Class35 aClass35_5 = new Class35(-24, 200);

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	private int anInt106;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
	public int anInt107;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
	public int anInt108;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
	public int anInt109;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
	private int anInt110;

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
	private int anInt111;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
	private int anInt112;

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "Z")
	private boolean aBoolean28;

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
	private int anInt113;

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "Z")
	public boolean aBoolean29;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
	public int anInt114;

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "Z")
	private boolean aBoolean30;

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray3;

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray4;

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
	private int anInt115;

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
	private int anInt116;

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "B")
	private byte aByte7;

	@OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
	private int anInt117;

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
	private int anInt118;

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "B")
	private byte aByte8;

	@OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
	private int anInt119;

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
	private int anInt120;

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
	private int anInt121;

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
	private int anInt122;

	@OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
	private int anInt123;

	@OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
	private int anInt124;

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!cc", name = "N", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
	private int anInt125;

	@OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
	private int anInt126;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	private int anInt102 = -638;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
	public int anInt105 = -1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method52(@OriginalArg(0) Class39 arg0) {
		aClass1_Sub3_Sub3_3 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "obj.dat"));
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "obj.idx"));
		anInt103 = local21.method393();
		anIntArray23 = new int[anInt103];
		@Pc(29) int local29 = 2;
		for (@Pc(31) int local31 = 0; local31 < anInt103; local31++) {
			anIntArray23[local31] = local29;
			local29 += local21.method393();
		}
		aClass5Array1 = new Class5[10];
		for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
			aClass5Array1[local51] = new Class5();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method53() {
		try {
			aClass35_4 = null;
			aClass35_5 = null;
			anIntArray23 = null;
			aClass5Array1 = null;
			aClass1_Sub3_Sub3_3 = null;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("60780, " + -25 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)Lclient!cc;")
	public static Class5 method54(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass5Array1[local1].anInt105 == arg0) {
				return aClass5Array1[local1];
			}
		}
		anInt104 = (anInt104 + 1) % 10;
		@Pc(27) Class5 local27 = aClass5Array1[anInt104];
		aClass1_Sub3_Sub3_3.anInt554 = anIntArray23[arg0];
		local27.anInt105 = arg0;
		local27.method55();
		local27.method56(aClass1_Sub3_Sub3_3);
		if (local27.anInt126 != -1) {
			local27.method57();
		}
		if (!aBoolean27 && local27.aBoolean30) {
			local27.aString3 = "Members Object";
			local27.aByteArray3 = "Login to a members' server to use this object.".getBytes();
			local27.aStringArray3 = null;
			local27.aStringArray4 = null;
		}
		return local27;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZI)Lclient!hb;")
	public static Class1_Sub3_Sub2_Sub2 method59(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(7) Class1_Sub3_Sub2_Sub2 local7 = (Class1_Sub3_Sub2_Sub2) aClass35_5.method527((long) arg0);
			if (local7 != null && local7.anInt461 != arg1 && local7.anInt461 != -1) {
				local7.method567();
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
			local38 = Class1_Sub3_Sub2_Sub1.anInt426;
			local40 = Class1_Sub3_Sub2_Sub1.anInt427;
			@Pc(80) int[] local80 = Class1_Sub3_Sub2_Sub1.anIntArray139;
			@Pc(82) int[] local82 = Class1_Sub3_Sub2.anIntArray178;
			@Pc(84) int local84 = Class1_Sub3_Sub2.anInt524;
			@Pc(86) int local86 = Class1_Sub3_Sub2.anInt525;
			@Pc(88) int local88 = Class1_Sub3_Sub2.anInt528;
			@Pc(90) int local90 = Class1_Sub3_Sub2.anInt529;
			@Pc(92) int local92 = Class1_Sub3_Sub2.anInt526;
			@Pc(94) int local94 = Class1_Sub3_Sub2.anInt527;
			Class1_Sub3_Sub2_Sub1.aBoolean101 = false;
			Class1_Sub3_Sub2.method354(32, local7.anIntArray148, 32);
			Class1_Sub3_Sub2.method358(0, 32, 0, 32, 0);
			Class1_Sub3_Sub2_Sub1.method288();
			@Pc(115) Class1_Sub3_Sub1 local115 = local28.method58(1);
			@Pc(125) int local125 = Class1_Sub3_Sub2_Sub1.anIntArray137[local28.anInt108] * local28.anInt107 >> 16;
			@Pc(141) int local141 = Class1_Sub3_Sub2_Sub1.anIntArray138[local28.anInt108] * local28.anInt107 >> 16;
			local115.method243(local28.anInt109, local28.anInt110, local28.anInt108, local28.anInt111, local125 + local115.anInt366 / 2 + local28.anInt112, local141 + local28.anInt112);
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
			if (local28.anInt126 != -1) {
				@Pc(347) Class1_Sub3_Sub2_Sub2 local347 = method59(local28.anInt125, 10);
				@Pc(350) int local350 = local347.anInt460;
				@Pc(353) int local353 = local347.anInt461;
				local347.anInt460 = 32;
				local347.anInt461 = 32;
				local347.method324(5, 5, 22, 22);
				local347.anInt460 = local350;
				local347.anInt461 = local353;
			}
			aClass35_5.method528(local7, (long) arg0);
			Class1_Sub3_Sub2.method354(local86, local82, local84);
			Class1_Sub3_Sub2.method356(local88, local90, local94, local92);
			Class1_Sub3_Sub2_Sub1.anInt426 = local38;
			Class1_Sub3_Sub2_Sub1.anInt427 = local40;
			Class1_Sub3_Sub2_Sub1.anIntArray139 = local80;
			Class1_Sub3_Sub2_Sub1.aBoolean101 = true;
			if (local28.aBoolean29) {
				local7.anInt460 = 33;
			} else {
				local7.anInt460 = 32;
			}
			local7.anInt461 = arg1;
			return local7;
		} catch (@Pc(414) RuntimeException local414) {
			signlink.reporterror("44762, " + arg0 + ", " + false + ", " + arg1 + ", " + local414.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	private Class5() {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
	private void method55() {
		this.anInt106 = 0;
		this.aString3 = null;
		this.aByteArray3 = null;
		this.anIntArray24 = null;
		this.anIntArray25 = null;
		this.anInt107 = 2000;
		this.anInt108 = 0;
		this.anInt109 = 0;
		this.anInt110 = 0;
		this.anInt111 = 0;
		this.anInt112 = 0;
		this.aBoolean28 = false;
		this.anInt113 = -1;
		this.aBoolean29 = false;
		this.anInt114 = 1;
		this.aBoolean30 = false;
		this.aStringArray3 = null;
		this.aStringArray4 = null;
		this.anInt115 = -1;
		this.anInt116 = -1;
		this.aByte7 = 0;
		this.anInt117 = -1;
		this.anInt118 = -1;
		this.aByte8 = 0;
		this.anInt119 = -1;
		this.anInt120 = -1;
		this.anInt121 = -1;
		this.anInt122 = -1;
		this.anInt123 = -1;
		this.anInt124 = -1;
		this.anIntArray26 = null;
		this.anIntArray27 = null;
		this.anInt125 = -1;
		this.anInt126 = -1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!kb;Z)V")
	private void method56(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method391();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt106 = arg0.method393();
				} else if (local10 == 2) {
					this.aString3 = arg0.method398();
				} else if (local10 == 3) {
					this.aByteArray3 = arg0.method399();
				} else if (local10 == 4) {
					this.anInt107 = arg0.method393();
				} else if (local10 == 5) {
					this.anInt108 = arg0.method393();
				} else if (local10 == 6) {
					this.anInt109 = arg0.method393();
				} else if (local10 == 7) {
					this.anInt111 = arg0.method393();
					if (this.anInt111 > 32767) {
						this.anInt111 -= 65536;
					}
				} else if (local10 == 8) {
					this.anInt112 = arg0.method393();
					if (this.anInt112 > 32767) {
						this.anInt112 -= 65536;
					}
				} else if (local10 == 9) {
					this.aBoolean28 = true;
				} else if (local10 == 10) {
					this.anInt113 = arg0.method393();
				} else if (local10 == 11) {
					this.aBoolean29 = true;
				} else if (local10 == 12) {
					this.anInt114 = arg0.method396();
				} else if (local10 == 16) {
					this.aBoolean30 = true;
				} else if (local10 == 23) {
					this.anInt115 = arg0.method393();
					this.aByte7 = arg0.method392();
				} else if (local10 == 24) {
					this.anInt116 = arg0.method393();
				} else if (local10 == 25) {
					this.anInt117 = arg0.method393();
					this.aByte8 = arg0.method392();
				} else if (local10 == 26) {
					this.anInt118 = arg0.method393();
				} else if (local10 >= 30 && local10 < 35) {
					if (this.aStringArray3 == null) {
						this.aStringArray3 = new String[5];
					}
					this.aStringArray3[local10 - 30] = arg0.method398();
					if (this.aStringArray3[local10 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray3[local10 - 30] = null;
					}
				} else if (local10 >= 35 && local10 < 40) {
					if (this.aStringArray4 == null) {
						this.aStringArray4 = new String[5];
					}
					this.aStringArray4[local10 - 35] = arg0.method398();
				} else if (local10 == 40) {
					@Pc(260) int local260 = arg0.method391();
					this.anIntArray24 = new int[local260];
					this.anIntArray25 = new int[local260];
					for (@Pc(270) int local270 = 0; local270 < local260; local270++) {
						this.anIntArray24[local270] = arg0.method393();
						this.anIntArray25[local270] = arg0.method393();
					}
				} else if (local10 == 78) {
					this.anInt119 = arg0.method393();
				} else if (local10 == 79) {
					this.anInt120 = arg0.method393();
				} else if (local10 == 90) {
					this.anInt121 = arg0.method393();
				} else if (local10 == 91) {
					this.anInt123 = arg0.method393();
				} else if (local10 == 92) {
					this.anInt122 = arg0.method393();
				} else if (local10 == 93) {
					this.anInt124 = arg0.method393();
				} else if (local10 == 95) {
					this.anInt110 = arg0.method393();
				} else if (local10 == 97) {
					this.anInt125 = arg0.method393();
				} else if (local10 == 98) {
					this.anInt126 = arg0.method393();
				} else if (local10 >= 100 && local10 < 110) {
					if (this.anIntArray26 == null) {
						this.anIntArray26 = new int[10];
						this.anIntArray27 = new int[10];
					}
					this.anIntArray26[local10 - 100] = arg0.method393();
					this.anIntArray27[local10 - 100] = arg0.method393();
				}
			}
		} catch (@Pc(406) RuntimeException local406) {
			signlink.reporterror("61704, " + arg0 + ", " + true + ", " + local406.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
	private void method57() {
		try {
			@Pc(3) Class5 local3 = method54(this.anInt126);
			this.anInt106 = local3.anInt106;
			this.anInt107 = local3.anInt107;
			this.anInt108 = local3.anInt108;
			this.anInt109 = local3.anInt109;
			this.anInt110 = local3.anInt110;
			this.anInt111 = local3.anInt111;
			this.anInt112 = local3.anInt112;
			this.anIntArray24 = local3.anIntArray24;
			this.anIntArray25 = local3.anIntArray25;
			@Pc(43) Class5 local43 = method54(this.anInt125);
			this.aString3 = local43.aString3;
			this.aBoolean30 = local43.aBoolean30;
			this.anInt114 = local43.anInt114;
			@Pc(66) String local66 = "a";
			@Pc(71) char local71 = local43.aString3.charAt(0);
			if (local71 == 'A' || local71 == 'E' || local71 == 'I' || local71 == 'O' || local71 == 'U') {
				local66 = "an";
			}
			this.aByteArray3 = ("Swap this note at any bank for " + local66 + " " + local43.aString3 + ".").getBytes();
			this.aBoolean29 = true;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("52016, " + -97 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)Lclient!eb;")
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
		@Pc(48) Class1_Sub3_Sub1 local48 = (Class1_Sub3_Sub1) aClass35_4.method527((long) this.anInt105);
		if (local48 != null) {
			return local48;
		}
		local48 = new Class1_Sub3_Sub1(this.anInt106, (byte) 1);
		if (this.anIntArray24 != null) {
			for (local11 = 0; local11 < this.anIntArray24.length; local11++) {
				local48.method237(this.anIntArray24[local11], this.anIntArray25[local11]);
			}
		}
		local48.method240(64, 768, -50, -10, -50, true);
		local48.aBoolean84 = true;
		aClass35_4.method528(local48, (long) this.anInt105);
		return local48;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!eb;")
	public Class1_Sub3_Sub1 method60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 0) {
				this.anInt102 = 452;
			}
			@Pc(9) int local9 = this.anInt115;
			if (arg0 == 1) {
				local9 = this.anInt117;
			}
			if (local9 == -1) {
				return null;
			}
			@Pc(23) int local23 = this.anInt116;
			@Pc(26) int local26 = this.anInt119;
			if (arg0 == 1) {
				local23 = this.anInt118;
				local26 = this.anInt120;
			}
			@Pc(41) Class1_Sub3_Sub1 local41 = new Class1_Sub3_Sub1(local9, (byte) 1);
			if (local23 != -1) {
				@Pc(53) Class1_Sub3_Sub1 local53;
				if (local26 == -1) {
					local53 = new Class1_Sub3_Sub1(local23, (byte) 1);
					@Pc(100) Class1_Sub3_Sub1[] local100 = new Class1_Sub3_Sub1[] { local41, local53 };
					local41 = new Class1_Sub3_Sub1(-406, local100, 2);
				} else {
					local53 = new Class1_Sub3_Sub1(local23, (byte) 1);
					@Pc(59) Class1_Sub3_Sub1 local59 = new Class1_Sub3_Sub1(local26, (byte) 1);
					@Pc(74) Class1_Sub3_Sub1[] local74 = new Class1_Sub3_Sub1[] { local41, local53, local59 };
					local41 = new Class1_Sub3_Sub1(-406, local74, 3);
				}
			}
			if (arg0 == 0 && this.aByte7 != 0) {
				local41.method236(0, this.aByte7, (byte) 1, 0);
			}
			if (arg0 == 1 && this.aByte8 != 0) {
				local41.method236(0, this.aByte8, (byte) 1, 0);
			}
			if (this.anIntArray24 != null) {
				for (@Pc(137) int local137 = 0; local137 < this.anIntArray24.length; local137++) {
					local41.method237(this.anIntArray24[local137], this.anIntArray25[local137]);
				}
			}
			return local41;
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("4714, " + arg0 + ", " + arg1 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Lclient!eb;")
	public Class1_Sub3_Sub1 method61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(6) int local6 = this.anInt121;
			if (arg1 == 1) {
				local6 = this.anInt123;
			}
			if (local6 == -1) {
				return null;
			}
			@Pc(20) int local20 = this.anInt122;
			if (arg1 == 1) {
				local20 = this.anInt124;
			}
			@Pc(32) Class1_Sub3_Sub1 local32 = new Class1_Sub3_Sub1(local6, (byte) 1);
			if (local20 != -1) {
				@Pc(41) Class1_Sub3_Sub1 local41 = new Class1_Sub3_Sub1(local20, (byte) 1);
				@Pc(52) Class1_Sub3_Sub1[] local52 = new Class1_Sub3_Sub1[] { local32, local41 };
				local32 = new Class1_Sub3_Sub1(-406, local52, 2);
			}
			if (this.anIntArray24 != null) {
				for (@Pc(64) int local64 = 0; local64 < this.anIntArray24.length; local64++) {
					local32.method237(this.anIntArray24[local64], this.anIntArray25[local64]);
				}
			}
			return local32;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("48478, " + arg0 + ", " + arg1 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
