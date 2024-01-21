import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PJGEBWSY")
public final class Class30 {

	@OriginalMember(owner = "client!PJGEBWSY", name = "b", descriptor = "I")
	private static int anInt494;

	@OriginalMember(owner = "client!PJGEBWSY", name = "p", descriptor = "Lclient!WBEWPIXO;")
	private static Class3_Sub3_Sub4 aClass3_Sub3_Sub4_4;

	@OriginalMember(owner = "client!PJGEBWSY", name = "r", descriptor = "I")
	private static int anInt505;

	@OriginalMember(owner = "client!PJGEBWSY", name = "t", descriptor = "[Lclient!PJGEBWSY;")
	private static Class30[] aClass30Array1;

	@OriginalMember(owner = "client!PJGEBWSY", name = "x", descriptor = "Lclient!client;")
	public static client aClient3;

	@OriginalMember(owner = "client!PJGEBWSY", name = "D", descriptor = "[I")
	private static int[] anIntArray153;

	@OriginalMember(owner = "client!PJGEBWSY", name = "i", descriptor = "Lclient!NQQFCAPC;")
	public static Class25 aClass25_7 = new Class25(30, 285);

	@OriginalMember(owner = "client!PJGEBWSY", name = "H", descriptor = "Z")
	private static boolean aBoolean129 = true;

	@OriginalMember(owner = "client!PJGEBWSY", name = "a", descriptor = "[I")
	private int[] anIntArray149;

	@OriginalMember(owner = "client!PJGEBWSY", name = "h", descriptor = "I")
	private int anInt498;

	@OriginalMember(owner = "client!PJGEBWSY", name = "l", descriptor = "I")
	private int anInt500;

	@OriginalMember(owner = "client!PJGEBWSY", name = "s", descriptor = "[I")
	private int[] anIntArray150;

	@OriginalMember(owner = "client!PJGEBWSY", name = "v", descriptor = "[I")
	public int[] anIntArray151;

	@OriginalMember(owner = "client!PJGEBWSY", name = "B", descriptor = "[I")
	private int[] anIntArray152;

