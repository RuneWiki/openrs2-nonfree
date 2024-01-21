import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "I")
	private static int anInt565;

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "[I")
	private static int[] anIntArray169;

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!gc", name = "l", descriptor = "[Lclient!gc;")
	private static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "m", descriptor = "I")
	private static int anInt566;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "B")
	private static byte aByte31 = 59;

	@OriginalMember(owner = "client!gc", name = "Q", descriptor = "Lclient!s;")
	public static Class40 aClass40_6 = new Class40(30, false);

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "I")
	private int anInt564;

	@OriginalMember(owner = "client!gc", name = "o", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!gc", name = "r", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!gc", name = "s", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!gc", name = "y", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!gc", name = "z", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!gc", name = "A", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray9;

	@OriginalMember(owner = "client!gc", name = "J", descriptor = "I")
	private int anInt578;

	@OriginalMember(owner = "client!gc", name = "K", descriptor = "I")
	private int anInt579;

	@OriginalMember(owner = "client!gc", name = "N", descriptor = "[I")
	public int[] anIntArray174;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "Z")
	private boolean aBoolean140 = true;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "I")
	private int anInt563 = -843;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "Z")
	private boolean aBoolean141 = true;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "Z")
	private boolean aBoolean142 = true;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "B")
	private byte aByte32 = 7;

	@OriginalMember(owner = "client!gc", name = "n", descriptor = "J")
	public long aLong23 = -1L;

	@OriginalMember(owner = "client!gc", name = "q", descriptor = "B")
	public byte aByte33 = 1;

	@OriginalMember(owner = "client!gc", name = "t", descriptor = "I")
	public int anInt567 = -1;

	@OriginalMember(owner = "client!gc", name = "u", descriptor = "I")
	public int anInt568 = -1;

	@OriginalMember(owner = "client!gc", name = "v", descriptor = "I")
	public int anInt569 = -1;

	@OriginalMember(owner = "client!gc", name = "w", descriptor = "I")
	public int anInt570 = -1;

	@OriginalMember(owner = "client!gc", name = "x", descriptor = "I")
	public int anInt571 = -1;

	@OriginalMember(owner = "client!gc", name = "B", descriptor = "I")
	private int anInt572 = -1;

	@OriginalMember(owner = "client!gc", name = "C", descriptor = "I")
	private int anInt573 = -1;

	@OriginalMember(owner = "client!gc", name = "D", descriptor = "I")
	private int anInt574 = -1;

	@OriginalMember(owner = "client!gc", name = "E", descriptor = "Z")
	public boolean aBoolean143 = true;

	@OriginalMember(owner = "client!gc", name = "F", descriptor = "I")
	public int anInt575 = -1;

	@OriginalMember(owner = "client!gc", name = "G", descriptor = "I")
	private int anInt576 = 128;

	@OriginalMember(owner = "client!gc", name = "H", descriptor = "I")
	private int anInt577 = 128;

	@OriginalMember(owner = "client!gc", name = "I", descriptor = "Z")
	public boolean aBoolean144 = false;

	@OriginalMember(owner = "client!gc", name = "L", descriptor = "I")
	public int anInt580 = -1;

	@OriginalMember(owner = "client!gc", name = "M", descriptor = "I")
	public int anInt581 = 32;

	@OriginalMember(owner = "client!gc", name = "O", descriptor = "I")
	private int anInt582 = -1;

	@OriginalMember(owner = "client!gc", name = "P", descriptor = "I")
	private int anInt583 = -1;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method321(@OriginalArg(0) Class47 arg0) {
		aClass1_Sub1_Sub3_6 = new Class1_Sub1_Sub3(false, arg0.method666("npc.dat", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(false, arg0.method666("npc.idx", null));
		anInt565 = local19.method482();
		anIntArray169 = new int[anInt565];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt565; local29++) {
			anIntArray169[local29] = local27;
			local27 += local19.method482();
		}
		aClass13Array1 = new Class13[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass13Array1[local49] = new Class13();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(B)V")
	public static void method322(@OriginalArg(0) byte arg0) {
		try {
			aClass40_6 = null;
			if (arg0 == aByte31) {
				anIntArray169 = null;
				aClass13Array1 = null;
				aClass1_Sub1_Sub3_6 = null;
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("50707, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(I)Lclient!gc;")
	public static Class13 method323(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass13Array1[local1].aLong23 == (long) arg0) {
				return aClass13Array1[local1];
			}
		}
		anInt566 = (anInt566 + 1) % 20;
		@Pc(33) Class13 local33 = aClass13Array1[anInt566] = new Class13();
		aClass1_Sub1_Sub3_6.anInt757 = anIntArray169[arg0];
		local33.aLong23 = arg0;
		local33.method324(aClass1_Sub1_Sub3_6);
		return local33;
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!lb;Z)V")
	private void method324(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method480();
				if (local10 == 0) {
					return;
				}
				@Pc(19) int local19;
				@Pc(25) int local25;
				if (local10 == 1) {
					local19 = arg0.method480();
					this.anIntArray170 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray170[local25] = arg0.method482();
					}
				} else if (local10 == 2) {
					this.aString24 = arg0.method487();
				} else if (local10 == 3) {
					this.aByteArray5 = arg0.method488();
				} else if (local10 == 12) {
					this.aByte33 = arg0.method481();
				} else if (local10 == 13) {
					this.anInt567 = arg0.method482();
				} else if (local10 == 14) {
					this.anInt568 = arg0.method482();
				} else if (local10 == 17) {
					this.anInt568 = arg0.method482();
					this.anInt569 = arg0.method482();
					this.anInt570 = arg0.method482();
					this.anInt571 = arg0.method482();
				} else if (local10 >= 30 && local10 < 40) {
					if (this.aStringArray9 == null) {
						this.aStringArray9 = new String[5];
					}
					this.aStringArray9[local10 - 30] = arg0.method487();
					if (this.aStringArray9[local10 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray9[local10 - 30] = null;
					}
				} else if (local10 == 40) {
					local19 = arg0.method480();
					this.anIntArray172 = new int[local19];
					this.anIntArray173 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray172[local25] = arg0.method482();
						this.anIntArray173[local25] = arg0.method482();
					}
				} else if (local10 == 60) {
					local19 = arg0.method480();
					this.anIntArray171 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray171[local25] = arg0.method482();
					}
				} else if (local10 == 90) {
					this.anInt572 = arg0.method482();
				} else if (local10 == 91) {
					this.anInt573 = arg0.method482();
				} else if (local10 == 92) {
					this.anInt574 = arg0.method482();
				} else if (local10 == 93) {
					this.aBoolean143 = false;
				} else if (local10 == 95) {
					this.anInt575 = arg0.method482();
				} else if (local10 == 97) {
					this.anInt576 = arg0.method482();
				} else if (local10 == 98) {
					this.anInt577 = arg0.method482();
				} else if (local10 == 99) {
					this.aBoolean144 = true;
				} else if (local10 == 100) {
					this.anInt578 = arg0.method481();
				} else if (local10 == 101) {
					this.anInt579 = arg0.method481() * 5;
				} else if (local10 == 102) {
					this.anInt580 = arg0.method482();
				} else if (local10 == 103) {
					this.anInt581 = arg0.method482();
				} else if (local10 == 106) {
					this.anInt582 = arg0.method482();
					if (this.anInt582 == 65535) {
						this.anInt582 = -1;
					}
					this.anInt583 = arg0.method482();
					if (this.anInt583 == 65535) {
						this.anInt583 = -1;
					}
					local19 = arg0.method480();
					this.anIntArray174 = new int[local19 + 1];
					for (local25 = 0; local25 <= local19; local25++) {
						this.anIntArray174[local25] = arg0.method482();
						if (this.anIntArray174[local25] == 65535) {
							this.anIntArray174[local25] = -1;
						}
					}
				}
			}
		} catch (@Pc(376) RuntimeException local376) {
			signlink.reporterror("77413, " + arg0 + ", " + false + ", " + local376.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(IZ[II)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method325(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.anIntArray174 != null) {
				@Pc(19) Class13 local19 = this.method327(this.aByte32);
				return local19 == null ? null : local19.method325(arg0, arg1, arg2);
			}
			@Pc(36) Class1_Sub1_Sub1_Sub5 local36 = (Class1_Sub1_Sub1_Sub5) aClass40_6.method591(this.aLong23);
			if (local36 == null) {
				@Pc(40) boolean local40 = false;
				for (@Pc(42) int local42 = 0; local42 < this.anIntArray170.length; local42++) {
					if (!Class1_Sub1_Sub1_Sub5.method262(this.anIntArray170[local42])) {
						local40 = true;
					}
				}
				if (local40) {
					return null;
				}
				@Pc(67) Class1_Sub1_Sub1_Sub5[] local67 = new Class1_Sub1_Sub1_Sub5[this.anIntArray170.length];
				for (@Pc(69) int local69 = 0; local69 < this.anIntArray170.length; local69++) {
					local67[local69] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray170[local69]);
				}
				if (local67.length == 1) {
					local36 = local67[0];
				} else {
					local36 = new Class1_Sub1_Sub1_Sub5(local67.length, local67, (byte) 1);
				}
				if (this.anIntArray172 != null) {
					for (@Pc(109) int local109 = 0; local109 < this.anIntArray172.length; local109++) {
						local36.method275(this.anIntArray172[local109], this.anIntArray173[local109]);
					}
				}
				local36.method268(this.anInt564);
				local36.method278(this.anInt578 + 64, this.anInt579 + 850, -30, -50, -30, true);
				aClass40_6.method592(local36, this.aLong23, this.aBoolean141);
			}
			@Pc(154) Class1_Sub1_Sub1_Sub5 local154 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local154.method263(this.anInt563, Class12.method306(arg2) & Class12.method306(arg0), local36);
			if (arg2 != -1 && arg0 != -1) {
				local154.method270(arg0, arg1, arg2);
			} else if (arg2 != -1) {
				local154.method269(arg2);
			}
			if (this.anInt576 != 128 || this.anInt577 != 128) {
				local154.method277(this.anInt577, this.anInt576, this.anInt576);
			}
			local154.method265();
			local154.anIntArrayArray9 = null;
			local154.anIntArrayArray8 = null;
			if (this.aByte33 == 1) {
				local154.aBoolean116 = true;
			}
			return local154;
		} catch (@Pc(223) RuntimeException local223) {
			signlink.reporterror("4499, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local223.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "(B)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method326() {
		try {
			if (this.anIntArray174 != null) {
				@Pc(20) Class13 local20 = this.method327(this.aByte32);
				return local20 == null ? null : local20.method326();
			} else if (this.anIntArray171 == null) {
				return null;
			} else {
				@Pc(35) boolean local35 = false;
				for (@Pc(37) int local37 = 0; local37 < this.anIntArray171.length; local37++) {
					if (!Class1_Sub1_Sub1_Sub5.method262(this.anIntArray171[local37])) {
						local35 = true;
					}
				}
				if (local35) {
					return null;
				}
				@Pc(62) Class1_Sub1_Sub1_Sub5[] local62 = new Class1_Sub1_Sub1_Sub5[this.anIntArray171.length];
				for (@Pc(64) int local64 = 0; local64 < this.anIntArray171.length; local64++) {
					local62[local64] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray171[local64]);
				}
				@Pc(89) Class1_Sub1_Sub1_Sub5 local89;
				if (local62.length == 1) {
					local89 = local62[0];
				} else {
					local89 = new Class1_Sub1_Sub1_Sub5(local62.length, local62, (byte) 1);
				}
				if (this.anIntArray172 != null) {
					for (@Pc(104) int local104 = 0; local104 < this.anIntArray172.length; local104++) {
						local89.method275(this.anIntArray172[local104], this.anIntArray173[local104]);
					}
				}
				return local89;
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("53163, " + -72 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "(B)Lclient!gc;")
	public Class13 method327(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 7) {
				@Pc(6) boolean local6 = false;
			} else {
				this.aBoolean142 = !this.aBoolean142;
			}
			@Pc(18) int local18 = -1;
			if (this.anInt582 != -1) {
				@Pc(27) Class36 local27 = Class36.aClass36Array1[this.anInt582];
				@Pc(30) int local30 = local27.anInt858;
				@Pc(33) int local33 = local27.anInt859;
				@Pc(36) int local36 = local27.anInt860;
				@Pc(42) int local42 = client.anIntArray48[local36 - local33];
				local18 = aClient4.anIntArray32[local30] >> local33 & local42;
			} else if (this.anInt583 != -1) {
				local18 = aClient4.anIntArray32[this.anInt583];
			}
			return local18 < 0 || local18 >= this.anIntArray174.length || this.anIntArray174[local18] == -1 ? null : method323(this.anIntArray174[local18]);
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("85701, " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
