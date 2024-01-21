import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
	private static int anInt923;

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "Lclient!uc;")
	public static final Class87 aClass87_16 = new Class87(64);

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
	public static int anInt910 = 1;

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "Z")
	public static boolean aBoolean36 = false;

	@OriginalMember(owner = "client!ba", name = "I", descriptor = "Z")
	public static boolean aBoolean37 = false;

	@OriginalMember(owner = "client!ba", name = "K", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_615 = Static118.method2249("Weiter");

	@OriginalMember(owner = "client!ba", name = "M", descriptor = "J")
	public static volatile long aLong28 = 0L;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!sd;Lclient!sd;Lclient!sd;)V")
	public static void method584(@OriginalArg(1) Class60 arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Class60 arg2) {
		Static104.anInt2563 = arg2.method2328(Static183.aClass65_2321);
		Static74.anInt1828 = arg0.method2328(Static91.aClass65_1328);
		Static100.anInt2517 = arg0.method2328(Static83.aClass65_1222);
		Static90.anInt4440 = arg0.method2328(Static208.aClass65_2341);
		Static3.anInt82 = arg0.method2328(Static42.aClass65_685);
		Static79.anInt1931 = arg0.method2328(Static86.aClass65_1234);
		Static67.anInt1715 = arg0.method2328(Static193.aClass65_2482);
		Static100.anInt2511 = arg0.method2328(Static134.aClass65_1864);
		Static104.anInt2560 = arg0.method2328(Static208.aClass65_2363);
		Static120.anInt2982 = arg0.method2328(Static47.aClass65_773);
		Static19.anInt611 = arg0.method2328(Static138.aClass65_1896);
		Static135.anInt3348 = arg1.method2328(Static36.aClass65_658);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Z")
	public static boolean method589(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
	public static void method595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub7 local7 = Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].anInt1680 = arg3;
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)I")
	public static int method598() {
		@Pc(11) int local11 = 3;
		if (Static34.anInt999 < 310) {
			@Pc(22) int local22 = Static160.anInt2779 >> 7;
			@Pc(26) int local26 = Static78.anInt1919 >> 7;
			if ((Static106.aByteArrayArrayArray67[Static207.anInt4425][local26][local22] & 0x4) != 0) {
				local11 = Static207.anInt4425;
			}
			@Pc(43) int local43 = Static201.aClass6_Sub4_Sub1_3.anInt3934 >> 7;
			@Pc(48) int local48 = Static201.aClass6_Sub4_Sub1_3.anInt3976 >> 7;
			@Pc(56) int local56;
			if (local22 < local48) {
				local56 = local48 - local22;
			} else {
				local56 = local22 - local48;
			}
			@Pc(71) int local71;
			if (local26 >= local43) {
				local71 = local26 - local43;
			} else {
				local71 = local43 - local26;
			}
			@Pc(91) int local91;
			@Pc(93) int local93;
			if (local71 <= local56) {
				local91 = local71 * 65536 / local56;
				local93 = 32768;
				while (local22 != local48) {
					local93 += local91;
					if (local22 < local48) {
						local22++;
					} else if (local48 < local22) {
						local22--;
					}
					if ((Static106.aByteArrayArrayArray67[Static207.anInt4425][local26][local22] & 0x4) != 0) {
						local11 = Static207.anInt4425;
					}
					if (local93 >= 65536) {
						local93 -= 65536;
						if (local43 > local26) {
							local26++;
						} else if (local26 > local43) {
							local26--;
						}
						if ((Static106.aByteArrayArrayArray67[Static207.anInt4425][local26][local22] & 0x4) != 0) {
							local11 = Static207.anInt4425;
						}
					}
				}
			} else {
				local91 = local56 * 65536 / local71;
				local93 = 32768;
				while (local26 != local43) {
					local93 += local91;
					if (local26 < local43) {
						local26++;
					} else if (local26 > local43) {
						local26--;
					}
					if ((Static106.aByteArrayArrayArray67[Static207.anInt4425][local26][local22] & 0x4) != 0) {
						local11 = Static207.anInt4425;
					}
					if (local93 >= 65536) {
						local93 -= 65536;
						if (local48 > local22) {
							local22++;
						} else if (local22 > local48) {
							local22--;
						}
						if ((Static106.aByteArrayArrayArray67[Static207.anInt4425][local26][local22] & 0x4) != 0) {
							local11 = Static207.anInt4425;
						}
					}
				}
			}
		}
		if ((Static106.aByteArrayArrayArray67[Static207.anInt4425][Static201.aClass6_Sub4_Sub1_3.anInt3934 >> 7][Static201.aClass6_Sub4_Sub1_3.anInt3976 >> 7] & 0x4) != 0) {
			local11 = Static207.anInt4425;
		}
		return local11;
	}
}
