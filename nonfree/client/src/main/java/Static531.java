import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "[J")
	public static long[] aLongArray19;

	@OriginalMember(owner = "client!saa", name = "f", descriptor = "I")
	public static int anInt9214;

	@OriginalMember(owner = "client!saa", name = "h", descriptor = "Lclient!da;")
	public static Class38 aClass38_11;

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method7615(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (Static56.aClass14_Sub22_5.aClass21_Sub20_1.method7115() != 0 && arg1 != 0 && Static4.anInt29 < 50 && arg4 != -1) {
			Static178.aClass393Array1[Static4.anInt29++] = new Class393((byte) 2, arg4, arg1, arg3, arg2, arg0, arg5, (Class12_Sub2) null);
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public static void method7616(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static652.anInt10896 = -1;
		Static494.anInt8821 = 1;
		Static2.method22(false, false, arg1, arg0);
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(BIII)I")
	public static int method7617(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg1;
		}
		@Pc(17) int local17 = 128 - arg2;
		@Pc(31) int local31 = (arg0 & 0x7F) * arg2 + local17 * (arg1 & 0x7F) >> 7;
		@Pc(45) int local45 = (arg1 & 0x380) * local17 + arg2 * (arg0 & 0x380) >> 7;
		@Pc(60) int local60 = (arg1 & 0xFC00) * local17 + (arg0 & 0xFC00) * arg2 >> 7;
		return local60 & 0xFC00 | local45 & 0x380 | local31 & 0x7F;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(II)Z")
	public static boolean method7619(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}
}
