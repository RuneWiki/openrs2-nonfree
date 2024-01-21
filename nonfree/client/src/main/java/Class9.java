import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class Class9 {

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Z")
	private static boolean aBoolean102;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	private static int anInt520;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "[I")
	private static int[] anIntArray115;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "[Lclient!ec;")
	private static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
	private static int anInt521;

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "Lclient!t;")
	public static Class40 aClass40_4 = new Class40(500, (byte) 3);

	@OriginalMember(owner = "client!ec", name = "T", descriptor = "Lclient!t;")
	public static Class40 aClass40_5 = new Class40(30, (byte) 3);

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "[I")
	private int[] anIntArray116;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "[I")
	private int[] anIntArray118;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "[I")
	private int[] anIntArray119;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
	public int anInt523;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
	public int anInt524;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Z")
	public boolean aBoolean103;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "Z")
	public boolean aBoolean104;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
	public boolean aBoolean105;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Z")
	private boolean aBoolean106;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Z")
	private boolean aBoolean107;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "Z")
	public boolean aBoolean108;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
	public int anInt525;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
	public int anInt526;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "B")
	private byte aByte23;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "B")
	private byte aByte24;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray7;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "Z")
	private boolean aBoolean109;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
	public int anInt527;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
	public int anInt528;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "Z")
	private boolean aBoolean110;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "Z")
	public boolean aBoolean111;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
	private int anInt529;

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
	private int anInt530;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
	private int anInt531;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
	private int anInt532;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
	private int anInt533;

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
	private int anInt534;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
	public int anInt535;

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "Z")
	public boolean aBoolean112;

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "Z")
	private boolean aBoolean113;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	private int anInt518 = 8;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "B")
	private byte aByte22 = 86;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	private int anInt519 = 16146;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
	private int anInt522 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method256(@OriginalArg(0) Class46 arg0) {
		aClass1_Sub1_Sub3_5 = new Class1_Sub1_Sub3(arg0.method674("loc.dat", null), false);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method674("loc.idx", null), false);
		anInt520 = local19.method498();
		anIntArray115 = new int[anInt520];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt520; local29++) {
			anIntArray115[local29] = local27;
			local27 += local19.method498();
		}
		aClass9Array1 = new Class9[10];
		for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
			aClass9Array1[local49] = new Class9();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method257(@OriginalArg(0) byte arg0) {
		try {
			aClass40_4 = null;
			aClass40_5 = null;
			anIntArray115 = null;
			@Pc(10) boolean local10 = false;
			aClass9Array1 = null;
			aClass1_Sub1_Sub3_5 = null;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("53333, " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lclient!ec;")
	public static Class9 method258(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass9Array1[local1].anInt522 == arg0) {
				return aClass9Array1[local1];
			}
		}
		anInt521 = (anInt521 + 1) % 10;
		@Pc(27) Class9 local27 = aClass9Array1[anInt521];
		aClass1_Sub1_Sub3_5.anInt778 = anIntArray115[arg0];
		local27.anInt522 = arg0;
		local27.method259();
		local27.method260(aClass1_Sub1_Sub3_5);
		return local27;
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	private Class9() {
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
	private void method259() {
		this.anIntArray116 = null;
		this.anIntArray117 = null;
		this.aString24 = null;
		this.aByteArray4 = null;
		this.anIntArray118 = null;
		this.anIntArray119 = null;
		this.anInt523 = 1;
		this.anInt524 = 1;
		this.aBoolean103 = true;
		this.aBoolean104 = true;
		this.aBoolean105 = false;
		this.aBoolean106 = false;
		this.aBoolean107 = false;
		this.aBoolean108 = false;
		this.anInt525 = -1;
		this.anInt526 = 16;
		this.aByte23 = 0;
		this.aByte24 = 0;
		this.aStringArray7 = null;
		this.aBoolean109 = false;
		this.anInt527 = -1;
		this.anInt528 = -1;
		this.aBoolean110 = false;
		this.aBoolean111 = true;
		this.anInt529 = 128;
		this.anInt530 = 128;
		this.anInt531 = 128;
		this.anInt535 = 0;
		this.anInt532 = 0;
		this.anInt533 = 0;
		this.anInt534 = 0;
		this.aBoolean112 = false;
		this.aBoolean113 = false;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZLclient!mb;)V")
	private void method260(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				while (true) {
					@Pc(14) int local14 = arg0.method496();
					if (local14 == 0) {
						if (this.anIntArray117 == null) {
							this.anIntArray117 = new int[0];
						}
						if (local3 == -1) {
							this.aBoolean105 = false;
							if (this.anIntArray117.length > 0 && this.anIntArray117[0] == 10) {
								this.aBoolean105 = true;
							}
							if (this.aStringArray7 != null) {
								this.aBoolean105 = true;
							}
						}
						if (this.aBoolean113) {
							this.aBoolean103 = false;
							this.aBoolean104 = false;
							return;
						}
						return;
					}
					@Pc(22) int local22;
					@Pc(32) int local32;
					if (local14 == 1) {
						local22 = arg0.method496();
						this.anIntArray117 = new int[local22];
						this.anIntArray116 = new int[local22];
						for (local32 = 0; local32 < local22; local32++) {
							this.anIntArray116[local32] = arg0.method498();
							this.anIntArray117[local32] = arg0.method496();
						}
					} else if (local14 == 2) {
						this.aString24 = arg0.method503();
					} else if (local14 == 3) {
						this.aByteArray4 = arg0.method504(this.anInt518);
					} else if (local14 == 14) {
						this.anInt523 = arg0.method496();
					} else if (local14 == 15) {
						this.anInt524 = arg0.method496();
					} else if (local14 == 17) {
						this.aBoolean103 = false;
					} else if (local14 == 18) {
						this.aBoolean104 = false;
					} else if (local14 == 19) {
						local3 = arg0.method496();
						if (local3 == 1) {
							this.aBoolean105 = true;
						}
					} else if (local14 == 21) {
						this.aBoolean106 = true;
					} else if (local14 == 22) {
						this.aBoolean107 = true;
					} else if (local14 == 23) {
						this.aBoolean108 = true;
					} else if (local14 == 24) {
						this.anInt525 = arg0.method498();
						if (this.anInt525 == 65535) {
							this.anInt525 = -1;
						}
					} else if (local14 == 25) {
						this.aBoolean109 = true;
					} else if (local14 == 28) {
						this.anInt526 = arg0.method496();
					} else if (local14 == 29) {
						this.aByte23 = arg0.method497();
					} else if (local14 == 39) {
						this.aByte24 = arg0.method497();
					} else if (local14 >= 30 && local14 < 39) {
						if (this.aStringArray7 == null) {
							this.aStringArray7 = new String[5];
						}
						this.aStringArray7[local14 - 30] = arg0.method503();
						if (this.aStringArray7[local14 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray7[local14 - 30] = null;
						}
					} else if (local14 == 40) {
						local22 = arg0.method496();
						this.anIntArray118 = new int[local22];
						this.anIntArray119 = new int[local22];
						for (local32 = 0; local32 < local22; local32++) {
							this.anIntArray118[local32] = arg0.method498();
							this.anIntArray119[local32] = arg0.method498();
						}
					} else if (local14 == 60) {
						this.anInt527 = arg0.method498();
					} else if (local14 == 62) {
						this.aBoolean110 = true;
					} else if (local14 == 64) {
						this.aBoolean111 = false;
					} else if (local14 == 65) {
						this.anInt529 = arg0.method498();
					} else if (local14 == 66) {
						this.anInt530 = arg0.method498();
					} else if (local14 == 67) {
						this.anInt531 = arg0.method498();
					} else if (local14 == 68) {
						this.anInt528 = arg0.method498();
					} else if (local14 == 69) {
						this.anInt535 = arg0.method496();
					} else if (local14 == 70) {
						this.anInt532 = arg0.method499();
					} else if (local14 == 71) {
						this.anInt533 = arg0.method499();
					} else if (local14 == 72) {
						this.anInt534 = arg0.method499();
					} else if (local14 == 73) {
						this.aBoolean112 = true;
					} else if (local14 == 74) {
						this.aBoolean113 = true;
					}
				}
			}
		} catch (@Pc(426) RuntimeException local426) {
			signlink.reporterror("39, " + true + ", " + arg0 + ", " + local426.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)Z")
	public boolean method261(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = -1;
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray117.length; local5++) {
				if (this.anIntArray117[local5] == arg0) {
					local3 = local5;
					break;
				}
			}
			if (local3 == -1) {
				return true;
			} else if (this.anIntArray116 == null) {
				return true;
			} else {
				@Pc(38) int local38 = this.anIntArray116[local3];
				return local38 == -1 ? true : Class1_Sub1_Sub1_Sub5.method288(local38 & 0xFFFF);
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("70085, " + arg0 + ", " + 39 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)Z")
	public boolean method262() {
		try {
			@Pc(3) boolean local3 = true;
			if (this.anIntArray116 == null) {
				return true;
			}
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray116.length; local22++) {
				@Pc(29) int local29 = this.anIntArray116[local22];
				if (local29 != -1) {
					local3 &= Class1_Sub1_Sub1_Sub5.method288(local29 & 0xFFFF);
				}
			}
			return local3;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("42325, " + 0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!vb;I)V")
	public void method263(@OriginalArg(0) Class43_Sub1 arg0) {
		try {
			if (16146 == this.anInt519 && this.anIntArray116 != null) {
				for (@Pc(10) int local10 = 0; local10 < this.anIntArray116.length; local10++) {
					@Pc(17) int local17 = this.anIntArray116[local10];
					if (local17 != -1) {
						arg0.method658(local17 & 0xFFFF, 0);
					}
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("3835, " + arg0 + ", " + 16146 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = 0; local5 < this.anIntArray117.length; local5++) {
			if (this.anIntArray117[local5] == arg0) {
				local3 = local5;
				break;
			}
		}
		if (local3 == -1) {
			return null;
		}
		@Pc(47) long local47 = (long) ((this.anInt522 << 6) + (local3 << 3) + arg1) + ((long) (arg6 + 1) << 32);
		if (aBoolean102) {
			local47 = 0L;
		}
		@Pc(56) Class1_Sub1_Sub1_Sub5 local56 = (Class1_Sub1_Sub1_Sub5) aClass40_5.method637(local47);
		@Pc(91) int local91;
		@Pc(141) int local141;
		if (local56 == null) {
			if (this.anIntArray116 == null || local3 >= this.anIntArray116.length) {
				return null;
			}
			local91 = this.anIntArray116[local3];
			if (local91 == -1) {
				return null;
			}
			@Pc(191) boolean local191 = this.aBoolean110 ^ arg1 > 3;
			if (local191) {
				local91 += 65536;
			}
			@Pc(203) Class1_Sub1_Sub1_Sub5 local203 = (Class1_Sub1_Sub1_Sub5) aClass40_4.method637((long) local91);
			if (local203 == null) {
				local203 = Class1_Sub1_Sub1_Sub5.method287(local91 & 0xFFFF);
				if (local203 == null) {
					return null;
				}
				if (local191) {
					local203.method302(626);
				}
				aClass40_4.method638(local203, (long) local91);
			}
			@Pc(240) boolean local240;
			if (this.anInt529 == 128 && this.anInt530 == 128 && this.anInt531 == 128) {
				local240 = false;
			} else {
				local240 = true;
			}
			@Pc(255) boolean local255;
			if (this.anInt532 == 0 && this.anInt533 == 0 && this.anInt534 == 0) {
				local255 = false;
			} else {
				local255 = true;
			}
			@Pc(289) Class1_Sub1_Sub1_Sub5 local289 = new Class1_Sub1_Sub1_Sub5(this.anIntArray118 == null, local203, arg1 == 0 && arg6 == -1 && !local240 && !local255, true, !this.aBoolean109);
			if (arg6 != -1) {
				local289.method294(this.aByte22);
				local289.method295(arg6);
				local289.anIntArrayArray8 = null;
				local289.anIntArrayArray7 = null;
			}
			while (arg1-- > 0) {
				local289.method298();
			}
			if (this.anIntArray118 != null) {
				for (local141 = 0; local141 < this.anIntArray118.length; local141++) {
					local289.method301(this.anIntArray118[local141], this.anIntArray119[local141]);
				}
			}
			if (local240) {
				local289.method303(this.anInt529, this.anInt531, this.anInt530);
			}
			if (local255) {
				local289.method300(this.anInt532, this.anInt534, this.anInt533);
			}
			local289.method304(this.aByte23 + 64, this.aByte24 * 5 + 768, -50, -10, -50, !this.aBoolean107);
			if (this.aBoolean103) {
				local289.anInt560 = local289.anInt571;
			}
			aClass40_5.method638(local289, local47);
			if (this.aBoolean106 || this.aBoolean107) {
				local289 = new Class1_Sub1_Sub1_Sub5((byte) 22, this.aBoolean106, this.aBoolean107, local289);
			}
			if (this.aBoolean106) {
				local141 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (@Pc(423) int local423 = 0; local423 < local289.anInt548; local423++) {
					@Pc(430) int local430 = local289.anIntArray124[local423];
					@Pc(435) int local435 = local289.anIntArray126[local423];
					@Pc(447) int local447 = arg2 + (arg3 - arg2) * (local430 + 64) / 128;
					@Pc(459) int local459 = arg5 + (arg4 - arg5) * (local430 + 64) / 128;
					@Pc(471) int local471 = local447 + (local459 - local447) * (local435 + 64) / 128;
					local289.anIntArray125[local423] += local471 - local141;
				}
				local289.method292();
			}
			return local289;
		} else if (aBoolean102) {
			return local56;
		} else {
			if (this.aBoolean106 || this.aBoolean107) {
				local56 = new Class1_Sub1_Sub1_Sub5((byte) 22, this.aBoolean106, this.aBoolean107, local56);
			}
			if (this.aBoolean106) {
				local91 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (@Pc(93) int local93 = 0; local93 < local56.anInt548; local93++) {
					@Pc(100) int local100 = local56.anIntArray124[local93];
					@Pc(105) int local105 = local56.anIntArray126[local93];
					@Pc(117) int local117 = arg2 + (arg3 - arg2) * (local100 + 64) / 128;
					@Pc(129) int local129 = arg5 + (arg4 - arg5) * (local100 + 64) / 128;
					local141 = local117 + (local129 - local117) * (local105 + 64) / 128;
					local56.anIntArray125[local93] += local141 - local91;
				}
				local56.method292();
			}
			return local56;
		}
	}
}
