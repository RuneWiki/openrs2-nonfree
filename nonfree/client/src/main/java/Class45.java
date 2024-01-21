import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YANZSPIT")
public final class Class45 {

	@OriginalMember(owner = "client!YANZSPIT", name = "a", descriptor = "Z")
	private static boolean aBoolean179;

	@OriginalMember(owner = "client!YANZSPIT", name = "m", descriptor = "I")
	private static int anInt716;

	@OriginalMember(owner = "client!YANZSPIT", name = "r", descriptor = "Lclient!TQYMAXSO;")
	private static Class8_Sub1_Sub3 aClass8_Sub1_Sub3_4;

	@OriginalMember(owner = "client!YANZSPIT", name = "G", descriptor = "I")
	private static int anInt726;

	@OriginalMember(owner = "client!YANZSPIT", name = "M", descriptor = "[I")
	private static int[] anIntArray196;

	@OriginalMember(owner = "client!YANZSPIT", name = "N", descriptor = "[Lclient!YANZSPIT;")
	private static Class45[] aClass45Array1;

	@OriginalMember(owner = "client!YANZSPIT", name = "O", descriptor = "Lclient!client;")
	public static client aClient5;

	@OriginalMember(owner = "client!YANZSPIT", name = "h", descriptor = "Lclient!JGECYJMS;")
	public static Class15 aClass15_7 = new Class15(30, -11885);

	@OriginalMember(owner = "client!YANZSPIT", name = "c", descriptor = "[I")
	private int[] anIntArray191;

