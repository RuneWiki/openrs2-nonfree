import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Z")
	private static boolean aBoolean5;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
	private static int anInt42;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
	private static int[] anIntArray3;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_1;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "[Lclient!ac;")
	private static Class2[] aClass2Array1;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	private static int anInt43;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	private static int anInt41 = 19303;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "Z")
	private static boolean aBoolean4 = true;

	@OriginalMember(owner = "client!ac", name = "P", descriptor = "Lclient!s;")
	public static Class35 aClass35_1 = new Class35(-24, 500);

	@OriginalMember(owner = "client!ac", name = "Q", descriptor = "Lclient!s;")
	public static Class35 aClass35_2 = new Class35(-24, 30);

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "[I")
	private int[] anIntArray4;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "[I")
	private int[] anIntArray5;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "[I")
	private int[] anIntArray7;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
	public int anInt45;

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
	public int anInt46;

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "Z")
	public boolean aBoolean6;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "Z")
	public boolean aBoolean7;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "Z")
	public boolean aBoolean8;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "Z")
	private boolean aBoolean9;

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Z")
	private boolean aBoolean10;

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "Z")
	public boolean aBoolean11;

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
	public int anInt47;

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
	public int anInt48;

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "B")
	private byte aByte4;

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "B")
	private byte aByte5;

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray1;

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "Z")
	private boolean aBoolean12;

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
	public int anInt49;

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
	public int anInt50;

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "Z")
	private boolean aBoolean13;

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "Z")
	public boolean aBoolean14;

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
	private int anInt51;

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
	private int anInt52;

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
	private int anInt53;

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
	private int anInt54;

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
	private int anInt55;

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
	private int anInt56;

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
	public int anInt57;

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "Z")
	public boolean aBoolean15;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	private int anInt44 = -1;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method21(@OriginalArg(0) Class39 arg0) {
		aClass1_Sub3_Sub3_1 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "loc.dat"));
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "loc.idx"));
		anInt42 = local21.method393();
		anIntArray3 = new int[anInt42];
		@Pc(29) int local29 = 2;
		for (@Pc(31) int local31 = 0; local31 < anInt42; local31++) {
			anIntArray3[local31] = local29;
			local29 += local21.method393();
		}
		aClass2Array1 = new Class2[10];
		for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
			aClass2Array1[local51] = new Class2();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public static void method22() {
		try {
			aClass35_1 = null;
			aClass35_2 = null;
			anIntArray3 = null;
			aClass2Array1 = null;
			aClass1_Sub3_Sub3_1 = null;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("88714, " + -25 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Lclient!ac;")
	public static Class2 method23(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass2Array1[local1].anInt44 == arg0) {
				return aClass2Array1[local1];
			}
		}
		anInt43 = (anInt43 + 1) % 10;
		@Pc(27) Class2 local27 = aClass2Array1[anInt43];
		aClass1_Sub3_Sub3_1.anInt554 = anIntArray3[arg0];
		local27.anInt44 = arg0;
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
		this.anInt45 = 1;
		this.anInt46 = 1;
		this.aBoolean6 = true;
		this.aBoolean7 = true;
		this.aBoolean8 = false;
		this.aBoolean9 = false;
		this.aBoolean10 = false;
		this.aBoolean11 = false;
		this.anInt47 = -1;
		this.anInt48 = 16;
		this.aByte4 = 0;
		this.aByte5 = 0;
		this.aStringArray1 = null;
		this.aBoolean12 = false;
		this.anInt49 = -1;
		this.anInt50 = -1;
		this.aBoolean13 = false;
		this.aBoolean14 = true;
		this.anInt51 = 128;
		this.anInt52 = 128;
		this.anInt53 = 128;
		this.anInt57 = 0;
		this.anInt54 = 0;
		this.anInt55 = 0;
		this.anInt56 = 0;
		this.aBoolean15 = false;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!kb;Z)V")
	private void method25(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				while (true) {
					@Pc(14) int local14 = arg0.method391();
					if (local14 == 0) {
						if (this.anIntArray5 == null) {
							this.anIntArray5 = new int[0];
						}
						if (local3 == -1) {
							this.aBoolean8 = false;
							if (this.anIntArray5.length > 0 && this.anIntArray5[0] == 10) {
								this.aBoolean8 = true;
							}
							if (this.aStringArray1 != null) {
								this.aBoolean8 = true;
								return;
							}
						}
						return;
					}
					@Pc(22) int local22;
					@Pc(32) int local32;
					if (local14 == 1) {
						local22 = arg0.method391();
						this.anIntArray5 = new int[local22];
						this.anIntArray4 = new int[local22];
						for (local32 = 0; local32 < local22; local32++) {
							this.anIntArray4[local32] = arg0.method393();
							this.anIntArray5[local32] = arg0.method391();
						}
					} else if (local14 == 2) {
						this.aString1 = arg0.method398();
					} else if (local14 == 3) {
						this.aByteArray1 = arg0.method399();
					} else if (local14 == 14) {
						this.anInt45 = arg0.method391();
					} else if (local14 == 15) {
						this.anInt46 = arg0.method391();
					} else if (local14 == 17) {
						this.aBoolean6 = false;
					} else if (local14 == 18) {
						this.aBoolean7 = false;
					} else if (local14 == 19) {
						local3 = arg0.method391();
						if (local3 == 1) {
							this.aBoolean8 = true;
						}
					} else if (local14 == 21) {
						this.aBoolean9 = true;
					} else if (local14 == 22) {
						this.aBoolean10 = true;
					} else if (local14 == 23) {
						this.aBoolean11 = true;
					} else if (local14 == 24) {
						this.anInt47 = arg0.method393();
						if (this.anInt47 == 65535) {
							this.anInt47 = -1;
						}
					} else if (local14 == 25) {
						this.aBoolean12 = true;
					} else if (local14 == 28) {
						this.anInt48 = arg0.method391();
					} else if (local14 == 29) {
						this.aByte4 = arg0.method392();
					} else if (local14 == 39) {
						this.aByte5 = arg0.method392();
					} else if (local14 >= 30 && local14 < 39) {
						if (this.aStringArray1 == null) {
							this.aStringArray1 = new String[5];
						}
						this.aStringArray1[local14 - 30] = arg0.method398();
						if (this.aStringArray1[local14 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray1[local14 - 30] = null;
						}
					} else if (local14 == 40) {
						local22 = arg0.method391();
						this.anIntArray6 = new int[local22];
						this.anIntArray7 = new int[local22];
						for (local32 = 0; local32 < local22; local32++) {
							this.anIntArray6[local32] = arg0.method393();
							this.anIntArray7[local32] = arg0.method393();
						}
					} else if (local14 == 60) {
						this.anInt49 = arg0.method393();
					} else if (local14 == 62) {
						this.aBoolean13 = true;
					} else if (local14 == 64) {
						this.aBoolean14 = false;
					} else if (local14 == 65) {
						this.anInt51 = arg0.method393();
					} else if (local14 == 66) {
						this.anInt52 = arg0.method393();
					} else if (local14 == 67) {
						this.anInt53 = arg0.method393();
					} else if (local14 == 68) {
						this.anInt50 = arg0.method393();
					} else if (local14 == 69) {
						this.anInt57 = arg0.method391();
					} else if (local14 == 70) {
						this.anInt54 = arg0.method394();
					} else if (local14 == 71) {
						this.anInt55 = arg0.method394();
					} else if (local14 == 72) {
						this.anInt56 = arg0.method394();
					} else if (local14 == 73) {
						this.aBoolean15 = true;
					}
				}
			}
		} catch (@Pc(408) RuntimeException local408) {
			signlink.reporterror("11232, " + arg0 + ", " + true + ", " + local408.toString());
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
		@Pc(47) long local47 = (long) ((this.anInt44 << 6) + (local3 << 3) + arg1) + ((long) (arg6 + 1) << 32);
		if (aBoolean5) {
			local47 = 0L;
		}
		@Pc(56) Class1_Sub3_Sub1 local56 = (Class1_Sub3_Sub1) aClass35_2.method527(local47);
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
			@Pc(188) boolean local188 = this.aBoolean13 ^ arg1 > 3;
			if (local188) {
				local91 += 65536;
			}
			@Pc(200) Class1_Sub3_Sub1 local200 = (Class1_Sub3_Sub1) aClass35_1.method527((long) local91);
			if (local200 == null) {
				local200 = new Class1_Sub3_Sub1(local91 & 0xFFFF, (byte) 1);
				if (local188) {
					local200.method238();
				}
				aClass35_1.method528(local200, (long) local91);
			}
			@Pc(235) boolean local235;
			if (this.anInt51 == 128 && this.anInt52 == 128 && this.anInt53 == 128) {
				local235 = false;
			} else {
				local235 = true;
			}
			@Pc(250) boolean local250;
			if (this.anInt54 == 0 && this.anInt55 == 0 && this.anInt56 == 0) {
				local250 = false;
			} else {
				local250 = true;
			}
			@Pc(284) Class1_Sub3_Sub1 local284 = new Class1_Sub3_Sub1(!this.aBoolean12, (byte) 70, this.anIntArray6 == null, local200, arg1 == 0 && arg6 == -1 && !local235 && !local250);
			if (arg6 != -1) {
				local284.method230();
				local284.method231(arg6);
				local284.anIntArrayArray7 = null;
				local284.anIntArrayArray6 = null;
			}
			while (arg1-- > 0) {
				local284.method234(anInt41);
			}
			if (this.anIntArray6 != null) {
				for (local141 = 0; local141 < this.anIntArray6.length; local141++) {
					local284.method237(this.anIntArray6[local141], this.anIntArray7[local141]);
				}
			}
			if (local235) {
				local284.method239(this.anInt52, this.anInt51, this.anInt53);
			}
			if (local250) {
				local284.method236(this.anInt56, this.anInt55, (byte) 1, this.anInt54);
			}
			local284.method240(this.aByte4 + 64, this.aByte5 * 5 + 768, -50, -10, -50, !this.aBoolean10);
			if (this.aBoolean6) {
				local284.anInt370 = local284.anInt366;
			}
			aClass35_2.method528(local284, local47);
			if (this.aBoolean9 || this.aBoolean10) {
				local284 = new Class1_Sub3_Sub1((byte) -80, this.aBoolean10, local284, this.aBoolean9);
			}
			if (this.aBoolean9) {
				local141 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (@Pc(417) int local417 = 0; local417 < local284.anInt357; local417++) {
					@Pc(424) int local424 = local284.anIntArray91[local417];
					@Pc(429) int local429 = local284.anIntArray93[local417];
					@Pc(441) int local441 = arg2 + (arg3 - arg2) * (local424 + 64) / 128;
					@Pc(453) int local453 = arg5 + (arg4 - arg5) * (local424 + 64) / 128;
					@Pc(465) int local465 = local441 + (local453 - local441) * (local429 + 64) / 128;
					local284.anIntArray92[local417] += local465 - local141;
				}
				local284.method228();
			}
			return local284;
		} else if (aBoolean5) {
			return local56;
		} else {
			if (this.aBoolean9 || this.aBoolean10) {
				local56 = new Class1_Sub3_Sub1((byte) -80, this.aBoolean10, local56, this.aBoolean9);
			}
			if (this.aBoolean9) {
				local91 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (@Pc(93) int local93 = 0; local93 < local56.anInt357; local93++) {
					@Pc(100) int local100 = local56.anIntArray91[local93];
					@Pc(105) int local105 = local56.anIntArray93[local93];
					@Pc(117) int local117 = arg2 + (arg3 - arg2) * (local100 + 64) / 128;
					@Pc(129) int local129 = arg5 + (arg4 - arg5) * (local100 + 64) / 128;
					local141 = local117 + (local129 - local117) * (local105 + 64) / 128;
					local56.anIntArray92[local93] += local141 - local91;
				}
				local56.method228();
			}
			return local56;
		}
	}
}
