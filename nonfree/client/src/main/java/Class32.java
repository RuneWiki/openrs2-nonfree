import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SHKUIFHF")
public final class Class32 {

	@OriginalMember(owner = "client!SHKUIFHF", name = "i", descriptor = "Lclient!BFQIDHPO;")
	private static Class2_Sub1_Sub2 aClass2_Sub1_Sub2_4;

	@OriginalMember(owner = "client!SHKUIFHF", name = "m", descriptor = "Lclient!client;")
	public static client aClient2;

	@OriginalMember(owner = "client!SHKUIFHF", name = "n", descriptor = "I")
	private static int anInt628;

	@OriginalMember(owner = "client!SHKUIFHF", name = "o", descriptor = "[I")
	private static int[] anIntArray112;

	@OriginalMember(owner = "client!SHKUIFHF", name = "v", descriptor = "I")
	private static int anInt631;

	@OriginalMember(owner = "client!SHKUIFHF", name = "y", descriptor = "[Lclient!SHKUIFHF;")
	private static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!SHKUIFHF", name = "f", descriptor = "Lclient!RYXFUVWJ;")
	public static Class31 aClass31_7 = new Class31(30, -268);

	@OriginalMember(owner = "client!SHKUIFHF", name = "a", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray6;

	@OriginalMember(owner = "client!SHKUIFHF", name = "c", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!SHKUIFHF", name = "e", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!SHKUIFHF", name = "g", descriptor = "[I")
	private int[] anIntArray110;

	@OriginalMember(owner = "client!SHKUIFHF", name = "j", descriptor = "[I")
	private int[] anIntArray111;

	@OriginalMember(owner = "client!SHKUIFHF", name = "z", descriptor = "[I")
	private int[] anIntArray113;

	@OriginalMember(owner = "client!SHKUIFHF", name = "E", descriptor = "I")
	private int anInt638;

	@OriginalMember(owner = "client!SHKUIFHF", name = "F", descriptor = "[I")
	public int[] anIntArray114;

	@OriginalMember(owner = "client!SHKUIFHF", name = "G", descriptor = "I")
	private int anInt639;

	@OriginalMember(owner = "client!SHKUIFHF", name = "O", descriptor = "I")
	private int anInt645;

	@OriginalMember(owner = "client!SHKUIFHF", name = "b", descriptor = "Z")
	public boolean aBoolean154 = true;

	@OriginalMember(owner = "client!SHKUIFHF", name = "d", descriptor = "I")
	public int anInt625 = -1;

	@OriginalMember(owner = "client!SHKUIFHF", name = "h", descriptor = "I")
	private int anInt626 = -1;

	@OriginalMember(owner = "client!SHKUIFHF", name = "k", descriptor = "I")
	public int anInt627 = 32;

	@OriginalMember(owner = "client!SHKUIFHF", name = "l", descriptor = "Z")
	public boolean aBoolean155 = true;

	@OriginalMember(owner = "client!SHKUIFHF", name = "p", descriptor = "B")
	public byte aByte33 = 1;

	@OriginalMember(owner = "client!SHKUIFHF", name = "q", descriptor = "J")
	public long aLong21 = -1L;

	@OriginalMember(owner = "client!SHKUIFHF", name = "r", descriptor = "Z")
	private boolean aBoolean156 = true;

	@OriginalMember(owner = "client!SHKUIFHF", name = "s", descriptor = "I")
	private int anInt629 = -1;

	@OriginalMember(owner = "client!SHKUIFHF", name = "t", descriptor = "I")
	private int anInt630 = 128;

	@OriginalMember(owner = "client!SHKUIFHF", name = "u", descriptor = "Ljava/lang/String;")
	public String aString14 = "null";

	@OriginalMember(owner = "client!SHKUIFHF", name = "w", descriptor = "I")
	public int anInt632 = -1;

	@OriginalMember(owner = "client!SHKUIFHF", name = "x", descriptor = "I")
	private int anInt633 = 1;

	@OriginalMember(owner = "client!SHKUIFHF", name = "A", descriptor = "I")
	private int anInt634 = -1;

	@OriginalMember(owner = "client!SHKUIFHF", name = "B", descriptor = "I")
	public int anInt635 = -1;

	@OriginalMember(owner = "client!SHKUIFHF", name = "C", descriptor = "I")
	private int anInt636 = -1;

	@OriginalMember(owner = "client!SHKUIFHF", name = "D", descriptor = "I")
	public int anInt637 = -1;

	@OriginalMember(owner = "client!SHKUIFHF", name = "H", descriptor = "I")
	public int anInt640 = -1;

	@OriginalMember(owner = "client!SHKUIFHF", name = "I", descriptor = "I")
	public int anInt641 = -1;

	@OriginalMember(owner = "client!SHKUIFHF", name = "J", descriptor = "I")
	private int anInt642 = 128;

	@OriginalMember(owner = "client!SHKUIFHF", name = "K", descriptor = "I")
	private int anInt643 = -1;

	@OriginalMember(owner = "client!SHKUIFHF", name = "L", descriptor = "B")
	private byte aByte34 = 7;

	@OriginalMember(owner = "client!SHKUIFHF", name = "M", descriptor = "I")
	public int anInt644 = -1;

	@OriginalMember(owner = "client!SHKUIFHF", name = "N", descriptor = "Z")
	public boolean aBoolean157 = false;

	@OriginalMember(owner = "client!SHKUIFHF", name = "b", descriptor = "(I)V")
	public static void method454(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			aClass31_7 = null;
			anIntArray112 = null;
			aClass32Array1 = null;
			aClass2_Sub1_Sub2_4 = null;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("79939, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SHKUIFHF", name = "c", descriptor = "(I)Lclient!SHKUIFHF;")
	public static Class32 method455(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass32Array1[local1].aLong21 == (long) arg0) {
				return aClass32Array1[local1];
			}
		}
		anInt631 = (anInt631 + 1) % 20;
		@Pc(33) Class32 local33 = aClass32Array1[anInt631] = new Class32();
		aClass2_Sub1_Sub2_4.anInt123 = anIntArray112[arg0];
		local33.aLong21 = arg0;
		local33.method459(aClass2_Sub1_Sub2_4);
		return local33;
	}

