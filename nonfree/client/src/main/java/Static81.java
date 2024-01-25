import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!d", name = "cc", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!d", name = "x", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_61 = new Class123(60, -1);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)Z")
	public static boolean method1881(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static523.method7236(arg1, arg0)) {
			return Static516.method6952(arg1, arg0) | (arg1 & 0xB000) != 0 | Static531.method7276(arg1, arg0) ? true : (arg0 & 0x37) == 0 & (Static251.method5133(arg0, arg1) | Static564.method7694(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!ie;I)Lclient!gaa;")
	public static Class38_Sub1 method1882(@OriginalArg(0) Class3_Sub26 arg0) {
		@Pc(7) Class38 local7 = Static262.method4026(arg0);
		@Pc(18) int local18 = arg0.method6811();
		@Pc(22) int local22 = arg0.method6811();
		@Pc(28) int local28 = arg0.method6811();
		@Pc(32) int local32 = arg0.method6811();
		@Pc(36) int local36 = arg0.method6811();
		@Pc(40) int local40 = arg0.method6811();
		return new Class38_Sub1(local7.aClass154_12, local7.aClass201_13, local7.anInt8021, local7.anInt8017, local7.anInt8020, local7.anInt8019, local7.anInt8022, local7.anInt8024, local7.anInt8023, local18, local22, local28, local32, local36, local40);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIII)V")
	public static void method1884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) int local19 = arg0 + 1;
		Static504.method6755(arg2, arg1, Static570.anIntArrayArray100[arg0], arg3);
		@Pc(28) int local28 = arg4 - 1;
		Static504.method6755(arg2, arg1, Static570.anIntArrayArray100[arg4], arg3);
		for (@Pc(33) int local33 = local19; local33 <= local28; local33++) {
			@Pc(39) int[] local39 = Static570.anIntArrayArray100[local33];
			local39[arg3] = local39[arg1] = arg2;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)I")
	public static int method1890(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (local24 * arg0 >> 12) + 40960;
		return local13 * local33 >> 12;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;BZLjava/lang/String;)V")
	public static void method1893(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		Static422.aString202 = arg2;
		Static132.aBoolean230 = arg1;
		Static525.aString237 = arg0;
		if (!Static132.aBoolean230 && Static403.anInt7291 != 3 && (Static422.aString202.equals("") || Static525.aString237.equals(""))) {
			Static483.method6567(3);
			return;
		}
		if (Static403.anInt7291 != 1) {
			Static536.anInt9351 = 0;
			Static348.anInt3837 = -1;
		}
		Static116.aBoolean190 = false;
		Static483.method6567(-3);
		Static439.anInt7792 = 0;
		Static340.anInt6133 = 1;
		Static144.anInt3369 = 0;
	}
}
