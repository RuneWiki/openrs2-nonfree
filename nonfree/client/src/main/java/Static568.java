import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "[Lclient!f;")
	public static Class39[] aClass39Array19;

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "Lclient!pl;")
	public static Class259 aClass259_167;

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "[I")
	public static int[] anIntArray675;

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
	public static int anInt9290 = 0;

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
	public static int anInt9291 = 0;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method7710(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static465.method6558(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg1 != arg0.charAt(local25); local25++) {
			}
			local15[local17++] = arg0.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)[Lclient!ro;")
	public static Class289[] method7711() {
		if (Static402.aClass289Array1 == null) {
			@Pc(14) Class289[] local14 = Static161.method2858(Static356.aClass287_5);
			@Pc(18) Class289[] local18 = new Class289[local14.length];
			@Pc(20) int local20 = 0;
			@Pc(25) int local25 = Static72.aClass2_Sub12_Sub1_1.method1423(Static391.anInt6846);
			@Pc(88) int local88;
			@Pc(94) Class289 local94;
			label69: for (@Pc(27) int local27 = 0; local27 < local14.length; local27++) {
				@Pc(33) Class289 local33 = local14[local27];
				if ((local33.anInt7997 <= 0 || local33.anInt7997 >= 24) && local33.anInt7996 >= 800 && local33.anInt7993 >= 600 && (local25 != 2 || local33.anInt7996 <= 800 && local33.anInt7993 <= 600) && (local25 != 1 || local33.anInt7996 <= 1024 && local33.anInt7993 <= 768)) {
					for (local88 = 0; local88 < local20; local88++) {
						local94 = local18[local88];
						if (local94.anInt7996 == local33.anInt7996 && local33.anInt7993 == local94.anInt7993) {
							if (local94.anInt7997 < local33.anInt7997) {
								local18[local88] = local33;
							}
							continue label69;
						}
					}
					local18[local20] = local33;
					local20++;
				}
			}
			Static402.aClass289Array1 = new Class289[local20];
			Static598.method1131(local18, 0, Static402.aClass289Array1, 0, local20);
			@Pc(146) int[] local146 = new int[Static402.aClass289Array1.length];
			for (local88 = 0; local88 < Static402.aClass289Array1.length; local88++) {
				local94 = Static402.aClass289Array1[local88];
				local146[local88] = local94.anInt7996 * local94.anInt7993;
			}
			Static149.method2443(local146, Static402.aClass289Array1);
		}
		return Static402.aClass289Array1;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!es;I)V")
	public static void method7712(@OriginalArg(0) Class2_Sub15 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static83.aClass64_1 != null) {
			@Pc(20) int local20;
			try {
				Static83.aClass64_1.method1187(0L);
				Static83.aClass64_1.method1193(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(42) Exception local42) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method4299(24, local8);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZII)Z")
	public static boolean method7713(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static167.aBoolean291) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static2.aClass196ArrayArray1[local13] == null || Static2.aClass196ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(40) Class196 local40 = Static2.aClass196ArrayArray1[local13][local17];
		@Pc(52) Class2_Sub5 local52;
		if (arg1 == -1 && local40.anInt5098 == 0) {
			for (local52 = (Class2_Sub5) Static375.aClass8_38.method210(); local52 != null; local52 = (Class2_Sub5) Static375.aClass8_38.method218()) {
				if (local52.anInt902 == 45 || local52.anInt902 == 1011 || local52.anInt902 == 57 || local52.anInt902 == 60 || local52.anInt902 == 50) {
					for (@Pc(87) Class196 local87 = Static117.method1748(local52.anInt897); local87 != null; local87 = Static29.method541(local87)) {
						if (local87.anInt5112 == local40.anInt5112) {
							return true;
						}
					}
				}
			}
		} else {
			for (local52 = (Class2_Sub5) Static375.aClass8_38.method210(); local52 != null; local52 = (Class2_Sub5) Static375.aClass8_38.method218()) {
				if (local52.anInt898 == arg1 && local52.anInt897 == local40.anInt5112 && (local52.anInt902 == 45 || local52.anInt902 == 1011 || local52.anInt902 == 57 || local52.anInt902 == 60 || local52.anInt902 == 50)) {
					return true;
				}
			}
		}
		return false;
	}
}
