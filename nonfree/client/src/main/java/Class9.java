import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class Class9 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Z")
	private static boolean aBoolean125;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!client;")
	public static client aClient2;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	private static int anInt516;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "[I")
	private static int[] anIntArray155;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "[Lclient!ec;")
	private static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
	private static int anInt517;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "[Lclient!eb;")
	private static Class1_Sub1_Sub1_Sub5[] aClass1_Sub1_Sub1_Sub5Array1 = new Class1_Sub1_Sub1_Sub5[4];

	@OriginalMember(owner = "client!ec", name = "Y", descriptor = "Lclient!s;")
	public static Class40 aClass40_4 = new Class40(false, 500);

	@OriginalMember(owner = "client!ec", name = "Z", descriptor = "Lclient!s;")
	public static Class40 aClass40_5 = new Class40(false, 30);

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	private int anInt514;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
	public int anInt519;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
	public int anInt520;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Z")
	public boolean aBoolean127;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Z")
	public boolean aBoolean128;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "Z")
	public boolean aBoolean129;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "Z")
	public boolean aBoolean130;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "Z")
	private boolean aBoolean131;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "Z")
	public boolean aBoolean132;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
	public int anInt521;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
	public int anInt522;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "B")
	private byte aByte23;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "B")
	private byte aByte24;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray8;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
	public int anInt523;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
	public int anInt524;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "Z")
	private boolean aBoolean133;

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "Z")
	public boolean aBoolean134;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
	private int anInt525;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
	private int anInt528;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
	private int anInt529;

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
	private int anInt530;

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
	public int anInt531;

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "Z")
	public boolean aBoolean135;

	@OriginalMember(owner = "client!ec", name = "T", descriptor = "Z")
	private boolean aBoolean136;

	@OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
	private int anInt532;

	@OriginalMember(owner = "client!ec", name = "V", descriptor = "[I")
	public int[] anIntArray160;

	@OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
	public int anInt533;

	@OriginalMember(owner = "client!ec", name = "X", descriptor = "I")
	public int anInt534;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Z")
	private boolean aBoolean126 = true;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "B")
	private byte aByte21 = -41;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "B")
	private byte aByte22 = 3;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	private int anInt515 = 6;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
	public int anInt518 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method286(@OriginalArg(0) Class47 arg0) {
		aClass1_Sub1_Sub3_5 = new Class1_Sub1_Sub3(-49365, arg0.method666("loc.dat", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(-49365, arg0.method666("loc.idx", null));
		anInt516 = local19.method482();
		anIntArray155 = new int[anInt516];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt516; local29++) {
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
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("42965, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lclient!ec;")
	public static Class9 method288(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass9Array1[local1].anInt518 == arg0) {
				return aClass9Array1[local1];
			}
		}
		anInt517 = (anInt517 + 1) % 20;
		@Pc(27) Class9 local27 = aClass9Array1[anInt517];
		aClass1_Sub1_Sub3_5.anInt763 = anIntArray155[arg0];
		local27.anInt518 = arg0;
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
		this.anInt519 = 1;
		this.anInt520 = 1;
		this.aBoolean127 = true;
		this.aBoolean128 = true;
		this.aBoolean129 = false;
		this.aBoolean130 = false;
		this.aBoolean131 = false;
		this.aBoolean132 = false;
		this.anInt521 = -1;
		this.anInt522 = 16;
		this.aByte23 = 0;
		this.aByte24 = 0;
		this.aStringArray8 = null;
		this.anInt523 = -1;
		this.anInt524 = -1;
		this.aBoolean133 = false;
		this.aBoolean134 = true;
		this.anInt525 = 128;
		this.anInt526 = 128;
		this.anInt527 = 128;
		this.anInt531 = 0;
		this.anInt528 = 0;
		this.anInt529 = 0;
		this.anInt530 = 0;
		this.aBoolean135 = false;
		this.aBoolean136 = false;
		this.anInt532 = -1;
		this.anInt533 = -1;
		this.anInt534 = -1;
		this.anIntArray160 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!lb;Z)V")
	private void method290(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(23) int local23;
				@Pc(35) int local35;
				do {
					while (true) {
						@Pc(15) int local15 = arg0.method480();
						if (local15 == 0) {
							if (local3 == -1) {
								this.aBoolean129 = false;
								if (this.anIntArray156 != null && (this.anIntArray157 == null || this.anIntArray157[0] == 10)) {
									this.aBoolean129 = true;
								}
								if (this.aStringArray8 != null) {
									this.aBoolean129 = true;
								}
							}
							if (this.aBoolean136) {
								this.aBoolean127 = false;
								this.aBoolean128 = false;
							}
							if (this.anInt532 == -1) {
								this.anInt532 = this.aBoolean127 ? 1 : 0;
								return;
							}
							return;
						}
						if (local15 == 1) {
							local23 = arg0.method480();
							break;
						}
						if (local15 == 2) {
							this.aString23 = arg0.method487();
						} else if (local15 == 3) {
							this.aByteArray4 = arg0.method488();
						} else if (local15 == 5) {
							local23 = arg0.method480();
							if (local23 > 0) {
								this.anIntArray157 = null;
								this.anIntArray156 = new int[local23];
								for (local35 = 0; local35 < local23; local35++) {
									this.anIntArray156[local35] = arg0.method482();
								}
							}
						} else if (local15 == 14) {
							this.anInt519 = arg0.method480();
						} else if (local15 == 15) {
							this.anInt520 = arg0.method480();
						} else if (local15 == 17) {
							this.aBoolean127 = false;
						} else if (local15 == 18) {
							this.aBoolean128 = false;
						} else if (local15 == 19) {
							local3 = arg0.method480();
							if (local3 == 1) {
								this.aBoolean129 = true;
							}
						} else if (local15 == 21) {
							this.aBoolean130 = true;
						} else if (local15 == 22) {
							this.aBoolean131 = true;
						} else if (local15 == 23) {
							this.aBoolean132 = true;
						} else if (local15 == 24) {
							this.anInt521 = arg0.method482();
							if (this.anInt521 == 65535) {
								this.anInt521 = -1;
							}
						} else if (local15 == 28) {
							this.anInt522 = arg0.method480();
						} else if (local15 == 29) {
							this.aByte23 = arg0.method481();
						} else if (local15 == 39) {
							this.aByte24 = arg0.method481();
						} else if (local15 >= 30 && local15 < 39) {
							if (this.aStringArray8 == null) {
								this.aStringArray8 = new String[5];
							}
							this.aStringArray8[local15 - 30] = arg0.method487();
							if (this.aStringArray8[local15 - 30].equalsIgnoreCase("hidden")) {
								this.aStringArray8[local15 - 30] = null;
							}
						} else if (local15 == 40) {
							local23 = arg0.method480();
							this.anIntArray158 = new int[local23];
							this.anIntArray159 = new int[local23];
							for (local35 = 0; local35 < local23; local35++) {
								this.anIntArray158[local35] = arg0.method482();
								this.anIntArray159[local35] = arg0.method482();
							}
						} else if (local15 == 60) {
							this.anInt523 = arg0.method482();
						} else if (local15 == 62) {
							this.aBoolean133 = true;
						} else if (local15 == 64) {
							this.aBoolean134 = false;
						} else if (local15 == 65) {
							this.anInt525 = arg0.method482();
						} else if (local15 == 66) {
							this.anInt526 = arg0.method482();
						} else if (local15 == 67) {
							this.anInt527 = arg0.method482();
						} else if (local15 == 68) {
							this.anInt524 = arg0.method482();
						} else if (local15 == 69) {
							this.anInt531 = arg0.method480();
						} else if (local15 == 70) {
							this.anInt528 = arg0.method483();
						} else if (local15 == 71) {
							this.anInt529 = arg0.method483();
						} else if (local15 == 72) {
							this.anInt530 = arg0.method483();
						} else if (local15 == 73) {
							this.aBoolean135 = true;
						} else if (local15 == 74) {
							this.aBoolean136 = true;
						} else if (local15 == 75) {
							this.anInt532 = arg0.method480();
						} else if (local15 == 77) {
							this.anInt533 = arg0.method482();
							if (this.anInt533 == 65535) {
								this.anInt533 = -1;
							}
							this.anInt534 = arg0.method482();
							if (this.anInt534 == 65535) {
								this.anInt534 = -1;
							}
							local23 = arg0.method480();
							this.anIntArray160 = new int[local23 + 1];
							for (local35 = 0; local35 <= local23; local35++) {
								this.anIntArray160[local35] = arg0.method482();
								if (this.anIntArray160[local35] == 65535) {
									this.anIntArray160[local35] = -1;
								}
							}
						}
					}
				} while (local23 <= 0);
				this.anIntArray157 = new int[local23];
				this.anIntArray156 = new int[local23];
				for (local35 = 0; local35 < local23; local35++) {
					this.anIntArray156[local35] = arg0.method482();
					this.anIntArray157[local35] = arg0.method480();
				}
			}
		} catch (@Pc(528) RuntimeException local528) {
			signlink.reporterror("27630, " + arg0 + ", " + false + ", " + local528.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
	public boolean method291(@OriginalArg(1) int arg0) {
		try {
			if (this.anIntArray157 != null) {
				for (@Pc(45) int local45 = 0; local45 < this.anIntArray157.length; local45++) {
					if (this.anIntArray157[local45] == arg0) {
						return Class1_Sub1_Sub1_Sub5.method262(this.anIntArray156[local45] & 0xFFFF);
					}
				}
				return true;
			} else if (this.anIntArray156 == null) {
				return true;
			} else if (arg0 == 10) {
				@Pc(21) boolean local21 = true;
				for (@Pc(23) int local23 = 0; local23 < this.anIntArray156.length; local23++) {
					local21 &= Class1_Sub1_Sub1_Sub5.method262(this.anIntArray156[local23] & 0xFFFF);
				}
				return local21;
			} else {
				return true;
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("76682, " + 477 + ", " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Z")
	public boolean method292() {
		try {
			if (this.anIntArray156 == null) {
				return true;
			}
			@Pc(18) boolean local18 = true;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray156.length; local20++) {
				local18 &= Class1_Sub1_Sub1_Sub5.method262(this.anIntArray156[local20] & 0xFFFF);
			}
			return local18;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("55118, " + -20444 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!ub;)V")
	public void method293(@OriginalArg(1) Class44_Sub1 arg0) {
		try {
			if (this.anIntArray156 != null) {
				for (@Pc(11) int local11 = 0; local11 < this.anIntArray156.length; local11++) {
					arg0.method650(0, this.anIntArray156[local11] & 0xFFFF);
				}
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("68695, " + -2156 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = this.method295(arg6, arg1, arg0);
		if (local6 == null) {
			return null;
		}
		if (this.aBoolean130 || this.aBoolean131) {
			local6 = new Class1_Sub1_Sub1_Sub5(3, local6, this.aBoolean131, this.aBoolean130);
		}
		if (this.aBoolean130) {
			@Pc(39) int local39 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (@Pc(41) int local41 = 0; local41 < local6.anInt495; local41++) {
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
	private Class1_Sub1_Sub1_Sub5 method295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(13) Class1_Sub1_Sub1_Sub5 local13 = null;
			@Pc(36) long local36;
			@Pc(60) boolean local60;
			@Pc(66) int local66;
			@Pc(182) Class1_Sub1_Sub1_Sub5 local182;
			if (this.anIntArray157 == null) {
				if (arg2 != 10) {
					return null;
				}
				local36 = (long) ((this.anInt518 << 6) + arg1) + ((long) (arg0 + 1) << 32);
				@Pc(41) Class1_Sub1_Sub1_Sub5 local41 = (Class1_Sub1_Sub1_Sub5) aClass40_5.method591(local36);
				if (local41 != null) {
					return local41;
				}
				if (this.anIntArray156 == null) {
					return null;
				}
				local60 = this.aBoolean133 ^ arg1 > 3;
				@Pc(64) int local64 = this.anIntArray156.length;
				for (local66 = 0; local66 < local64; local66++) {
					@Pc(72) int local72 = this.anIntArray156[local66];
					if (local60) {
						local72 += 65536;
					}
					local13 = (Class1_Sub1_Sub1_Sub5) aClass40_4.method591((long) local72);
					if (local13 == null) {
						local13 = Class1_Sub1_Sub1_Sub5.method261(local72 & 0xFFFF);
						if (local13 == null) {
							return null;
						}
						if (local60) {
							local13.method276(this.aByte22);
						}
						aClass40_4.method592((long) local72, local13);
					}
					if (local64 > 1) {
						aClass1_Sub1_Sub1_Sub5Array1[local66] = local13;
					}
				}
				if (local64 > 1) {
					local13 = new Class1_Sub1_Sub1_Sub5(aClass1_Sub1_Sub1_Sub5Array1, this.aByte21, local64);
				}
			} else {
				@Pc(133) int local133 = -1;
				for (@Pc(135) int local135 = 0; local135 < this.anIntArray157.length; local135++) {
					if (this.anIntArray157[local135] == arg2) {
						local133 = local135;
						break;
					}
				}
				if (local133 == -1) {
					return null;
				}
				local36 = (long) ((this.anInt518 << 6) + (local133 << 3) + arg1) + ((long) (arg0 + 1) << 32);
				local182 = (Class1_Sub1_Sub1_Sub5) aClass40_5.method591(local36);
				if (local182 != null) {
					return local182;
				}
				local66 = this.anIntArray156[local133];
				@Pc(201) boolean local201 = this.aBoolean133 ^ arg1 > 3;
				if (local201) {
					local66 += 65536;
				}
				local13 = (Class1_Sub1_Sub1_Sub5) aClass40_4.method591((long) local66);
				if (local13 == null) {
					local13 = Class1_Sub1_Sub1_Sub5.method261(local66 & 0xFFFF);
					if (local13 == null) {
						return null;
					}
					if (local201) {
						local13.method276(this.aByte22);
					}
					aClass40_4.method592((long) local66, local13);
				}
			}
			@Pc(251) boolean local251;
			if (this.anInt525 == 128 && this.anInt526 == 128 && this.anInt527 == 128) {
				local251 = false;
			} else {
				local251 = true;
			}
			if (this.anInt528 == 0 && this.anInt529 == 0 && this.anInt530 == 0) {
				local60 = false;
			} else {
				local60 = true;
			}
			local182 = new Class1_Sub1_Sub1_Sub5(arg1 == 0 && arg0 == -1 && !local251 && !local60, -16051, local13, Class12.method306(arg0, this.aBoolean126), this.anIntArray158 == null);
			if (arg0 != -1) {
				local182.method268();
				local182.method269(arg0);
				local182.anIntArrayArray9 = null;
				local182.anIntArrayArray8 = null;
			}
			while (arg1-- > 0) {
				local182.method272();
			}
			if (this.anIntArray158 != null) {
				for (local66 = 0; local66 < this.anIntArray158.length; local66++) {
					local182.method275(this.anIntArray158[local66], this.anIntArray159[local66]);
				}
			}
			if (local251) {
				local182.method277(this.anInt525, this.anInt527, this.anInt526);
			}
			if (local60) {
				local182.method274(this.anInt529, this.anInt530, this.anInt528);
			}
			local182.method278(this.aByte23 + 64, this.aByte24 * 5 + 768, -50, -10, -50, !this.aBoolean131);
			if (this.anInt532 == 1) {
				local182.anInt507 = local182.anInt1005;
			}
			aClass40_5.method592(local36, local182);
			return local182;
		} catch (@Pc(404) RuntimeException local404) {
			signlink.reporterror("68814, " + arg0 + ", " + arg1 + ", " + -45961 + ", " + arg2 + ", " + local404.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)Lclient!ec;")
	public Class9 method296() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt533 != -1) {
				@Pc(15) Class36 local15 = Class36.aClass36Array1[this.anInt533];
				@Pc(18) int local18 = local15.anInt862;
				@Pc(21) int local21 = local15.anInt863;
				@Pc(24) int local24 = local15.anInt864;
				@Pc(30) int local30 = client.anIntArray91[local24 - local21];
				local1 = aClient2.anIntArray81[local18] >> local21 & local30;
			} else if (this.anInt534 != -1) {
				local1 = aClient2.anIntArray81[this.anInt534];
			}
			return local1 < 0 || local1 >= this.anIntArray160.length || this.anIntArray160[local1] == -1 ? null : method288(this.anIntArray160[local1]);
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("85625, " + 0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
