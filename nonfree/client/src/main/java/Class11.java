import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fc")
public final class Class11 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	private static int anInt563;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "[I")
	private static int[] anIntArray152;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "[Lclient!fc;")
	private static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	private static int anInt564;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "Lclient!t;")
	public static Class39 aClass39_6 = new Class39(false, 30);

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray8;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "J")
	private long aLong18 = -1L;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "B")
	public byte aByte10 = 1;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
	public int anInt565 = -1;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
	public int anInt566 = -1;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public int anInt567 = -1;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	public int anInt568 = -1;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
	public int anInt569 = -1;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "Z")
	private boolean aBoolean105 = false;

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
	private int anInt570 = -1;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
	private int anInt571 = -1;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
	private int anInt572 = -1;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "Z")
	public boolean aBoolean106 = true;

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
	public int anInt573 = -1;

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
	private int anInt574 = 128;

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
	private int anInt575 = 128;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method303(@OriginalArg(0) Class45 arg0) {
		aClass1_Sub1_Sub3_8 = new Class1_Sub1_Sub3(699, arg0.method639("npc.dat", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(699, arg0.method639("npc.idx", null));
		anInt563 = local19.method469();
		anIntArray152 = new int[anInt563];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt563; local29++) {
			anIntArray152[local29] = local27;
			local27 += local19.method469();
		}
		aClass11Array1 = new Class11[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass11Array1[local49] = new Class11();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
	public static void method304() {
		try {
			aClass39_6 = null;
			anIntArray152 = null;
			aClass11Array1 = null;
			aClass1_Sub1_Sub3_8 = null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("62342, " + true + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Lclient!fc;")
	public static Class11 method305(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass11Array1[local1].aLong18 == (long) arg0) {
				return aClass11Array1[local1];
			}
		}
		anInt564 = (anInt564 + 1) % 20;
		@Pc(33) Class11 local33 = aClass11Array1[anInt564] = new Class11();
		aClass1_Sub1_Sub3_8.anInt771 = anIntArray152[arg0];
		local33.aLong18 = arg0;
		local33.method306(aClass1_Sub1_Sub3_8);
		return local33;
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	private Class11() {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLclient!mb;)V")
	private void method306(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method467();
				if (local13 == 0) {
					return;
				}
				@Pc(22) int local22;
				@Pc(28) int local28;
				if (local13 == 1) {
					local22 = arg0.method467();
					this.anIntArray153 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray153[local28] = arg0.method469();
					}
				} else if (local13 == 2) {
					this.aString24 = arg0.method474();
				} else if (local13 == 3) {
					this.aByteArray5 = arg0.method475();
				} else if (local13 == 12) {
					this.aByte10 = arg0.method468();
				} else if (local13 == 13) {
					this.anInt565 = arg0.method469();
				} else if (local13 == 14) {
					this.anInt566 = arg0.method469();
				} else if (local13 == 16) {
					this.aBoolean105 = true;
				} else if (local13 == 17) {
					this.anInt566 = arg0.method469();
					this.anInt567 = arg0.method469();
					this.anInt568 = arg0.method469();
					this.anInt569 = arg0.method469();
				} else if (local13 >= 30 && local13 < 40) {
					if (this.aStringArray8 == null) {
						this.aStringArray8 = new String[5];
					}
					this.aStringArray8[local13 - 30] = arg0.method474();
					if (this.aStringArray8[local13 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray8[local13 - 30] = null;
					}
				} else if (local13 == 40) {
					local22 = arg0.method467();
					this.anIntArray155 = new int[local22];
					this.anIntArray156 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray155[local28] = arg0.method469();
						this.anIntArray156[local28] = arg0.method469();
					}
				} else if (local13 == 60) {
					local22 = arg0.method467();
					this.anIntArray154 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray154[local28] = arg0.method469();
					}
				} else if (local13 == 90) {
					this.anInt570 = arg0.method469();
				} else if (local13 == 91) {
					this.anInt571 = arg0.method469();
				} else if (local13 == 92) {
					this.anInt572 = arg0.method469();
				} else if (local13 == 93) {
					this.aBoolean106 = false;
				} else if (local13 == 95) {
					this.anInt573 = arg0.method469();
				} else if (local13 == 97) {
					this.anInt574 = arg0.method469();
				} else if (local13 == 98) {
					this.anInt575 = arg0.method469();
				}
			}
		} catch (@Pc(280) RuntimeException local280) {
			signlink.reporterror("6650, " + false + ", " + arg0 + ", " + local280.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II[II)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		try {
			@Pc(7) Class1_Sub1_Sub1_Sub5 local7 = (Class1_Sub1_Sub1_Sub5) aClass39_6.method608(this.aLong18);
			if (local7 == null) {
				@Pc(11) boolean local11 = false;
				for (@Pc(13) int local13 = 0; local13 < this.anIntArray153.length; local13++) {
					if (!Class1_Sub1_Sub1_Sub5.method279(this.anIntArray153[local13])) {
						local11 = true;
					}
				}
				if (local11) {
					return null;
				}
				@Pc(38) Class1_Sub1_Sub1_Sub5[] local38 = new Class1_Sub1_Sub1_Sub5[this.anIntArray153.length];
				for (@Pc(40) int local40 = 0; local40 < this.anIntArray153.length; local40++) {
					local38[local40] = Class1_Sub1_Sub1_Sub5.method278(this.anIntArray153[local40]);
				}
				if (local38.length == 1) {
					local7 = local38[0];
				} else {
					local7 = new Class1_Sub1_Sub1_Sub5(local38.length, false, local38);
				}
				if (this.anIntArray155 != null) {
					for (@Pc(80) int local80 = 0; local80 < this.anIntArray155.length; local80++) {
						local7.method292(this.anIntArray155[local80], this.anIntArray156[local80]);
					}
				}
				local7.method285();
				local7.method295(64, 850, -30, -50, -30, true);
				aClass39_6.method609(this.aLong18, local7);
			}
			@Pc(117) Class1_Sub1_Sub1_Sub5 local117 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local117.method280(!this.aBoolean105, local7);
			if (arg0 != -1 && arg1 != -1) {
				local117.method287(365, arg1, arg0, arg2);
			} else if (arg0 != -1) {
				local117.method286(arg0);
			}
			if (this.anInt574 != 128 || this.anInt575 != 128) {
				local117.method294(this.anInt574, this.anInt574, this.anInt575);
			}
			local117.method282((byte) 3);
			local117.anIntArrayArray8 = null;
			local117.anIntArrayArray7 = null;
			if (this.aByte10 == 1) {
				local117.aBoolean103 = true;
			}
			return local117;
		} catch (@Pc(190) RuntimeException local190) {
			signlink.reporterror("87985, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local190.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method308(@OriginalArg(0) int arg0) {
		try {
			if (this.anIntArray154 == null) {
				return null;
			}
			@Pc(8) boolean local8 = false;
			if (arg0 < 4 || arg0 > 4) {
				throw new NullPointerException();
			}
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray154.length; local20++) {
				if (!Class1_Sub1_Sub1_Sub5.method279(this.anIntArray154[local20])) {
					local8 = true;
				}
			}
			if (local8) {
				return null;
			}
			@Pc(45) Class1_Sub1_Sub1_Sub5[] local45 = new Class1_Sub1_Sub1_Sub5[this.anIntArray154.length];
			for (@Pc(47) int local47 = 0; local47 < this.anIntArray154.length; local47++) {
				local45[local47] = Class1_Sub1_Sub1_Sub5.method278(this.anIntArray154[local47]);
			}
			@Pc(72) Class1_Sub1_Sub1_Sub5 local72;
			if (local45.length == 1) {
				local72 = local45[0];
			} else {
				local72 = new Class1_Sub1_Sub1_Sub5(local45.length, false, local45);
			}
			if (this.anIntArray155 != null) {
				for (@Pc(87) int local87 = 0; local87 < this.anIntArray155.length; local87++) {
					local72.method292(this.anIntArray155[local87], this.anIntArray156[local87]);
				}
			}
			return local72;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("56219, " + arg0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}
}
