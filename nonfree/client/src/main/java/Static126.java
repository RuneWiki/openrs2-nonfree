import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "[I")
	public static int[] anIntArray202;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1230 = Static187.method3089("Die Verbindung konnte");

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
	public static int anInt2632 = 0;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
	public static int anInt2633 = 0;

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1233 = Static187.method3089("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1231 = aClass92_1233;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1232 = Static187.method3089("Weiter");

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1234 = Static187.method3089("blinken2:");

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1235 = Static187.method3089("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "[[B")
	public static final byte[][] aByteArrayArray4 = new byte[250][];

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	public static void method1850() {
		if (Static27.aClass57_1 != null) {
			Static27.aClass57_1.method1672();
			Static27.aClass57_1 = null;
		}
		Static143.method2101();
		Static138.method2070();
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			Static98.aClass7Array1[local21].method129();
		}
		Static115.method1717();
		System.gc();
		Static77.method1170();
		Static156.aBoolean183 = false;
		Static170.anInt3548 = -1;
		Static74.method1121();
		Static48.method862(10);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)V")
	public static void method1851(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static22.anInt552 != 0 && arg0 != -1) {
			Static99.method3061(Static22.anInt552, arg0, Static79.aClass3_Sub1_10);
			Static156.aBoolean183 = true;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIILclient!de;)V")
	public static void method1852(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class8_Sub3_Sub1 arg2) {
		if ((arg0 & 0x40) != 0) {
			arg2.aClass92_1718 = Static18.aClass1_Sub14_Sub1_2.method3022();
			if (arg2.aClass92_1718.method3231(0) == 126) {
				arg2.aClass92_1718 = arg2.aClass92_1718.method3232(1);
				Static145.method2151(arg2.aClass92_1718, arg2.aClass92_374, 2);
			} else if (arg2 == Static15.aClass8_Sub3_Sub1_1) {
				Static145.method2151(arg2.aClass92_1718, arg2.aClass92_374, 2);
			}
			arg2.anInt3621 = 150;
			arg2.anInt3618 = 0;
			arg2.anInt3573 = 0;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		if ((arg0 & 0x200) != 0) {
			local73 = Static18.aClass1_Sub14_Sub1_2.method3028();
			local77 = Static18.aClass1_Sub14_Sub1_2.method3010();
			arg2.method2683(Static155.anInt2981, local73, local77);
		}
		if ((arg0 & 0x80) != 0) {
			arg2.anInt3582 = Static18.aClass1_Sub14_Sub1_2.method3027();
			if (arg2.anInt3582 == 65535) {
				arg2.anInt3582 = -1;
			}
		}
		if ((arg0 & 0x8) != 0) {
			arg2.anInt3587 = Static18.aClass1_Sub14_Sub1_2.method3034();
			arg2.anInt3603 = Static18.aClass1_Sub14_Sub1_2.method3023();
		}
		if ((arg0 & 0x1) != 0) {
			local73 = Static18.aClass1_Sub14_Sub1_2.method3039();
			local77 = Static18.aClass1_Sub14_Sub1_2.method3053();
			@Pc(138) int local138 = Static18.aClass1_Sub14_Sub1_2.method3010();
			@Pc(141) int local141 = Static18.aClass1_Sub14_Sub1_2.anInt4061;
			if (arg2.aClass92_374 != null && arg2.aClass95_18 != null) {
				@Pc(152) long local152 = arg2.aClass92_374.method3217();
				@Pc(154) boolean local154 = false;
				if (local77 <= 1) {
					for (@Pc(159) int local159 = 0; local159 < Static103.anInt2229; local159++) {
						if (local152 == Static57.aLongArray3[local159]) {
							local154 = true;
							break;
						}
					}
				}
				if (!local154 && Static82.anInt1825 == 0) {
					Static166.aClass1_Sub14_5.anInt4061 = 0;
					Static18.aClass1_Sub14_Sub1_2.method3056(Static166.aClass1_Sub14_5.aByteArray49, local138);
					@Pc(198) int local198 = -1;
					@Pc(209) boolean local209 = (local73 & 0x8000) != 0;
					Static166.aClass1_Sub14_5.anInt4061 = 0;
					@Pc(231) Class92 local231;
					if (local209) {
						local73 &= 0x7FFF;
						@Pc(222) Class90 local222 = Static33.method605(Static166.aClass1_Sub14_5);
						local198 = local222.anInt4209;
						local231 = local222.aClass1_Sub3_Sub19_1.method2383(Static166.aClass1_Sub14_5);
					} else {
						local231 = Static130.method2468(Static38.method708(Static166.aClass1_Sub14_5).method3213());
					}
					arg2.aClass92_1718 = local231.method3196();
					arg2.anInt3573 = local73 >> 8;
					arg2.anInt3621 = 150;
					arg2.anInt3618 = local73 & 0xFF;
					if (local77 == 2) {
						Static100.method1498(null, local209 ? 17 : 1, local198, local231, Static208.method787(new Class92[] { Static51.aClass92_540, arg2.aClass92_374 }));
					} else if (local77 == 1) {
						Static100.method1498(null, local209 ? 17 : 1, local198, local231, Static208.method787(new Class92[] { Static158.aClass92_1600, arg2.aClass92_374 }));
					} else {
						Static100.method1498(null, local209 ? 17 : 2, local198, local231, arg2.aClass92_374);
					}
				}
			}
			Static18.aClass1_Sub14_Sub1_2.anInt4061 = local141 + local138;
		}
		if ((arg0 & 0x400) != 0) {
			arg2.anInt3564 = Static18.aClass1_Sub14_Sub1_2.method3027();
			local73 = Static18.aClass1_Sub14_Sub1_2.method3029();
			arg2.anInt3591 = local73 >> 16;
			arg2.anInt3619 = 0;
			if (arg2.anInt3564 == 65535) {
				arg2.anInt3564 = -1;
			}
			arg2.anInt3579 = Static155.anInt2981 + (local73 & 0xFFFF);
			arg2.anInt3608 = 0;
			if (arg2.anInt3579 > Static155.anInt2981) {
				arg2.anInt3608 = -1;
			}
		}
		if ((arg0 & 0x20) != 0) {
			local73 = Static18.aClass1_Sub14_Sub1_2.method3028();
			local77 = Static18.aClass1_Sub14_Sub1_2.method3036();
			arg2.method2683(Static155.anInt2981, local73, local77);
			arg2.anInt3599 = Static155.anInt2981 + 300;
			arg2.anInt3612 = Static18.aClass1_Sub14_Sub1_2.method3028();
		}
		if ((arg0 & 0x100) != 0) {
			arg2.anInt3584 = Static18.aClass1_Sub14_Sub1_2.method3010();
			arg2.anInt3572 = Static18.aClass1_Sub14_Sub1_2.method3053();
			arg2.anInt3581 = Static18.aClass1_Sub14_Sub1_2.method3053();
			arg2.anInt3588 = Static18.aClass1_Sub14_Sub1_2.method3036();
			arg2.anInt3613 = Static18.aClass1_Sub14_Sub1_2.method3023() + Static155.anInt2981;
			arg2.anInt3593 = Static18.aClass1_Sub14_Sub1_2.method3027() + Static155.anInt2981;
			arg2.anInt3604 = Static18.aClass1_Sub14_Sub1_2.method3036();
			arg2.anInt3609 = 0;
			arg2.anInt3578 = 1;
		}
		if ((arg0 & 0x10) != 0) {
			local73 = Static18.aClass1_Sub14_Sub1_2.method3039();
			if (local73 == 65535) {
				local73 = -1;
			}
			local77 = Static18.aClass1_Sub14_Sub1_2.method3053();
			Static208.method788(arg2, local77, local73);
		}
		if ((arg0 & 0x2) == 0) {
			return;
		}
		local73 = Static18.aClass1_Sub14_Sub1_2.method3036();
		@Pc(502) byte[] local502 = new byte[local73];
		@Pc(507) Class1_Sub14 local507 = new Class1_Sub14(local502);
		Static18.aClass1_Sub14_Sub1_2.method3056(local502, local73);
		Static101.aClass1_Sub14Array1[arg1] = local507;
		arg2.method655(local507);
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(III)I")
	public static int method1854(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (local7 + arg1) / arg0 - local7;
	}
}
