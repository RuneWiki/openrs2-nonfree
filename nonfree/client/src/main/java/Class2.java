import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Z")
	private static boolean aBoolean7;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
	private static int anInt40;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
	private static int[] anIntArray3;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_1;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "[Lclient!ac;")
	private static Class2[] aClass2Array1;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	private static int anInt41;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "B")
	private static byte aByte1 = 6;

	@OriginalMember(owner = "client!ac", name = "P", descriptor = "Lclient!s;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!ac", name = "Q", descriptor = "Lclient!s;")
	public static Class35 aClass35_2;

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
	public int anInt43;

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
	public int anInt44;

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "Z")
	public boolean aBoolean8;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "Z")
	public boolean aBoolean9;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "Z")
	public boolean aBoolean10;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "Z")
	private boolean aBoolean11;

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Z")
	private boolean aBoolean12;

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "Z")
	public boolean aBoolean13;

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
	public int anInt45;

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
	public int anInt46;

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "B")
	private byte aByte2;

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "B")
	private byte aByte3;

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray1;

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "Z")
	private boolean aBoolean14;

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
	public int anInt47;

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
	public int anInt48;

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "Z")
	private boolean aBoolean15;

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "Z")
	public boolean aBoolean16;

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
	private int anInt49;

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
	private int anInt50;

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
	private int anInt51;

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
	private int anInt52;

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
	private int anInt53;

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
	private int anInt54;

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
	public int anInt55;

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "Z")
	public boolean aBoolean17;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	private int anInt42 = -1;

	static {
		aBoolean6 = true;
		aClass35_1 = new Class35(17295, 500);
		aClass35_2 = new Class35(17295, 30);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method21(@OriginalArg(0) Class39 arg0) {
		aClass1_Sub3_Sub3_1 = new Class1_Sub3_Sub3(arg0.method516("loc.dat", null), aBoolean6);
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg0.method516("loc.idx", null), aBoolean6);
		anInt40 = local21.method374();
		anIntArray3 = new int[anInt40];
		@Pc(29) int local29 = 2;
		for (@Pc(31) int local31 = 0; local31 < anInt40; local31++) {
			anIntArray3[local31] = local29;
			local29 += local21.method374();
		}
		aClass2Array1 = new Class2[10];
		for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
			aClass2Array1[local51] = new Class2();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	public static void method22(@OriginalArg(0) boolean arg0) {
		try {
			aClass35_1 = null;
			aClass35_2 = null;
			anIntArray3 = null;
			aClass2Array1 = null;
			if (arg0) {
				for (@Pc(11) int local11 = 1; local11 > 0; local11++) {
				}
			}
			aClass1_Sub3_Sub3_1 = null;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("43519, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Lclient!ac;")
	public static Class2 method23(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass2Array1[local1].anInt42 == arg0) {
				return aClass2Array1[local1];
			}
		}
		anInt41 = (anInt41 + 1) % 10;
		@Pc(27) Class2 local27 = aClass2Array1[anInt41];
		aClass1_Sub3_Sub3_1.anInt539 = anIntArray3[arg0];
		local27.anInt42 = arg0;
		local27.method24();
		local27.method25(aByte1, aClass1_Sub3_Sub3_1);
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
		this.anInt43 = 1;
		this.anInt44 = 1;
		this.aBoolean8 = true;
		this.aBoolean9 = true;
		this.aBoolean10 = false;
		this.aBoolean11 = false;
		this.aBoolean12 = false;
		this.aBoolean13 = false;
		this.anInt45 = -1;
		this.anInt46 = 16;
		this.aByte2 = 0;
		this.aByte3 = 0;
		this.aStringArray1 = null;
		this.aBoolean14 = false;
		this.anInt47 = -1;
		this.anInt48 = -1;
		this.aBoolean15 = false;
		this.aBoolean16 = true;
		this.anInt49 = 128;
		this.anInt50 = 128;
		this.anInt51 = 128;
		this.anInt55 = 0;
		this.anInt52 = 0;
		this.anInt53 = 0;
		this.anInt54 = 0;
		this.aBoolean17 = false;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!kb;)V")
	private void method25(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			if (arg0 == 6) {
				@Pc(6) boolean local6 = false;
			}
			@Pc(16) int local16 = -1;
			while (true) {
				while (true) {
					@Pc(19) int local19 = arg1.method372();
					if (local19 == 0) {
						if (this.anIntArray5 == null) {
							this.anIntArray5 = new int[0];
						}
						if (local16 == -1) {
							this.aBoolean10 = false;
							if (this.anIntArray5.length > 0 && this.anIntArray5[0] == 10) {
								this.aBoolean10 = true;
							}
							if (this.aStringArray1 != null) {
								this.aBoolean10 = true;
								return;
							}
						}
						return;
					}
					@Pc(27) int local27;
					@Pc(37) int local37;
					if (local19 == 1) {
						local27 = arg1.method372();
						this.anIntArray5 = new int[local27];
						this.anIntArray4 = new int[local27];
						for (local37 = 0; local37 < local27; local37++) {
							this.anIntArray4[local37] = arg1.method374();
							this.anIntArray5[local37] = arg1.method372();
						}
					} else if (local19 == 2) {
						this.aString1 = arg1.method379();
					} else if (local19 == 3) {
						this.aByteArray1 = arg1.method380(525);
					} else if (local19 == 14) {
						this.anInt43 = arg1.method372();
					} else if (local19 == 15) {
						this.anInt44 = arg1.method372();
					} else if (local19 == 17) {
						this.aBoolean8 = false;
					} else if (local19 == 18) {
						this.aBoolean9 = false;
					} else if (local19 == 19) {
						local16 = arg1.method372();
						if (local16 == 1) {
							this.aBoolean10 = true;
						}
					} else if (local19 == 21) {
						this.aBoolean11 = true;
					} else if (local19 == 22) {
						this.aBoolean12 = true;
					} else if (local19 == 23) {
						this.aBoolean13 = true;
					} else if (local19 == 24) {
						this.anInt45 = arg1.method374();
						if (this.anInt45 == 65535) {
							this.anInt45 = -1;
						}
					} else if (local19 == 25) {
						this.aBoolean14 = true;
					} else if (local19 == 28) {
						this.anInt46 = arg1.method372();
					} else if (local19 == 29) {
						this.aByte2 = arg1.method373();
					} else if (local19 == 39) {
						this.aByte3 = arg1.method373();
					} else if (local19 >= 30 && local19 < 39) {
						if (this.aStringArray1 == null) {
							this.aStringArray1 = new String[5];
						}
						this.aStringArray1[local19 - 30] = arg1.method379();
						if (this.aStringArray1[local19 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray1[local19 - 30] = null;
						}
					} else if (local19 == 40) {
						local27 = arg1.method372();
						this.anIntArray6 = new int[local27];
						this.anIntArray7 = new int[local27];
						for (local37 = 0; local37 < local27; local37++) {
							this.anIntArray6[local37] = arg1.method374();
							this.anIntArray7[local37] = arg1.method374();
						}
					} else if (local19 == 60) {
						this.anInt47 = arg1.method374();
					} else if (local19 == 62) {
						this.aBoolean15 = true;
					} else if (local19 == 64) {
						this.aBoolean16 = false;
					} else if (local19 == 65) {
						this.anInt49 = arg1.method374();
					} else if (local19 == 66) {
						this.anInt50 = arg1.method374();
					} else if (local19 == 67) {
						this.anInt51 = arg1.method374();
					} else if (local19 == 68) {
						this.anInt48 = arg1.method374();
					} else if (local19 == 69) {
						this.anInt55 = arg1.method372();
					} else if (local19 == 70) {
						this.anInt52 = arg1.method375();
					} else if (local19 == 71) {
						this.anInt53 = arg1.method375();
					} else if (local19 == 72) {
						this.anInt54 = arg1.method375();
					} else if (local19 == 73) {
						this.aBoolean17 = true;
					}
				}
			}
		} catch (@Pc(413) RuntimeException local413) {
			signlink.reporterror("43934, " + arg0 + ", " + arg1 + ", " + local413.toString());
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
		@Pc(47) long local47 = (long) ((this.anInt42 << 6) + (local3 << 3) + arg1) + ((long) (arg6 + 1) << 32);
		if (aBoolean7) {
			local47 = 0L;
		}
		@Pc(56) Class1_Sub3_Sub1 local56 = (Class1_Sub3_Sub1) aClass35_2.method507(local47);
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
			@Pc(188) boolean local188 = this.aBoolean15 ^ arg1 > 3;
			if (local188) {
				local91 += 65536;
			}
			@Pc(200) Class1_Sub3_Sub1 local200 = (Class1_Sub3_Sub1) aClass35_1.method507((long) local91);
			if (local200 == null) {
				local200 = new Class1_Sub3_Sub1(local91 & 0xFFFF, true);
				if (local188) {
					local200.method226();
				}
				aClass35_1.method508((long) local91, local200, (byte) 3);
			}
			@Pc(235) boolean local235;
			if (this.anInt49 == 128 && this.anInt50 == 128 && this.anInt51 == 128) {
				local235 = false;
			} else {
				local235 = true;
			}
			@Pc(250) boolean local250;
			if (this.anInt52 == 0 && this.anInt53 == 0 && this.anInt54 == 0) {
				local250 = false;
			} else {
				local250 = true;
			}
			@Pc(284) Class1_Sub3_Sub1 local284 = new Class1_Sub3_Sub1(arg1 == 0 && arg6 == -1 && !local235 && !local250, (byte) 8, this.anIntArray6 == null, !this.aBoolean14, local200);
			if (arg6 != -1) {
				local284.method218();
				local284.method219(arg6);
				local284.anIntArrayArray7 = null;
				local284.anIntArrayArray6 = null;
			}
			while (arg1-- > 0) {
				local284.method222((byte) 4);
			}
			if (this.anIntArray6 != null) {
				for (local141 = 0; local141 < this.anIntArray6.length; local141++) {
					local284.method225(this.anIntArray6[local141], this.anIntArray7[local141]);
				}
			}
			if (local235) {
				local284.method227(this.anInt50, this.anInt51, this.anInt49);
			}
			if (local250) {
				local284.method224(this.anInt53, this.anInt54, this.anInt52);
			}
			local284.method228(this.aByte2 + 64, this.aByte3 * 5 + 768, -50, -10, -50, !this.aBoolean12);
			if (this.aBoolean8) {
				local284.anInt352 = local284.anInt348;
			}
			aClass35_2.method508(local47, local284, (byte) 3);
			if (this.aBoolean11 || this.aBoolean12) {
				local284 = new Class1_Sub3_Sub1(local284, this.aBoolean11, 0, this.aBoolean12);
			}
			if (this.aBoolean11) {
				local141 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (@Pc(417) int local417 = 0; local417 < local284.anInt339; local417++) {
					@Pc(424) int local424 = local284.anIntArray91[local417];
					@Pc(429) int local429 = local284.anIntArray93[local417];
					@Pc(441) int local441 = arg2 + (arg3 - arg2) * (local424 + 64) / 128;
					@Pc(453) int local453 = arg5 + (arg4 - arg5) * (local424 + 64) / 128;
					@Pc(465) int local465 = local441 + (local453 - local441) * (local429 + 64) / 128;
					local284.anIntArray92[local417] += local465 - local141;
				}
				local284.method216(452);
			}
			return local284;
		} else if (aBoolean7) {
			return local56;
		} else {
			if (this.aBoolean11 || this.aBoolean12) {
				local56 = new Class1_Sub3_Sub1(local56, this.aBoolean11, 0, this.aBoolean12);
			}
			if (this.aBoolean11) {
				local91 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (@Pc(93) int local93 = 0; local93 < local56.anInt339; local93++) {
					@Pc(100) int local100 = local56.anIntArray91[local93];
					@Pc(105) int local105 = local56.anIntArray93[local93];
					@Pc(117) int local117 = arg2 + (arg3 - arg2) * (local100 + 64) / 128;
					@Pc(129) int local129 = arg5 + (arg4 - arg5) * (local100 + 64) / 128;
					local141 = local117 + (local129 - local117) * (local105 + 64) / 128;
					local56.anIntArray92[local93] += local141 - local91;
				}
				local56.method216(452);
			}
			return local56;
		}
	}
}
