import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	public static int anInt1027 = 0;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	public static int anInt1030 = 0;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Lclient!oj;")
	public static Class84 aClass84_19 = new Class84(50);

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
	public static int anInt1041 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
	public static void method763() {
		@Pc(11) int local11 = Static48.method758();
		if (local11 == 0) {
			Static217.aByteArrayArrayArray14 = null;
			Static230.method2570(0);
		} else if (local11 == 1) {
			Static209.method3279((byte) 0);
			Static230.method2570(512);
			Static65.method3259();
		} else {
			Static209.method3279((byte) (Static1.anInt41 - 4 & 0xFF));
			Static230.method2570(2);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method765() {
		if (Static10.anInt204 != -1) {
			Static194.method3147(Static10.anInt204);
		}
		for (@Pc(12) int local12 = 0; local12 < Static42.anInt924; local12++) {
			if (Static98.aBooleanArray5[local12]) {
				Static222.aBooleanArray28[local12] = true;
			}
			Static124.aBooleanArray9[local12] = Static98.aBooleanArray5[local12];
			Static98.aBooleanArray5[local12] = false;
		}
		Static197.aClass93_124 = null;
		Static62.anInt1226 = Static107.anInt2132;
		Static106.anInt2130 = -1;
		Static217.anInt4283 = -1;
		if (Static10.anInt204 != -1) {
			Static42.anInt924 = 0;
			Static156.method2583(Static185.anInt3844, 0, 0, 0, Static10.anInt204, Static48.anInt1023, -1, 0);
		}
		Static29.method420();
		Static42.anInt921 = 0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!pa;B)V")
	public static void method773(@OriginalArg(0) Class86 arg0) {
		Static55.aClass86_18 = arg0;
		Static223.anInt4339 = Static55.aClass86_18.method3323(4);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[Lclient!hh;II)Lclient!hh;")
	public static Class50 method775(@OriginalArg(0) int arg0, @OriginalArg(1) Class50[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg2; local9++) {
			if (arg1[local9 + arg0] == null) {
				arg1[local9 + arg0] = Static163.aClass50_1093;
			}
			local7 += arg1[arg0 + local9].anInt1705;
		}
		@Pc(39) byte[] local39 = new byte[local7];
		@Pc(41) int local41 = 0;
		@Pc(51) Class50 local51;
		for (@Pc(43) int local43 = 0; local43 < arg2; local43++) {
			local51 = arg1[local43 + arg0];
			Static235.method866(local51.aByteArray12, 0, local39, local41, local51.anInt1705);
			local41 += local51.anInt1705;
		}
		local51 = new Class50();
		local51.anInt1705 = local7;
		local51.aByteArray12 = local39;
		return local51;
	}
}
