import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class Class9 {

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Z")
	private static boolean aBoolean93;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	private static int anInt514;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "[I")
	private static int[] anIntArray106;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "[Lclient!ec;")
	private static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
	private static int anInt515;

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "Lclient!t;")
	public static Class39 aClass39_4 = new Class39(5, 500);

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "Lclient!t;")
	public static Class39 aClass39_5 = new Class39(5, 30);

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	private int anInt512;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "[I")
	private int[] anIntArray107;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "[I")
	private int[] anIntArray110;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
	public int anInt517;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
	public int anInt518;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Z")
	public boolean aBoolean94;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "Z")
	public boolean aBoolean95;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
	public boolean aBoolean96;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Z")
	private boolean aBoolean97;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Z")
	private boolean aBoolean98;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "Z")
	public boolean aBoolean99;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
	public int anInt519;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
	public int anInt520;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "B")
	private byte aByte29;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "B")
	private byte aByte30;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray7;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "Z")
	private boolean aBoolean100;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
	public int anInt521;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
	public int anInt522;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "Z")
	private boolean aBoolean101;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "Z")
	public boolean aBoolean102;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
	private int anInt523;

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
	private int anInt524;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
	private int anInt525;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
	private int anInt528;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
	public int anInt529;

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "Z")
	public boolean aBoolean103;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Z")
	private boolean aBoolean92 = true;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	private int anInt511 = -797;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	private int anInt513 = -45277;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
	private int anInt516 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method248(@OriginalArg(0) Class45 arg0) {
		aClass1_Sub1_Sub3_5 = new Class1_Sub1_Sub3(arg0.method644("loc.dat", null), true);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method644("loc.idx", null), true);
		anInt514 = local19.method470();
		anIntArray106 = new int[anInt514];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt514; local29++) {
			anIntArray106[local29] = local27;
			local27 += local19.method470();
		}
		aClass9Array1 = new Class9[10];
		for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
			aClass9Array1[local49] = new Class9();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method249() {
		try {
			aClass39_4 = null;
			aClass39_5 = null;
			anIntArray106 = null;
			aClass9Array1 = null;
			aClass1_Sub1_Sub3_5 = null;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("88860, " + 7 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lclient!ec;")
	public static Class9 method250(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass9Array1[local1].anInt516 == arg0) {
				return aClass9Array1[local1];
			}
		}
		anInt515 = (anInt515 + 1) % 10;
		@Pc(27) Class9 local27 = aClass9Array1[anInt515];
		aClass1_Sub1_Sub3_5.anInt777 = anIntArray106[arg0];
		local27.anInt516 = arg0;
		local27.method251();
		local27.method252(aClass1_Sub1_Sub3_5);
		return local27;
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	private Class9() {
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
	private void method251() {
		this.anIntArray107 = null;
		this.anIntArray108 = null;
		this.aString24 = null;
		this.aByteArray4 = null;
		this.anIntArray109 = null;
		this.anIntArray110 = null;
		this.anInt517 = 1;
		this.anInt518 = 1;
		this.aBoolean94 = true;
		this.aBoolean95 = true;
		this.aBoolean96 = false;
		this.aBoolean97 = false;
		this.aBoolean98 = false;
		this.aBoolean99 = false;
		this.anInt519 = -1;
		this.anInt520 = 16;
		this.aByte29 = 0;
		this.aByte30 = 0;
		this.aStringArray7 = null;
		this.aBoolean100 = false;
		this.anInt521 = -1;
		this.anInt522 = -1;
		this.aBoolean101 = false;
		this.aBoolean102 = true;
		this.anInt523 = 128;
		this.anInt524 = 128;
		this.anInt525 = 128;
		this.anInt529 = 0;
		this.anInt526 = 0;
		this.anInt527 = 0;
		this.anInt528 = 0;
		this.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!mb;)V")
	private void method252(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				while (true) {
					@Pc(16) int local16 = arg0.method468();
					if (local16 == 0) {
						if (this.anIntArray108 == null) {
							this.anIntArray108 = new int[0];
						}
						if (local3 == -1) {
							this.aBoolean96 = false;
							if (this.anIntArray108.length > 0 && this.anIntArray108[0] == 10) {
								this.aBoolean96 = true;
							}
							if (this.aStringArray7 != null) {
								this.aBoolean96 = true;
								return;
							}
						}
						return;
					}
					@Pc(24) int local24;
					@Pc(34) int local34;
					if (local16 == 1) {
						local24 = arg0.method468();
						this.anIntArray108 = new int[local24];
						this.anIntArray107 = new int[local24];
						for (local34 = 0; local34 < local24; local34++) {
							this.anIntArray107[local34] = arg0.method470();
							this.anIntArray108[local34] = arg0.method468();
						}
					} else if (local16 == 2) {
						this.aString24 = arg0.method475();
					} else if (local16 == 3) {
						this.aByteArray4 = arg0.method476();
					} else if (local16 == 14) {
						this.anInt517 = arg0.method468();
					} else if (local16 == 15) {
						this.anInt518 = arg0.method468();
					} else if (local16 == 17) {
						this.aBoolean94 = false;
					} else if (local16 == 18) {
						this.aBoolean95 = false;
					} else if (local16 == 19) {
						local3 = arg0.method468();
						if (local3 == 1) {
							this.aBoolean96 = true;
						}
					} else if (local16 == 21) {
						this.aBoolean97 = true;
					} else if (local16 == 22) {
						this.aBoolean98 = true;
					} else if (local16 == 23) {
						this.aBoolean99 = true;
					} else if (local16 == 24) {
						this.anInt519 = arg0.method470();
						if (this.anInt519 == 65535) {
							this.anInt519 = -1;
						}
					} else if (local16 == 25) {
						this.aBoolean100 = true;
					} else if (local16 == 28) {
						this.anInt520 = arg0.method468();
					} else if (local16 == 29) {
						this.aByte29 = arg0.method469();
					} else if (local16 == 39) {
						this.aByte30 = arg0.method469();
					} else if (local16 >= 30 && local16 < 39) {
						if (this.aStringArray7 == null) {
							this.aStringArray7 = new String[5];
						}
						this.aStringArray7[local16 - 30] = arg0.method475();
						if (this.aStringArray7[local16 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray7[local16 - 30] = null;
						}
					} else if (local16 == 40) {
						local24 = arg0.method468();
						this.anIntArray109 = new int[local24];
						this.anIntArray110 = new int[local24];
						for (local34 = 0; local34 < local24; local34++) {
							this.anIntArray109[local34] = arg0.method470();
							this.anIntArray110[local34] = arg0.method470();
						}
					} else if (local16 == 60) {
						this.anInt521 = arg0.method470();
					} else if (local16 == 62) {
						this.aBoolean101 = true;
					} else if (local16 == 64) {
						this.aBoolean102 = false;
					} else if (local16 == 65) {
						this.anInt523 = arg0.method470();
					} else if (local16 == 66) {
						this.anInt524 = arg0.method470();
					} else if (local16 == 67) {
						this.anInt525 = arg0.method470();
					} else if (local16 == 68) {
						this.anInt522 = arg0.method470();
					} else if (local16 == 69) {
						this.anInt529 = arg0.method468();
					} else if (local16 == 70) {
						this.anInt526 = arg0.method471();
					} else if (local16 == 71) {
						this.anInt527 = arg0.method471();
					} else if (local16 == 72) {
						this.anInt528 = arg0.method471();
					} else if (local16 == 73) {
						this.aBoolean103 = true;
					}
				}
			}
		} catch (@Pc(410) RuntimeException local410) {
			signlink.reporterror("15857, " + 3251 + ", " + arg0 + ", " + local410.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)Z")
	public boolean method253(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = -1;
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray108.length; local5++) {
				if (this.anIntArray108[local5] == arg0) {
					local3 = local5;
					break;
				}
			}
			if (local3 == -1) {
				return true;
			} else if (this.anIntArray107 == null) {
				return true;
			} else {
				@Pc(45) int local45 = this.anIntArray107[local3];
				return local45 == -1 ? true : Class1_Sub1_Sub1_Sub5.method280(local45 & 0xFFFF);
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("36228, " + arg0 + ", " + 23 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)Z")
	public boolean method254() {
		try {
			@Pc(11) boolean local11 = true;
			if (this.anIntArray107 == null) {
				return true;
			}
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray107.length; local18++) {
				@Pc(25) int local25 = this.anIntArray107[local18];
				if (local25 != -1) {
					local11 &= Class1_Sub1_Sub1_Sub5.method280(local25 & 0xFFFF);
				}
			}
			return local11;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("2363, " + true + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZLclient!vb;)V")
	public void method255(@OriginalArg(1) Class42_Sub1 arg0) {
		try {
			if (this.anIntArray107 != null) {
				for (@Pc(5) int local5 = 0; local5 < this.anIntArray107.length; local5++) {
					@Pc(12) int local12 = this.anIntArray107[local5];
					if (local12 != -1) {
						arg0.method628(0, local12 & 0xFFFF);
					}
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("55057, " + false + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = 0; local5 < this.anIntArray108.length; local5++) {
			if (this.anIntArray108[local5] == arg0) {
				local3 = local5;
				break;
			}
		}
		if (local3 == -1) {
			return null;
		}
		@Pc(47) long local47 = (long) ((this.anInt516 << 6) + (local3 << 3) + arg1) + ((long) (arg6 + 1) << 32);
		if (aBoolean93) {
			local47 = 0L;
		}
		@Pc(56) Class1_Sub1_Sub1_Sub5 local56 = (Class1_Sub1_Sub1_Sub5) aClass39_5.method609(local47);
		@Pc(92) int local92;
		@Pc(142) int local142;
		if (local56 == null) {
			if (this.anIntArray107 == null || local3 >= this.anIntArray107.length) {
				return null;
			}
			local92 = this.anIntArray107[local3];
			if (local92 == -1) {
				return null;
			}
			@Pc(192) boolean local192 = this.aBoolean101 ^ arg1 > 3;
			if (local192) {
				local92 += 65536;
			}
			@Pc(204) Class1_Sub1_Sub1_Sub5 local204 = (Class1_Sub1_Sub1_Sub5) aClass39_4.method609((long) local92);
			if (local204 == null) {
				local204 = Class1_Sub1_Sub1_Sub5.method279(local92 & 0xFFFF, this.anInt511);
				if (local204 == null) {
					return null;
				}
				if (local192) {
					local204.method294();
				}
				aClass39_4.method610(local204, (long) local92);
			}
			@Pc(242) boolean local242;
			if (this.anInt523 == 128 && this.anInt524 == 128 && this.anInt525 == 128) {
				local242 = false;
			} else {
				local242 = true;
			}
			@Pc(257) boolean local257;
			if (this.anInt526 == 0 && this.anInt527 == 0 && this.anInt528 == 0) {
				local257 = false;
			} else {
				local257 = true;
			}
			@Pc(291) Class1_Sub1_Sub1_Sub5 local291 = new Class1_Sub1_Sub1_Sub5(-435, this.anIntArray109 == null, arg1 == 0 && arg6 == -1 && !local242 && !local257, local204, !this.aBoolean100);
			if (arg6 != -1) {
				local291.method286();
				local291.method287(arg6);
				local291.anIntArrayArray8 = null;
				local291.anIntArrayArray7 = null;
			}
			while (arg1-- > 0) {
				local291.method290();
			}
			if (this.anIntArray109 != null) {
				for (local142 = 0; local142 < this.anIntArray109.length; local142++) {
					local291.method293(this.anIntArray109[local142], this.anIntArray110[local142]);
				}
			}
			if (local242) {
				local291.method295(this.anInt524, this.anInt523, this.anInt525);
			}
			if (local257) {
				local291.method292(this.anInt527, this.anInt513, this.anInt526, this.anInt528);
			}
			local291.method296(this.aByte29 + 64, this.aByte30 * 5 + 768, -50, -10, -50, !this.aBoolean98);
			if (this.aBoolean94) {
				local291.anInt555 = local291.anInt579;
			}
			aClass39_5.method610(local291, local47);
			if (this.aBoolean97 || this.aBoolean98) {
				local291 = new Class1_Sub1_Sub1_Sub5(local291, this.aBoolean97, this.aBoolean98, this.anInt512);
			}
			if (this.aBoolean97) {
				local142 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (@Pc(426) int local426 = 0; local426 < local291.anInt543; local426++) {
					@Pc(433) int local433 = local291.anIntArray115[local426];
					@Pc(438) int local438 = local291.anIntArray117[local426];
					@Pc(450) int local450 = arg2 + (arg3 - arg2) * (local433 + 64) / 128;
					@Pc(462) int local462 = arg5 + (arg4 - arg5) * (local433 + 64) / 128;
					@Pc(474) int local474 = local450 + (local462 - local450) * (local438 + 64) / 128;
					local291.anIntArray116[local426] += local474 - local142;
				}
				local291.method284();
			}
			return local291;
		} else if (aBoolean93) {
			return local56;
		} else {
			if (this.aBoolean97 || this.aBoolean98) {
				local56 = new Class1_Sub1_Sub1_Sub5(local56, this.aBoolean97, this.aBoolean98, this.anInt512);
			}
			if (this.aBoolean97) {
				local92 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (@Pc(94) int local94 = 0; local94 < local56.anInt543; local94++) {
					@Pc(101) int local101 = local56.anIntArray115[local94];
					@Pc(106) int local106 = local56.anIntArray117[local94];
					@Pc(118) int local118 = arg2 + (arg3 - arg2) * (local101 + 64) / 128;
					@Pc(130) int local130 = arg5 + (arg4 - arg5) * (local101 + 64) / 128;
					local142 = local118 + (local130 - local118) * (local106 + 64) / 128;
					local56.anIntArray116[local94] += local142 - local92;
				}
				local56.method284();
			}
			return local56;
		}
	}
}
