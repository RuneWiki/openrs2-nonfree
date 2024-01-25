import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "Lclient!at;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "[Lclient!ug;")
	public static Class43[] aClass43Array10;

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_67 = new Class349(12, 8);

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "[I")
	public static final int[] anIntArray309 = new int[32];

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method3798(@OriginalArg(0) Class145 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static392.aBoolean549) {
			local7 = Static637.method3733();
			local9 = Static400.method5900();
		}
		@Pc(21) int local21 = Static216.anInt3440 + local7;
		@Pc(25) int local25 = Static215.anInt3422 + local9;
		@Pc(27) int local27 = Static699.anInt10734;
		@Pc(31) int local31 = Static442.anInt7174 - 3;
		Static492.method7047(Static699.anInt10734, Static442.anInt7174, Static216.anInt3440 + local7, arg0, Static289.aClass191_24.method4067(Static414.anInt9485), Static215.anInt3422 + local9);
		@Pc(62) int local62 = Static402.aClass138_1.method4767() + local7;
		@Pc(69) int local69 = Static402.aClass138_1.method4771() + local9;
		@Pc(73) int local73;
		@Pc(78) Class2_Sub6_Sub7 local78;
		@Pc(90) int local90;
		@Pc(212) int local212;
		@Pc(295) Class2_Sub6_Sub20 local295;
		@Pc(198) Class2_Sub6_Sub20 local198;
		if (Static721.aBoolean939) {
			local73 = 0;
			for (local78 = (Class2_Sub6_Sub7) Static416.aClass388_6.method9213(); local78 != null; local78 = (Class2_Sub6_Sub7) Static416.aClass388_6.method9212()) {
				local90 = local73 * 16 + local25 + 20 + 13;
				local73++;
				if (local62 > local7 + Static216.anInt3440 && local62 < Static699.anInt10734 + Static216.anInt3440 + local7 && local69 > local90 - 13 && local90 + 4 > local69 && (local78.anInt4448 > 1 || ((Class2_Sub6_Sub20) local78.aClass388_4.aClass2_Sub6_66.aClass2_Sub6_64).aBoolean827)) {
					arg0.aa(Static216.anInt3440 + local7, local90 + -12, Static699.anInt10734, 16, 255 - Static555.anInt8748 << 24 | Static641.anInt9851, 1);
				}
			}
			if (Static671.aClass2_Sub6_Sub7_1 != null) {
				local73 = 0;
				Static492.method7047(Static18.anInt242, Static563.anInt8853, Static261.anInt10711, arg0, Static671.aClass2_Sub6_Sub7_1.aString51, Static555.anInt8749);
				for (local198 = (Class2_Sub6_Sub20) Static671.aClass2_Sub6_Sub7_1.aClass388_4.method9213(); local198 != null; local198 = (Class2_Sub6_Sub20) Static671.aClass2_Sub6_Sub7_1.aClass388_4.method9212()) {
					local212 = Static555.anInt8749 + local73 * 16 + 20 + 13;
					if (Static261.anInt10711 < local62 && Static261.anInt10711 + Static18.anInt242 > local62 && local212 - 13 < local69 && local212 + 4 > local69 && local198.aBoolean827) {
						arg0.aa(Static261.anInt10711, local212 - 12, Static18.anInt242, 16, 255 - Static555.anInt8748 << 24 | Static641.anInt9851, 1);
					}
					local73++;
				}
				Static136.method1983(Static261.anInt10711, Static563.anInt8853, arg0, Static555.anInt8749, Static18.anInt242);
			}
		} else {
			local73 = 0;
			for (local295 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1226(7); local295 != null; local295 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1228()) {
				local90 = local25 + (-local73 + -1 + Static535.anInt8486) * 16 + 20 + 13;
				if (local62 > local7 + Static216.anInt3440 && local62 < Static699.anInt10734 + Static216.anInt3440 + local7 && local69 > local90 - 13 && local90 + 4 > local69 && local295.aBoolean827) {
					arg0.aa(Static216.anInt3440 + local7, local90 + -12, Static699.anInt10734, 16, Static641.anInt9851 | 255 - Static555.anInt8748 << 24, 1);
				}
				local73++;
			}
		}
		Static136.method1983(local7 + Static216.anInt3440, Static442.anInt7174, arg0, Static215.anInt3422 + local9, Static699.anInt10734);
		if (Static721.aBoolean939) {
			local73 = 0;
			for (local78 = (Class2_Sub6_Sub7) Static416.aClass388_6.method9213(); local78 != null; local78 = (Class2_Sub6_Sub7) Static416.aClass388_6.method9212()) {
				local90 = local73 * 16 + local9 + Static215.anInt3422 + 20 + 13;
				local73++;
				if (local78.anInt4448 == 1) {
					Static626.method8457(Static699.anInt10734, Static442.anInt7174, Static15.anInt228 | 0xFF000000, arg0, local69, Static615.anInt3801 | 0xFF000000, local62, (Class2_Sub6_Sub20) local78.aClass388_4.aClass2_Sub6_66.aClass2_Sub6_64, Static215.anInt3422 + local9, Static216.anInt3440 + local7, local90);
				} else {
					Static267.method3770(Static699.anInt10734, local7 + Static216.anInt3440, Static215.anInt3422 + local9, local62, Static15.anInt228 | 0xFF000000, Static615.anInt3801 | 0xFF000000, Static442.anInt7174, local69, local90, local78, arg0);
				}
			}
			if (Static671.aClass2_Sub6_Sub7_1 != null) {
				local73 = 0;
				for (local198 = (Class2_Sub6_Sub20) Static671.aClass2_Sub6_Sub7_1.aClass388_4.method9213(); local198 != null; local198 = (Class2_Sub6_Sub20) Static671.aClass2_Sub6_Sub7_1.aClass388_4.method9212()) {
					local212 = local73 * 16 + Static555.anInt8749 + 13 + 20;
					Static626.method8457(Static18.anInt242, Static563.anInt8853, Static15.anInt228 | 0xFF000000, arg0, local69, Static615.anInt3801 | 0xFF000000, local62, local198, Static555.anInt8749, Static261.anInt10711, local212);
					local73++;
				}
				Static540.method7560(Static555.anInt8749, Static261.anInt10711, Static18.anInt242, Static563.anInt8853);
			}
		} else {
			local73 = 0;
			for (local295 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1226(7); local295 != null; local295 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1228()) {
				local90 = (Static535.anInt8486 - local73 - 1) * 16 + local25 + 33;
				Static626.method8457(local27, local31, Static15.anInt228 | 0xFF000000, arg0, local69, Static615.anInt3801 | 0xFF000000, local62, local295, local25, local21, local90);
				local73++;
			}
		}
		Static540.method7560(Static215.anInt3422 + local9, local7 + Static216.anInt3440, Static699.anInt10734, Static442.anInt7174);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)S")
	public static short method3801(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(21) int local21 = arg0 >> 3 & 0x70;
		@Pc(25) int local25 = arg0 & 0x7F;
		@Pc(46) int local46 = local25 <= 64 ? local21 * local25 >> 7 : (127 - local25) * local21 >> 7;
		@Pc(50) int local50 = local25 + local46;
		@Pc(56) int local56;
		if (local50 == 0) {
			local56 = local46 << 1;
		} else {
			local56 = (local46 << 8) / local50;
		}
		return (short) (local50 | local9 << 10 | local56 >> 4 << 7);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILjava/lang/String;ZLclient!ha;Lclient!da;Lclient!pga;)V")
	public static void method3803(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class145 arg2, @OriginalArg(4) Class68 arg3, @OriginalArg(5) Class289 arg4) {
		@Pc(17) boolean local17 = !Static203.aBoolean311 || Static192.method2749();
		if (!local17) {
			return;
		}
		@Pc(42) int local42;
		@Pc(51) int local51;
		if (Static203.aBoolean311 && local17) {
			@Pc(29) Class289 local29 = Static370.aClass289_6;
			@Pc(35) Class68 local35 = arg2.method9707(local29, Static109.aClass355Array1, true);
			local42 = local29.method6939(250, arg0, (Class43[]) null);
			local51 = local29.method6934(local29.anInt7755, arg0, 250, (Class43[]) null);
			@Pc(54) int local54 = Static437.aClass355_4.anInt9469;
			@Pc(58) int local58 = local54 + 4;
			local42 += local58 * 2;
			local51 += local58 * 2;
			if (local42 < Static496.anInt7941) {
				local42 = Static496.anInt7941;
			}
			if (local51 < Static456.anInt7444) {
				local51 = Static456.anInt7444;
			}
			@Pc(96) int local96 = Static506.aClass18_13.method282(Static33.anInt443, local42) + Static337.anInt5203;
			@Pc(104) int local104 = Static213.aClass239_9.method5836(Static277.anInt4340, local51) + Static236.anInt3729;
			if (Static392.aBoolean549) {
				local96 += Static637.method3733();
				local104 += Static400.method5900();
			}
			arg2.method9683(Static158.aClass355_5, false).method9603(local96 + Static30.aClass355_1.anInt9469, local104 - -Static30.aClass355_1.anInt9470, local42 - Static30.aClass355_1.anInt9469 * 2, -(Static30.aClass355_1.anInt9470 * 2) + local51, 1, 0, 0);
			arg2.method9683(Static30.aClass355_1, true).method9588(local96, local104);
			Static30.aClass355_1.method8352();
			arg2.method9683(Static30.aClass355_1, true).method9588(local42 + local96 - local54, local104);
			Static30.aClass355_1.method8357();
			arg2.method9683(Static30.aClass355_1, true).method9588(local96 + local42 - local54, -local54 + local104 - -local51);
			Static30.aClass355_1.method8352();
			arg2.method9683(Static30.aClass355_1, true).method9588(local96, local51 + local104 - local54);
			Static30.aClass355_1.method8357();
			arg2.method9683(Static437.aClass355_4, true).method9605(local96, local104 + Static30.aClass355_1.anInt9470, local54, local51 - Static30.aClass355_1.anInt9470 * 2);
			Static437.aClass355_4.method8354();
			arg2.method9683(Static437.aClass355_4, true).method9605(local96 + Static30.aClass355_1.anInt9469, local104, local42 - Static30.aClass355_1.anInt9469 * 2, local54);
			Static437.aClass355_4.method8354();
			arg2.method9683(Static437.aClass355_4, true).method9605(local42 + local96 - local54, Static30.aClass355_1.anInt9470 + local104, local54, local51 - Static30.aClass355_1.anInt9470 * 2);
			Static437.aClass355_4.method8354();
			arg2.method9683(Static437.aClass355_4, true).method9605(Static30.aClass355_1.anInt9469 + local96, -local54 + local51 + local104, local42 - Static30.aClass355_1.anInt9469 * 2, local54);
			Static437.aClass355_4.method8354();
			local35.method7900(local51 - local58 * 2, (int[]) null, Static676.anInt10486 | 0xFF000000, 0, local104 + local58, -(local58 * 2) + local42, (Class1) null, 0, arg0, -1, 1, local96 + local58, (Class43[]) null, 0, 1);
			Static642.method8685(local51, local96, local104, local42);
		} else {
			local42 = arg4.method6939(250, arg0, (Class43[]) null);
			local51 = arg4.method6942(arg0, 250, (Class43[]) null) * 13;
			arg2.aa(6, 6, local42 + 4 + 4, local51 + 8, -16777216, 0);
			arg2.method9713(6, 6, local42 + 4 + 4, local51 - -4 + 4, -1, 0);
			arg3.method7900(local51, (int[]) null, -1, 0, 10, local42, (Class1) null, 0, arg0, -1, 1, 10, (Class43[]) null, 0, 1);
			Static642.method8685(local51 + 8, 6, 6, local42 + 4 + 4);
		}
		if (!arg1) {
			return;
		}
		try {
			if (Static392.aBoolean549) {
				Static31.method8010();
			} else {
				arg2.method9647();
			}
		} catch (@Pc(465) Exception_Sub1 local465) {
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIII)I")
	public static int method3806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg5 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(16) int local16 = arg1;
			arg1 = arg0;
			arg0 = local16;
		}
		if (local3 == 0) {
			return arg3;
		} else if (local3 == 1) {
			return arg4;
		} else if (local3 == 2) {
			return 1 + 7 - arg1 - arg3;
		} else {
			return 8 - arg4 - arg0;
		}
	}
}
