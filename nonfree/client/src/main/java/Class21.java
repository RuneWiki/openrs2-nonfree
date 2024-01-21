import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LQFHJGYA")
public final class Class21 {

	@OriginalMember(owner = "client!LQFHJGYA", name = "r", descriptor = "[Lclient!LQFHJGYA;")
	private static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!LQFHJGYA", name = "u", descriptor = "Lclient!client;")
	public static client aClient2;

	@OriginalMember(owner = "client!LQFHJGYA", name = "A", descriptor = "[I")
	private static int[] anIntArray90;

	@OriginalMember(owner = "client!LQFHJGYA", name = "D", descriptor = "Lclient!MVHXDWGI;")
	private static Class1_Sub1_Sub4 aClass1_Sub1_Sub4_3;

	@OriginalMember(owner = "client!LQFHJGYA", name = "I", descriptor = "I")
	private static int anInt439;

	@OriginalMember(owner = "client!LQFHJGYA", name = "K", descriptor = "I")
	private static int anInt441;

	@OriginalMember(owner = "client!LQFHJGYA", name = "t", descriptor = "Lclient!WUMSOEQS;")
	public static Class46 aClass46_6 = new Class46((byte) 5, 30);

	@OriginalMember(owner = "client!LQFHJGYA", name = "k", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!LQFHJGYA", name = "n", descriptor = "I")
	private int anInt432;

	@OriginalMember(owner = "client!LQFHJGYA", name = "o", descriptor = "I")
	private int anInt433;

	@OriginalMember(owner = "client!LQFHJGYA", name = "p", descriptor = "[I")
	public int[] anIntArray86;

	@OriginalMember(owner = "client!LQFHJGYA", name = "q", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!LQFHJGYA", name = "s", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray4;

	@OriginalMember(owner = "client!LQFHJGYA", name = "v", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!LQFHJGYA", name = "w", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!LQFHJGYA", name = "E", descriptor = "[I")
	private int[] anIntArray91;

	@OriginalMember(owner = "client!LQFHJGYA", name = "a", descriptor = "Ljava/lang/String;")
	public String aString7 = "null";

	@OriginalMember(owner = "client!LQFHJGYA", name = "b", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!LQFHJGYA", name = "c", descriptor = "I")
	public int anInt423 = -1;

	@OriginalMember(owner = "client!LQFHJGYA", name = "d", descriptor = "I")
	private int anInt424 = -1;

	@OriginalMember(owner = "client!LQFHJGYA", name = "e", descriptor = "Z")
	public boolean aBoolean86 = true;

	@OriginalMember(owner = "client!LQFHJGYA", name = "f", descriptor = "I")
	public int anInt425 = -1;

	@OriginalMember(owner = "client!LQFHJGYA", name = "g", descriptor = "I")
	private int anInt426 = -1;

	@OriginalMember(owner = "client!LQFHJGYA", name = "h", descriptor = "I")
	private int anInt427 = 128;

	@OriginalMember(owner = "client!LQFHJGYA", name = "i", descriptor = "I")
	public int anInt428 = -1;

	@OriginalMember(owner = "client!LQFHJGYA", name = "j", descriptor = "I")
	private int anInt429 = -1;

	@OriginalMember(owner = "client!LQFHJGYA", name = "l", descriptor = "I")
	public int anInt430 = -1;

	@OriginalMember(owner = "client!LQFHJGYA", name = "m", descriptor = "I")
	private int anInt431 = -560;

	@OriginalMember(owner = "client!LQFHJGYA", name = "x", descriptor = "J")
	public long aLong16 = -1L;

	@OriginalMember(owner = "client!LQFHJGYA", name = "y", descriptor = "I")
	private int anInt434 = 587;

	@OriginalMember(owner = "client!LQFHJGYA", name = "z", descriptor = "I")
	private int anInt435 = 128;

	@OriginalMember(owner = "client!LQFHJGYA", name = "B", descriptor = "Z")
	public boolean aBoolean87 = false;

	@OriginalMember(owner = "client!LQFHJGYA", name = "C", descriptor = "I")
	public int anInt436 = -1;

	@OriginalMember(owner = "client!LQFHJGYA", name = "F", descriptor = "I")
	public int anInt437 = 32;

	@OriginalMember(owner = "client!LQFHJGYA", name = "G", descriptor = "B")
	public byte aByte10 = 1;

	@OriginalMember(owner = "client!LQFHJGYA", name = "H", descriptor = "I")
	public int anInt438 = -1;

	@OriginalMember(owner = "client!LQFHJGYA", name = "J", descriptor = "I")
	private int anInt440 = -1;

	@OriginalMember(owner = "client!LQFHJGYA", name = "L", descriptor = "Z")
	public boolean aBoolean88 = true;

	@OriginalMember(owner = "client!LQFHJGYA", name = "M", descriptor = "I")
	public int anInt442 = -1;

	@OriginalMember(owner = "client!LQFHJGYA", name = "N", descriptor = "I")
	private int anInt443 = -1;

	@OriginalMember(owner = "client!LQFHJGYA", name = "a", descriptor = "(I)Lclient!LQFHJGYA;")
	public static Class21 method250(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass21Array1[local1].aLong16 == (long) arg0) {
				return aClass21Array1[local1];
			}
		}
		anInt441 = (anInt441 + 1) % 20;
		@Pc(33) Class21 local33 = aClass21Array1[anInt441] = new Class21();
		aClass1_Sub1_Sub4_3.anInt529 = anIntArray90[arg0];
		local33.aLong16 = arg0;
		local33.method257(aClass1_Sub1_Sub4_3);
		return local33;
	}

	@OriginalMember(owner = "client!LQFHJGYA", name = "b", descriptor = "(Z)V")
	public static void method254() {
		try {
			aClass46_6 = null;
			anIntArray90 = null;
			aClass21Array1 = null;
			aClass1_Sub1_Sub4_3 = null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("4416, " + true + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQFHJGYA", name = "a", descriptor = "(Lclient!IEMHZJLX;)V")
	public static void method255(@OriginalArg(0) Class15 arg0) {
		aClass1_Sub1_Sub4_3 = new Class1_Sub1_Sub4(0, arg0.method181("npc.dat", null));
		@Pc(19) Class1_Sub1_Sub4 local19 = new Class1_Sub1_Sub4(0, arg0.method181("npc.idx", null));
		anInt439 = local19.method296();
		anIntArray90 = new int[anInt439];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt439; local29++) {
			anIntArray90[local29] = local27;
			local27 += local19.method296();
		}
		aClass21Array1 = new Class21[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass21Array1[local49] = new Class21();
		}
	}

	@OriginalMember(owner = "client!LQFHJGYA", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!LQFHJGYA", name = "a", descriptor = "(Z)Lclient!LQFHJGYA;")
	public Class21 method251() {
		try {
			@Pc(11) int local11 = -1;
			if (this.anInt440 != -1) {
				@Pc(20) Class33 local20 = Class33.aClass33Array1[this.anInt440];
				@Pc(23) int local23 = local20.anInt643;
				@Pc(26) int local26 = local20.anInt644;
				@Pc(29) int local29 = local20.anInt645;
				@Pc(35) int local35 = client.anIntArray236[local29 - local26];
				local11 = aClient2.anIntArray258[local23] >> local26 & local35;
			} else if (this.anInt443 != -1) {
				local11 = aClient2.anIntArray258[this.anInt443];
			}
			return local11 < 0 || local11 >= this.anIntArray86.length || this.anIntArray86[local11] == -1 ? null : method250(this.anIntArray86[local11]);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("89231, " + true + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQFHJGYA", name = "a", descriptor = "([IBII)Lclient!PDVZPZLT;")
	public Class1_Sub1_Sub1_Sub4 method252(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.anIntArray86 != null) {
				@Pc(8) Class21 local8 = this.method251();
				return local8 == null ? null : local8.method252(arg0, arg1, arg2);
			}
			@Pc(25) Class1_Sub1_Sub1_Sub4 local25 = (Class1_Sub1_Sub1_Sub4) aClass46_6.method557(this.aLong16);
			if (local25 == null) {
				@Pc(35) boolean local35 = false;
				for (@Pc(37) int local37 = 0; local37 < this.anIntArray89.length; local37++) {
					if (!Class1_Sub1_Sub1_Sub4.method364(this.anIntArray89[local37])) {
						local35 = true;
					}
				}
				if (local35) {
					return null;
				}
				@Pc(62) Class1_Sub1_Sub1_Sub4[] local62 = new Class1_Sub1_Sub1_Sub4[this.anIntArray89.length];
				for (@Pc(64) int local64 = 0; local64 < this.anIntArray89.length; local64++) {
					local62[local64] = Class1_Sub1_Sub1_Sub4.method363(this.anIntArray89[local64]);
				}
				if (local62.length == 1) {
					local25 = local62[0];
				} else {
					local25 = new Class1_Sub1_Sub1_Sub4(local62, local62.length, 0);
				}
				if (this.anIntArray88 != null) {
					for (@Pc(103) int local103 = 0; local103 < this.anIntArray88.length; local103++) {
						local25.method377(this.anIntArray88[local103], this.anIntArray91[local103]);
					}
				}
				local25.method370();
				local25.method380(this.anInt432 + 64, this.anInt433 + 850, -30, -50, -30, true);
				aClass46_6.method558(this.aLong16, local25);
			}
			@Pc(146) Class1_Sub1_Sub1_Sub4 local146 = Class1_Sub1_Sub1_Sub4.aClass1_Sub1_Sub1_Sub4_2;
			local146.method365(Class49.method573(arg1) & Class49.method573(arg2), local25);
			if (arg1 != -1 && arg2 != -1) {
				local146.method372(arg1, arg2, arg0);
			} else if (arg1 != -1) {
				local146.method371(arg1);
			}
			if (this.anInt427 != 128 || this.anInt435 != 128) {
				local146.method379(this.anInt427, this.anInt435, this.anInt427);
			}
			local146.method367();
			local146.anIntArrayArray12 = null;
			local146.anIntArrayArray11 = null;
			if (this.aByte10 == 1) {
				local146.aBoolean125 = true;
			}
			return local146;
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("75588, " + arg0 + ", " + -57 + ", " + arg1 + ", " + arg2 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQFHJGYA", name = "a", descriptor = "(B)Z")
	public boolean method253() {
		try {
			if (this.anIntArray86 == null) {
				return true;
			}
			@Pc(13) int local13 = -1;
			if (this.anInt440 != -1) {
				@Pc(22) Class33 local22 = Class33.aClass33Array1[this.anInt440];
				@Pc(25) int local25 = local22.anInt643;
				@Pc(28) int local28 = local22.anInt644;
				@Pc(31) int local31 = local22.anInt645;
				@Pc(37) int local37 = client.anIntArray236[local31 - local28];
				local13 = aClient2.anIntArray258[local25] >> local28 & local37;
			} else if (this.anInt443 != -1) {
				local13 = aClient2.anIntArray258[this.anInt443];
			}
			return local13 >= 0 && local13 < this.anIntArray86.length && this.anIntArray86[local13] != -1;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("37738, " + 97 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQFHJGYA", name = "b", descriptor = "(I)Lclient!PDVZPZLT;")
	public Class1_Sub1_Sub1_Sub4 method256(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int local5 = 50 / arg0;
			if (this.anIntArray86 != null) {
				@Pc(12) Class21 local12 = this.method251();
				return local12 == null ? null : local12.method256(this.anInt434);
			} else if (this.anIntArray87 == null) {
				return null;
			} else {
				@Pc(28) boolean local28 = false;
				for (@Pc(30) int local30 = 0; local30 < this.anIntArray87.length; local30++) {
					if (!Class1_Sub1_Sub1_Sub4.method364(this.anIntArray87[local30])) {
						local28 = true;
					}
				}
				if (local28) {
					return null;
				}
				@Pc(55) Class1_Sub1_Sub1_Sub4[] local55 = new Class1_Sub1_Sub1_Sub4[this.anIntArray87.length];
				for (@Pc(57) int local57 = 0; local57 < this.anIntArray87.length; local57++) {
					local55[local57] = Class1_Sub1_Sub1_Sub4.method363(this.anIntArray87[local57]);
				}
				@Pc(81) Class1_Sub1_Sub1_Sub4 local81;
				if (local55.length == 1) {
					local81 = local55[0];
				} else {
					local81 = new Class1_Sub1_Sub1_Sub4(local55, local55.length, 0);
				}
				if (this.anIntArray88 != null) {
					for (@Pc(96) int local96 = 0; local96 < this.anIntArray88.length; local96++) {
						local81.method377(this.anIntArray88[local96], this.anIntArray91[local96]);
					}
				}
				return local81;
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("69911, " + arg0 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQFHJGYA", name = "a", descriptor = "(ILclient!MVHXDWGI;)V")
	private void method257(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method294();
				if (local10 == 0) {
					return;
				}
				@Pc(19) int local19;
				@Pc(25) int local25;
				if (local10 == 1) {
					local19 = arg0.method294();
					this.anIntArray89 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray89[local25] = arg0.method296();
					}
				} else if (local10 == 2) {
					this.aString7 = arg0.method301();
				} else if (local10 == 3) {
					this.aByteArray6 = arg0.method302();
				} else if (local10 == 12) {
					this.aByte10 = arg0.method295();
				} else if (local10 == 13) {
					this.anInt442 = arg0.method296();
				} else if (local10 == 14) {
					this.anInt436 = arg0.method296();
				} else if (local10 == 17) {
					this.anInt436 = arg0.method296();
					this.anInt430 = arg0.method296();
					this.anInt438 = arg0.method296();
					this.anInt425 = arg0.method296();
				} else if (local10 >= 30 && local10 < 40) {
					if (this.aStringArray4 == null) {
						this.aStringArray4 = new String[5];
					}
					this.aStringArray4[local10 - 30] = arg0.method301();
					if (this.aStringArray4[local10 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray4[local10 - 30] = null;
					}
				} else if (local10 == 40) {
					local19 = arg0.method294();
					this.anIntArray88 = new int[local19];
					this.anIntArray91 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray88[local25] = arg0.method296();
						this.anIntArray91[local25] = arg0.method296();
					}
				} else if (local10 == 60) {
					local19 = arg0.method294();
					this.anIntArray87 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray87[local25] = arg0.method296();
					}
				} else if (local10 == 90) {
					this.anInt424 = arg0.method296();
				} else if (local10 == 91) {
					this.anInt426 = arg0.method296();
				} else if (local10 == 92) {
					this.anInt429 = arg0.method296();
				} else if (local10 == 93) {
					this.aBoolean88 = false;
				} else if (local10 == 95) {
					this.anInt428 = arg0.method296();
				} else if (local10 == 97) {
					this.anInt427 = arg0.method296();
				} else if (local10 == 98) {
					this.anInt435 = arg0.method296();
				} else if (local10 == 99) {
					this.aBoolean87 = true;
				} else if (local10 == 100) {
					this.anInt432 = arg0.method295();
				} else if (local10 == 101) {
					this.anInt433 = arg0.method295() * 5;
				} else if (local10 == 102) {
					this.anInt423 = arg0.method296();
				} else if (local10 == 103) {
					this.anInt437 = arg0.method296();
				} else if (local10 == 106) {
					this.anInt440 = arg0.method296();
					if (this.anInt440 == 65535) {
						this.anInt440 = -1;
					}
					this.anInt443 = arg0.method296();
					if (this.anInt443 == 65535) {
						this.anInt443 = -1;
					}
					local19 = arg0.method294();
					this.anIntArray86 = new int[local19 + 1];
					for (local25 = 0; local25 <= local19; local25++) {
						this.anIntArray86[local25] = arg0.method296();
						if (this.anIntArray86[local25] == 65535) {
							this.anIntArray86[local25] = -1;
						}
					}
				} else if (local10 == 107) {
					this.aBoolean86 = false;
				}
			}
		} catch (@Pc(384) RuntimeException local384) {
			signlink.reporterror("37680, " + 403 + ", " + arg0 + ", " + local384.toString());
			throw new RuntimeException();
		}
	}
}
