import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BJGOYLYN")
public final class Class2 {

	@OriginalMember(owner = "client!BJGOYLYN", name = "b", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!BJGOYLYN", name = "h", descriptor = "I")
	private static int anInt16;

	@OriginalMember(owner = "client!BJGOYLYN", name = "k", descriptor = "[Lclient!BJGOYLYN;")
	private static Class2[] aClass2Array1;

	@OriginalMember(owner = "client!BJGOYLYN", name = "n", descriptor = "Lclient!WNCFPLWV;")
	private static Class3_Sub1_Sub4 aClass3_Sub1_Sub4_1;

	@OriginalMember(owner = "client!BJGOYLYN", name = "J", descriptor = "I")
	private static int anInt31;

	@OriginalMember(owner = "client!BJGOYLYN", name = "L", descriptor = "[I")
	private static int[] anIntArray5;

	@OriginalMember(owner = "client!BJGOYLYN", name = "w", descriptor = "Lclient!DSCQIAPU;")
	public static Class7 aClass7_1 = new Class7(401, 30);

	@OriginalMember(owner = "client!BJGOYLYN", name = "a", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!BJGOYLYN", name = "f", descriptor = "[I")
	private int[] anIntArray1;

	@OriginalMember(owner = "client!BJGOYLYN", name = "r", descriptor = "I")
	private int anInt19;

	@OriginalMember(owner = "client!BJGOYLYN", name = "t", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray1;

	@OriginalMember(owner = "client!BJGOYLYN", name = "v", descriptor = "[I")
	private int[] anIntArray2;

	@OriginalMember(owner = "client!BJGOYLYN", name = "x", descriptor = "[I")
	public int[] anIntArray3;

	@OriginalMember(owner = "client!BJGOYLYN", name = "A", descriptor = "[I")
	private int[] anIntArray4;

	@OriginalMember(owner = "client!BJGOYLYN", name = "F", descriptor = "I")
	private int anInt27;

	@OriginalMember(owner = "client!BJGOYLYN", name = "M", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!BJGOYLYN", name = "c", descriptor = "I")
	private int anInt13 = 128;

	@OriginalMember(owner = "client!BJGOYLYN", name = "d", descriptor = "I")
	public int anInt14 = -1;

	@OriginalMember(owner = "client!BJGOYLYN", name = "e", descriptor = "Z")
	public boolean aBoolean1 = false;

	@OriginalMember(owner = "client!BJGOYLYN", name = "g", descriptor = "I")
	private int anInt15 = -1;

	@OriginalMember(owner = "client!BJGOYLYN", name = "i", descriptor = "Z")
	public boolean aBoolean2 = true;

	@OriginalMember(owner = "client!BJGOYLYN", name = "j", descriptor = "I")
	public int anInt17 = -1;

	@OriginalMember(owner = "client!BJGOYLYN", name = "l", descriptor = "J")
	public long aLong1 = -1L;

	@OriginalMember(owner = "client!BJGOYLYN", name = "m", descriptor = "Z")
	private boolean aBoolean3 = false;

	@OriginalMember(owner = "client!BJGOYLYN", name = "o", descriptor = "B")
	public byte aByte2 = 1;

	@OriginalMember(owner = "client!BJGOYLYN", name = "p", descriptor = "Ljava/lang/String;")
	public String aString1 = "null";

	@OriginalMember(owner = "client!BJGOYLYN", name = "q", descriptor = "I")
	private int anInt18 = -1;

	@OriginalMember(owner = "client!BJGOYLYN", name = "s", descriptor = "I")
	private int anInt20 = -1;

	@OriginalMember(owner = "client!BJGOYLYN", name = "u", descriptor = "I")
	private int anInt21 = -1;

	@OriginalMember(owner = "client!BJGOYLYN", name = "y", descriptor = "I")
	public int anInt22 = -1;

	@OriginalMember(owner = "client!BJGOYLYN", name = "z", descriptor = "I")
	public int anInt23 = -1;

	@OriginalMember(owner = "client!BJGOYLYN", name = "B", descriptor = "I")
	public int anInt24 = -1;

	@OriginalMember(owner = "client!BJGOYLYN", name = "C", descriptor = "Z")
	public boolean aBoolean4 = true;

	@OriginalMember(owner = "client!BJGOYLYN", name = "D", descriptor = "I")
	public int anInt25 = -1;

	@OriginalMember(owner = "client!BJGOYLYN", name = "E", descriptor = "I")
	private int anInt26 = 128;

	@OriginalMember(owner = "client!BJGOYLYN", name = "G", descriptor = "I")
	private int anInt28 = 45895;

	@OriginalMember(owner = "client!BJGOYLYN", name = "H", descriptor = "I")
	public int anInt29 = -1;

	@OriginalMember(owner = "client!BJGOYLYN", name = "I", descriptor = "I")
	private int anInt30 = -1;

	@OriginalMember(owner = "client!BJGOYLYN", name = "K", descriptor = "I")
	public int anInt32 = 32;

	@OriginalMember(owner = "client!BJGOYLYN", name = "a", descriptor = "(I)V")
	public static void method3() {
		try {
			aClass7_1 = null;
			anIntArray5 = null;
			aClass2Array1 = null;
			aClass3_Sub1_Sub4_1 = null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("84288, " + 0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJGOYLYN", name = "b", descriptor = "(I)Lclient!BJGOYLYN;")
	public static Class2 method4(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass2Array1[local1].aLong1 == (long) arg0) {
				return aClass2Array1[local1];
			}
		}
		anInt31 = (anInt31 + 1) % 20;
		@Pc(33) Class2 local33 = aClass2Array1[anInt31] = new Class2();
		aClass3_Sub1_Sub4_1.anInt666 = anIntArray5[arg0];
		local33.aLong1 = arg0;
		local33.method5(aClass3_Sub1_Sub4_1);
		return local33;
	}

	@OriginalMember(owner = "client!BJGOYLYN", name = "a", descriptor = "(Lclient!RPFMUSNN;)V")
	public static void method8(@OriginalArg(0) Class35 arg0) {
		aClass3_Sub1_Sub4_1 = new Class3_Sub1_Sub4((byte) -58, arg0.method341("npc.dat", null));
		@Pc(19) Class3_Sub1_Sub4 local19 = new Class3_Sub1_Sub4((byte) -58, arg0.method341("npc.idx", null));
		anInt16 = local19.method460();
		anIntArray5 = new int[anInt16];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt16; local29++) {
			anIntArray5[local29] = local27;
			local27 += local19.method460();
		}
		aClass2Array1 = new Class2[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass2Array1[local49] = new Class2();
		}
	}

	@OriginalMember(owner = "client!BJGOYLYN", name = "<init>", descriptor = "()V")
	private Class2() {
	}

	@OriginalMember(owner = "client!BJGOYLYN", name = "a", descriptor = "(Z)Z")
	public boolean method1() {
		try {
			if (this.anIntArray3 == null) {
				return true;
			}
			@Pc(6) int local6 = -1;
			if (this.anInt15 != -1) {
				@Pc(20) Class43 local20 = Class43.aClass43Array1[this.anInt15];
				@Pc(23) int local23 = local20.anInt645;
				@Pc(26) int local26 = local20.anInt646;
				@Pc(29) int local29 = local20.anInt647;
				@Pc(35) int local35 = client.anIntArray219[local29 - local26];
				local6 = aClient1.anIntArray273[local23] >> local26 & local35;
			} else if (this.anInt21 != -1) {
				local6 = aClient1.anIntArray273[this.anInt21];
			}
			return local6 >= 0 && local6 < this.anIntArray3.length && this.anIntArray3[local6] != -1;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("40054, " + true + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJGOYLYN", name = "a", descriptor = "(I[IIZ)Lclient!UNLYQRUD;")
	public Class3_Sub1_Sub1_Sub5 method2(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.anIntArray3 != null) {
				@Pc(8) Class2 local8 = this.method6();
				return local8 == null ? null : local8.method2(arg0, arg1, arg2);
			}
			@Pc(25) Class3_Sub1_Sub1_Sub5 local25 = (Class3_Sub1_Sub1_Sub5) aClass7_1.method65(this.aLong1);
			if (local25 == null) {
				@Pc(29) boolean local29 = false;
				for (@Pc(31) int local31 = 0; local31 < this.anIntArray4.length; local31++) {
					if (!Class3_Sub1_Sub1_Sub5.method397(this.anIntArray4[local31])) {
						local29 = true;
					}
				}
				if (local29) {
					return null;
				}
				@Pc(56) Class3_Sub1_Sub1_Sub5[] local56 = new Class3_Sub1_Sub1_Sub5[this.anIntArray4.length];
				for (@Pc(58) int local58 = 0; local58 < this.anIntArray4.length; local58++) {
					local56[local58] = Class3_Sub1_Sub1_Sub5.method396(this.anIntArray4[local58]);
				}
				if (local56.length == 1) {
					local25 = local56[0];
				} else {
					local25 = new Class3_Sub1_Sub1_Sub5(local56.length, local56, 0);
				}
				if (this.anIntArray6 != null) {
					for (@Pc(97) int local97 = 0; local97 < this.anIntArray6.length; local97++) {
						local25.method410(this.anIntArray6[local97], this.anIntArray1[local97]);
					}
				}
				local25.method403(956);
				local25.method413(this.anInt19 + 64, this.anInt27 + 850, -30, -50, -30, true);
				aClass7_1.method66(local25, this.aLong1);
			}
			@Pc(140) Class3_Sub1_Sub1_Sub5 local140 = Class3_Sub1_Sub1_Sub5.aClass3_Sub1_Sub1_Sub5_1;
			local140.method398(Class5.method64(arg2) & Class5.method64(arg0), this.anInt28, local25);
			if (arg2 != -1 && arg0 != -1) {
				local140.method405(arg0, arg2, arg1);
			} else if (arg2 != -1) {
				local140.method404(936, arg2);
			}
			if (this.anInt13 != 128 || this.anInt26 != 128) {
				local140.method412(this.anInt13, this.anInt26, this.anInt13);
			}
			local140.method400();
			local140.anIntArrayArray15 = null;
			local140.anIntArrayArray14 = null;
			if (this.aByte2 == 1) {
				local140.aBoolean139 = true;
			}
			return local140;
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("92877, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJGOYLYN", name = "a", descriptor = "(ILclient!WNCFPLWV;)V")
	private void method5(@OriginalArg(1) Class3_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method458();
				if (local10 == 0) {
					return;
				}
				@Pc(19) int local19;
				@Pc(25) int local25;
				if (local10 == 1) {
					local19 = arg0.method458();
					this.anIntArray4 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray4[local25] = arg0.method460();
					}
				} else if (local10 == 2) {
					this.aString1 = arg0.method465();
				} else if (local10 == 3) {
					this.aByteArray1 = arg0.method466();
				} else if (local10 == 12) {
					this.aByte2 = arg0.method459();
				} else if (local10 == 13) {
					this.anInt23 = arg0.method460();
				} else if (local10 == 14) {
					this.anInt17 = arg0.method460();
				} else if (local10 == 17) {
					this.anInt17 = arg0.method460();
					this.anInt22 = arg0.method460();
					this.anInt14 = arg0.method460();
					this.anInt29 = arg0.method460();
				} else if (local10 >= 30 && local10 < 40) {
					if (this.aStringArray1 == null) {
						this.aStringArray1 = new String[5];
					}
					this.aStringArray1[local10 - 30] = arg0.method465();
					if (this.aStringArray1[local10 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray1[local10 - 30] = null;
					}
				} else if (local10 == 40) {
					local19 = arg0.method458();
					this.anIntArray6 = new int[local19];
					this.anIntArray1 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray6[local25] = arg0.method460();
						this.anIntArray1[local25] = arg0.method460();
					}
				} else if (local10 == 60) {
					local19 = arg0.method458();
					this.anIntArray2 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray2[local25] = arg0.method460();
					}
				} else if (local10 == 90) {
					this.anInt18 = arg0.method460();
				} else if (local10 == 91) {
					this.anInt30 = arg0.method460();
				} else if (local10 == 92) {
					this.anInt20 = arg0.method460();
				} else if (local10 == 93) {
					this.aBoolean4 = false;
				} else if (local10 == 95) {
					this.anInt24 = arg0.method460();
				} else if (local10 == 97) {
					this.anInt13 = arg0.method460();
				} else if (local10 == 98) {
					this.anInt26 = arg0.method460();
				} else if (local10 == 99) {
					this.aBoolean1 = true;
				} else if (local10 == 100) {
					this.anInt19 = arg0.method459();
				} else if (local10 == 101) {
					this.anInt27 = arg0.method459() * 5;
				} else if (local10 == 102) {
					this.anInt25 = arg0.method460();
				} else if (local10 == 103) {
					this.anInt32 = arg0.method460();
				} else if (local10 == 106) {
					this.anInt15 = arg0.method460();
					if (this.anInt15 == 65535) {
						this.anInt15 = -1;
					}
					this.anInt21 = arg0.method460();
					if (this.anInt21 == 65535) {
						this.anInt21 = -1;
					}
					local19 = arg0.method458();
					this.anIntArray3 = new int[local19 + 1];
					for (local25 = 0; local25 <= local19; local25++) {
						this.anIntArray3[local25] = arg0.method460();
						if (this.anIntArray3[local25] == 65535) {
							this.anIntArray3[local25] = -1;
						}
					}
				} else if (local10 == 107) {
					this.aBoolean2 = false;
				}
			}
		} catch (@Pc(384) RuntimeException local384) {
			signlink.reporterror("83421, " + -934 + ", " + arg0 + ", " + local384.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJGOYLYN", name = "c", descriptor = "(I)Lclient!BJGOYLYN;")
	public Class2 method6() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt15 != -1) {
				@Pc(20) Class43 local20 = Class43.aClass43Array1[this.anInt15];
				@Pc(23) int local23 = local20.anInt645;
				@Pc(26) int local26 = local20.anInt646;
				@Pc(29) int local29 = local20.anInt647;
				@Pc(35) int local35 = client.anIntArray219[local29 - local26];
				local1 = aClient1.anIntArray273[local23] >> local26 & local35;
			} else if (this.anInt21 != -1) {
				local1 = aClient1.anIntArray273[this.anInt21];
			}
			return local1 < 0 || local1 >= this.anIntArray3.length || this.anIntArray3[local1] == -1 ? null : method4(this.anIntArray3[local1]);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("16024, " + 324 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJGOYLYN", name = "d", descriptor = "(I)Lclient!UNLYQRUD;")
	public Class3_Sub1_Sub1_Sub5 method7() {
		try {
			if (this.anIntArray3 != null) {
				@Pc(20) Class2 local20 = this.method6();
				return local20 == null ? null : local20.method7();
			} else if (this.anIntArray2 == null) {
				return null;
			} else {
				@Pc(35) boolean local35 = false;
				for (@Pc(37) int local37 = 0; local37 < this.anIntArray2.length; local37++) {
					if (!Class3_Sub1_Sub1_Sub5.method397(this.anIntArray2[local37])) {
						local35 = true;
					}
				}
				if (local35) {
					return null;
				}
				@Pc(62) Class3_Sub1_Sub1_Sub5[] local62 = new Class3_Sub1_Sub1_Sub5[this.anIntArray2.length];
				for (@Pc(64) int local64 = 0; local64 < this.anIntArray2.length; local64++) {
					local62[local64] = Class3_Sub1_Sub1_Sub5.method396(this.anIntArray2[local64]);
				}
				@Pc(88) Class3_Sub1_Sub1_Sub5 local88;
				if (local62.length == 1) {
					local88 = local62[0];
				} else {
					local88 = new Class3_Sub1_Sub1_Sub5(local62.length, local62, 0);
				}
				if (this.anIntArray6 != null) {
					for (@Pc(103) int local103 = 0; local103 < this.anIntArray6.length; local103++) {
						local88.method410(this.anIntArray6[local103], this.anIntArray1[local103]);
					}
				}
				return local88;
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("76298, " + -748 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}
}
