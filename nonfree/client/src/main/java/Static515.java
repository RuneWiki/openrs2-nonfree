import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!qga", name = "Y", descriptor = "[I")
	public static int[] anIntArray587;

	@OriginalMember(owner = "client!qga", name = "eb", descriptor = "I")
	public static int anInt8213;

	@OriginalMember(owner = "client!qga", name = "db", descriptor = "[[I")
	public static int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!qga", name = "ib", descriptor = "Z")
	public static boolean aBoolean708 = false;

	@OriginalMember(owner = "client!qga", name = "Mb", descriptor = "I")
	public static int anInt8192 = 0;

	@OriginalMember(owner = "client!qga", name = "Gb", descriptor = "Z")
	public static boolean aBoolean709 = false;

	@OriginalMember(owner = "client!qga", name = "c", descriptor = "(I)V")
	public static void method7307() {
		if (Static542.anInt8552 == -1) {
			return;
		}
		@Pc(12) int local12 = Static402.aClass138_1.method4767();
		@Pc(23) int local23 = Static402.aClass138_1.method4771();
		@Pc(28) Class2_Sub18 local28 = (Class2_Sub18) Static171.aClass60_55.method1226(7);
		if (local28 != null) {
			local12 = local28.method7122();
			local23 = local28.method7124();
		}
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		if (Static392.aBoolean549) {
			local40 = Static637.method3733();
			local42 = Static400.method5900();
		}
		Static34.method7590(local12, local42 + Static295.anInt4558, local23, local23 + local42, local42, Static542.anInt8552, local40 + Static151.anInt7983, local40, local40, local40 + local12, local42);
		if (Static388.aClass273_10 != null) {
			Static621.method8392(local12 + local40, local23 - -local42);
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IBI)Z")
	public static boolean method7311(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(BI)V")
	public static void method7314(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		if (arg0 <= 121) {
			aBoolean709 = false;
		}
		@Pc(16) Class2_Sub6_Sub12 local16 = Static636.method8647(3, (long) arg1);
		local16.method6245();
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method7315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg6) {
			return;
		}
		Static134.anInt2240 = arg2;
		Static50.anInt814 = arg0;
		Static571.anInt8992 = arg4;
		Static617.anInt9500 = arg5;
		Static605.anInt9403 = arg3;
		Static675.anInt10485 = arg1;
	}
}
