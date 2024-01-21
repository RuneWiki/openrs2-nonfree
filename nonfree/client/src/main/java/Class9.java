import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class Class9 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	private static int anInt517;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
	private static int[] anIntArray116;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "[Lclient!ec;")
	private static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	private static int anInt518;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "[Lclient!fb;")
	private static Class1_Sub1_Sub1_Sub5[] aClass1_Sub1_Sub1_Sub5Array1 = new Class1_Sub1_Sub1_Sub5[4];

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "Lclient!t;")
	public static Class42 aClass42_4 = new Class42(500, 0);

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "Lclient!t;")
	public static Class42 aClass42_5 = new Class42(30, 0);

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "[I")
	private int[] anIntArray118;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "[I")
	private int[] anIntArray119;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "[I")
	private int[] anIntArray120;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	public int anInt520;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
	public int anInt521;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Z")
	public boolean aBoolean118;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Z")
	public boolean aBoolean119;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "Z")
	public boolean aBoolean120;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
	private boolean aBoolean121;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Z")
	private boolean aBoolean122;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Z")
	public boolean aBoolean123;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
	public int anInt522;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
	public int anInt523;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "B")
	private byte aByte18;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "B")
	private byte aByte19;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray8;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
	public int anInt524;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
	public int anInt525;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "Z")
	private boolean aBoolean124;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "Z")
	public boolean aBoolean125;

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
	public boolean aBoolean126;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "Z")
	private boolean aBoolean127;

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
	private int anInt533;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Z")
	private boolean aBoolean117 = true;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "B")
	private byte aByte17 = 67;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	private int anInt516 = -27210;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
	private int anInt519 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method256(@OriginalArg(0) Class48 arg0) {
		aClass1_Sub1_Sub3_5 = new Class1_Sub1_Sub3(16, arg0.method678("loc.dat", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(16, arg0.method678("loc.idx", null));
		anInt517 = local19.method500();
		anIntArray116 = new int[anInt517];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt517; local29++) {
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
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("98119, " + false + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lclient!ec;")
	public static Class9 method258(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass9Array1[local1].anInt519 == arg0) {
				return aClass9Array1[local1];
			}
		}
		anInt518 = (anInt518 + 1) % 10;
		@Pc(27) Class9 local27 = aClass9Array1[anInt518];
		aClass1_Sub1_Sub3_5.anInt776 = anIntArray116[arg0];
		local27.anInt519 = arg0;
		local27.method259();
		local27.method260(891, aClass1_Sub1_Sub3_5);
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
		this.anInt520 = 1;
		this.anInt521 = 1;
		this.aBoolean118 = true;
		this.aBoolean119 = true;
		this.aBoolean120 = false;
		this.aBoolean121 = false;
		this.aBoolean122 = false;
		this.aBoolean123 = false;
		this.anInt522 = -1;
		this.anInt523 = 16;
		this.aByte18 = 0;
		this.aByte19 = 0;
		this.aStringArray8 = null;
		this.anInt524 = -1;
		this.anInt525 = -1;
		this.aBoolean124 = false;
		this.aBoolean125 = true;
		this.anInt526 = 128;
		this.anInt527 = 128;
		this.anInt528 = 128;
		this.anInt532 = 0;
		this.anInt529 = 0;
		this.anInt530 = 0;
		this.anInt531 = 0;
		this.aBoolean126 = false;
		this.aBoolean127 = false;
		this.anInt533 = -1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!mb;)V")
	private void method260(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(3) int local3 = -1;
			@Pc(7) boolean local7 = false;
			while (true) {
				@Pc(18) int local18;
				@Pc(30) int local30;
				do {
					while (true) {
						@Pc(10) int local10 = arg1.method498();
						if (local10 == 0) {
							if (local3 == -1) {
								this.aBoolean120 = false;
								if (this.anIntArray117 != null && (this.anIntArray118 == null || this.anIntArray118[0] == 10)) {
									this.aBoolean120 = true;
								}
								if (this.aStringArray8 != null) {
									this.aBoolean120 = true;
								}
							}
							if (this.aBoolean127) {
								this.aBoolean118 = false;
								this.aBoolean119 = false;
							}
							if (this.anInt533 == -1) {
								this.anInt533 = this.aBoolean118 ? 1 : 0;
								return;
							}
							return;
						}
						if (local10 == 1) {
							local18 = arg1.method498();
							break;
						}
						if (local10 == 2) {
							this.aString24 = arg1.method505();
						} else if (local10 == 3) {
							this.aByteArray4 = arg1.method506();
						} else if (local10 == 5) {
							local18 = arg1.method498();
							if (local18 > 0) {
								this.anIntArray118 = null;
								this.anIntArray117 = new int[local18];
								for (local30 = 0; local30 < local18; local30++) {
									this.anIntArray117[local30] = arg1.method500();
								}
							}
						} else if (local10 == 14) {
							this.anInt520 = arg1.method498();
						} else if (local10 == 15) {
							this.anInt521 = arg1.method498();
						} else if (local10 == 17) {
							this.aBoolean118 = false;
						} else if (local10 == 18) {
							this.aBoolean119 = false;
						} else if (local10 == 19) {
							local3 = arg1.method498();
							if (local3 == 1) {
								this.aBoolean120 = true;
							}
						} else if (local10 == 21) {
							this.aBoolean121 = true;
						} else if (local10 == 22) {
							this.aBoolean122 = true;
						} else if (local10 == 23) {
							this.aBoolean123 = true;
						} else if (local10 == 24) {
							this.anInt522 = arg1.method500();
							if (this.anInt522 == 65535) {
								this.anInt522 = -1;
							}
						} else if (local10 == 28) {
							this.anInt523 = arg1.method498();
						} else if (local10 == 29) {
							this.aByte18 = arg1.method499();
						} else if (local10 == 39) {
							this.aByte19 = arg1.method499();
						} else if (local10 >= 30 && local10 < 39) {
							if (this.aStringArray8 == null) {
								this.aStringArray8 = new String[5];
							}
							this.aStringArray8[local10 - 30] = arg1.method505();
							if (this.aStringArray8[local10 - 30].equalsIgnoreCase("hidden")) {
								this.aStringArray8[local10 - 30] = null;
							}
						} else if (local10 == 40) {
							local18 = arg1.method498();
							this.anIntArray119 = new int[local18];
							this.anIntArray120 = new int[local18];
							for (local30 = 0; local30 < local18; local30++) {
								this.anIntArray119[local30] = arg1.method500();
								this.anIntArray120[local30] = arg1.method500();
							}
						} else if (local10 == 60) {
							this.anInt524 = arg1.method500();
						} else if (local10 == 62) {
							this.aBoolean124 = true;
						} else if (local10 == 64) {
							this.aBoolean125 = false;
						} else if (local10 == 65) {
							this.anInt526 = arg1.method500();
						} else if (local10 == 66) {
							this.anInt527 = arg1.method500();
						} else if (local10 == 67) {
							this.anInt528 = arg1.method500();
						} else if (local10 == 68) {
							this.anInt525 = arg1.method500();
						} else if (local10 == 69) {
							this.anInt532 = arg1.method498();
						} else if (local10 == 70) {
							this.anInt529 = arg1.method501();
						} else if (local10 == 71) {
							this.anInt530 = arg1.method501();
						} else if (local10 == 72) {
							this.anInt531 = arg1.method501();
						} else if (local10 == 73) {
							this.aBoolean126 = true;
						} else if (local10 == 74) {
							this.aBoolean127 = true;
						} else if (local10 == 75) {
							this.anInt533 = arg1.method498();
						}
					}
				} while (local18 <= 0);
				this.anIntArray118 = new int[local18];
				this.anIntArray117 = new int[local18];
				for (local30 = 0; local30 < local18; local30++) {
					this.anIntArray117[local30] = arg1.method500();
					this.anIntArray118[local30] = arg1.method498();
				}
			}
		} catch (@Pc(462) RuntimeException local462) {
			signlink.reporterror("44413, " + arg0 + ", " + arg1 + ", " + local462.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZI)Z")
	public boolean method261(@OriginalArg(1) int arg0) {
		try {
			if (this.anIntArray118 != null) {
				for (@Pc(46) int local46 = 0; local46 < this.anIntArray118.length; local46++) {
					if (this.anIntArray118[local46] == arg0) {
						return Class1_Sub1_Sub1_Sub5.method289(this.anIntArray117[local46] & 0xFFFF);
					}
				}
				return true;
			} else if (this.anIntArray117 == null) {
				return true;
			} else if (arg0 == 10) {
				@Pc(22) boolean local22 = true;
				for (@Pc(24) int local24 = 0; local24 < this.anIntArray117.length; local24++) {
					local22 &= Class1_Sub1_Sub1_Sub5.method289(this.anIntArray117[local24] & 0xFFFF);
				}
				return local22;
			} else {
				return true;
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("42690, " + true + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Z")
	public boolean method262(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 89 / arg0;
			if (this.anIntArray117 == null) {
				return true;
			}
			@Pc(10) boolean local10 = true;
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray117.length; local12++) {
				local10 &= Class1_Sub1_Sub1_Sub5.method289(this.anIntArray117[local12] & 0xFFFF);
			}
			return local10;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("61692, " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!vb;Z)V")
	public void method263(@OriginalArg(0) Class45_Sub1 arg0) {
		try {
			if (this.anIntArray117 != null) {
				for (@Pc(7) int local7 = 0; local7 < this.anIntArray117.length; local7++) {
					arg0.method662(this.anIntArray117[local7] & 0xFFFF, 0);
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("48693, " + arg0 + ", " + true + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = this.method265(arg1, arg0, arg6);
		if (local6 == null) {
			return null;
		}
		if (this.aBoolean121 || this.aBoolean122) {
			local6 = new Class1_Sub1_Sub1_Sub5(local6, this.aBoolean121, 294, this.aBoolean122);
		}
		if (this.aBoolean121) {
			@Pc(39) int local39 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (@Pc(41) int local41 = 0; local41 < local6.anInt548; local41++) {
				@Pc(48) int local48 = local6.anIntArray125[local41];
				@Pc(53) int local53 = local6.anIntArray127[local41];
				@Pc(65) int local65 = arg2 + (arg3 - arg2) * (local48 + 64) / 128;
				@Pc(77) int local77 = arg5 + (arg4 - arg5) * (local48 + 64) / 128;
				@Pc(89) int local89 = local65 + (local77 - local65) * (local53 + 64) / 128;
				local6.anIntArray126[local41] += local89 - local39;
			}
			local6.method293((byte) 6);
		}
		return local6;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)Lclient!fb;")
	private Class1_Sub1_Sub1_Sub5 method265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = null;
			@Pc(31) long local31;
			@Pc(55) boolean local55;
			@Pc(61) int local61;
			@Pc(177) Class1_Sub1_Sub1_Sub5 local177;
			if (this.anIntArray118 == null) {
				if (arg1 != 10) {
					return null;
				}
				local31 = (long) ((this.anInt519 << 6) + arg0) + ((long) (arg2 + 1) << 32);
				@Pc(36) Class1_Sub1_Sub1_Sub5 local36 = (Class1_Sub1_Sub1_Sub5) aClass42_5.method641(local31);
				if (local36 != null) {
					return local36;
				}
				if (this.anIntArray117 == null) {
					return null;
				}
				local55 = this.aBoolean124 ^ arg0 > 3;
				@Pc(59) int local59 = this.anIntArray117.length;
				for (local61 = 0; local61 < local59; local61++) {
					@Pc(67) int local67 = this.anIntArray117[local61];
					if (local55) {
						local67 += 65536;
					}
					local3 = (Class1_Sub1_Sub1_Sub5) aClass42_4.method641((long) local67);
					if (local3 == null) {
						local3 = Class1_Sub1_Sub1_Sub5.method288(this.aBoolean117, local67 & 0xFFFF);
						if (local3 == null) {
							return null;
						}
						if (local55) {
							local3.method303();
						}
						aClass42_4.method642(local3, (long) local67, this.aByte17);
					}
					if (local59 > 1) {
						aClass1_Sub1_Sub1_Sub5Array1[local61] = local3;
					}
				}
				if (local59 > 1) {
					local3 = new Class1_Sub1_Sub1_Sub5(aClass1_Sub1_Sub1_Sub5Array1, local59, (byte) 2);
				}
			} else {
				@Pc(128) int local128 = -1;
				for (@Pc(130) int local130 = 0; local130 < this.anIntArray118.length; local130++) {
					if (this.anIntArray118[local130] == arg1) {
						local128 = local130;
						break;
					}
				}
				if (local128 == -1) {
					return null;
				}
				local31 = (long) ((this.anInt519 << 6) + (local128 << 3) + arg0) + ((long) (arg2 + 1) << 32);
				local177 = (Class1_Sub1_Sub1_Sub5) aClass42_5.method641(local31);
				if (local177 != null) {
					return local177;
				}
				local61 = this.anIntArray117[local128];
				@Pc(196) boolean local196 = this.aBoolean124 ^ arg0 > 3;
				if (local196) {
					local61 += 65536;
				}
				local3 = (Class1_Sub1_Sub1_Sub5) aClass42_4.method641((long) local61);
				if (local3 == null) {
					local3 = Class1_Sub1_Sub1_Sub5.method288(this.aBoolean117, local61 & 0xFFFF);
					if (local3 == null) {
						return null;
					}
					if (local196) {
						local3.method303();
					}
					aClass42_4.method642(local3, (long) local61, this.aByte17);
				}
			}
			@Pc(247) boolean local247;
			if (this.anInt526 == 128 && this.anInt527 == 128 && this.anInt528 == 128) {
				local247 = false;
			} else {
				local247 = true;
			}
			if (this.anInt529 == 0 && this.anInt530 == 0 && this.anInt531 == 0) {
				local55 = false;
			} else {
				local55 = true;
			}
			local177 = new Class1_Sub1_Sub1_Sub5(Class14.method328(arg2), local3, this.anIntArray119 == null, 0, arg0 == 0 && arg2 == -1 && !local247 && !local55);
			if (arg2 != -1) {
				local177.method295();
				local177.method296(arg2);
				local177.anIntArrayArray8 = null;
				local177.anIntArrayArray7 = null;
			}
			while (arg0-- > 0) {
				local177.method299();
			}
			if (this.anIntArray119 != null) {
				for (local61 = 0; local61 < this.anIntArray119.length; local61++) {
					local177.method302(this.anIntArray119[local61], this.anIntArray120[local61]);
				}
			}
			if (local247) {
				local177.method304(this.anInt526, (byte) 9, this.anInt528, this.anInt527);
			}
			if (local55) {
				local177.method301(this.anInt529, this.anInt531, this.anInt530);
			}
			local177.method305(this.aByte18 + 64, this.aByte19 * 5 + 768, -50, -10, -50, !this.aBoolean122);
			if (this.anInt533 == 1) {
				local177.anInt560 = local177.anInt571;
			}
			aClass42_5.method642(local177, local31, this.aByte17);
			return local177;
		} catch (@Pc(400) RuntimeException local400) {
			signlink.reporterror("10863, " + arg0 + ", " + arg1 + ", " + -619 + ", " + arg2 + ", " + local400.toString());
			throw new RuntimeException();
		}
	}
}
