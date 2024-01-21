import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fc")
public final class Class11 {

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
	private static int anInt563;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "[I")
	private static int[] anIntArray152;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "[Lclient!fc;")
	private static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
	private static int anInt564;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Z")
	private static boolean aBoolean113 = true;

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "Lclient!t;")
	public static Class39 aClass39_6 = new Class39(5, 30);

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray8;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	private int anInt562 = -797;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "J")
	private long aLong19 = -1L;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "B")
	public byte aByte31 = 1;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public int anInt565 = -1;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	public int anInt566 = -1;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
	public int anInt567 = -1;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
	public int anInt568 = -1;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
	public int anInt569 = -1;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
	private int anInt570 = -1;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
	private int anInt571 = -1;

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
	private int anInt572 = -1;

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "Z")
	public boolean aBoolean115 = true;

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
	public int anInt573 = -1;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
	private int anInt574 = 128;

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
	private int anInt575 = 128;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method304(@OriginalArg(0) Class45 arg0) {
		aClass1_Sub1_Sub3_8 = new Class1_Sub1_Sub3(arg0.method644("npc.dat", null), true);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method644("npc.idx", null), true);
		anInt563 = local19.method470();
		anIntArray152 = new int[anInt563];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt563; local29++) {
			anIntArray152[local29] = local27;
			local27 += local19.method470();
		}
		aClass11Array1 = new Class11[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass11Array1[local49] = new Class11();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public static void method305() {
		try {
			aClass39_6 = null;
			anIntArray152 = null;
			aClass11Array1 = null;
			aClass1_Sub1_Sub3_8 = null;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("52710, " + 7 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Lclient!fc;")
	public static Class11 method306(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass11Array1[local1].aLong19 == (long) arg0) {
				return aClass11Array1[local1];
			}
		}
		anInt564 = (anInt564 + 1) % 20;
		@Pc(33) Class11 local33 = aClass11Array1[anInt564] = new Class11();
		aClass1_Sub1_Sub3_8.anInt777 = anIntArray152[arg0];
		local33.aLong19 = arg0;
		local33.method307(aClass1_Sub1_Sub3_8);
		return local33;
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	private Class11() {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!mb;)V")
	private void method307(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method468();
				if (local14 == 0) {
					return;
				}
				@Pc(23) int local23;
				@Pc(29) int local29;
				if (local14 == 1) {
					local23 = arg0.method468();
					this.anIntArray153 = new int[local23];
					for (local29 = 0; local29 < local23; local29++) {
						this.anIntArray153[local29] = arg0.method470();
					}
				} else if (local14 == 2) {
					this.aString25 = arg0.method475();
				} else if (local14 == 3) {
					this.aByteArray5 = arg0.method476();
				} else if (local14 == 12) {
					this.aByte31 = arg0.method469();
				} else if (local14 == 13) {
					this.anInt565 = arg0.method470();
				} else if (local14 == 14) {
					this.anInt566 = arg0.method470();
				} else if (local14 == 16) {
					this.aBoolean114 = true;
				} else if (local14 == 17) {
					this.anInt566 = arg0.method470();
					this.anInt567 = arg0.method470();
					this.anInt568 = arg0.method470();
					this.anInt569 = arg0.method470();
				} else if (local14 >= 30 && local14 < 40) {
					if (this.aStringArray8 == null) {
						this.aStringArray8 = new String[5];
					}
					this.aStringArray8[local14 - 30] = arg0.method475();
					if (this.aStringArray8[local14 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray8[local14 - 30] = null;
					}
				} else if (local14 == 40) {
					local23 = arg0.method468();
					this.anIntArray155 = new int[local23];
					this.anIntArray156 = new int[local23];
					for (local29 = 0; local29 < local23; local29++) {
						this.anIntArray155[local29] = arg0.method470();
						this.anIntArray156[local29] = arg0.method470();
					}
				} else if (local14 == 60) {
					local23 = arg0.method468();
					this.anIntArray154 = new int[local23];
					for (local29 = 0; local29 < local23; local29++) {
						this.anIntArray154[local29] = arg0.method470();
					}
				} else if (local14 == 90) {
					this.anInt570 = arg0.method470();
				} else if (local14 == 91) {
					this.anInt571 = arg0.method470();
				} else if (local14 == 92) {
					this.anInt572 = arg0.method470();
				} else if (local14 == 93) {
					this.aBoolean115 = false;
				} else if (local14 == 95) {
					this.anInt573 = arg0.method470();
				} else if (local14 == 97) {
					this.anInt574 = arg0.method470();
				} else if (local14 == 98) {
					this.anInt575 = arg0.method470();
				}
			}
		} catch (@Pc(281) RuntimeException local281) {
			signlink.reporterror("54103, " + 3251 + ", " + arg0 + ", " + local281.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZ[I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			@Pc(13) Class1_Sub1_Sub1_Sub5 local13 = (Class1_Sub1_Sub1_Sub5) aClass39_6.method609(this.aLong19);
			if (local13 == null) {
				@Pc(17) boolean local17 = false;
				for (@Pc(19) int local19 = 0; local19 < this.anIntArray153.length; local19++) {
					if (!Class1_Sub1_Sub1_Sub5.method280(this.anIntArray153[local19])) {
						local17 = true;
					}
				}
				if (local17) {
					return null;
				}
				@Pc(44) Class1_Sub1_Sub1_Sub5[] local44 = new Class1_Sub1_Sub1_Sub5[this.anIntArray153.length];
				for (@Pc(46) int local46 = 0; local46 < this.anIntArray153.length; local46++) {
					local44[local46] = Class1_Sub1_Sub1_Sub5.method279(this.anIntArray153[local46], this.anInt562);
				}
				if (local44.length == 1) {
					local13 = local44[0];
				} else {
					local13 = new Class1_Sub1_Sub1_Sub5(local44.length, local44, (byte) 4);
				}
				if (this.anIntArray155 != null) {
					for (@Pc(87) int local87 = 0; local87 < this.anIntArray155.length; local87++) {
						local13.method293(this.anIntArray155[local87], this.anIntArray156[local87]);
					}
				}
				local13.method286();
				local13.method296(64, 850, -30, -50, -30, true);
				aClass39_6.method610(local13, this.aLong19);
			}
			@Pc(124) Class1_Sub1_Sub1_Sub5 local124 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local124.method281(local13, !this.aBoolean114);
			if (arg1 != -1 && arg0 != -1) {
				local124.method288(arg0, arg1, arg2);
			} else if (arg1 != -1) {
				local124.method287(arg1);
			}
			if (this.anInt574 != 128 || this.anInt575 != 128) {
				local124.method295(this.anInt575, this.anInt574, this.anInt574);
			}
			local124.method283();
			local124.anIntArrayArray8 = null;
			local124.anIntArrayArray7 = null;
			if (this.aByte31 == 1) {
				local124.aBoolean111 = true;
			}
			return local124;
		} catch (@Pc(191) RuntimeException local191) {
			signlink.reporterror("38560, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local191.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method309(@OriginalArg(0) int arg0) {
		try {
			if (this.anIntArray154 == null) {
				return null;
			}
			@Pc(8) boolean local8 = false;
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray154.length; local14++) {
				if (!Class1_Sub1_Sub1_Sub5.method280(this.anIntArray154[local14])) {
					local8 = true;
				}
			}
			if (local8) {
				return null;
			}
			@Pc(39) Class1_Sub1_Sub1_Sub5[] local39 = new Class1_Sub1_Sub1_Sub5[this.anIntArray154.length];
			for (@Pc(41) int local41 = 0; local41 < this.anIntArray154.length; local41++) {
				local39[local41] = Class1_Sub1_Sub1_Sub5.method279(this.anIntArray154[local41], this.anInt562);
			}
			@Pc(67) Class1_Sub1_Sub1_Sub5 local67;
			if (local39.length == 1) {
				local67 = local39[0];
			} else {
				local67 = new Class1_Sub1_Sub1_Sub5(local39.length, local39, (byte) 4);
			}
			if (this.anIntArray155 != null) {
				for (@Pc(82) int local82 = 0; local82 < this.anIntArray155.length; local82++) {
					local67.method293(this.anIntArray155[local82], this.anIntArray156[local82]);
				}
			}
			return local67;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("93603, " + arg0 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}
}
