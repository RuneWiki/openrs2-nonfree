import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DDJHHGTJ")
public final class Class5 {

	@OriginalMember(owner = "client!DDJHHGTJ", name = "f", descriptor = "[Lclient!DDJHHGTJ;")
	private static Class5[] aClass5Array1;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "g", descriptor = "Lclient!GHHPHSRU;")
	private static Class3_Sub1_Sub2 aClass3_Sub1_Sub2_1;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "n", descriptor = "[I")
	private static int[] anIntArray5;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "r", descriptor = "I")
	private static int anInt47;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "J", descriptor = "I")
	private static int anInt57;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "L", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "m", descriptor = "Lclient!VNWSQIXW;")
	public static Class35 aClass35_2 = new Class35(30, (byte) 8);

	@OriginalMember(owner = "client!DDJHHGTJ", name = "b", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray1;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "e", descriptor = "I")
	private int anInt40;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "l", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "q", descriptor = "I")
	private int anInt46;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "t", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "z", descriptor = "[I")
	public int[] anIntArray7;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "A", descriptor = "[I")
	private int[] anIntArray8;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "B", descriptor = "[I")
	private int[] anIntArray9;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "D", descriptor = "I")
	private int anInt54;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "H", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "K", descriptor = "[I")
	private int[] anIntArray10;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "a", descriptor = "I")
	private int anInt38 = -1;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "c", descriptor = "Z")
	public boolean aBoolean7 = true;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "d", descriptor = "I")
	private int anInt39 = -1;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "h", descriptor = "I")
	public int anInt41 = -1;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "i", descriptor = "B")
	public byte aByte1 = 1;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "j", descriptor = "I")
	private int anInt42 = -754;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "k", descriptor = "I")
	public int anInt43 = 32;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "o", descriptor = "I")
	private int anInt44 = 128;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "p", descriptor = "I")
	private int anInt45 = 128;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "s", descriptor = "I")
	public int anInt48 = -1;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "u", descriptor = "I")
	public int anInt49 = -1;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "v", descriptor = "Z")
	public boolean aBoolean8 = true;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "w", descriptor = "I")
	private int anInt50 = -1;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "x", descriptor = "I")
	public int anInt51 = -1;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "y", descriptor = "I")
	private int anInt52 = -1;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "C", descriptor = "I")
	public int anInt53 = -1;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "E", descriptor = "I")
	private int anInt55 = -1;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "F", descriptor = "Z")
	public boolean aBoolean9 = false;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "G", descriptor = "I")
	public int anInt56 = -1;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "I", descriptor = "J")
	public long aLong4 = -1L;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "M", descriptor = "I")
	public int anInt58 = -1;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "N", descriptor = "I")
	private int anInt59 = 690;

	@OriginalMember(owner = "client!DDJHHGTJ", name = "a", descriptor = "(I)V")
	public static void method22() {
		try {
			aClass35_2 = null;
			anIntArray5 = null;
			aClass5Array1 = null;
			aClass3_Sub1_Sub2_1 = null;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("14974, " + 2 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DDJHHGTJ", name = "c", descriptor = "(I)Lclient!DDJHHGTJ;")
	public static Class5 method24(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass5Array1[local1].aLong4 == (long) arg0) {
				return aClass5Array1[local1];
			}
		}
		anInt47 = (anInt47 + 1) % 20;
		@Pc(33) Class5 local33 = aClass5Array1[anInt47] = new Class5();
		aClass3_Sub1_Sub2_1.anInt257 = anIntArray5[arg0];
		local33.aLong4 = arg0;
		local33.method21(aClass3_Sub1_Sub2_1);
		return local33;
	}

	@OriginalMember(owner = "client!DDJHHGTJ", name = "a", descriptor = "(Lclient!DTIATKJO;)V")
	public static void method27(@OriginalArg(0) Class7 arg0) {
		aClass3_Sub1_Sub2_1 = new Class3_Sub1_Sub2(-527, arg0.method30("npc.dat", null));
		@Pc(19) Class3_Sub1_Sub2 local19 = new Class3_Sub1_Sub2(-527, arg0.method30("npc.idx", null));
		anInt57 = local19.method91();
		anIntArray5 = new int[anInt57];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt57; local29++) {
			anIntArray5[local29] = local27;
			local27 += local19.method91();
		}
		aClass5Array1 = new Class5[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass5Array1[local49] = new Class5();
		}
	}

	@OriginalMember(owner = "client!DDJHHGTJ", name = "<init>", descriptor = "()V")
	private Class5() {
	}

	@OriginalMember(owner = "client!DDJHHGTJ", name = "a", descriptor = "([IIII)Lclient!OQIGXOFQ;")
	public Class3_Sub1_Sub1_Sub3 method20(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.anIntArray7 != null) {
				@Pc(8) Class5 local8 = this.method26();
				return local8 == null ? null : local8.method20(arg0, arg1, arg2);
			}
			@Pc(25) Class3_Sub1_Sub1_Sub3 local25 = (Class3_Sub1_Sub1_Sub3) aClass35_2.method474(this.aLong4);
			if (local25 == null) {
				@Pc(35) boolean local35 = false;
				for (@Pc(37) int local37 = 0; local37 < this.anIntArray10.length; local37++) {
					if (!Class3_Sub1_Sub1_Sub3.method322(this.anIntArray10[local37])) {
						local35 = true;
					}
				}
				if (local35) {
					return null;
				}
				@Pc(62) Class3_Sub1_Sub1_Sub3[] local62 = new Class3_Sub1_Sub1_Sub3[this.anIntArray10.length];
				for (@Pc(64) int local64 = 0; local64 < this.anIntArray10.length; local64++) {
					local62[local64] = Class3_Sub1_Sub1_Sub3.method321(this.anIntArray10[local64]);
				}
				if (local62.length == 1) {
					local25 = local62[0];
				} else {
					local25 = new Class3_Sub1_Sub1_Sub3(local62.length, -537, local62);
				}
				if (this.anIntArray8 != null) {
					for (@Pc(103) int local103 = 0; local103 < this.anIntArray8.length; local103++) {
						local25.method335(this.anIntArray8[local103], this.anIntArray9[local103]);
					}
				}
				local25.method328();
				local25.method338(this.anInt54 + 64, this.anInt40 + 850, -30, -50, -30, true);
				aClass35_2.method475(this.aLong4, local25);
			}
			@Pc(146) Class3_Sub1_Sub1_Sub3 local146 = Class3_Sub1_Sub1_Sub3.aClass3_Sub1_Sub1_Sub3_2;
			local146.method323(local25, Class47.method554(arg1) & Class47.method554(arg2));
			if (arg1 != -1 && arg2 != -1) {
				local146.method330(arg1, arg0, arg2);
			} else if (arg1 != -1) {
				local146.method329(arg1);
			}
			if (this.anInt44 != 128 || this.anInt45 != 128) {
				local146.method337(this.anInt45, this.anInt44, this.anInt44);
			}
			local146.method325(this.anInt46);
			local146.anIntArrayArray9 = null;
			local146.anIntArrayArray8 = null;
			if (this.aByte1 == 1) {
				local146.aBoolean124 = true;
			}
			return local146;
		} catch (@Pc(215) RuntimeException local215) {
			signlink.reporterror("85792, " + arg0 + ", " + 7 + ", " + arg1 + ", " + arg2 + ", " + local215.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DDJHHGTJ", name = "a", descriptor = "(Lclient!GHHPHSRU;I)V")
	private void method21(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method89();
				if (local13 == 0) {
					return;
				}
				@Pc(22) int local22;
				@Pc(28) int local28;
				if (local13 == 1) {
					local22 = arg0.method89();
					this.anIntArray10 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray10[local28] = arg0.method91();
					}
				} else if (local13 == 2) {
					this.aString1 = arg0.method96();
				} else if (local13 == 3) {
					this.aByteArray1 = arg0.method97();
				} else if (local13 == 12) {
					this.aByte1 = arg0.method90();
				} else if (local13 == 13) {
					this.anInt58 = arg0.method91();
				} else if (local13 == 14) {
					this.anInt48 = arg0.method91();
				} else if (local13 == 17) {
					this.anInt48 = arg0.method91();
					this.anInt56 = arg0.method91();
					this.anInt51 = arg0.method91();
					this.anInt49 = arg0.method91();
				} else if (local13 >= 30 && local13 < 40) {
					if (this.aStringArray1 == null) {
						this.aStringArray1 = new String[5];
					}
					this.aStringArray1[local13 - 30] = arg0.method96();
					if (this.aStringArray1[local13 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray1[local13 - 30] = null;
					}
				} else if (local13 == 40) {
					local22 = arg0.method89();
					this.anIntArray8 = new int[local22];
					this.anIntArray9 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray8[local28] = arg0.method91();
						this.anIntArray9[local28] = arg0.method91();
					}
				} else if (local13 == 60) {
					local22 = arg0.method89();
					this.anIntArray6 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray6[local28] = arg0.method91();
					}
				} else if (local13 == 90) {
					this.anInt39 = arg0.method91();
				} else if (local13 == 91) {
					this.anInt38 = arg0.method91();
				} else if (local13 == 92) {
					this.anInt52 = arg0.method91();
				} else if (local13 == 93) {
					this.aBoolean8 = false;
				} else if (local13 == 95) {
					this.anInt53 = arg0.method91();
				} else if (local13 == 97) {
					this.anInt44 = arg0.method91();
				} else if (local13 == 98) {
					this.anInt45 = arg0.method91();
				} else if (local13 == 99) {
					this.aBoolean9 = true;
				} else if (local13 == 100) {
					this.anInt54 = arg0.method90();
				} else if (local13 == 101) {
					this.anInt40 = arg0.method90() * 5;
				} else if (local13 == 102) {
					this.anInt41 = arg0.method91();
				} else if (local13 == 103) {
					this.anInt43 = arg0.method91();
				} else if (local13 == 106) {
					this.anInt50 = arg0.method91();
					if (this.anInt50 == 65535) {
						this.anInt50 = -1;
					}
					this.anInt55 = arg0.method91();
					if (this.anInt55 == 65535) {
						this.anInt55 = -1;
					}
					local22 = arg0.method89();
					this.anIntArray7 = new int[local22 + 1];
					for (local28 = 0; local28 <= local22; local28++) {
						this.anIntArray7[local28] = arg0.method91();
						if (this.anIntArray7[local28] == 65535) {
							this.anIntArray7[local28] = -1;
						}
					}
				} else if (local13 == 107) {
					this.aBoolean7 = false;
				}
			}
		} catch (@Pc(387) RuntimeException local387) {
			signlink.reporterror("27647, " + arg0 + ", " + 0 + ", " + local387.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DDJHHGTJ", name = "b", descriptor = "(I)Z")
	public boolean method23() {
		try {
			if (this.anIntArray7 == null) {
				return true;
			}
			@Pc(6) int local6 = -1;
			if (this.anInt50 != -1) {
				@Pc(22) Class22 local22 = Class22.aClass22Array1[this.anInt50];
				@Pc(25) int local25 = local22.anInt529;
				@Pc(28) int local28 = local22.anInt530;
				@Pc(31) int local31 = local22.anInt531;
				@Pc(37) int local37 = client.anIntArray229[local31 - local28];
				local6 = aClient1.anIntArray272[local25] >> local28 & local37;
			} else if (this.anInt55 != -1) {
				local6 = aClient1.anIntArray272[this.anInt55];
			}
			return local6 >= 0 && local6 < this.anIntArray7.length && this.anIntArray7[local6] != -1;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("57229, " + 21262 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DDJHHGTJ", name = "d", descriptor = "(I)Lclient!OQIGXOFQ;")
	public Class3_Sub1_Sub1_Sub3 method25() {
		try {
			if (this.anIntArray7 != null) {
				@Pc(8) Class5 local8 = this.method26();
				return local8 == null ? null : local8.method25();
			} else if (this.anIntArray6 == null) {
				return null;
			} else {
				@Pc(23) boolean local23 = false;
				for (@Pc(31) int local31 = 0; local31 < this.anIntArray6.length; local31++) {
					if (!Class3_Sub1_Sub1_Sub3.method322(this.anIntArray6[local31])) {
						local23 = true;
					}
				}
				if (local23) {
					return null;
				}
				@Pc(56) Class3_Sub1_Sub1_Sub3[] local56 = new Class3_Sub1_Sub1_Sub3[this.anIntArray6.length];
				for (@Pc(58) int local58 = 0; local58 < this.anIntArray6.length; local58++) {
					local56[local58] = Class3_Sub1_Sub1_Sub3.method321(this.anIntArray6[local58]);
				}
				@Pc(82) Class3_Sub1_Sub1_Sub3 local82;
				if (local56.length == 1) {
					local82 = local56[0];
				} else {
					local82 = new Class3_Sub1_Sub1_Sub3(local56.length, -537, local56);
				}
				if (this.anIntArray8 != null) {
					for (@Pc(97) int local97 = 0; local97 < this.anIntArray8.length; local97++) {
						local82.method335(this.anIntArray8[local97], this.anIntArray9[local97]);
					}
				}
				return local82;
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("86388, " + 600 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DDJHHGTJ", name = "e", descriptor = "(I)Lclient!DDJHHGTJ;")
	public Class5 method26() {
		try {
			@Pc(7) int local7 = -1;
			if (this.anInt50 != -1) {
				@Pc(16) Class22 local16 = Class22.aClass22Array1[this.anInt50];
				@Pc(19) int local19 = local16.anInt529;
				@Pc(22) int local22 = local16.anInt530;
				@Pc(25) int local25 = local16.anInt531;
				@Pc(31) int local31 = client.anIntArray229[local25 - local22];
				local7 = aClient1.anIntArray272[local19] >> local22 & local31;
			} else if (this.anInt55 != -1) {
				local7 = aClient1.anIntArray272[this.anInt55];
			}
			return local7 < 0 || local7 >= this.anIntArray7.length || this.anIntArray7[local7] == -1 ? null : method24(this.anIntArray7[local7]);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("11754, " + 46311 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
