import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!s", name = "B", descriptor = "I")
	public static int anInt7978;

	@OriginalMember(owner = "client!s", name = "E", descriptor = "I")
	public static int anInt7981;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V")
	public static void method6593(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static230.method3990(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static61.method1045(local7);
			local7 = Static411.method5914(":", local7, "%3a");
			local7 = Static411.method5914("@", local7, "%40");
			local7 = Static411.method5914("&", local7, "%26");
			local7 = Static411.method5914("#", local7, "%23");
			if (Static195.anApplet2 != null) {
				@Pc(102) Class299 local102 = Static99.aClass161_3.method3817(new URL(Static195.anApplet2.getCodeBase(), "clienterror.ws?c=" + Static104.anInt2566 + "&u=" + Static456.aLong231 + "&v1=" + Static222.aString51 + "&v2=" + Static222.aString47 + "&e=" + local7));
				while (local102.anInt7985 == 0) {
					Static55.method845(1L);
				}
				if (local102.anInt7985 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local102.anObject41;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(JI)V")
	public static void method6594(@OriginalArg(0) long arg0) {
		@Pc(15) int local15 = Static460.anInt7816;
		@Pc(17) int local17 = Static391.anInt6854;
		@Pc(25) int local25;
		@Pc(33) int local33;
		if (Static195.anInt4188 != local15) {
			local25 = local15 - Static195.anInt4188;
			local33 = (int) ((long) local25 * arg0 / 320L);
			if (local25 > 0) {
				if (local33 == 0) {
					local33 = 1;
				} else if (local33 > local25) {
					local33 = local25;
				}
			} else if (local33 == 0) {
				local33 = -1;
			} else if (local33 < local25) {
				local33 = local25;
			}
			Static195.anInt4188 += local33;
		}
		if (local17 != Static303.anInt5529) {
			local25 = local17 - Static303.anInt5529;
			local33 = (int) (arg0 * (long) local25 / 320L);
			if (local25 > 0) {
				if (local33 == 0) {
					local33 = 1;
				} else if (local25 < local33) {
					local33 = local25;
				}
			} else if (local33 == 0) {
				local33 = -1;
			} else if (local33 < local25) {
				local33 = local25;
			}
			Static303.anInt5529 += local33;
		}
		if (!Static189.aClass4_Sub2_Sub1_1.aBoolean651) {
			Static330.aFloat102 += Static189.aFloat90 * (float) arg0 / 40.0F * 8.0F;
			Static477.aFloat164 += Static432.aFloat144 * (float) arg0 / 40.0F * 8.0F;
		}
		Static404.method5838();
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(B)V")
	public static void method6595() {
		@Pc(7) int local7 = Static272.anInt5182;
		@Pc(9) int[] local9 = Static362.anIntArray519;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class10_Sub1_Sub2_Sub2 local19 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local9[local11]];
			if (local19 != null && local19.anInt8501 > 0) {
				local19.anInt8501--;
				if (local19.anInt8501 == 0) {
					local19.aString91 = null;
				}
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static428.anInt7363; local54++) {
			@Pc(61) long local61 = (long) Static444.anIntArray617[local54];
			@Pc(67) Class4_Sub50 local67 = (Class4_Sub50) Static106.aClass183_8.method4289(local61);
			if (local67 != null) {
				@Pc(72) Class10_Sub1_Sub2_Sub1 local72 = local67.aClass10_Sub1_Sub2_Sub1_1;
				if (local72.anInt8501 > 0) {
					local72.anInt8501--;
					if (local72.anInt8501 == 0) {
						local72.aString91 = null;
					}
				}
			}
		}
	}
}
