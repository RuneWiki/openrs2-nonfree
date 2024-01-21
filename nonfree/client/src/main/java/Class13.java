import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "I")
	private static int anInt590;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "[I")
	private static int[] anIntArray158;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_9;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "[Lclient!gc;")
	private static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "I")
	private static int anInt591;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "I")
	private static int anInt589 = 122;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "Z")
	public static boolean aBoolean112 = true;

	@OriginalMember(owner = "client!gc", name = "R", descriptor = "Lclient!t;")
	public static Class39 aClass39_7 = new Class39(false, 50);

	@OriginalMember(owner = "client!gc", name = "S", descriptor = "Lclient!t;")
	public static Class39 aClass39_8 = new Class39(false, 100);

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "I")
	private int anInt593;

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!gc", name = "l", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!gc", name = "m", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!gc", name = "n", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!gc", name = "o", descriptor = "I")
	public int anInt594;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "I")
	public int anInt595;

	@OriginalMember(owner = "client!gc", name = "q", descriptor = "I")
	public int anInt596;

	@OriginalMember(owner = "client!gc", name = "r", descriptor = "I")
	private int anInt597;

	@OriginalMember(owner = "client!gc", name = "s", descriptor = "I")
	private int anInt598;

	@OriginalMember(owner = "client!gc", name = "t", descriptor = "I")
	private int anInt599;

	@OriginalMember(owner = "client!gc", name = "u", descriptor = "Z")
	private boolean aBoolean113;

	@OriginalMember(owner = "client!gc", name = "v", descriptor = "I")
	private int anInt600;

	@OriginalMember(owner = "client!gc", name = "w", descriptor = "Z")
	public boolean aBoolean114;

	@OriginalMember(owner = "client!gc", name = "x", descriptor = "I")
	public int anInt601;

	@OriginalMember(owner = "client!gc", name = "y", descriptor = "Z")
	private boolean aBoolean115;

	@OriginalMember(owner = "client!gc", name = "z", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray9;

	@OriginalMember(owner = "client!gc", name = "A", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray10;

	@OriginalMember(owner = "client!gc", name = "B", descriptor = "I")
	private int anInt602;

	@OriginalMember(owner = "client!gc", name = "C", descriptor = "I")
	private int anInt603;

	@OriginalMember(owner = "client!gc", name = "D", descriptor = "B")
	private byte aByte11;

	@OriginalMember(owner = "client!gc", name = "E", descriptor = "I")
	private int anInt604;

	@OriginalMember(owner = "client!gc", name = "F", descriptor = "I")
	private int anInt605;

	@OriginalMember(owner = "client!gc", name = "G", descriptor = "B")
	private byte aByte12;

	@OriginalMember(owner = "client!gc", name = "H", descriptor = "I")
	private int anInt606;

	@OriginalMember(owner = "client!gc", name = "I", descriptor = "I")
	private int anInt607;

	@OriginalMember(owner = "client!gc", name = "J", descriptor = "I")
	private int anInt608;

	@OriginalMember(owner = "client!gc", name = "K", descriptor = "I")
	private int anInt609;

	@OriginalMember(owner = "client!gc", name = "L", descriptor = "I")
	private int anInt610;

	@OriginalMember(owner = "client!gc", name = "M", descriptor = "I")
	private int anInt611;

	@OriginalMember(owner = "client!gc", name = "N", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!gc", name = "O", descriptor = "[I")
	private int[] anIntArray162;

	@OriginalMember(owner = "client!gc", name = "P", descriptor = "I")
	private int anInt612;

	@OriginalMember(owner = "client!gc", name = "Q", descriptor = "I")
	private int anInt613;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "Z")
	private boolean aBoolean111 = true;

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "I")
	public int anInt592 = -1;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method314(@OriginalArg(0) Class45 arg0) {
		aClass1_Sub1_Sub3_9 = new Class1_Sub1_Sub3(699, arg0.method639("obj.dat", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(699, arg0.method639("obj.idx", null));
		anInt590 = local19.method469();
		anIntArray158 = new int[anInt590];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt590; local29++) {
			anIntArray158[local29] = local27;
			local27 += local19.method469();
		}
		aClass13Array1 = new Class13[10];
		for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
			aClass13Array1[local49] = new Class13();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Z)V")
	public static void method315() {
		try {
			aClass39_7 = null;
			aClass39_8 = null;
			anIntArray158 = null;
			aClass13Array1 = null;
			aClass1_Sub1_Sub3_9 = null;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("95801, " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(I)Lclient!gc;")
	public static Class13 method316(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass13Array1[local1].anInt592 == arg0) {
				return aClass13Array1[local1];
			}
		}
		anInt591 = (anInt591 + 1) % 10;
		@Pc(27) Class13 local27 = aClass13Array1[anInt591];
		aClass1_Sub1_Sub3_9.anInt771 = anIntArray158[arg0];
		local27.anInt592 = arg0;
		local27.method317();
		local27.method318(aClass1_Sub1_Sub3_9);
		if (local27.anInt613 != -1) {
			local27.method319(anInt589);
		}
		if (!aBoolean112 && local27.aBoolean115) {
			local27.aString25 = "Members Object";
			local27.aByteArray6 = "Login to a members' server to use this object.".getBytes();
			local27.aStringArray9 = null;
			local27.aStringArray10 = null;
		}
		return local27;
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(III)Lclient!jb;")
	public static Class1_Sub1_Sub2_Sub2 method322(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(7) Class1_Sub1_Sub2_Sub2 local7 = (Class1_Sub1_Sub2_Sub2) aClass39_8.method608((long) arg1);
			if (local7 != null && local7.anInt689 != arg0 && local7.anInt689 != -1) {
				local7.method630();
				local7 = null;
			}
			if (local7 != null) {
				return local7;
			}
			@Pc(28) Class13 local28 = method316(arg1);
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
					local28 = method316(local38);
				}
			}
			@Pc(72) Class1_Sub1_Sub1_Sub5 local72 = local28.method320(1);
			if (local72 == null) {
				return null;
			}
			@Pc(84) Class1_Sub1_Sub2_Sub2 local84 = null;
			if (local28.anInt613 != -1) {
				local84 = method322(10, local28.anInt612);
				if (local84 == null) {
					return null;
				}
			}
			local7 = new Class1_Sub1_Sub2_Sub2(32, 32);
			@Pc(106) int local106 = Class1_Sub1_Sub2_Sub1.anInt651;
			@Pc(108) int local108 = Class1_Sub1_Sub2_Sub1.anInt652;
			@Pc(110) int[] local110 = Class1_Sub1_Sub2_Sub1.anIntArray175;
			@Pc(112) int[] local112 = Class1_Sub1_Sub2.anIntArray205;
			@Pc(114) int local114 = Class1_Sub1_Sub2.anInt734;
			@Pc(116) int local116 = Class1_Sub1_Sub2.anInt735;
			@Pc(118) int local118 = Class1_Sub1_Sub2.anInt738;
			@Pc(120) int local120 = Class1_Sub1_Sub2.anInt739;
			@Pc(122) int local122 = Class1_Sub1_Sub2.anInt736;
			@Pc(124) int local124 = Class1_Sub1_Sub2.anInt737;
			Class1_Sub1_Sub2_Sub1.aBoolean128 = false;
			Class1_Sub1_Sub2.method432(32, 32, local7.anIntArray198);
			Class1_Sub1_Sub2.method436(0, 32, 0, 32, 0);
			Class1_Sub1_Sub2_Sub1.method352();
			@Pc(151) int local151 = Class1_Sub1_Sub2_Sub1.anIntArray173[local28.anInt595] * local28.anInt594 >> 16;
			@Pc(161) int local161 = Class1_Sub1_Sub2_Sub1.anIntArray174[local28.anInt595] * local28.anInt594 >> 16;
			local72.method298(local28.anInt596, local28.anInt597, local28.anInt595, local28.anInt598, local151 + local72.anInt579 / 2 + local28.anInt599, local161 + local28.anInt599);
			for (@Pc(187) int local187 = 31; local187 >= 0; local187--) {
				for (local161 = 31; local161 >= 0; local161--) {
					if (local7.anIntArray198[local187 + local161 * 32] == 0) {
						if (local187 > 0 && local7.anIntArray198[local187 + local161 * 32 - 1] > 1) {
							local7.anIntArray198[local187 + local161 * 32] = 1;
						} else if (local161 > 0 && local7.anIntArray198[local187 + (local161 - 1) * 32] > 1) {
							local7.anIntArray198[local187 + local161 * 32] = 1;
						} else if (local187 < 31 && local7.anIntArray198[local187 + local161 * 32 + 1] > 1) {
							local7.anIntArray198[local187 + local161 * 32] = 1;
						} else if (local161 < 31 && local7.anIntArray198[local187 + (local161 + 1) * 32] > 1) {
							local7.anIntArray198[local187 + local161 * 32] = 1;
						}
					}
				}
			}
			for (@Pc(310) int local310 = 31; local310 >= 0; local310--) {
				for (local161 = 31; local161 >= 0; local161--) {
					if (local7.anIntArray198[local310 + local161 * 32] == 0 && local310 > 0 && local161 > 0 && local7.anIntArray198[local310 + (local161 - 1) * 32 - 1] > 0) {
						local7.anIntArray198[local310 + local161 * 32] = 3153952;
					}
				}
			}
			if (local28.anInt613 != -1) {
				@Pc(364) int local364 = local84.anInt688;
				@Pc(367) int local367 = local84.anInt689;
				local84.anInt688 = 32;
				local84.anInt689 = 32;
				local84.method396(22, 5, 22, 5);
				local84.anInt688 = local364;
				local84.anInt689 = local367;
			}
			aClass39_8.method609((long) arg1, local7);
			Class1_Sub1_Sub2.method432(local116, local114, local112);
			Class1_Sub1_Sub2.method434(local118, local122, local124, local120);
			Class1_Sub1_Sub2_Sub1.anInt651 = local106;
			Class1_Sub1_Sub2_Sub1.anInt652 = local108;
			Class1_Sub1_Sub2_Sub1.anIntArray175 = local110;
			Class1_Sub1_Sub2_Sub1.aBoolean128 = true;
			if (local28.aBoolean114) {
				local7.anInt688 = 33;
			} else {
				local7.anInt688 = 32;
			}
			local7.anInt689 = arg0;
			return local7;
		} catch (@Pc(428) RuntimeException local428) {
			signlink.reporterror("76650, " + arg0 + ", " + -539 + ", " + arg1 + ", " + local428.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "()V")
	private void method317() {
		this.anInt593 = 0;
		this.aString25 = null;
		this.aByteArray6 = null;
		this.anIntArray159 = null;
		this.anIntArray160 = null;
		this.anInt594 = 2000;
		this.anInt595 = 0;
		this.anInt596 = 0;
		this.anInt597 = 0;
		this.anInt598 = 0;
		this.anInt599 = 0;
		this.aBoolean113 = false;
		this.anInt600 = -1;
		this.aBoolean114 = false;
		this.anInt601 = 1;
		this.aBoolean115 = false;
		this.aStringArray9 = null;
		this.aStringArray10 = null;
		this.anInt602 = -1;
		this.anInt603 = -1;
		this.aByte11 = 0;
		this.anInt604 = -1;
		this.anInt605 = -1;
		this.aByte12 = 0;
		this.anInt606 = -1;
		this.anInt607 = -1;
		this.anInt608 = -1;
		this.anInt609 = -1;
		this.anInt610 = -1;
		this.anInt611 = -1;
		this.anIntArray161 = null;
		this.anIntArray162 = null;
		this.anInt612 = -1;
		this.anInt613 = -1;
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(ZLclient!mb;)V")
	private void method318(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method467();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt593 = arg0.method469();
				} else if (local10 == 2) {
					this.aString25 = arg0.method474();
				} else if (local10 == 3) {
					this.aByteArray6 = arg0.method475();
				} else if (local10 == 4) {
					this.anInt594 = arg0.method469();
				} else if (local10 == 5) {
					this.anInt595 = arg0.method469();
				} else if (local10 == 6) {
					this.anInt596 = arg0.method469();
				} else if (local10 == 7) {
					this.anInt598 = arg0.method469();
					if (this.anInt598 > 32767) {
						this.anInt598 -= 65536;
					}
				} else if (local10 == 8) {
					this.anInt599 = arg0.method469();
					if (this.anInt599 > 32767) {
						this.anInt599 -= 65536;
					}
				} else if (local10 == 9) {
					this.aBoolean113 = true;
				} else if (local10 == 10) {
					this.anInt600 = arg0.method469();
				} else if (local10 == 11) {
					this.aBoolean114 = true;
				} else if (local10 == 12) {
					this.anInt601 = arg0.method472();
				} else if (local10 == 16) {
					this.aBoolean115 = true;
				} else if (local10 == 23) {
					this.anInt602 = arg0.method469();
					this.aByte11 = arg0.method468();
				} else if (local10 == 24) {
					this.anInt603 = arg0.method469();
				} else if (local10 == 25) {
					this.anInt604 = arg0.method469();
					this.aByte12 = arg0.method468();
				} else if (local10 == 26) {
					this.anInt605 = arg0.method469();
				} else if (local10 >= 30 && local10 < 35) {
					if (this.aStringArray9 == null) {
						this.aStringArray9 = new String[5];
					}
					this.aStringArray9[local10 - 30] = arg0.method474();
					if (this.aStringArray9[local10 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray9[local10 - 30] = null;
					}
				} else if (local10 >= 35 && local10 < 40) {
					if (this.aStringArray10 == null) {
						this.aStringArray10 = new String[5];
					}
					this.aStringArray10[local10 - 35] = arg0.method474();
				} else if (local10 == 40) {
					@Pc(260) int local260 = arg0.method467();
					this.anIntArray159 = new int[local260];
					this.anIntArray160 = new int[local260];
					for (@Pc(270) int local270 = 0; local270 < local260; local270++) {
						this.anIntArray159[local270] = arg0.method469();
						this.anIntArray160[local270] = arg0.method469();
					}
				} else if (local10 == 78) {
					this.anInt606 = arg0.method469();
				} else if (local10 == 79) {
					this.anInt607 = arg0.method469();
				} else if (local10 == 90) {
					this.anInt608 = arg0.method469();
				} else if (local10 == 91) {
					this.anInt610 = arg0.method469();
				} else if (local10 == 92) {
					this.anInt609 = arg0.method469();
				} else if (local10 == 93) {
					this.anInt611 = arg0.method469();
				} else if (local10 == 95) {
					this.anInt597 = arg0.method469();
				} else if (local10 == 97) {
					this.anInt612 = arg0.method469();
				} else if (local10 == 98) {
					this.anInt613 = arg0.method469();
				} else if (local10 >= 100 && local10 < 110) {
					if (this.anIntArray161 == null) {
						this.anIntArray161 = new int[10];
						this.anIntArray162 = new int[10];
					}
					this.anIntArray161[local10 - 100] = arg0.method469();
					this.anIntArray162[local10 - 100] = arg0.method469();
				}
			}
		} catch (@Pc(406) RuntimeException local406) {
			signlink.reporterror("53527, " + false + ", " + arg0 + ", " + local406.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "(I)V")
	private void method319(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class13 local3 = method316(this.anInt613);
			this.anInt593 = local3.anInt593;
			this.anInt594 = local3.anInt594;
			this.anInt595 = local3.anInt595;
			this.anInt596 = local3.anInt596;
			this.anInt597 = local3.anInt597;
			this.anInt598 = local3.anInt598;
			this.anInt599 = local3.anInt599;
			this.anIntArray159 = local3.anIntArray159;
			this.anIntArray160 = local3.anIntArray160;
			@Pc(43) Class13 local43 = method316(this.anInt612);
			this.aString25 = local43.aString25;
			this.aBoolean115 = local43.aBoolean115;
			this.anInt601 = local43.anInt601;
			@Pc(57) String local57 = "a";
			if (arg0 > 0) {
				@Pc(65) char local65 = local43.aString25.charAt(0);
				if (local65 == 'A' || local65 == 'E' || local65 == 'I' || local65 == 'O' || local65 == 'U') {
					local57 = "an";
				}
				this.aByteArray6 = ("Swap this note at any bank for " + local57 + " " + local43.aString25 + ".").getBytes();
				this.aBoolean114 = true;
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("99107, " + arg0 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "(I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method320(@OriginalArg(0) int arg0) {
		@Pc(11) int local11;
		if (this.anIntArray161 != null && arg0 > 1) {
			@Pc(9) int local9 = -1;
			for (local11 = 0; local11 < 10; local11++) {
				if (arg0 >= this.anIntArray162[local11] && this.anIntArray162[local11] != 0) {
					local9 = this.anIntArray161[local11];
				}
			}
			if (local9 != -1) {
				return method316(local9).method320(1);
			}
		}
		@Pc(48) Class1_Sub1_Sub1_Sub5 local48 = (Class1_Sub1_Sub1_Sub5) aClass39_7.method608((long) this.anInt592);
		if (local48 != null) {
			return local48;
		}
		local48 = Class1_Sub1_Sub1_Sub5.method278(this.anInt593);
		if (local48 == null) {
			return null;
		}
		if (this.anIntArray159 != null) {
			for (local11 = 0; local11 < this.anIntArray159.length; local11++) {
				local48.method292(this.anIntArray159[local11], this.anIntArray160[local11]);
			}
		}
		local48.method295(64, 768, -50, -10, -50, true);
		local48.aBoolean103 = true;
		aClass39_7.method609((long) this.anInt592, local48);
		return local48;
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(II)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method321(@OriginalArg(0) int arg0) {
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
					return method316(local9).method321(1);
				}
			}
			@Pc(47) Class1_Sub1_Sub1_Sub5 local47 = Class1_Sub1_Sub1_Sub5.method278(this.anInt593);
			if (local47 == null) {
				return null;
			}
			if (this.anIntArray159 != null) {
				for (local11 = 0; local11 < this.anIntArray159.length; local11++) {
					local47.method292(this.anIntArray159[local11], this.anIntArray160[local11]);
				}
			}
			return local47;
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("20616, " + arg0 + ", " + -192 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "(II)Z")
	public boolean method323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) int local2 = this.anInt602;
			@Pc(5) int local5 = this.anInt603;
			@Pc(8) int local8 = this.anInt606;
			@Pc(12) boolean local12 = false;
			if (arg0 == 1) {
				local2 = this.anInt604;
				local5 = this.anInt605;
				local8 = this.anInt607;
			}
			if (local2 == -1) {
				return true;
			}
			@Pc(31) boolean local31 = true;
			if (!Class1_Sub1_Sub1_Sub5.method279(local2)) {
				local31 = false;
			}
			if (local5 != -1 && !Class1_Sub1_Sub1_Sub5.method279(local5)) {
				local31 = false;
			}
			if (local8 != -1 && !Class1_Sub1_Sub1_Sub5.method279(local8)) {
				local31 = false;
			}
			return local31;
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("58020, " + arg0 + ", " + arg1 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "(II)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method324(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = this.anInt602;
			@Pc(7) int local7 = this.anInt603;
			@Pc(10) int local10 = this.anInt606;
			if (arg0 == 1) {
				local4 = this.anInt604;
				local7 = this.anInt605;
				local10 = this.anInt607;
			}
			if (local4 == -1) {
				return null;
			}
			@Pc(41) Class1_Sub1_Sub1_Sub5 local41 = Class1_Sub1_Sub1_Sub5.method278(local4);
			if (local7 != -1) {
				@Pc(51) Class1_Sub1_Sub1_Sub5 local51;
				if (local10 == -1) {
					local51 = Class1_Sub1_Sub1_Sub5.method278(local7);
					@Pc(94) Class1_Sub1_Sub1_Sub5[] local94 = new Class1_Sub1_Sub1_Sub5[] { local41, local51 };
					local41 = new Class1_Sub1_Sub1_Sub5(2, false, local94);
				} else {
					local51 = Class1_Sub1_Sub1_Sub5.method278(local7);
					@Pc(55) Class1_Sub1_Sub1_Sub5 local55 = Class1_Sub1_Sub1_Sub5.method278(local10);
					@Pc(70) Class1_Sub1_Sub1_Sub5[] local70 = new Class1_Sub1_Sub1_Sub5[] { local41, local51, local55 };
					local41 = new Class1_Sub1_Sub1_Sub5(3, false, local70);
				}
			}
			if (arg0 == 0 && this.aByte11 != 0) {
				local41.method291(this.aByte11, 0, 0);
			}
			if (arg0 == 1 && this.aByte12 != 0) {
				local41.method291(this.aByte12, 0, 0);
			}
			if (this.anIntArray159 != null) {
				for (@Pc(131) int local131 = 0; local131 < this.anIntArray159.length; local131++) {
					local41.method292(this.anIntArray159[local131], this.anIntArray160[local131]);
				}
			}
			return local41;
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("44546, " + arg0 + ", " + 3 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "(II)Z")
	public boolean method325(@OriginalArg(1) int arg0) {
		try {
			@Pc(2) int local2 = this.anInt608;
			@Pc(5) int local5 = this.anInt609;
			if (arg0 == 1) {
				local2 = this.anInt610;
				local5 = this.anInt611;
			}
			if (local2 == -1) {
				return true;
			}
			@Pc(26) boolean local26 = true;
			if (!Class1_Sub1_Sub1_Sub5.method279(local2)) {
				local26 = false;
			}
			if (local5 != -1 && !Class1_Sub1_Sub1_Sub5.method279(local5)) {
				local26 = false;
			}
			return local26;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("78864, " + -39442 + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "(II)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method326(@OriginalArg(0) int arg0) {
		try {
			@Pc(13) int local13 = this.anInt608;
			@Pc(16) int local16 = this.anInt609;
			if (arg0 == 1) {
				local13 = this.anInt610;
				local16 = this.anInt611;
			}
			if (local13 == -1) {
				return null;
			}
			@Pc(34) Class1_Sub1_Sub1_Sub5 local34 = Class1_Sub1_Sub1_Sub5.method278(local13);
			if (local16 != -1) {
				@Pc(41) Class1_Sub1_Sub1_Sub5 local41 = Class1_Sub1_Sub1_Sub5.method278(local16);
				@Pc(52) Class1_Sub1_Sub1_Sub5[] local52 = new Class1_Sub1_Sub1_Sub5[] { local34, local41 };
				local34 = new Class1_Sub1_Sub1_Sub5(2, false, local52);
			}
			if (this.anIntArray159 != null) {
				for (@Pc(64) int local64 = 0; local64 < this.anIntArray159.length; local64++) {
					local34.method292(this.anIntArray159[local64], this.anIntArray160[local64]);
				}
			}
			return local34;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("80666, " + arg0 + ", " + -14561 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
