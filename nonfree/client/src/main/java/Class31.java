import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OMIIKHIV")
public final class Class31 {

	@OriginalMember(owner = "client!OMIIKHIV", name = "h", descriptor = "I")
	private static int anInt568;

	@OriginalMember(owner = "client!OMIIKHIV", name = "n", descriptor = "[Lclient!OMIIKHIV;")
	private static Class31[] aClass31Array1;

	@OriginalMember(owner = "client!OMIIKHIV", name = "r", descriptor = "I")
	private static int anInt575;

	@OriginalMember(owner = "client!OMIIKHIV", name = "x", descriptor = "Lclient!CFARFRSG;")
	private static Class1_Sub1_Sub2 aClass1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!OMIIKHIV", name = "y", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!OMIIKHIV", name = "E", descriptor = "[I")
	private static int[] anIntArray137;

	@OriginalMember(owner = "client!OMIIKHIV", name = "L", descriptor = "Lclient!LSQNLJTA;")
	public static Class29 aClass29_5 = new Class29(30, (byte) 17);

	@OriginalMember(owner = "client!OMIIKHIV", name = "d", descriptor = "[I")
	public int[] anIntArray133;

	@OriginalMember(owner = "client!OMIIKHIV", name = "e", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!OMIIKHIV", name = "p", descriptor = "I")
	private int anInt574;

	@OriginalMember(owner = "client!OMIIKHIV", name = "u", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!OMIIKHIV", name = "A", descriptor = "I")
	private int anInt579;

	@OriginalMember(owner = "client!OMIIKHIV", name = "B", descriptor = "Ljava/lang/String;")
	public String aString8;

	@OriginalMember(owner = "client!OMIIKHIV", name = "D", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!OMIIKHIV", name = "G", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray5;

	@OriginalMember(owner = "client!OMIIKHIV", name = "H", descriptor = "I")
	private int anInt581;

	@OriginalMember(owner = "client!OMIIKHIV", name = "K", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!OMIIKHIV", name = "N", descriptor = "[B")
	public byte[] aByteArray15;

	@OriginalMember(owner = "client!OMIIKHIV", name = "a", descriptor = "I")
	private int anInt564 = 128;

	@OriginalMember(owner = "client!OMIIKHIV", name = "b", descriptor = "I")
	private int anInt565 = -1;

	@OriginalMember(owner = "client!OMIIKHIV", name = "c", descriptor = "I")
	public int anInt566 = -1;

	@OriginalMember(owner = "client!OMIIKHIV", name = "f", descriptor = "B")
	private byte aByte22 = 6;

	@OriginalMember(owner = "client!OMIIKHIV", name = "g", descriptor = "I")
	private int anInt567 = 128;

	@OriginalMember(owner = "client!OMIIKHIV", name = "i", descriptor = "I")
	private int anInt569 = 22486;

	@OriginalMember(owner = "client!OMIIKHIV", name = "j", descriptor = "J")
	public long aLong22 = -1L;

	@OriginalMember(owner = "client!OMIIKHIV", name = "k", descriptor = "I")
	public int anInt570 = -1;

	@OriginalMember(owner = "client!OMIIKHIV", name = "l", descriptor = "I")
	private int anInt571 = -1;

	@OriginalMember(owner = "client!OMIIKHIV", name = "m", descriptor = "I")
	private int anInt572 = -1;

	@OriginalMember(owner = "client!OMIIKHIV", name = "o", descriptor = "I")
	public int anInt573 = -1;

	@OriginalMember(owner = "client!OMIIKHIV", name = "q", descriptor = "Z")
	public boolean aBoolean146 = false;

	@OriginalMember(owner = "client!OMIIKHIV", name = "s", descriptor = "B")
	public byte aByte23 = 1;

	@OriginalMember(owner = "client!OMIIKHIV", name = "t", descriptor = "Z")
	public boolean aBoolean147 = true;

	@OriginalMember(owner = "client!OMIIKHIV", name = "v", descriptor = "I")
	public int anInt576 = -1;

	@OriginalMember(owner = "client!OMIIKHIV", name = "w", descriptor = "I")
	public int anInt577 = -1;

	@OriginalMember(owner = "client!OMIIKHIV", name = "z", descriptor = "I")
	public int anInt578 = -1;

	@OriginalMember(owner = "client!OMIIKHIV", name = "C", descriptor = "I")
	private int anInt580 = -1;

	@OriginalMember(owner = "client!OMIIKHIV", name = "F", descriptor = "Z")
	private boolean aBoolean148 = false;

	@OriginalMember(owner = "client!OMIIKHIV", name = "I", descriptor = "I")
	public int anInt582 = 32;

	@OriginalMember(owner = "client!OMIIKHIV", name = "J", descriptor = "I")
	private int anInt583 = -1;

	@OriginalMember(owner = "client!OMIIKHIV", name = "M", descriptor = "Z")
	public boolean aBoolean149 = true;

	@OriginalMember(owner = "client!OMIIKHIV", name = "O", descriptor = "I")
	public int anInt584 = -1;

	@OriginalMember(owner = "client!OMIIKHIV", name = "a", descriptor = "(I)Lclient!OMIIKHIV;")
	public static Class31 method400(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass31Array1[local1].aLong22 == (long) arg0) {
				return aClass31Array1[local1];
			}
		}
		anInt568 = (anInt568 + 1) % 20;
		@Pc(33) Class31 local33 = aClass31Array1[anInt568] = new Class31();
		aClass1_Sub1_Sub2_3.anInt153 = anIntArray137[arg0];
		local33.aLong22 = arg0;
		local33.method399(aClass1_Sub1_Sub2_3);
		return local33;
	}

	@OriginalMember(owner = "client!OMIIKHIV", name = "a", descriptor = "(Lclient!VSUYIIVA;)V")
	public static void method404(@OriginalArg(0) Class42 arg0) {
		aClass1_Sub1_Sub2_3 = new Class1_Sub1_Sub2(arg0.method539("npc.dat", null), 792);
		@Pc(19) Class1_Sub1_Sub2 local19 = new Class1_Sub1_Sub2(arg0.method539("npc.idx", null), 792);
		anInt575 = local19.method61();
		anIntArray137 = new int[anInt575];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt575; local29++) {
			anIntArray137[local29] = local27;
			local27 += local19.method61();
		}
		aClass31Array1 = new Class31[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass31Array1[local49] = new Class31();
		}
	}

	@OriginalMember(owner = "client!OMIIKHIV", name = "a", descriptor = "(Z)V")
	public static void method406() {
		try {
			aClass29_5 = null;
			anIntArray137 = null;
			aClass31Array1 = null;
			aClass1_Sub1_Sub2_3 = null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("65308, " + true + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OMIIKHIV", name = "<init>", descriptor = "()V")
	private Class31() {
	}

	@OriginalMember(owner = "client!OMIIKHIV", name = "a", descriptor = "(Lclient!CFARFRSG;I)V")
	private void method399(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		try {
			if (this.anInt569 != 22486) {
				throw new NullPointerException();
			}
			while (true) {
				while (true) {
					@Pc(12) int local12 = arg0.method59();
					if (local12 == 0) {
						return;
					}
					@Pc(21) int local21;
					@Pc(27) int local27;
					if (local12 == 1) {
						local21 = arg0.method59();
						this.anIntArray135 = new int[local21];
						for (local27 = 0; local27 < local21; local27++) {
							this.anIntArray135[local27] = arg0.method61();
						}
					} else if (local12 == 2) {
						this.aString8 = arg0.method66();
					} else if (local12 == 3) {
						this.aByteArray15 = arg0.method67();
					} else if (local12 == 12) {
						this.aByte23 = arg0.method60();
					} else if (local12 == 13) {
						this.anInt578 = arg0.method61();
					} else if (local12 == 14) {
						this.anInt573 = arg0.method61();
					} else if (local12 == 17) {
						this.anInt573 = arg0.method61();
						this.anInt584 = arg0.method61();
						this.anInt570 = arg0.method61();
						this.anInt577 = arg0.method61();
					} else if (local12 >= 30 && local12 < 40) {
						if (this.aStringArray5 == null) {
							this.aStringArray5 = new String[5];
						}
						this.aStringArray5[local12 - 30] = arg0.method66();
						if (this.aStringArray5[local12 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray5[local12 - 30] = null;
						}
					} else if (local12 == 40) {
						local21 = arg0.method59();
						this.anIntArray138 = new int[local21];
						this.anIntArray134 = new int[local21];
						for (local27 = 0; local27 < local21; local27++) {
							this.anIntArray138[local27] = arg0.method61();
							this.anIntArray134[local27] = arg0.method61();
						}
					} else if (local12 == 60) {
						local21 = arg0.method59();
						this.anIntArray136 = new int[local21];
						for (local27 = 0; local27 < local21; local27++) {
							this.anIntArray136[local27] = arg0.method61();
						}
					} else if (local12 == 90) {
						this.anInt583 = arg0.method61();
					} else if (local12 == 91) {
						this.anInt572 = arg0.method61();
					} else if (local12 == 92) {
						this.anInt571 = arg0.method61();
					} else if (local12 == 93) {
						this.aBoolean147 = false;
					} else if (local12 == 95) {
						this.anInt566 = arg0.method61();
					} else if (local12 == 97) {
						this.anInt564 = arg0.method61();
					} else if (local12 == 98) {
						this.anInt567 = arg0.method61();
					} else if (local12 == 99) {
						this.aBoolean146 = true;
					} else if (local12 == 100) {
						this.anInt579 = arg0.method60();
					} else if (local12 == 101) {
						this.anInt581 = arg0.method60() * 5;
					} else if (local12 == 102) {
						this.anInt576 = arg0.method61();
					} else if (local12 == 103) {
						this.anInt582 = arg0.method61();
					} else if (local12 == 106) {
						this.anInt580 = arg0.method61();
						if (this.anInt580 == 65535) {
							this.anInt580 = -1;
						}
						this.anInt565 = arg0.method61();
						if (this.anInt565 == 65535) {
							this.anInt565 = -1;
						}
						local21 = arg0.method59();
						this.anIntArray133 = new int[local21 + 1];
						for (local27 = 0; local27 <= local21; local27++) {
							this.anIntArray133[local27] = arg0.method61();
							if (this.anIntArray133[local27] == 65535) {
								this.anIntArray133[local27] = -1;
							}
						}
					} else if (local12 == 107) {
						this.aBoolean149 = false;
					}
				}
			}
		} catch (@Pc(386) RuntimeException local386) {
			signlink.reporterror("65097, " + arg0 + ", " + 22486 + ", " + local386.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OMIIKHIV", name = "a", descriptor = "([IZII)Lclient!LFTMDGKK;")
	public Class1_Sub1_Sub1_Sub4 method401(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.anIntArray133 != null) {
				@Pc(8) Class31 local8 = this.method402();
				return local8 == null ? null : local8.method401(arg0, arg1, arg2);
			}
			@Pc(25) Class1_Sub1_Sub1_Sub4 local25 = (Class1_Sub1_Sub1_Sub4) aClass29_5.method334(this.aLong22);
			if (local25 == null) {
				@Pc(38) boolean local38 = false;
				for (@Pc(40) int local40 = 0; local40 < this.anIntArray135.length; local40++) {
					if (!Class1_Sub1_Sub1_Sub4.method303(this.anIntArray135[local40])) {
						local38 = true;
					}
				}
				if (local38) {
					return null;
				}
				@Pc(65) Class1_Sub1_Sub1_Sub4[] local65 = new Class1_Sub1_Sub1_Sub4[this.anIntArray135.length];
				for (@Pc(67) int local67 = 0; local67 < this.anIntArray135.length; local67++) {
					local65[local67] = Class1_Sub1_Sub1_Sub4.method302(this.anIntArray135[local67], this.anInt574);
				}
				if (local65.length == 1) {
					local25 = local65[0];
				} else {
					local25 = new Class1_Sub1_Sub1_Sub4(local65.length, 698, local65);
				}
				if (this.anIntArray138 != null) {
					for (@Pc(108) int local108 = 0; local108 < this.anIntArray138.length; local108++) {
						local25.method316(this.anIntArray138[local108], this.anIntArray134[local108]);
					}
				}
				local25.method309();
				local25.method319(this.anInt579 + 64, this.anInt581 + 850, -30, -50, -30, true);
				aClass29_5.method335(local25, this.aLong22);
			}
			@Pc(151) Class1_Sub1_Sub1_Sub4 local151 = Class1_Sub1_Sub1_Sub4.aClass1_Sub1_Sub1_Sub4_2;
			local151.method304(local25, Class6.method44(arg2) & Class6.method44(arg1));
			if (arg2 != -1 && arg1 != -1) {
				local151.method311(arg0, arg1, arg2);
			} else if (arg2 != -1) {
				local151.method310(arg2);
			}
			if (this.anInt564 != 128 || this.anInt567 != 128) {
				local151.method318(this.anInt567, this.anInt564, this.anInt564);
			}
			local151.method306();
			local151.anIntArrayArray9 = null;
			local151.anIntArrayArray8 = null;
			if (this.aByte23 == 1) {
				local151.aBoolean111 = true;
			}
			return local151;
		} catch (@Pc(219) RuntimeException local219) {
			signlink.reporterror("51241, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local219.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OMIIKHIV", name = "b", descriptor = "(I)Lclient!OMIIKHIV;")
	public Class31 method402() {
		try {
			@Pc(11) int local11 = -1;
			if (this.anInt580 != -1) {
				@Pc(20) Class8 local20 = Class8.aClass8Array1[this.anInt580];
				@Pc(23) int local23 = local20.anInt203;
				@Pc(26) int local26 = local20.anInt204;
				@Pc(29) int local29 = local20.anInt205;
				@Pc(35) int local35 = client.anIntArray269[local29 - local26];
				local11 = aClient4.anIntArray243[local23] >> local26 & local35;
			} else if (this.anInt565 != -1) {
				local11 = aClient4.anIntArray243[this.anInt565];
			}
			return local11 < 0 || local11 >= this.anIntArray133.length || this.anIntArray133[local11] == -1 ? null : method400(this.anIntArray133[local11]);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("76048, " + 223 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OMIIKHIV", name = "c", descriptor = "(I)Z")
	public boolean method403() {
		try {
			if (this.anIntArray133 == null) {
				return true;
			}
			@Pc(12) int local12 = -1;
			if (this.anInt580 != -1) {
				@Pc(21) Class8 local21 = Class8.aClass8Array1[this.anInt580];
				@Pc(24) int local24 = local21.anInt203;
				@Pc(27) int local27 = local21.anInt204;
				@Pc(30) int local30 = local21.anInt205;
				@Pc(36) int local36 = client.anIntArray269[local30 - local27];
				local12 = aClient4.anIntArray243[local24] >> local27 & local36;
			} else if (this.anInt565 != -1) {
				local12 = aClient4.anIntArray243[this.anInt565];
			}
			return local12 >= 0 && local12 < this.anIntArray133.length && this.anIntArray133[local12] != -1;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("73262, " + 0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OMIIKHIV", name = "a", descriptor = "(B)Lclient!LFTMDGKK;")
	public Class1_Sub1_Sub1_Sub4 method405() {
		try {
			if (this.aByte22 != 6) {
				throw new NullPointerException();
			} else if (this.anIntArray133 != null) {
				@Pc(16) Class31 local16 = this.method402();
				return local16 == null ? null : local16.method405();
			} else if (this.anIntArray136 == null) {
				return null;
			} else {
				@Pc(31) boolean local31 = false;
				for (@Pc(33) int local33 = 0; local33 < this.anIntArray136.length; local33++) {
					if (!Class1_Sub1_Sub1_Sub4.method303(this.anIntArray136[local33])) {
						local31 = true;
					}
				}
				if (local31) {
					return null;
				}
				@Pc(58) Class1_Sub1_Sub1_Sub4[] local58 = new Class1_Sub1_Sub1_Sub4[this.anIntArray136.length];
				for (@Pc(60) int local60 = 0; local60 < this.anIntArray136.length; local60++) {
					local58[local60] = Class1_Sub1_Sub1_Sub4.method302(this.anIntArray136[local60], this.anInt574);
				}
				@Pc(86) Class1_Sub1_Sub1_Sub4 local86;
				if (local58.length == 1) {
					local86 = local58[0];
				} else {
					local86 = new Class1_Sub1_Sub1_Sub4(local58.length, 698, local58);
				}
				if (this.anIntArray138 != null) {
					for (@Pc(101) int local101 = 0; local101 < this.anIntArray138.length; local101++) {
						local86.method316(this.anIntArray138[local101], this.anIntArray134[local101]);
					}
				}
				return local86;
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("68207, " + 6 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}
}
