import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TQRZOVPP")
public final class Class37 {

	@OriginalMember(owner = "client!TQRZOVPP", name = "b", descriptor = "Lclient!client;")
	public static client aClient2;

	@OriginalMember(owner = "client!TQRZOVPP", name = "c", descriptor = "Lclient!CMGGUSPR;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4;

	@OriginalMember(owner = "client!TQRZOVPP", name = "m", descriptor = "I")
	private static int anInt679;

	@OriginalMember(owner = "client!TQRZOVPP", name = "t", descriptor = "I")
	private static int anInt681;

	@OriginalMember(owner = "client!TQRZOVPP", name = "K", descriptor = "[Lclient!TQRZOVPP;")
	private static Class37[] aClass37Array1;

	@OriginalMember(owner = "client!TQRZOVPP", name = "M", descriptor = "[I")
	private static int[] anIntArray177;

	@OriginalMember(owner = "client!TQRZOVPP", name = "y", descriptor = "Lclient!HARAZQMH;")
	public static Class15 aClass15_5 = new Class15((byte) 5, 30);

	@OriginalMember(owner = "client!TQRZOVPP", name = "D", descriptor = "I")
	private static int anInt687 = 536;

	@OriginalMember(owner = "client!TQRZOVPP", name = "a", descriptor = "I")
	private int anInt672;

	@OriginalMember(owner = "client!TQRZOVPP", name = "f", descriptor = "[I")
	public int[] anIntArray172;

	@OriginalMember(owner = "client!TQRZOVPP", name = "g", descriptor = "I")
	private int anInt675;

	@OriginalMember(owner = "client!TQRZOVPP", name = "k", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!TQRZOVPP", name = "n", descriptor = "[I")
	private int[] anIntArray174;

	@OriginalMember(owner = "client!TQRZOVPP", name = "q", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray5;

	@OriginalMember(owner = "client!TQRZOVPP", name = "s", descriptor = "[I")
	private int[] anIntArray175;

	@OriginalMember(owner = "client!TQRZOVPP", name = "v", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!TQRZOVPP", name = "F", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!TQRZOVPP", name = "d", descriptor = "I")
	public int anInt673 = 32;

	@OriginalMember(owner = "client!TQRZOVPP", name = "e", descriptor = "I")
	private int anInt674 = 128;

	@OriginalMember(owner = "client!TQRZOVPP", name = "h", descriptor = "Z")
	private boolean aBoolean148 = false;

	@OriginalMember(owner = "client!TQRZOVPP", name = "i", descriptor = "I")
	public int anInt676 = -1;

	@OriginalMember(owner = "client!TQRZOVPP", name = "j", descriptor = "I")
	public int anInt677 = -1;

	@OriginalMember(owner = "client!TQRZOVPP", name = "l", descriptor = "I")
	public int anInt678 = -1;

	@OriginalMember(owner = "client!TQRZOVPP", name = "o", descriptor = "Ljava/lang/String;")
	public String aString9 = "null";

	@OriginalMember(owner = "client!TQRZOVPP", name = "p", descriptor = "I")
	private int anInt680 = -1;

	@OriginalMember(owner = "client!TQRZOVPP", name = "r", descriptor = "Z")
	public boolean aBoolean149 = true;

	@OriginalMember(owner = "client!TQRZOVPP", name = "u", descriptor = "I")
	private int anInt682 = -1;

	@OriginalMember(owner = "client!TQRZOVPP", name = "w", descriptor = "I")
	private int anInt683 = -1;

	@OriginalMember(owner = "client!TQRZOVPP", name = "x", descriptor = "I")
	private int anInt684 = -1;

	@OriginalMember(owner = "client!TQRZOVPP", name = "z", descriptor = "J")
	public long aLong24 = -1L;

	@OriginalMember(owner = "client!TQRZOVPP", name = "A", descriptor = "Z")
	public boolean aBoolean150 = false;

	@OriginalMember(owner = "client!TQRZOVPP", name = "B", descriptor = "I")
	public int anInt685 = -1;

	@OriginalMember(owner = "client!TQRZOVPP", name = "C", descriptor = "I")
	public int anInt686 = -1;

	@OriginalMember(owner = "client!TQRZOVPP", name = "E", descriptor = "B")
	public byte aByte17 = 1;

	@OriginalMember(owner = "client!TQRZOVPP", name = "G", descriptor = "Z")
	private boolean aBoolean151 = true;

	@OriginalMember(owner = "client!TQRZOVPP", name = "H", descriptor = "I")
	private int anInt688 = -1;

	@OriginalMember(owner = "client!TQRZOVPP", name = "I", descriptor = "I")
	public int anInt689 = -1;

	@OriginalMember(owner = "client!TQRZOVPP", name = "J", descriptor = "Z")
	public boolean aBoolean152 = true;

	@OriginalMember(owner = "client!TQRZOVPP", name = "L", descriptor = "Z")
	private boolean aBoolean153 = true;

	@OriginalMember(owner = "client!TQRZOVPP", name = "N", descriptor = "I")
	private int anInt690 = 128;

	@OriginalMember(owner = "client!TQRZOVPP", name = "O", descriptor = "I")
	public int anInt691 = -1;

	@OriginalMember(owner = "client!TQRZOVPP", name = "a", descriptor = "(I)V")
	public static void method482() {
		try {
			aClass15_5 = null;
			anIntArray177 = null;
			aClass37Array1 = null;
			aClass1_Sub1_Sub3_4 = null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("59372, " + -876 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQRZOVPP", name = "b", descriptor = "(I)Lclient!TQRZOVPP;")
	public static Class37 method483(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass37Array1[local1].aLong24 == (long) arg0) {
				return aClass37Array1[local1];
			}
		}
		anInt679 = (anInt679 + 1) % 20;
		@Pc(33) Class37 local33 = aClass37Array1[anInt679] = new Class37();
		aClass1_Sub1_Sub3_4.anInt78 = anIntArray177[arg0];
		local33.aLong24 = arg0;
		local33.method488(aClass1_Sub1_Sub3_4);
		return local33;
	}

	@OriginalMember(owner = "client!TQRZOVPP", name = "a", descriptor = "(Lclient!UUIGNTAD;)V")
	public static void method487(@OriginalArg(0) Class38 arg0) {
		aClass1_Sub1_Sub3_4 = new Class1_Sub1_Sub3(arg0.method512("npc.dat", null), anInt687);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method512("npc.idx", null), anInt687);
		anInt681 = local19.method57();
		anIntArray177 = new int[anInt681];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt681; local29++) {
			anIntArray177[local29] = local27;
			local27 += local19.method57();
		}
		aClass37Array1 = new Class37[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass37Array1[local49] = new Class37();
		}
	}

	@OriginalMember(owner = "client!TQRZOVPP", name = "<init>", descriptor = "()V")
	private Class37() {
	}

	@OriginalMember(owner = "client!TQRZOVPP", name = "a", descriptor = "(B)Lclient!TQRZOVPP;")
	public Class37 method481() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt684 != -1) {
				@Pc(15) Class30 local15 = Class30.aClass30Array1[this.anInt684];
				@Pc(18) int local18 = local15.anInt576;
				@Pc(21) int local21 = local15.anInt577;
				@Pc(24) int local24 = local15.anInt578;
				@Pc(30) int local30 = client.anIntArray253[local24 - local21];
				local1 = aClient2.anIntArray232[local18] >> local21 & local30;
			} else if (this.anInt688 != -1) {
				local1 = aClient2.anIntArray232[this.anInt688];
			}
			return local1 < 0 || local1 >= this.anIntArray172.length || this.anIntArray172[local1] == -1 ? null : method483(this.anIntArray172[local1]);
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("51279, " + 73 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQRZOVPP", name = "a", descriptor = "(Z)Lclient!GCSAWSJV;")
	public Class1_Sub1_Sub1_Sub2 method484() {
		try {
			if (this.anIntArray172 != null) {
				@Pc(14) Class37 local14 = this.method481();
				return local14 == null ? null : local14.method484();
			} else if (this.anIntArray174 == null) {
				return null;
			} else {
				@Pc(29) boolean local29 = false;
				for (@Pc(31) int local31 = 0; local31 < this.anIntArray174.length; local31++) {
					if (!Class1_Sub1_Sub1_Sub2.method144(this.anIntArray174[local31])) {
						local29 = true;
					}
				}
				if (local29) {
					return null;
				}
				@Pc(56) Class1_Sub1_Sub1_Sub2[] local56 = new Class1_Sub1_Sub1_Sub2[this.anIntArray174.length];
				for (@Pc(58) int local58 = 0; local58 < this.anIntArray174.length; local58++) {
					local56[local58] = Class1_Sub1_Sub1_Sub2.method143(this.anIntArray174[local58]);
				}
				@Pc(82) Class1_Sub1_Sub1_Sub2 local82;
				if (local56.length == 1) {
					local82 = local56[0];
				} else {
					local82 = new Class1_Sub1_Sub1_Sub2(local56, local56.length, this.aBoolean151);
				}
				if (this.anIntArray175 != null) {
					for (@Pc(98) int local98 = 0; local98 < this.anIntArray175.length; local98++) {
						local82.method157(this.anIntArray175[local98], this.anIntArray173[local98]);
					}
				}
				return local82;
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("80378, " + false + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQRZOVPP", name = "b", descriptor = "(Z)Z")
	public boolean method485() {
		try {
			if (this.anIntArray172 == null) {
				return true;
			}
			@Pc(12) int local12 = -1;
			if (this.anInt684 != -1) {
				@Pc(21) Class30 local21 = Class30.aClass30Array1[this.anInt684];
				@Pc(24) int local24 = local21.anInt576;
				@Pc(27) int local27 = local21.anInt577;
				@Pc(30) int local30 = local21.anInt578;
				@Pc(36) int local36 = client.anIntArray253[local30 - local27];
				local12 = aClient2.anIntArray232[local24] >> local27 & local36;
			} else if (this.anInt688 != -1) {
				local12 = aClient2.anIntArray232[this.anInt688];
			}
			return local12 >= 0 && local12 < this.anIntArray172.length && this.anIntArray172[local12] != -1;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("21260, " + true + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQRZOVPP", name = "a", descriptor = "(I[IIB)Lclient!GCSAWSJV;")
	public Class1_Sub1_Sub1_Sub2 method486(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.anIntArray172 != null) {
				@Pc(8) Class37 local8 = this.method481();
				return local8 == null ? null : local8.method486(arg0, arg1, arg2);
			}
			@Pc(25) Class1_Sub1_Sub1_Sub2 local25 = (Class1_Sub1_Sub1_Sub2) aClass15_5.method182(this.aLong24);
			if (local25 == null) {
				@Pc(29) boolean local29 = false;
				for (@Pc(31) int local31 = 0; local31 < this.anIntArray176.length; local31++) {
					if (!Class1_Sub1_Sub1_Sub2.method144(this.anIntArray176[local31])) {
						local29 = true;
					}
				}
				if (local29) {
					return null;
				}
				@Pc(56) Class1_Sub1_Sub1_Sub2[] local56 = new Class1_Sub1_Sub1_Sub2[this.anIntArray176.length];
				for (@Pc(58) int local58 = 0; local58 < this.anIntArray176.length; local58++) {
					local56[local58] = Class1_Sub1_Sub1_Sub2.method143(this.anIntArray176[local58]);
				}
				if (local56.length == 1) {
					local25 = local56[0];
				} else {
					local25 = new Class1_Sub1_Sub1_Sub2(local56, local56.length, this.aBoolean151);
				}
				if (this.anIntArray175 != null) {
					for (@Pc(98) int local98 = 0; local98 < this.anIntArray175.length; local98++) {
						local25.method157(this.anIntArray175[local98], this.anIntArray173[local98]);
					}
				}
				local25.method150();
				local25.method160(this.anInt672 + 64, this.anInt675 + 850, -30, -50, -30, true);
				aClass15_5.method183(this.aLong24, local25);
			}
			@Pc(141) Class1_Sub1_Sub1_Sub2 local141 = Class1_Sub1_Sub1_Sub2.aClass1_Sub1_Sub1_Sub2_1;
			local141.method145(Class31.method388(this.aBoolean153, arg2) & Class31.method388(this.aBoolean153, arg0), local25, this.aBoolean148);
			if (arg2 != -1 && arg0 != -1) {
				local141.method152(arg2, arg1, arg0);
			} else if (arg2 != -1) {
				local141.method151(arg2);
			}
			if (this.anInt674 != 128 || this.anInt690 != 128) {
				local141.method159(this.anInt674, this.anInt674, this.anInt690);
			}
			local141.method147((byte) 6);
			local141.anIntArrayArray5 = null;
			local141.anIntArrayArray4 = null;
			if (this.aByte17 == 1) {
				local141.aBoolean46 = true;
			}
			return local141;
		} catch (@Pc(219) RuntimeException local219) {
			signlink.reporterror("77310, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -112 + ", " + local219.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQRZOVPP", name = "a", descriptor = "(Lclient!CMGGUSPR;I)V")
	private void method488(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method55();
				if (local13 == 0) {
					return;
				}
				@Pc(22) int local22;
				@Pc(28) int local28;
				if (local13 == 1) {
					local22 = arg0.method55();
					this.anIntArray176 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray176[local28] = arg0.method57();
					}
				} else if (local13 == 2) {
					this.aString9 = arg0.method62();
				} else if (local13 == 3) {
					this.aByteArray14 = arg0.method63();
				} else if (local13 == 12) {
					this.aByte17 = arg0.method56();
				} else if (local13 == 13) {
					this.anInt691 = arg0.method57();
				} else if (local13 == 14) {
					this.anInt676 = arg0.method57();
				} else if (local13 == 17) {
					this.anInt676 = arg0.method57();
					this.anInt685 = arg0.method57();
					this.anInt677 = arg0.method57();
					this.anInt686 = arg0.method57();
				} else if (local13 >= 30 && local13 < 40) {
					if (this.aStringArray5 == null) {
						this.aStringArray5 = new String[5];
					}
					this.aStringArray5[local13 - 30] = arg0.method62();
					if (this.aStringArray5[local13 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray5[local13 - 30] = null;
					}
				} else if (local13 == 40) {
					local22 = arg0.method55();
					this.anIntArray175 = new int[local22];
					this.anIntArray173 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray175[local28] = arg0.method57();
						this.anIntArray173[local28] = arg0.method57();
					}
				} else if (local13 == 60) {
					local22 = arg0.method55();
					this.anIntArray174 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray174[local28] = arg0.method57();
					}
				} else if (local13 == 90) {
					this.anInt683 = arg0.method57();
				} else if (local13 == 91) {
					this.anInt680 = arg0.method57();
				} else if (local13 == 92) {
					this.anInt682 = arg0.method57();
				} else if (local13 == 93) {
					this.aBoolean152 = false;
				} else if (local13 == 95) {
					this.anInt689 = arg0.method57();
				} else if (local13 == 97) {
					this.anInt674 = arg0.method57();
				} else if (local13 == 98) {
					this.anInt690 = arg0.method57();
				} else if (local13 == 99) {
					this.aBoolean150 = true;
				} else if (local13 == 100) {
					this.anInt672 = arg0.method56();
				} else if (local13 == 101) {
					this.anInt675 = arg0.method56() * 5;
				} else if (local13 == 102) {
					this.anInt678 = arg0.method57();
				} else if (local13 == 103) {
					this.anInt673 = arg0.method57();
				} else if (local13 == 106) {
					this.anInt684 = arg0.method57();
					if (this.anInt684 == 65535) {
						this.anInt684 = -1;
					}
					this.anInt688 = arg0.method57();
					if (this.anInt688 == 65535) {
						this.anInt688 = -1;
					}
					local22 = arg0.method55();
					this.anIntArray172 = new int[local22 + 1];
					for (local28 = 0; local28 <= local22; local28++) {
						this.anIntArray172[local28] = arg0.method57();
						if (this.anIntArray172[local28] == 65535) {
							this.anIntArray172[local28] = -1;
						}
					}
				} else if (local13 == 107) {
					this.aBoolean149 = false;
				}
			}
		} catch (@Pc(387) RuntimeException local387) {
			signlink.reporterror("95454, " + arg0 + ", " + -593 + ", " + local387.toString());
			throw new RuntimeException();
		}
	}
}
