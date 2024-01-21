import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class Class9 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Lclient!client;")
	public static client aClient2;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	private static int anInt478;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "[I")
	private static int[] anIntArray155;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "[Lclient!ec;")
	private static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	private static int anInt479;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "[Lclient!eb;")
	private static Class1_Sub1_Sub1_Sub5[] aClass1_Sub1_Sub1_Sub5Array1 = new Class1_Sub1_Sub1_Sub5[4];

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "Lclient!s;")
	public static Class40 aClass40_4 = new Class40(500, (byte) 1);

	@OriginalMember(owner = "client!ec", name = "T", descriptor = "Lclient!s;")
	public static Class40 aClass40_5 = new Class40(30, (byte) 1);

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
	public int anInt481;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
	public int anInt482;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "Z")
	public boolean aBoolean125;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "Z")
	public boolean aBoolean126;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Z")
	public boolean aBoolean127;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Z")
	public boolean aBoolean128;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "Z")
	private boolean aBoolean129;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
	public boolean aBoolean130;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
	public int anInt483;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
	public int anInt484;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "B")
	private byte aByte15;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "B")
	private byte aByte16;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray8;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
	public int anInt485;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
	public int anInt486;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "Z")
	private boolean aBoolean131;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "Z")
	public boolean aBoolean132;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
	private int anInt487;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
	private int anInt488;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
	private int anInt489;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
	private int anInt490;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
	private int anInt491;

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
	private int anInt492;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
	public int anInt493;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "Z")
	public boolean aBoolean133;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "Z")
	private boolean aBoolean134;

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
	private int anInt494;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "[I")
	public int[] anIntArray160;

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
	public int anInt495;

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
	public int anInt496;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	public int anInt480 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method286(@OriginalArg(0) Class47 arg0) {
		aClass1_Sub1_Sub3_5 = new Class1_Sub1_Sub3(arg0.method666("loc.dat", null), (byte) -93);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method666("loc.idx", null), (byte) -93);
		anInt478 = local19.method482();
		anIntArray155 = new int[anInt478];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt478; local29++) {
			anIntArray155[local29] = local27;
			local27 += local19.method482();
		}
		aClass9Array1 = new Class9[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass9Array1[local49] = new Class9();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
	public static void method287() {
		try {
			aClass40_4 = null;
			aClass40_5 = null;
			anIntArray155 = null;
			aClass9Array1 = null;
			aClass1_Sub1_Sub3_5 = null;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("75661, " + false + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lclient!ec;")
	public static Class9 method288(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass9Array1[local1].anInt480 == arg0) {
				return aClass9Array1[local1];
			}
		}
		anInt479 = (anInt479 + 1) % 20;
		@Pc(27) Class9 local27 = aClass9Array1[anInt479];
		aClass1_Sub1_Sub3_5.anInt720 = anIntArray155[arg0];
		local27.anInt480 = arg0;
		local27.method289();
		local27.method290(aClass1_Sub1_Sub3_5);
		return local27;
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	private Class9() {
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
	private void method289() {
		this.anIntArray156 = null;
		this.anIntArray157 = null;
		this.aString23 = null;
		this.aByteArray4 = null;
		this.anIntArray158 = null;
		this.anIntArray159 = null;
		this.anInt481 = 1;
		this.anInt482 = 1;
		this.aBoolean125 = true;
		this.aBoolean126 = true;
		this.aBoolean127 = false;
		this.aBoolean128 = false;
		this.aBoolean129 = false;
		this.aBoolean130 = false;
		this.anInt483 = -1;
		this.anInt484 = 16;
		this.aByte15 = 0;
		this.aByte16 = 0;
		this.aStringArray8 = null;
		this.anInt485 = -1;
		this.anInt486 = -1;
		this.aBoolean131 = false;
		this.aBoolean132 = true;
		this.anInt487 = 128;
		this.anInt488 = 128;
		this.anInt489 = 128;
		this.anInt493 = 0;
		this.anInt490 = 0;
		this.anInt491 = 0;
		this.anInt492 = 0;
		this.aBoolean133 = false;
		this.aBoolean134 = false;
		this.anInt494 = -1;
		this.anInt495 = -1;
		this.anInt496 = -1;
		this.anIntArray160 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!lb;)V")
	private void method290(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(20) int local20;
				@Pc(32) int local32;
				do {
					while (true) {
						@Pc(12) int local12 = arg0.method480();
						if (local12 == 0) {
							if (local3 == -1) {
								this.aBoolean127 = false;
								if (this.anIntArray156 != null && (this.anIntArray157 == null || this.anIntArray157[0] == 10)) {
									this.aBoolean127 = true;
								}
								if (this.aStringArray8 != null) {
									this.aBoolean127 = true;
								}
							}
							if (this.aBoolean134) {
								this.aBoolean125 = false;
								this.aBoolean126 = false;
							}
							if (this.anInt494 == -1) {
								this.anInt494 = this.aBoolean125 ? 1 : 0;
								return;
							}
							return;
						}
						if (local12 == 1) {
							local20 = arg0.method480();
							break;
						}
						if (local12 == 2) {
							this.aString23 = arg0.method487();
						} else if (local12 == 3) {
							this.aByteArray4 = arg0.method488();
						} else if (local12 == 5) {
							local20 = arg0.method480();
							if (local20 > 0) {
								this.anIntArray157 = null;
								this.anIntArray156 = new int[local20];
								for (local32 = 0; local32 < local20; local32++) {
									this.anIntArray156[local32] = arg0.method482();
								}
							}
						} else if (local12 == 14) {
							this.anInt481 = arg0.method480();
						} else if (local12 == 15) {
							this.anInt482 = arg0.method480();
						} else if (local12 == 17) {
							this.aBoolean125 = false;
						} else if (local12 == 18) {
							this.aBoolean126 = false;
						} else if (local12 == 19) {
							local3 = arg0.method480();
							if (local3 == 1) {
								this.aBoolean127 = true;
							}
						} else if (local12 == 21) {
							this.aBoolean128 = true;
						} else if (local12 == 22) {
							this.aBoolean129 = true;
						} else if (local12 == 23) {
							this.aBoolean130 = true;
						} else if (local12 == 24) {
							this.anInt483 = arg0.method482();
							if (this.anInt483 == 65535) {
								this.anInt483 = -1;
							}
						} else if (local12 == 28) {
							this.anInt484 = arg0.method480();
						} else if (local12 == 29) {
							this.aByte15 = arg0.method481();
						} else if (local12 == 39) {
							this.aByte16 = arg0.method481();
						} else if (local12 >= 30 && local12 < 39) {
							if (this.aStringArray8 == null) {
								this.aStringArray8 = new String[5];
							}
							this.aStringArray8[local12 - 30] = arg0.method487();
							if (this.aStringArray8[local12 - 30].equalsIgnoreCase("hidden")) {
								this.aStringArray8[local12 - 30] = null;
							}
						} else if (local12 == 40) {
							local20 = arg0.method480();
							this.anIntArray158 = new int[local20];
							this.anIntArray159 = new int[local20];
							for (local32 = 0; local32 < local20; local32++) {
								this.anIntArray158[local32] = arg0.method482();
								this.anIntArray159[local32] = arg0.method482();
							}
						} else if (local12 == 60) {
							this.anInt485 = arg0.method482();
						} else if (local12 == 62) {
							this.aBoolean131 = true;
						} else if (local12 == 64) {
							this.aBoolean132 = false;
						} else if (local12 == 65) {
							this.anInt487 = arg0.method482();
						} else if (local12 == 66) {
							this.anInt488 = arg0.method482();
						} else if (local12 == 67) {
							this.anInt489 = arg0.method482();
						} else if (local12 == 68) {
							this.anInt486 = arg0.method482();
						} else if (local12 == 69) {
							this.anInt493 = arg0.method480();
						} else if (local12 == 70) {
							this.anInt490 = arg0.method483();
						} else if (local12 == 71) {
							this.anInt491 = arg0.method483();
						} else if (local12 == 72) {
							this.anInt492 = arg0.method483();
						} else if (local12 == 73) {
							this.aBoolean133 = true;
						} else if (local12 == 74) {
							this.aBoolean134 = true;
						} else if (local12 == 75) {
							this.anInt494 = arg0.method480();
						} else if (local12 == 77) {
							this.anInt495 = arg0.method482();
							if (this.anInt495 == 65535) {
								this.anInt495 = -1;
							}
							this.anInt496 = arg0.method482();
							if (this.anInt496 == 65535) {
								this.anInt496 = -1;
							}
							local20 = arg0.method480();
							this.anIntArray160 = new int[local20 + 1];
							for (local32 = 0; local32 <= local20; local32++) {
								this.anIntArray160[local32] = arg0.method482();
								if (this.anIntArray160[local32] == 65535) {
									this.anIntArray160[local32] = -1;
								}
							}
						}
					}
				} while (local20 <= 0);
				this.anIntArray157 = new int[local20];
				this.anIntArray156 = new int[local20];
				for (local32 = 0; local32 < local20; local32++) {
					this.anIntArray156[local32] = arg0.method482();
					this.anIntArray157[local32] = arg0.method480();
				}
			}
		} catch (@Pc(525) RuntimeException local525) {
			signlink.reporterror("1582, " + 210 + ", " + arg0 + ", " + local525.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
	public boolean method291(@OriginalArg(1) int arg0) {
		try {
			if (this.anIntArray157 != null) {
				for (@Pc(46) int local46 = 0; local46 < this.anIntArray157.length; local46++) {
					if (this.anIntArray157[local46] == arg0) {
						return Class1_Sub1_Sub1_Sub5.method262(this.anIntArray156[local46] & 0xFFFF);
					}
				}
				return true;
			} else if (this.anIntArray156 == null) {
				return true;
			} else if (arg0 == 10) {
				@Pc(22) boolean local22 = true;
				for (@Pc(24) int local24 = 0; local24 < this.anIntArray156.length; local24++) {
					local22 &= Class1_Sub1_Sub1_Sub5.method262(this.anIntArray156[local24] & 0xFFFF);
				}
				return local22;
			} else {
				return true;
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("98176, " + 0 + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)Z")
	public boolean method292() {
		try {
			if (this.anIntArray156 == null) {
				return true;
			}
			@Pc(8) boolean local8 = true;
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray156.length; local10++) {
				local8 &= Class1_Sub1_Sub1_Sub5.method262(this.anIntArray156[local10] & 0xFFFF);
			}
			return local8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("41940, " + false + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ub;B)V")
	public void method293(@OriginalArg(0) Class44_Sub1 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.anIntArray156 != null) {
				for (@Pc(15) int local15 = 0; local15 < this.anIntArray156.length; local15++) {
					arg0.method650(this.anIntArray156[local15] & 0xFFFF, 0);
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("86090, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = this.method295(arg6, arg1, arg0);
		if (local6 == null) {
			return null;
		}
		if (this.aBoolean128 || this.aBoolean129) {
			local6 = new Class1_Sub1_Sub1_Sub5((byte) 60, local6, this.aBoolean129, this.aBoolean128);
		}
		if (this.aBoolean128) {
			@Pc(39) int local39 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (@Pc(41) int local41 = 0; local41 < local6.anInt459; local41++) {
				@Pc(48) int local48 = local6.anIntArray118[local41];
				@Pc(53) int local53 = local6.anIntArray120[local41];
				@Pc(65) int local65 = arg2 + (arg3 - arg2) * (local48 + 64) / 128;
				@Pc(77) int local77 = arg5 + (arg4 - arg5) * (local48 + 64) / 128;
				@Pc(89) int local89 = local65 + (local77 - local65) * (local53 + 64) / 128;
				local6.anIntArray119[local41] += local89 - local39;
			}
			local6.method266();
		}
		return local6;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBII)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method295(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = null;
			@Pc(26) long local26;
			@Pc(50) boolean local50;
			@Pc(56) int local56;
			@Pc(170) Class1_Sub1_Sub1_Sub5 local170;
			if (this.anIntArray157 == null) {
				if (arg2 != 10) {
					return null;
				}
				local26 = (long) ((this.anInt480 << 6) + arg1) + ((long) (arg0 + 1) << 32);
				@Pc(31) Class1_Sub1_Sub1_Sub5 local31 = (Class1_Sub1_Sub1_Sub5) aClass40_5.method591(local26);
				if (local31 != null) {
					return local31;
				}
				if (this.anIntArray156 == null) {
					return null;
				}
				local50 = this.aBoolean131 ^ arg1 > 3;
				@Pc(54) int local54 = this.anIntArray156.length;
				for (local56 = 0; local56 < local54; local56++) {
					@Pc(62) int local62 = this.anIntArray156[local56];
					if (local50) {
						local62 += 65536;
					}
					local3 = (Class1_Sub1_Sub1_Sub5) aClass40_4.method591((long) local62);
					if (local3 == null) {
						local3 = Class1_Sub1_Sub1_Sub5.method261(local62 & 0xFFFF);
						if (local3 == null) {
							return null;
						}
						if (local50) {
							local3.method276();
						}
						aClass40_4.method592(local3, (long) local62);
					}
					if (local54 > 1) {
						aClass1_Sub1_Sub1_Sub5Array1[local56] = local3;
					}
				}
				if (local54 > 1) {
					local3 = new Class1_Sub1_Sub1_Sub5(aClass1_Sub1_Sub1_Sub5Array1, local54, false);
				}
			} else {
				@Pc(121) int local121 = -1;
				for (@Pc(123) int local123 = 0; local123 < this.anIntArray157.length; local123++) {
					if (this.anIntArray157[local123] == arg2) {
						local121 = local123;
						break;
					}
				}
				if (local121 == -1) {
					return null;
				}
				local26 = (long) ((this.anInt480 << 6) + (local121 << 3) + arg1) + ((long) (arg0 + 1) << 32);
				local170 = (Class1_Sub1_Sub1_Sub5) aClass40_5.method591(local26);
				if (local170 != null) {
					return local170;
				}
				local56 = this.anIntArray156[local121];
				@Pc(189) boolean local189 = this.aBoolean131 ^ arg1 > 3;
				if (local189) {
					local56 += 65536;
				}
				local3 = (Class1_Sub1_Sub1_Sub5) aClass40_4.method591((long) local56);
				if (local3 == null) {
					local3 = Class1_Sub1_Sub1_Sub5.method261(local56 & 0xFFFF);
					if (local3 == null) {
						return null;
					}
					if (local189) {
						local3.method276();
					}
					aClass40_4.method592(local3, (long) local56);
				}
			}
			@Pc(238) boolean local238;
			if (this.anInt487 == 128 && this.anInt488 == 128 && this.anInt489 == 128) {
				local238 = false;
			} else {
				local238 = true;
			}
			if (this.anInt490 == 0 && this.anInt491 == 0 && this.anInt492 == 0) {
				local50 = false;
			} else {
				local50 = true;
			}
			local170 = new Class1_Sub1_Sub1_Sub5(arg1 == 0 && arg0 == -1 && !local238 && !local50, 201, local3, Class12.method306(arg0), this.anIntArray158 == null);
			if (arg0 != -1) {
				local170.method268();
				local170.method269(arg0);
				local170.anIntArrayArray9 = null;
				local170.anIntArrayArray8 = null;
			}
			while (arg1-- > 0) {
				local170.method272();
			}
			if (this.anIntArray158 != null) {
				for (local56 = 0; local56 < this.anIntArray158.length; local56++) {
					local170.method275(this.anIntArray158[local56], this.anIntArray159[local56]);
				}
			}
			if (local238) {
				local170.method277(this.anInt489, this.anInt488, this.anInt487);
			}
			if (local50) {
				local170.method274(this.anInt492, this.anInt491, this.anInt490);
			}
			local170.method278(this.aByte15 + 64, this.aByte16 * 5 + 768, -50, -10, -50, !this.aBoolean129);
			if (this.anInt494 == 1) {
				local170.anInt471 = local170.anInt961;
			}
			aClass40_5.method592(local170, local26);
			return local170;
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("53943, " + arg0 + ", " + 21 + ", " + arg1 + ", " + arg2 + ", " + local397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Lclient!ec;")
	public Class9 method296() {
		try {
			@Pc(13) int local13 = -1;
			if (this.anInt495 != -1) {
				@Pc(22) Class36 local22 = Class36.aClass36Array1[this.anInt495];
				@Pc(25) int local25 = local22.anInt822;
				@Pc(28) int local28 = local22.anInt823;
				@Pc(31) int local31 = local22.anInt824;
				@Pc(37) int local37 = client.anIntArray57[local31 - local28];
				local13 = aClient2.anIntArray56[local25] >> local28 & local37;
			} else if (this.anInt496 != -1) {
				local13 = aClient2.anIntArray56[this.anInt496];
			}
			return local13 < 0 || local13 >= this.anIntArray160.length || this.anIntArray160[local13] == -1 ? null : method288(this.anIntArray160[local13]);
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("73238, " + 33093 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}
}
