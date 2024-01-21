import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Z")
	private static boolean aBoolean6;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	private static int anInt37;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "[I")
	private static int[] anIntArray3;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_1;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[Lclient!ac;")
	private static Class2[] aClass2Array1;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
	private static int anInt38;

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "Lclient!s;")
	public static Class35 aClass35_1 = new Class35(500, (byte) 4);

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "Lclient!s;")
	public static Class35 aClass35_2 = new Class35(30, (byte) 4);

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "[I")
	private int[] anIntArray4;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "[I")
	private int[] anIntArray5;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "[I")
	private int[] anIntArray7;

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
	public int anInt40;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
	public int anInt41;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Z")
	public boolean aBoolean7;

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "Z")
	public boolean aBoolean8;

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "Z")
	public boolean aBoolean9;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "Z")
	private boolean aBoolean10;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "Z")
	private boolean aBoolean11;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "Z")
	public boolean aBoolean12;

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
	public int anInt42;

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
	public int anInt43;

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "B")
	private byte aByte6;

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "B")
	private byte aByte7;

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray1;

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "Z")
	private boolean aBoolean13;

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
	public int anInt44;

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
	public int anInt45;

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "Z")
	private boolean aBoolean14;

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "Z")
	public boolean aBoolean15;

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
	private int anInt46;

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
	private int anInt47;

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
	private int anInt48;

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
	private int anInt49;

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
	private int anInt50;

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
	private int anInt51;

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
	public int anInt52;

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "Z")
	public boolean aBoolean16;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
	private int anInt39 = -1;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method21(@OriginalArg(0) Class39 arg0) {
		aClass1_Sub3_Sub3_1 = new Class1_Sub3_Sub3(0, arg0.method528("loc.dat", null));
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(0, arg0.method528("loc.idx", null));
		anInt37 = local21.method385();
		anIntArray3 = new int[anInt37];
		@Pc(29) int local29 = 2;
		for (@Pc(31) int local31 = 0; local31 < anInt37; local31++) {
			anIntArray3[local31] = local29;
			local29 += local21.method385();
		}
		aClass2Array1 = new Class2[10];
		for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
			aClass2Array1[local51] = new Class2();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public static void method22() {
		try {
			aClass35_1 = null;
			aClass35_2 = null;
			anIntArray3 = null;
			aClass2Array1 = null;
			aClass1_Sub3_Sub3_1 = null;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("32483, " + -123 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Lclient!ac;")
	public static Class2 method23(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass2Array1[local1].anInt39 == arg0) {
				return aClass2Array1[local1];
			}
		}
		anInt38 = (anInt38 + 1) % 10;
		@Pc(27) Class2 local27 = aClass2Array1[anInt38];
		aClass1_Sub3_Sub3_1.anInt566 = anIntArray3[arg0];
		local27.anInt39 = arg0;
		local27.method24();
		local27.method25(aClass1_Sub3_Sub3_1);
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
		this.anInt40 = 1;
		this.anInt41 = 1;
		this.aBoolean7 = true;
		this.aBoolean8 = true;
		this.aBoolean9 = false;
		this.aBoolean10 = false;
		this.aBoolean11 = false;
		this.aBoolean12 = false;
		this.anInt42 = -1;
		this.anInt43 = 16;
		this.aByte6 = 0;
		this.aByte7 = 0;
		this.aStringArray1 = null;
		this.aBoolean13 = false;
		this.anInt44 = -1;
		this.anInt45 = -1;
		this.aBoolean14 = false;
		this.aBoolean15 = true;
		this.anInt46 = 128;
		this.anInt47 = 128;
		this.anInt48 = 128;
		this.anInt52 = 0;
		this.anInt49 = 0;
		this.anInt50 = 0;
		this.anInt51 = 0;
		this.aBoolean16 = false;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!kb;I)V")
	private void method25(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				while (true) {
					@Pc(15) int local15 = arg0.method383();
					if (local15 == 0) {
						if (this.anIntArray5 == null) {
							this.anIntArray5 = new int[0];
						}
						if (local3 == -1) {
							this.aBoolean9 = false;
							if (this.anIntArray5.length > 0 && this.anIntArray5[0] == 10) {
								this.aBoolean9 = true;
							}
							if (this.aStringArray1 != null) {
								this.aBoolean9 = true;
								return;
							}
						}
						return;
					}
					@Pc(23) int local23;
					@Pc(33) int local33;
					if (local15 == 1) {
						local23 = arg0.method383();
						this.anIntArray5 = new int[local23];
						this.anIntArray4 = new int[local23];
						for (local33 = 0; local33 < local23; local33++) {
							this.anIntArray4[local33] = arg0.method385();
							this.anIntArray5[local33] = arg0.method383();
						}
					} else if (local15 == 2) {
						this.aString1 = arg0.method390();
					} else if (local15 == 3) {
						this.aByteArray1 = arg0.method391();
					} else if (local15 == 14) {
						this.anInt40 = arg0.method383();
					} else if (local15 == 15) {
						this.anInt41 = arg0.method383();
					} else if (local15 == 17) {
						this.aBoolean7 = false;
					} else if (local15 == 18) {
						this.aBoolean8 = false;
					} else if (local15 == 19) {
						local3 = arg0.method383();
						if (local3 == 1) {
							this.aBoolean9 = true;
						}
					} else if (local15 == 21) {
						this.aBoolean10 = true;
					} else if (local15 == 22) {
						this.aBoolean11 = true;
					} else if (local15 == 23) {
						this.aBoolean12 = true;
					} else if (local15 == 24) {
						this.anInt42 = arg0.method385();
						if (this.anInt42 == 65535) {
							this.anInt42 = -1;
						}
					} else if (local15 == 25) {
						this.aBoolean13 = true;
					} else if (local15 == 28) {
						this.anInt43 = arg0.method383();
					} else if (local15 == 29) {
						this.aByte6 = arg0.method384();
					} else if (local15 == 39) {
						this.aByte7 = arg0.method384();
					} else if (local15 >= 30 && local15 < 39) {
						if (this.aStringArray1 == null) {
							this.aStringArray1 = new String[5];
						}
						this.aStringArray1[local15 - 30] = arg0.method390();
						if (this.aStringArray1[local15 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray1[local15 - 30] = null;
						}
					} else if (local15 == 40) {
						local23 = arg0.method383();
						this.anIntArray6 = new int[local23];
						this.anIntArray7 = new int[local23];
						for (local33 = 0; local33 < local23; local33++) {
							this.anIntArray6[local33] = arg0.method385();
							this.anIntArray7[local33] = arg0.method385();
						}
					} else if (local15 == 60) {
						this.anInt44 = arg0.method385();
					} else if (local15 == 62) {
						this.aBoolean14 = true;
					} else if (local15 == 64) {
						this.aBoolean15 = false;
					} else if (local15 == 65) {
						this.anInt46 = arg0.method385();
					} else if (local15 == 66) {
						this.anInt47 = arg0.method385();
					} else if (local15 == 67) {
						this.anInt48 = arg0.method385();
					} else if (local15 == 68) {
						this.anInt45 = arg0.method385();
					} else if (local15 == 69) {
						this.anInt52 = arg0.method383();
					} else if (local15 == 70) {
						this.anInt49 = arg0.method386();
					} else if (local15 == 71) {
						this.anInt50 = arg0.method386();
					} else if (local15 == 72) {
						this.anInt51 = arg0.method386();
					} else if (local15 == 73) {
						this.aBoolean16 = true;
					}
				}
			}
		} catch (@Pc(409) RuntimeException local409) {
			signlink.reporterror("63872, " + arg0 + ", " + 0 + ", " + local409.toString());
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
		@Pc(47) long local47 = (long) ((this.anInt39 << 6) + (local3 << 3) + arg1) + ((long) (arg6 + 1) << 32);
		if (aBoolean6) {
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
			@Pc(188) boolean local188 = this.aBoolean14 ^ arg1 > 3;
			if (local188) {
				local91 += 65536;
			}
			@Pc(200) Class1_Sub3_Sub1 local200 = (Class1_Sub3_Sub1) aClass35_1.method519((long) local91);
			if (local200 == null) {
				local200 = new Class1_Sub3_Sub1(0, local91 & 0xFFFF);
				if (local188) {
					local200.method237();
				}
				aClass35_1.method520((long) local91, local200);
			}
			@Pc(235) boolean local235;
			if (this.anInt46 == 128 && this.anInt47 == 128 && this.anInt48 == 128) {
				local235 = false;
			} else {
				local235 = true;
			}
			@Pc(250) boolean local250;
			if (this.anInt49 == 0 && this.anInt50 == 0 && this.anInt51 == 0) {
				local250 = false;
			} else {
				local250 = true;
			}
			@Pc(284) Class1_Sub3_Sub1 local284 = new Class1_Sub3_Sub1(!this.aBoolean13, false, arg1 == 0 && arg6 == -1 && !local235 && !local250, local200, this.anIntArray6 == null);
			if (arg6 != -1) {
				local284.method229();
				local284.method230(arg6);
				local284.anIntArrayArray7 = null;
				local284.anIntArrayArray6 = null;
			}
			while (arg1-- > 0) {
				local284.method233(855);
			}
			if (this.anIntArray6 != null) {
				for (local141 = 0; local141 < this.anIntArray6.length; local141++) {
					local284.method236(this.anIntArray6[local141], this.anIntArray7[local141]);
				}
			}
			if (local235) {
				local284.method238(this.anInt48, this.anInt46, this.anInt47);
			}
			if (local250) {
				local284.method235(this.anInt49, this.anInt50, this.anInt51);
			}
			local284.method239(this.aByte6 + 64, this.aByte7 * 5 + 768, -50, -10, -50, !this.aBoolean11);
			if (this.aBoolean7) {
				local284.anInt369 = local284.anInt365;
			}
			aClass35_2.method520(local47, local284);
			if (this.aBoolean10 || this.aBoolean11) {
				local284 = new Class1_Sub3_Sub1(982, this.aBoolean10, this.aBoolean11, local284);
			}
			if (this.aBoolean10) {
				local141 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (@Pc(417) int local417 = 0; local417 < local284.anInt356; local417++) {
					@Pc(424) int local424 = local284.anIntArray91[local417];
					@Pc(429) int local429 = local284.anIntArray93[local417];
					@Pc(441) int local441 = arg2 + (arg3 - arg2) * (local424 + 64) / 128;
					@Pc(453) int local453 = arg5 + (arg4 - arg5) * (local424 + 64) / 128;
					@Pc(465) int local465 = local441 + (local453 - local441) * (local429 + 64) / 128;
					local284.anIntArray92[local417] += local465 - local141;
				}
				local284.method227((byte) 8);
			}
			return local284;
		} else if (aBoolean6) {
			return local56;
		} else {
			if (this.aBoolean10 || this.aBoolean11) {
				local56 = new Class1_Sub3_Sub1(982, this.aBoolean10, this.aBoolean11, local56);
			}
			if (this.aBoolean10) {
				local91 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (@Pc(93) int local93 = 0; local93 < local56.anInt356; local93++) {
					@Pc(100) int local100 = local56.anIntArray91[local93];
					@Pc(105) int local105 = local56.anIntArray93[local93];
					@Pc(117) int local117 = arg2 + (arg3 - arg2) * (local100 + 64) / 128;
					@Pc(129) int local129 = arg5 + (arg4 - arg5) * (local100 + 64) / 128;
					local141 = local117 + (local129 - local117) * (local105 + 64) / 128;
					local56.anIntArray92[local93] += local141 - local91;
				}
				local56.method227((byte) 8);
			}
			return local56;
		}
	}
}
