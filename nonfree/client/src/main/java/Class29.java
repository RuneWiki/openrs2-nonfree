import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PIPBZEOV")
public final class Class29 {

	@OriginalMember(owner = "client!PIPBZEOV", name = "a", descriptor = "I")
	private static int anInt510;

	@OriginalMember(owner = "client!PIPBZEOV", name = "i", descriptor = "[Lclient!PIPBZEOV;")
	private static Class29[] aClass29Array1;

	@OriginalMember(owner = "client!PIPBZEOV", name = "w", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!PIPBZEOV", name = "y", descriptor = "Lclient!SVWJKJVI;")
	private static Class1_Sub1_Sub4 aClass1_Sub1_Sub4_3;

	@OriginalMember(owner = "client!PIPBZEOV", name = "C", descriptor = "I")
	private static int anInt523;

	@OriginalMember(owner = "client!PIPBZEOV", name = "D", descriptor = "[I")
	private static int[] anIntArray147;

	@OriginalMember(owner = "client!PIPBZEOV", name = "J", descriptor = "Lclient!EQSIBNHW;")
	public static Class7 aClass7_4 = new Class7(30, 451);

	@OriginalMember(owner = "client!PIPBZEOV", name = "b", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!PIPBZEOV", name = "h", descriptor = "[I")
	private int[] anIntArray142;

	@OriginalMember(owner = "client!PIPBZEOV", name = "j", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!PIPBZEOV", name = "n", descriptor = "[I")
	private int[] anIntArray144;

	@OriginalMember(owner = "client!PIPBZEOV", name = "o", descriptor = "I")
	private int anInt518;

	@OriginalMember(owner = "client!PIPBZEOV", name = "q", descriptor = "[I")
	private int[] anIntArray145;

	@OriginalMember(owner = "client!PIPBZEOV", name = "r", descriptor = "[I")
	public int[] anIntArray146;

	@OriginalMember(owner = "client!PIPBZEOV", name = "B", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray2;

	@OriginalMember(owner = "client!PIPBZEOV", name = "G", descriptor = "I")
	private int anInt525;

	@OriginalMember(owner = "client!PIPBZEOV", name = "c", descriptor = "I")
	private int anInt511 = -22770;

	@OriginalMember(owner = "client!PIPBZEOV", name = "d", descriptor = "I")
	private int anInt512 = -1;

	@OriginalMember(owner = "client!PIPBZEOV", name = "e", descriptor = "I")
	public int anInt513 = -1;

	@OriginalMember(owner = "client!PIPBZEOV", name = "f", descriptor = "Z")
	public boolean aBoolean107 = true;

	@OriginalMember(owner = "client!PIPBZEOV", name = "g", descriptor = "I")
	private int anInt514 = 128;

	@OriginalMember(owner = "client!PIPBZEOV", name = "k", descriptor = "I")
	public int anInt515 = -1;

	@OriginalMember(owner = "client!PIPBZEOV", name = "l", descriptor = "I")
	public int anInt516 = -1;

	@OriginalMember(owner = "client!PIPBZEOV", name = "m", descriptor = "I")
	private int anInt517 = 128;

	@OriginalMember(owner = "client!PIPBZEOV", name = "p", descriptor = "Ljava/lang/String;")
	public String aString14 = "null";

	@OriginalMember(owner = "client!PIPBZEOV", name = "s", descriptor = "Z")
	public boolean aBoolean108 = true;

	@OriginalMember(owner = "client!PIPBZEOV", name = "t", descriptor = "I")
	private int anInt519 = -1;

	@OriginalMember(owner = "client!PIPBZEOV", name = "u", descriptor = "J")
	public long aLong19 = -1L;

	@OriginalMember(owner = "client!PIPBZEOV", name = "v", descriptor = "Z")
	private boolean aBoolean109 = true;

	@OriginalMember(owner = "client!PIPBZEOV", name = "x", descriptor = "I")
	private int anInt520 = -1;

	@OriginalMember(owner = "client!PIPBZEOV", name = "z", descriptor = "I")
	public int anInt521 = -1;

	@OriginalMember(owner = "client!PIPBZEOV", name = "A", descriptor = "I")
	private int anInt522 = -1;

	@OriginalMember(owner = "client!PIPBZEOV", name = "E", descriptor = "I")
	public int anInt524 = -1;

	@OriginalMember(owner = "client!PIPBZEOV", name = "F", descriptor = "B")
	public byte aByte13 = 1;

	@OriginalMember(owner = "client!PIPBZEOV", name = "H", descriptor = "I")
	private int anInt526 = -1;

	@OriginalMember(owner = "client!PIPBZEOV", name = "I", descriptor = "I")
	public int anInt527 = -1;

	@OriginalMember(owner = "client!PIPBZEOV", name = "K", descriptor = "I")
	public int anInt528 = -1;

	@OriginalMember(owner = "client!PIPBZEOV", name = "L", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!PIPBZEOV", name = "M", descriptor = "I")
	public int anInt529 = 32;

	@OriginalMember(owner = "client!PIPBZEOV", name = "a", descriptor = "(Lclient!WEMOPWVJ;)V")
	public static void method324(@OriginalArg(0) Class43 arg0) {
		aClass1_Sub1_Sub4_3 = new Class1_Sub1_Sub4(arg0.method515("npc.dat", null), true);
		@Pc(19) Class1_Sub1_Sub4 local19 = new Class1_Sub1_Sub4(arg0.method515("npc.idx", null), true);
		anInt523 = local19.method407();
		anIntArray147 = new int[anInt523];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt523; local29++) {
			anIntArray147[local29] = local27;
			local27 += local19.method407();
		}
		aClass29Array1 = new Class29[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass29Array1[local49] = new Class29();
		}
	}

	@OriginalMember(owner = "client!PIPBZEOV", name = "b", descriptor = "(I)Lclient!PIPBZEOV;")
	public static Class29 method326(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass29Array1[local1].aLong19 == (long) arg0) {
				return aClass29Array1[local1];
			}
		}
		anInt510 = (anInt510 + 1) % 20;
		@Pc(33) Class29 local33 = aClass29Array1[anInt510] = new Class29();
		aClass1_Sub1_Sub4_3.anInt624 = anIntArray147[arg0];
		local33.aLong19 = arg0;
		local33.method323(aClass1_Sub1_Sub4_3);
		return local33;
	}

	@OriginalMember(owner = "client!PIPBZEOV", name = "d", descriptor = "(I)V")
	public static void method328() {
		try {
			aClass7_4 = null;
			anIntArray147 = null;
			aClass29Array1 = null;
			aClass1_Sub1_Sub4_3 = null;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("3862, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PIPBZEOV", name = "<init>", descriptor = "()V")
	private Class29() {
	}

	@OriginalMember(owner = "client!PIPBZEOV", name = "a", descriptor = "(Z)Z")
	public boolean method322() {
		try {
			if (this.anIntArray146 == null) {
				return true;
			}
			@Pc(12) int local12 = -1;
			if (this.anInt522 != -1) {
				@Pc(21) Class9 local21 = Class9.aClass9Array1[this.anInt522];
				@Pc(24) int local24 = local21.anInt88;
				@Pc(27) int local27 = local21.anInt89;
				@Pc(30) int local30 = local21.anInt90;
				@Pc(36) int local36 = client.anIntArray236[local30 - local27];
				local12 = aClient4.anIntArray231[local24] >> local27 & local36;
			} else if (this.anInt526 != -1) {
				local12 = aClient4.anIntArray231[this.anInt526];
			}
			return local12 >= 0 && local12 < this.anIntArray146.length && this.anIntArray146[local12] != -1;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("99030, " + true + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PIPBZEOV", name = "a", descriptor = "(ILclient!SVWJKJVI;)V")
	private void method323(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method405();
				if (local14 == 0) {
					return;
				}
				@Pc(23) int local23;
				@Pc(29) int local29;
				if (local14 == 1) {
					local23 = arg0.method405();
					this.anIntArray142 = new int[local23];
					for (local29 = 0; local29 < local23; local29++) {
						this.anIntArray142[local29] = arg0.method407();
					}
				} else if (local14 == 2) {
					this.aString14 = arg0.method412();
				} else if (local14 == 3) {
					this.aByteArray7 = arg0.method413();
				} else if (local14 == 12) {
					this.aByte13 = arg0.method406();
				} else if (local14 == 13) {
					this.anInt515 = arg0.method407();
				} else if (local14 == 14) {
					this.anInt516 = arg0.method407();
				} else if (local14 == 17) {
					this.anInt516 = arg0.method407();
					this.anInt527 = arg0.method407();
					this.anInt528 = arg0.method407();
					this.anInt513 = arg0.method407();
				} else if (local14 >= 30 && local14 < 40) {
					if (this.aStringArray2 == null) {
						this.aStringArray2 = new String[5];
					}
					this.aStringArray2[local14 - 30] = arg0.method412();
					if (this.aStringArray2[local14 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray2[local14 - 30] = null;
					}
				} else if (local14 == 40) {
					local23 = arg0.method405();
					this.anIntArray145 = new int[local23];
					this.anIntArray144 = new int[local23];
					for (local29 = 0; local29 < local23; local29++) {
						this.anIntArray145[local29] = arg0.method407();
						this.anIntArray144[local29] = arg0.method407();
					}
				} else if (local14 == 60) {
					local23 = arg0.method405();
					this.anIntArray143 = new int[local23];
					for (local29 = 0; local29 < local23; local29++) {
						this.anIntArray143[local29] = arg0.method407();
					}
				} else if (local14 == 90) {
					this.anInt519 = arg0.method407();
				} else if (local14 == 91) {
					this.anInt512 = arg0.method407();
				} else if (local14 == 92) {
					this.anInt520 = arg0.method407();
				} else if (local14 == 93) {
					this.aBoolean108 = false;
				} else if (local14 == 95) {
					this.anInt524 = arg0.method407();
				} else if (local14 == 97) {
					this.anInt514 = arg0.method407();
				} else if (local14 == 98) {
					this.anInt517 = arg0.method407();
				} else if (local14 == 99) {
					this.aBoolean110 = true;
				} else if (local14 == 100) {
					this.anInt525 = arg0.method406();
				} else if (local14 == 101) {
					this.anInt518 = arg0.method406() * 5;
				} else if (local14 == 102) {
					this.anInt521 = arg0.method407();
				} else if (local14 == 103) {
					this.anInt529 = arg0.method407();
				} else if (local14 == 106) {
					this.anInt522 = arg0.method407();
					if (this.anInt522 == 65535) {
						this.anInt522 = -1;
					}
					this.anInt526 = arg0.method407();
					if (this.anInt526 == 65535) {
						this.anInt526 = -1;
					}
					local23 = arg0.method405();
					this.anIntArray146 = new int[local23 + 1];
					for (local29 = 0; local29 <= local23; local29++) {
						this.anIntArray146[local29] = arg0.method407();
						if (this.anIntArray146[local29] == 65535) {
							this.anIntArray146[local29] = -1;
						}
					}
				} else if (local14 == 107) {
					this.aBoolean107 = false;
				}
			}
		} catch (@Pc(388) RuntimeException local388) {
			signlink.reporterror("85108, " + -13096 + ", " + arg0 + ", " + local388.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PIPBZEOV", name = "a", descriptor = "(I)Lclient!PIPBZEOV;")
	public Class29 method325() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt522 != -1) {
				@Pc(19) Class9 local19 = Class9.aClass9Array1[this.anInt522];
				@Pc(22) int local22 = local19.anInt88;
				@Pc(25) int local25 = local19.anInt89;
				@Pc(28) int local28 = local19.anInt90;
				@Pc(34) int local34 = client.anIntArray236[local28 - local25];
				local1 = aClient4.anIntArray231[local22] >> local25 & local34;
			} else if (this.anInt526 != -1) {
				local1 = aClient4.anIntArray231[this.anInt526];
			}
			return local1 < 0 || local1 >= this.anIntArray146.length || this.anIntArray146[local1] == -1 ? null : method326(this.anIntArray146[local1]);
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("63425, " + 1 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PIPBZEOV", name = "c", descriptor = "(I)Lclient!IYSWJGDE;")
	public Class1_Sub1_Sub1_Sub3 method327() {
		try {
			if (this.anIntArray146 != null) {
				@Pc(8) Class29 local8 = this.method325();
				return local8 == null ? null : local8.method327();
			} else if (this.anIntArray143 == null) {
				return null;
			} else {
				@Pc(23) boolean local23 = false;
				for (@Pc(35) int local35 = 0; local35 < this.anIntArray143.length; local35++) {
					if (!Class1_Sub1_Sub1_Sub3.method148(this.anIntArray143[local35])) {
						local23 = true;
					}
				}
				if (local23) {
					return null;
				}
				@Pc(60) Class1_Sub1_Sub1_Sub3[] local60 = new Class1_Sub1_Sub1_Sub3[this.anIntArray143.length];
				for (@Pc(62) int local62 = 0; local62 < this.anIntArray143.length; local62++) {
					local60[local62] = Class1_Sub1_Sub1_Sub3.method147(this.anIntArray143[local62]);
				}
				@Pc(86) Class1_Sub1_Sub1_Sub3 local86;
				if (local60.length == 1) {
					local86 = local60[0];
				} else {
					local86 = new Class1_Sub1_Sub1_Sub3((byte) 9, local60.length, local60);
				}
				if (this.anIntArray145 != null) {
					for (@Pc(101) int local101 = 0; local101 < this.anIntArray145.length; local101++) {
						local86.method161(this.anIntArray145[local101], this.anIntArray144[local101]);
					}
				}
				return local86;
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("40914, " + -491 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PIPBZEOV", name = "a", descriptor = "(I[III)Lclient!IYSWJGDE;")
	public Class1_Sub1_Sub1_Sub3 method329(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 != -22770) {
				throw new NullPointerException();
			} else if (this.anIntArray146 == null) {
				@Pc(33) Class1_Sub1_Sub1_Sub3 local33 = (Class1_Sub1_Sub1_Sub3) aClass7_4.method40(this.aLong19);
				if (local33 == null) {
					@Pc(37) boolean local37 = false;
					for (@Pc(39) int local39 = 0; local39 < this.anIntArray142.length; local39++) {
						if (!Class1_Sub1_Sub1_Sub3.method148(this.anIntArray142[local39])) {
							local37 = true;
						}
					}
					if (local37) {
						return null;
					}
					@Pc(64) Class1_Sub1_Sub1_Sub3[] local64 = new Class1_Sub1_Sub1_Sub3[this.anIntArray142.length];
					for (@Pc(66) int local66 = 0; local66 < this.anIntArray142.length; local66++) {
						local64[local66] = Class1_Sub1_Sub1_Sub3.method147(this.anIntArray142[local66]);
					}
					if (local64.length == 1) {
						local33 = local64[0];
					} else {
						local33 = new Class1_Sub1_Sub1_Sub3((byte) 9, local64.length, local64);
					}
					if (this.anIntArray145 != null) {
						for (@Pc(105) int local105 = 0; local105 < this.anIntArray145.length; local105++) {
							local33.method161(this.anIntArray145[local105], this.anIntArray144[local105]);
						}
					}
					local33.method154();
					local33.method164(this.anInt525 + 64, this.anInt518 + 850, -30, -50, -30, true);
					aClass7_4.method41(825, this.aLong19, local33);
				}
				@Pc(148) Class1_Sub1_Sub1_Sub3 local148 = Class1_Sub1_Sub1_Sub3.aClass1_Sub1_Sub1_Sub3_1;
				local148.method149(Class30.method334(arg2) & Class30.method334(arg3), local33);
				if (arg2 != -1 && arg3 != -1) {
					local148.method156(arg3, arg2, arg1, (byte) 8);
				} else if (arg2 != -1) {
					local148.method155(arg2);
				}
				if (this.anInt514 != 128 || this.anInt517 != 128) {
					local148.method163(this.anInt514, this.anInt514, this.anInt517);
				}
				local148.method151();
				local148.anIntArrayArray8 = null;
				local148.anIntArrayArray7 = null;
				if (this.aByte13 == 1) {
					local148.aBoolean42 = true;
				}
				return local148;
			} else {
				@Pc(15) Class29 local15 = this.method325();
				return local15 == null ? null : local15.method329(this.anInt511, arg1, arg2, arg3);
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("97296, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}
}
