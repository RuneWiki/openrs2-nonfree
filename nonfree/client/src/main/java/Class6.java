import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CKDEJADD")
public final class Class6 {

	@OriginalMember(owner = "client!CKDEJADD", name = "b", descriptor = "I")
	private static int anInt25;

	@OriginalMember(owner = "client!CKDEJADD", name = "f", descriptor = "Lclient!MBMGIXGO;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!CKDEJADD", name = "h", descriptor = "I")
	private static int anInt30;

	@OriginalMember(owner = "client!CKDEJADD", name = "r", descriptor = "[I")
	private static int[] anIntArray3;

	@OriginalMember(owner = "client!CKDEJADD", name = "z", descriptor = "[Lclient!CKDEJADD;")
	private static Class6[] aClass6Array1;

	@OriginalMember(owner = "client!CKDEJADD", name = "B", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!CKDEJADD", name = "t", descriptor = "I")
	private static int anInt36 = 748;

	@OriginalMember(owner = "client!CKDEJADD", name = "O", descriptor = "Lclient!GCPOSBWX;")
	public static Class13 aClass13_1 = new Class13(false, 30);

	@OriginalMember(owner = "client!CKDEJADD", name = "k", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!CKDEJADD", name = "l", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray1;

	@OriginalMember(owner = "client!CKDEJADD", name = "p", descriptor = "[I")
	private int[] anIntArray2;

	@OriginalMember(owner = "client!CKDEJADD", name = "s", descriptor = "[I")
	private int[] anIntArray4;

	@OriginalMember(owner = "client!CKDEJADD", name = "v", descriptor = "[I")
	private int[] anIntArray5;

	@OriginalMember(owner = "client!CKDEJADD", name = "E", descriptor = "I")
	private int anInt41;

	@OriginalMember(owner = "client!CKDEJADD", name = "H", descriptor = "[I")
	public int[] anIntArray6;

	@OriginalMember(owner = "client!CKDEJADD", name = "I", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!CKDEJADD", name = "L", descriptor = "I")
	private int anInt45;

	@OriginalMember(owner = "client!CKDEJADD", name = "N", descriptor = "[I")
	private int[] anIntArray7;

	@OriginalMember(owner = "client!CKDEJADD", name = "a", descriptor = "I")
	public int anInt24 = -1;

	@OriginalMember(owner = "client!CKDEJADD", name = "c", descriptor = "I")
	private int anInt26 = -1;

	@OriginalMember(owner = "client!CKDEJADD", name = "d", descriptor = "I")
	public int anInt27 = -1;

	@OriginalMember(owner = "client!CKDEJADD", name = "e", descriptor = "I")
	private int anInt28 = -1;

	@OriginalMember(owner = "client!CKDEJADD", name = "g", descriptor = "I")
	public int anInt29 = -1;

	@OriginalMember(owner = "client!CKDEJADD", name = "i", descriptor = "I")
	private int anInt31 = 9;

	@OriginalMember(owner = "client!CKDEJADD", name = "j", descriptor = "I")
	private int anInt32 = 1834;

	@OriginalMember(owner = "client!CKDEJADD", name = "m", descriptor = "I")
	public int anInt33 = -1;

	@OriginalMember(owner = "client!CKDEJADD", name = "n", descriptor = "B")
	public byte aByte1 = 1;

	@OriginalMember(owner = "client!CKDEJADD", name = "o", descriptor = "I")
	private int anInt34 = 9;

	@OriginalMember(owner = "client!CKDEJADD", name = "q", descriptor = "I")
	private int anInt35 = -1;

	@OriginalMember(owner = "client!CKDEJADD", name = "u", descriptor = "I")
	public int anInt37 = -1;

	@OriginalMember(owner = "client!CKDEJADD", name = "w", descriptor = "I")
	public int anInt38 = -1;

	@OriginalMember(owner = "client!CKDEJADD", name = "x", descriptor = "J")
	public long aLong4 = -1L;

	@OriginalMember(owner = "client!CKDEJADD", name = "y", descriptor = "I")
	public int anInt39 = 32;

	@OriginalMember(owner = "client!CKDEJADD", name = "A", descriptor = "Z")
	private boolean aBoolean12 = false;

	@OriginalMember(owner = "client!CKDEJADD", name = "C", descriptor = "I")
	public int anInt40 = -1;

	@OriginalMember(owner = "client!CKDEJADD", name = "D", descriptor = "Z")
	public boolean aBoolean13 = true;

	@OriginalMember(owner = "client!CKDEJADD", name = "F", descriptor = "I")
	private int anInt42 = 128;

	@OriginalMember(owner = "client!CKDEJADD", name = "G", descriptor = "Z")
	public boolean aBoolean14 = true;

	@OriginalMember(owner = "client!CKDEJADD", name = "J", descriptor = "I")
	private int anInt43 = -1;

	@OriginalMember(owner = "client!CKDEJADD", name = "K", descriptor = "I")
	private int anInt44 = 128;

	@OriginalMember(owner = "client!CKDEJADD", name = "M", descriptor = "Z")
	public boolean aBoolean15 = false;

	@OriginalMember(owner = "client!CKDEJADD", name = "P", descriptor = "I")
	private int anInt46 = -1;

	@OriginalMember(owner = "client!CKDEJADD", name = "a", descriptor = "(I)Lclient!CKDEJADD;")
	public static Class6 method29(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass6Array1[local1].aLong4 == (long) arg0) {
				return aClass6Array1[local1];
			}
		}
		anInt25 = (anInt25 + 1) % 20;
		@Pc(33) Class6 local33 = aClass6Array1[anInt25] = new Class6();
		aClass1_Sub1_Sub3_1.anInt468 = anIntArray3[arg0];
		local33.aLong4 = arg0;
		local33.method35(aClass1_Sub1_Sub3_1);
		return local33;
	}

	@OriginalMember(owner = "client!CKDEJADD", name = "a", descriptor = "(Lclient!XTGLDHGX;)V")
	public static void method32(@OriginalArg(0) Class44 arg0) {
		aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(arg0.method484("npc.dat", null), 891);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method484("npc.idx", null), 891);
		anInt30 = local19.method270();
		anIntArray3 = new int[anInt30];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt30; local29++) {
			anIntArray3[local29] = local27;
			local27 += local19.method270();
		}
		aClass6Array1 = new Class6[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass6Array1[local49] = new Class6();
		}
	}

	@OriginalMember(owner = "client!CKDEJADD", name = "c", descriptor = "(I)V")
	public static void method33() {
		try {
			aClass13_1 = null;
			anIntArray3 = null;
			aClass6Array1 = null;
			aClass1_Sub1_Sub3_1 = null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("86254, " + -501 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CKDEJADD", name = "<init>", descriptor = "()V")
	private Class6() {
	}

	@OriginalMember(owner = "client!CKDEJADD", name = "a", descriptor = "(Z)Lclient!ZKARKDQW;")
	public Class1_Sub1_Sub2_Sub6 method30() {
		try {
			if (this.anIntArray6 != null) {
				@Pc(9) Class6 local9 = this.method31(this.anInt32);
				return local9 == null ? null : local9.method30();
			} else if (this.anIntArray4 == null) {
				return null;
			} else {
				@Pc(24) boolean local24 = false;
				for (@Pc(31) int local31 = 0; local31 < this.anIntArray4.length; local31++) {
					if (!Class1_Sub1_Sub2_Sub6.method535(this.anIntArray4[local31])) {
						local24 = true;
					}
				}
				if (local24) {
					return null;
				}
				@Pc(56) Class1_Sub1_Sub2_Sub6[] local56 = new Class1_Sub1_Sub2_Sub6[this.anIntArray4.length];
				for (@Pc(58) int local58 = 0; local58 < this.anIntArray4.length; local58++) {
					local56[local58] = Class1_Sub1_Sub2_Sub6.method534(this.anInt34, this.anIntArray4[local58]);
				}
				@Pc(84) Class1_Sub1_Sub2_Sub6 local84;
				if (local56.length == 1) {
					local84 = local56[0];
				} else {
					local84 = new Class1_Sub1_Sub2_Sub6(local56.length, local56, -38);
				}
				if (this.anIntArray5 != null) {
					for (@Pc(99) int local99 = 0; local99 < this.anIntArray5.length; local99++) {
						local84.method548(this.anIntArray5[local99], this.anIntArray2[local99]);
					}
				}
				return local84;
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("61524, " + true + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CKDEJADD", name = "b", descriptor = "(I)Lclient!CKDEJADD;")
	public Class6 method31(@OriginalArg(0) int arg0) {
		try {
			@Pc(1) int local1 = -1;
			if (arg0 != 1834) {
				this.aBoolean12 = !this.aBoolean12;
			}
			if (this.anInt26 != -1) {
				@Pc(21) Class38 local21 = Class38.aClass38Array1[this.anInt26];
				@Pc(24) int local24 = local21.anInt677;
				@Pc(27) int local27 = local21.anInt678;
				@Pc(30) int local30 = local21.anInt679;
				@Pc(36) int local36 = client.anIntArray265[local30 - local27];
				local1 = aClient1.anIntArray231[local24] >> local27 & local36;
			} else if (this.anInt28 != -1) {
				local1 = aClient1.anIntArray231[this.anInt28];
			}
			return local1 < 0 || local1 >= this.anIntArray6.length || this.anIntArray6[local1] == -1 ? null : method29(this.anIntArray6[local1]);
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("19218, " + arg0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CKDEJADD", name = "a", descriptor = "(III[I)Lclient!ZKARKDQW;")
	public Class1_Sub1_Sub2_Sub6 method34(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			if (this.anIntArray6 != null) {
				@Pc(9) Class6 local9 = this.method31(this.anInt32);
				return local9 == null ? null : local9.method34(arg0, arg1, arg2);
			}
			@Pc(26) Class1_Sub1_Sub2_Sub6 local26 = (Class1_Sub1_Sub2_Sub6) aClass13_1.method176(this.aLong4);
			if (local26 == null) {
				@Pc(39) boolean local39 = false;
				for (@Pc(41) int local41 = 0; local41 < this.anIntArray7.length; local41++) {
					if (!Class1_Sub1_Sub2_Sub6.method535(this.anIntArray7[local41])) {
						local39 = true;
					}
				}
				if (local39) {
					return null;
				}
				@Pc(66) Class1_Sub1_Sub2_Sub6[] local66 = new Class1_Sub1_Sub2_Sub6[this.anIntArray7.length];
				for (@Pc(68) int local68 = 0; local68 < this.anIntArray7.length; local68++) {
					local66[local68] = Class1_Sub1_Sub2_Sub6.method534(this.anInt34, this.anIntArray7[local68]);
				}
				if (local66.length == 1) {
					local26 = local66[0];
				} else {
					local26 = new Class1_Sub1_Sub2_Sub6(local66.length, local66, -38);
				}
				if (this.anIntArray5 != null) {
					for (@Pc(109) int local109 = 0; local109 < this.anIntArray5.length; local109++) {
						local26.method548(this.anIntArray5[local109], this.anIntArray2[local109]);
					}
				}
				local26.method541();
				local26.method551(this.anInt41 + 64, this.anInt45 + 850, -30, -50, -30, true);
				aClass13_1.method177(local26, this.aLong4);
			}
			@Pc(152) Class1_Sub1_Sub2_Sub6 local152 = Class1_Sub1_Sub2_Sub6.aClass1_Sub1_Sub2_Sub6_2;
			local152.method536(local26, Class37.method456(arg1) & Class37.method456(arg0));
			if (arg1 != -1 && arg0 != -1) {
				local152.method543(arg2, arg0, arg1);
			} else if (arg1 != -1) {
				local152.method542(arg1);
			}
			if (this.anInt44 != 128 || this.anInt42 != 128) {
				local152.method550(this.anInt44, this.anInt44, this.anInt31, this.anInt42);
			}
			local152.method538();
			local152.anIntArrayArray19 = null;
			local152.anIntArrayArray18 = null;
			if (this.aByte1 == 1) {
				local152.aBoolean211 = true;
			}
			return local152;
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("81939, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CKDEJADD", name = "a", descriptor = "(ZLclient!MBMGIXGO;)V")
	private void method35(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method268();
				if (local10 == 0) {
					return;
				}
				@Pc(19) int local19;
				@Pc(25) int local25;
				if (local10 == 1) {
					local19 = arg0.method268();
					this.anIntArray7 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray7[local25] = arg0.method270();
					}
				} else if (local10 == 2) {
					this.aString1 = arg0.method275();
				} else if (local10 == 3) {
					this.aByteArray1 = arg0.method276();
				} else if (local10 == 12) {
					this.aByte1 = arg0.method269();
				} else if (local10 == 13) {
					this.anInt38 = arg0.method270();
				} else if (local10 == 14) {
					this.anInt33 = arg0.method270();
				} else if (local10 == 17) {
					this.anInt33 = arg0.method270();
					this.anInt27 = arg0.method270();
					this.anInt40 = arg0.method270();
					this.anInt24 = arg0.method270();
				} else if (local10 >= 30 && local10 < 40) {
					if (this.aStringArray1 == null) {
						this.aStringArray1 = new String[5];
					}
					this.aStringArray1[local10 - 30] = arg0.method275();
					if (this.aStringArray1[local10 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray1[local10 - 30] = null;
					}
				} else if (local10 == 40) {
					local19 = arg0.method268();
					this.anIntArray5 = new int[local19];
					this.anIntArray2 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray5[local25] = arg0.method270();
						this.anIntArray2[local25] = arg0.method270();
					}
				} else if (local10 == 60) {
					local19 = arg0.method268();
					this.anIntArray4 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray4[local25] = arg0.method270();
					}
				} else if (local10 == 90) {
					this.anInt46 = arg0.method270();
				} else if (local10 == 91) {
					this.anInt35 = arg0.method270();
				} else if (local10 == 92) {
					this.anInt43 = arg0.method270();
				} else if (local10 == 93) {
					this.aBoolean14 = false;
				} else if (local10 == 95) {
					this.anInt29 = arg0.method270();
				} else if (local10 == 97) {
					this.anInt44 = arg0.method270();
				} else if (local10 == 98) {
					this.anInt42 = arg0.method270();
				} else if (local10 == 99) {
					this.aBoolean15 = true;
				} else if (local10 == 100) {
					this.anInt41 = arg0.method269();
				} else if (local10 == 101) {
					this.anInt45 = arg0.method269() * 5;
				} else if (local10 == 102) {
					this.anInt37 = arg0.method270();
				} else if (local10 == 103) {
					this.anInt39 = arg0.method270();
				} else if (local10 == 106) {
					this.anInt26 = arg0.method270();
					if (this.anInt26 == 65535) {
						this.anInt26 = -1;
					}
					this.anInt28 = arg0.method270();
					if (this.anInt28 == 65535) {
						this.anInt28 = -1;
					}
					local19 = arg0.method268();
					this.anIntArray6 = new int[local19 + 1];
					for (local25 = 0; local25 <= local19; local25++) {
						this.anIntArray6[local25] = arg0.method270();
						if (this.anIntArray6[local25] == 65535) {
							this.anIntArray6[local25] = -1;
						}
					}
				} else if (local10 == 107) {
					this.aBoolean13 = false;
				}
			}
		} catch (@Pc(384) RuntimeException local384) {
			signlink.reporterror("54892, " + true + ", " + arg0 + ", " + local384.toString());
			throw new RuntimeException();
		}
	}
}
