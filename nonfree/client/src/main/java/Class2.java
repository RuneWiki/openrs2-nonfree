import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	private static int anInt35;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Z")
	private static boolean aBoolean8;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	private static int anInt36;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "[I")
	private static int[] anIntArray3;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_1;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "[Lclient!ac;")
	private static Class2[] aClass2Array1;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	private static int anInt37;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "B")
	private static byte aByte3 = 8;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "B")
	private static byte aByte4 = 4;

	@OriginalMember(owner = "client!ac", name = "Q", descriptor = "Lclient!s;")
	public static Class35 aClass35_1 = new Class35(2, 500);

	@OriginalMember(owner = "client!ac", name = "R", descriptor = "Lclient!s;")
	public static Class35 aClass35_2 = new Class35(2, 30);

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "[I")
	private int[] anIntArray4;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "[I")
	private int[] anIntArray5;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "[I")
	private int[] anIntArray7;

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
	public int anInt39;

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
	public int anInt40;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "Z")
	public boolean aBoolean9;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "Z")
	public boolean aBoolean10;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "Z")
	public boolean aBoolean11;

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Z")
	private boolean aBoolean12;

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "Z")
	private boolean aBoolean13;

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "Z")
	public boolean aBoolean14;

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
	public int anInt41;

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
	public int anInt42;

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "B")
	private byte aByte5;

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "B")
	private byte aByte6;

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray1;

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "Z")
	private boolean aBoolean15;

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
	public int anInt43;

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
	public int anInt44;

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "Z")
	private boolean aBoolean16;

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "Z")
	public boolean aBoolean17;

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
	private int anInt45;

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
	private int anInt46;

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
	private int anInt47;

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
	private int anInt48;

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
	private int anInt49;

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
	private int anInt50;

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
	public int anInt51;

	@OriginalMember(owner = "client!ac", name = "P", descriptor = "Z")
	public boolean aBoolean18;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	private int anInt38 = -1;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method21(@OriginalArg(0) Class39 arg0) {
		aClass1_Sub3_Sub3_1 = new Class1_Sub3_Sub3(arg0.method528(aByte4, "loc.dat", null), 0);
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg0.method528(aByte4, "loc.idx", null), 0);
		anInt36 = local21.method385();
		anIntArray3 = new int[anInt36];
		@Pc(29) int local29 = 2;
		for (@Pc(31) int local31 = 0; local31 < anInt36; local31++) {
			anIntArray3[local31] = local29;
			local29 += local21.method385();
		}
		aClass2Array1 = new Class2[10];
		for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
			aClass2Array1[local51] = new Class2();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	public static void method22(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				aClass35_1 = null;
				aClass35_2 = null;
				anIntArray3 = null;
				aClass2Array1 = null;
				aClass1_Sub3_Sub3_1 = null;
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("96512, " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Lclient!ac;")
	public static Class2 method23(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass2Array1[local1].anInt38 == arg0) {
				return aClass2Array1[local1];
			}
		}
		anInt37 = (anInt37 + 1) % 10;
		@Pc(27) Class2 local27 = aClass2Array1[anInt37];
		aClass1_Sub3_Sub3_1.anInt548 = anIntArray3[arg0];
		local27.anInt38 = arg0;
		local27.method24();
		local27.method25(aByte3, aClass1_Sub3_Sub3_1);
		return local27;
	}

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	private Class2() {
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "()V")
	private void method24() {
		this.anIntArray4 = null;
		this.anIntArray5 = null;
		this.aString1 = null;
		this.aByteArray1 = null;
		this.anIntArray6 = null;
		this.anIntArray7 = null;
		this.anInt39 = 1;
		this.anInt40 = 1;
		this.aBoolean9 = true;
		this.aBoolean10 = true;
		this.aBoolean11 = false;
		this.aBoolean12 = false;
		this.aBoolean13 = false;
		this.aBoolean14 = false;
		this.anInt41 = -1;
		this.anInt42 = 16;
		this.aByte5 = 0;
		this.aByte6 = 0;
		this.aStringArray1 = null;
		this.aBoolean15 = false;
		this.anInt43 = -1;
		this.anInt44 = -1;
		this.aBoolean16 = false;
		this.aBoolean17 = true;
		this.anInt45 = 128;
		this.anInt46 = 128;
		this.anInt47 = 128;
		this.anInt51 = 0;
		this.anInt48 = 0;
		this.anInt49 = 0;
		this.anInt50 = 0;
		this.aBoolean18 = false;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!kb;)V")
	private void method25(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			if (arg0 != 8) {
				throw new NullPointerException();
			}
			@Pc(6) boolean local6 = false;
			@Pc(13) int local13 = -1;
			while (true) {
				while (true) {
					@Pc(17) int local17 = arg1.method383();
					if (local17 == 0) {
						if (this.anIntArray5 == null) {
							this.anIntArray5 = new int[0];
						}
						if (local13 == -1) {
							this.aBoolean11 = false;
							if (this.anIntArray5.length > 0 && this.anIntArray5[0] == 10) {
								this.aBoolean11 = true;
							}
							if (this.aStringArray1 != null) {
								this.aBoolean11 = true;
								return;
							}
						}
						return;
					}
					@Pc(25) int local25;
					@Pc(35) int local35;
					if (local17 == 1) {
						local25 = arg1.method383();
						this.anIntArray5 = new int[local25];
						this.anIntArray4 = new int[local25];
						for (local35 = 0; local35 < local25; local35++) {
							this.anIntArray4[local35] = arg1.method385();
							this.anIntArray5[local35] = arg1.method383();
						}
					} else if (local17 == 2) {
						this.aString1 = arg1.method390();
					} else if (local17 == 3) {
						this.aByteArray1 = arg1.method391();
					} else if (local17 == 14) {
						this.anInt39 = arg1.method383();
					} else if (local17 == 15) {
						this.anInt40 = arg1.method383();
					} else if (local17 == 17) {
						this.aBoolean9 = false;
					} else if (local17 == 18) {
						this.aBoolean10 = false;
					} else if (local17 == 19) {
						local13 = arg1.method383();
						if (local13 == 1) {
							this.aBoolean11 = true;
						}
					} else if (local17 == 21) {
						this.aBoolean12 = true;
					} else if (local17 == 22) {
						this.aBoolean13 = true;
					} else if (local17 == 23) {
						this.aBoolean14 = true;
					} else if (local17 == 24) {
						this.anInt41 = arg1.method385();
						if (this.anInt41 == 65535) {
							this.anInt41 = -1;
						}
					} else if (local17 == 25) {
						this.aBoolean15 = true;
					} else if (local17 == 28) {
						this.anInt42 = arg1.method383();
					} else if (local17 == 29) {
						this.aByte5 = arg1.method384();
					} else if (local17 == 39) {
						this.aByte6 = arg1.method384();
					} else if (local17 >= 30 && local17 < 39) {
						if (this.aStringArray1 == null) {
							this.aStringArray1 = new String[5];
						}
						this.aStringArray1[local17 - 30] = arg1.method390();
						if (this.aStringArray1[local17 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray1[local17 - 30] = null;
						}
					} else if (local17 == 40) {
						local25 = arg1.method383();
						this.anIntArray6 = new int[local25];
						this.anIntArray7 = new int[local25];
						for (local35 = 0; local35 < local25; local35++) {
							this.anIntArray6[local35] = arg1.method385();
							this.anIntArray7[local35] = arg1.method385();
						}
					} else if (local17 == 60) {
						this.anInt43 = arg1.method385();
					} else if (local17 == 62) {
						this.aBoolean16 = true;
					} else if (local17 == 64) {
						this.aBoolean17 = false;
					} else if (local17 == 65) {
						this.anInt45 = arg1.method385();
					} else if (local17 == 66) {
						this.anInt46 = arg1.method385();
					} else if (local17 == 67) {
						this.anInt47 = arg1.method385();
					} else if (local17 == 68) {
						this.anInt44 = arg1.method385();
					} else if (local17 == 69) {
						this.anInt51 = arg1.method383();
					} else if (local17 == 70) {
						this.anInt48 = arg1.method386();
					} else if (local17 == 71) {
						this.anInt49 = arg1.method386();
					} else if (local17 == 72) {
						this.anInt50 = arg1.method386();
					} else if (local17 == 73) {
						this.aBoolean18 = true;
					}
				}
			}
		} catch (@Pc(411) RuntimeException local411) {
			signlink.reporterror("19220, " + arg0 + ", " + arg1 + ", " + local411.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIII)Lclient!eb;")
	public Class1_Sub3_Sub1 method26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = 0; local5 < this.anIntArray5.length; local5++) {
			if (this.anIntArray5[local5] == arg0) {
				local3 = local5;
				break;
			}
		}
		if (local3 == -1) {
			return null;
		}
		@Pc(47) long local47 = (long) ((this.anInt38 << 6) + (local3 << 3) + arg1) + ((long) (arg6 + 1) << 32);
		if (aBoolean8) {
			local47 = 0L;
		}
		@Pc(56) Class1_Sub3_Sub1 local56 = (Class1_Sub3_Sub1) aClass35_2.method519(local47);
		@Pc(91) int local91;
		@Pc(141) int local141;
		if (local56 == null) {
			if (local3 >= this.anIntArray4.length) {
				return null;
			}
			local91 = this.anIntArray4[local3];
			if (local91 == -1) {
				return null;
			}
			@Pc(188) boolean local188 = this.aBoolean16 ^ arg1 > 3;
			if (local188) {
				local91 += 65536;
			}
			@Pc(200) Class1_Sub3_Sub1 local200 = (Class1_Sub3_Sub1) aClass35_1.method519((long) local91);
			if (local200 == null) {
				local200 = new Class1_Sub3_Sub1(local91 & 0xFFFF, 6);
				if (local188) {
					local200.method237();
				}
				aClass35_1.method520(local200, (long) local91);
			}
			@Pc(235) boolean local235;
			if (this.anInt45 == 128 && this.anInt46 == 128 && this.anInt47 == 128) {
				local235 = false;
			} else {
				local235 = true;
			}
			@Pc(250) boolean local250;
			if (this.anInt48 == 0 && this.anInt49 == 0 && this.anInt50 == 0) {
				local250 = false;
			} else {
				local250 = true;
			}
			@Pc(284) Class1_Sub3_Sub1 local284 = new Class1_Sub3_Sub1(364, local200, !this.aBoolean15, arg1 == 0 && arg6 == -1 && !local235 && !local250, this.anIntArray6 == null);
			if (arg6 != -1) {
				local284.method229(797);
				local284.method230(arg6);
				local284.anIntArrayArray7 = null;
				local284.anIntArrayArray6 = null;
			}
			while (arg1-- > 0) {
				local284.method233();
			}
			if (this.anIntArray6 != null) {
				for (local141 = 0; local141 < this.anIntArray6.length; local141++) {
					local284.method236(this.anIntArray6[local141], this.anIntArray7[local141]);
				}
			}
			if (local235) {
				local284.method238(this.anInt46, this.anInt45, this.anInt47);
			}
			if (local250) {
				local284.method235(this.anInt50, anInt35, this.anInt48, this.anInt49);
			}
			local284.method239(this.aByte5 + 64, this.aByte6 * 5 + 768, -50, -10, -50, !this.aBoolean13);
			if (this.aBoolean9) {
				local284.anInt366 = local284.anInt362;
			}
			aClass35_2.method520(local284, local47);
			if (this.aBoolean12 || this.aBoolean13) {
				local284 = new Class1_Sub3_Sub1(this.aBoolean12, local284, false, this.aBoolean13);
			}
			if (this.aBoolean12) {
				local141 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (@Pc(417) int local417 = 0; local417 < local284.anInt353; local417++) {
					@Pc(424) int local424 = local284.anIntArray91[local417];
					@Pc(429) int local429 = local284.anIntArray93[local417];
					@Pc(441) int local441 = arg2 + (arg3 - arg2) * (local424 + 64) / 128;
					@Pc(453) int local453 = arg5 + (arg4 - arg5) * (local424 + 64) / 128;
					@Pc(465) int local465 = local441 + (local453 - local441) * (local429 + 64) / 128;
					local284.anIntArray92[local417] += local465 - local141;
				}
				local284.method227();
			}
			return local284;
		} else if (aBoolean8) {
			return local56;
		} else {
			if (this.aBoolean12 || this.aBoolean13) {
				local56 = new Class1_Sub3_Sub1(this.aBoolean12, local56, false, this.aBoolean13);
			}
			if (this.aBoolean12) {
				local91 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (@Pc(93) int local93 = 0; local93 < local56.anInt353; local93++) {
					@Pc(100) int local100 = local56.anIntArray91[local93];
					@Pc(105) int local105 = local56.anIntArray93[local93];
					@Pc(117) int local117 = arg2 + (arg3 - arg2) * (local100 + 64) / 128;
					@Pc(129) int local129 = arg5 + (arg4 - arg5) * (local100 + 64) / 128;
					local141 = local117 + (local129 - local117) * (local105 + 64) / 128;
					local56.anIntArray92[local93] += local141 - local91;
				}
				local56.method227();
			}
			return local56;
		}
	}
}
