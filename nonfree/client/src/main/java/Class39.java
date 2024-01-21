import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!xb")
public final class Class39 {

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "Z")
	private static boolean aBoolean145;

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "I")
	private static int anInt661;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "[I")
	private static int[] anIntArray201;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_20;

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "[Lclient!xb;")
	private static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "I")
	private static int anInt662;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "I")
	private static int anInt660 = -494;

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "Z")
	private static boolean aBoolean144 = true;

	@OriginalMember(owner = "client!xb", name = "P", descriptor = "Lclient!s;")
	public static Class32 aClass32_4 = new Class32(-24094, 500);

	@OriginalMember(owner = "client!xb", name = "Q", descriptor = "Lclient!s;")
	public static Class32 aClass32_5 = new Class32(-24094, 30);

	@OriginalMember(owner = "client!xb", name = "j", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!xb", name = "k", descriptor = "[I")
	private int[] anIntArray203;

	@OriginalMember(owner = "client!xb", name = "l", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!xb", name = "m", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!xb", name = "n", descriptor = "[I")
	private int[] anIntArray204;

	@OriginalMember(owner = "client!xb", name = "o", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!xb", name = "p", descriptor = "I")
	public int anInt664;

	@OriginalMember(owner = "client!xb", name = "q", descriptor = "I")
	public int anInt665;

	@OriginalMember(owner = "client!xb", name = "r", descriptor = "Z")
	public boolean aBoolean146;

	@OriginalMember(owner = "client!xb", name = "s", descriptor = "Z")
	public boolean aBoolean147;

	@OriginalMember(owner = "client!xb", name = "t", descriptor = "Z")
	public boolean aBoolean148;

	@OriginalMember(owner = "client!xb", name = "u", descriptor = "Z")
	private boolean aBoolean149;

	@OriginalMember(owner = "client!xb", name = "v", descriptor = "Z")
	private boolean aBoolean150;

	@OriginalMember(owner = "client!xb", name = "w", descriptor = "Z")
	public boolean aBoolean151;

	@OriginalMember(owner = "client!xb", name = "x", descriptor = "I")
	public int anInt666;

	@OriginalMember(owner = "client!xb", name = "y", descriptor = "I")
	public int anInt667;

	@OriginalMember(owner = "client!xb", name = "z", descriptor = "B")
	private byte aByte26;

	@OriginalMember(owner = "client!xb", name = "A", descriptor = "B")
	private byte aByte27;

	@OriginalMember(owner = "client!xb", name = "B", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray7;

	@OriginalMember(owner = "client!xb", name = "C", descriptor = "Z")
	private boolean aBoolean152;

	@OriginalMember(owner = "client!xb", name = "D", descriptor = "I")
	public int anInt668;

	@OriginalMember(owner = "client!xb", name = "E", descriptor = "I")
	public int anInt669;

	@OriginalMember(owner = "client!xb", name = "F", descriptor = "Z")
	private boolean aBoolean153;

	@OriginalMember(owner = "client!xb", name = "G", descriptor = "Z")
	public boolean aBoolean154;

	@OriginalMember(owner = "client!xb", name = "H", descriptor = "I")
	private int anInt670;

	@OriginalMember(owner = "client!xb", name = "I", descriptor = "I")
	private int anInt671;

	@OriginalMember(owner = "client!xb", name = "J", descriptor = "I")
	private int anInt672;

	@OriginalMember(owner = "client!xb", name = "K", descriptor = "I")
	private int anInt673;

	@OriginalMember(owner = "client!xb", name = "L", descriptor = "I")
	private int anInt674;

	@OriginalMember(owner = "client!xb", name = "M", descriptor = "I")
	private int anInt675;

	@OriginalMember(owner = "client!xb", name = "N", descriptor = "I")
	public int anInt676;

	@OriginalMember(owner = "client!xb", name = "O", descriptor = "Z")
	public boolean aBoolean155;

	@OriginalMember(owner = "client!xb", name = "i", descriptor = "I")
	private int anInt663 = -1;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method494(@OriginalArg(0) Class36 arg0) {
		aClass1_Sub3_Sub3_20 = new Class1_Sub3_Sub3(arg0.method479((byte) 6, null, "loc.dat"), 4);
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg0.method479((byte) 6, null, "loc.idx"), 4);
		anInt661 = local21.method382();
		anIntArray201 = new int[anInt661];
		@Pc(29) int local29 = 2;
		for (@Pc(31) int local31 = 0; local31 < anInt661; local31++) {
			anIntArray201[local31] = local29;
			local29 += local21.method382();
		}
		aClass39Array1 = new Class39[10];
		for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
			aClass39Array1[local51] = new Class39();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(I)V")
	public static void method495() {
		try {
			aClass32_4 = null;
			aClass32_5 = null;
			anIntArray201 = null;
			aClass39Array1 = null;
			aClass1_Sub3_Sub3_20 = null;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("41892, " + 300 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "(I)Lclient!xb;")
	public static Class39 method496(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass39Array1[local1].anInt663 == arg0) {
				return aClass39Array1[local1];
			}
		}
		anInt662 = (anInt662 + 1) % 10;
		@Pc(27) Class39 local27 = aClass39Array1[anInt662];
		aClass1_Sub3_Sub3_20.anInt433 = anIntArray201[arg0];
		local27.anInt663 = arg0;
		local27.method497();
		local27.method498(aClass1_Sub3_Sub3_20);
		return local27;
	}

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "()V")
	private Class39() {
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "()V")
	private void method497() {
		this.anIntArray202 = null;
		this.anIntArray203 = null;
		this.aString23 = null;
		this.aByteArray12 = null;
		this.anIntArray204 = null;
		this.anIntArray205 = null;
		this.anInt664 = 1;
		this.anInt665 = 1;
		this.aBoolean146 = true;
		this.aBoolean147 = true;
		this.aBoolean148 = false;
		this.aBoolean149 = false;
		this.aBoolean150 = false;
		this.aBoolean151 = false;
		this.anInt666 = -1;
		this.anInt667 = 16;
		this.aByte26 = 0;
		this.aByte27 = 0;
		this.aStringArray7 = null;
		this.aBoolean152 = false;
		this.anInt668 = -1;
		this.anInt669 = -1;
		this.aBoolean153 = false;
		this.aBoolean154 = true;
		this.anInt670 = 128;
		this.anInt671 = 128;
		this.anInt672 = 128;
		this.anInt676 = 0;
		this.anInt673 = 0;
		this.anInt674 = 0;
		this.anInt675 = 0;
		this.aBoolean155 = false;
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(ILclient!kb;)V")
	private void method498(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				while (true) {
					@Pc(10) int local10 = arg0.method380();
					if (local10 == 0) {
						if (this.anIntArray203 == null) {
							this.anIntArray203 = new int[0];
						}
						if (local3 == -1) {
							this.aBoolean148 = false;
							if (this.anIntArray203.length > 0 && this.anIntArray203[0] == 10) {
								this.aBoolean148 = true;
							}
							if (this.aStringArray7 != null) {
								this.aBoolean148 = true;
								return;
							}
						}
						return;
					}
					@Pc(18) int local18;
					@Pc(28) int local28;
					if (local10 == 1) {
						local18 = arg0.method380();
						this.anIntArray203 = new int[local18];
						this.anIntArray202 = new int[local18];
						for (local28 = 0; local28 < local18; local28++) {
							this.anIntArray202[local28] = arg0.method382();
							this.anIntArray203[local28] = arg0.method380();
						}
					} else if (local10 == 2) {
						this.aString23 = arg0.method387();
					} else if (local10 == 3) {
						this.aByteArray12 = arg0.method388();
					} else if (local10 == 14) {
						this.anInt664 = arg0.method380();
					} else if (local10 == 15) {
						this.anInt665 = arg0.method380();
					} else if (local10 == 17) {
						this.aBoolean146 = false;
					} else if (local10 == 18) {
						this.aBoolean147 = false;
					} else if (local10 == 19) {
						local3 = arg0.method380();
						if (local3 == 1) {
							this.aBoolean148 = true;
						}
					} else if (local10 == 21) {
						this.aBoolean149 = true;
					} else if (local10 == 22) {
						this.aBoolean150 = true;
					} else if (local10 == 23) {
						this.aBoolean151 = true;
					} else if (local10 == 24) {
						this.anInt666 = arg0.method382();
						if (this.anInt666 == 65535) {
							this.anInt666 = -1;
						}
					} else if (local10 == 25) {
						this.aBoolean152 = true;
					} else if (local10 == 28) {
						this.anInt667 = arg0.method380();
					} else if (local10 == 29) {
						this.aByte26 = arg0.method381();
					} else if (local10 == 39) {
						this.aByte27 = arg0.method381();
					} else if (local10 >= 30 && local10 < 39) {
						if (this.aStringArray7 == null) {
							this.aStringArray7 = new String[5];
						}
						this.aStringArray7[local10 - 30] = arg0.method387();
					} else if (local10 == 40) {
						local18 = arg0.method380();
						this.anIntArray204 = new int[local18];
						this.anIntArray205 = new int[local18];
						for (local28 = 0; local28 < local18; local28++) {
							this.anIntArray204[local28] = arg0.method382();
							this.anIntArray205[local28] = arg0.method382();
						}
					} else if (local10 == 60) {
						this.anInt668 = arg0.method382();
					} else if (local10 == 62) {
						this.aBoolean153 = true;
					} else if (local10 == 64) {
						this.aBoolean154 = false;
					} else if (local10 == 65) {
						this.anInt670 = arg0.method382();
					} else if (local10 == 66) {
						this.anInt671 = arg0.method382();
					} else if (local10 == 67) {
						this.anInt672 = arg0.method382();
					} else if (local10 == 68) {
						this.anInt669 = arg0.method382();
					} else if (local10 == 69) {
						this.anInt676 = arg0.method380();
					} else if (local10 == 70) {
						this.anInt673 = arg0.method383();
					} else if (local10 == 71) {
						this.anInt674 = arg0.method383();
					} else if (local10 == 72) {
						this.anInt675 = arg0.method383();
					} else if (local10 == 73) {
						this.aBoolean155 = true;
					}
				}
			}
		} catch (@Pc(388) RuntimeException local388) {
			signlink.reporterror("10476, " + 213 + ", " + arg0 + ", " + local388.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(IIIIIII)Lclient!eb;")
	public Class1_Sub3_Sub1 method499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = 0; local5 < this.anIntArray203.length; local5++) {
			if (this.anIntArray203[local5] == arg0) {
				local3 = local5;
				break;
			}
		}
		if (local3 == -1) {
			return null;
		}
		@Pc(47) long local47 = (long) ((this.anInt663 << 6) + (local3 << 3) + arg1) + ((long) (arg6 + 1) << 32);
		if (aBoolean145) {
			local47 = 0L;
		}
		if (!this.aBoolean149 && !this.aBoolean150) {
			@Pc(62) Class1_Sub3_Sub1 local62 = (Class1_Sub3_Sub1) aClass32_5.method470(local47);
			if (local62 != null) {
				return local62;
			}
		}
		if (local3 >= this.anIntArray202.length) {
			return null;
		}
		@Pc(78) int local78 = this.anIntArray202[local3];
		if (local78 == -1) {
			return null;
		}
		@Pc(93) boolean local93 = this.aBoolean153 ^ arg1 > 3;
		if (local93) {
			local78 += 65536;
		}
		@Pc(105) Class1_Sub3_Sub1 local105 = (Class1_Sub3_Sub1) aClass32_4.method470((long) local78);
		if (local105 == null) {
			local105 = new Class1_Sub3_Sub1(local78 & 0xFFFF, 298);
			if (local93) {
				local105.method214();
			}
			aClass32_4.method471((long) local78, 7, local105);
		}
		@Pc(140) boolean local140;
		if (this.anInt670 == 128 && this.anInt671 == 128 && this.anInt672 == 128) {
			local140 = false;
		} else {
			local140 = true;
		}
		@Pc(155) boolean local155;
		if (this.anInt673 == 0 && this.anInt674 == 0 && this.anInt675 == 0) {
			local155 = false;
		} else {
			local155 = true;
		}
		@Pc(198) Class1_Sub3_Sub1 local198 = new Class1_Sub3_Sub1(-428, !this.aBoolean150, local105, this.anIntArray204 == null, arg1 == 0 && !this.aBoolean149 && arg6 == -1 && !local140 && !local155, !this.aBoolean152);
		if (arg6 != -1) {
			local198.method206();
			local198.method207(arg6);
			local198.anIntArrayArray8 = null;
			local198.anIntArrayArray7 = null;
		}
		while (arg1-- > 0) {
			local198.method210();
		}
		@Pc(227) int local227;
		if (this.anIntArray204 != null) {
			for (local227 = 0; local227 < this.anIntArray204.length; local227++) {
				local198.method213(this.anIntArray204[local227], this.anIntArray205[local227]);
			}
		}
		if (local140) {
			local198.method215(this.anInt670, this.anInt671, this.anInt672);
		}
		if (this.aBoolean149) {
			local227 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (@Pc(271) int local271 = 0; local271 < local198.anInt249; local271++) {
				@Pc(278) int local278 = local198.anIntArray69[local271];
				@Pc(283) int local283 = local198.anIntArray71[local271];
				@Pc(295) int local295 = arg2 + (arg3 - arg2) * (local278 + 64) / 128;
				@Pc(307) int local307 = arg5 + (arg4 - arg5) * (local278 + 64) / 128;
				@Pc(319) int local319 = local295 + (local307 - local295) * (local283 + 64) / 128;
				local198.anIntArray70[local271] += local319 - local227;
			}
		}
		if (local155) {
			local198.method212(this.anInt675, this.anInt673, this.anInt674);
		}
		local198.method216(this.aByte26 + 64, this.aByte27 * 5 + 768, -50, -10, -50, !this.aBoolean150);
		if (this.aBoolean146) {
			local198.anInt262 = local198.anInt258;
		}
		if (!this.aBoolean149 && !this.aBoolean150) {
			aClass32_5.method471(local47, 7, local198);
		}
		return local198;
	}
}
