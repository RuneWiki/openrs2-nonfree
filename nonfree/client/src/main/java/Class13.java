import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "I")
	private static int anInt592;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "[I")
	private static int[] anIntArray158;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_9;

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "[Lclient!gc;")
	private static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "I")
	private static int anInt593;

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "Z")
	public static boolean aBoolean121 = true;

	@OriginalMember(owner = "client!gc", name = "U", descriptor = "Lclient!t;")
	public static Class39 aClass39_7 = new Class39(5, 50);

	@OriginalMember(owner = "client!gc", name = "V", descriptor = "Lclient!t;")
	public static Class39 aClass39_8 = new Class39(5, 100);

	@OriginalMember(owner = "client!gc", name = "m", descriptor = "I")
	private int anInt595;

	@OriginalMember(owner = "client!gc", name = "n", descriptor = "Ljava/lang/String;")
	public String aString26;

	@OriginalMember(owner = "client!gc", name = "o", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!gc", name = "q", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!gc", name = "r", descriptor = "I")
	public int anInt596;

	@OriginalMember(owner = "client!gc", name = "s", descriptor = "I")
	public int anInt597;

	@OriginalMember(owner = "client!gc", name = "t", descriptor = "I")
	public int anInt598;

	@OriginalMember(owner = "client!gc", name = "u", descriptor = "I")
	private int anInt599;

	@OriginalMember(owner = "client!gc", name = "v", descriptor = "I")
	private int anInt600;

	@OriginalMember(owner = "client!gc", name = "w", descriptor = "I")
	private int anInt601;

	@OriginalMember(owner = "client!gc", name = "x", descriptor = "Z")
	private boolean aBoolean122;

	@OriginalMember(owner = "client!gc", name = "y", descriptor = "I")
	private int anInt602;

	@OriginalMember(owner = "client!gc", name = "z", descriptor = "Z")
	public boolean aBoolean123;

	@OriginalMember(owner = "client!gc", name = "A", descriptor = "I")
	public int anInt603;

	@OriginalMember(owner = "client!gc", name = "B", descriptor = "Z")
	private boolean aBoolean124;

	@OriginalMember(owner = "client!gc", name = "C", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray9;

	@OriginalMember(owner = "client!gc", name = "D", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray10;

	@OriginalMember(owner = "client!gc", name = "E", descriptor = "I")
	private int anInt604;

	@OriginalMember(owner = "client!gc", name = "F", descriptor = "I")
	private int anInt605;

	@OriginalMember(owner = "client!gc", name = "G", descriptor = "B")
	private byte aByte32;

	@OriginalMember(owner = "client!gc", name = "H", descriptor = "I")
	private int anInt606;

	@OriginalMember(owner = "client!gc", name = "I", descriptor = "I")
	private int anInt607;

	@OriginalMember(owner = "client!gc", name = "J", descriptor = "B")
	private byte aByte33;

	@OriginalMember(owner = "client!gc", name = "K", descriptor = "I")
	private int anInt608;

	@OriginalMember(owner = "client!gc", name = "L", descriptor = "I")
	private int anInt609;

	@OriginalMember(owner = "client!gc", name = "M", descriptor = "I")
	private int anInt610;

	@OriginalMember(owner = "client!gc", name = "N", descriptor = "I")
	private int anInt611;

	@OriginalMember(owner = "client!gc", name = "O", descriptor = "I")
	private int anInt612;

	@OriginalMember(owner = "client!gc", name = "P", descriptor = "I")
	private int anInt613;

	@OriginalMember(owner = "client!gc", name = "Q", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!gc", name = "R", descriptor = "[I")
	private int[] anIntArray162;

	@OriginalMember(owner = "client!gc", name = "S", descriptor = "I")
	private int anInt614;

	@OriginalMember(owner = "client!gc", name = "T", descriptor = "I")
	private int anInt615;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "I")
	private int anInt589 = -797;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "I")
	private int anInt590 = -45277;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "I")
	private int anInt591 = 57;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "Z")
	private boolean aBoolean120 = true;

	@OriginalMember(owner = "client!gc", name = "l", descriptor = "I")
	public int anInt594 = -1;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method315(@OriginalArg(0) Class45 arg0) {
		aClass1_Sub1_Sub3_9 = new Class1_Sub1_Sub3(arg0.method644("obj.dat", null), true);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method644("obj.idx", null), true);
		anInt592 = local19.method470();
		anIntArray158 = new int[anInt592];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt592; local29++) {
			anIntArray158[local29] = local27;
			local27 += local19.method470();
		}
		aClass13Array1 = new Class13[10];
		for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
			aClass13Array1[local49] = new Class13();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(B)V")
	public static void method316(@OriginalArg(0) byte arg0) {
		try {
			aClass39_7 = null;
			@Pc(8) boolean local8 = false;
			aClass39_8 = null;
			anIntArray158 = null;
			aClass13Array1 = null;
			aClass1_Sub1_Sub3_9 = null;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("12385, " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(I)Lclient!gc;")
	public static Class13 method317(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass13Array1[local1].anInt594 == arg0) {
				return aClass13Array1[local1];
			}
		}
		anInt593 = (anInt593 + 1) % 10;
		@Pc(27) Class13 local27 = aClass13Array1[anInt593];
		aClass1_Sub1_Sub3_9.anInt777 = anIntArray158[arg0];
		local27.anInt594 = arg0;
		local27.method318();
		local27.method319(aClass1_Sub1_Sub3_9);
		if (local27.anInt615 != -1) {
			local27.method320();
		}
		if (!aBoolean121 && local27.aBoolean124) {
			local27.aString26 = "Members Object";
			local27.aByteArray6 = "Login to a members' server to use this object.".getBytes();
			local27.aStringArray9 = null;
			local27.aStringArray10 = null;
		}
		return local27;
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(III)Lclient!jb;")
	public static Class1_Sub1_Sub2_Sub2 method323(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(7) Class1_Sub1_Sub2_Sub2 local7 = (Class1_Sub1_Sub2_Sub2) aClass39_8.method609((long) arg1);
			if (local7 != null && local7.anInt690 != arg0 && local7.anInt690 != -1) {
				local7.method635();
				local7 = null;
			}
			if (local7 != null) {
				return local7;
			}
			@Pc(28) Class13 local28 = method317(arg1);
			if (local28.anIntArray161 == null) {
				arg0 = -1;
			}
			if (arg0 > 1) {
				@Pc(38) int local38 = -1;
				for (@Pc(40) int local40 = 0; local40 < 10; local40++) {
					if (arg0 >= local28.anIntArray162[local40] && local28.anIntArray162[local40] != 0) {
						local38 = local28.anIntArray161[local40];
					}
				}
				if (local38 != -1) {
					local28 = method317(local38);
				}
			}
			@Pc(72) Class1_Sub1_Sub1_Sub5 local72 = local28.method321(1);
			if (local72 == null) {
				return null;
			}
			@Pc(78) Class1_Sub1_Sub2_Sub2 local78 = null;
			if (local28.anInt615 != -1) {
				local78 = method323(10, local28.anInt614);
				if (local78 == null) {
					return null;
				}
			}
			local7 = new Class1_Sub1_Sub2_Sub2(32, 32);
			@Pc(107) int local107 = Class1_Sub1_Sub2_Sub1.anInt653;
			@Pc(109) int local109 = Class1_Sub1_Sub2_Sub1.anInt654;
			@Pc(111) int[] local111 = Class1_Sub1_Sub2_Sub1.anIntArray175;
			@Pc(113) int[] local113 = Class1_Sub1_Sub2.anIntArray205;
			@Pc(115) int local115 = Class1_Sub1_Sub2.anInt742;
			@Pc(117) int local117 = Class1_Sub1_Sub2.anInt743;
			@Pc(119) int local119 = Class1_Sub1_Sub2.anInt746;
			@Pc(121) int local121 = Class1_Sub1_Sub2.anInt747;
			@Pc(123) int local123 = Class1_Sub1_Sub2.anInt744;
			@Pc(125) int local125 = Class1_Sub1_Sub2.anInt745;
			Class1_Sub1_Sub2_Sub1.aBoolean135 = false;
			Class1_Sub1_Sub2.method433(local7.anIntArray198, 32, 32);
			Class1_Sub1_Sub2.method437(32, 0, 32, 0, 0);
			Class1_Sub1_Sub2_Sub1.method353();
			@Pc(152) int local152 = Class1_Sub1_Sub2_Sub1.anIntArray173[local28.anInt597] * local28.anInt596 >> 16;
			@Pc(162) int local162 = Class1_Sub1_Sub2_Sub1.anIntArray174[local28.anInt597] * local28.anInt596 >> 16;
			local72.method299(local28.anInt598, local28.anInt599, local28.anInt597, local28.anInt600, local152 + local72.anInt579 / 2 + local28.anInt601, local162 + local28.anInt601);
			for (@Pc(188) int local188 = 31; local188 >= 0; local188--) {
				for (local162 = 31; local162 >= 0; local162--) {
					if (local7.anIntArray198[local188 + local162 * 32] == 0) {
						if (local188 > 0 && local7.anIntArray198[local188 + local162 * 32 - 1] > 1) {
							local7.anIntArray198[local188 + local162 * 32] = 1;
						} else if (local162 > 0 && local7.anIntArray198[local188 + (local162 - 1) * 32] > 1) {
							local7.anIntArray198[local188 + local162 * 32] = 1;
						} else if (local188 < 31 && local7.anIntArray198[local188 + local162 * 32 + 1] > 1) {
							local7.anIntArray198[local188 + local162 * 32] = 1;
						} else if (local162 < 31 && local7.anIntArray198[local188 + (local162 + 1) * 32] > 1) {
							local7.anIntArray198[local188 + local162 * 32] = 1;
						}
					}
				}
			}
			for (@Pc(311) int local311 = 31; local311 >= 0; local311--) {
				for (local162 = 31; local162 >= 0; local162--) {
					if (local7.anIntArray198[local311 + local162 * 32] == 0 && local311 > 0 && local162 > 0 && local7.anIntArray198[local311 + (local162 - 1) * 32 - 1] > 0) {
						local7.anIntArray198[local311 + local162 * 32] = 3153952;
					}
				}
			}
			if (local28.anInt615 != -1) {
				@Pc(365) int local365 = local78.anInt689;
				@Pc(368) int local368 = local78.anInt690;
				local78.anInt689 = 32;
				local78.anInt690 = 32;
				local78.method397(5, 5, 22, 22);
				local78.anInt689 = local365;
				local78.anInt690 = local368;
			}
			aClass39_8.method610(local7, (long) arg1);
			Class1_Sub1_Sub2.method433(local113, local117, local115);
			Class1_Sub1_Sub2.method435(local125, local123, local119, local121);
			Class1_Sub1_Sub2_Sub1.anInt653 = local107;
			Class1_Sub1_Sub2_Sub1.anInt654 = local109;
			Class1_Sub1_Sub2_Sub1.anIntArray175 = local111;
			Class1_Sub1_Sub2_Sub1.aBoolean135 = true;
			if (local28.aBoolean123) {
				local7.anInt689 = 33;
			} else {
				local7.anInt689 = 32;
			}
			local7.anInt690 = arg0;
			return local7;
		} catch (@Pc(429) RuntimeException local429) {
			signlink.reporterror("25584, " + arg0 + ", " + 9 + ", " + arg1 + ", " + local429.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "()V")
	private void method318() {
		this.anInt595 = 0;
		this.aString26 = null;
		this.aByteArray6 = null;
		this.anIntArray159 = null;
		this.anIntArray160 = null;
		this.anInt596 = 2000;
		this.anInt597 = 0;
		this.anInt598 = 0;
		this.anInt599 = 0;
		this.anInt600 = 0;
		this.anInt601 = 0;
		this.aBoolean122 = false;
		this.anInt602 = -1;
		this.aBoolean123 = false;
		this.anInt603 = 1;
		this.aBoolean124 = false;
		this.aStringArray9 = null;
		this.aStringArray10 = null;
		this.anInt604 = -1;
		this.anInt605 = -1;
		this.aByte32 = 0;
		this.anInt606 = -1;
		this.anInt607 = -1;
		this.aByte33 = 0;
		this.anInt608 = -1;
		this.anInt609 = -1;
		this.anInt610 = -1;
		this.anInt611 = -1;
		this.anInt612 = -1;
		this.anInt613 = -1;
		this.anIntArray161 = null;
		this.anIntArray162 = null;
		this.anInt614 = -1;
		this.anInt615 = -1;
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(ILclient!mb;)V")
	private void method319(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method468();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt595 = arg0.method470();
				} else if (local10 == 2) {
					this.aString26 = arg0.method475();
				} else if (local10 == 3) {
					this.aByteArray6 = arg0.method476();
				} else if (local10 == 4) {
					this.anInt596 = arg0.method470();
				} else if (local10 == 5) {
					this.anInt597 = arg0.method470();
				} else if (local10 == 6) {
					this.anInt598 = arg0.method470();
				} else if (local10 == 7) {
					this.anInt600 = arg0.method470();
					if (this.anInt600 > 32767) {
						this.anInt600 -= 65536;
					}
				} else if (local10 == 8) {
					this.anInt601 = arg0.method470();
					if (this.anInt601 > 32767) {
						this.anInt601 -= 65536;
					}
				} else if (local10 == 9) {
					this.aBoolean122 = true;
				} else if (local10 == 10) {
					this.anInt602 = arg0.method470();
				} else if (local10 == 11) {
					this.aBoolean123 = true;
				} else if (local10 == 12) {
					this.anInt603 = arg0.method473();
				} else if (local10 == 16) {
					this.aBoolean124 = true;
				} else if (local10 == 23) {
					this.anInt604 = arg0.method470();
					this.aByte32 = arg0.method469();
				} else if (local10 == 24) {
					this.anInt605 = arg0.method470();
				} else if (local10 == 25) {
					this.anInt606 = arg0.method470();
					this.aByte33 = arg0.method469();
				} else if (local10 == 26) {
					this.anInt607 = arg0.method470();
				} else if (local10 >= 30 && local10 < 35) {
					if (this.aStringArray9 == null) {
						this.aStringArray9 = new String[5];
					}
					this.aStringArray9[local10 - 30] = arg0.method475();
					if (this.aStringArray9[local10 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray9[local10 - 30] = null;
					}
				} else if (local10 >= 35 && local10 < 40) {
					if (this.aStringArray10 == null) {
						this.aStringArray10 = new String[5];
					}
					this.aStringArray10[local10 - 35] = arg0.method475();
				} else if (local10 == 40) {
					@Pc(260) int local260 = arg0.method468();
					this.anIntArray159 = new int[local260];
					this.anIntArray160 = new int[local260];
					for (@Pc(270) int local270 = 0; local270 < local260; local270++) {
						this.anIntArray159[local270] = arg0.method470();
						this.anIntArray160[local270] = arg0.method470();
					}
				} else if (local10 == 78) {
					this.anInt608 = arg0.method470();
				} else if (local10 == 79) {
					this.anInt609 = arg0.method470();
				} else if (local10 == 90) {
					this.anInt610 = arg0.method470();
				} else if (local10 == 91) {
					this.anInt612 = arg0.method470();
				} else if (local10 == 92) {
					this.anInt611 = arg0.method470();
				} else if (local10 == 93) {
					this.anInt613 = arg0.method470();
				} else if (local10 == 95) {
					this.anInt599 = arg0.method470();
				} else if (local10 == 97) {
					this.anInt614 = arg0.method470();
				} else if (local10 == 98) {
					this.anInt615 = arg0.method470();
				} else if (local10 >= 100 && local10 < 110) {
					if (this.anIntArray161 == null) {
						this.anIntArray161 = new int[10];
						this.anIntArray162 = new int[10];
					}
					this.anIntArray161[local10 - 100] = arg0.method470();
					this.anIntArray162[local10 - 100] = arg0.method470();
				}
			}
		} catch (@Pc(406) RuntimeException local406) {
			signlink.reporterror("89790, " + 3251 + ", " + arg0 + ", " + local406.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "(I)V")
	private void method320() {
		try {
			@Pc(5) Class13 local5 = method317(this.anInt615);
			this.anInt595 = local5.anInt595;
			this.anInt596 = local5.anInt596;
			this.anInt597 = local5.anInt597;
			this.anInt598 = local5.anInt598;
			this.anInt599 = local5.anInt599;
			this.anInt600 = local5.anInt600;
			this.anInt601 = local5.anInt601;
			this.anIntArray159 = local5.anIntArray159;
			this.anIntArray160 = local5.anIntArray160;
			@Pc(56) Class13 local56 = method317(this.anInt614);
			this.aString26 = local56.aString26;
			this.aBoolean124 = local56.aBoolean124;
			this.anInt603 = local56.anInt603;
			@Pc(70) String local70 = "a";
			@Pc(75) char local75 = local56.aString26.charAt(0);
			if (local75 == 'A' || local75 == 'E' || local75 == 'I' || local75 == 'O' || local75 == 'U') {
				local70 = "an";
			}
			this.aByteArray6 = ("Swap this note at any bank for " + local70 + " " + local56.aString26 + ".").getBytes();
			this.aBoolean123 = true;
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("12591, " + -145 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "(I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method321(@OriginalArg(0) int arg0) {
		@Pc(11) int local11;
		if (this.anIntArray161 != null && arg0 > 1) {
			@Pc(9) int local9 = -1;
			for (local11 = 0; local11 < 10; local11++) {
				if (arg0 >= this.anIntArray162[local11] && this.anIntArray162[local11] != 0) {
					local9 = this.anIntArray161[local11];
				}
			}
			if (local9 != -1) {
				return method317(local9).method321(1);
			}
		}
		@Pc(48) Class1_Sub1_Sub1_Sub5 local48 = (Class1_Sub1_Sub1_Sub5) aClass39_7.method609((long) this.anInt594);
		if (local48 != null) {
			return local48;
		}
		local48 = Class1_Sub1_Sub1_Sub5.method279(this.anInt595, this.anInt589);
		if (local48 == null) {
			return null;
		}
		if (this.anIntArray159 != null) {
			for (local11 = 0; local11 < this.anIntArray159.length; local11++) {
				local48.method293(this.anIntArray159[local11], this.anIntArray160[local11]);
			}
		}
		local48.method296(64, 768, -50, -10, -50, true);
		local48.aBoolean111 = true;
		aClass39_7.method610(local48, (long) this.anInt594);
		return local48;
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(IZ)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method322(@OriginalArg(0) int arg0) {
		try {
			@Pc(11) int local11;
			if (this.anIntArray161 != null && arg0 > 1) {
				@Pc(9) int local9 = -1;
				for (local11 = 0; local11 < 10; local11++) {
					if (arg0 >= this.anIntArray162[local11] && this.anIntArray162[local11] != 0) {
						local9 = this.anIntArray161[local11];
					}
				}
				if (local9 != -1) {
					return method317(local9).method322(1);
				}
			}
			@Pc(48) Class1_Sub1_Sub1_Sub5 local48 = Class1_Sub1_Sub1_Sub5.method279(this.anInt595, this.anInt589);
			if (local48 == null) {
				return null;
			}
			if (this.anIntArray159 != null) {
				for (local11 = 0; local11 < this.anIntArray159.length; local11++) {
					local48.method293(this.anIntArray159[local11], this.anIntArray160[local11]);
				}
			}
			return local48;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("54902, " + arg0 + ", " + true + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(BI)Z")
	public boolean method324(@OriginalArg(1) int arg0) {
		try {
			@Pc(2) int local2 = this.anInt604;
			@Pc(5) int local5 = this.anInt605;
			@Pc(8) int local8 = this.anInt608;
			if (arg0 == 1) {
				local2 = this.anInt606;
				local5 = this.anInt607;
				local8 = this.anInt609;
			}
			if (local2 == -1) {
				return true;
			}
			@Pc(38) boolean local38 = true;
			if (!Class1_Sub1_Sub1_Sub5.method280(local2)) {
				local38 = false;
			}
			if (local5 != -1 && !Class1_Sub1_Sub1_Sub5.method280(local5)) {
				local38 = false;
			}
			if (local8 != -1 && !Class1_Sub1_Sub1_Sub5.method280(local8)) {
				local38 = false;
			}
			return local38;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("8137, " + -73 + ", " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(ZI)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method325(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = this.anInt604;
			@Pc(7) int local7 = this.anInt605;
			@Pc(10) int local10 = this.anInt608;
			if (arg0 == 1) {
				local4 = this.anInt606;
				local7 = this.anInt607;
				local10 = this.anInt609;
			}
			if (local4 == -1) {
				return null;
			}
			@Pc(32) Class1_Sub1_Sub1_Sub5 local32 = Class1_Sub1_Sub1_Sub5.method279(local4, this.anInt589);
			if (local7 != -1) {
				@Pc(49) Class1_Sub1_Sub1_Sub5 local49;
				if (local10 == -1) {
					local49 = Class1_Sub1_Sub1_Sub5.method279(local7, this.anInt589);
					@Pc(94) Class1_Sub1_Sub1_Sub5[] local94 = new Class1_Sub1_Sub1_Sub5[] { local32, local49 };
					local32 = new Class1_Sub1_Sub1_Sub5(2, local94, (byte) 4);
				} else {
					local49 = Class1_Sub1_Sub1_Sub5.method279(local7, this.anInt589);
					@Pc(54) Class1_Sub1_Sub1_Sub5 local54 = Class1_Sub1_Sub1_Sub5.method279(local10, this.anInt589);
					@Pc(69) Class1_Sub1_Sub1_Sub5[] local69 = new Class1_Sub1_Sub1_Sub5[] { local32, local49, local54 };
					local32 = new Class1_Sub1_Sub1_Sub5(3, local69, (byte) 4);
				}
			}
			if (arg0 == 0 && this.aByte32 != 0) {
				local32.method292(this.aByte32, this.anInt590, 0, 0);
			}
			if (arg0 == 1 && this.aByte33 != 0) {
				local32.method292(this.aByte33, this.anInt590, 0, 0);
			}
			if (this.anIntArray159 != null) {
				for (@Pc(133) int local133 = 0; local133 < this.anIntArray159.length; local133++) {
					local32.method293(this.anIntArray159[local133], this.anIntArray160[local133]);
				}
			}
			return local32;
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("97093, " + false + ", " + arg0 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(II)Z")
	public boolean method326(@OriginalArg(1) int arg0) {
		try {
			@Pc(2) int local2 = this.anInt610;
			@Pc(5) int local5 = this.anInt611;
			if (arg0 == 1) {
				local2 = this.anInt612;
				local5 = this.anInt613;
			}
			if (local2 == -1) {
				return true;
			}
			@Pc(30) boolean local30 = true;
			if (!Class1_Sub1_Sub1_Sub5.method280(local2)) {
				local30 = false;
			}
			if (local5 != -1 && !Class1_Sub1_Sub1_Sub5.method280(local5)) {
				local30 = false;
			}
			return local30;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("61443, " + 0 + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(IB)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method327(@OriginalArg(0) int arg0) {
		try {
			@Pc(13) int local13 = this.anInt610;
			@Pc(16) int local16 = this.anInt611;
			if (arg0 == 1) {
				local13 = this.anInt612;
				local16 = this.anInt613;
			}
			if (local13 == -1) {
				return null;
			}
			@Pc(35) Class1_Sub1_Sub1_Sub5 local35 = Class1_Sub1_Sub1_Sub5.method279(local13, this.anInt589);
			if (local16 != -1) {
				@Pc(43) Class1_Sub1_Sub1_Sub5 local43 = Class1_Sub1_Sub1_Sub5.method279(local16, this.anInt589);
				@Pc(54) Class1_Sub1_Sub1_Sub5[] local54 = new Class1_Sub1_Sub1_Sub5[] { local35, local43 };
				local35 = new Class1_Sub1_Sub1_Sub5(2, local54, (byte) 4);
			}
			if (this.anIntArray159 != null) {
				for (@Pc(66) int local66 = 0; local66 < this.anIntArray159.length; local66++) {
					local35.method293(this.anIntArray159[local66], this.anIntArray160[local66]);
				}
			}
			return local35;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("43039, " + arg0 + ", " + -96 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}
}
