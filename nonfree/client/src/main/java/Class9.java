import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class Class9 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Z")
	private static boolean aBoolean130;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Lclient!client;")
	public static client aClient2;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	private static int anInt499;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
	private static int[] anIntArray155;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "[Lclient!ec;")
	private static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
	private static int anInt500;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "[Lclient!eb;")
	private static Class1_Sub1_Sub1_Sub5[] aClass1_Sub1_Sub1_Sub5Array1 = new Class1_Sub1_Sub1_Sub5[4];

	@OriginalMember(owner = "client!ec", name = "V", descriptor = "Lclient!s;")
	public static Class40 aClass40_4 = new Class40(500, true);

	@OriginalMember(owner = "client!ec", name = "W", descriptor = "Lclient!s;")
	public static Class40 aClass40_5 = new Class40(30, true);

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
	public int anInt502;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
	public int anInt503;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Z")
	public boolean aBoolean131;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "Z")
	public boolean aBoolean132;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
	public boolean aBoolean133;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Z")
	public boolean aBoolean134;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Z")
	private boolean aBoolean135;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "Z")
	public boolean aBoolean136;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
	public int anInt504;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
	public int anInt505;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "B")
	private byte aByte16;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "B")
	private byte aByte17;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray8;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
	public int anInt506;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
	public int anInt507;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "Z")
	private boolean aBoolean137;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "Z")
	public boolean aBoolean138;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
	private int anInt508;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
	private int anInt509;

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
	private int anInt510;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
	private int anInt511;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
	private int anInt512;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
	private int anInt513;

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
	public int anInt514;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "Z")
	public boolean aBoolean139;

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "Z")
	private boolean aBoolean140;

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
	private int anInt515;

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "[I")
	public int[] anIntArray160;

	@OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
	public int anInt516;

	@OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
	public int anInt517;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	private int anInt497 = 16935;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	private int anInt498 = -38390;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
	public int anInt501 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method286(@OriginalArg(0) Class47 arg0) {
		aClass1_Sub1_Sub3_5 = new Class1_Sub1_Sub3(arg0.method666("loc.dat", null), aBoolean130);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method666("loc.idx", null), aBoolean130);
		anInt499 = local19.method482();
		anIntArray155 = new int[anInt499];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt499; local29++) {
			anIntArray155[local29] = local27;
			local27 += local19.method482();
		}
		aClass9Array1 = new Class9[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass9Array1[local49] = new Class9();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method287() {
		try {
			aClass40_4 = null;
			aClass40_5 = null;
			anIntArray155 = null;
			aClass9Array1 = null;
			aClass1_Sub1_Sub3_5 = null;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("99435, " + 4 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lclient!ec;")
	public static Class9 method288(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass9Array1[local1].anInt501 == arg0) {
				return aClass9Array1[local1];
			}
		}
		anInt500 = (anInt500 + 1) % 20;
		@Pc(27) Class9 local27 = aClass9Array1[anInt500];
		aClass1_Sub1_Sub3_5.anInt733 = anIntArray155[arg0];
		local27.anInt501 = arg0;
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
		this.anInt502 = 1;
		this.anInt503 = 1;
		this.aBoolean131 = true;
		this.aBoolean132 = true;
		this.aBoolean133 = false;
		this.aBoolean134 = false;
		this.aBoolean135 = false;
		this.aBoolean136 = false;
		this.anInt504 = -1;
		this.anInt505 = 16;
		this.aByte16 = 0;
		this.aByte17 = 0;
		this.aStringArray8 = null;
		this.anInt506 = -1;
		this.anInt507 = -1;
		this.aBoolean137 = false;
		this.aBoolean138 = true;
		this.anInt508 = 128;
		this.anInt509 = 128;
		this.anInt510 = 128;
		this.anInt514 = 0;
		this.anInt511 = 0;
		this.anInt512 = 0;
		this.anInt513 = 0;
		this.aBoolean139 = false;
		this.aBoolean140 = false;
		this.anInt515 = -1;
		this.anInt516 = -1;
		this.anInt517 = -1;
		this.anIntArray160 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZLclient!lb;)V")
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
								this.aBoolean133 = false;
								if (this.anIntArray156 != null && (this.anIntArray157 == null || this.anIntArray157[0] == 10)) {
									this.aBoolean133 = true;
								}
								if (this.aStringArray8 != null) {
									this.aBoolean133 = true;
								}
							}
							if (this.aBoolean140) {
								this.aBoolean131 = false;
								this.aBoolean132 = false;
							}
							if (this.anInt515 == -1) {
								this.anInt515 = this.aBoolean131 ? 1 : 0;
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
							this.anInt502 = arg0.method480();
						} else if (local12 == 15) {
							this.anInt503 = arg0.method480();
						} else if (local12 == 17) {
							this.aBoolean131 = false;
						} else if (local12 == 18) {
							this.aBoolean132 = false;
						} else if (local12 == 19) {
							local3 = arg0.method480();
							if (local3 == 1) {
								this.aBoolean133 = true;
							}
						} else if (local12 == 21) {
							this.aBoolean134 = true;
						} else if (local12 == 22) {
							this.aBoolean135 = true;
						} else if (local12 == 23) {
							this.aBoolean136 = true;
						} else if (local12 == 24) {
							this.anInt504 = arg0.method482();
							if (this.anInt504 == 65535) {
								this.anInt504 = -1;
							}
						} else if (local12 == 28) {
							this.anInt505 = arg0.method480();
						} else if (local12 == 29) {
							this.aByte16 = arg0.method481();
						} else if (local12 == 39) {
							this.aByte17 = arg0.method481();
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
							this.anInt506 = arg0.method482();
						} else if (local12 == 62) {
							this.aBoolean137 = true;
						} else if (local12 == 64) {
							this.aBoolean138 = false;
						} else if (local12 == 65) {
							this.anInt508 = arg0.method482();
						} else if (local12 == 66) {
							this.anInt509 = arg0.method482();
						} else if (local12 == 67) {
							this.anInt510 = arg0.method482();
						} else if (local12 == 68) {
							this.anInt507 = arg0.method482();
						} else if (local12 == 69) {
							this.anInt514 = arg0.method480();
						} else if (local12 == 70) {
							this.anInt511 = arg0.method483();
						} else if (local12 == 71) {
							this.anInt512 = arg0.method483();
						} else if (local12 == 72) {
							this.anInt513 = arg0.method483();
						} else if (local12 == 73) {
							this.aBoolean139 = true;
						} else if (local12 == 74) {
							this.aBoolean140 = true;
						} else if (local12 == 75) {
							this.anInt515 = arg0.method480();
						} else if (local12 == 77) {
							this.anInt516 = arg0.method482();
							if (this.anInt516 == 65535) {
								this.anInt516 = -1;
							}
							this.anInt517 = arg0.method482();
							if (this.anInt517 == 65535) {
								this.anInt517 = -1;
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
			signlink.reporterror("16923, " + false + ", " + arg0 + ", " + local525.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
	public boolean method291(@OriginalArg(1) int arg0) {
		try {
			if (this.anIntArray157 != null) {
				for (@Pc(49) int local49 = 0; local49 < this.anIntArray157.length; local49++) {
					if (this.anIntArray157[local49] == arg0) {
						return Class1_Sub1_Sub1_Sub5.method262(this.anIntArray156[local49] & 0xFFFF);
					}
				}
				return true;
			} else if (this.anIntArray156 == null) {
				return true;
			} else if (arg0 == 10) {
				@Pc(25) boolean local25 = true;
				for (@Pc(27) int local27 = 0; local27 < this.anIntArray156.length; local27++) {
					local25 &= Class1_Sub1_Sub1_Sub5.method262(this.anIntArray156[local27] & 0xFFFF);
				}
				return local25;
			} else {
				return true;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("66957, " + 0 + ", " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)Z")
	public boolean method292(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.anIntArray156 == null) {
				return true;
			}
			@Pc(22) boolean local22 = true;
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray156.length; local24++) {
				local22 &= Class1_Sub1_Sub1_Sub5.method262(this.anIntArray156[local24] & 0xFFFF);
			}
			return local22;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("72559, " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ub;I)V")
	public void method293(@OriginalArg(0) Class44_Sub1 arg0) {
		try {
			if (this.anIntArray156 != null) {
				for (@Pc(5) int local5 = 0; local5 < this.anIntArray156.length; local5++) {
					arg0.method650(this.anIntArray156[local5] & 0xFFFF, 0);
				}
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("19467, " + arg0 + ", " + 0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = this.method295(arg1, arg0, arg6);
		if (local6 == null) {
			return null;
		}
		if (this.aBoolean134 || this.aBoolean135) {
			local6 = new Class1_Sub1_Sub1_Sub5(local6, this.aBoolean135, this.aBoolean134, true);
		}
		if (this.aBoolean134) {
			@Pc(39) int local39 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (@Pc(41) int local41 = 0; local41 < local6.anInt478; local41++) {
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

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method295(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = null;
			@Pc(26) long local26;
			@Pc(50) boolean local50;
			@Pc(56) int local56;
			@Pc(171) Class1_Sub1_Sub1_Sub5 local171;
			if (this.anIntArray157 == null) {
				if (arg1 != 10) {
					return null;
				}
				local26 = (long) ((this.anInt501 << 6) + arg0) + ((long) (arg2 + 1) << 32);
				@Pc(31) Class1_Sub1_Sub1_Sub5 local31 = (Class1_Sub1_Sub1_Sub5) aClass40_5.method591(local26);
				if (local31 != null) {
					return local31;
				}
				if (this.anIntArray156 == null) {
					return null;
				}
				local50 = this.aBoolean137 ^ arg0 > 3;
				@Pc(54) int local54 = this.anIntArray156.length;
				for (local56 = 0; local56 < local54; local56++) {
					@Pc(62) int local62 = this.anIntArray156[local56];
					if (local50) {
						local62 += 65536;
					}
					local3 = (Class1_Sub1_Sub1_Sub5) aClass40_4.method591((long) local62);
					if (local3 == null) {
						local3 = Class1_Sub1_Sub1_Sub5.method261((byte) 4, local62 & 0xFFFF);
						if (local3 == null) {
							return null;
						}
						if (local50) {
							local3.method276();
						}
						aClass40_4.method592((long) local62, local3);
					}
					if (local54 > 1) {
						aClass1_Sub1_Sub1_Sub5Array1[local56] = local3;
					}
				}
				if (local54 > 1) {
					local3 = new Class1_Sub1_Sub1_Sub5(aClass1_Sub1_Sub1_Sub5Array1, this.anInt497, local54);
				}
			} else {
				@Pc(122) int local122 = -1;
				for (@Pc(124) int local124 = 0; local124 < this.anIntArray157.length; local124++) {
					if (this.anIntArray157[local124] == arg1) {
						local122 = local124;
						break;
					}
				}
				if (local122 == -1) {
					return null;
				}
				local26 = (long) ((this.anInt501 << 6) + (local122 << 3) + arg0) + ((long) (arg2 + 1) << 32);
				local171 = (Class1_Sub1_Sub1_Sub5) aClass40_5.method591(local26);
				if (local171 != null) {
					return local171;
				}
				local56 = this.anIntArray156[local122];
				@Pc(190) boolean local190 = this.aBoolean137 ^ arg0 > 3;
				if (local190) {
					local56 += 65536;
				}
				local3 = (Class1_Sub1_Sub1_Sub5) aClass40_4.method591((long) local56);
				if (local3 == null) {
					local3 = Class1_Sub1_Sub1_Sub5.method261((byte) 4, local56 & 0xFFFF);
					if (local3 == null) {
						return null;
					}
					if (local190) {
						local3.method276();
					}
					aClass40_4.method592((long) local56, local3);
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
			local171 = new Class1_Sub1_Sub1_Sub5(arg0 == 0 && arg2 == -1 && !local247 && !local50, local3, this.anIntArray158 == null, (byte) 119, Class12.method306(arg2, (byte) 7));
			if (arg2 != -1) {
				local171.method268();
				local171.method269(arg2);
				local171.anIntArrayArray9 = null;
				local171.anIntArrayArray8 = null;
			}
			while (arg0-- > 0) {
				local171.method272();
			}
			if (this.anIntArray158 != null) {
				for (local56 = 0; local56 < this.anIntArray158.length; local56++) {
					local171.method275(this.anIntArray158[local56], this.anIntArray159[local56]);
				}
			}
			if (local247) {
				local171.method277(this.anInt510, this.anInt508, this.anInt509);
			}
			if (local50) {
				local171.method274(this.anInt511, this.anInt513, this.anInt512);
			}
			local171.method278(this.aByte16 + 64, this.aByte17 * 5 + 768, -50, -10, -50, !this.aBoolean135);
			if (this.anInt515 == 1) {
				local171.anInt490 = local171.anInt980;
			}
			aClass40_5.method592(local26, local171);
			return local171;
		} catch (@Pc(399) RuntimeException local399) {
			signlink.reporterror("6194, " + -603 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local399.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)Lclient!ec;")
	public Class9 method296() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt516 != -1) {
				@Pc(16) Class36 local16 = Class36.aClass36Array1[this.anInt516];
				@Pc(19) int local19 = local16.anInt834;
				@Pc(22) int local22 = local16.anInt835;
				@Pc(25) int local25 = local16.anInt836;
				@Pc(31) int local31 = client.anIntArray88[local25 - local22];
				local1 = aClient2.anIntArray73[local19] >> local22 & local31;
			} else if (this.anInt517 != -1) {
				local1 = aClient2.anIntArray73[this.anInt517];
			}
			return local1 < 0 || local1 >= this.anIntArray160.length || this.anIntArray160[local1] == -1 ? null : method288(this.anIntArray160[local1]);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("14293, " + -115 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
