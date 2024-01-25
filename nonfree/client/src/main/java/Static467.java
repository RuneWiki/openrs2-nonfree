import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!qia", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray48;

	@OriginalMember(owner = "client!qia", name = "s", descriptor = "Lclient!cv;")
	public static Class64 aClass64_5;

	@OriginalMember(owner = "client!qia", name = "d", descriptor = "I")
	public static int anInt7868 = -1;

	@OriginalMember(owner = "client!qia", name = "r", descriptor = "[I")
	public static final int[] anIntArray632 = new int[2048];

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(IIIII)V")
	public static void method6871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static413.anIntArrayArray37 != null) {
			Static413.anIntArrayArray37[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static402.aShortArrayArray19 != null) {
			Static402.aShortArrayArray19[arg0][arg1] = (short) arg3;
		}
		if (Static423.aByteArrayArray17 != null) {
			Static423.aByteArrayArray17[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(ILclient!ha;I)Lclient!hu;")
	public static Class44 method6873(@OriginalArg(1) Class126 arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class5_Sub25 local18 = (Class5_Sub25) Static587.aClass81_67.method1599((long) arg1);
		if (local18 != null) {
			@Pc(25) Class5_Sub5_Sub1 local25 = local18.aClass103_Sub1_1.method6159();
			local18.aBoolean369 = true;
			if (local25 != null) {
				return local25.method1906(arg0);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(ILclient!wu;I)Lclient!wo;")
	public static Class5_Sub51 method6874(@OriginalArg(0) int arg0, @OriginalArg(1) Class384 arg1) {
		@Pc(8) byte[] local8 = arg1.method8893(arg0);
		return local8 == null ? null : new Class5_Sub51(local8);
	}
}
