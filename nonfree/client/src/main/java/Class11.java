import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fc")
public final class Class11 {

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	private static int anInt517;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "[I")
	private static int[] anIntArray155;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "[Lclient!fc;")
	private static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
	private static int anInt518;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "[Lclient!eb;")
	private static Class1_Sub1_Sub1_Sub5[] aClass1_Sub1_Sub1_Sub5Array1 = new Class1_Sub1_Sub1_Sub5[4];

	@OriginalMember(owner = "client!fc", name = "R", descriptor = "Lclient!s;")
	public static Class39 aClass39_4 = new Class39(500, false);

	@OriginalMember(owner = "client!fc", name = "S", descriptor = "Lclient!s;")
	public static Class39 aClass39_5 = new Class39(30, false);

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
	private int anInt516;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
	public int anInt520;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
	public int anInt521;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "Z")
	public boolean aBoolean120;

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "Z")
	public boolean aBoolean121;

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "Z")
	public boolean aBoolean122;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "Z")
	public boolean aBoolean123;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "Z")
	private boolean aBoolean124;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "Z")
	public boolean aBoolean125;

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
	public int anInt522;

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
	public int anInt523;

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "B")
	private byte aByte22;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "B")
	private byte aByte23;

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray8;

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
	public int anInt524;

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
	public int anInt525;

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "Z")
	private boolean aBoolean126;

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "Z")
	public boolean aBoolean127;

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
	private int anInt528;

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
	private int anInt529;

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
	private int anInt530;

	@OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
	private int anInt531;

	@OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
	public int anInt532;

	@OriginalMember(owner = "client!fc", name = "O", descriptor = "Z")
	public boolean aBoolean128;

	@OriginalMember(owner = "client!fc", name = "P", descriptor = "Z")
	private boolean aBoolean129;

	@OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
	private int anInt533;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Z")
	private boolean aBoolean118 = false;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	private int anInt519 = -1;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method290(@OriginalArg(0) Class48 arg0) {
		aClass1_Sub1_Sub3_5 = new Class1_Sub1_Sub3(arg0.method689("loc.dat", null), true);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method689("loc.idx", null), true);
		anInt517 = local19.method505();
		anIntArray155 = new int[anInt517];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt517; local29++) {
			anIntArray155[local29] = local27;
			local27 += local19.method505();
		}
		aClass11Array1 = new Class11[10];
		for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
			aClass11Array1[local49] = new Class11();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method291() {
		try {
			aClass39_4 = null;
			aClass39_5 = null;
			anIntArray155 = null;
			aClass11Array1 = null;
			aClass1_Sub1_Sub3_5 = null;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("63789, " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Lclient!fc;")
	public static Class11 method292(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass11Array1[local1].anInt519 == arg0) {
				return aClass11Array1[local1];
			}
		}
		anInt518 = (anInt518 + 1) % 10;
		@Pc(27) Class11 local27 = aClass11Array1[anInt518];
		aClass1_Sub1_Sub3_5.anInt766 = anIntArray155[arg0];
		local27.anInt519 = arg0;
		local27.method293();
		local27.method294(aClass1_Sub1_Sub3_5);
		return local27;
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	private Class11() {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "()V")
	private void method293() {
		this.anIntArray156 = null;
		this.anIntArray157 = null;
		this.aString23 = null;
		this.aByteArray4 = null;
		this.anIntArray158 = null;
		this.anIntArray159 = null;
		this.anInt520 = 1;
		this.anInt521 = 1;
		this.aBoolean120 = true;
		this.aBoolean121 = true;
		this.aBoolean122 = false;
		this.aBoolean123 = false;
		this.aBoolean124 = false;
		this.aBoolean125 = false;
		this.anInt522 = -1;
		this.anInt523 = 16;
		this.aByte22 = 0;
		this.aByte23 = 0;
		this.aStringArray8 = null;
		this.anInt524 = -1;
		this.anInt525 = -1;
		this.aBoolean126 = false;
		this.aBoolean127 = true;
		this.anInt526 = 128;
		this.anInt527 = 128;
		this.anInt528 = 128;
		this.anInt532 = 0;
		this.anInt529 = 0;
		this.anInt530 = 0;
		this.anInt531 = 0;
		this.aBoolean128 = false;
		this.aBoolean129 = false;
		this.anInt533 = -1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!mb;)V")
	private void method294(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(10) int local10 = -1;
			while (true) {
				@Pc(21) int local21;
				@Pc(33) int local33;
				do {
					while (true) {
						@Pc(13) int local13 = arg0.method503();
						if (local13 == 0) {
							if (local10 == -1) {
								this.aBoolean122 = false;
								if (this.anIntArray156 != null && (this.anIntArray157 == null || this.anIntArray157[0] == 10)) {
									this.aBoolean122 = true;
								}
								if (this.aStringArray8 != null) {
									this.aBoolean122 = true;
								}
							}
							if (this.aBoolean129) {
								this.aBoolean120 = false;
								this.aBoolean121 = false;
							}
							if (this.anInt533 == -1) {
								this.anInt533 = this.aBoolean120 ? 1 : 0;
								return;
							}
							return;
						}
						if (local13 == 1) {
							local21 = arg0.method503();
							break;
						}
						if (local13 == 2) {
							this.aString23 = arg0.method510();
						} else if (local13 == 3) {
							this.aByteArray4 = arg0.method511();
						} else if (local13 == 5) {
							local21 = arg0.method503();
							if (local21 > 0) {
								this.anIntArray157 = null;
								this.anIntArray156 = new int[local21];
								for (local33 = 0; local33 < local21; local33++) {
									this.anIntArray156[local33] = arg0.method505();
								}
							}
						} else if (local13 == 14) {
							this.anInt520 = arg0.method503();
						} else if (local13 == 15) {
							this.anInt521 = arg0.method503();
						} else if (local13 == 17) {
							this.aBoolean120 = false;
						} else if (local13 == 18) {
							this.aBoolean121 = false;
						} else if (local13 == 19) {
							local10 = arg0.method503();
							if (local10 == 1) {
								this.aBoolean122 = true;
							}
						} else if (local13 == 21) {
							this.aBoolean123 = true;
						} else if (local13 == 22) {
							this.aBoolean124 = true;
						} else if (local13 == 23) {
							this.aBoolean125 = true;
						} else if (local13 == 24) {
							this.anInt522 = arg0.method505();
							if (this.anInt522 == 65535) {
								this.anInt522 = -1;
							}
						} else if (local13 == 28) {
							this.anInt523 = arg0.method503();
						} else if (local13 == 29) {
							this.aByte22 = arg0.method504();
						} else if (local13 == 39) {
							this.aByte23 = arg0.method504();
						} else if (local13 >= 30 && local13 < 39) {
							if (this.aStringArray8 == null) {
								this.aStringArray8 = new String[5];
							}
							this.aStringArray8[local13 - 30] = arg0.method510();
							if (this.aStringArray8[local13 - 30].equalsIgnoreCase("hidden")) {
								this.aStringArray8[local13 - 30] = null;
							}
						} else if (local13 == 40) {
							local21 = arg0.method503();
							this.anIntArray158 = new int[local21];
							this.anIntArray159 = new int[local21];
							for (local33 = 0; local33 < local21; local33++) {
								this.anIntArray158[local33] = arg0.method505();
								this.anIntArray159[local33] = arg0.method505();
							}
						} else if (local13 == 60) {
							this.anInt524 = arg0.method505();
						} else if (local13 == 62) {
							this.aBoolean126 = true;
						} else if (local13 == 64) {
							this.aBoolean127 = false;
						} else if (local13 == 65) {
							this.anInt526 = arg0.method505();
						} else if (local13 == 66) {
							this.anInt527 = arg0.method505();
						} else if (local13 == 67) {
							this.anInt528 = arg0.method505();
						} else if (local13 == 68) {
							this.anInt525 = arg0.method505();
						} else if (local13 == 69) {
							this.anInt532 = arg0.method503();
						} else if (local13 == 70) {
							this.anInt529 = arg0.method506();
						} else if (local13 == 71) {
							this.anInt530 = arg0.method506();
						} else if (local13 == 72) {
							this.anInt531 = arg0.method506();
						} else if (local13 == 73) {
							this.aBoolean128 = true;
						} else if (local13 == 74) {
							this.aBoolean129 = true;
						} else if (local13 == 75) {
							this.anInt533 = arg0.method503();
						}
					}
				} while (local21 <= 0);
				this.anIntArray157 = new int[local21];
				this.anIntArray156 = new int[local21];
				for (local33 = 0; local33 < local21; local33++) {
					this.anIntArray156[local33] = arg0.method505();
					this.anIntArray157[local33] = arg0.method503();
				}
			}
		} catch (@Pc(465) RuntimeException local465) {
			signlink.reporterror("43871, " + 44 + ", " + arg0 + ", " + local465.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z")
	public boolean method295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) int local5;
			if (arg0 != 0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			if (this.anIntArray157 != null) {
				for (local5 = 0; local5 < this.anIntArray157.length; local5++) {
					if (this.anIntArray157[local5] == arg1) {
						return Class1_Sub1_Sub1_Sub5.method257(this.anIntArray156[local5] & 0xFFFF);
					}
				}
				return true;
			} else if (this.anIntArray156 == null) {
				return true;
			} else if (arg1 == 10) {
				@Pc(25) boolean local25 = true;
				for (@Pc(27) int local27 = 0; local27 < this.anIntArray156.length; local27++) {
					local25 &= Class1_Sub1_Sub1_Sub5.method257(this.anIntArray156[local27] & 0xFFFF);
				}
				return local25;
			} else {
				return true;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("19042, " + arg0 + ", " + arg1 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)Z")
	public boolean method296() {
		try {
			if (this.anIntArray156 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(8) int local8 = 0; local8 < this.anIntArray156.length; local8++) {
				local6 &= Class1_Sub1_Sub1_Sub5.method257(this.anIntArray156[local8] & 0xFFFF);
			}
			return local6;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("88208, " + true + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLclient!vb;)V")
	public void method297(@OriginalArg(1) Class45_Sub1 arg0) {
		try {
			if (this.anIntArray156 != null) {
				for (@Pc(7) int local7 = 0; local7 < this.anIntArray156.length; local7++) {
					arg0.method674(0, this.anIntArray156[local7] & 0xFFFF);
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("11484, " + false + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIII)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = this.method299(arg1, arg0, arg6);
		if (local6 == null) {
			return null;
		}
		if (this.aBoolean123 || this.aBoolean124) {
			local6 = new Class1_Sub1_Sub1_Sub5(this.aBoolean123, this.aBoolean124, local6, 144);
		}
		if (this.aBoolean123) {
			@Pc(39) int local39 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (@Pc(41) int local41 = 0; local41 < local6.anInt481; local41++) {
				@Pc(48) int local48 = local6.anIntArray106[local41];
				@Pc(53) int local53 = local6.anIntArray108[local41];
				@Pc(65) int local65 = arg2 + (arg3 - arg2) * (local48 + 64) / 128;
				@Pc(77) int local77 = arg5 + (arg4 - arg5) * (local48 + 64) / 128;
				@Pc(89) int local89 = local65 + (local77 - local65) * (local53 + 64) / 128;
				local6.anIntArray107[local41] += local89 - local39;
			}
			local6.method261();
		}
		return local6;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = null;
			@Pc(38) long local38;
			@Pc(62) boolean local62;
			@Pc(68) int local68;
			@Pc(182) Class1_Sub1_Sub1_Sub5 local182;
			if (this.anIntArray157 == null) {
				if (arg1 != 10) {
					return null;
				}
				local38 = (long) ((this.anInt519 << 6) + arg0) + ((long) (arg2 + 1) << 32);
				@Pc(43) Class1_Sub1_Sub1_Sub5 local43 = (Class1_Sub1_Sub1_Sub5) aClass39_5.method604(local38);
				if (local43 != null) {
					return local43;
				}
				if (this.anIntArray156 == null) {
					return null;
				}
				local62 = this.aBoolean126 ^ arg0 > 3;
				@Pc(66) int local66 = this.anIntArray156.length;
				for (local68 = 0; local68 < local66; local68++) {
					@Pc(74) int local74 = this.anIntArray156[local68];
					if (local62) {
						local74 += 65536;
					}
					local3 = (Class1_Sub1_Sub1_Sub5) aClass39_4.method604((long) local74);
					if (local3 == null) {
						local3 = Class1_Sub1_Sub1_Sub5.method256(local74 & 0xFFFF, 196);
						if (local3 == null) {
							return null;
						}
						if (local62) {
							local3.method271();
						}
						aClass39_4.method605(local3, (long) local74);
					}
					if (local66 > 1) {
						aClass1_Sub1_Sub1_Sub5Array1[local68] = local3;
					}
				}
				if (local66 > 1) {
					local3 = new Class1_Sub1_Sub1_Sub5(172, aClass1_Sub1_Sub1_Sub5Array1, local66);
				}
			} else {
				@Pc(133) int local133 = -1;
				for (@Pc(135) int local135 = 0; local135 < this.anIntArray157.length; local135++) {
					if (this.anIntArray157[local135] == arg1) {
						local133 = local135;
						break;
					}
				}
				if (local133 == -1) {
					return null;
				}
				local38 = (long) ((this.anInt519 << 6) + (local133 << 3) + arg0) + ((long) (arg2 + 1) << 32);
				local182 = (Class1_Sub1_Sub1_Sub5) aClass39_5.method604(local38);
				if (local182 != null) {
					return local182;
				}
				local68 = this.anIntArray156[local133];
				@Pc(201) boolean local201 = this.aBoolean126 ^ arg0 > 3;
				if (local201) {
					local68 += 65536;
				}
				local3 = (Class1_Sub1_Sub1_Sub5) aClass39_4.method604((long) local68);
				if (local3 == null) {
					local3 = Class1_Sub1_Sub1_Sub5.method256(local68 & 0xFFFF, 196);
					if (local3 == null) {
						return null;
					}
					if (local201) {
						local3.method271();
					}
					aClass39_4.method605(local3, (long) local68);
				}
			}
			@Pc(250) boolean local250;
			if (this.anInt526 == 128 && this.anInt527 == 128 && this.anInt528 == 128) {
				local250 = false;
			} else {
				local250 = true;
			}
			if (this.anInt529 == 0 && this.anInt530 == 0 && this.anInt531 == 0) {
				local62 = false;
			} else {
				local62 = true;
			}
			local182 = new Class1_Sub1_Sub1_Sub5(arg0 == 0 && arg2 == -1 && !local250 && !local62, -164, local3, this.anIntArray158 == null, Class12.method304(arg2));
			if (arg2 != -1) {
				local182.method263(this.anInt516);
				local182.method264(arg2);
				local182.anIntArrayArray9 = null;
				local182.anIntArrayArray8 = null;
			}
			while (arg0-- > 0) {
				local182.method267();
			}
			if (this.anIntArray158 != null) {
				for (local68 = 0; local68 < this.anIntArray158.length; local68++) {
					local182.method270(this.anIntArray158[local68], this.anIntArray159[local68]);
				}
			}
			if (local250) {
				local182.method272(this.anInt526, this.anInt528, this.anInt527);
			}
			if (local62) {
				local182.method269(this.anInt530, this.anInt529, this.anInt531);
			}
			local182.method273(this.aByte22 + 64, this.aByte23 * 5 + 768, -50, -10, -50, !this.aBoolean124);
			if (this.anInt533 == 1) {
				local182.anInt493 = local182.anInt992;
			}
			aClass39_5.method605(local182, local38);
			return local182;
		} catch (@Pc(403) RuntimeException local403) {
			signlink.reporterror("98442, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local403.toString());
			throw new RuntimeException();
		}
	}
}