	@OriginalMember(owner = "client!SHKUIFHF", name = "a", descriptor = "(Lclient!VSQMPWOM;)V")
	public static void method457(@OriginalArg(0) Class39 arg0) {
		aClass2_Sub1_Sub2_4 = new Class2_Sub1_Sub2(arg0.method489("npc.dat", null), -990);
		@Pc(19) Class2_Sub1_Sub2 local19 = new Class2_Sub1_Sub2(arg0.method489("npc.idx", null), -990);
		anInt628 = local19.method81();
		anIntArray112 = new int[anInt628];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt628; local29++) {
			anIntArray112[local29] = local27;
			local27 += local19.method81();
		}
		aClass32Array1 = new Class32[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass32Array1[local49] = new Class32();
		}
	}

	@OriginalMember(owner = "client!SHKUIFHF", name = "<init>", descriptor = "()V")
	private Class32() {
	}

	@OriginalMember(owner = "client!SHKUIFHF", name = "a", descriptor = "(I)Z")
	public boolean method452() {
		try {
			if (this.anIntArray114 == null) {
				return true;
			}
			@Pc(6) int local6 = -1;
			if (this.anInt626 != -1) {
				@Pc(20) Class36 local20 = Class36.aClass36Array1[this.anInt626];
				@Pc(23) int local23 = local20.anInt702;
				@Pc(26) int local26 = local20.anInt703;
				@Pc(29) int local29 = local20.anInt704;
				@Pc(35) int local35 = client.anIntArray232[local29 - local26];
				local6 = aClient2.anIntArray268[local23] >> local26 & local35;
			} else if (this.anInt629 != -1) {
				local6 = aClient2.anIntArray268[this.anInt629];
			}
			return local6 >= 0 && local6 < this.anIntArray114.length && this.anIntArray114[local6] != -1;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("89447, " + 0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SHKUIFHF", name = "a", descriptor = "(B)Lclient!XBVYIDUH;")
	public Class2_Sub1_Sub1_Sub6 method453() {
		try {
			if (this.anIntArray114 != null) {
				@Pc(8) Class32 local8 = this.method458();
				return local8 == null ? null : local8.method453();
			} else if (this.anIntArray113 == null) {
				return null;
			} else {
				@Pc(23) boolean local23 = false;
				for (@Pc(36) int local36 = 0; local36 < this.anIntArray113.length; local36++) {
					if (!Class2_Sub1_Sub1_Sub6.method513(this.anIntArray113[local36])) {
						local23 = true;
					}
				}
				if (local23) {
					return null;
				}
				@Pc(61) Class2_Sub1_Sub1_Sub6[] local61 = new Class2_Sub1_Sub1_Sub6[this.anIntArray113.length];
				for (@Pc(63) int local63 = 0; local63 < this.anIntArray113.length; local63++) {
					local61[local63] = Class2_Sub1_Sub1_Sub6.method512(this.anIntArray113[local63]);
				}
				@Pc(87) Class2_Sub1_Sub1_Sub6 local87;
				if (local61.length == 1) {
					local87 = local61[0];
				} else {
					local87 = new Class2_Sub1_Sub1_Sub6(local61, 273, local61.length);
				}
				if (this.anIntArray111 != null) {
					for (@Pc(102) int local102 = 0; local102 < this.anIntArray111.length; local102++) {
						local87.method526(this.anIntArray111[local102], this.anIntArray110[local102]);
					}
				}
				return local87;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("37200, " + 44 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SHKUIFHF", name = "a", descriptor = "(III[I)Lclient!XBVYIDUH;")
	public Class2_Sub1_Sub1_Sub6 method456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			if (this.anIntArray114 != null) {
				@Pc(8) Class32 local8 = this.method458();
				return local8 == null ? null : local8.method456(arg0, arg1, arg2);
			}
			@Pc(25) Class2_Sub1_Sub1_Sub6 local25 = (Class2_Sub1_Sub1_Sub6) aClass31_7.method449(this.aLong21);
			if (local25 == null) {
				@Pc(29) boolean local29 = false;
				for (@Pc(31) int local31 = 0; local31 < this.anIntArray109.length; local31++) {
					if (!Class2_Sub1_Sub1_Sub6.method513(this.anIntArray109[local31])) {
						local29 = true;
					}
				}
				if (local29) {
					return null;
				}
				@Pc(56) Class2_Sub1_Sub1_Sub6[] local56 = new Class2_Sub1_Sub1_Sub6[this.anIntArray109.length];
				for (@Pc(58) int local58 = 0; local58 < this.anIntArray109.length; local58++) {
					local56[local58] = Class2_Sub1_Sub1_Sub6.method512(this.anIntArray109[local58]);
				}
				if (local56.length == 1) {
					local25 = local56[0];
				} else {
					local25 = new Class2_Sub1_Sub1_Sub6(local56, 273, local56.length);
				}
				if (this.anIntArray111 != null) {
					for (@Pc(97) int local97 = 0; local97 < this.anIntArray111.length; local97++) {
						local25.method526(this.anIntArray111[local97], this.anIntArray110[local97]);
					}
				}
				local25.method519();
				local25.method529(this.anInt645 + 64, this.anInt638 + 850, -30, -50, -30, true);
				aClass31_7.method450(local25, this.aLong21);
			}
			@Pc(140) Class2_Sub1_Sub1_Sub6 local140 = Class2_Sub1_Sub1_Sub6.aClass2_Sub1_Sub1_Sub6_2;
			if (this.anInt633 != 1) {
				throw new NullPointerException();
			}
			local140.method514(local25, Class4.method168(this.aByte34, arg1) & Class4.method168(this.aByte34, arg0));
			if (arg1 != -1 && arg0 != -1) {
				local140.method521(arg0, arg1, arg2);
			} else if (arg1 != -1) {
				local140.method520(arg1);
			}
			if (this.anInt642 != 128 || this.anInt630 != 128) {
				local140.method528(this.anInt630, this.anInt642, this.anInt642);
			}
			local140.method516();
			local140.anIntArrayArray17 = null;
			local140.anIntArrayArray16 = null;
			if (this.aByte33 == 1) {
				local140.aBoolean189 = true;
			}
			return local140;
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("60190, " + arg0 + ", " + 1 + ", " + arg1 + ", " + arg2 + ", " + local218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SHKUIFHF", name = "d", descriptor = "(I)Lclient!SHKUIFHF;")
	public Class32 method458() {
		try {
			@Pc(7) int local7 = -1;
			if (this.anInt626 != -1) {
				@Pc(16) Class36 local16 = Class36.aClass36Array1[this.anInt626];
				@Pc(19) int local19 = local16.anInt702;
				@Pc(22) int local22 = local16.anInt703;
				@Pc(25) int local25 = local16.anInt704;
				@Pc(31) int local31 = client.anIntArray232[local25 - local22];
				local7 = aClient2.anIntArray268[local19] >> local22 & local31;
			} else if (this.anInt629 != -1) {
				local7 = aClient2.anIntArray268[this.anInt629];
			}
			return local7 < 0 || local7 >= this.anIntArray114.length || this.anIntArray114[local7] == -1 ? null : method455(this.anIntArray114[local7]);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("18131, " + 0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SHKUIFHF", name = "a", descriptor = "(BLclient!BFQIDHPO;)V")
	private void method459(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method79();
				if (local10 == 0) {
					return;
				}
				@Pc(19) int local19;
				@Pc(25) int local25;
				if (local10 == 1) {
					local19 = arg0.method79();
					this.anIntArray109 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray109[local25] = arg0.method81();
					}
				} else if (local10 == 2) {
					this.aString14 = arg0.method86();
				} else if (local10 == 3) {
					this.aByteArray16 = arg0.method87();
				} else if (local10 == 12) {
					this.aByte33 = arg0.method80();
				} else if (local10 == 13) {
					this.anInt644 = arg0.method81();
				} else if (local10 == 14) {
					this.anInt635 = arg0.method81();
				} else if (local10 == 17) {
					this.anInt635 = arg0.method81();
					this.anInt637 = arg0.method81();
					this.anInt625 = arg0.method81();
					this.anInt640 = arg0.method81();
				} else if (local10 >= 30 && local10 < 40) {
					if (this.aStringArray6 == null) {
						this.aStringArray6 = new String[5];
					}
					this.aStringArray6[local10 - 30] = arg0.method86();
					if (this.aStringArray6[local10 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray6[local10 - 30] = null;
					}
				} else if (local10 == 40) {
					local19 = arg0.method79();
					this.anIntArray111 = new int[local19];
					this.anIntArray110 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray111[local25] = arg0.method81();
						this.anIntArray110[local25] = arg0.method81();
					}
				} else if (local10 == 60) {
					local19 = arg0.method79();
					this.anIntArray113 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray113[local25] = arg0.method81();
					}
				} else if (local10 == 90) {
					this.anInt636 = arg0.method81();
				} else if (local10 == 91) {
					this.anInt643 = arg0.method81();
				} else if (local10 == 92) {
					this.anInt634 = arg0.method81();
				} else if (local10 == 93) {
					this.aBoolean154 = false;
				} else if (local10 == 95) {
					this.anInt632 = arg0.method81();
				} else if (local10 == 97) {
					this.anInt642 = arg0.method81();
				} else if (local10 == 98) {
					this.anInt630 = arg0.method81();
				} else if (local10 == 99) {
					this.aBoolean157 = true;
				} else if (local10 == 100) {
					this.anInt645 = arg0.method80();
				} else if (local10 == 101) {
					this.anInt638 = arg0.method80() * 5;
				} else if (local10 == 102) {
					this.anInt641 = arg0.method81();
				} else if (local10 == 103) {
					this.anInt627 = arg0.method81();
				} else if (local10 == 106) {
					this.anInt626 = arg0.method81();
					if (this.anInt626 == 65535) {
						this.anInt626 = -1;
					}
					this.anInt629 = arg0.method81();
					if (this.anInt629 == 65535) {
						this.anInt629 = -1;
					}
					local19 = arg0.method79();
					this.anIntArray114 = new int[local19 + 1];
					for (local25 = 0; local25 <= local19; local25++) {
						this.anIntArray114[local25] = arg0.method81();
						if (this.anIntArray114[local25] == 65535) {
							this.anIntArray114[local25] = -1;
						}
					}
				} else if (local10 == 107) {
					this.aBoolean155 = false;
				}
			}
		} catch (@Pc(384) RuntimeException local384) {
			signlink.reporterror("70765, " + -11 + ", " + arg0 + ", " + local384.toString());
			throw new RuntimeException();
		}
	}
}
