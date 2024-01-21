import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NHTDEVDA")
public final class Class27 {

	@OriginalMember(owner = "client!NHTDEVDA", name = "j", descriptor = "[I")
	private static int[] anIntArray130;

	@OriginalMember(owner = "client!NHTDEVDA", name = "k", descriptor = "I")
	private static int anInt459;

	@OriginalMember(owner = "client!NHTDEVDA", name = "n", descriptor = "Lclient!client;")
	public static client aClient3;

	@OriginalMember(owner = "client!NHTDEVDA", name = "s", descriptor = "I")
	private static int anInt464;

	@OriginalMember(owner = "client!NHTDEVDA", name = "y", descriptor = "[Lclient!NHTDEVDA;")
	private static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!NHTDEVDA", name = "K", descriptor = "Lclient!XJCNBMKS;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3;

	@OriginalMember(owner = "client!NHTDEVDA", name = "H", descriptor = "Lclient!JLTMYUOM;")
	public static Class18 aClass18_3 = new Class18(true, 30);

	@OriginalMember(owner = "client!NHTDEVDA", name = "L", descriptor = "B")
	private static byte aByte18 = -27;

	@OriginalMember(owner = "client!NHTDEVDA", name = "e", descriptor = "[I")
	private int[] anIntArray129;

	@OriginalMember(owner = "client!NHTDEVDA", name = "f", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!NHTDEVDA", name = "o", descriptor = "[I")
	public int[] anIntArray131;

	@OriginalMember(owner = "client!NHTDEVDA", name = "q", descriptor = "[I")
	private int[] anIntArray132;

	@OriginalMember(owner = "client!NHTDEVDA", name = "t", descriptor = "I")
	private int anInt465;

	@OriginalMember(owner = "client!NHTDEVDA", name = "u", descriptor = "[I")
	private int[] anIntArray133;

	@OriginalMember(owner = "client!NHTDEVDA", name = "z", descriptor = "I")
	private int anInt467;

	@OriginalMember(owner = "client!NHTDEVDA", name = "C", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!NHTDEVDA", name = "D", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray5;

	@OriginalMember(owner = "client!NHTDEVDA", name = "J", descriptor = "I")
	private int anInt472;

	@OriginalMember(owner = "client!NHTDEVDA", name = "P", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!NHTDEVDA", name = "a", descriptor = "I")
	public int anInt455 = -1;

	@OriginalMember(owner = "client!NHTDEVDA", name = "b", descriptor = "I")
	private int anInt456 = 128;

	@OriginalMember(owner = "client!NHTDEVDA", name = "c", descriptor = "J")
	public long aLong14 = -1L;

	@OriginalMember(owner = "client!NHTDEVDA", name = "d", descriptor = "Z")
	public boolean aBoolean93 = true;

	@OriginalMember(owner = "client!NHTDEVDA", name = "g", descriptor = "I")
	public int anInt457 = -1;

	@OriginalMember(owner = "client!NHTDEVDA", name = "h", descriptor = "I")
	public int anInt458 = -1;

	@OriginalMember(owner = "client!NHTDEVDA", name = "i", descriptor = "Z")
	public boolean aBoolean94 = false;

	@OriginalMember(owner = "client!NHTDEVDA", name = "l", descriptor = "I")
	public int anInt460 = 32;

	@OriginalMember(owner = "client!NHTDEVDA", name = "m", descriptor = "I")
	public int anInt461 = -1;

	@OriginalMember(owner = "client!NHTDEVDA", name = "p", descriptor = "I")
	private int anInt462 = 489;

	@OriginalMember(owner = "client!NHTDEVDA", name = "r", descriptor = "I")
	private int anInt463 = -1;

	@OriginalMember(owner = "client!NHTDEVDA", name = "v", descriptor = "B")
	private byte aByte16 = -44;

	@OriginalMember(owner = "client!NHTDEVDA", name = "w", descriptor = "B")
	public byte aByte17 = 1;

	@OriginalMember(owner = "client!NHTDEVDA", name = "x", descriptor = "I")
	public int anInt466 = -1;

	@OriginalMember(owner = "client!NHTDEVDA", name = "A", descriptor = "I")
	private int anInt468 = -1;

	@OriginalMember(owner = "client!NHTDEVDA", name = "B", descriptor = "Z")
	public boolean aBoolean95 = true;

	@OriginalMember(owner = "client!NHTDEVDA", name = "E", descriptor = "Z")
	private boolean aBoolean96 = true;

	@OriginalMember(owner = "client!NHTDEVDA", name = "F", descriptor = "I")
	public int anInt469 = -1;

	@OriginalMember(owner = "client!NHTDEVDA", name = "G", descriptor = "I")
	private int anInt470 = -1;

	@OriginalMember(owner = "client!NHTDEVDA", name = "I", descriptor = "I")
	private int anInt471 = -1;

	@OriginalMember(owner = "client!NHTDEVDA", name = "M", descriptor = "I")
	public int anInt473 = -1;

	@OriginalMember(owner = "client!NHTDEVDA", name = "N", descriptor = "I")
	private int anInt474 = 128;

	@OriginalMember(owner = "client!NHTDEVDA", name = "O", descriptor = "I")
	private int anInt475 = -1;

	@OriginalMember(owner = "client!NHTDEVDA", name = "a", descriptor = "(I)V")
	public static void method289() {
		try {
			aClass18_3 = null;
			anIntArray130 = null;
			aClass27Array1 = null;
			aClass1_Sub1_Sub3_3 = null;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("51801, " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHTDEVDA", name = "a", descriptor = "(Lclient!QKFGLETG;)V")
	public static void method291(@OriginalArg(0) Class36 arg0) {
		aClass1_Sub1_Sub3_3 = new Class1_Sub1_Sub3((byte) 9, arg0.method337("npc.dat", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3((byte) 9, arg0.method337("npc.idx", null));
		anInt464 = local19.method500();
		anIntArray130 = new int[anInt464];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt464; local29++) {
			anIntArray130[local29] = local27;
			local27 += local19.method500();
		}
		aClass27Array1 = new Class27[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass27Array1[local49] = new Class27();
		}
	}

	@OriginalMember(owner = "client!NHTDEVDA", name = "c", descriptor = "(I)Lclient!NHTDEVDA;")
	public static Class27 method294(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass27Array1[local1].aLong14 == (long) arg0) {
				return aClass27Array1[local1];
			}
		}
		anInt459 = (anInt459 + 1) % 20;
		@Pc(33) Class27 local33 = aClass27Array1[anInt459] = new Class27();
		aClass1_Sub1_Sub3_3.anInt806 = anIntArray130[arg0];
		local33.aLong14 = arg0;
		local33.method288(aByte18, aClass1_Sub1_Sub3_3);
		return local33;
	}

	@OriginalMember(owner = "client!NHTDEVDA", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!NHTDEVDA", name = "a", descriptor = "(BLclient!XJCNBMKS;)V")
	private void method288(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg0 != aByte18) {
				this.aBoolean96 = !this.aBoolean96;
			}
			while (true) {
				while (true) {
					@Pc(15) int local15 = arg1.method498();
					if (local15 == 0) {
						return;
					}
					@Pc(24) int local24;
					@Pc(30) int local30;
					if (local15 == 1) {
						local24 = arg1.method498();
						this.anIntArray134 = new int[local24];
						for (local30 = 0; local30 < local24; local30++) {
							this.anIntArray134[local30] = arg1.method500();
						}
					} else if (local15 == 2) {
						this.aString5 = arg1.method505();
					} else if (local15 == 3) {
						this.aByteArray6 = arg1.method506((byte) 3);
					} else if (local15 == 12) {
						this.aByte17 = arg1.method499();
					} else if (local15 == 13) {
						this.anInt466 = arg1.method500();
					} else if (local15 == 14) {
						this.anInt458 = arg1.method500();
					} else if (local15 == 17) {
						this.anInt458 = arg1.method500();
						this.anInt461 = arg1.method500();
						this.anInt457 = arg1.method500();
						this.anInt469 = arg1.method500();
					} else if (local15 >= 30 && local15 < 40) {
						if (this.aStringArray5 == null) {
							this.aStringArray5 = new String[5];
						}
						this.aStringArray5[local15 - 30] = arg1.method505();
						if (this.aStringArray5[local15 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray5[local15 - 30] = null;
						}
					} else if (local15 == 40) {
						local24 = arg1.method498();
						this.anIntArray133 = new int[local24];
						this.anIntArray132 = new int[local24];
						for (local30 = 0; local30 < local24; local30++) {
							this.anIntArray133[local30] = arg1.method500();
							this.anIntArray132[local30] = arg1.method500();
						}
					} else if (local15 == 60) {
						local24 = arg1.method498();
						this.anIntArray129 = new int[local24];
						for (local30 = 0; local30 < local24; local30++) {
							this.anIntArray129[local30] = arg1.method500();
						}
					} else if (local15 == 90) {
						this.anInt463 = arg1.method500();
					} else if (local15 == 91) {
						this.anInt468 = arg1.method500();
					} else if (local15 == 92) {
						this.anInt471 = arg1.method500();
					} else if (local15 == 93) {
						this.aBoolean93 = false;
					} else if (local15 == 95) {
						this.anInt455 = arg1.method500();
					} else if (local15 == 97) {
						this.anInt474 = arg1.method500();
					} else if (local15 == 98) {
						this.anInt456 = arg1.method500();
					} else if (local15 == 99) {
						this.aBoolean94 = true;
					} else if (local15 == 100) {
						this.anInt472 = arg1.method499();
					} else if (local15 == 101) {
						this.anInt467 = arg1.method499() * 5;
					} else if (local15 == 102) {
						this.anInt473 = arg1.method500();
					} else if (local15 == 103) {
						this.anInt460 = arg1.method500();
					} else if (local15 == 106) {
						this.anInt470 = arg1.method500();
						if (this.anInt470 == 65535) {
							this.anInt470 = -1;
						}
						this.anInt475 = arg1.method500();
						if (this.anInt475 == 65535) {
							this.anInt475 = -1;
						}
						local24 = arg1.method498();
						this.anIntArray131 = new int[local24 + 1];
						for (local30 = 0; local30 <= local24; local30++) {
							this.anIntArray131[local30] = arg1.method500();
							if (this.anIntArray131[local30] == 65535) {
								this.anIntArray131[local30] = -1;
							}
						}
					} else if (local15 == 107) {
						this.aBoolean95 = false;
					}
				}
			}
		} catch (@Pc(389) RuntimeException local389) {
			signlink.reporterror("71561, " + arg0 + ", " + arg1 + ", " + local389.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHTDEVDA", name = "b", descriptor = "(I)Lclient!NHTDEVDA;")
	public Class27 method290() {
		try {
			@Pc(11) int local11 = -1;
			if (this.anInt470 != -1) {
				@Pc(20) Class49 local20 = Class49.aClass49Array1[this.anInt470];
				@Pc(23) int local23 = local20.anInt791;
				@Pc(26) int local26 = local20.anInt792;
				@Pc(29) int local29 = local20.anInt793;
				@Pc(35) int local35 = client.anIntArray229[local29 - local26];
				local11 = aClient3.anIntArray273[local23] >> local26 & local35;
			} else if (this.anInt475 != -1) {
				local11 = aClient3.anIntArray273[this.anInt475];
			}
			return local11 < 0 || local11 >= this.anIntArray131.length || this.anIntArray131[local11] == -1 ? null : method294(this.anIntArray131[local11]);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("36667, " + -670 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHTDEVDA", name = "a", descriptor = "(B)Lclient!FUTAQMCE;")
	public Class1_Sub1_Sub1_Sub3 method292() {
		try {
			if (this.anIntArray131 != null) {
				@Pc(8) Class27 local8 = this.method290();
				return local8 == null ? null : local8.method292();
			} else if (this.anIntArray129 == null) {
				return null;
			} else {
				@Pc(23) boolean local23 = false;
				if (this.aByte16 != -44) {
					throw new NullPointerException();
				}
				for (@Pc(33) int local33 = 0; local33 < this.anIntArray129.length; local33++) {
					if (!Class1_Sub1_Sub1_Sub3.method183(this.anIntArray129[local33])) {
						local23 = true;
					}
				}
				if (local23) {
					return null;
				}
				@Pc(58) Class1_Sub1_Sub1_Sub3[] local58 = new Class1_Sub1_Sub1_Sub3[this.anIntArray129.length];
				for (@Pc(60) int local60 = 0; local60 < this.anIntArray129.length; local60++) {
					local58[local60] = Class1_Sub1_Sub1_Sub3.method182(this.anIntArray129[local60]);
				}
				@Pc(85) Class1_Sub1_Sub1_Sub3 local85;
				if (local58.length == 1) {
					local85 = local58[0];
				} else {
					local85 = new Class1_Sub1_Sub1_Sub3(local58.length, 221, local58);
				}
				if (this.anIntArray133 != null) {
					for (@Pc(100) int local100 = 0; local100 < this.anIntArray133.length; local100++) {
						local85.method196(this.anIntArray133[local100], this.anIntArray132[local100]);
					}
				}
				return local85;
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("48220, " + -44 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NHTDEVDA", name = "a", descriptor = "([IIII)Lclient!FUTAQMCE;")
	public Class1_Sub1_Sub1_Sub3 method293(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.anIntArray131 != null) {
				@Pc(8) Class27 local8 = this.method290();
				return local8 == null ? null : local8.method293(arg0, arg1, arg2);
			}
			@Pc(25) Class1_Sub1_Sub1_Sub3 local25 = (Class1_Sub1_Sub1_Sub3) aClass18_3.method216(this.aLong14);
			if (local25 == null) {
				@Pc(35) boolean local35 = false;
				for (@Pc(37) int local37 = 0; local37 < this.anIntArray134.length; local37++) {
					if (!Class1_Sub1_Sub1_Sub3.method183(this.anIntArray134[local37])) {
						local35 = true;
					}
				}
				if (local35) {
					return null;
				}
				@Pc(62) Class1_Sub1_Sub1_Sub3[] local62 = new Class1_Sub1_Sub1_Sub3[this.anIntArray134.length];
				for (@Pc(64) int local64 = 0; local64 < this.anIntArray134.length; local64++) {
					local62[local64] = Class1_Sub1_Sub1_Sub3.method182(this.anIntArray134[local64]);
				}
				if (local62.length == 1) {
					local25 = local62[0];
				} else {
					local25 = new Class1_Sub1_Sub1_Sub3(local62.length, 221, local62);
				}
				if (this.anIntArray133 != null) {
					for (@Pc(104) int local104 = 0; local104 < this.anIntArray133.length; local104++) {
						local25.method196(this.anIntArray133[local104], this.anIntArray132[local104]);
					}
				}
				local25.method189(284);
				local25.method199(this.anInt472 + 64, this.anInt467 + 850, -30, -50, -30, true);
				aClass18_3.method217(this.aLong14, local25);
			}
			@Pc(147) Class1_Sub1_Sub1_Sub3 local147 = Class1_Sub1_Sub1_Sub3.aClass1_Sub1_Sub1_Sub3_1;
			local147.method184(Class40.method367(arg2) & Class40.method367(arg1), this.anInt465, local25);
			if (arg2 != -1 && arg1 != -1) {
				local147.method191(arg0, arg2, arg1);
			} else if (arg2 != -1) {
				local147.method190(arg2);
			}
			if (this.anInt474 != 128 || this.anInt456 != 128) {
				local147.method198(this.anInt474, this.anInt456, this.anInt474);
			}
			local147.method186();
			local147.anIntArrayArray7 = null;
			local147.anIntArrayArray6 = null;
			if (this.aByte17 == 1) {
				local147.aBoolean70 = true;
			}
			return local147;
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("28592, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 4 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}
}
