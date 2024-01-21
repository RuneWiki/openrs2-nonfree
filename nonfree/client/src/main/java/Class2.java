import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!APPQAEOL")
public final class Class2 {

	@OriginalMember(owner = "client!APPQAEOL", name = "b", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!APPQAEOL", name = "g", descriptor = "Lclient!NQUAUMDT;")
	private static Class6_Sub2_Sub3 aClass6_Sub2_Sub3_1;

	@OriginalMember(owner = "client!APPQAEOL", name = "x", descriptor = "[Lclient!APPQAEOL;")
	private static Class2[] aClass2Array1;

	@OriginalMember(owner = "client!APPQAEOL", name = "z", descriptor = "I")
	private static int anInt16;

	@OriginalMember(owner = "client!APPQAEOL", name = "H", descriptor = "I")
	private static int anInt21;

	@OriginalMember(owner = "client!APPQAEOL", name = "I", descriptor = "[I")
	private static int[] anIntArray5;

	@OriginalMember(owner = "client!APPQAEOL", name = "f", descriptor = "Lclient!ULDYKUPK;")
	public static Class42 aClass42_1 = new Class42(30, 0);

	@OriginalMember(owner = "client!APPQAEOL", name = "r", descriptor = "I")
	private static int anInt12 = 9;

	@OriginalMember(owner = "client!APPQAEOL", name = "j", descriptor = "[I")
	public int[] anIntArray1;

	@OriginalMember(owner = "client!APPQAEOL", name = "k", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!APPQAEOL", name = "m", descriptor = "[I")
	private int[] anIntArray2;

	@OriginalMember(owner = "client!APPQAEOL", name = "n", descriptor = "I")
	private int anInt9;

	@OriginalMember(owner = "client!APPQAEOL", name = "t", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray1;

	@OriginalMember(owner = "client!APPQAEOL", name = "y", descriptor = "[I")
	private int[] anIntArray3;

	@OriginalMember(owner = "client!APPQAEOL", name = "C", descriptor = "[I")
	private int[] anIntArray4;

	@OriginalMember(owner = "client!APPQAEOL", name = "J", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!APPQAEOL", name = "M", descriptor = "I")
	private int anInt24;

	@OriginalMember(owner = "client!APPQAEOL", name = "a", descriptor = "I")
	public int anInt4 = 32;

	@OriginalMember(owner = "client!APPQAEOL", name = "c", descriptor = "B")
	public byte aByte2 = 1;

	@OriginalMember(owner = "client!APPQAEOL", name = "d", descriptor = "Z")
	public boolean aBoolean2 = true;

	@OriginalMember(owner = "client!APPQAEOL", name = "e", descriptor = "I")
	private int anInt5 = -1;

	@OriginalMember(owner = "client!APPQAEOL", name = "h", descriptor = "I")
	public int anInt6 = -1;

	@OriginalMember(owner = "client!APPQAEOL", name = "i", descriptor = "I")
	private int anInt7 = -16070;

	@OriginalMember(owner = "client!APPQAEOL", name = "l", descriptor = "I")
	private int anInt8 = 128;

	@OriginalMember(owner = "client!APPQAEOL", name = "o", descriptor = "Z")
	public boolean aBoolean3 = true;

	@OriginalMember(owner = "client!APPQAEOL", name = "p", descriptor = "I")
	private int anInt10 = -1;

	@OriginalMember(owner = "client!APPQAEOL", name = "q", descriptor = "I")
	private int anInt11 = -479;

	@OriginalMember(owner = "client!APPQAEOL", name = "s", descriptor = "I")
	public int anInt13 = -1;

	@OriginalMember(owner = "client!APPQAEOL", name = "u", descriptor = "I")
	private int anInt14 = 128;

	@OriginalMember(owner = "client!APPQAEOL", name = "v", descriptor = "Z")
	public boolean aBoolean4 = false;

	@OriginalMember(owner = "client!APPQAEOL", name = "w", descriptor = "I")
	public int anInt15 = -1;

	@OriginalMember(owner = "client!APPQAEOL", name = "A", descriptor = "I")
	private int anInt17 = -1;

	@OriginalMember(owner = "client!APPQAEOL", name = "B", descriptor = "I")
	private int anInt18 = -1;

	@OriginalMember(owner = "client!APPQAEOL", name = "D", descriptor = "I")
	public int anInt19 = -1;

	@OriginalMember(owner = "client!APPQAEOL", name = "E", descriptor = "J")
	public long aLong1 = -1L;

	@OriginalMember(owner = "client!APPQAEOL", name = "F", descriptor = "Ljava/lang/String;")
	public String aString1 = "null";

	@OriginalMember(owner = "client!APPQAEOL", name = "G", descriptor = "I")
	public int anInt20 = -1;

	@OriginalMember(owner = "client!APPQAEOL", name = "K", descriptor = "I")
	private int anInt22 = -1;

	@OriginalMember(owner = "client!APPQAEOL", name = "L", descriptor = "I")
	public int anInt23 = -1;

	@OriginalMember(owner = "client!APPQAEOL", name = "N", descriptor = "I")
	public int anInt25 = -1;

	@OriginalMember(owner = "client!APPQAEOL", name = "c", descriptor = "(I)V")
	public static void method8() {
		try {
			aClass42_1 = null;
			anIntArray5 = null;
			aClass2Array1 = null;
			if (anInt12 == 9) {
				aClass6_Sub2_Sub3_1 = null;
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("97567, " + 9 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!APPQAEOL", name = "a", descriptor = "(Lclient!RSPRYUFS;)V")
	public static void method9(@OriginalArg(0) Class37 arg0) {
		aClass6_Sub2_Sub3_1 = new Class6_Sub2_Sub3(-587, arg0.method358("npc.dat", null));
		@Pc(19) Class6_Sub2_Sub3 local19 = new Class6_Sub2_Sub3(-587, arg0.method358("npc.idx", null));
		anInt16 = local19.method264();
		anIntArray5 = new int[anInt16];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt16; local29++) {
			anIntArray5[local29] = local27;
			local27 += local19.method264();
		}
		aClass2Array1 = new Class2[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass2Array1[local49] = new Class2();
		}
	}

	@OriginalMember(owner = "client!APPQAEOL", name = "d", descriptor = "(I)Lclient!APPQAEOL;")
	public static Class2 method10(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass2Array1[local1].aLong1 == (long) arg0) {
				return aClass2Array1[local1];
			}
		}
		anInt21 = (anInt21 + 1) % 20;
		@Pc(33) Class2 local33 = aClass2Array1[anInt21] = new Class2();
		aClass6_Sub2_Sub3_1.anInt404 = anIntArray5[arg0];
		local33.aLong1 = arg0;
		local33.method11((byte) 6, aClass6_Sub2_Sub3_1);
		return local33;
	}

	@OriginalMember(owner = "client!APPQAEOL", name = "<init>", descriptor = "()V")
	private Class2() {
	}

	@OriginalMember(owner = "client!APPQAEOL", name = "a", descriptor = "(I)Lclient!APPQAEOL;")
	public Class2 method5(@OriginalArg(0) int arg0) {
		try {
			@Pc(1) int local1 = -1;
			if (arg0 != -16070) {
				throw new NullPointerException();
			}
			if (this.anInt5 != -1) {
				@Pc(17) Class17 local17 = Class17.aClass17Array1[this.anInt5];
				@Pc(20) int local20 = local17.anInt294;
				@Pc(23) int local23 = local17.anInt295;
				@Pc(26) int local26 = local17.anInt296;
				@Pc(32) int local32 = client.anIntArray271[local26 - local23];
				local1 = aClient1.anIntArray260[local20] >> local23 & local32;
			} else if (this.anInt10 != -1) {
				local1 = aClient1.anIntArray260[this.anInt10];
			}
			return local1 < 0 || local1 >= this.anIntArray1.length || this.anIntArray1[local1] == -1 ? null : method10(this.anIntArray1[local1]);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("67500, " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!APPQAEOL", name = "b", descriptor = "(I)Z")
	public boolean method6() {
		try {
			if (this.anIntArray1 == null) {
				return true;
			}
			@Pc(8) int local8 = -1;
			if (this.anInt5 != -1) {
				@Pc(26) Class17 local26 = Class17.aClass17Array1[this.anInt5];
				@Pc(29) int local29 = local26.anInt294;
				@Pc(32) int local32 = local26.anInt295;
				@Pc(35) int local35 = local26.anInt296;
				@Pc(41) int local41 = client.anIntArray271[local35 - local32];
				local8 = aClient1.anIntArray260[local29] >> local32 & local41;
			} else if (this.anInt10 != -1) {
				local8 = aClient1.anIntArray260[this.anInt10];
			}
			return local8 >= 0 && local8 < this.anIntArray1.length && this.anIntArray1[local8] != -1;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("84602, " + 0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!APPQAEOL", name = "a", descriptor = "(IB[II)Lclient!JUQSYEMB;")
	public Class6_Sub2_Sub1_Sub3 method7(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.anIntArray1 != null) {
				@Pc(9) Class2 local9 = this.method5(this.anInt7);
				return local9 == null ? null : local9.method7(arg0, arg1, arg2);
			}
			@Pc(26) Class6_Sub2_Sub1_Sub3 local26 = (Class6_Sub2_Sub1_Sub3) aClass42_1.method453(this.aLong1);
			if (local26 == null) {
				@Pc(37) boolean local37 = false;
				for (@Pc(39) int local39 = 0; local39 < this.anIntArray3.length; local39++) {
					if (!Class6_Sub2_Sub1_Sub3.method134(this.anIntArray3[local39])) {
						local37 = true;
					}
				}
				if (local37) {
					return null;
				}
				@Pc(64) Class6_Sub2_Sub1_Sub3[] local64 = new Class6_Sub2_Sub1_Sub3[this.anIntArray3.length];
				for (@Pc(66) int local66 = 0; local66 < this.anIntArray3.length; local66++) {
					local64[local66] = Class6_Sub2_Sub1_Sub3.method133(this.anIntArray3[local66]);
				}
				if (local64.length == 1) {
					local26 = local64[0];
				} else {
					local26 = new Class6_Sub2_Sub1_Sub3(local64.length, 6, local64);
				}
				if (this.anIntArray6 != null) {
					for (@Pc(105) int local105 = 0; local105 < this.anIntArray6.length; local105++) {
						local26.method147(this.anIntArray6[local105], this.anIntArray2[local105]);
					}
				}
				local26.method140();
				local26.method150(this.anInt9 + 64, this.anInt24 + 850, -30, -50, -30, true);
				aClass42_1.method454(this.aLong1, local26);
			}
			@Pc(148) Class6_Sub2_Sub1_Sub3 local148 = Class6_Sub2_Sub1_Sub3.aClass6_Sub2_Sub1_Sub3_1;
			local148.method135(Class48.method536(arg2) & Class48.method536(arg0), local26);
			if (arg2 != -1 && arg0 != -1) {
				local148.method142(arg2, arg0, arg1);
			} else if (arg2 != -1) {
				local148.method141(arg2);
			}
			if (this.anInt8 != 128 || this.anInt14 != 128) {
				local148.method149(this.anInt8, this.anInt14, this.anInt8, this.anInt11);
			}
			local148.method137();
			local148.anIntArrayArray5 = null;
			local148.anIntArrayArray4 = null;
			if (this.aByte2 == 1) {
				local148.aBoolean84 = true;
			}
			return local148;
		} catch (@Pc(217) RuntimeException local217) {
			signlink.reporterror("20507, " + arg0 + ", " + -48 + ", " + arg1 + ", " + arg2 + ", " + local217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!APPQAEOL", name = "a", descriptor = "(BLclient!NQUAUMDT;)V")
	private void method11(@OriginalArg(0) byte arg0, @OriginalArg(1) Class6_Sub2_Sub3 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				while (true) {
					@Pc(18) int local18 = arg1.method262();
					if (local18 == 0) {
						return;
					}
					@Pc(27) int local27;
					@Pc(33) int local33;
					if (local18 == 1) {
						local27 = arg1.method262();
						this.anIntArray3 = new int[local27];
						for (local33 = 0; local33 < local27; local33++) {
							this.anIntArray3[local33] = arg1.method264();
						}
					} else if (local18 == 2) {
						this.aString1 = arg1.method269();
					} else if (local18 == 3) {
						this.aByteArray2 = arg1.method270();
					} else if (local18 == 12) {
						this.aByte2 = arg1.method263();
					} else if (local18 == 13) {
						this.anInt15 = arg1.method264();
					} else if (local18 == 14) {
						this.anInt19 = arg1.method264();
					} else if (local18 == 17) {
						this.anInt19 = arg1.method264();
						this.anInt25 = arg1.method264();
						this.anInt20 = arg1.method264();
						this.anInt13 = arg1.method264();
					} else if (local18 >= 30 && local18 < 40) {
						if (this.aStringArray1 == null) {
							this.aStringArray1 = new String[5];
						}
						this.aStringArray1[local18 - 30] = arg1.method269();
						if (this.aStringArray1[local18 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray1[local18 - 30] = null;
						}
					} else if (local18 == 40) {
						local27 = arg1.method262();
						this.anIntArray6 = new int[local27];
						this.anIntArray2 = new int[local27];
						for (local33 = 0; local33 < local27; local33++) {
							this.anIntArray6[local33] = arg1.method264();
							this.anIntArray2[local33] = arg1.method264();
						}
					} else if (local18 == 60) {
						local27 = arg1.method262();
						this.anIntArray4 = new int[local27];
						for (local33 = 0; local33 < local27; local33++) {
							this.anIntArray4[local33] = arg1.method264();
						}
					} else if (local18 == 90) {
						this.anInt18 = arg1.method264();
					} else if (local18 == 91) {
						this.anInt17 = arg1.method264();
					} else if (local18 == 92) {
						this.anInt22 = arg1.method264();
					} else if (local18 == 93) {
						this.aBoolean3 = false;
					} else if (local18 == 95) {
						this.anInt6 = arg1.method264();
					} else if (local18 == 97) {
						this.anInt8 = arg1.method264();
					} else if (local18 == 98) {
						this.anInt14 = arg1.method264();
					} else if (local18 == 99) {
						this.aBoolean4 = true;
					} else if (local18 == 100) {
						this.anInt9 = arg1.method263();
					} else if (local18 == 101) {
						this.anInt24 = arg1.method263() * 5;
					} else if (local18 == 102) {
						this.anInt23 = arg1.method264();
					} else if (local18 == 103) {
						this.anInt4 = arg1.method264();
					} else if (local18 == 106) {
						this.anInt5 = arg1.method264();
						if (this.anInt5 == 65535) {
							this.anInt5 = -1;
						}
						this.anInt10 = arg1.method264();
						if (this.anInt10 == 65535) {
							this.anInt10 = -1;
						}
						local27 = arg1.method262();
						this.anIntArray1 = new int[local27 + 1];
						for (local33 = 0; local33 <= local27; local33++) {
							this.anIntArray1[local33] = arg1.method264();
							if (this.anIntArray1[local33] == 65535) {
								this.anIntArray1[local33] = -1;
							}
						}
					} else if (local18 == 107) {
						this.aBoolean2 = false;
					}
				}
			}
		} catch (@Pc(392) RuntimeException local392) {
			signlink.reporterror("89555, " + arg0 + ", " + arg1 + ", " + local392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!APPQAEOL", name = "e", descriptor = "(I)Lclient!JUQSYEMB;")
	public Class6_Sub2_Sub1_Sub3 method12() {
		try {
			if (this.anIntArray1 != null) {
				@Pc(14) Class2 local14 = this.method5(this.anInt7);
				return local14 == null ? null : local14.method12();
			} else if (this.anIntArray4 == null) {
				return null;
			} else {
				@Pc(29) boolean local29 = false;
				for (@Pc(31) int local31 = 0; local31 < this.anIntArray4.length; local31++) {
					if (!Class6_Sub2_Sub1_Sub3.method134(this.anIntArray4[local31])) {
						local29 = true;
					}
				}
				if (local29) {
					return null;
				}
				@Pc(56) Class6_Sub2_Sub1_Sub3[] local56 = new Class6_Sub2_Sub1_Sub3[this.anIntArray4.length];
				for (@Pc(58) int local58 = 0; local58 < this.anIntArray4.length; local58++) {
					local56[local58] = Class6_Sub2_Sub1_Sub3.method133(this.anIntArray4[local58]);
				}
				@Pc(82) Class6_Sub2_Sub1_Sub3 local82;
				if (local56.length == 1) {
					local82 = local56[0];
				} else {
					local82 = new Class6_Sub2_Sub1_Sub3(local56.length, 6, local56);
				}
				if (this.anIntArray6 != null) {
					for (@Pc(97) int local97 = 0; local97 < this.anIntArray6.length; local97++) {
						local82.method147(this.anIntArray6[local97], this.anIntArray2[local97]);
					}
				}
				return local82;
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("33889, " + 1 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}
}
