import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class Class9 {

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	private static int anInt506;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "[I")
	private static int[] anIntArray154;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "[Lclient!ec;")
	private static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
	private static int anInt507;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "[Lclient!eb;")
	private static Class1_Sub1_Sub1_Sub5[] aClass1_Sub1_Sub1_Sub5Array1 = new Class1_Sub1_Sub1_Sub5[4];

	@OriginalMember(owner = "client!ec", name = "T", descriptor = "Lclient!s;")
	public static Class40 aClass40_4 = new Class40(500, 0);

	@OriginalMember(owner = "client!ec", name = "U", descriptor = "Lclient!s;")
	public static Class40 aClass40_5 = new Class40(30, 0);

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	private int anInt504;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	private int anInt505;

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
	public int anInt509;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
	public int anInt510;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "Z")
	public boolean aBoolean120;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
	public boolean aBoolean121;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Z")
	public boolean aBoolean122;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Z")
	public boolean aBoolean123;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "Z")
	private boolean aBoolean124;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "Z")
	public boolean aBoolean125;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
	public int anInt511;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
	public int anInt512;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "B")
	private byte aByte24;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "B")
	private byte aByte25;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray8;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
	public int anInt513;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
	public int anInt514;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "Z")
	private boolean aBoolean126;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "Z")
	public boolean aBoolean127;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
	private int anInt515;

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
	private int anInt516;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
	private int anInt517;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
	private int anInt518;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
	private int anInt519;

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
	private int anInt520;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
	public int anInt521;

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "Z")
	public boolean aBoolean128;

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "Z")
	private boolean aBoolean129;

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
	private int anInt522;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	private int anInt503 = -32952;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Z")
	private boolean aBoolean118 = false;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
	private int anInt508 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method285(@OriginalArg(0) Class47 arg0) {
		aClass1_Sub1_Sub3_5 = new Class1_Sub1_Sub3(arg0.method659("loc.dat", null), (byte) 1);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method659("loc.idx", null), (byte) 1);
		anInt506 = local19.method475();
		anIntArray154 = new int[anInt506];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt506; local29++) {
			anIntArray154[local29] = local27;
			local27 += local19.method475();
		}
		aClass9Array1 = new Class9[10];
		for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
			aClass9Array1[local49] = new Class9();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method286(@OriginalArg(0) byte arg0) {
		try {
			aClass40_4 = null;
			aClass40_5 = null;
			anIntArray154 = null;
			aClass9Array1 = null;
			aClass1_Sub1_Sub3_5 = null;
			@Pc(14) boolean local14 = false;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("79978, " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lclient!ec;")
	public static Class9 method287(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass9Array1[local1].anInt508 == arg0) {
				return aClass9Array1[local1];
			}
		}
		anInt507 = (anInt507 + 1) % 10;
		@Pc(27) Class9 local27 = aClass9Array1[anInt507];
		aClass1_Sub1_Sub3_5.anInt743 = anIntArray154[arg0];
		local27.anInt508 = arg0;
		local27.method288();
		local27.method289((byte) 2, aClass1_Sub1_Sub3_5);
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
		this.anInt509 = 1;
		this.anInt510 = 1;
		this.aBoolean120 = true;
		this.aBoolean121 = true;
		this.aBoolean122 = false;
		this.aBoolean123 = false;
		this.aBoolean124 = false;
		this.aBoolean125 = false;
		this.anInt511 = -1;
		this.anInt512 = 16;
		this.aByte24 = 0;
		this.aByte25 = 0;
		this.aStringArray8 = null;
		this.anInt513 = -1;
		this.anInt514 = -1;
		this.aBoolean126 = false;
		this.aBoolean127 = true;
		this.anInt515 = 128;
		this.anInt516 = 128;
		this.anInt517 = 128;
		this.anInt521 = 0;
		this.anInt518 = 0;
		this.anInt519 = 0;
		this.anInt520 = 0;
		this.aBoolean128 = false;
		this.aBoolean129 = false;
		this.anInt522 = -1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!lb;)V")
	private void method289(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(13) int local13 = -1;
			while (true) {
				@Pc(24) int local24;
				@Pc(36) int local36;
				do {
					while (true) {
						@Pc(16) int local16 = arg1.method473();
						if (local16 == 0) {
							if (local13 == -1) {
								this.aBoolean122 = false;
								if (this.anIntArray155 != null && (this.anIntArray156 == null || this.anIntArray156[0] == 10)) {
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
							if (this.anInt522 == -1) {
								this.anInt522 = this.aBoolean120 ? 1 : 0;
								return;
							}
							return;
						}
						if (local16 == 1) {
							local24 = arg1.method473();
							break;
						}
						if (local16 == 2) {
							this.aString23 = arg1.method480();
						} else if (local16 == 3) {
							this.aByteArray4 = arg1.method481(this.anInt503);
						} else if (local16 == 5) {
							local24 = arg1.method473();
							if (local24 > 0) {
								this.anIntArray156 = null;
								this.anIntArray155 = new int[local24];
								for (local36 = 0; local36 < local24; local36++) {
									this.anIntArray155[local36] = arg1.method475();
								}
							}
						} else if (local16 == 14) {
							this.anInt509 = arg1.method473();
						} else if (local16 == 15) {
							this.anInt510 = arg1.method473();
						} else if (local16 == 17) {
							this.aBoolean120 = false;
						} else if (local16 == 18) {
							this.aBoolean121 = false;
						} else if (local16 == 19) {
							local13 = arg1.method473();
							if (local13 == 1) {
								this.aBoolean122 = true;
							}
						} else if (local16 == 21) {
							this.aBoolean123 = true;
						} else if (local16 == 22) {
							this.aBoolean124 = true;
						} else if (local16 == 23) {
							this.aBoolean125 = true;
						} else if (local16 == 24) {
							this.anInt511 = arg1.method475();
							if (this.anInt511 == 65535) {
								this.anInt511 = -1;
							}
						} else if (local16 == 28) {
							this.anInt512 = arg1.method473();
						} else if (local16 == 29) {
							this.aByte24 = arg1.method474();
						} else if (local16 == 39) {
							this.aByte25 = arg1.method474();
						} else if (local16 >= 30 && local16 < 39) {
							if (this.aStringArray8 == null) {
								this.aStringArray8 = new String[5];
							}
							this.aStringArray8[local16 - 30] = arg1.method480();
							if (this.aStringArray8[local16 - 30].equalsIgnoreCase("hidden")) {
								this.aStringArray8[local16 - 30] = null;
							}
						} else if (local16 == 40) {
							local24 = arg1.method473();
							this.anIntArray157 = new int[local24];
							this.anIntArray158 = new int[local24];
							for (local36 = 0; local36 < local24; local36++) {
								this.anIntArray157[local36] = arg1.method475();
								this.anIntArray158[local36] = arg1.method475();
							}
						} else if (local16 == 60) {
							this.anInt513 = arg1.method475();
						} else if (local16 == 62) {
							this.aBoolean126 = true;
						} else if (local16 == 64) {
							this.aBoolean127 = false;
						} else if (local16 == 65) {
							this.anInt515 = arg1.method475();
						} else if (local16 == 66) {
							this.anInt516 = arg1.method475();
						} else if (local16 == 67) {
							this.anInt517 = arg1.method475();
						} else if (local16 == 68) {
							this.anInt514 = arg1.method475();
						} else if (local16 == 69) {
							this.anInt521 = arg1.method473();
						} else if (local16 == 70) {
							this.anInt518 = arg1.method476();
						} else if (local16 == 71) {
							this.anInt519 = arg1.method476();
						} else if (local16 == 72) {
							this.anInt520 = arg1.method476();
						} else if (local16 == 73) {
							this.aBoolean128 = true;
						} else if (local16 == 74) {
							this.aBoolean129 = true;
						} else if (local16 == 75) {
							this.anInt522 = arg1.method473();
						}
					}
				} while (local24 <= 0);
				this.anIntArray156 = new int[local24];
				this.anIntArray155 = new int[local24];
				for (local36 = 0; local36 < local24; local36++) {
					this.anIntArray155[local36] = arg1.method475();
					this.anIntArray156[local36] = arg1.method473();
				}
			}
		} catch (@Pc(469) RuntimeException local469) {
			signlink.reporterror("70071, " + arg0 + ", " + arg1 + ", " + local469.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
	public boolean method290(@OriginalArg(1) int arg0) {
		try {
			if (this.anIntArray156 != null) {
				for (@Pc(49) int local49 = 0; local49 < this.anIntArray156.length; local49++) {
					if (this.anIntArray156[local49] == arg0) {
						return Class1_Sub1_Sub1_Sub5.method261(this.anIntArray155[local49] & 0xFFFF);
					}
				}
				return true;
			} else if (this.anIntArray155 == null) {
				return true;
			} else if (arg0 == 10) {
				@Pc(25) boolean local25 = true;
				for (@Pc(27) int local27 = 0; local27 < this.anIntArray155.length; local27++) {
					local25 &= Class1_Sub1_Sub1_Sub5.method261(this.anIntArray155[local27] & 0xFFFF);
				}
				return local25;
			} else {
				return true;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("23087, " + 0 + ", " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)Z")
	public boolean method291() {
		try {
			if (this.anIntArray155 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray155.length; local13++) {
				local6 &= Class1_Sub1_Sub1_Sub5.method261(this.anIntArray155[local13] & 0xFFFF);
			}
			return local6;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("60165, " + true + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!ub;)V")
	public void method292(@OriginalArg(1) Class44_Sub1 arg0) {
		try {
			if (this.anIntArray155 != null) {
				for (@Pc(5) int local5 = 0; local5 < this.anIntArray155.length; local5++) {
					arg0.method643(0, this.anIntArray155[local5] & 0xFFFF);
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("84484, " + 0 + ", " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = this.method294(arg1, arg6, arg0);
		if (local6 == null) {
			return null;
		}
		if (this.aBoolean123 || this.aBoolean124) {
			local6 = new Class1_Sub1_Sub1_Sub5(this.aBoolean124, (byte) 72, local6, this.aBoolean123);
		}
		if (this.aBoolean123) {
			@Pc(39) int local39 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (@Pc(41) int local41 = 0; local41 < local6.anInt484; local41++) {
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

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZII)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method294(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = null;
			@Pc(26) long local26;
			@Pc(50) boolean local50;
			@Pc(56) int local56;
			@Pc(170) Class1_Sub1_Sub1_Sub5 local170;
			if (this.anIntArray156 == null) {
				if (arg2 != 10) {
					return null;
				}
				local26 = (long) ((this.anInt508 << 6) + arg0) + ((long) (arg1 + 1) << 32);
				@Pc(31) Class1_Sub1_Sub1_Sub5 local31 = (Class1_Sub1_Sub1_Sub5) aClass40_5.method584(local26);
				if (local31 != null) {
					return local31;
				}
				if (this.anIntArray155 == null) {
					return null;
				}
				local50 = this.aBoolean126 ^ arg0 > 3;
				@Pc(54) int local54 = this.anIntArray155.length;
				for (local56 = 0; local56 < local54; local56++) {
					@Pc(62) int local62 = this.anIntArray155[local56];
					if (local50) {
						local62 += 65536;
					}
					local3 = (Class1_Sub1_Sub1_Sub5) aClass40_4.method584((long) local62);
					if (local3 == null) {
						local3 = Class1_Sub1_Sub1_Sub5.method260(local62 & 0xFFFF);
						if (local3 == null) {
							return null;
						}
						if (local50) {
							local3.method275();
						}
						aClass40_4.method585(201, (long) local62, local3);
					}
					if (local54 > 1) {
						aClass1_Sub1_Sub1_Sub5Array1[local56] = local3;
					}
				}
				if (local54 > 1) {
					local3 = new Class1_Sub1_Sub1_Sub5(local54, -643, aClass1_Sub1_Sub1_Sub5Array1);
				}
			} else {
				@Pc(121) int local121 = -1;
				for (@Pc(123) int local123 = 0; local123 < this.anIntArray156.length; local123++) {
					if (this.anIntArray156[local123] == arg2) {
						local121 = local123;
						break;
					}
				}
				if (local121 == -1) {
					return null;
				}
				local26 = (long) ((this.anInt508 << 6) + (local121 << 3) + arg0) + ((long) (arg1 + 1) << 32);
				local170 = (Class1_Sub1_Sub1_Sub5) aClass40_5.method584(local26);
				if (local170 != null) {
					return local170;
				}
				local56 = this.anIntArray155[local121];
				@Pc(189) boolean local189 = this.aBoolean126 ^ arg0 > 3;
				if (local189) {
					local56 += 65536;
				}
				local3 = (Class1_Sub1_Sub1_Sub5) aClass40_4.method584((long) local56);
				if (local3 == null) {
					local3 = Class1_Sub1_Sub1_Sub5.method260(local56 & 0xFFFF);
					if (local3 == null) {
						return null;
					}
					if (local189) {
						local3.method275();
					}
					aClass40_4.method585(201, (long) local56, local3);
				}
			}
			@Pc(238) boolean local238;
			if (this.anInt515 == 128 && this.anInt516 == 128 && this.anInt517 == 128) {
				local238 = false;
			} else {
				local238 = true;
			}
			if (this.anInt518 == 0 && this.anInt519 == 0 && this.anInt520 == 0) {
				local50 = false;
			} else {
				local50 = true;
			}
			local170 = new Class1_Sub1_Sub1_Sub5(this.anIntArray157 == null, Class12.method304(arg1), local3, true, arg0 == 0 && arg1 == -1 && !local238 && !local50);
			if (arg1 != -1) {
				local170.method267();
				local170.method268(arg1);
				local170.anIntArrayArray9 = null;
				local170.anIntArrayArray8 = null;
			}
			while (arg0-- > 0) {
				local170.method271();
			}
			if (this.anIntArray157 != null) {
				for (local56 = 0; local56 < this.anIntArray157.length; local56++) {
					local170.method274(this.anIntArray157[local56], this.anIntArray158[local56]);
				}
			}
			if (local238) {
				local170.method276(this.anInt517, this.anInt515, this.anInt516);
			}
			if (local50) {
				local170.method273(this.anInt518, this.anInt519, this.anInt520);
			}
			local170.method277(this.aByte24 + 64, this.aByte25 * 5 + 768, -50, -10, -50, !this.aBoolean124);
			if (this.anInt522 == 1) {
				local170.anInt496 = local170.anInt989;
			}
			aClass40_5.method585(201, local26, local170);
			return local170;
		} catch (@Pc(396) RuntimeException local396) {
			signlink.reporterror("21743, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local396.toString());
			throw new RuntimeException();
		}
	}
}
