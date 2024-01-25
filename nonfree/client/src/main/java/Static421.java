import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_157 = new Class256("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
	public static int anInt7367 = -1;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!md;Z)V")
	public static void method5712(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(12) byte[] local12 = new byte[24];
		if (Static451.aClass85_2 != null) {
			@Pc(24) int local24;
			try {
				Static451.aClass85_2.method1722(0L);
				Static451.aClass85_2.method1714(local12);
				for (local24 = 0; local24 < 24 && local12[local24] == 0; local24++) {
				}
				if (local24 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(46) Exception local46) {
				for (local24 = 0; local24 < 24; local24++) {
					local12[local24] = -1;
				}
			}
		}
		arg0.method3710(24, local12);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)I")
	public static int method5713(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14 = arg1 & 0xF;
		@Pc(23) int local23 = local14 < 8 ? arg0 : arg3;
		@Pc(38) int local38 = local14 >= 4 ? (local14 == 12 || local14 == 14 ? arg0 : arg2) : arg3;
		return ((local14 & 0x2) == 0 ? local38 : -local38) + ((local14 & 0x1) == 0 ? local23 : -local23);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BZI)V")
	public static void method5714(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static387.aClass26_9 = Static312.method2282(Static152.anInterface8_6, Static399.aClass167_Sub1_1.anInt5559 * 2, Static118.aCanvas3, Static303.aClass131_4, arg1);
		} else {
			if (arg0) {
				Static387.aClass26_9 = Static312.method2282(Static152.anInterface8_6, 0, Static118.aCanvas3, Static303.aClass131_4, 0);
				Static387.aClass26_9.M(0);
				@Pc(33) Class210 local33 = Static316.method4524(Static205.anInt3959, Static48.aClass188_23);
				@Pc(42) Class56 local42 = Static387.aClass26_9.method2231(local33, Static456.method1762(Static351.aClass188_97, Static205.anInt3959));
				Static32.method437(Static345.aClass256_76.method5720(Static272.anInt7537), local42, true);
				Static387.aClass26_9.method2220();
				Static285.method4204();
				Static387.aClass26_9.method2258();
			}
			try {
				Static387.aClass26_9 = Static312.method2282(Static152.anInterface8_6, Static399.aClass167_Sub1_1.anInt5559 * 2, Static118.aCanvas3, Static303.aClass131_4, arg1);
				if (Static387.aClass26_9.method2263()) {
					@Pc(75) Class2_Sub3 local75 = Static387.aClass26_9.method2242();
					Static387.aClass26_9.method2226(local75);
				}
			} catch (@Pc(80) Throwable local80) {
				arg1 = 0;
				Static387.aClass26_9 = Static312.method2282(Static152.anInterface8_6, 0, Static118.aCanvas3, Static303.aClass131_4, 0);
			}
		}
		Static281.anInt5126 = arg1;
		Static219.method3383();
		if (!Static387.aClass26_9.method2290()) {
			Static178.anInt3434 = 1;
		}
		Static387.aClass26_9.method2234(Static178.anInt3434);
		Static387.aClass26_9.method2256(0);
		Static387.aClass26_9.na(8);
		Static416.aClass102_5 = Static387.aClass26_9.method2286();
		Static372.aClass102_4 = Static387.aClass26_9.method2286();
		Static424.method5741();
		Static387.aClass26_9.method2255(!Static399.aClass167_Sub1_1.aBoolean485);
		if (Static387.aClass26_9.method2276()) {
			Static407.method5517(Static399.aClass167_Sub1_1.aBoolean488);
		}
		Static440.method5947(Static171.anInt3288 >> 3, Static81.anInt1950 >> 3, Static387.aClass26_9);
		Static272.method5841();
		Static45.aBoolean626 = false;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!cr;I)I")
	public static int method5715(@OriginalArg(1) Class41 arg0, @OriginalArg(2) int arg1) {
		if (!Static56.method1112(arg0).method1588(arg1) && arg0.anObjectArray25 == null) {
			return -1;
		} else if (arg0.anIntArray73 == null || arg0.anIntArray73.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray73[arg1];
		}
	}
}
