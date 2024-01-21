import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class Class9 {

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	private static int anInt511;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	private static int anInt512;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "[I")
	private static int[] anIntArray116;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "[Lclient!ec;")
	private static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
	private static int anInt513;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "[Lclient!fb;")
	private static Class1_Sub1_Sub1_Sub5[] aClass1_Sub1_Sub1_Sub5Array1 = new Class1_Sub1_Sub1_Sub5[4];

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "Lclient!t;")
	public static Class42 aClass42_4 = new Class42(0, 500);

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "Lclient!t;")
	public static Class42 aClass42_5 = new Class42(0, 30);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	private int anInt510;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "[I")
	private int[] anIntArray118;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "[I")
	private int[] anIntArray119;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "[I")
	private int[] anIntArray120;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
	public int anInt515;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	public int anInt516;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "Z")
	public boolean aBoolean111;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Z")
	public boolean aBoolean112;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Z")
	public boolean aBoolean113;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "Z")
	private boolean aBoolean114;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
	private boolean aBoolean115;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Z")
	public boolean aBoolean116;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
	public int anInt517;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
	public int anInt518;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "B")
	private byte aByte18;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "B")
	private byte aByte19;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray7;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
	public int anInt519;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
	public int anInt520;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "Z")
	private boolean aBoolean117;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "Z")
	public boolean aBoolean118;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
	private int anInt521;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
	private int anInt522;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
	private int anInt523;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
	private int anInt524;

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
	private int anInt525;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
	public int anInt527;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "Z")
	public boolean aBoolean119;

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "Z")
	private boolean aBoolean120;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
	private int anInt528;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
	private int anInt514 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method256(@OriginalArg(0) Class48 arg0) {
		aClass1_Sub1_Sub3_5 = new Class1_Sub1_Sub3(arg0.method678("loc.dat", null), 337);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method678("loc.idx", null), 337);
		anInt512 = local19.method500();
		anIntArray116 = new int[anInt512];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt512; local29++) {
			anIntArray116[local29] = local27;
			local27 += local19.method500();
		}
		aClass9Array1 = new Class9[10];
		for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
			aClass9Array1[local49] = new Class9();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
	public static void method257() {
		try {
			aClass42_4 = null;
			aClass42_5 = null;
			anIntArray116 = null;
			aClass9Array1 = null;
			aClass1_Sub1_Sub3_5 = null;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("75161, " + false + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lclient!ec;")
	public static Class9 method258(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass9Array1[local1].anInt514 == arg0) {
				return aClass9Array1[local1];
			}
		}
		anInt513 = (anInt513 + 1) % 10;
		@Pc(27) Class9 local27 = aClass9Array1[anInt513];
		aClass1_Sub1_Sub3_5.anInt768 = anIntArray116[arg0];
		local27.anInt514 = arg0;
		local27.method259();
		local27.method260(aClass1_Sub1_Sub3_5);
		return local27;
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	private Class9() {
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
	private void method259() {
		this.anIntArray117 = null;
		this.anIntArray118 = null;
		this.aString24 = null;
		this.aByteArray4 = null;
		this.anIntArray119 = null;
		this.anIntArray120 = null;
		this.anInt515 = 1;
		this.anInt516 = 1;
		this.aBoolean111 = true;
		this.aBoolean112 = true;
		this.aBoolean113 = false;
		this.aBoolean114 = false;
		this.aBoolean115 = false;
		this.aBoolean116 = false;
		this.anInt517 = -1;
		this.anInt518 = 16;
		this.aByte18 = 0;
		this.aByte19 = 0;
		this.aStringArray7 = null;
		this.anInt519 = -1;
		this.anInt520 = -1;
		this.aBoolean117 = false;
		this.aBoolean118 = true;
		this.anInt521 = 128;
		this.anInt522 = 128;
		this.anInt523 = 128;
		this.anInt527 = 0;
		this.anInt524 = 0;
		this.anInt525 = 0;
		this.anInt526 = 0;
		this.aBoolean119 = false;
		this.aBoolean120 = false;
		this.anInt528 = -1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!mb;)V")
	private void method260(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(19) int local19;
				@Pc(31) int local31;
				do {
					while (true) {
						@Pc(11) int local11 = arg0.method498();
						if (local11 == 0) {
							if (local3 == -1) {
								this.aBoolean113 = false;
								if (this.anIntArray117 != null && (this.anIntArray118 == null || this.anIntArray118[0] == 10)) {
									this.aBoolean113 = true;
								}
								if (this.aStringArray7 != null) {
									this.aBoolean113 = true;
								}
							}
							if (this.aBoolean120) {
								this.aBoolean111 = false;
								this.aBoolean112 = false;
							}
							if (this.anInt528 == -1) {
								this.anInt528 = this.aBoolean111 ? 1 : 0;
								return;
							}
							return;
						}
						if (local11 == 1) {
							local19 = arg0.method498();
							break;
						}
						if (local11 == 2) {
							this.aString24 = arg0.method505();
						} else if (local11 == 3) {
							this.aByteArray4 = arg0.method506();
						} else if (local11 == 5) {
							local19 = arg0.method498();
							if (local19 > 0) {
								this.anIntArray118 = null;
								this.anIntArray117 = new int[local19];
								for (local31 = 0; local31 < local19; local31++) {
									this.anIntArray117[local31] = arg0.method500();
								}
							}
						} else if (local11 == 14) {
							this.anInt515 = arg0.method498();
						} else if (local11 == 15) {
							this.anInt516 = arg0.method498();
						} else if (local11 == 17) {
							this.aBoolean111 = false;
						} else if (local11 == 18) {
							this.aBoolean112 = false;
						} else if (local11 == 19) {
							local3 = arg0.method498();
							if (local3 == 1) {
								this.aBoolean113 = true;
							}
						} else if (local11 == 21) {
							this.aBoolean114 = true;
						} else if (local11 == 22) {
							this.aBoolean115 = true;
						} else if (local11 == 23) {
							this.aBoolean116 = true;
						} else if (local11 == 24) {
							this.anInt517 = arg0.method500();
							if (this.anInt517 == 65535) {
								this.anInt517 = -1;
							}
						} else if (local11 == 28) {
							this.anInt518 = arg0.method498();
						} else if (local11 == 29) {
							this.aByte18 = arg0.method499();
						} else if (local11 == 39) {
							this.aByte19 = arg0.method499();
						} else if (local11 >= 30 && local11 < 39) {
							if (this.aStringArray7 == null) {
								this.aStringArray7 = new String[5];
							}
							this.aStringArray7[local11 - 30] = arg0.method505();
							if (this.aStringArray7[local11 - 30].equalsIgnoreCase("hidden")) {
								this.aStringArray7[local11 - 30] = null;
							}
						} else if (local11 == 40) {
							local19 = arg0.method498();
							this.anIntArray119 = new int[local19];
							this.anIntArray120 = new int[local19];
							for (local31 = 0; local31 < local19; local31++) {
								this.anIntArray119[local31] = arg0.method500();
								this.anIntArray120[local31] = arg0.method500();
							}
						} else if (local11 == 60) {
							this.anInt519 = arg0.method500();
						} else if (local11 == 62) {
							this.aBoolean117 = true;
						} else if (local11 == 64) {
							this.aBoolean118 = false;
						} else if (local11 == 65) {
							this.anInt521 = arg0.method500();
						} else if (local11 == 66) {
							this.anInt522 = arg0.method500();
						} else if (local11 == 67) {
							this.anInt523 = arg0.method500();
						} else if (local11 == 68) {
							this.anInt520 = arg0.method500();
						} else if (local11 == 69) {
							this.anInt527 = arg0.method498();
						} else if (local11 == 70) {
							this.anInt524 = arg0.method501();
						} else if (local11 == 71) {
							this.anInt525 = arg0.method501();
						} else if (local11 == 72) {
							this.anInt526 = arg0.method501();
						} else if (local11 == 73) {
							this.aBoolean119 = true;
						} else if (local11 == 74) {
							this.aBoolean120 = true;
						} else if (local11 == 75) {
							this.anInt528 = arg0.method498();
						}
					}
				} while (local19 <= 0);
				this.anIntArray118 = new int[local19];
				this.anIntArray117 = new int[local19];
				for (local31 = 0; local31 < local19; local31++) {
					this.anIntArray117[local31] = arg0.method500();
					this.anIntArray118[local31] = arg0.method498();
				}
			}
		} catch (@Pc(463) RuntimeException local463) {
			signlink.reporterror("24069, " + 0 + ", " + arg0 + ", " + local463.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
	public boolean method261(@OriginalArg(0) int arg0) {
		try {
			if (this.anIntArray118 != null) {
				for (@Pc(45) int local45 = 0; local45 < this.anIntArray118.length; local45++) {
					if (this.anIntArray118[local45] == arg0) {
						return Class1_Sub1_Sub1_Sub5.method289(this.anIntArray117[local45] & 0xFFFF);
					}
				}
				return true;
			} else if (this.anIntArray117 == null) {
				return true;
			} else if (arg0 == 10) {
				@Pc(21) boolean local21 = true;
				for (@Pc(23) int local23 = 0; local23 < this.anIntArray117.length; local23++) {
					local21 &= Class1_Sub1_Sub1_Sub5.method289(this.anIntArray117[local23] & 0xFFFF);
				}
				return local21;
			} else {
				return true;
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("3330, " + arg0 + ", " + 150 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Z")
	public boolean method262() {
		try {
			if (this.anIntArray117 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray117.length; local15++) {
				local6 &= Class1_Sub1_Sub1_Sub5.method289(this.anIntArray117[local15] & 0xFFFF);
			}
			return local6;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("93976, " + 28 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!vb;Z)V")
	public void method263(@OriginalArg(0) Class45_Sub1 arg0) {
		try {
			if (this.anIntArray117 != null) {
				for (@Pc(5) int local5 = 0; local5 < this.anIntArray117.length; local5++) {
					arg0.method662(0, this.anIntArray117[local5] & 0xFFFF);
				}
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("69503, " + arg0 + ", " + true + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = this.method265(arg6, arg1, arg0);
		if (local6 == null) {
			return null;
		}
		if (this.aBoolean114 || this.aBoolean115) {
			local6 = new Class1_Sub1_Sub1_Sub5(this.aBoolean114, 962, local6, this.aBoolean115);
		}
		if (this.aBoolean114) {
			@Pc(39) int local39 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (@Pc(41) int local41 = 0; local41 < local6.anInt538; local41++) {
				@Pc(48) int local48 = local6.anIntArray125[local41];
				@Pc(53) int local53 = local6.anIntArray127[local41];
				@Pc(65) int local65 = arg2 + (arg3 - arg2) * (local48 + 64) / 128;
				@Pc(77) int local77 = arg5 + (arg4 - arg5) * (local48 + 64) / 128;
				@Pc(89) int local89 = local65 + (local77 - local65) * (local53 + 64) / 128;
				local6.anIntArray126[local41] += local89 - local39;
			}
			local6.method293();
		}
		return local6;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)Lclient!fb;")
	private Class1_Sub1_Sub1_Sub5 method265(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(9) Class1_Sub1_Sub1_Sub5 local9 = null;
			@Pc(32) long local32;
			@Pc(56) boolean local56;
			@Pc(62) int local62;
			@Pc(176) Class1_Sub1_Sub1_Sub5 local176;
			if (this.anIntArray118 == null) {
				if (arg2 != 10) {
					return null;
				}
				local32 = (long) ((this.anInt514 << 6) + arg1) + ((long) (arg0 + 1) << 32);
				@Pc(37) Class1_Sub1_Sub1_Sub5 local37 = (Class1_Sub1_Sub1_Sub5) aClass42_5.method641(local32);
				if (local37 != null) {
					return local37;
				}
				if (this.anIntArray117 == null) {
					return null;
				}
				local56 = this.aBoolean117 ^ arg1 > 3;
				@Pc(60) int local60 = this.anIntArray117.length;
				for (local62 = 0; local62 < local60; local62++) {
					@Pc(68) int local68 = this.anIntArray117[local62];
					if (local56) {
						local68 += 65536;
					}
					local9 = (Class1_Sub1_Sub1_Sub5) aClass42_4.method641((long) local68);
					if (local9 == null) {
						local9 = Class1_Sub1_Sub1_Sub5.method288(local68 & 0xFFFF);
						if (local9 == null) {
							return null;
						}
						if (local56) {
							local9.method303();
						}
						aClass42_4.method642((long) local68, local9);
					}
					if (local60 > 1) {
						aClass1_Sub1_Sub1_Sub5Array1[local62] = local9;
					}
				}
				if (local60 > 1) {
					local9 = new Class1_Sub1_Sub1_Sub5((byte) 1, local60, aClass1_Sub1_Sub1_Sub5Array1);
				}
			} else {
				@Pc(127) int local127 = -1;
				for (@Pc(129) int local129 = 0; local129 < this.anIntArray118.length; local129++) {
					if (this.anIntArray118[local129] == arg2) {
						local127 = local129;
						break;
					}
				}
				if (local127 == -1) {
					return null;
				}
				local32 = (long) ((this.anInt514 << 6) + (local127 << 3) + arg1) + ((long) (arg0 + 1) << 32);
				local176 = (Class1_Sub1_Sub1_Sub5) aClass42_5.method641(local32);
				if (local176 != null) {
					return local176;
				}
				local62 = this.anIntArray117[local127];
				@Pc(195) boolean local195 = this.aBoolean117 ^ arg1 > 3;
				if (local195) {
					local62 += 65536;
				}
				local9 = (Class1_Sub1_Sub1_Sub5) aClass42_4.method641((long) local62);
				if (local9 == null) {
					local9 = Class1_Sub1_Sub1_Sub5.method288(local62 & 0xFFFF);
					if (local9 == null) {
						return null;
					}
					if (local195) {
						local9.method303();
					}
					aClass42_4.method642((long) local62, local9);
				}
			}
			@Pc(244) boolean local244;
			if (this.anInt521 == 128 && this.anInt522 == 128 && this.anInt523 == 128) {
				local244 = false;
			} else {
				local244 = true;
			}
			if (this.anInt524 == 0 && this.anInt525 == 0 && this.anInt526 == 0) {
				local56 = false;
			} else {
				local56 = true;
			}
			local176 = new Class1_Sub1_Sub1_Sub5(23727, Class14.method328(arg0), this.anIntArray119 == null, local9, arg1 == 0 && arg0 == -1 && !local244 && !local56);
			if (arg0 != -1) {
				local176.method295();
				local176.method296(arg0);
				local176.anIntArrayArray8 = null;
				local176.anIntArrayArray7 = null;
			}
			while (arg1-- > 0) {
				local176.method299((byte) 4);
			}
			if (this.anIntArray119 != null) {
				for (local62 = 0; local62 < this.anIntArray119.length; local62++) {
					local176.method302(this.anIntArray119[local62], this.anIntArray120[local62]);
				}
			}
			if (local244) {
				local176.method304(this.anInt523, this.anInt522, this.anInt521);
			}
			if (local56) {
				local176.method301(this.anInt524, this.anInt525, this.anInt526);
			}
			local176.method305(this.aByte18 + 64, this.aByte19 * 5 + 768, -50, -10, -50, !this.aBoolean115);
			if (this.anInt528 == 1) {
				local176.anInt550 = local176.anInt560;
			}
			aClass42_5.method642(local32, local176);
			return local176;
		} catch (@Pc(396) RuntimeException local396) {
			signlink.reporterror("18413, " + arg0 + ", " + 3 + ", " + arg1 + ", " + arg2 + ", " + local396.toString());
			throw new RuntimeException();
		}
	}
}
