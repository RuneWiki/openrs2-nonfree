import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
	public static int anInt4144;

	@OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
	public static int anInt4145;

	@OriginalMember(owner = "client!mn", name = "N", descriptor = "I")
	public static int anInt4147;

	@OriginalMember(owner = "client!mn", name = "R", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray40 = null;

	@OriginalMember(owner = "client!mn", name = "U", descriptor = "Z")
	public static boolean aBoolean383 = false;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZ)I")
	public static int method3745(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 - 1;
		@Pc(15) int local15 = local9 | local9 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIZZ)V")
	public static void method3746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (Static306.anInt6046 == 0) {
			Static130.method2653(false);
		} else {
			Static138.anInt3049 = Static306.anInt6046;
			Static259.method2702(0);
		}
		Static68.anInt1820 = arg2;
		Static1.aBoolean6 = arg3;
		Static101.anInt2420 = arg1;
		Static79.method3770(arg0);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BI)V")
	public static void method3747(@OriginalArg(1) int arg0) {
		Static158.anInt3437 = arg0;
		@Pc(7) Class87 local7 = Static5.aClass87_1;
		synchronized (Static5.aClass87_1) {
			Static5.aClass87_1.method2485();
		}
		local7 = Static56.aClass87_14;
		synchronized (Static56.aClass87_14) {
			Static56.aClass87_14.method2485();
		}
		local7 = Static101.aClass87_19;
		synchronized (Static101.aClass87_19) {
			Static101.aClass87_19.method2485();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3748(@OriginalArg(0) String arg0) {
		if (Static156.aClass215Array1 != null) {
			Static342.aClass1_Sub8_Sub1_7.method3229(166);
			Static342.aClass1_Sub8_Sub1_7.method4562(Static321.method5243(arg0));
			Static342.aClass1_Sub8_Sub1_7.method4531(arg0);
		}
	}
}
