import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class Class9 {

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
	private static int anInt499;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "[I")
	private static int[] anIntArray155;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "[Lclient!ec;")
	private static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
	private static int anInt500;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "[Lclient!eb;")
	private static Class1_Sub1_Sub1_Sub5[] aClass1_Sub1_Sub1_Sub5Array1 = new Class1_Sub1_Sub1_Sub5[4];

	@OriginalMember(owner = "client!ec", name = "W", descriptor = "Lclient!s;")
	public static Class40 aClass40_4 = new Class40((byte) 7, 500);

	@OriginalMember(owner = "client!ec", name = "X", descriptor = "Lclient!s;")
	public static Class40 aClass40_5 = new Class40((byte) 7, 30);

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	private int anInt496;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	private int anInt498;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
	public int anInt502;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
	public int anInt503;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
	public boolean aBoolean123;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Z")
	public boolean aBoolean124;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Z")
	public boolean aBoolean125;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "Z")
	public boolean aBoolean126;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "Z")
	private boolean aBoolean127;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "Z")
	public boolean aBoolean128;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
	public int anInt504;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
	public int anInt505;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "B")
	private byte aByte20;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "B")
	private byte aByte21;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray8;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
	public int anInt506;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
	public int anInt507;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "Z")
	private boolean aBoolean129;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "Z")
	public boolean aBoolean130;

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
	private int anInt508;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
	private int anInt509;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
	private int anInt510;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
	private int anInt511;

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
	private int anInt512;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
	private int anInt513;

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
	public int anInt514;

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "Z")
	public boolean aBoolean131;

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "Z")
	private boolean aBoolean132;

	@OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
	private int anInt515;

	@OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
	public int anInt516;

	@OriginalMember(owner = "client!ec", name = "V", descriptor = "[I")
	public int[] anIntArray160;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Z")
	private boolean aBoolean122 = false;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	private int anInt495 = 44692;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "B")
	private byte aByte19 = 4;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	private int anInt497 = -139;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
	public int anInt501 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method285(@OriginalArg(0) Class47 arg0) {
		aClass1_Sub1_Sub3_5 = new Class1_Sub1_Sub3(arg0.method662("loc.dat", null), 15787);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method662("loc.idx", null), 15787);
		anInt499 = local19.method478();
		anIntArray155 = new int[anInt499];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt499; local29++) {
			anIntArray155[local29] = local27;
			local27 += local19.method478();
		}
		aClass9Array1 = new Class9[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass9Array1[local49] = new Class9();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method286() {
		try {
			aClass40_4 = null;
			aClass40_5 = null;
			anIntArray155 = null;
			aClass9Array1 = null;
			aClass1_Sub1_Sub3_5 = null;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("19919, " + 42 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lclient!ec;")
	public static Class9 method287(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass9Array1[local1].anInt501 == arg0) {
				return aClass9Array1[local1];
			}
		}
		anInt500 = (anInt500 + 1) % 20;
		@Pc(27) Class9 local27 = aClass9Array1[anInt500];
		aClass1_Sub1_Sub3_5.anInt734 = anIntArray155[arg0];
		local27.anInt501 = arg0;
		local27.method288();
		local27.method289(aClass1_Sub1_Sub3_5);
		return local27;
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	private Class9() {
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
	private void method288() {
		this.anIntArray156 = null;
		this.anIntArray157 = null;
		this.aString23 = null;
		this.aByteArray4 = null;
		this.anIntArray158 = null;
		this.anIntArray159 = null;
		this.anInt502 = 1;
		this.anInt503 = 1;
		this.aBoolean123 = true;
		this.aBoolean124 = true;
		this.aBoolean125 = false;
		this.aBoolean126 = false;
		this.aBoolean127 = false;
		this.aBoolean128 = false;
		this.anInt504 = -1;
		this.anInt505 = 16;
		this.aByte20 = 0;
		this.aByte21 = 0;
		this.aStringArray8 = null;
		this.anInt506 = -1;
		this.anInt507 = -1;
		this.aBoolean129 = false;
		this.aBoolean130 = true;
		this.anInt508 = 128;
		this.anInt509 = 128;
		this.anInt510 = 128;
		this.anInt514 = 0;
		this.anInt511 = 0;
		this.anInt512 = 0;
		this.anInt513 = 0;
		this.aBoolean131 = false;
		this.aBoolean132 = false;
		this.anInt515 = -1;
		this.anInt516 = -1;
		this.anIntArray160 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZLclient!lb;)V")
	private void method289(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(19) int local19;
				@Pc(31) int local31;
				do {
					while (true) {
						@Pc(11) int local11 = arg0.method476();
						if (local11 == 0) {
							if (local3 == -1) {
								this.aBoolean125 = false;
								if (this.anIntArray156 != null && (this.anIntArray157 == null || this.anIntArray157[0] == 10)) {
									this.aBoolean125 = true;
								}
								if (this.aStringArray8 != null) {
									this.aBoolean125 = true;
								}
							}
							if (this.aBoolean132) {
								this.aBoolean123 = false;
								this.aBoolean124 = false;
							}
							if (this.anInt515 == -1) {
								this.anInt515 = this.aBoolean123 ? 1 : 0;
								return;
							}
							return;
						}
						if (local11 == 1) {
							local19 = arg0.method476();
							break;
						}
						if (local11 == 2) {
							this.aString23 = arg0.method483();
						} else if (local11 == 3) {
							this.aByteArray4 = arg0.method484(this.anInt495);
						} else if (local11 == 5) {
							local19 = arg0.method476();
							if (local19 > 0) {
								this.anIntArray157 = null;
								this.anIntArray156 = new int[local19];
								for (local31 = 0; local31 < local19; local31++) {
									this.anIntArray156[local31] = arg0.method478();
								}
							}
						} else if (local11 == 14) {
							this.anInt502 = arg0.method476();
						} else if (local11 == 15) {
							this.anInt503 = arg0.method476();
						} else if (local11 == 17) {
							this.aBoolean123 = false;
						} else if (local11 == 18) {
							this.aBoolean124 = false;
						} else if (local11 == 19) {
							local3 = arg0.method476();
							if (local3 == 1) {
								this.aBoolean125 = true;
							}
						} else if (local11 == 21) {
							this.aBoolean126 = true;
						} else if (local11 == 22) {
							this.aBoolean127 = true;
						} else if (local11 == 23) {
							this.aBoolean128 = true;
						} else if (local11 == 24) {
							this.anInt504 = arg0.method478();
							if (this.anInt504 == 65535) {
								this.anInt504 = -1;
							}
						} else if (local11 == 28) {
							this.anInt505 = arg0.method476();
						} else if (local11 == 29) {
							this.aByte20 = arg0.method477();
						} else if (local11 == 39) {
							this.aByte21 = arg0.method477();
						} else if (local11 >= 30 && local11 < 39) {
							if (this.aStringArray8 == null) {
								this.aStringArray8 = new String[5];
							}
							this.aStringArray8[local11 - 30] = arg0.method483();
							if (this.aStringArray8[local11 - 30].equalsIgnoreCase("hidden")) {
								this.aStringArray8[local11 - 30] = null;
							}
						} else if (local11 == 40) {
							local19 = arg0.method476();
							this.anIntArray158 = new int[local19];
							this.anIntArray159 = new int[local19];
							for (local31 = 0; local31 < local19; local31++) {
								this.anIntArray158[local31] = arg0.method478();
								this.anIntArray159[local31] = arg0.method478();
							}
						} else if (local11 == 60) {
							this.anInt506 = arg0.method478();
						} else if (local11 == 62) {
							this.aBoolean129 = true;
						} else if (local11 == 64) {
							this.aBoolean130 = false;
						} else if (local11 == 65) {
							this.anInt508 = arg0.method478();
						} else if (local11 == 66) {
							this.anInt509 = arg0.method478();
						} else if (local11 == 67) {
							this.anInt510 = arg0.method478();
						} else if (local11 == 68) {
							this.anInt507 = arg0.method478();
						} else if (local11 == 69) {
							this.anInt514 = arg0.method476();
						} else if (local11 == 70) {
							this.anInt511 = arg0.method479();
						} else if (local11 == 71) {
							this.anInt512 = arg0.method479();
						} else if (local11 == 72) {
							this.anInt513 = arg0.method479();
						} else if (local11 == 73) {
							this.aBoolean131 = true;
						} else if (local11 == 74) {
							this.aBoolean132 = true;
						} else if (local11 == 75) {
							this.anInt515 = arg0.method476();
						} else if (local11 == 77) {
							this.anInt516 = arg0.method478();
							local19 = arg0.method476();
							this.anIntArray160 = new int[local19 + 1];
							for (local31 = 0; local31 <= local19; local31++) {
								this.anIntArray160[local31] = arg0.method478();
								if (this.anIntArray160[local31] == 65535) {
									this.anIntArray160[local31] = -1;
								}
							}
						}
					}
				} while (local19 <= 0);
				this.anIntArray157 = new int[local19];
				this.anIntArray156 = new int[local19];
				for (local31 = 0; local31 < local19; local31++) {
					this.anIntArray156[local31] = arg0.method478();
					this.anIntArray157[local31] = arg0.method476();
				}
			}
		} catch (@Pc(507) RuntimeException local507) {
			signlink.reporterror("43978, " + false + ", " + arg0 + ", " + local507.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
	public boolean method290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			if (this.anIntArray157 != null) {
				for (@Pc(44) int local44 = 0; local44 < this.anIntArray157.length; local44++) {
					if (this.anIntArray157[local44] == arg0) {
						return Class1_Sub1_Sub1_Sub5.method261(this.anIntArray156[local44] & 0xFFFF);
					}
				}
				return true;
			} else if (this.anIntArray156 == null) {
				return true;
			} else if (arg0 == 10) {
				@Pc(20) boolean local20 = true;
				for (@Pc(22) int local22 = 0; local22 < this.anIntArray156.length; local22++) {
					local20 &= Class1_Sub1_Sub1_Sub5.method261(this.anIntArray156[local22] & 0xFFFF);
				}
				return local20;
			} else {
				return true;
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("3902, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Z")
	public boolean method291() {
		try {
			if (this.anIntArray156 == null) {
				return true;
			}
			@Pc(8) boolean local8 = true;
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray156.length; local10++) {
				local8 &= Class1_Sub1_Sub1_Sub5.method261(this.anIntArray156[local10] & 0xFFFF);
			}
			return local8;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("61709, " + -593 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ub;B)V")
	public void method292(@OriginalArg(0) Class44_Sub1 arg0, @OriginalArg(1) byte arg1) {
		try {
			if (this.anIntArray156 != null) {
				for (@Pc(7) int local7 = 0; local7 < this.anIntArray156.length; local7++) {
					arg0.method646(this.anIntArray156[local7] & 0xFFFF, 0);
				}
				@Pc(30) boolean local30 = false;
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("2074, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = this.method294(arg6, arg1, arg0);
		if (local6 == null) {
			return null;
		}
		if (this.aBoolean126 || this.aBoolean127) {
			local6 = new Class1_Sub1_Sub1_Sub5(this.aBoolean127, 0, local6, this.aBoolean126);
		}
		if (this.aBoolean126) {
			@Pc(39) int local39 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (@Pc(41) int local41 = 0; local41 < local6.anInt476; local41++) {
				@Pc(48) int local48 = local6.anIntArray118[local41];
				@Pc(53) int local53 = local6.anIntArray120[local41];
				@Pc(65) int local65 = arg2 + (arg3 - arg2) * (local48 + 64) / 128;
				@Pc(77) int local77 = arg5 + (arg4 - arg5) * (local48 + 64) / 128;
				@Pc(89) int local89 = local65 + (local77 - local65) * (local53 + 64) / 128;
				local6.anIntArray119[local41] += local89 - local39;
			}
			local6.method265(this.anInt497);
		}
		return local6;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIII)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = null;
			@Pc(26) long local26;
			@Pc(50) boolean local50;
			@Pc(56) int local56;
			@Pc(171) Class1_Sub1_Sub1_Sub5 local171;
			if (this.anIntArray157 == null) {
				if (arg2 != 10) {
					return null;
				}
				local26 = (long) ((this.anInt501 << 6) + arg1) + ((long) (arg0 + 1) << 32);
				@Pc(31) Class1_Sub1_Sub1_Sub5 local31 = (Class1_Sub1_Sub1_Sub5) aClass40_5.method587(local26);
				if (local31 != null) {
					return local31;
				}
				if (this.anIntArray156 == null) {
					return null;
				}
				local50 = this.aBoolean129 ^ arg1 > 3;
				@Pc(54) int local54 = this.anIntArray156.length;
				for (local56 = 0; local56 < local54; local56++) {
					@Pc(62) int local62 = this.anIntArray156[local56];
					if (local50) {
						local62 += 65536;
					}
					local3 = (Class1_Sub1_Sub1_Sub5) aClass40_4.method587((long) local62);
					if (local3 == null) {
						local3 = Class1_Sub1_Sub1_Sub5.method260(local62 & 0xFFFF, this.aByte19);
						if (local3 == null) {
							return null;
						}
						if (local50) {
							local3.method275();
						}
						aClass40_4.method588((long) local62, local3);
					}
					if (local54 > 1) {
						aClass1_Sub1_Sub1_Sub5Array1[local56] = local3;
					}
				}
				if (local54 > 1) {
					local3 = new Class1_Sub1_Sub1_Sub5(aClass1_Sub1_Sub1_Sub5Array1, local54, -33019);
				}
			} else {
				@Pc(122) int local122 = -1;
				for (@Pc(124) int local124 = 0; local124 < this.anIntArray157.length; local124++) {
					if (this.anIntArray157[local124] == arg2) {
						local122 = local124;
						break;
					}
				}
				if (local122 == -1) {
					return null;
				}
				local26 = (long) ((this.anInt501 << 6) + (local122 << 3) + arg1) + ((long) (arg0 + 1) << 32);
				local171 = (Class1_Sub1_Sub1_Sub5) aClass40_5.method587(local26);
				if (local171 != null) {
					return local171;
				}
				local56 = this.anIntArray156[local122];
				@Pc(190) boolean local190 = this.aBoolean129 ^ arg1 > 3;
				if (local190) {
					local56 += 65536;
				}
				local3 = (Class1_Sub1_Sub1_Sub5) aClass40_4.method587((long) local56);
				if (local3 == null) {
					local3 = Class1_Sub1_Sub1_Sub5.method260(local56 & 0xFFFF, this.aByte19);
					if (local3 == null) {
						return null;
					}
					if (local190) {
						local3.method275();
					}
					aClass40_4.method588((long) local56, local3);
				}
			}
			@Pc(247) boolean local247;
			if (this.anInt508 == 128 && this.anInt509 == 128 && this.anInt510 == 128) {
				local247 = false;
			} else {
				local247 = true;
			}
			if (this.anInt511 == 0 && this.anInt512 == 0 && this.anInt513 == 0) {
				local50 = false;
			} else {
				local50 = true;
			}
			local171 = new Class1_Sub1_Sub1_Sub5(local3, Class12.method304(arg0), arg1 == 0 && arg0 == -1 && !local247 && !local50, this.anInt496, this.anIntArray158 == null);
			if (arg0 != -1) {
				local171.method267((byte) 3);
				local171.method268(arg0, 188);
				local171.anIntArrayArray9 = null;
				local171.anIntArrayArray8 = null;
			}
			while (arg1-- > 0) {
				local171.method271();
			}
			if (this.anIntArray158 != null) {
				for (local56 = 0; local56 < this.anIntArray158.length; local56++) {
					local171.method274(this.anIntArray158[local56], this.anIntArray159[local56]);
				}
			}
			if (local247) {
				local171.method276(this.anInt508, this.anInt510, this.anInt509);
			}
			if (local50) {
				local171.method273(this.anInt512, this.anInt511, (byte) 2, this.anInt513);
			}
			local171.method277(this.aByte20 + 64, this.aByte21 * 5 + 768, -50, -10, -50, !this.aBoolean127);
			if (this.anInt515 == 1) {
				local171.anInt488 = local171.anInt979;
			}
			aClass40_5.method588(local26, local171);
			return local171;
		} catch (@Pc(400) RuntimeException local400) {
			signlink.reporterror("13988, " + -74 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local400.toString());
			throw new RuntimeException();
		}
	}
}
