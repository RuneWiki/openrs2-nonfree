import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class Class9 {

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	private static int anInt530;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
	private static int[] anIntArray116;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "[Lclient!ec;")
	private static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
	private static int anInt531;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "[Lclient!fb;")
	private static Class1_Sub1_Sub1_Sub5[] aClass1_Sub1_Sub1_Sub5Array1 = new Class1_Sub1_Sub1_Sub5[4];

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "Lclient!t;")
	public static Class42 aClass42_4 = new Class42(0, 500);

	@OriginalMember(owner = "client!ec", name = "T", descriptor = "Lclient!t;")
	public static Class42 aClass42_5 = new Class42(0, 30);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	private int anInt528;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	private int anInt529;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "[I")
	private int[] anIntArray118;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "[I")
	private int[] anIntArray119;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "[I")
	private int[] anIntArray120;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
	public int anInt533;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
	public int anInt534;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Z")
	public boolean aBoolean114;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "Z")
	public boolean aBoolean115;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
	public boolean aBoolean116;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Z")
	private boolean aBoolean117;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Z")
	private boolean aBoolean118;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "Z")
	public boolean aBoolean119;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
	public int anInt535;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
	public int anInt536;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "B")
	private byte aByte31;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "B")
	private byte aByte32;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray7;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
	public int anInt537;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
	public int anInt538;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "Z")
	private boolean aBoolean120;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "Z")
	public boolean aBoolean121;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
	private int anInt539;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
	private int anInt540;

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
	private int anInt541;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
	private int anInt542;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
	private int anInt543;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
	private int anInt544;

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
	public int anInt545;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "Z")
	public boolean aBoolean122;

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "Z")
	private boolean aBoolean123;

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
	private int anInt546;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "B")
	private byte aByte30 = 0;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Z")
	private boolean aBoolean113 = true;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
	private int anInt532 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method256(@OriginalArg(0) Class48 arg0) {
		aClass1_Sub1_Sub3_5 = new Class1_Sub1_Sub3(45427, arg0.method678("loc.dat", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(45427, arg0.method678("loc.idx", null));
		anInt530 = local19.method500();
		anIntArray116 = new int[anInt530];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt530; local29++) {
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
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("7300, " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lclient!ec;")
	public static Class9 method258(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass9Array1[local1].anInt532 == arg0) {
				return aClass9Array1[local1];
			}
		}
		anInt531 = (anInt531 + 1) % 10;
		@Pc(27) Class9 local27 = aClass9Array1[anInt531];
		aClass1_Sub1_Sub3_5.anInt796 = anIntArray116[arg0];
		local27.anInt532 = arg0;
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
		this.anInt533 = 1;
		this.anInt534 = 1;
		this.aBoolean114 = true;
		this.aBoolean115 = true;
		this.aBoolean116 = false;
		this.aBoolean117 = false;
		this.aBoolean118 = false;
		this.aBoolean119 = false;
		this.anInt535 = -1;
		this.anInt536 = 16;
		this.aByte31 = 0;
		this.aByte32 = 0;
		this.aStringArray7 = null;
		this.anInt537 = -1;
		this.anInt538 = -1;
		this.aBoolean120 = false;
		this.aBoolean121 = true;
		this.anInt539 = 128;
		this.anInt540 = 128;
		this.anInt541 = 128;
		this.anInt545 = 0;
		this.anInt542 = 0;
		this.anInt543 = 0;
		this.anInt544 = 0;
		this.aBoolean122 = false;
		this.aBoolean123 = false;
		this.anInt546 = -1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!mb;B)V")
	private void method260(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(21) int local21;
				@Pc(33) int local33;
				do {
					while (true) {
						@Pc(13) int local13 = arg0.method498();
						if (local13 == 0) {
							if (local3 == -1) {
								this.aBoolean116 = false;
								if (this.anIntArray117 != null && (this.anIntArray118 == null || this.anIntArray118[0] == 10)) {
									this.aBoolean116 = true;
								}
								if (this.aStringArray7 != null) {
									this.aBoolean116 = true;
								}
							}
							if (this.aBoolean123) {
								this.aBoolean114 = false;
								this.aBoolean115 = false;
							}
							if (this.anInt546 == -1) {
								this.anInt546 = this.aBoolean114 ? 1 : 0;
								return;
							}
							return;
						}
						if (local13 == 1) {
							local21 = arg0.method498();
							break;
						}
						if (local13 == 2) {
							this.aString24 = arg0.method505();
						} else if (local13 == 3) {
							this.aByteArray4 = arg0.method506();
						} else if (local13 == 5) {
							local21 = arg0.method498();
							if (local21 > 0) {
								this.anIntArray118 = null;
								this.anIntArray117 = new int[local21];
								for (local33 = 0; local33 < local21; local33++) {
									this.anIntArray117[local33] = arg0.method500();
								}
							}
						} else if (local13 == 14) {
							this.anInt533 = arg0.method498();
						} else if (local13 == 15) {
							this.anInt534 = arg0.method498();
						} else if (local13 == 17) {
							this.aBoolean114 = false;
						} else if (local13 == 18) {
							this.aBoolean115 = false;
						} else if (local13 == 19) {
							local3 = arg0.method498();
							if (local3 == 1) {
								this.aBoolean116 = true;
							}
						} else if (local13 == 21) {
							this.aBoolean117 = true;
						} else if (local13 == 22) {
							this.aBoolean118 = true;
						} else if (local13 == 23) {
							this.aBoolean119 = true;
						} else if (local13 == 24) {
							this.anInt535 = arg0.method500();
							if (this.anInt535 == 65535) {
								this.anInt535 = -1;
							}
						} else if (local13 == 28) {
							this.anInt536 = arg0.method498();
						} else if (local13 == 29) {
							this.aByte31 = arg0.method499();
						} else if (local13 == 39) {
							this.aByte32 = arg0.method499();
						} else if (local13 >= 30 && local13 < 39) {
							if (this.aStringArray7 == null) {
								this.aStringArray7 = new String[5];
							}
							this.aStringArray7[local13 - 30] = arg0.method505();
							if (this.aStringArray7[local13 - 30].equalsIgnoreCase("hidden")) {
								this.aStringArray7[local13 - 30] = null;
							}
						} else if (local13 == 40) {
							local21 = arg0.method498();
							this.anIntArray119 = new int[local21];
							this.anIntArray120 = new int[local21];
							for (local33 = 0; local33 < local21; local33++) {
								this.anIntArray119[local33] = arg0.method500();
								this.anIntArray120[local33] = arg0.method500();
							}
						} else if (local13 == 60) {
							this.anInt537 = arg0.method500();
						} else if (local13 == 62) {
							this.aBoolean120 = true;
						} else if (local13 == 64) {
							this.aBoolean121 = false;
						} else if (local13 == 65) {
							this.anInt539 = arg0.method500();
						} else if (local13 == 66) {
							this.anInt540 = arg0.method500();
						} else if (local13 == 67) {
							this.anInt541 = arg0.method500();
						} else if (local13 == 68) {
							this.anInt538 = arg0.method500();
						} else if (local13 == 69) {
							this.anInt545 = arg0.method498();
						} else if (local13 == 70) {
							this.anInt542 = arg0.method501();
						} else if (local13 == 71) {
							this.anInt543 = arg0.method501();
						} else if (local13 == 72) {
							this.anInt544 = arg0.method501();
						} else if (local13 == 73) {
							this.aBoolean122 = true;
						} else if (local13 == 74) {
							this.aBoolean123 = true;
						} else if (local13 == 75) {
							this.anInt546 = arg0.method498();
						}
					}
				} while (local21 <= 0);
				this.anIntArray118 = new int[local21];
				this.anIntArray117 = new int[local21];
				for (local33 = 0; local33 < local21; local33++) {
					this.anIntArray117[local33] = arg0.method500();
					this.anIntArray118[local33] = arg0.method498();
				}
			}
		} catch (@Pc(465) RuntimeException local465) {
			signlink.reporterror("80819, " + arg0 + ", " + 66 + ", " + local465.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
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
			signlink.reporterror("46171, " + 7332 + ", " + arg0 + ", " + local71.toString());
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
			signlink.reporterror("73065, " + 98 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!vb;I)V")
	public void method263(@OriginalArg(0) Class45_Sub1 arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anIntArray117 != null) {
				for (@Pc(5) int local5 = 0; local5 < this.anIntArray117.length; local5++) {
					arg0.method662(this.anInt529, 0, this.anIntArray117[local5] & 0xFFFF);
				}
				if (arg1 != 30492) {
					this.aBoolean113 = !this.aBoolean113;
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("41560, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = this.method265(arg0, arg6, arg1);
		if (local6 == null) {
			return null;
		}
		if (this.aBoolean117 || this.aBoolean118) {
			local6 = new Class1_Sub1_Sub1_Sub5(local6, this.aBoolean118, this.aBoolean117, 0);
		}
		if (this.aBoolean117) {
			@Pc(39) int local39 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (@Pc(41) int local41 = 0; local41 < local6.anInt558; local41++) {
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

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIII)Lclient!fb;")
	private Class1_Sub1_Sub1_Sub5 method265(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = null;
			@Pc(26) long local26;
			@Pc(50) boolean local50;
			@Pc(56) int local56;
			@Pc(170) Class1_Sub1_Sub1_Sub5 local170;
			if (this.anIntArray118 == null) {
				if (arg0 != 10) {
					return null;
				}
				local26 = (long) ((this.anInt532 << 6) + arg2) + ((long) (arg1 + 1) << 32);
				@Pc(31) Class1_Sub1_Sub1_Sub5 local31 = (Class1_Sub1_Sub1_Sub5) aClass42_5.method641(local26);
				if (local31 != null) {
					return local31;
				}
				if (this.anIntArray117 == null) {
					return null;
				}
				local50 = this.aBoolean120 ^ arg2 > 3;
				@Pc(54) int local54 = this.anIntArray117.length;
				for (local56 = 0; local56 < local54; local56++) {
					@Pc(62) int local62 = this.anIntArray117[local56];
					if (local50) {
						local62 += 65536;
					}
					local3 = (Class1_Sub1_Sub1_Sub5) aClass42_4.method641((long) local62);
					if (local3 == null) {
						local3 = Class1_Sub1_Sub1_Sub5.method288(local62 & 0xFFFF);
						if (local3 == null) {
							return null;
						}
						if (local50) {
							local3.method303(923);
						}
						aClass42_4.method642((long) local62, local3);
					}
					if (local54 > 1) {
						aClass1_Sub1_Sub1_Sub5Array1[local56] = local3;
					}
				}
				if (local54 > 1) {
					local3 = new Class1_Sub1_Sub1_Sub5(local54, aClass1_Sub1_Sub1_Sub5Array1, -38792);
				}
			} else {
				@Pc(121) int local121 = -1;
				for (@Pc(123) int local123 = 0; local123 < this.anIntArray118.length; local123++) {
					if (this.anIntArray118[local123] == arg0) {
						local121 = local123;
						break;
					}
				}
				if (local121 == -1) {
					return null;
				}
				local26 = (long) ((this.anInt532 << 6) + (local121 << 3) + arg2) + ((long) (arg1 + 1) << 32);
				local170 = (Class1_Sub1_Sub1_Sub5) aClass42_5.method641(local26);
				if (local170 != null) {
					return local170;
				}
				local56 = this.anIntArray117[local121];
				@Pc(189) boolean local189 = this.aBoolean120 ^ arg2 > 3;
				if (local189) {
					local56 += 65536;
				}
				local3 = (Class1_Sub1_Sub1_Sub5) aClass42_4.method641((long) local56);
				if (local3 == null) {
					local3 = Class1_Sub1_Sub1_Sub5.method288(local56 & 0xFFFF);
					if (local3 == null) {
						return null;
					}
					if (local189) {
						local3.method303(923);
					}
					aClass42_4.method642((long) local56, local3);
				}
			}
			@Pc(238) boolean local238;
			if (this.anInt539 == 128 && this.anInt540 == 128 && this.anInt541 == 128) {
				local238 = false;
			} else {
				local238 = true;
			}
			if (this.anInt542 == 0 && this.anInt543 == 0 && this.anInt544 == 0) {
				local50 = false;
			} else {
				local50 = true;
			}
			local170 = new Class1_Sub1_Sub1_Sub5(Class14.method328((byte) 7, arg1), arg2 == 0 && arg1 == -1 && !local238 && !local50, this.anIntArray119 == null, true, local3);
			if (arg1 != -1) {
				local170.method295();
				local170.method296(this.aByte30, arg1);
				local170.anIntArrayArray8 = null;
				local170.anIntArrayArray7 = null;
			}
			while (arg2-- > 0) {
				local170.method299();
			}
			if (this.anIntArray119 != null) {
				for (local56 = 0; local56 < this.anIntArray119.length; local56++) {
					local170.method302(this.anIntArray119[local56], this.anIntArray120[local56]);
				}
			}
			if (local238) {
				local170.method304(this.anInt541, this.anInt540, this.anInt539);
			}
			if (local50) {
				local170.method301(this.anInt544, this.anInt542, this.anInt543);
			}
			local170.method305(this.aByte31 + 64, this.aByte32 * 5 + 768, -50, -10, -50, !this.aBoolean118);
			if (this.anInt546 == 1) {
				local170.anInt570 = local170.anInt581;
			}
			aClass42_5.method642(local26, local170);
			return local170;
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("84906, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local397.toString());
			throw new RuntimeException();
		}
	}
}
