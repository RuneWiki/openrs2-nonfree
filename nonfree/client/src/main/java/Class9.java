import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class Class9 {

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	private static int anInt486;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "[I")
	private static int[] anIntArray154;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "[Lclient!ec;")
	private static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
	private static int anInt487;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "[Lclient!eb;")
	private static Class1_Sub1_Sub1_Sub5[] aClass1_Sub1_Sub1_Sub5Array1 = new Class1_Sub1_Sub1_Sub5[4];

	@OriginalMember(owner = "client!ec", name = "T", descriptor = "Lclient!s;")
	public static Class40 aClass40_4 = new Class40(500, 0);

	@OriginalMember(owner = "client!ec", name = "U", descriptor = "Lclient!s;")
	public static Class40 aClass40_5 = new Class40(30, 0);

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
	public int anInt489;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
	public int anInt490;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "Z")
	public boolean aBoolean131;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
	public boolean aBoolean132;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Z")
	public boolean aBoolean133;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Z")
	public boolean aBoolean134;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "Z")
	private boolean aBoolean135;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "Z")
	public boolean aBoolean136;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
	public int anInt491;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
	public int anInt492;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "B")
	private byte aByte16;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "B")
	private byte aByte17;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray8;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
	public int anInt493;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
	public int anInt494;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "Z")
	private boolean aBoolean137;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "Z")
	public boolean aBoolean138;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
	private int anInt495;

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
	private int anInt496;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
	private int anInt497;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
	private int anInt498;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
	private int anInt499;

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
	private int anInt500;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
	public int anInt501;

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "Z")
	public boolean aBoolean139;

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "Z")
	private boolean aBoolean140;

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
	private int anInt502;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Z")
	private boolean aBoolean128 = true;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Z")
	private boolean aBoolean129 = true;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	private int anInt484 = 4697;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	private int anInt485 = 848;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Z")
	private boolean aBoolean130 = true;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
	private int anInt488 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method284(@OriginalArg(0) Class47 arg0) {
		aClass1_Sub1_Sub3_5 = new Class1_Sub1_Sub3((byte) 3, arg0.method658("loc.dat", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3((byte) 3, arg0.method658("loc.idx", null));
		anInt486 = local19.method474();
		anIntArray154 = new int[anInt486];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt486; local29++) {
			anIntArray154[local29] = local27;
			local27 += local19.method474();
		}
		aClass9Array1 = new Class9[10];
		for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
			aClass9Array1[local49] = new Class9();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method285() {
		try {
			aClass40_4 = null;
			aClass40_5 = null;
			anIntArray154 = null;
			aClass9Array1 = null;
			aClass1_Sub1_Sub3_5 = null;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("57701, " + 5 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lclient!ec;")
	public static Class9 method286(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass9Array1[local1].anInt488 == arg0) {
				return aClass9Array1[local1];
			}
		}
		anInt487 = (anInt487 + 1) % 10;
		@Pc(27) Class9 local27 = aClass9Array1[anInt487];
		aClass1_Sub1_Sub3_5.anInt715 = anIntArray154[arg0];
		local27.anInt488 = arg0;
		local27.method287();
		local27.method288(aClass1_Sub1_Sub3_5);
		return local27;
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	private Class9() {
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
	private void method287() {
		this.anIntArray155 = null;
		this.anIntArray156 = null;
		this.aString23 = null;
		this.aByteArray4 = null;
		this.anIntArray157 = null;
		this.anIntArray158 = null;
		this.anInt489 = 1;
		this.anInt490 = 1;
		this.aBoolean131 = true;
		this.aBoolean132 = true;
		this.aBoolean133 = false;
		this.aBoolean134 = false;
		this.aBoolean135 = false;
		this.aBoolean136 = false;
		this.anInt491 = -1;
		this.anInt492 = 16;
		this.aByte16 = 0;
		this.aByte17 = 0;
		this.aStringArray8 = null;
		this.anInt493 = -1;
		this.anInt494 = -1;
		this.aBoolean137 = false;
		this.aBoolean138 = true;
		this.anInt495 = 128;
		this.anInt496 = 128;
		this.anInt497 = 128;
		this.anInt501 = 0;
		this.anInt498 = 0;
		this.anInt499 = 0;
		this.anInt500 = 0;
		this.aBoolean139 = false;
		this.aBoolean140 = false;
		this.anInt502 = -1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!lb;I)V")
	private void method288(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(14) int local14 = -1;
			while (true) {
				@Pc(25) int local25;
				@Pc(37) int local37;
				do {
					while (true) {
						@Pc(17) int local17 = arg0.method472();
						if (local17 == 0) {
							if (local14 == -1) {
								this.aBoolean133 = false;
								if (this.anIntArray155 != null && (this.anIntArray156 == null || this.anIntArray156[0] == 10)) {
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
							if (this.anInt502 == -1) {
								this.anInt502 = this.aBoolean131 ? 1 : 0;
								return;
							}
							return;
						}
						if (local17 == 1) {
							local25 = arg0.method472();
							break;
						}
						if (local17 == 2) {
							this.aString23 = arg0.method479();
						} else if (local17 == 3) {
							this.aByteArray4 = arg0.method480();
						} else if (local17 == 5) {
							local25 = arg0.method472();
							if (local25 > 0) {
								this.anIntArray156 = null;
								this.anIntArray155 = new int[local25];
								for (local37 = 0; local37 < local25; local37++) {
									this.anIntArray155[local37] = arg0.method474();
								}
							}
						} else if (local17 == 14) {
							this.anInt489 = arg0.method472();
						} else if (local17 == 15) {
							this.anInt490 = arg0.method472();
						} else if (local17 == 17) {
							this.aBoolean131 = false;
						} else if (local17 == 18) {
							this.aBoolean132 = false;
						} else if (local17 == 19) {
							local14 = arg0.method472();
							if (local14 == 1) {
								this.aBoolean133 = true;
							}
						} else if (local17 == 21) {
							this.aBoolean134 = true;
						} else if (local17 == 22) {
							this.aBoolean135 = true;
						} else if (local17 == 23) {
							this.aBoolean136 = true;
						} else if (local17 == 24) {
							this.anInt491 = arg0.method474();
							if (this.anInt491 == 65535) {
								this.anInt491 = -1;
							}
						} else if (local17 == 28) {
							this.anInt492 = arg0.method472();
						} else if (local17 == 29) {
							this.aByte16 = arg0.method473();
						} else if (local17 == 39) {
							this.aByte17 = arg0.method473();
						} else if (local17 >= 30 && local17 < 39) {
							if (this.aStringArray8 == null) {
								this.aStringArray8 = new String[5];
							}
							this.aStringArray8[local17 - 30] = arg0.method479();
							if (this.aStringArray8[local17 - 30].equalsIgnoreCase("hidden")) {
								this.aStringArray8[local17 - 30] = null;
							}
						} else if (local17 == 40) {
							local25 = arg0.method472();
							this.anIntArray157 = new int[local25];
							this.anIntArray158 = new int[local25];
							for (local37 = 0; local37 < local25; local37++) {
								this.anIntArray157[local37] = arg0.method474();
								this.anIntArray158[local37] = arg0.method474();
							}
						} else if (local17 == 60) {
							this.anInt493 = arg0.method474();
						} else if (local17 == 62) {
							this.aBoolean137 = true;
						} else if (local17 == 64) {
							this.aBoolean138 = false;
						} else if (local17 == 65) {
							this.anInt495 = arg0.method474();
						} else if (local17 == 66) {
							this.anInt496 = arg0.method474();
						} else if (local17 == 67) {
							this.anInt497 = arg0.method474();
						} else if (local17 == 68) {
							this.anInt494 = arg0.method474();
						} else if (local17 == 69) {
							this.anInt501 = arg0.method472();
						} else if (local17 == 70) {
							this.anInt498 = arg0.method475();
						} else if (local17 == 71) {
							this.anInt499 = arg0.method475();
						} else if (local17 == 72) {
							this.anInt500 = arg0.method475();
						} else if (local17 == 73) {
							this.aBoolean139 = true;
						} else if (local17 == 74) {
							this.aBoolean140 = true;
						} else if (local17 == 75) {
							this.anInt502 = arg0.method472();
						}
					}
				} while (local25 <= 0);
				this.anIntArray156 = new int[local25];
				this.anIntArray155 = new int[local25];
				for (local37 = 0; local37 < local25; local37++) {
					this.anIntArray155[local37] = arg0.method474();
					this.anIntArray156[local37] = arg0.method472();
				}
			}
		} catch (@Pc(469) RuntimeException local469) {
			signlink.reporterror("50230, " + arg0 + ", " + -32477 + ", " + local469.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)Z")
	public boolean method289(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 3) {
				this.aBoolean130 = !this.aBoolean130;
			}
			if (this.anIntArray156 != null) {
				for (@Pc(51) int local51 = 0; local51 < this.anIntArray156.length; local51++) {
					if (this.anIntArray156[local51] == arg1) {
						return Class1_Sub1_Sub1_Sub5.method260(this.anIntArray155[local51] & 0xFFFF);
					}
				}
				return true;
			} else if (this.anIntArray155 == null) {
				return true;
			} else if (arg1 == 10) {
				@Pc(27) boolean local27 = true;
				for (@Pc(29) int local29 = 0; local29 < this.anIntArray155.length; local29++) {
					local27 &= Class1_Sub1_Sub1_Sub5.method260(this.anIntArray155[local29] & 0xFFFF);
				}
				return local27;
			} else {
				return true;
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("67055, " + arg0 + ", " + arg1 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Z")
	public boolean method290() {
		try {
			if (this.anIntArray155 == null) {
				return true;
			}
			@Pc(16) boolean local16 = true;
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray155.length; local18++) {
				local16 &= Class1_Sub1_Sub1_Sub5.method260(this.anIntArray155[local18] & 0xFFFF);
			}
			return local16;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("16868, " + 3 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!ub;)V")
	public void method291(@OriginalArg(1) Class44_Sub1 arg0) {
		try {
			if (this.anIntArray155 != null) {
				for (@Pc(9) int local9 = 0; local9 < this.anIntArray155.length; local9++) {
					arg0.method642(0, this.anIntArray155[local9] & 0xFFFF);
				}
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("81691, " + 8 + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = this.method293(arg0, arg1, arg6);
		if (local6 == null) {
			return null;
		}
		if (this.aBoolean134 || this.aBoolean135) {
			local6 = new Class1_Sub1_Sub1_Sub5(-638, this.aBoolean135, local6, this.aBoolean134);
		}
		if (this.aBoolean134) {
			@Pc(39) int local39 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (@Pc(41) int local41 = 0; local41 < local6.anInt465; local41++) {
				@Pc(48) int local48 = local6.anIntArray117[local41];
				@Pc(53) int local53 = local6.anIntArray119[local41];
				@Pc(65) int local65 = arg2 + (arg3 - arg2) * (local48 + 64) / 128;
				@Pc(77) int local77 = arg5 + (arg4 - arg5) * (local48 + 64) / 128;
				@Pc(89) int local89 = local65 + (local77 - local65) * (local53 + 64) / 128;
				local6.anIntArray118[local41] += local89 - local39;
			}
			local6.method264();
		}
		return local6;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = null;
			@Pc(35) long local35;
			@Pc(59) boolean local59;
			@Pc(65) int local65;
			@Pc(182) Class1_Sub1_Sub1_Sub5 local182;
			if (this.anIntArray156 == null) {
				if (arg0 != 10) {
					return null;
				}
				local35 = (long) ((this.anInt488 << 6) + arg1) + ((long) (arg2 + 1) << 32);
				@Pc(40) Class1_Sub1_Sub1_Sub5 local40 = (Class1_Sub1_Sub1_Sub5) aClass40_5.method583(local35);
				if (local40 != null) {
					return local40;
				}
				if (this.anIntArray155 == null) {
					return null;
				}
				local59 = this.aBoolean137 ^ arg1 > 3;
				@Pc(63) int local63 = this.anIntArray155.length;
				for (local65 = 0; local65 < local63; local65++) {
					@Pc(71) int local71 = this.anIntArray155[local65];
					if (local59) {
						local71 += 65536;
					}
					local3 = (Class1_Sub1_Sub1_Sub5) aClass40_4.method583((long) local71);
					if (local3 == null) {
						local3 = Class1_Sub1_Sub1_Sub5.method259(this.aBoolean129, local71 & 0xFFFF);
						if (local3 == null) {
							return null;
						}
						if (local59) {
							local3.method274();
						}
						aClass40_4.method584((long) local71, local3, this.anInt485);
					}
					if (local63 > 1) {
						aClass1_Sub1_Sub1_Sub5Array1[local65] = local3;
					}
				}
				if (local63 > 1) {
					local3 = new Class1_Sub1_Sub1_Sub5(local63, aClass1_Sub1_Sub1_Sub5Array1, this.anInt484);
				}
			} else {
				@Pc(133) int local133 = -1;
				for (@Pc(135) int local135 = 0; local135 < this.anIntArray156.length; local135++) {
					if (this.anIntArray156[local135] == arg0) {
						local133 = local135;
						break;
					}
				}
				if (local133 == -1) {
					return null;
				}
				local35 = (long) ((this.anInt488 << 6) + (local133 << 3) + arg1) + ((long) (arg2 + 1) << 32);
				local182 = (Class1_Sub1_Sub1_Sub5) aClass40_5.method583(local35);
				if (local182 != null) {
					return local182;
				}
				local65 = this.anIntArray155[local133];
				@Pc(201) boolean local201 = this.aBoolean137 ^ arg1 > 3;
				if (local201) {
					local65 += 65536;
				}
				local3 = (Class1_Sub1_Sub1_Sub5) aClass40_4.method583((long) local65);
				if (local3 == null) {
					local3 = Class1_Sub1_Sub1_Sub5.method259(this.aBoolean129, local65 & 0xFFFF);
					if (local3 == null) {
						return null;
					}
					if (local201) {
						local3.method274();
					}
					aClass40_4.method584((long) local65, local3, this.anInt485);
				}
			}
			@Pc(252) boolean local252;
			if (this.anInt495 == 128 && this.anInt496 == 128 && this.anInt497 == 128) {
				local252 = false;
			} else {
				local252 = true;
			}
			if (this.anInt498 == 0 && this.anInt499 == 0 && this.anInt500 == 0) {
				local59 = false;
			} else {
				local59 = true;
			}
			local182 = new Class1_Sub1_Sub1_Sub5(arg1 == 0 && arg2 == -1 && !local252 && !local59, this.anIntArray157 == null, local3, Class12.method303(arg2, 681), 9);
			if (arg2 != -1) {
				local182.method266();
				local182.method267(arg2);
				local182.anIntArrayArray9 = null;
				local182.anIntArrayArray8 = null;
			}
			while (arg1-- > 0) {
				local182.method270((byte) 4);
			}
			if (this.anIntArray157 != null) {
				for (local65 = 0; local65 < this.anIntArray157.length; local65++) {
					local182.method273(this.anIntArray157[local65], this.anIntArray158[local65]);
				}
			}
			if (local252) {
				local182.method275(this.anInt497, this.anInt496, this.anInt495);
			}
			if (local59) {
				local182.method272(this.anInt498, this.anInt499, this.anInt500);
			}
			local182.method276(this.aByte16 + 64, this.aByte17 * 5 + 768, -50, -10, -50, !this.aBoolean135);
			if (this.anInt502 == 1) {
				local182.anInt477 = local182.anInt959;
			}
			aClass40_5.method584(local35, local182, this.anInt485);
			return local182;
		} catch (@Pc(405) RuntimeException local405) {
			signlink.reporterror("64440, " + arg0 + ", " + arg1 + ", " + 913 + ", " + arg2 + ", " + local405.toString());
			throw new RuntimeException();
		}
	}
}
