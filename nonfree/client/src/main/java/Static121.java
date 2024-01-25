import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "F")
	public static float aFloat29;

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "[I")
	public static int[] anIntArray159;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_41 = new Class268(41, -2);

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)I")
	public static int method1985() {
		if (Static391.anInt7325 == 0) {
			Static33.aClass28_2.method601(new Class108("jaclib"));
			if (Static33.aClass28_2.method598().method8510() != 100) {
				return 1;
			}
			if (!((Class108) Static33.aClass28_2.method598()).method3108()) {
				Static119.aClient1.method1352();
			}
			Static391.anInt7325 = 1;
		}
		@Pc(232) int local232;
		@Pc(251) int local251;
		@Pc(265) int local265;
		@Pc(271) int local271;
		if (Static391.anInt7325 == 1) {
			Static262.aClass28Array1 = Static33.method597();
			Static33.aClass28_1.method601(new Class163(Static493.aClass353_96));
			Static33.aClass28_3.method601(new Class108("jaggl"));
			Static33.aClass28_4.method601(new Class108("jagdx"));
			Static33.aClass28_5.method601(new Class108("jagmisc"));
			Static33.aClass28_6.method601(new Class108("sw3d"));
			Static33.aClass28_7.method601(new Class108("hw3d"));
			Static33.aClass28_8.method601(new Class108("jagtheora"));
			Static33.aClass28_9.method601(new Class163(Static383.aClass353_64));
			Static33.aClass28_10.method601(new Class163(Static40.aClass353_4));
			Static33.aClass28_11.method601(new Class163(Static648.aClass353_138));
			Static33.aClass28_12.method601(new Class163(Static390.aClass353_78));
			Static33.aClass28_13.method601(new Class163(Static335.aClass353_56));
			Static33.aClass28_14.method601(new Class163(Static496.aClass353_99));
			Static33.aClass28_15.method601(new Class163(Static428.aClass353_79));
			Static33.aClass28_16.method601(new Class163(Static278.aClass353_50));
			Static33.aClass28_17.method601(new Class163(Static608.aClass353_131));
			Static33.aClass28_18.method601(new Class163(Static583.aClass353_123));
			Static33.aClass28_19.method601(new Class163(Static554.aClass353_16));
			Static33.aClass28_20.method601(new Class163(Static264.aClass353_48));
			Static33.aClass28_21.method601(new Class163(Static139.aClass353_27));
			Static33.aClass28_22.method601(new Class163(Static396.aClass353_69));
			Static33.aClass28_23.method601(new Class75(Static399.aClass353_73, "huffman"));
			Static33.aClass28_24.method601(new Class163(Static619.aClass353_136));
			Static33.aClass28_25.method601(new Class163(Static98.aClass353_20));
			Static33.aClass28_26.method601(new Class163(Static483.aClass353_89));
			Static33.aClass28_27.method601(new Class363(Static446.aClass353_82, "details"));
			for (local232 = 0; local232 < Static262.aClass28Array1.length; local232++) {
				if (Static262.aClass28Array1[local232].method598() == null) {
					throw new RuntimeException();
				}
			}
			local251 = 0;
			@Pc(253) Class28[] local253 = Static262.aClass28Array1;
			for (@Pc(255) int local255 = 0; local255 < local253.length; local255++) {
				@Pc(261) Class28 local261 = local253[local255];
				local265 = local261.method599();
				local271 = local261.method598().method8510();
				local251 += local271 * local265 / 100;
			}
			Static391.anInt7325 = 2;
			Static410.anInt7538 = local251;
		}
		if (Static262.aClass28Array1 == null) {
			return 100;
		}
		local232 = 0;
		local251 = 0;
		@Pc(302) boolean local302 = true;
		@Pc(304) Class28[] local304 = Static262.aClass28Array1;
		for (@Pc(306) int local306 = 0; local306 < local304.length; local306++) {
			@Pc(312) Class28 local312 = local304[local306];
			local271 = local312.method599();
			@Pc(322) int local322 = local312.method598().method8510();
			if (local322 < 100) {
				local302 = false;
			}
			local251 += local322 * local271 / 100;
			local232 += local271;
		}
		if (local302) {
			if (!((Class108) Static33.aClass28_5.method598()).method3108()) {
				Static119.aClient1.method1361();
			}
			if (!((Class108) Static33.aClass28_8.method598()).method3108()) {
				Static290.aBoolean386 = Static119.aClient1.method1357();
			}
			Static262.aClass28Array1 = null;
		}
		local232 -= Static410.anInt7538;
		local251 -= Static410.anInt7538;
		local265 = local232 <= 0 ? 100 : local251 * 100 / local232;
		if (!local302 && local265 > 99) {
			local265 = 99;
		}
		return local265;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;BLjava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method1987(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class173 local9 = Static118.aClass173Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static118.aClass173Array1[local11] = Static118.aClass173Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class173(arg1, arg7, arg6, arg2, arg3, arg0, arg4, arg5);
		} else {
			local9.method5035(arg5, arg4, arg1, arg6, arg0, arg3, arg2, arg7);
		}
		Static103.anInt2053++;
		Static118.aClass173Array1[0] = local9;
		Static198.anInt4016 = Static320.anInt6118;
	}
}
