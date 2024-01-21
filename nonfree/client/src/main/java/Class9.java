import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class Class9 {

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Z")
	private static boolean aBoolean87;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	private static int anInt517;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
	private static int[] anIntArray106;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "[Lclient!ec;")
	private static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	private static int anInt518;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	private static int anInt516 = 451;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "Lclient!t;")
	public static Class39 aClass39_4 = new Class39(false, 500);

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "Lclient!t;")
	public static Class39 aClass39_5 = new Class39(false, 30);

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "[I")
	private int[] anIntArray107;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "[I")
	private int[] anIntArray110;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
	public int anInt520;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	public int anInt521;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "Z")
	public boolean aBoolean88;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Z")
	public boolean aBoolean89;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Z")
	public boolean aBoolean90;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "Z")
	private boolean aBoolean91;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
	private boolean aBoolean92;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Z")
	public boolean aBoolean93;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
	public int anInt522;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
	public int anInt523;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "B")
	private byte aByte8;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "B")
	private byte aByte9;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray7;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "Z")
	private boolean aBoolean94;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
	public int anInt524;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
	public int anInt525;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "Z")
	private boolean aBoolean95;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "Z")
	public boolean aBoolean96;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
	private int anInt528;

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
	private int anInt529;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
	private int anInt530;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
	private int anInt531;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
	public int anInt532;

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "Z")
	public boolean aBoolean97;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
	private int anInt519 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method247(@OriginalArg(0) Class45 arg0) {
		aClass1_Sub1_Sub3_5 = new Class1_Sub1_Sub3(699, arg0.method639("loc.dat", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(699, arg0.method639("loc.idx", null));
		anInt517 = local19.method469();
		anIntArray106 = new int[anInt517];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt517; local29++) {
			anIntArray106[local29] = local27;
			local27 += local19.method469();
		}
		aClass9Array1 = new Class9[10];
		for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
			aClass9Array1[local49] = new Class9();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
	public static void method248() {
		try {
			aClass39_4 = null;
			aClass39_5 = null;
			anIntArray106 = null;
			aClass9Array1 = null;
			aClass1_Sub1_Sub3_5 = null;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("97299, " + true + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lclient!ec;")
	public static Class9 method249(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass9Array1[local1].anInt519 == arg0) {
				return aClass9Array1[local1];
			}
		}
		anInt518 = (anInt518 + 1) % 10;
		@Pc(27) Class9 local27 = aClass9Array1[anInt518];
		aClass1_Sub1_Sub3_5.anInt771 = anIntArray106[arg0];
		local27.anInt519 = arg0;
		local27.method250();
		local27.method251(aClass1_Sub1_Sub3_5);
		return local27;
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	private Class9() {
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
	private void method250() {
		this.anIntArray107 = null;
		this.anIntArray108 = null;
		this.aString23 = null;
		this.aByteArray4 = null;
		this.anIntArray109 = null;
		this.anIntArray110 = null;
		this.anInt520 = 1;
		this.anInt521 = 1;
		this.aBoolean88 = true;
		this.aBoolean89 = true;
		this.aBoolean90 = false;
		this.aBoolean91 = false;
		this.aBoolean92 = false;
		this.aBoolean93 = false;
		this.anInt522 = -1;
		this.anInt523 = 16;
		this.aByte8 = 0;
		this.aByte9 = 0;
		this.aStringArray7 = null;
		this.aBoolean94 = false;
		this.anInt524 = -1;
		this.anInt525 = -1;
		this.aBoolean95 = false;
		this.aBoolean96 = true;
		this.anInt526 = 128;
		this.anInt527 = 128;
		this.anInt528 = 128;
		this.anInt532 = 0;
		this.anInt529 = 0;
		this.anInt530 = 0;
		this.anInt531 = 0;
		this.aBoolean97 = false;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZLclient!mb;)V")
	private void method251(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(9) int local9 = -1;
			while (true) {
				while (true) {
					@Pc(12) int local12 = arg0.method467();
					if (local12 == 0) {
						if (this.anIntArray108 == null) {
							this.anIntArray108 = new int[0];
						}
						if (local9 == -1) {
							this.aBoolean90 = false;
							if (this.anIntArray108.length > 0 && this.anIntArray108[0] == 10) {
								this.aBoolean90 = true;
							}
							if (this.aStringArray7 != null) {
								this.aBoolean90 = true;
								return;
							}
						}
						return;
					}
					@Pc(20) int local20;
					@Pc(30) int local30;
					if (local12 == 1) {
						local20 = arg0.method467();
						this.anIntArray108 = new int[local20];
						this.anIntArray107 = new int[local20];
						for (local30 = 0; local30 < local20; local30++) {
							this.anIntArray107[local30] = arg0.method469();
							this.anIntArray108[local30] = arg0.method467();
						}
					} else if (local12 == 2) {
						this.aString23 = arg0.method474();
					} else if (local12 == 3) {
						this.aByteArray4 = arg0.method475();
					} else if (local12 == 14) {
						this.anInt520 = arg0.method467();
					} else if (local12 == 15) {
						this.anInt521 = arg0.method467();
					} else if (local12 == 17) {
						this.aBoolean88 = false;
					} else if (local12 == 18) {
						this.aBoolean89 = false;
					} else if (local12 == 19) {
						local9 = arg0.method467();
						if (local9 == 1) {
							this.aBoolean90 = true;
						}
					} else if (local12 == 21) {
						this.aBoolean91 = true;
					} else if (local12 == 22) {
						this.aBoolean92 = true;
					} else if (local12 == 23) {
						this.aBoolean93 = true;
					} else if (local12 == 24) {
						this.anInt522 = arg0.method469();
						if (this.anInt522 == 65535) {
							this.anInt522 = -1;
						}
					} else if (local12 == 25) {
						this.aBoolean94 = true;
					} else if (local12 == 28) {
						this.anInt523 = arg0.method467();
					} else if (local12 == 29) {
						this.aByte8 = arg0.method468();
					} else if (local12 == 39) {
						this.aByte9 = arg0.method468();
					} else if (local12 >= 30 && local12 < 39) {
						if (this.aStringArray7 == null) {
							this.aStringArray7 = new String[5];
						}
						this.aStringArray7[local12 - 30] = arg0.method474();
						if (this.aStringArray7[local12 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray7[local12 - 30] = null;
						}
					} else if (local12 == 40) {
						local20 = arg0.method467();
						this.anIntArray109 = new int[local20];
						this.anIntArray110 = new int[local20];
						for (local30 = 0; local30 < local20; local30++) {
							this.anIntArray109[local30] = arg0.method469();
							this.anIntArray110[local30] = arg0.method469();
						}
					} else if (local12 == 60) {
						this.anInt524 = arg0.method469();
					} else if (local12 == 62) {
						this.aBoolean95 = true;
					} else if (local12 == 64) {
						this.aBoolean96 = false;
					} else if (local12 == 65) {
						this.anInt526 = arg0.method469();
					} else if (local12 == 66) {
						this.anInt527 = arg0.method469();
					} else if (local12 == 67) {
						this.anInt528 = arg0.method469();
					} else if (local12 == 68) {
						this.anInt525 = arg0.method469();
					} else if (local12 == 69) {
						this.anInt532 = arg0.method467();
					} else if (local12 == 70) {
						this.anInt529 = arg0.method470();
					} else if (local12 == 71) {
						this.anInt530 = arg0.method470();
					} else if (local12 == 72) {
						this.anInt531 = arg0.method470();
					} else if (local12 == 73) {
						this.aBoolean97 = true;
					}
				}
			}
		} catch (@Pc(406) RuntimeException local406) {
			signlink.reporterror("74120, " + false + ", " + arg0 + ", " + local406.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)Z")
	public boolean method252(@OriginalArg(0) int arg0) {
		try {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray108.length; local15++) {
				if (this.anIntArray108[local15] == arg0) {
					local13 = local15;
					break;
				}
			}
			if (local13 == -1) {
				return true;
			} else if (this.anIntArray107 == null) {
				return true;
			} else {
				@Pc(48) int local48 = this.anIntArray107[local13];
				return local48 == -1 ? true : Class1_Sub1_Sub1_Sub5.method279(local48 & 0xFFFF);
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("69104, " + arg0 + ", " + false + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Z")
	public boolean method253() {
		try {
			@Pc(1) boolean local1 = true;
			if (this.anIntArray107 == null) {
				return true;
			}
			for (@Pc(8) int local8 = 0; local8 < this.anIntArray107.length; local8++) {
				@Pc(15) int local15 = this.anIntArray107[local8];
				if (local15 != -1) {
					local1 &= Class1_Sub1_Sub1_Sub5.method279(local15 & 0xFFFF);
				}
			}
			return local1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("92889, " + -16491 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!vb;I)V")
	public void method254(@OriginalArg(0) Class42_Sub1 arg0) {
		try {
			if (this.anIntArray107 != null) {
				for (@Pc(5) int local5 = 0; local5 < this.anIntArray107.length; local5++) {
					@Pc(12) int local12 = this.anIntArray107[local5];
					if (local12 != -1) {
						arg0.method627(0, local12 & 0xFFFF);
					}
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("9430, " + arg0 + ", " + 0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
		@Pc(47) long local47 = (long) ((this.anInt519 << 6) + (local3 << 3) + arg1) + ((long) (arg6 + 1) << 32);
		if (aBoolean87) {
			local47 = 0L;
		}
		@Pc(56) Class1_Sub1_Sub1_Sub5 local56 = (Class1_Sub1_Sub1_Sub5) aClass39_5.method608(local47);
		@Pc(91) int local91;
		@Pc(141) int local141;
		if (local56 == null) {
			if (this.anIntArray107 == null || local3 >= this.anIntArray107.length) {
				return null;
			}
			local91 = this.anIntArray107[local3];
			if (local91 == -1) {
				return null;
			}
			@Pc(191) boolean local191 = this.aBoolean95 ^ arg1 > 3;
			if (local191) {
				local91 += 65536;
			}
			@Pc(203) Class1_Sub1_Sub1_Sub5 local203 = (Class1_Sub1_Sub1_Sub5) aClass39_4.method608((long) local91);
			if (local203 == null) {
				local203 = Class1_Sub1_Sub1_Sub5.method278(local91 & 0xFFFF);
				if (local203 == null) {
					return null;
				}
				if (local191) {
					local203.method293();
				}
				aClass39_4.method609((long) local91, local203);
			}
			@Pc(240) boolean local240;
			if (this.anInt526 == 128 && this.anInt527 == 128 && this.anInt528 == 128) {
				local240 = false;
			} else {
				local240 = true;
			}
			@Pc(255) boolean local255;
			if (this.anInt529 == 0 && this.anInt530 == 0 && this.anInt531 == 0) {
				local255 = false;
			} else {
				local255 = true;
			}
			@Pc(289) Class1_Sub1_Sub1_Sub5 local289 = new Class1_Sub1_Sub1_Sub5(8, this.anIntArray109 == null, !this.aBoolean94, arg1 == 0 && arg6 == -1 && !local240 && !local255, local203);
			if (arg6 != -1) {
				local289.method285();
				local289.method286(arg6);
				local289.anIntArrayArray8 = null;
				local289.anIntArrayArray7 = null;
			}
			while (arg1-- > 0) {
				local289.method289();
			}
			if (this.anIntArray109 != null) {
				for (local141 = 0; local141 < this.anIntArray109.length; local141++) {
					local289.method292(this.anIntArray109[local141], this.anIntArray110[local141]);
				}
			}
			if (local240) {
				local289.method294(this.anInt526, this.anInt528, this.anInt527);
			}
			if (local255) {
				local289.method291(this.anInt530, this.anInt529, this.anInt531);
			}
			local289.method295(this.aByte8 + 64, this.aByte9 * 5 + 768, -50, -10, -50, !this.aBoolean92);
			if (this.aBoolean88) {
				local289.anInt556 = local289.anInt579;
			}
			aClass39_5.method609(local47, local289);
			if (this.aBoolean91 || this.aBoolean92) {
				local289 = new Class1_Sub1_Sub1_Sub5(this.aBoolean92, this.aBoolean91, local289, -591);
			}
			if (this.aBoolean91) {
				local141 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (@Pc(422) int local422 = 0; local422 < local289.anInt544; local422++) {
					@Pc(429) int local429 = local289.anIntArray115[local422];
					@Pc(434) int local434 = local289.anIntArray117[local422];
					@Pc(446) int local446 = arg2 + (arg3 - arg2) * (local429 + 64) / 128;
					@Pc(458) int local458 = arg5 + (arg4 - arg5) * (local429 + 64) / 128;
					@Pc(470) int local470 = local446 + (local458 - local446) * (local434 + 64) / 128;
					local289.anIntArray116[local422] += local470 - local141;
				}
				local289.method283();
			}
			return local289;
		} else if (aBoolean87) {
			return local56;
		} else {
			if (this.aBoolean91 || this.aBoolean92) {
				local56 = new Class1_Sub1_Sub1_Sub5(this.aBoolean92, this.aBoolean91, local56, -591);
			}
			if (this.aBoolean91) {
				local91 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (@Pc(93) int local93 = 0; local93 < local56.anInt544; local93++) {
					@Pc(100) int local100 = local56.anIntArray115[local93];
					@Pc(105) int local105 = local56.anIntArray117[local93];
					@Pc(117) int local117 = arg2 + (arg3 - arg2) * (local100 + 64) / 128;
					@Pc(129) int local129 = arg5 + (arg4 - arg5) * (local100 + 64) / 128;
					local141 = local117 + (local129 - local117) * (local105 + 64) / 128;
					local56.anIntArray116[local93] += local141 - local91;
				}
				local56.method283();
			}
			return local56;
		}
	}
}
