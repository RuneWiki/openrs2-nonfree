import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QYNFXHXW")
public final class Class31 {

	@OriginalMember(owner = "client!QYNFXHXW", name = "b", descriptor = "Lclient!client;")
	public static client aClient3;

	@OriginalMember(owner = "client!QYNFXHXW", name = "c", descriptor = "I")
	private static int anInt639;

	@OriginalMember(owner = "client!QYNFXHXW", name = "n", descriptor = "[Lclient!QYNFXHXW;")
	private static Class31[] aClass31Array1;

	@OriginalMember(owner = "client!QYNFXHXW", name = "o", descriptor = "[I")
	private static int[] anIntArray146;

	@OriginalMember(owner = "client!QYNFXHXW", name = "p", descriptor = "I")
	private static int anInt645;

	@OriginalMember(owner = "client!QYNFXHXW", name = "u", descriptor = "Lclient!EYMNCFMK;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4;

	@OriginalMember(owner = "client!QYNFXHXW", name = "l", descriptor = "Lclient!UNPPHFRC;")
	public static Class41 aClass41_4 = new Class41(true, 30);

	@OriginalMember(owner = "client!QYNFXHXW", name = "a", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray5;

	@OriginalMember(owner = "client!QYNFXHXW", name = "f", descriptor = "I")
	private int anInt642;

	@OriginalMember(owner = "client!QYNFXHXW", name = "i", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!QYNFXHXW", name = "k", descriptor = "[I")
	private int[] anIntArray144;

	@OriginalMember(owner = "client!QYNFXHXW", name = "m", descriptor = "[I")
	private int[] anIntArray145;

	@OriginalMember(owner = "client!QYNFXHXW", name = "r", descriptor = "I")
	private int anInt647;

	@OriginalMember(owner = "client!QYNFXHXW", name = "C", descriptor = "I")
	private int anInt654;

	@OriginalMember(owner = "client!QYNFXHXW", name = "E", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!QYNFXHXW", name = "L", descriptor = "[I")
	public int[] anIntArray147;

	@OriginalMember(owner = "client!QYNFXHXW", name = "M", descriptor = "[I")
	private int[] anIntArray148;

	@OriginalMember(owner = "client!QYNFXHXW", name = "d", descriptor = "I")
	private int anInt640 = -1;

	@OriginalMember(owner = "client!QYNFXHXW", name = "e", descriptor = "I")
	public int anInt641 = -1;

	@OriginalMember(owner = "client!QYNFXHXW", name = "g", descriptor = "Z")
	public boolean aBoolean131 = true;

	@OriginalMember(owner = "client!QYNFXHXW", name = "h", descriptor = "I")
	private int anInt643 = -1;

	@OriginalMember(owner = "client!QYNFXHXW", name = "j", descriptor = "I")
	private int anInt644 = 128;

	@OriginalMember(owner = "client!QYNFXHXW", name = "q", descriptor = "I")
	private int anInt646 = -1;

	@OriginalMember(owner = "client!QYNFXHXW", name = "s", descriptor = "Z")
	public boolean aBoolean132 = true;

	@OriginalMember(owner = "client!QYNFXHXW", name = "t", descriptor = "I")
	private int anInt648 = -1;

	@OriginalMember(owner = "client!QYNFXHXW", name = "v", descriptor = "B")
	public byte aByte18 = 1;

	@OriginalMember(owner = "client!QYNFXHXW", name = "w", descriptor = "I")
	private int anInt649 = 1;

	@OriginalMember(owner = "client!QYNFXHXW", name = "x", descriptor = "I")
	private int anInt650 = -1;

	@OriginalMember(owner = "client!QYNFXHXW", name = "y", descriptor = "J")
	public long aLong24 = -1L;

	@OriginalMember(owner = "client!QYNFXHXW", name = "z", descriptor = "I")
	public int anInt651 = -1;

	@OriginalMember(owner = "client!QYNFXHXW", name = "A", descriptor = "I")
	public int anInt652 = -1;

	@OriginalMember(owner = "client!QYNFXHXW", name = "B", descriptor = "I")
	public int anInt653 = -1;

	@OriginalMember(owner = "client!QYNFXHXW", name = "D", descriptor = "Ljava/lang/String;")
	public String aString8 = "null";

	@OriginalMember(owner = "client!QYNFXHXW", name = "F", descriptor = "I")
	public int anInt655 = 32;

	@OriginalMember(owner = "client!QYNFXHXW", name = "G", descriptor = "I")
	public int anInt656 = -1;

	@OriginalMember(owner = "client!QYNFXHXW", name = "H", descriptor = "I")
	public int anInt657 = -1;

	@OriginalMember(owner = "client!QYNFXHXW", name = "I", descriptor = "I")
	private int anInt658 = 128;

	@OriginalMember(owner = "client!QYNFXHXW", name = "J", descriptor = "I")
	public int anInt659 = -1;

	@OriginalMember(owner = "client!QYNFXHXW", name = "K", descriptor = "Z")
	public boolean aBoolean133 = false;

	@OriginalMember(owner = "client!QYNFXHXW", name = "a", descriptor = "(Lclient!HBJEXSJX;)V")
	public static void method476(@OriginalArg(0) Class13 arg0) {
		aClass1_Sub1_Sub3_4 = new Class1_Sub1_Sub3(arg0.method278("npc.dat", null), 0);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method278("npc.idx", null), 0);
		anInt645 = local19.method157();
		anIntArray146 = new int[anInt645];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt645; local29++) {
			anIntArray146[local29] = local27;
			local27 += local19.method157();
		}
		aClass31Array1 = new Class31[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass31Array1[local49] = new Class31();
		}
	}

	@OriginalMember(owner = "client!QYNFXHXW", name = "b", descriptor = "(I)V")
	public static void method477(@OriginalArg(0) int arg0) {
		try {
			aClass41_4 = null;
			if (arg0 < 7 || arg0 > 7) {
				for (@Pc(9) int local9 = 1; local9 > 0; local9++) {
				}
			}
			anIntArray146 = null;
			aClass31Array1 = null;
			aClass1_Sub1_Sub3_4 = null;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("35541, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QYNFXHXW", name = "c", descriptor = "(I)Lclient!QYNFXHXW;")
	public static Class31 method479(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass31Array1[local1].aLong24 == (long) arg0) {
				return aClass31Array1[local1];
			}
		}
		anInt639 = (anInt639 + 1) % 20;
		@Pc(33) Class31 local33 = aClass31Array1[anInt639] = new Class31();
		aClass1_Sub1_Sub3_4.anInt301 = anIntArray146[arg0];
		local33.aLong24 = arg0;
		local33.method478(aClass1_Sub1_Sub3_4);
		return local33;
	}

	@OriginalMember(owner = "client!QYNFXHXW", name = "<init>", descriptor = "()V")
	private Class31() {
	}

	@OriginalMember(owner = "client!QYNFXHXW", name = "a", descriptor = "(I)Lclient!QYNFXHXW;")
	public Class31 method475(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(5) int local5 = -1;
			if (this.anInt650 != -1) {
				@Pc(14) Class5 local14 = Class5.aClass5Array1[this.anInt650];
				@Pc(17) int local17 = local14.anInt218;
				@Pc(20) int local20 = local14.anInt219;
				@Pc(23) int local23 = local14.anInt220;
				@Pc(29) int local29 = client.anIntArray212[local23 - local20];
				local5 = aClient3.anIntArray241[local17] >> local20 & local29;
			} else if (this.anInt646 != -1) {
				local5 = aClient3.anIntArray241[this.anInt646];
			}
			return local5 < 0 || local5 >= this.anIntArray147.length || this.anIntArray147[local5] == -1 ? null : method479(this.anIntArray147[local5]);
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("11996, " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QYNFXHXW", name = "a", descriptor = "(BLclient!EYMNCFMK;)V")
	private void method478(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method155();
				if (local11 == 0) {
					return;
				}
				@Pc(20) int local20;
				@Pc(26) int local26;
				if (local11 == 1) {
					local20 = arg0.method155();
					this.anIntArray143 = new int[local20];
					for (local26 = 0; local26 < local20; local26++) {
						this.anIntArray143[local26] = arg0.method157();
					}
				} else if (local11 == 2) {
					this.aString8 = arg0.method162();
				} else if (local11 == 3) {
					this.aByteArray14 = arg0.method163((byte) 4);
				} else if (local11 == 12) {
					this.aByte18 = arg0.method156();
				} else if (local11 == 13) {
					this.anInt653 = arg0.method157();
				} else if (local11 == 14) {
					this.anInt651 = arg0.method157();
				} else if (local11 == 17) {
					this.anInt651 = arg0.method157();
					this.anInt656 = arg0.method157();
					this.anInt657 = arg0.method157();
					this.anInt659 = arg0.method157();
				} else if (local11 >= 30 && local11 < 40) {
					if (this.aStringArray5 == null) {
						this.aStringArray5 = new String[5];
					}
					this.aStringArray5[local11 - 30] = arg0.method162();
					if (this.aStringArray5[local11 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray5[local11 - 30] = null;
					}
				} else if (local11 == 40) {
					local20 = arg0.method155();
					this.anIntArray144 = new int[local20];
					this.anIntArray148 = new int[local20];
					for (local26 = 0; local26 < local20; local26++) {
						this.anIntArray144[local26] = arg0.method157();
						this.anIntArray148[local26] = arg0.method157();
					}
				} else if (local11 == 60) {
					local20 = arg0.method155();
					this.anIntArray145 = new int[local20];
					for (local26 = 0; local26 < local20; local26++) {
						this.anIntArray145[local26] = arg0.method157();
					}
				} else if (local11 == 90) {
					this.anInt643 = arg0.method157();
				} else if (local11 == 91) {
					this.anInt648 = arg0.method157();
				} else if (local11 == 92) {
					this.anInt640 = arg0.method157();
				} else if (local11 == 93) {
					this.aBoolean131 = false;
				} else if (local11 == 95) {
					this.anInt641 = arg0.method157();
				} else if (local11 == 97) {
					this.anInt644 = arg0.method157();
				} else if (local11 == 98) {
					this.anInt658 = arg0.method157();
				} else if (local11 == 99) {
					this.aBoolean133 = true;
				} else if (local11 == 100) {
					this.anInt654 = arg0.method156();
				} else if (local11 == 101) {
					this.anInt647 = arg0.method156() * 5;
				} else if (local11 == 102) {
					this.anInt652 = arg0.method157();
				} else if (local11 == 103) {
					this.anInt655 = arg0.method157();
				} else if (local11 == 106) {
					this.anInt650 = arg0.method157();
					if (this.anInt650 == 65535) {
						this.anInt650 = -1;
					}
					this.anInt646 = arg0.method157();
					if (this.anInt646 == 65535) {
						this.anInt646 = -1;
					}
					local20 = arg0.method155();
					this.anIntArray147 = new int[local20 + 1];
					for (local26 = 0; local26 <= local20; local26++) {
						this.anIntArray147[local26] = arg0.method157();
						if (this.anIntArray147[local26] == 65535) {
							this.anIntArray147[local26] = -1;
						}
					}
				} else if (local11 == 107) {
					this.aBoolean132 = false;
				}
			}
		} catch (@Pc(385) RuntimeException local385) {
			signlink.reporterror("79950, " + 5 + ", " + arg0 + ", " + local385.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QYNFXHXW", name = "a", descriptor = "([IIII)Lclient!OJGAHFXC;")
	public Class1_Sub1_Sub1_Sub5 method480(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(5) boolean local5 = false;
			if (this.anIntArray147 != null) {
				@Pc(12) Class31 local12 = this.method475(863);
				return local12 == null ? null : local12.method480(arg0, 653, arg2, arg3);
			}
			@Pc(29) Class1_Sub1_Sub1_Sub5 local29 = (Class1_Sub1_Sub1_Sub5) aClass41_4.method498(this.aLong24);
			if (local29 == null) {
				@Pc(33) boolean local33 = false;
				for (@Pc(35) int local35 = 0; local35 < this.anIntArray143.length; local35++) {
					if (!Class1_Sub1_Sub1_Sub5.method380(this.anIntArray143[local35])) {
						local33 = true;
					}
				}
				if (local33) {
					return null;
				}
				@Pc(60) Class1_Sub1_Sub1_Sub5[] local60 = new Class1_Sub1_Sub1_Sub5[this.anIntArray143.length];
				for (@Pc(62) int local62 = 0; local62 < this.anIntArray143.length; local62++) {
					local60[local62] = Class1_Sub1_Sub1_Sub5.method379(this.anIntArray143[local62]);
				}
				if (local60.length == 1) {
					local29 = local60[0];
				} else {
					local29 = new Class1_Sub1_Sub1_Sub5(local60.length, (byte) 112, local60);
				}
				if (this.anIntArray144 != null) {
					for (@Pc(101) int local101 = 0; local101 < this.anIntArray144.length; local101++) {
						local29.method393(this.anIntArray144[local101], this.anIntArray148[local101]);
					}
				}
				local29.method386(this.anInt642);
				local29.method396(this.anInt654 + 64, this.anInt647 + 850, -30, -50, -30, true);
				aClass41_4.method499(this.aLong24, local29);
			}
			@Pc(145) Class1_Sub1_Sub1_Sub5 local145 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local145.method381(Class23.method343(arg2, (byte) 1) & Class23.method343(arg3, (byte) 1), local29);
			if (arg2 != -1 && arg3 != -1) {
				local145.method388(arg2, arg0, arg3);
			} else if (arg2 != -1) {
				local145.method387(arg2);
			}
			if (this.anInt644 != 128 || this.anInt658 != 128) {
				local145.method395(this.anInt644, this.anInt649, this.anInt658, this.anInt644);
			}
			local145.method383();
			local145.anIntArrayArray11 = null;
			local145.anIntArrayArray10 = null;
			if (this.aByte18 == 1) {
				local145.aBoolean116 = true;
			}
			return local145;
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("53977, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QYNFXHXW", name = "d", descriptor = "(I)Lclient!OJGAHFXC;")
	public Class1_Sub1_Sub1_Sub5 method481() {
		try {
			if (this.anIntArray147 != null) {
				@Pc(19) Class31 local19 = this.method475(863);
				return local19 == null ? null : local19.method481();
			} else if (this.anIntArray145 == null) {
				return null;
			} else {
				@Pc(34) boolean local34 = false;
				for (@Pc(36) int local36 = 0; local36 < this.anIntArray145.length; local36++) {
					if (!Class1_Sub1_Sub1_Sub5.method380(this.anIntArray145[local36])) {
						local34 = true;
					}
				}
				if (local34) {
					return null;
				}
				@Pc(61) Class1_Sub1_Sub1_Sub5[] local61 = new Class1_Sub1_Sub1_Sub5[this.anIntArray145.length];
				for (@Pc(63) int local63 = 0; local63 < this.anIntArray145.length; local63++) {
					local61[local63] = Class1_Sub1_Sub1_Sub5.method379(this.anIntArray145[local63]);
				}
				@Pc(87) Class1_Sub1_Sub1_Sub5 local87;
				if (local61.length == 1) {
					local87 = local61[0];
				} else {
					local87 = new Class1_Sub1_Sub1_Sub5(local61.length, (byte) 112, local61);
				}
				if (this.anIntArray144 != null) {
					for (@Pc(102) int local102 = 0; local102 < this.anIntArray144.length; local102++) {
						local87.method393(this.anIntArray144[local102], this.anIntArray148[local102]);
					}
				}
				return local87;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("14656, " + -5 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QYNFXHXW", name = "e", descriptor = "(I)Z")
	public boolean method482(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 27 / arg0;
			if (this.anIntArray147 == null) {
				return true;
			}
			@Pc(10) int local10 = -1;
			if (this.anInt650 != -1) {
				@Pc(19) Class5 local19 = Class5.aClass5Array1[this.anInt650];
				@Pc(22) int local22 = local19.anInt218;
				@Pc(25) int local25 = local19.anInt219;
				@Pc(28) int local28 = local19.anInt220;
				@Pc(34) int local34 = client.anIntArray212[local28 - local25];
				local10 = aClient3.anIntArray241[local22] >> local25 & local34;
			} else if (this.anInt646 != -1) {
				local10 = aClient3.anIntArray241[this.anInt646];
			}
			return local10 >= 0 && local10 < this.anIntArray147.length && this.anIntArray147[local10] != -1;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("63232, " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
