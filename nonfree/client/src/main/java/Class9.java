import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class Class9 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	private static int anInt505;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
	private static int[] anIntArray154;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "[Lclient!ec;")
	private static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	private static int anInt506;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	private static int anInt504 = -747;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "[Lclient!eb;")
	private static Class1_Sub1_Sub1_Sub5[] aClass1_Sub1_Sub1_Sub5Array1 = new Class1_Sub1_Sub1_Sub5[4];

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "Lclient!s;")
	public static Class40 aClass40_4 = new Class40(false, 500);

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "Lclient!s;")
	public static Class40 aClass40_5 = new Class40(false, 30);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	private int anInt502;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	public int anInt508;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
	public int anInt509;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Z")
	public boolean aBoolean126;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Z")
	public boolean aBoolean127;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "Z")
	public boolean aBoolean128;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
	public boolean aBoolean129;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Z")
	private boolean aBoolean130;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Z")
	public boolean aBoolean131;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
	public int anInt510;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
	public int anInt511;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "B")
	private byte aByte12;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "B")
	private byte aByte13;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray8;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
	public int anInt512;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
	public int anInt513;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "Z")
	private boolean aBoolean132;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "Z")
	public boolean aBoolean133;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
	private int anInt514;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
	private int anInt515;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
	private int anInt516;

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
	private int anInt517;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
	private int anInt518;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
	private int anInt519;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
	public int anInt520;

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "Z")
	public boolean aBoolean134;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "Z")
	private boolean aBoolean135;

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
	private int anInt521;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	private int anInt503 = 438;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
	private int anInt507 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method285(@OriginalArg(0) Class47 arg0) {
		aClass1_Sub1_Sub3_5 = new Class1_Sub1_Sub3(arg0.method660("loc.dat", null), 185);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method660("loc.idx", null), 185);
		anInt505 = local19.method476();
		anIntArray154 = new int[anInt505];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt505; local29++) {
			anIntArray154[local29] = local27;
			local27 += local19.method476();
		}
		aClass9Array1 = new Class9[10];
		for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
			aClass9Array1[local49] = new Class9();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method286() {
		try {
			aClass40_4 = null;
			aClass40_5 = null;
			anIntArray154 = null;
			aClass9Array1 = null;
			aClass1_Sub1_Sub3_5 = null;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("49423, " + 0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Lclient!ec;")
	public static Class9 method287(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass9Array1[local1].anInt507 == arg0) {
				return aClass9Array1[local1];
			}
		}
		anInt506 = (anInt506 + 1) % 10;
		@Pc(27) Class9 local27 = aClass9Array1[anInt506];
		aClass1_Sub1_Sub3_5.anInt738 = anIntArray154[arg0];
		local27.anInt507 = arg0;
		local27.method288();
		local27.method289(aClass1_Sub1_Sub3_5);
		return local27;
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	private Class9() {
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
	private void method288() {
		this.anIntArray155 = null;
		this.anIntArray156 = null;
		this.aString23 = null;
		this.aByteArray4 = null;
		this.anIntArray157 = null;
		this.anIntArray158 = null;
		this.anInt508 = 1;
		this.anInt509 = 1;
		this.aBoolean126 = true;
		this.aBoolean127 = true;
		this.aBoolean128 = false;
		this.aBoolean129 = false;
		this.aBoolean130 = false;
		this.aBoolean131 = false;
		this.anInt510 = -1;
		this.anInt511 = 16;
		this.aByte12 = 0;
		this.aByte13 = 0;
		this.aStringArray8 = null;
		this.anInt512 = -1;
		this.anInt513 = -1;
		this.aBoolean132 = false;
		this.aBoolean133 = true;
		this.anInt514 = 128;
		this.anInt515 = 128;
		this.anInt516 = 128;
		this.anInt520 = 0;
		this.anInt517 = 0;
		this.anInt518 = 0;
		this.anInt519 = 0;
		this.aBoolean134 = false;
		this.aBoolean135 = false;
		this.anInt521 = -1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!lb;B)V")
	private void method289(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(21) int local21;
				@Pc(33) int local33;
				do {
					while (true) {
						@Pc(13) int local13 = arg0.method474();
						if (local13 == 0) {
							if (local3 == -1) {
								this.aBoolean128 = false;
								if (this.anIntArray155 != null && (this.anIntArray156 == null || this.anIntArray156[0] == 10)) {
									this.aBoolean128 = true;
								}
								if (this.aStringArray8 != null) {
									this.aBoolean128 = true;
								}
							}
							if (this.aBoolean135) {
								this.aBoolean126 = false;
								this.aBoolean127 = false;
							}
							if (this.anInt521 == -1) {
								this.anInt521 = this.aBoolean126 ? 1 : 0;
								return;
							}
							return;
						}
						if (local13 == 1) {
							local21 = arg0.method474();
							break;
						}
						if (local13 == 2) {
							this.aString23 = arg0.method481();
						} else if (local13 == 3) {
							this.aByteArray4 = arg0.method482();
						} else if (local13 == 5) {
							local21 = arg0.method474();
							if (local21 > 0) {
								this.anIntArray156 = null;
								this.anIntArray155 = new int[local21];
								for (local33 = 0; local33 < local21; local33++) {
									this.anIntArray155[local33] = arg0.method476();
								}
							}
						} else if (local13 == 14) {
							this.anInt508 = arg0.method474();
						} else if (local13 == 15) {
							this.anInt509 = arg0.method474();
						} else if (local13 == 17) {
							this.aBoolean126 = false;
						} else if (local13 == 18) {
							this.aBoolean127 = false;
						} else if (local13 == 19) {
							local3 = arg0.method474();
							if (local3 == 1) {
								this.aBoolean128 = true;
							}
						} else if (local13 == 21) {
							this.aBoolean129 = true;
						} else if (local13 == 22) {
							this.aBoolean130 = true;
						} else if (local13 == 23) {
							this.aBoolean131 = true;
						} else if (local13 == 24) {
							this.anInt510 = arg0.method476();
							if (this.anInt510 == 65535) {
								this.anInt510 = -1;
							}
						} else if (local13 == 28) {
							this.anInt511 = arg0.method474();
						} else if (local13 == 29) {
							this.aByte12 = arg0.method475();
						} else if (local13 == 39) {
							this.aByte13 = arg0.method475();
						} else if (local13 >= 30 && local13 < 39) {
							if (this.aStringArray8 == null) {
								this.aStringArray8 = new String[5];
							}
							this.aStringArray8[local13 - 30] = arg0.method481();
							if (this.aStringArray8[local13 - 30].equalsIgnoreCase("hidden")) {
								this.aStringArray8[local13 - 30] = null;
							}
						} else if (local13 == 40) {
							local21 = arg0.method474();
							this.anIntArray157 = new int[local21];
							this.anIntArray158 = new int[local21];
							for (local33 = 0; local33 < local21; local33++) {
								this.anIntArray157[local33] = arg0.method476();
								this.anIntArray158[local33] = arg0.method476();
							}
						} else if (local13 == 60) {
							this.anInt512 = arg0.method476();
						} else if (local13 == 62) {
							this.aBoolean132 = true;
						} else if (local13 == 64) {
							this.aBoolean133 = false;
						} else if (local13 == 65) {
							this.anInt514 = arg0.method476();
						} else if (local13 == 66) {
							this.anInt515 = arg0.method476();
						} else if (local13 == 67) {
							this.anInt516 = arg0.method476();
						} else if (local13 == 68) {
							this.anInt513 = arg0.method476();
						} else if (local13 == 69) {
							this.anInt520 = arg0.method474();
						} else if (local13 == 70) {
							this.anInt517 = arg0.method477();
						} else if (local13 == 71) {
							this.anInt518 = arg0.method477();
						} else if (local13 == 72) {
							this.anInt519 = arg0.method477();
						} else if (local13 == 73) {
							this.aBoolean134 = true;
						} else if (local13 == 74) {
							this.aBoolean135 = true;
						} else if (local13 == 75) {
							this.anInt521 = arg0.method474();
						}
					}
				} while (local21 <= 0);
				this.anIntArray156 = new int[local21];
				this.anIntArray155 = new int[local21];
				for (local33 = 0; local33 < local21; local33++) {
					this.anIntArray155[local33] = arg0.method476();
					this.anIntArray156[local33] = arg0.method474();
				}
			}
		} catch (@Pc(465) RuntimeException local465) {
			signlink.reporterror("97423, " + arg0 + ", " + 81 + ", " + local465.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZI)Z")
	public boolean method290(@OriginalArg(1) int arg0) {
		try {
			if (this.anIntArray156 != null) {
				for (@Pc(44) int local44 = 0; local44 < this.anIntArray156.length; local44++) {
					if (this.anIntArray156[local44] == arg0) {
						return Class1_Sub1_Sub1_Sub5.method261(this.anIntArray155[local44] & 0xFFFF);
					}
				}
				return true;
			} else if (this.anIntArray155 == null) {
				return true;
			} else if (arg0 == 10) {
				@Pc(20) boolean local20 = true;
				for (@Pc(22) int local22 = 0; local22 < this.anIntArray155.length; local22++) {
					local20 &= Class1_Sub1_Sub1_Sub5.method261(this.anIntArray155[local22] & 0xFFFF);
				}
				return local20;
			} else {
				return true;
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("68846, " + false + ", " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)Z")
	public boolean method291() {
		try {
			if (this.anIntArray155 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(8) int local8 = 0; local8 < this.anIntArray155.length; local8++) {
				local6 &= Class1_Sub1_Sub1_Sub5.method261(this.anIntArray155[local8] & 0xFFFF);
			}
			return local6;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("44819, " + 1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ub;I)V")
	public void method292(@OriginalArg(0) Class44_Sub1 arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anIntArray155 != null) {
				for (@Pc(7) int local7 = 0; local7 < this.anIntArray155.length; local7++) {
					arg0.method644(0, this.anIntArray155[local7] & 0xFFFF);
				}
				if (arg1 != -26443) {
					for (@Pc(30) int local30 = 1; local30 > 0; local30++) {
					}
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("22059, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = this.method294(402, arg6, arg1, arg0);
		if (local6 == null) {
			return null;
		}
		if (this.aBoolean129 || this.aBoolean130) {
			local6 = new Class1_Sub1_Sub1_Sub5(this.aBoolean130, local6, true, this.aBoolean129);
		}
		if (this.aBoolean129) {
			@Pc(39) int local39 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (@Pc(41) int local41 = 0; local41 < local6.anInt483; local41++) {
				@Pc(48) int local48 = local6.anIntArray117[local41];
				@Pc(53) int local53 = local6.anIntArray119[local41];
				@Pc(65) int local65 = arg2 + (arg3 - arg2) * (local48 + 64) / 128;
				@Pc(77) int local77 = arg5 + (arg4 - arg5) * (local48 + 64) / 128;
				@Pc(89) int local89 = local65 + (local77 - local65) * (local53 + 64) / 128;
				local6.anIntArray118[local41] += local89 - local39;
			}
			local6.method265();
		}
		return local6;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(7) Class1_Sub1_Sub1_Sub5 local7 = null;
			@Pc(30) long local30;
			@Pc(54) boolean local54;
			@Pc(60) int local60;
			@Pc(175) Class1_Sub1_Sub1_Sub5 local175;
			if (this.anIntArray156 == null) {
				if (arg3 != 10) {
					return null;
				}
				local30 = (long) ((this.anInt507 << 6) + arg2) + ((long) (arg1 + 1) << 32);
				@Pc(35) Class1_Sub1_Sub1_Sub5 local35 = (Class1_Sub1_Sub1_Sub5) aClass40_5.method585(local30);
				if (local35 != null) {
					return local35;
				}
				if (this.anIntArray155 == null) {
					return null;
				}
				local54 = this.aBoolean132 ^ arg2 > 3;
				@Pc(58) int local58 = this.anIntArray155.length;
				for (local60 = 0; local60 < local58; local60++) {
					@Pc(66) int local66 = this.anIntArray155[local60];
					if (local54) {
						local66 += 65536;
					}
					local7 = (Class1_Sub1_Sub1_Sub5) aClass40_4.method585((long) local66);
					if (local7 == null) {
						local7 = Class1_Sub1_Sub1_Sub5.method260(local66 & 0xFFFF);
						if (local7 == null) {
							return null;
						}
						if (local54) {
							local7.method275(this.anInt503);
						}
						aClass40_4.method586(400, local7, (long) local66);
					}
					if (local58 > 1) {
						aClass1_Sub1_Sub1_Sub5Array1[local60] = local7;
					}
				}
				if (local58 > 1) {
					local7 = new Class1_Sub1_Sub1_Sub5((byte) 3, local58, aClass1_Sub1_Sub1_Sub5Array1);
				}
			} else {
				@Pc(126) int local126 = -1;
				for (@Pc(128) int local128 = 0; local128 < this.anIntArray156.length; local128++) {
					if (this.anIntArray156[local128] == arg3) {
						local126 = local128;
						break;
					}
				}
				if (local126 == -1) {
					return null;
				}
				local30 = (long) ((this.anInt507 << 6) + (local126 << 3) + arg2) + ((long) (arg1 + 1) << 32);
				local175 = (Class1_Sub1_Sub1_Sub5) aClass40_5.method585(local30);
				if (local175 != null) {
					return local175;
				}
				local60 = this.anIntArray155[local126];
				@Pc(194) boolean local194 = this.aBoolean132 ^ arg2 > 3;
				if (local194) {
					local60 += 65536;
				}
				local7 = (Class1_Sub1_Sub1_Sub5) aClass40_4.method585((long) local60);
				if (local7 == null) {
					local7 = Class1_Sub1_Sub1_Sub5.method260(local60 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local194) {
						local7.method275(this.anInt503);
					}
					aClass40_4.method586(400, local7, (long) local60);
				}
			}
			@Pc(244) boolean local244;
			if (this.anInt514 == 128 && this.anInt515 == 128 && this.anInt516 == 128) {
				local244 = false;
			} else {
				local244 = true;
			}
			if (this.anInt517 == 0 && this.anInt518 == 0 && this.anInt519 == 0) {
				local54 = false;
			} else {
				local54 = true;
			}
			local175 = new Class1_Sub1_Sub1_Sub5(9, arg2 == 0 && arg1 == -1 && !local244 && !local54, Class12.method304(this.anInt502, arg1), this.anIntArray157 == null, local7);
			if (arg1 != -1) {
				local175.method267();
				local175.method268(arg1);
				local175.anIntArrayArray9 = null;
				local175.anIntArrayArray8 = null;
			}
			while (arg2-- > 0) {
				local175.method271();
			}
			if (this.anIntArray157 != null) {
				for (local60 = 0; local60 < this.anIntArray157.length; local60++) {
					local175.method274(this.anIntArray157[local60], this.anIntArray158[local60]);
				}
			}
			if (local244) {
				local175.method276(this.anInt516, this.anInt514, this.anInt515);
			}
			if (local54) {
				local175.method273(this.anInt517, this.anInt518, this.anInt519);
			}
			local175.method277(this.aByte12 + 64, this.aByte13 * 5 + 768, -50, -10, -50, !this.aBoolean130);
			if (this.anInt521 == 1) {
				local175.anInt495 = local175.anInt984;
			}
			aClass40_5.method586(400, local175, local30);
			return local175;
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("58468, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local397.toString());
			throw new RuntimeException();
		}
	}
}
