import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZNUYRYPY")
public final class Class49 {

	@OriginalMember(owner = "client!ZNUYRYPY", name = "f", descriptor = "I")
	private static int anInt798;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "i", descriptor = "Lclient!client;")
	public static client aClient5;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "z", descriptor = "I")
	private static int anInt808;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "A", descriptor = "[I")
	private static int[] anIntArray209;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "I", descriptor = "I")
	private static int anInt814;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "J", descriptor = "Lclient!LDILQFVA;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "N", descriptor = "[Lclient!ZNUYRYPY;")
	private static Class49[] aClass49Array1;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "p", descriptor = "Lclient!CZWVRQJW;")
	public static Class4 aClass4_9 = new Class4(false, 30);

	@OriginalMember(owner = "client!ZNUYRYPY", name = "a", descriptor = "[I")
	private int[] anIntArray204;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "d", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "e", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "o", descriptor = "I")
	private int anInt802;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "r", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "w", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "x", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray7;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "y", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "E", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "H", descriptor = "I")
	private int anInt813;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "b", descriptor = "I")
	private int anInt796 = -1;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "c", descriptor = "I")
	private int anInt797 = 128;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "g", descriptor = "I")
	public int anInt799 = -1;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "h", descriptor = "I")
	private int anInt800 = 128;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "j", descriptor = "Z")
	private boolean aBoolean205 = true;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "k", descriptor = "I")
	private int anInt801 = -1;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "l", descriptor = "Z")
	public boolean aBoolean206 = true;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "m", descriptor = "B")
	public byte aByte35 = 1;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "n", descriptor = "J")
	public long aLong26 = -1L;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "q", descriptor = "I")
	public int anInt803 = -1;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "s", descriptor = "I")
	public int anInt804 = -1;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "t", descriptor = "I")
	public int anInt805 = -1;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "u", descriptor = "I")
	private int anInt806 = 16191;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "v", descriptor = "I")
	public int anInt807 = -1;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "B", descriptor = "I")
	private int anInt809 = -1;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "C", descriptor = "I")
	private int anInt810 = -1;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "D", descriptor = "Z")
	public boolean aBoolean207 = true;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "F", descriptor = "I")
	private int anInt811 = -1;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "G", descriptor = "I")
	public int anInt812 = -1;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "K", descriptor = "I")
	public int anInt815 = 32;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "L", descriptor = "I")
	public int anInt816 = -1;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "M", descriptor = "Z")
	public boolean aBoolean208 = false;

	@OriginalMember(owner = "client!ZNUYRYPY", name = "a", descriptor = "(Lclient!SPZBTZXL;)V")
	public static void method564(@OriginalArg(0) Class35 arg0) {
		aClass1_Sub1_Sub3_5 = new Class1_Sub1_Sub3(arg0.method491("npc.dat", null), anInt808);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method491("npc.idx", null), anInt808);
		anInt798 = local19.method361();
		anIntArray209 = new int[anInt798];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt798; local29++) {
			anIntArray209[local29] = local27;
			local27 += local19.method361();
		}
		aClass49Array1 = new Class49[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass49Array1[local49] = new Class49();
		}
	}

	@OriginalMember(owner = "client!ZNUYRYPY", name = "a", descriptor = "(I)Lclient!ZNUYRYPY;")
	public static Class49 method565(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass49Array1[local1].aLong26 == (long) arg0) {
				return aClass49Array1[local1];
			}
		}
		anInt814 = (anInt814 + 1) % 20;
		@Pc(33) Class49 local33 = aClass49Array1[anInt814] = new Class49();
		aClass1_Sub1_Sub3_5.anInt443 = anIntArray209[arg0];
		local33.aLong26 = arg0;
		local33.method563(aClass1_Sub1_Sub3_5);
		return local33;
	}

	@OriginalMember(owner = "client!ZNUYRYPY", name = "d", descriptor = "(I)V")
	public static void method568() {
		try {
			aClass4_9 = null;
			anIntArray209 = null;
			aClass49Array1 = null;
			aClass1_Sub1_Sub3_5 = null;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("98306, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZNUYRYPY", name = "<init>", descriptor = "()V")
	private Class49() {
	}

	@OriginalMember(owner = "client!ZNUYRYPY", name = "a", descriptor = "(I[III)Lclient!HEQROJXW;")
	public Class1_Sub1_Sub1_Sub4 method562(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.anIntArray207 != null) {
				@Pc(8) Class49 local8 = this.method567();
				return local8 == null ? null : local8.method562(arg0, arg1, arg2);
			}
			@Pc(25) Class1_Sub1_Sub1_Sub4 local25 = (Class1_Sub1_Sub1_Sub4) aClass4_9.method33(this.aLong26);
			if (local25 == null) {
				@Pc(38) boolean local38 = false;
				for (@Pc(40) int local40 = 0; local40 < this.anIntArray204.length; local40++) {
					if (!Class1_Sub1_Sub1_Sub4.method271(this.anIntArray204[local40])) {
						local38 = true;
					}
				}
				if (local38) {
					return null;
				}
				@Pc(65) Class1_Sub1_Sub1_Sub4[] local65 = new Class1_Sub1_Sub1_Sub4[this.anIntArray204.length];
				for (@Pc(67) int local67 = 0; local67 < this.anIntArray204.length; local67++) {
					local65[local67] = Class1_Sub1_Sub1_Sub4.method270(this.anIntArray204[local67]);
				}
				if (local65.length == 1) {
					local25 = local65[0];
				} else {
					local25 = new Class1_Sub1_Sub1_Sub4((byte) 6, local65.length, local65);
				}
				if (this.anIntArray205 != null) {
					for (@Pc(107) int local107 = 0; local107 < this.anIntArray205.length; local107++) {
						local25.method284(this.anIntArray205[local107], this.anIntArray208[local107]);
					}
				}
				local25.method277();
				local25.method287(this.anInt802 + 64, this.anInt813 + 850, -30, -50, -30, true);
				aClass4_9.method34(local25, this.aLong26);
			}
			@Pc(150) Class1_Sub1_Sub1_Sub4 local150 = Class1_Sub1_Sub1_Sub4.aClass1_Sub1_Sub1_Sub4_2;
			local150.method272(Class37.method510(arg2) & Class37.method510(arg1), local25);
			if (arg2 != -1 && arg1 != -1) {
				local150.method279(arg2, arg0, arg1);
			} else if (arg2 != -1) {
				local150.method278(arg2);
			}
			if (this.anInt800 != 128 || this.anInt797 != 128) {
				local150.method286(this.anInt797, this.anInt800, this.anInt800);
			}
			local150.method274();
			local150.anIntArrayArray12 = null;
			local150.anIntArrayArray11 = null;
			if (this.aByte35 == 1) {
				local150.aBoolean97 = true;
			}
			return local150;
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("36746, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZNUYRYPY", name = "a", descriptor = "(Lclient!LDILQFVA;I)V")
	private void method563(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			if (this.anInt806 != 16191) {
				this.aBoolean205 = !this.aBoolean205;
			}
			while (true) {
				while (true) {
					@Pc(16) int local16 = arg0.method359();
					if (local16 == 0) {
						return;
					}
					@Pc(25) int local25;
					@Pc(31) int local31;
					if (local16 == 1) {
						local25 = arg0.method359();
						this.anIntArray204 = new int[local25];
						for (local31 = 0; local31 < local25; local31++) {
							this.anIntArray204[local31] = arg0.method361();
						}
					} else if (local16 == 2) {
						this.aString16 = arg0.method366();
					} else if (local16 == 3) {
						this.aByteArray20 = arg0.method367();
					} else if (local16 == 12) {
						this.aByte35 = arg0.method360();
					} else if (local16 == 13) {
						this.anInt807 = arg0.method361();
					} else if (local16 == 14) {
						this.anInt805 = arg0.method361();
					} else if (local16 == 17) {
						this.anInt805 = arg0.method361();
						this.anInt812 = arg0.method361();
						this.anInt803 = arg0.method361();
						this.anInt799 = arg0.method361();
					} else if (local16 >= 30 && local16 < 40) {
						if (this.aStringArray7 == null) {
							this.aStringArray7 = new String[5];
						}
						this.aStringArray7[local16 - 30] = arg0.method366();
						if (this.aStringArray7[local16 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray7[local16 - 30] = null;
						}
					} else if (local16 == 40) {
						local25 = arg0.method359();
						this.anIntArray205 = new int[local25];
						this.anIntArray208 = new int[local25];
						for (local31 = 0; local31 < local25; local31++) {
							this.anIntArray205[local31] = arg0.method361();
							this.anIntArray208[local31] = arg0.method361();
						}
					} else if (local16 == 60) {
						local25 = arg0.method359();
						this.anIntArray206 = new int[local25];
						for (local31 = 0; local31 < local25; local31++) {
							this.anIntArray206[local31] = arg0.method361();
						}
					} else if (local16 == 90) {
						this.anInt809 = arg0.method361();
					} else if (local16 == 91) {
						this.anInt801 = arg0.method361();
					} else if (local16 == 92) {
						this.anInt811 = arg0.method361();
					} else if (local16 == 93) {
						this.aBoolean207 = false;
					} else if (local16 == 95) {
						this.anInt816 = arg0.method361();
					} else if (local16 == 97) {
						this.anInt800 = arg0.method361();
					} else if (local16 == 98) {
						this.anInt797 = arg0.method361();
					} else if (local16 == 99) {
						this.aBoolean208 = true;
					} else if (local16 == 100) {
						this.anInt802 = arg0.method360();
					} else if (local16 == 101) {
						this.anInt813 = arg0.method360() * 5;
					} else if (local16 == 102) {
						this.anInt804 = arg0.method361();
					} else if (local16 == 103) {
						this.anInt815 = arg0.method361();
					} else if (local16 == 106) {
						this.anInt810 = arg0.method361();
						if (this.anInt810 == 65535) {
							this.anInt810 = -1;
						}
						this.anInt796 = arg0.method361();
						if (this.anInt796 == 65535) {
							this.anInt796 = -1;
						}
						local25 = arg0.method359();
						this.anIntArray207 = new int[local25 + 1];
						for (local31 = 0; local31 <= local25; local31++) {
							this.anIntArray207[local31] = arg0.method361();
							if (this.anIntArray207[local31] == 65535) {
								this.anIntArray207[local31] = -1;
							}
						}
					} else if (local16 == 107) {
						this.aBoolean206 = false;
					}
				}
			}
		} catch (@Pc(390) RuntimeException local390) {
			signlink.reporterror("34945, " + arg0 + ", " + 16191 + ", " + local390.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZNUYRYPY", name = "b", descriptor = "(I)Lclient!HEQROJXW;")
	public Class1_Sub1_Sub1_Sub4 method566() {
		try {
			if (this.anIntArray207 != null) {
				@Pc(19) Class49 local19 = this.method567();
				return local19 == null ? null : local19.method566();
			} else if (this.anIntArray206 == null) {
				return null;
			} else {
				@Pc(34) boolean local34 = false;
				for (@Pc(36) int local36 = 0; local36 < this.anIntArray206.length; local36++) {
					if (!Class1_Sub1_Sub1_Sub4.method271(this.anIntArray206[local36])) {
						local34 = true;
					}
				}
				if (local34) {
					return null;
				}
				@Pc(61) Class1_Sub1_Sub1_Sub4[] local61 = new Class1_Sub1_Sub1_Sub4[this.anIntArray206.length];
				for (@Pc(63) int local63 = 0; local63 < this.anIntArray206.length; local63++) {
					local61[local63] = Class1_Sub1_Sub1_Sub4.method270(this.anIntArray206[local63]);
				}
				@Pc(88) Class1_Sub1_Sub1_Sub4 local88;
				if (local61.length == 1) {
					local88 = local61[0];
				} else {
					local88 = new Class1_Sub1_Sub1_Sub4((byte) 6, local61.length, local61);
				}
				if (this.anIntArray205 != null) {
					for (@Pc(103) int local103 = 0; local103 < this.anIntArray205.length; local103++) {
						local88.method284(this.anIntArray205[local103], this.anIntArray208[local103]);
					}
				}
				return local88;
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("40030, " + 3 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZNUYRYPY", name = "c", descriptor = "(I)Lclient!ZNUYRYPY;")
	public Class49 method567() {
		try {
			@Pc(7) int local7 = -1;
			if (this.anInt810 != -1) {
				@Pc(16) Class24 local16 = Class24.aClass24Array1[this.anInt810];
				@Pc(19) int local19 = local16.anInt474;
				@Pc(22) int local22 = local16.anInt475;
				@Pc(25) int local25 = local16.anInt476;
				@Pc(31) int local31 = client.anIntArray232[local25 - local22];
				local7 = aClient5.anIntArray267[local19] >> local22 & local31;
			} else if (this.anInt796 != -1) {
				local7 = aClient5.anIntArray267[this.anInt796];
			}
			return local7 < 0 || local7 >= this.anIntArray207.length || this.anIntArray207[local7] == -1 ? null : method565(this.anIntArray207[local7]);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("14072, " + 0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
