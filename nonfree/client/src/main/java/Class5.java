import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cc")
public final class Class5 {

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	private static int anInt95;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[I")
	private static int[] anIntArray23;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_3;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[Lclient!cc;")
	private static Class5[] aClass5Array1;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
	private static int anInt96;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	private static int anInt93 = -280;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	private static int anInt94 = -189;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "Z")
	public static boolean aBoolean29 = true;

	@OriginalMember(owner = "client!cc", name = "S", descriptor = "Lclient!s;")
	public static Class35 aClass35_4 = new Class35(50, (byte) 4);

	@OriginalMember(owner = "client!cc", name = "T", descriptor = "Lclient!s;")
	public static Class35 aClass35_5 = new Class35(200, (byte) 4);

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	private int anInt98;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
	public int anInt99;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
	public int anInt100;

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
	public int anInt101;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
	private int anInt102;

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
	private int anInt103;

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
	private int anInt104;

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "Z")
	private boolean aBoolean30;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
	private int anInt105;

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "Z")
	public boolean aBoolean31;

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
	public int anInt106;

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "Z")
	private boolean aBoolean32;

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray3;

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray4;

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
	private int anInt107;

	@OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
	private int anInt108;

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "B")
	private byte aByte9;

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
	private int anInt109;

	@OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
	private int anInt110;

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "B")
	private byte aByte10;

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
	private int anInt111;

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
	private int anInt112;

	@OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
	private int anInt113;

	@OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
	private int anInt114;

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
	private int anInt115;

	@OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
	private int anInt116;

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!cc", name = "P", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
	private int anInt117;

	@OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
	private int anInt118;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Z")
	private boolean aBoolean28 = true;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	public int anInt97 = -1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method52(@OriginalArg(0) Class39 arg0) {
		aClass1_Sub3_Sub3_3 = new Class1_Sub3_Sub3(0, arg0.method528("obj.dat", null));
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(0, arg0.method528("obj.idx", null));
		anInt95 = local21.method385();
		anIntArray23 = new int[anInt95];
		@Pc(29) int local29 = 2;
		for (@Pc(31) int local31 = 0; local31 < anInt95; local31++) {
			anIntArray23[local31] = local29;
			local29 += local21.method385();
		}
		aClass5Array1 = new Class5[10];
		for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
			aClass5Array1[local51] = new Class5();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public static void method53() {
		try {
			aClass35_4 = null;
			aClass35_5 = null;
			anIntArray23 = null;
			aClass5Array1 = null;
			aClass1_Sub3_Sub3_3 = null;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("9282, " + -123 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Lclient!cc;")
	public static Class5 method54(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass5Array1[local1].anInt97 == arg0) {
				return aClass5Array1[local1];
			}
		}
		anInt96 = (anInt96 + 1) % 10;
		@Pc(27) Class5 local27 = aClass5Array1[anInt96];
		aClass1_Sub3_Sub3_3.anInt566 = anIntArray23[arg0];
		local27.anInt97 = arg0;
		local27.method55();
		local27.method56(aClass1_Sub3_Sub3_3);
		if (local27.anInt118 != -1) {
			local27.method57();
		}
		if (!aBoolean29 && local27.aBoolean32) {
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
			@Pc(7) Class1_Sub3_Sub2_Sub2 local7 = (Class1_Sub3_Sub2_Sub2) aClass35_5.method519((long) arg0);
			@Pc(11) boolean local11 = false;
			if (local7 != null && local7.anInt466 != arg1 && local7.anInt466 != -1) {
				local7.method559();
				local7 = null;
			}
			if (local7 != null) {
				return local7;
			}
			@Pc(32) Class5 local32 = method54(arg0);
			if (local32.anIntArray26 == null) {
				arg1 = -1;
			}
			@Pc(42) int local42;
			@Pc(44) int local44;
			if (arg1 > 1) {
				local42 = -1;
				for (local44 = 0; local44 < 10; local44++) {
					if (arg1 >= local32.anIntArray27[local44] && local32.anIntArray27[local44] != 0) {
						local42 = local32.anIntArray26[local44];
					}
				}
				if (local42 != -1) {
					local32 = method54(local42);
				}
			}
			local7 = new Class1_Sub3_Sub2_Sub2(32, 32);
			local42 = Class1_Sub3_Sub2_Sub1.anInt430;
			local44 = Class1_Sub3_Sub2_Sub1.anInt431;
			@Pc(84) int[] local84 = Class1_Sub3_Sub2_Sub1.anIntArray139;
			@Pc(86) int[] local86 = Class1_Sub3_Sub2.anIntArray178;
			@Pc(88) int local88 = Class1_Sub3_Sub2.anInt532;
			@Pc(90) int local90 = Class1_Sub3_Sub2.anInt533;
			@Pc(92) int local92 = Class1_Sub3_Sub2.anInt536;
			@Pc(94) int local94 = Class1_Sub3_Sub2.anInt537;
			@Pc(96) int local96 = Class1_Sub3_Sub2.anInt534;
			@Pc(98) int local98 = Class1_Sub3_Sub2.anInt535;
			Class1_Sub3_Sub2_Sub1.aBoolean97 = false;
			Class1_Sub3_Sub2.method350((byte) 2, 32, local7.anIntArray148, 32);
			Class1_Sub3_Sub2.method354(0, 0, 0, 32, 32);
			Class1_Sub3_Sub2_Sub1.method286();
			@Pc(119) Class1_Sub3_Sub1 local119 = local32.method58(1);
			@Pc(129) int local129 = Class1_Sub3_Sub2_Sub1.anIntArray137[local32.anInt100] * local32.anInt99 >> 16;
			@Pc(139) int local139 = Class1_Sub3_Sub2_Sub1.anIntArray138[local32.anInt100] * local32.anInt99 >> 16;
			local119.method242(local32.anInt101, local32.anInt102, local32.anInt100, local32.anInt103, local129 + local119.anInt365 / 2 + local32.anInt104, local139 + local32.anInt104);
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
			if (local32.anInt118 != -1) {
				@Pc(345) Class1_Sub3_Sub2_Sub2 local345 = method59(local32.anInt117, 10, 763);
				@Pc(348) int local348 = local345.anInt465;
				@Pc(351) int local351 = local345.anInt466;
				local345.anInt465 = 32;
				local345.anInt466 = 32;
				local345.method321(5, 5, 22, 22);
				local345.anInt465 = local348;
				local345.anInt466 = local351;
			}
			aClass35_5.method520((long) arg0, local7);
			Class1_Sub3_Sub2.method350((byte) 2, local90, local86, local88);
			Class1_Sub3_Sub2.method352(local98, anInt93, local92, local96, local94);
			Class1_Sub3_Sub2_Sub1.anInt430 = local42;
			Class1_Sub3_Sub2_Sub1.anInt431 = local44;
			Class1_Sub3_Sub2_Sub1.anIntArray139 = local84;
			Class1_Sub3_Sub2_Sub1.aBoolean97 = true;
			if (local32.aBoolean31) {
				local7.anInt465 = 33;
			} else {
				local7.anInt465 = 32;
			}
			local7.anInt466 = arg1;
			return local7;
		} catch (@Pc(412) RuntimeException local412) {
			signlink.reporterror("7039, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local412.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	private Class5() {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
	private void method55() {
		this.anInt98 = 0;
		this.aString3 = null;
		this.aByteArray3 = null;
		this.anIntArray24 = null;
		this.anIntArray25 = null;
		this.anInt99 = 2000;
		this.anInt100 = 0;
		this.anInt101 = 0;
		this.anInt102 = 0;
		this.anInt103 = 0;
		this.anInt104 = 0;
		this.aBoolean30 = false;
		this.anInt105 = -1;
		this.aBoolean31 = false;
		this.anInt106 = 1;
		this.aBoolean32 = false;
		this.aStringArray3 = null;
		this.aStringArray4 = null;
		this.anInt107 = -1;
		this.anInt108 = -1;
		this.aByte9 = 0;
		this.anInt109 = -1;
		this.anInt110 = -1;
		this.aByte10 = 0;
		this.anInt111 = -1;
		this.anInt112 = -1;
		this.anInt113 = -1;
		this.anInt114 = -1;
		this.anInt115 = -1;
		this.anInt116 = -1;
		this.anIntArray26 = null;
		this.anIntArray27 = null;
		this.anInt117 = -1;
		this.anInt118 = -1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!kb;I)V")
	private void method56(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method383();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt98 = arg0.method385();
				} else if (local13 == 2) {
					this.aString3 = arg0.method390();
				} else if (local13 == 3) {
					this.aByteArray3 = arg0.method391();
				} else if (local13 == 4) {
					this.anInt99 = arg0.method385();
				} else if (local13 == 5) {
					this.anInt100 = arg0.method385();
				} else if (local13 == 6) {
					this.anInt101 = arg0.method385();
				} else if (local13 == 7) {
					this.anInt103 = arg0.method385();
					if (this.anInt103 > 32767) {
						this.anInt103 -= 65536;
					}
				} else if (local13 == 8) {
					this.anInt104 = arg0.method385();
					if (this.anInt104 > 32767) {
						this.anInt104 -= 65536;
					}
				} else if (local13 == 9) {
					this.aBoolean30 = true;
				} else if (local13 == 10) {
					this.anInt105 = arg0.method385();
				} else if (local13 == 11) {
					this.aBoolean31 = true;
				} else if (local13 == 12) {
					this.anInt106 = arg0.method388();
				} else if (local13 == 16) {
					this.aBoolean32 = true;
				} else if (local13 == 23) {
					this.anInt107 = arg0.method385();
					this.aByte9 = arg0.method384();
				} else if (local13 == 24) {
					this.anInt108 = arg0.method385();
				} else if (local13 == 25) {
					this.anInt109 = arg0.method385();
					this.aByte10 = arg0.method384();
				} else if (local13 == 26) {
					this.anInt110 = arg0.method385();
				} else if (local13 >= 30 && local13 < 35) {
					if (this.aStringArray3 == null) {
						this.aStringArray3 = new String[5];
					}
					this.aStringArray3[local13 - 30] = arg0.method390();
					if (this.aStringArray3[local13 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray3[local13 - 30] = null;
					}
				} else if (local13 >= 35 && local13 < 40) {
					if (this.aStringArray4 == null) {
						this.aStringArray4 = new String[5];
					}
					this.aStringArray4[local13 - 35] = arg0.method390();
				} else if (local13 == 40) {
					@Pc(263) int local263 = arg0.method383();
					this.anIntArray24 = new int[local263];
					this.anIntArray25 = new int[local263];
					for (@Pc(273) int local273 = 0; local273 < local263; local273++) {
						this.anIntArray24[local273] = arg0.method385();
						this.anIntArray25[local273] = arg0.method385();
					}
				} else if (local13 == 78) {
					this.anInt111 = arg0.method385();
				} else if (local13 == 79) {
					this.anInt112 = arg0.method385();
				} else if (local13 == 90) {
					this.anInt113 = arg0.method385();
				} else if (local13 == 91) {
					this.anInt115 = arg0.method385();
				} else if (local13 == 92) {
					this.anInt114 = arg0.method385();
				} else if (local13 == 93) {
					this.anInt116 = arg0.method385();
				} else if (local13 == 95) {
					this.anInt102 = arg0.method385();
				} else if (local13 == 97) {
					this.anInt117 = arg0.method385();
				} else if (local13 == 98) {
					this.anInt118 = arg0.method385();
				} else if (local13 >= 100 && local13 < 110) {
					if (this.anIntArray26 == null) {
						this.anIntArray26 = new int[10];
						this.anIntArray27 = new int[10];
					}
					this.anIntArray26[local13 - 100] = arg0.method385();
					this.anIntArray27[local13 - 100] = arg0.method385();
				}
			}
		} catch (@Pc(409) RuntimeException local409) {
			signlink.reporterror("11091, " + arg0 + ", " + 0 + ", " + local409.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
	private void method57() {
		try {
			@Pc(3) Class5 local3 = method54(this.anInt118);
			this.anInt98 = local3.anInt98;
			this.anInt99 = local3.anInt99;
			this.anInt100 = local3.anInt100;
			this.anInt101 = local3.anInt101;
			this.anInt102 = local3.anInt102;
			this.anInt103 = local3.anInt103;
			this.anInt104 = local3.anInt104;
			this.anIntArray24 = local3.anIntArray24;
			this.anIntArray25 = local3.anIntArray25;
			@Pc(47) Class5 local47 = method54(this.anInt117);
			this.aString3 = local47.aString3;
			this.aBoolean32 = local47.aBoolean32;
			this.anInt106 = local47.anInt106;
			@Pc(61) String local61 = "a";
			@Pc(66) char local66 = local47.aString3.charAt(0);
			if (local66 == 'A' || local66 == 'E' || local66 == 'I' || local66 == 'O' || local66 == 'U') {
				local61 = "an";
			}
			this.aByteArray3 = ("Swap this note at any bank for " + local61 + " " + local47.aString3 + ".").getBytes();
			this.aBoolean31 = true;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("67177, " + 4 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)Lclient!eb;")
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
		@Pc(48) Class1_Sub3_Sub1 local48 = (Class1_Sub3_Sub1) aClass35_4.method519((long) this.anInt97);
		if (local48 != null) {
			return local48;
		}
		local48 = new Class1_Sub3_Sub1(0, this.anInt98);
		if (this.anIntArray24 != null) {
			for (local11 = 0; local11 < this.anIntArray24.length; local11++) {
				local48.method236(this.anIntArray24[local11], this.anIntArray25[local11]);
			}
		}
		local48.method239(64, 768, -50, -10, -50, true);
		local48.aBoolean81 = true;
		aClass35_4.method520((long) this.anInt97, local48);
		return local48;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)Lclient!eb;")
	public Class1_Sub3_Sub1 method60(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = this.anInt107;
			if (arg0 == 1) {
				local4 = this.anInt109;
			}
			if (local4 == -1) {
				return null;
			}
			@Pc(18) int local18 = this.anInt108;
			@Pc(21) int local21 = this.anInt111;
			if (arg0 == 1) {
				local18 = this.anInt110;
				local21 = this.anInt112;
			}
			@Pc(47) Class1_Sub3_Sub1 local47 = new Class1_Sub3_Sub1(0, local4);
			if (local18 != -1) {
				@Pc(59) Class1_Sub3_Sub1 local59;
				if (local21 == -1) {
					local59 = new Class1_Sub3_Sub1(0, local18);
					@Pc(106) Class1_Sub3_Sub1[] local106 = new Class1_Sub3_Sub1[] { local47, local59 };
					local47 = new Class1_Sub3_Sub1(6, 2, local106);
				} else {
					local59 = new Class1_Sub3_Sub1(0, local18);
					@Pc(65) Class1_Sub3_Sub1 local65 = new Class1_Sub3_Sub1(0, local21);
					@Pc(80) Class1_Sub3_Sub1[] local80 = new Class1_Sub3_Sub1[] { local47, local59, local65 };
					local47 = new Class1_Sub3_Sub1(6, 3, local80);
				}
			}
			if (arg0 == 0 && this.aByte9 != 0) {
				local47.method235(0, this.aByte9, 0);
			}
			if (arg0 == 1 && this.aByte10 != 0) {
				local47.method235(0, this.aByte10, 0);
			}
			if (this.anIntArray24 != null) {
				for (@Pc(143) int local143 = 0; local143 < this.anIntArray24.length; local143++) {
					local47.method236(this.anIntArray24[local143], this.anIntArray25[local143]);
				}
			}
			return local47;
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("53954, " + arg0 + ", " + 3 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!eb;")
	public Class1_Sub3_Sub1 method61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) int local2 = this.anInt113;
			@Pc(6) boolean local6 = false;
			if (arg0 == 1) {
				local2 = this.anInt115;
			}
			if (local2 == -1) {
				return null;
			}
			@Pc(20) int local20 = this.anInt114;
			if (arg0 == 1) {
				local20 = this.anInt116;
			}
			@Pc(32) Class1_Sub3_Sub1 local32 = new Class1_Sub3_Sub1(0, local2);
			if (local20 != -1) {
				@Pc(41) Class1_Sub3_Sub1 local41 = new Class1_Sub3_Sub1(0, local20);
				@Pc(52) Class1_Sub3_Sub1[] local52 = new Class1_Sub3_Sub1[] { local32, local41 };
				local32 = new Class1_Sub3_Sub1(6, 2, local52);
			}
			if (this.anIntArray24 != null) {
				for (@Pc(64) int local64 = 0; local64 < this.anIntArray24.length; local64++) {
					local32.method236(this.anIntArray24[local64], this.anIntArray25[local64]);
				}
			}
			return local32;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("67921, " + arg0 + ", " + arg1 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
