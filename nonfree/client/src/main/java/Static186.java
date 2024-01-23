import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "[I")
	public static int[] anIntArray516;

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "[I")
	public static int[] anIntArray517;

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "[I")
	public static int[] anIntArray518;

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
	public static int anInt3977;

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1344 = Static200.method3116("Loaded update list");

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1342 = aClass60_1344;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1343 = Static200.method3116("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
	public static int anInt3973 = 0;

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "[I")
	public static int[] anIntArray519 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1345 = Static200.method3116("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "[J")
	public static long[] aLongArray9 = new long[100];

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)I")
	public static int method2921() {
		if (Static8.aDouble1 == 3.0D) {
			return 37;
		} else if (Static8.aDouble1 == 4.0D) {
			return 50;
		} else if (Static8.aDouble1 == 6.0D) {
			return 75;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ve;B)V")
	public static void method2922(@OriginalArg(0) Class9_Sub4 arg0) {
		arg0.anInt3905 = arg0.anInt3932;
		if (arg0.anInt3946 == 0) {
			arg0.anInt3939 = 0;
			return;
		}
		if (arg0.anInt3896 != -1 && arg0.anInt3906 == 0) {
			@Pc(28) Class1_Sub1_Sub21 local28 = Static74.method1343(arg0.anInt3896);
			if (arg0.anInt3943 > 0 && local28.anInt3448 == 0) {
				arg0.anInt3939++;
				return;
			}
			if (arg0.anInt3943 <= 0 && local28.anInt3442 == 0) {
				arg0.anInt3939++;
				return;
			}
		}
		@Pc(63) int local63 = arg0.anInt3903;
		@Pc(78) int local78 = arg0.anIntArray510[arg0.anInt3946 - 1] * 128 + arg0.anInt3937 * 64;
		@Pc(93) int local93 = arg0.anInt3937 * 64 + arg0.anIntArray511[arg0.anInt3946 - 1] * 128;
		@Pc(96) int local96 = arg0.anInt3925;
		if (local78 - local96 > 256 || local78 - local96 < -256 || local93 - local63 > 256 || local93 - local63 < -256) {
			arg0.anInt3925 = local78;
			arg0.anInt3903 = local93;
			return;
		}
		if (local78 <= local96) {
			if (local78 >= local96) {
				if (local63 < local93) {
					arg0.anInt3930 = 1024;
				} else if (local93 < local63) {
					arg0.anInt3930 = 0;
				}
			} else if (local63 < local93) {
				arg0.anInt3930 = 768;
			} else if (local93 < local63) {
				arg0.anInt3930 = 256;
			} else {
				arg0.anInt3930 = 512;
			}
		} else if (local93 > local63) {
			arg0.anInt3930 = 1280;
		} else if (local63 <= local93) {
			arg0.anInt3930 = 1536;
		} else {
			arg0.anInt3930 = 1792;
		}
		@Pc(216) int local216 = arg0.anInt3930 - arg0.anInt3913 & 0x7FF;
		if (local216 > 1024) {
			local216 -= 2048;
		}
		@Pc(222) boolean local222 = true;
		@Pc(225) int local225 = arg0.anInt3928;
		@Pc(227) int local227 = 4;
		if (local216 >= -256 && local216 <= 256) {
			local225 = arg0.anInt3938;
		} else if (local216 >= 256 && local216 < 768) {
			local225 = arg0.anInt3942;
		} else if (local216 >= -768 && local216 <= -256) {
			local225 = arg0.anInt3919;
		}
		if (local225 == -1) {
			local225 = arg0.anInt3938;
		}
		arg0.anInt3905 = local225;
		if (arg0 instanceof Class9_Sub4_Sub2) {
			local222 = ((Class9_Sub4_Sub2) arg0).aClass1_Sub1_Sub9_1.aBoolean125;
		}
		if (local222) {
			if (arg0.anInt3930 != arg0.anInt3913 && arg0.anInt3953 == -1 && arg0.anInt3940 != 0) {
				local227 = 2;
			}
			if (arg0.anInt3946 > 2) {
				local227 = 6;
			}
			if (arg0.anInt3946 > 3) {
				local227 = 8;
			}
			if (arg0.anInt3939 > 0 && arg0.anInt3946 > 1) {
				local227 = 8;
				arg0.anInt3939--;
			}
		} else {
			if (arg0.anInt3946 > 1) {
				local227 = 6;
			}
			if (arg0.anInt3946 > 2) {
				local227 = 8;
			}
			if (arg0.anInt3939 > 0 && arg0.anInt3946 > 1) {
				arg0.anInt3939--;
				local227 = 8;
			}
		}
		if (arg0.aBooleanArray23[arg0.anInt3946 - 1]) {
			local227 <<= 0x1;
		}
		if (local63 < local93) {
			arg0.anInt3903 += local227;
			if (local93 < arg0.anInt3903) {
				arg0.anInt3903 = local93;
			}
		} else if (local93 < local63) {
			arg0.anInt3903 -= local227;
			if (local93 > arg0.anInt3903) {
				arg0.anInt3903 = local93;
			}
		}
		if (local227 >= 8 && arg0.anInt3938 == arg0.anInt3905 && arg0.anInt3923 != -1) {
			arg0.anInt3905 = arg0.anInt3923;
		}
		if (local96 < local78) {
			arg0.anInt3925 += local227;
			if (local78 < arg0.anInt3925) {
				arg0.anInt3925 = local78;
			}
		} else if (local96 > local78) {
			arg0.anInt3925 -= local227;
			if (arg0.anInt3925 < local78) {
				arg0.anInt3925 = local78;
			}
		}
		if (local78 != arg0.anInt3925 || local93 != arg0.anInt3903) {
			return;
		}
		arg0.anInt3946--;
		if (arg0.anInt3943 > 0) {
			arg0.anInt3943--;
			return;
		}
	}
}
