import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!td", name = "J", descriptor = "I")
	public static int anInt6349;

	@OriginalMember(owner = "client!td", name = "P", descriptor = "I")
	public static int anInt6355;

	@OriginalMember(owner = "client!td", name = "H", descriptor = "I")
	public static int anInt6348 = 0;

	@OriginalMember(owner = "client!td", name = "I", descriptor = "[I")
	public static final int[] anIntArray393 = new int[2048];

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4881(@OriginalArg(0) String arg0) {
		if (Static270.aStringArray36 == null) {
			Static73.method1173();
		}
		@Pc(14) String[] local14 = Static150.method2106(arg0, '\n');
		for (@Pc(22) int local22 = 0; local22 < local14.length; local22++) {
			for (@Pc(26) int local26 = Static248.anInt4059; local26 > 0; local26--) {
				Static270.aStringArray36[local26] = Static270.aStringArray36[local26 - 1];
			}
			Static270.aStringArray36[0] = local14[local22];
			if (Static270.aStringArray36.length - 1 > Static248.anInt4059) {
				Static248.anInt4059++;
				if (Static174.anInt2850 > 0) {
					Static174.anInt2850++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
	public static void method4886() {
		if (Static48.anInt801 == 0) {
			return;
		}
		try {
			if (++Static383.anInt6367 > 2000) {
				if (Static48.aClass3_2 != null) {
					Static48.aClass3_2.method63();
					Static48.aClass3_2 = null;
				}
				if (Static428.anInt7092 >= 1) {
					Static48.anInt801 = 0;
					Static52.anInt942 = -5;
					return;
				}
				Static383.anInt6367 = 0;
				Static428.anInt7092++;
				Static48.anInt801 = 1;
				if (Static182.anInt2943 == Static131.anInt2260) {
					Static131.anInt2260 = Static91.anInt1613;
				} else {
					Static131.anInt2260 = Static182.anInt2943;
				}
			}
			if (Static48.anInt801 == 1) {
				Static289.aClass215_8 = Static41.aClass124_2.method2532(Static270.aString42, Static131.anInt2260);
				Static48.anInt801 = 2;
			}
			@Pc(117) int local117;
			if (Static48.anInt801 == 2) {
				if (Static289.aClass215_8.anInt5791 == 2) {
					throw new IOException();
				}
				if (Static289.aClass215_8.anInt5791 != 1) {
					return;
				}
				Static48.aClass3_2 = new Class3((Socket) Static289.aClass215_8.anObject10, Static41.aClass124_2);
				Static289.aClass215_8 = null;
				Static48.aClass3_2.method62(Static75.aClass1_Sub11_Sub1_1.anInt5766, Static75.aClass1_Sub11_Sub1_1.aByteArray64);
				Static218.method4377();
				local117 = Static48.aClass3_2.method57();
				Static218.method4377();
				if (local117 != 21) {
					Static48.anInt801 = 0;
					Static52.anInt942 = local117;
					Static48.aClass3_2.method63();
					Static48.aClass3_2 = null;
					return;
				}
				Static48.anInt801 = 3;
			}
			if (Static48.anInt801 == 3) {
				if (Static48.aClass3_2.method61() < 1) {
					return;
				}
				Static390.aStringArray50 = new String[Static48.aClass3_2.method57()];
				Static48.anInt801 = 4;
			}
			if (Static48.anInt801 == 4 && Static48.aClass3_2.method61() >= Static390.aStringArray50.length * 8) {
				Static154.aClass1_Sub11_Sub1_3.anInt5766 = 0;
				Static48.aClass3_2.method59(Static154.aClass1_Sub11_Sub1_3.aByteArray64, 0, Static390.aStringArray50.length * 8);
				for (local117 = 0; local117 < Static390.aStringArray50.length; local117++) {
					Static390.aStringArray50[local117] = Static338.method4298(Static154.aClass1_Sub11_Sub1_3.method4460());
				}
				Static48.anInt801 = 0;
				Static52.anInt942 = 21;
				Static48.aClass3_2.method63();
				Static48.aClass3_2 = null;
			}
		} catch (@Pc(219) IOException local219) {
			if (Static48.aClass3_2 != null) {
				Static48.aClass3_2.method63();
				Static48.aClass3_2 = null;
			}
			if (Static428.anInt7092 < 1) {
				Static428.anInt7092++;
				if (Static131.anInt2260 == Static182.anInt2943) {
					Static131.anInt2260 = Static91.anInt1613;
				} else {
					Static131.anInt2260 = Static182.anInt2943;
				}
				Static48.anInt801 = 1;
				Static383.anInt6367 = 0;
			} else {
				Static48.anInt801 = 0;
				Static52.anInt942 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)[Lclient!ne;")
	public static Class166[] method4887() {
		return new Class166[] { Static209.aClass166_6, Static208.aClass166_5, Static194.aClass166_4, Static368.aClass166_7, Static37.aClass166_2, Static33.aClass166_1 };
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
	public static void method4888(@OriginalArg(0) int arg0) {
		Static118.anInt2022 = arg0;
		@Pc(7) Class167 local7 = Static43.aClass167_74;
		synchronized (Static43.aClass167_74) {
			Static43.aClass167_74.method3390();
		}
		local7 = Static416.aClass167_95;
		synchronized (Static416.aClass167_95) {
			Static416.aClass167_95.method3390();
		}
	}
}