	@OriginalMember(owner = "client!YANZSPIT", name = "l", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!YANZSPIT", name = "v", descriptor = "I")
	private int anInt721;

	@OriginalMember(owner = "client!YANZSPIT", name = "w", descriptor = "[I")
	private int[] anIntArray193;

	@OriginalMember(owner = "client!YANZSPIT", name = "x", descriptor = "[I")
	public int[] anIntArray194;

	@OriginalMember(owner = "client!YANZSPIT", name = "z", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray5;

	@OriginalMember(owner = "client!YANZSPIT", name = "B", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!YANZSPIT", name = "F", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!YANZSPIT", name = "I", descriptor = "I")
	private int anInt727;

	@OriginalMember(owner = "client!YANZSPIT", name = "b", descriptor = "B")
	public byte aByte21 = 1;

	@OriginalMember(owner = "client!YANZSPIT", name = "d", descriptor = "I")
	public int anInt709 = -1;

	@OriginalMember(owner = "client!YANZSPIT", name = "e", descriptor = "I")
	private int anInt710 = -1;

	@OriginalMember(owner = "client!YANZSPIT", name = "f", descriptor = "I")
	public int anInt711 = -1;

	@OriginalMember(owner = "client!YANZSPIT", name = "g", descriptor = "I")
	private int anInt712 = -1;

	@OriginalMember(owner = "client!YANZSPIT", name = "i", descriptor = "I")
	public int anInt713 = -1;

	@OriginalMember(owner = "client!YANZSPIT", name = "j", descriptor = "I")
	private int anInt714 = 128;

	@OriginalMember(owner = "client!YANZSPIT", name = "k", descriptor = "I")
	private int anInt715 = 12272;

	@OriginalMember(owner = "client!YANZSPIT", name = "n", descriptor = "I")
	private int anInt717 = -1;

	@OriginalMember(owner = "client!YANZSPIT", name = "o", descriptor = "J")
	public long aLong25 = -1L;

	@OriginalMember(owner = "client!YANZSPIT", name = "p", descriptor = "I")
	private int anInt718 = 41952;

	@OriginalMember(owner = "client!YANZSPIT", name = "q", descriptor = "I")
	public int anInt719 = 32;

	@OriginalMember(owner = "client!YANZSPIT", name = "s", descriptor = "Z")
	public boolean aBoolean180 = true;

	@OriginalMember(owner = "client!YANZSPIT", name = "t", descriptor = "Z")
	public boolean aBoolean181 = true;

	@OriginalMember(owner = "client!YANZSPIT", name = "u", descriptor = "I")
	public int anInt720 = -1;

	@OriginalMember(owner = "client!YANZSPIT", name = "y", descriptor = "I")
	private int anInt722 = 42179;

	@OriginalMember(owner = "client!YANZSPIT", name = "A", descriptor = "I")
	private int anInt723 = -1;

	@OriginalMember(owner = "client!YANZSPIT", name = "C", descriptor = "I")
	public int anInt724 = -1;

	@OriginalMember(owner = "client!YANZSPIT", name = "D", descriptor = "Ljava/lang/String;")
	public String aString15 = "null";

	@OriginalMember(owner = "client!YANZSPIT", name = "E", descriptor = "I")
	public int anInt725 = -1;

	@OriginalMember(owner = "client!YANZSPIT", name = "H", descriptor = "Z")
	public boolean aBoolean182 = false;

	@OriginalMember(owner = "client!YANZSPIT", name = "J", descriptor = "I")
	private int anInt728 = -2167;

	@OriginalMember(owner = "client!YANZSPIT", name = "K", descriptor = "I")
	private int anInt729 = 128;

	@OriginalMember(owner = "client!YANZSPIT", name = "L", descriptor = "I")
	public int anInt730 = -1;

	@OriginalMember(owner = "client!YANZSPIT", name = "P", descriptor = "I")
	private int anInt731 = -1;

	@OriginalMember(owner = "client!YANZSPIT", name = "a", descriptor = "(I)V")
	public static void method519() {
		try {
			aClass15_7 = null;
			anIntArray196 = null;
			aClass45Array1 = null;
			aClass8_Sub1_Sub3_4 = null;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("98473, " + 5 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YANZSPIT", name = "b", descriptor = "(I)Lclient!YANZSPIT;")
	public static Class45 method520(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass45Array1[local1].aLong25 == (long) arg0) {
				return aClass45Array1[local1];
			}
		}
		anInt726 = (anInt726 + 1) % 20;
		@Pc(33) Class45 local33 = aClass45Array1[anInt726] = new Class45();
		aClass8_Sub1_Sub3_4.anInt620 = anIntArray196[arg0];
		local33.aLong25 = arg0;
		local33.method523(aClass8_Sub1_Sub3_4);
		return local33;
	}

	@OriginalMember(owner = "client!YANZSPIT", name = "a", descriptor = "(Lclient!SXKKBWPU;)V")
	public static void method522(@OriginalArg(0) Class35 arg0) {
		aClass8_Sub1_Sub3_4 = new Class8_Sub1_Sub3(arg0.method364("npc.dat", null), -631);
		@Pc(19) Class8_Sub1_Sub3 local19 = new Class8_Sub1_Sub3(arg0.method364("npc.idx", null), -631);
		anInt716 = local19.method408();
		anIntArray196 = new int[anInt716];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt716; local29++) {
			anIntArray196[local29] = local27;
			local27 += local19.method408();
		}
		aClass45Array1 = new Class45[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass45Array1[local49] = new Class45();
		}
	}

	@OriginalMember(owner = "client!YANZSPIT", name = "<init>", descriptor = "()V")
	private Class45() {
	}

	@OriginalMember(owner = "client!YANZSPIT", name = "a", descriptor = "([IIII)Lclient!KDWDYCIL;")
	public Class8_Sub1_Sub1_Sub3 method518(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.anIntArray194 != null) {
				@Pc(9) Class45 local9 = this.method525(this.anInt722);
				return local9 == null ? null : local9.method518(arg0, arg1, arg2);
			}
			@Pc(26) Class8_Sub1_Sub1_Sub3 local26 = (Class8_Sub1_Sub1_Sub3) aClass15_7.method116(this.aLong25);
			if (local26 == null) {
				@Pc(36) boolean local36 = false;
				for (@Pc(38) int local38 = 0; local38 < this.anIntArray191.length; local38++) {
					if (!Class8_Sub1_Sub1_Sub3.method137(this.anIntArray191[local38])) {
						local36 = true;
					}
				}
				if (local36) {
					return null;
				}
				@Pc(63) Class8_Sub1_Sub1_Sub3[] local63 = new Class8_Sub1_Sub1_Sub3[this.anIntArray191.length];
				for (@Pc(65) int local65 = 0; local65 < this.anIntArray191.length; local65++) {
					local63[local65] = Class8_Sub1_Sub1_Sub3.method136(this.anIntArray191[local65]);
				}
				if (local63.length == 1) {
					local26 = local63[0];
				} else {
					local26 = new Class8_Sub1_Sub1_Sub3(local63, local63.length, this.anInt715);
				}
				if (this.anIntArray195 != null) {
					for (@Pc(105) int local105 = 0; local105 < this.anIntArray195.length; local105++) {
						local26.method150(this.anIntArray195[local105], this.anIntArray192[local105]);
					}
				}
				local26.method143();
				local26.method153(this.anInt727 + 64, this.anInt721 + 850, -30, -50, -30, true);
				aClass15_7.method117(this.aLong25, 811, local26);
			}
			@Pc(148) Class8_Sub1_Sub1_Sub3 local148 = Class8_Sub1_Sub1_Sub3.aClass8_Sub1_Sub1_Sub3_2;
			local148.method138(Class34.method331(arg1, this.anInt718) & Class34.method331(arg2, this.anInt718), local26);
			if (arg1 != -1 && arg2 != -1) {
				local148.method145(arg2, arg1, arg0);
			} else if (arg1 != -1) {
				local148.method144(arg1);
			}
			if (this.anInt714 != 128 || this.anInt729 != 128) {
				local148.method152(this.anInt714, this.anInt714, this.anInt729);
			}
			local148.method140();
			local148.anIntArrayArray7 = null;
			local148.anIntArrayArray6 = null;
			if (this.aByte21 == 1) {
				local148.aBoolean67 = true;
			}
			return local148;
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("31884, " + arg0 + ", " + arg1 + ", " + 4318 + ", " + arg2 + ", " + local218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YANZSPIT", name = "c", descriptor = "(I)Lclient!KDWDYCIL;")
	public Class8_Sub1_Sub1_Sub3 method521() {
		try {
			if (this.anIntArray194 != null) {
				@Pc(16) Class45 local16 = this.method525(this.anInt722);
				return local16 == null ? null : local16.method521();
			} else if (this.anIntArray193 == null) {
				return null;
			} else {
				@Pc(31) boolean local31 = false;
				for (@Pc(33) int local33 = 0; local33 < this.anIntArray193.length; local33++) {
					if (!Class8_Sub1_Sub1_Sub3.method137(this.anIntArray193[local33])) {
						local31 = true;
					}
				}
				if (local31) {
					return null;
				}
				@Pc(58) Class8_Sub1_Sub1_Sub3[] local58 = new Class8_Sub1_Sub1_Sub3[this.anIntArray193.length];
				for (@Pc(60) int local60 = 0; local60 < this.anIntArray193.length; local60++) {
					local58[local60] = Class8_Sub1_Sub1_Sub3.method136(this.anIntArray193[local60]);
				}
				@Pc(84) Class8_Sub1_Sub1_Sub3 local84;
				if (local58.length == 1) {
					local84 = local58[0];
				} else {
					local84 = new Class8_Sub1_Sub1_Sub3(local58, local58.length, this.anInt715);
				}
				if (this.anIntArray195 != null) {
					for (@Pc(100) int local100 = 0; local100 < this.anIntArray195.length; local100++) {
						local84.method150(this.anIntArray195[local100], this.anIntArray192[local100]);
					}
				}
				return local84;
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("62014, " + 2 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YANZSPIT", name = "a", descriptor = "(ILclient!TQYMAXSO;)V")
	private void method523(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method406();
				if (local13 == 0) {
					return;
				}
				@Pc(22) int local22;
				@Pc(28) int local28;
				if (local13 == 1) {
					local22 = arg0.method406();
					this.anIntArray191 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray191[local28] = arg0.method408();
					}
				} else if (local13 == 2) {
					this.aString15 = arg0.method413();
				} else if (local13 == 3) {
					this.aByteArray19 = arg0.method414(this.anInt728);
				} else if (local13 == 12) {
					this.aByte21 = arg0.method407();
				} else if (local13 == 13) {
					this.anInt709 = arg0.method408();
				} else if (local13 == 14) {
					this.anInt724 = arg0.method408();
				} else if (local13 == 17) {
					this.anInt724 = arg0.method408();
					this.anInt713 = arg0.method408();
					this.anInt730 = arg0.method408();
					this.anInt720 = arg0.method408();
				} else if (local13 >= 30 && local13 < 40) {
					if (this.aStringArray5 == null) {
						this.aStringArray5 = new String[5];
					}
					this.aStringArray5[local13 - 30] = arg0.method413();
					if (this.aStringArray5[local13 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray5[local13 - 30] = null;
					}
				} else if (local13 == 40) {
					local22 = arg0.method406();
					this.anIntArray195 = new int[local22];
					this.anIntArray192 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray195[local28] = arg0.method408();
						this.anIntArray192[local28] = arg0.method408();
					}
				} else if (local13 == 60) {
					local22 = arg0.method406();
					this.anIntArray193 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray193[local28] = arg0.method408();
					}
				} else if (local13 == 90) {
					this.anInt723 = arg0.method408();
				} else if (local13 == 91) {
					this.anInt712 = arg0.method408();
				} else if (local13 == 92) {
					this.anInt717 = arg0.method408();
				} else if (local13 == 93) {
					this.aBoolean180 = false;
				} else if (local13 == 95) {
					this.anInt711 = arg0.method408();
				} else if (local13 == 97) {
					this.anInt714 = arg0.method408();
				} else if (local13 == 98) {
					this.anInt729 = arg0.method408();
				} else if (local13 == 99) {
					this.aBoolean182 = true;
				} else if (local13 == 100) {
					this.anInt727 = arg0.method407();
				} else if (local13 == 101) {
					this.anInt721 = arg0.method407() * 5;
				} else if (local13 == 102) {
					this.anInt725 = arg0.method408();
				} else if (local13 == 103) {
					this.anInt719 = arg0.method408();
				} else if (local13 == 106) {
					this.anInt710 = arg0.method408();
					if (this.anInt710 == 65535) {
						this.anInt710 = -1;
					}
					this.anInt731 = arg0.method408();
					if (this.anInt731 == 65535) {
						this.anInt731 = -1;
					}
					local22 = arg0.method406();
					this.anIntArray194 = new int[local22 + 1];
					for (local28 = 0; local28 <= local22; local28++) {
						this.anIntArray194[local28] = arg0.method408();
						if (this.anIntArray194[local28] == 65535) {
							this.anIntArray194[local28] = -1;
						}
					}
				} else if (local13 == 107) {
					this.aBoolean181 = false;
				}
			}
		} catch (@Pc(388) RuntimeException local388) {
			signlink.reporterror("2302, " + 3 + ", " + arg0 + ", " + local388.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YANZSPIT", name = "d", descriptor = "(I)Z")
	public boolean method524() {
		try {
			if (this.anIntArray194 == null) {
				return true;
			}
			@Pc(12) int local12 = -1;
			if (this.anInt710 != -1) {
				@Pc(21) Class5 local21 = Class5.aClass5Array1[this.anInt710];
				@Pc(24) int local24 = local21.anInt30;
				@Pc(27) int local27 = local21.anInt31;
				@Pc(30) int local30 = local21.anInt32;
				@Pc(36) int local36 = client.anIntArray240[local30 - local27];
				local12 = aClient5.anIntArray245[local24] >> local27 & local36;
			} else if (this.anInt731 != -1) {
				local12 = aClient5.anIntArray245[this.anInt731];
			}
			return local12 >= 0 && local12 < this.anIntArray194.length && this.anIntArray194[local12] != -1;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("4591, " + 0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YANZSPIT", name = "e", descriptor = "(I)Lclient!YANZSPIT;")
	public Class45 method525(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6;
			if (arg0 != 42179) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			local6 = -1;
			if (this.anInt710 != -1) {
				@Pc(22) Class5 local22 = Class5.aClass5Array1[this.anInt710];
				@Pc(25) int local25 = local22.anInt30;
				@Pc(28) int local28 = local22.anInt31;
				@Pc(31) int local31 = local22.anInt32;
				@Pc(37) int local37 = client.anIntArray240[local31 - local28];
				local6 = aClient5.anIntArray245[local25] >> local28 & local37;
			} else if (this.anInt731 != -1) {
				local6 = aClient5.anIntArray245[this.anInt731];
			}
			return local6 < 0 || local6 >= this.anIntArray194.length || this.anIntArray194[local6] == -1 ? null : method520(this.anIntArray194[local6]);
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("93124, " + arg0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}
}
