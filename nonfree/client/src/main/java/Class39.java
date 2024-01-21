import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yb")
public final class Class39 {

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "Z")
	private static boolean aBoolean131;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "Z")
	private static boolean aBoolean133;

	@OriginalMember(owner = "client!yb", name = "f", descriptor = "I")
	private static int anInt764;

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "[I")
	private static int[] anIntArray211;

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "Lclient!jb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_20;

	@OriginalMember(owner = "client!yb", name = "i", descriptor = "[Lclient!yb;")
	private static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!yb", name = "j", descriptor = "I")
	private static int anInt765;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "Z")
	private static boolean aBoolean132 = true;

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "B")
	private static byte aByte36 = 2;

	@OriginalMember(owner = "client!yb", name = "N", descriptor = "Lclient!r;")
	public static Class30 aClass30_8 = new Class30(-947, 50);

	@OriginalMember(owner = "client!yb", name = "O", descriptor = "Lclient!r;")
	public static Class30 aClass30_9 = new Class30(-947, 200);

	@OriginalMember(owner = "client!yb", name = "l", descriptor = "I")
	private int anInt767;

	@OriginalMember(owner = "client!yb", name = "m", descriptor = "Ljava/lang/String;")
	public String aString28;

	@OriginalMember(owner = "client!yb", name = "n", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!yb", name = "o", descriptor = "[I")
	private int[] anIntArray212;

	@OriginalMember(owner = "client!yb", name = "p", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!yb", name = "q", descriptor = "I")
	public int anInt768;

	@OriginalMember(owner = "client!yb", name = "r", descriptor = "I")
	public int anInt769;

	@OriginalMember(owner = "client!yb", name = "s", descriptor = "I")
	public int anInt770;

	@OriginalMember(owner = "client!yb", name = "t", descriptor = "I")
	private int anInt771;

	@OriginalMember(owner = "client!yb", name = "u", descriptor = "I")
	private int anInt772;

	@OriginalMember(owner = "client!yb", name = "v", descriptor = "I")
	private int anInt773;

	@OriginalMember(owner = "client!yb", name = "w", descriptor = "Z")
	private boolean aBoolean134;

	@OriginalMember(owner = "client!yb", name = "x", descriptor = "I")
	private int anInt774;

	@OriginalMember(owner = "client!yb", name = "y", descriptor = "Z")
	public boolean aBoolean135;

	@OriginalMember(owner = "client!yb", name = "z", descriptor = "I")
	public int anInt775;

	@OriginalMember(owner = "client!yb", name = "A", descriptor = "Z")
	private boolean aBoolean136;

	@OriginalMember(owner = "client!yb", name = "B", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray9;

	@OriginalMember(owner = "client!yb", name = "C", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray10;

	@OriginalMember(owner = "client!yb", name = "D", descriptor = "I")
	private int anInt776;

	@OriginalMember(owner = "client!yb", name = "E", descriptor = "I")
	private int anInt777;

	@OriginalMember(owner = "client!yb", name = "F", descriptor = "B")
	private byte aByte37;

	@OriginalMember(owner = "client!yb", name = "G", descriptor = "I")
	private int anInt778;

	@OriginalMember(owner = "client!yb", name = "H", descriptor = "I")
	private int anInt779;

	@OriginalMember(owner = "client!yb", name = "I", descriptor = "B")
	private byte aByte38;

	@OriginalMember(owner = "client!yb", name = "J", descriptor = "I")
	private int anInt780;

	@OriginalMember(owner = "client!yb", name = "K", descriptor = "I")
	private int anInt781;

	@OriginalMember(owner = "client!yb", name = "L", descriptor = "I")
	private int anInt782;

	@OriginalMember(owner = "client!yb", name = "M", descriptor = "I")
	private int anInt783;

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "I")
	private int anInt763 = 8;

	@OriginalMember(owner = "client!yb", name = "k", descriptor = "I")
	public int anInt766 = -1;

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Lclient!tb;)V")
	public static void method469(@OriginalArg(0) Class34 arg0) {
		aClass1_Sub3_Sub3_20 = new Class1_Sub3_Sub3(arg0.method428(null, "obj.dat"), (byte) 63);
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg0.method428(null, "obj.idx"), (byte) 63);
		anInt764 = local21.method333();
		anIntArray211 = new int[anInt764];
		@Pc(29) int local29 = 2;
		for (@Pc(31) int local31 = 0; local31 < anInt764; local31++) {
			anIntArray211[local31] = local29;
			local29 += local21.method333();
		}
		aClass39Array1 = new Class39[10];
		for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
			aClass39Array1[local51] = new Class39();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(I)V")
	public static void method470() {
		aClass30_8 = null;
		aClass30_9 = null;
		anIntArray211 = null;
		aClass39Array1 = null;
		aClass1_Sub3_Sub3_20 = null;
	}

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "(I)Lclient!yb;")
	public static Class39 method471(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass39Array1[local1].anInt766 == arg0) {
				return aClass39Array1[local1];
			}
		}
		anInt765 = (anInt765 + 1) % 10;
		@Pc(27) Class39 local27 = aClass39Array1[anInt765];
		aClass1_Sub3_Sub3_20.anInt394 = anIntArray211[arg0];
		local27.anInt766 = arg0;
		local27.method472();
		local27.method473(aClass1_Sub3_Sub3_20);
		return local27;
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(II)Lclient!gb;")
	public static Class1_Sub3_Sub2_Sub2 method475(@OriginalArg(0) int arg0) {
		@Pc(7) Class1_Sub3_Sub2_Sub2 local7 = (Class1_Sub3_Sub2_Sub2) aClass30_9.method419((long) arg0);
		if (local7 != null) {
			return local7;
		}
		@Pc(14) Class39 local14 = method471(arg0);
		local7 = new Class1_Sub3_Sub2_Sub2(32, 32, 0);
		@Pc(23) int local23 = Class1_Sub3_Sub2_Sub1.anInt287;
		@Pc(25) int local25 = Class1_Sub3_Sub2_Sub1.anInt288;
		@Pc(27) int[] local27 = Class1_Sub3_Sub2_Sub1.anIntArray120;
		@Pc(29) int[] local29 = Class1_Sub3_Sub2.anIntArray153;
		@Pc(31) int local31 = Class1_Sub3_Sub2.anInt367;
		@Pc(33) int local33 = Class1_Sub3_Sub2.anInt368;
		Class1_Sub3_Sub2_Sub1.aBoolean77 = false;
		Class1_Sub3_Sub2.method266(aBoolean132, 32, local7.anIntArray129, 32);
		Class1_Sub3_Sub2.method270(0, 32, 0, 32, 0);
		Class1_Sub3_Sub2_Sub1.method205();
		@Pc(53) Class1_Sub3_Sub1 local53 = local14.method474();
		@Pc(63) int local63 = Class1_Sub3_Sub2_Sub1.anIntArray118[local14.anInt769] * local14.anInt768 >> 16;
		@Pc(73) int local73 = Class1_Sub3_Sub2_Sub1.anIntArray119[local14.anInt769] * local14.anInt768 >> 16;
		local53.method172(local63 + local53.anInt220 / 2 + local14.anInt773, local73 + local14.anInt773, local14.anInt772, local14.anInt771, local14.anInt769, local14.anInt770);
		for (@Pc(100) int local100 = 31; local100 >= 0; local100--) {
			for (local73 = 31; local73 >= 0; local73--) {
				if (local7.anIntArray129[local100 + local73 * 32] == 0) {
					if (local100 > 0 && local7.anIntArray129[local100 + local73 * 32 - 1] > 1) {
						local7.anIntArray129[local100 + local73 * 32] = 1;
					} else if (local73 > 0 && local7.anIntArray129[local100 + (local73 - 1) * 32] > 1) {
						local7.anIntArray129[local100 + local73 * 32] = 1;
					} else if (local100 < 31 && local7.anIntArray129[local100 + local73 * 32 + 1] > 1) {
						local7.anIntArray129[local100 + local73 * 32] = 1;
					} else if (local73 < 31 && local7.anIntArray129[local100 + (local73 + 1) * 32] > 1) {
						local7.anIntArray129[local100 + local73 * 32] = 1;
					}
				}
			}
		}
		for (@Pc(223) int local223 = 31; local223 >= 0; local223--) {
			for (local73 = 31; local73 >= 0; local73--) {
				if (local7.anIntArray129[local223 + local73 * 32] == 0 && local223 > 0 && local73 > 0 && local7.anIntArray129[local223 + (local73 - 1) * 32 - 1] > 0) {
					local7.anIntArray129[local223 + local73 * 32] = 3153952;
				}
			}
		}
		aClass30_9.method420(local7, (long) arg0, aByte36);
		Class1_Sub3_Sub2.method266(aBoolean132, local31, local29, local33);
		Class1_Sub3_Sub2_Sub1.anInt287 = local23;
		Class1_Sub3_Sub2_Sub1.anInt288 = local25;
		Class1_Sub3_Sub2_Sub1.anIntArray120 = local27;
		Class1_Sub3_Sub2_Sub1.aBoolean77 = true;
		if (local14.aBoolean135) {
			local7.anInt326 = 33;
		} else {
			local7.anInt326 = 32;
		}
		return local7;
	}

	@OriginalMember(owner = "client!yb", name = "<init>", descriptor = "()V")
	private Class39() {
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "()V")
	private void method472() {
		this.anInt767 = 0;
		this.aString28 = null;
		this.aByteArray14 = null;
		this.anIntArray212 = null;
		this.anIntArray213 = null;
		this.anInt768 = 2000;
		this.anInt769 = 0;
		this.anInt770 = 0;
		this.anInt771 = 0;
		this.anInt772 = 0;
		this.anInt773 = 0;
		this.aBoolean134 = false;
		this.anInt774 = -1;
		this.aBoolean135 = false;
		this.anInt775 = 1;
		this.aBoolean136 = false;
		this.aStringArray9 = null;
		this.aStringArray10 = null;
		this.anInt776 = -1;
		this.anInt777 = -1;
		this.aByte37 = 0;
		this.anInt778 = -1;
		this.anInt779 = -1;
		this.aByte38 = 0;
		this.anInt780 = -1;
		this.anInt781 = -1;
		this.anInt782 = -1;
		this.anInt783 = -1;
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(BLclient!jb;)V")
	private void method473(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method331();
			if (local13 == 0) {
				return;
			}
			if (local13 == 1) {
				this.anInt767 = arg0.method333();
			} else if (local13 == 2) {
				this.aString28 = arg0.method338();
			} else if (local13 == 3) {
				this.aByteArray14 = arg0.method339();
			} else if (local13 == 4) {
				this.anInt768 = arg0.method333();
			} else if (local13 == 5) {
				this.anInt769 = arg0.method333();
			} else if (local13 == 6) {
				this.anInt770 = arg0.method333();
			} else if (local13 == 7) {
				this.anInt772 = arg0.method333();
				if (this.anInt772 > 32767) {
					this.anInt772 -= 65536;
				}
			} else if (local13 == 8) {
				this.anInt773 = arg0.method333();
				if (this.anInt773 > 32767) {
					this.anInt773 -= 65536;
				}
			} else if (local13 == 9) {
				this.aBoolean134 = true;
			} else if (local13 == 10) {
				this.anInt774 = arg0.method333();
			} else if (local13 == 11) {
				this.aBoolean135 = true;
			} else if (local13 == 12) {
				this.anInt775 = arg0.method336();
			} else if (local13 == 16) {
				this.aBoolean136 = true;
			} else if (local13 == 23) {
				this.anInt776 = arg0.method333();
				this.aByte37 = arg0.method332();
			} else if (local13 == 24) {
				this.anInt777 = arg0.method333();
			} else if (local13 == 25) {
				this.anInt778 = arg0.method333();
				this.aByte38 = arg0.method332();
			} else if (local13 == 26) {
				this.anInt779 = arg0.method333();
			} else if (local13 >= 30 && local13 < 35) {
				if (this.aStringArray9 == null) {
					this.aStringArray9 = new String[5];
				}
				this.aStringArray9[local13 - 30] = arg0.method338();
			} else if (local13 >= 35 && local13 < 40) {
				if (this.aStringArray10 == null) {
					this.aStringArray10 = new String[5];
				}
				this.aStringArray10[local13 - 35] = arg0.method338();
			} else if (local13 == 40) {
				@Pc(247) int local247 = arg0.method331();
				this.anIntArray212 = new int[local247];
				this.anIntArray213 = new int[local247];
				for (@Pc(257) int local257 = 0; local257 < local247; local257++) {
					this.anIntArray212[local257] = arg0.method333();
					this.anIntArray213[local257] = arg0.method333();
				}
			} else if (local13 == 90) {
				this.anInt780 = arg0.method333();
			} else if (local13 == 91) {
				this.anInt782 = arg0.method333();
			} else if (local13 == 92) {
				this.anInt781 = arg0.method333();
			} else if (local13 == 93) {
				this.anInt783 = arg0.method333();
			} else if (local13 == 95) {
				this.anInt771 = arg0.method333();
			}
		}
	}

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "()Lclient!db;")
	public Class1_Sub3_Sub1 method474() {
		@Pc(6) Class1_Sub3_Sub1 local6 = (Class1_Sub3_Sub1) aClass30_8.method419((long) this.anInt766);
		if (local6 != null) {
			return local6;
		}
		local6 = new Class1_Sub3_Sub1(this.anInt767, aBoolean133);
		if (this.anIntArray212 != null) {
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray212.length; local22++) {
				local6.method166(this.anIntArray212[local22], this.anIntArray213[local22]);
			}
		}
		local6.method169(64, 768, -50, -10, -50, true);
		aClass30_8.method420(local6, (long) this.anInt766, aByte36);
		return local6;
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(IB)Lclient!db;")
	public Class1_Sub3_Sub1 method476(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.anInt776;
		if (arg0 == 1) {
			local4 = this.anInt778;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(18) int local18 = this.anInt777;
		if (arg0 == 1) {
			local18 = this.anInt779;
		}
		@Pc(41) Class1_Sub3_Sub1 local41 = new Class1_Sub3_Sub1(local4, aBoolean133);
		if (local18 != -1) {
			@Pc(50) Class1_Sub3_Sub1 local50 = new Class1_Sub3_Sub1(local18, aBoolean133);
			@Pc(61) Class1_Sub3_Sub1[] local61 = new Class1_Sub3_Sub1[] { local41, local50 };
			local41 = new Class1_Sub3_Sub1(2, false, local61);
		}
		if (arg0 == 0 && this.aByte37 != 0) {
			local41.method165(this.anInt763, 0, 0, this.aByte37);
		}
		if (arg0 == 1 && this.aByte38 != 0) {
			local41.method165(this.anInt763, 0, 0, this.aByte38);
		}
		if (this.anIntArray212 != null) {
			for (@Pc(100) int local100 = 0; local100 < this.anIntArray212.length; local100++) {
				local41.method166(this.anIntArray212[local100], this.anIntArray213[local100]);
			}
		}
		return local41;
	}

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "(II)Lclient!db;")
	public Class1_Sub3_Sub1 method477(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.anInt780;
		if (arg0 == 1) {
			local2 = this.anInt782;
		}
		if (local2 == -1) {
			return null;
		}
		@Pc(23) int local23 = this.anInt781;
		if (arg0 == 1) {
			local23 = this.anInt783;
		}
		@Pc(35) Class1_Sub3_Sub1 local35 = new Class1_Sub3_Sub1(local2, aBoolean133);
		if (local23 != -1) {
			@Pc(44) Class1_Sub3_Sub1 local44 = new Class1_Sub3_Sub1(local23, aBoolean133);
			@Pc(55) Class1_Sub3_Sub1[] local55 = new Class1_Sub3_Sub1[] { local35, local44 };
			local35 = new Class1_Sub3_Sub1(2, false, local55);
		}
		if (this.anIntArray212 != null) {
			for (@Pc(67) int local67 = 0; local67 < this.anIntArray212.length; local67++) {
				local35.method166(this.anIntArray212[local67], this.anIntArray213[local67]);
			}
		}
		return local35;
	}
}
