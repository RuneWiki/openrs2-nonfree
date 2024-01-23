import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
	public static int anInt1331;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "Z")
	public static boolean aBoolean109 = false;

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[200];

	@OriginalMember(owner = "client!fa", name = "x", descriptor = "Z")
	public static boolean aBoolean110 = false;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIZ)V")
	public static void method1131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub1_Sub14 local5 = Static191.method3134(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		Static297.aStringArray46 = new String[local5.anInt3632];
		Static144.anIntArray235 = new int[local5.anInt3626];
		if (local5.anInt3625 == 15 || local5.anInt3625 == 17 || local5.anInt3625 == 16) {
			@Pc(42) int local42 = 0;
			@Pc(44) int local44 = 0;
			if (Static106.aClass146_9 != null) {
				local42 = Static106.aClass146_9.anInt4340;
				local44 = Static106.aClass146_9.anInt4385;
			}
			Static144.anIntArray235[1] = Static300.anInt5678 - local44;
			Static144.anIntArray235[0] = Static152.anInt3132 - local42;
		}
		Static287.method4261(200000, local5);
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)V")
	public static void method1133(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub1_Sub2 local6 = Static46.method824(14, arg0);
		local6.method299();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!qf;IIZ)V")
	public static void method1134(@OriginalArg(0) Class146 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static9.aClass146_11 != null || Static108.aBoolean161 || (arg0 == null || Static267.method3976(arg0) == null)) {
			return;
		}
		Static9.aClass146_11 = arg0;
		Static87.aClass146_6 = Static267.method3976(arg0);
		Static271.aBoolean369 = false;
		Static312.anInt5847 = arg1;
		Static82.anInt1499 = 0;
		Static168.anInt5865 = arg2;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)J")
	public static long method1135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass171_1 == null ? 0L : local7.aClass171_1.aLong196;
	}
}