	@OriginalMember(owner = "client!PJGEBWSY", name = "F", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray5;

	@OriginalMember(owner = "client!PJGEBWSY", name = "I", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!PJGEBWSY", name = "M", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!PJGEBWSY", name = "c", descriptor = "I")
	private int anInt495 = -1;

	@OriginalMember(owner = "client!PJGEBWSY", name = "d", descriptor = "I")
	public int anInt496 = -1;

	@OriginalMember(owner = "client!PJGEBWSY", name = "e", descriptor = "J")
	public long aLong18 = -1L;

	@OriginalMember(owner = "client!PJGEBWSY", name = "f", descriptor = "Z")
	public boolean aBoolean126 = true;

	@OriginalMember(owner = "client!PJGEBWSY", name = "g", descriptor = "I")
	private int anInt497 = -1;

	@OriginalMember(owner = "client!PJGEBWSY", name = "j", descriptor = "Z")
	private boolean aBoolean127 = true;

	@OriginalMember(owner = "client!PJGEBWSY", name = "k", descriptor = "I")
	private int anInt499 = -1;

	@OriginalMember(owner = "client!PJGEBWSY", name = "m", descriptor = "I")
	public int anInt501 = -1;

	@OriginalMember(owner = "client!PJGEBWSY", name = "n", descriptor = "I")
	public int anInt502 = -1;

	@OriginalMember(owner = "client!PJGEBWSY", name = "o", descriptor = "I")
	public int anInt503 = -1;

	@OriginalMember(owner = "client!PJGEBWSY", name = "q", descriptor = "I")
	private int anInt504 = 128;

	@OriginalMember(owner = "client!PJGEBWSY", name = "u", descriptor = "Z")
	public boolean aBoolean128 = false;

	@OriginalMember(owner = "client!PJGEBWSY", name = "w", descriptor = "B")
	public byte aByte21 = 1;

	@OriginalMember(owner = "client!PJGEBWSY", name = "y", descriptor = "I")
	private int anInt506 = -1;

	@OriginalMember(owner = "client!PJGEBWSY", name = "z", descriptor = "I")
	public int anInt507 = 32;

	@OriginalMember(owner = "client!PJGEBWSY", name = "A", descriptor = "I")
	private int anInt508 = -1;

	@OriginalMember(owner = "client!PJGEBWSY", name = "C", descriptor = "I")
	public int anInt509 = -1;

	@OriginalMember(owner = "client!PJGEBWSY", name = "E", descriptor = "I")
	public int anInt510 = -1;

	@OriginalMember(owner = "client!PJGEBWSY", name = "G", descriptor = "Ljava/lang/String;")
	public String aString10 = "null";

	@OriginalMember(owner = "client!PJGEBWSY", name = "J", descriptor = "Z")
	public boolean aBoolean130 = true;

	@OriginalMember(owner = "client!PJGEBWSY", name = "K", descriptor = "I")
	public int anInt511 = -1;

	@OriginalMember(owner = "client!PJGEBWSY", name = "L", descriptor = "I")
	private int anInt512 = 128;

	@OriginalMember(owner = "client!PJGEBWSY", name = "b", descriptor = "(I)V")
	public static void method319() {
		try {
			aClass25_7 = null;
			anIntArray153 = null;
			aClass30Array1 = null;
			aClass3_Sub3_Sub4_4 = null;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("24719, " + 6 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PJGEBWSY", name = "c", descriptor = "(I)Lclient!PJGEBWSY;")
	public static Class30 method322(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass30Array1[local1].aLong18 == (long) arg0) {
				return aClass30Array1[local1];
			}
		}
		anInt505 = (anInt505 + 1) % 20;
		@Pc(33) Class30 local33 = aClass30Array1[anInt505] = new Class30();
		aClass3_Sub3_Sub4_4.anInt738 = anIntArray153[arg0];
		local33.aLong18 = arg0;
		local33.method320(aClass3_Sub3_Sub4_4, 767);
		return local33;
	}

	@OriginalMember(owner = "client!PJGEBWSY", name = "a", descriptor = "(Lclient!LKPVZAQN;)V")
	public static void method323(@OriginalArg(0) Class22 arg0) {
		aClass3_Sub3_Sub4_4 = new Class3_Sub3_Sub4((byte) -115, arg0.method207("npc.dat", null));
		@Pc(19) Class3_Sub3_Sub4 local19 = new Class3_Sub3_Sub4((byte) -115, arg0.method207("npc.idx", null));
		anInt494 = local19.method470();
		anIntArray153 = new int[anInt494];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt494; local29++) {
			anIntArray153[local29] = local27;
			local27 += local19.method470();
		}
		aClass30Array1 = new Class30[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass30Array1[local49] = new Class30();
		}
	}

	@OriginalMember(owner = "client!PJGEBWSY", name = "<init>", descriptor = "()V")
	private Class30() {
	}

	@OriginalMember(owner = "client!PJGEBWSY", name = "a", descriptor = "(I)Z")
	public boolean method318(@OriginalArg(0) int arg0) {
		try {
			if (this.anIntArray151 == null) {
				return true;
			}
			@Pc(6) int local6 = -1;
			@Pc(10) boolean local10 = false;
			if (this.anInt508 != -1) {
				@Pc(19) Class36 local19 = Class36.aClass36Array1[this.anInt508];
				@Pc(22) int local22 = local19.anInt721;
				@Pc(25) int local25 = local19.anInt722;
				@Pc(28) int local28 = local19.anInt723;
				@Pc(34) int local34 = client.anIntArray218[local28 - local25];
				local6 = aClient3.anIntArray272[local22] >> local25 & local34;
			} else if (this.anInt495 != -1) {
				local6 = aClient3.anIntArray272[this.anInt495];
			}
			return local6 >= 0 && local6 < this.anIntArray151.length && this.anIntArray151[local6] != -1;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("80199, " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PJGEBWSY", name = "a", descriptor = "(Lclient!WBEWPIXO;I)V")
	private void method320(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg0.method468();
					if (local8 == 0) {
						return;
					}
					@Pc(17) int local17;
					@Pc(23) int local23;
					if (local8 == 1) {
						local17 = arg0.method468();
						this.anIntArray154 = new int[local17];
						for (local23 = 0; local23 < local17; local23++) {
							this.anIntArray154[local23] = arg0.method470();
						}
					} else if (local8 == 2) {
						this.aString10 = arg0.method475();
					} else if (local8 == 3) {
						this.aByteArray18 = arg0.method476();
					} else if (local8 == 12) {
						this.aByte21 = arg0.method469();
					} else if (local8 == 13) {
						this.anInt510 = arg0.method470();
					} else if (local8 == 14) {
						this.anInt511 = arg0.method470();
					} else if (local8 == 17) {
						this.anInt511 = arg0.method470();
						this.anInt496 = arg0.method470();
						this.anInt501 = arg0.method470();
						this.anInt503 = arg0.method470();
					} else if (local8 >= 30 && local8 < 40) {
						if (this.aStringArray5 == null) {
							this.aStringArray5 = new String[5];
						}
						this.aStringArray5[local8 - 30] = arg0.method475();
						if (this.aStringArray5[local8 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray5[local8 - 30] = null;
						}
					} else if (local8 == 40) {
						local17 = arg0.method468();
						this.anIntArray152 = new int[local17];
						this.anIntArray150 = new int[local17];
						for (local23 = 0; local23 < local17; local23++) {
							this.anIntArray152[local23] = arg0.method470();
							this.anIntArray150[local23] = arg0.method470();
						}
					} else if (local8 == 60) {
						local17 = arg0.method468();
						this.anIntArray149 = new int[local17];
						for (local23 = 0; local23 < local17; local23++) {
							this.anIntArray149[local23] = arg0.method470();
						}
					} else if (local8 == 90) {
						this.anInt499 = arg0.method470();
					} else if (local8 == 91) {
						this.anInt497 = arg0.method470();
					} else if (local8 == 92) {
						this.anInt506 = arg0.method470();
					} else if (local8 == 93) {
						this.aBoolean130 = false;
					} else if (local8 == 95) {
						this.anInt502 = arg0.method470();
					} else if (local8 == 97) {
						this.anInt504 = arg0.method470();
					} else if (local8 == 98) {
						this.anInt512 = arg0.method470();
					} else if (local8 == 99) {
						this.aBoolean128 = true;
					} else if (local8 == 100) {
						this.anInt498 = arg0.method469();
					} else if (local8 == 101) {
						this.anInt500 = arg0.method469() * 5;
					} else if (local8 == 102) {
						this.anInt509 = arg0.method470();
					} else if (local8 == 103) {
						this.anInt507 = arg0.method470();
					} else if (local8 == 106) {
						this.anInt508 = arg0.method470();
						if (this.anInt508 == 65535) {
							this.anInt508 = -1;
						}
						this.anInt495 = arg0.method470();
						if (this.anInt495 == 65535) {
							this.anInt495 = -1;
						}
						local17 = arg0.method468();
						this.anIntArray151 = new int[local17 + 1];
						for (local23 = 0; local23 <= local17; local23++) {
							this.anIntArray151[local23] = arg0.method470();
							if (this.anIntArray151[local23] == 65535) {
								this.anIntArray151[local23] = -1;
							}
						}
					} else if (local8 == 107) {
						this.aBoolean126 = false;
					}
				}
			}
		} catch (@Pc(382) RuntimeException local382) {
			signlink.reporterror("31235, " + arg0 + ", " + arg1 + ", " + local382.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PJGEBWSY", name = "a", descriptor = "(Z)Lclient!PJGEBWSY;")
	public Class30 method321() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt508 != -1) {
				@Pc(16) Class36 local16 = Class36.aClass36Array1[this.anInt508];
				@Pc(19) int local19 = local16.anInt721;
				@Pc(22) int local22 = local16.anInt722;
				@Pc(25) int local25 = local16.anInt723;
				@Pc(31) int local31 = client.anIntArray218[local25 - local22];
				local1 = aClient3.anIntArray272[local19] >> local22 & local31;
			} else if (this.anInt495 != -1) {
				local1 = aClient3.anIntArray272[this.anInt495];
			}
			return local1 < 0 || local1 >= this.anIntArray151.length || this.anIntArray151[local1] == -1 ? null : method322(this.anIntArray151[local1]);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("64650, " + true + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PJGEBWSY", name = "d", descriptor = "(I)Lclient!FCIDIKVY;")
	public Class3_Sub3_Sub2_Sub3 method324(@OriginalArg(0) int arg0) {
		try {
			if (this.anIntArray151 != null) {
				@Pc(8) Class30 local8 = this.method321();
				return local8 == null ? null : local8.method324(649);
			} else if (this.anIntArray149 == null) {
				return null;
			} else {
				@Pc(23) boolean local23 = false;
				@Pc(27) boolean local27 = false;
				for (@Pc(29) int local29 = 0; local29 < this.anIntArray149.length; local29++) {
					if (!Class3_Sub3_Sub2_Sub3.method81(this.anIntArray149[local29])) {
						local23 = true;
					}
				}
				if (local23) {
					return null;
				}
				@Pc(54) Class3_Sub3_Sub2_Sub3[] local54 = new Class3_Sub3_Sub2_Sub3[this.anIntArray149.length];
				for (@Pc(56) int local56 = 0; local56 < this.anIntArray149.length; local56++) {
					local54[local56] = Class3_Sub3_Sub2_Sub3.method80(this.anIntArray149[local56]);
				}
				@Pc(80) Class3_Sub3_Sub2_Sub3 local80;
				if (local54.length == 1) {
					local80 = local54[0];
				} else {
					local80 = new Class3_Sub3_Sub2_Sub3(local54.length, -23, local54);
				}
				if (this.anIntArray152 != null) {
					for (@Pc(95) int local95 = 0; local95 < this.anIntArray152.length; local95++) {
						local80.method94(this.anIntArray152[local95], this.anIntArray150[local95]);
					}
				}
				return local80;
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("21070, " + arg0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PJGEBWSY", name = "a", descriptor = "([IIII)Lclient!FCIDIKVY;")
	public Class3_Sub3_Sub2_Sub3 method325(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.anIntArray151 != null) {
				@Pc(8) Class30 local8 = this.method321();
				return local8 == null ? null : local8.method325(arg0, arg1, arg2);
			}
			@Pc(25) Class3_Sub3_Sub2_Sub3 local25 = (Class3_Sub3_Sub2_Sub3) aClass25_7.method218(this.aLong18);
			if (local25 == null) {
				@Pc(29) boolean local29 = false;
				for (@Pc(31) int local31 = 0; local31 < this.anIntArray154.length; local31++) {
					if (!Class3_Sub3_Sub2_Sub3.method81(this.anIntArray154[local31])) {
						local29 = true;
					}
				}
				if (local29) {
					return null;
				}
				@Pc(56) Class3_Sub3_Sub2_Sub3[] local56 = new Class3_Sub3_Sub2_Sub3[this.anIntArray154.length];
				for (@Pc(58) int local58 = 0; local58 < this.anIntArray154.length; local58++) {
					local56[local58] = Class3_Sub3_Sub2_Sub3.method80(this.anIntArray154[local58]);
				}
				if (local56.length == 1) {
					local25 = local56[0];
				} else {
					local25 = new Class3_Sub3_Sub2_Sub3(local56.length, -23, local56);
				}
				if (this.anIntArray152 != null) {
					for (@Pc(97) int local97 = 0; local97 < this.anIntArray152.length; local97++) {
						local25.method94(this.anIntArray152[local97], this.anIntArray150[local97]);
					}
				}
				local25.method87();
				local25.method97(this.anInt498 + 64, this.anInt500 + 850, -30, -50, -30, true);
				aClass25_7.method219(97, this.aLong18, local25);
			}
			@Pc(140) Class3_Sub3_Sub2_Sub3 local140 = Class3_Sub3_Sub2_Sub3.aClass3_Sub3_Sub2_Sub3_1;
			local140.method82(Class12.method116(arg1) & Class12.method116(arg2), local25);
			if (arg1 != -1 && arg2 != -1) {
				local140.method89(arg0, arg1, arg2);
			} else if (arg1 != -1) {
				local140.method88(arg1);
			}
			if (this.anInt504 != 128 || this.anInt512 != 128) {
				local140.method96(this.anInt504, this.anInt504, this.aBoolean127, this.anInt512);
			}
			local140.method84();
			local140.anIntArrayArray3 = null;
			local140.anIntArrayArray2 = null;
			if (this.aByte21 == 1) {
				local140.aBoolean44 = true;
			}
			return local140;
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("75346, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local218.toString());
			throw new RuntimeException();
		}
	}
}
