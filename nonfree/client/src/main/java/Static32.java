import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!nk;")
	public static Class121 aClass121_67;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "Lclient!nk;")
	public static Class121 aClass121_68;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!ti;")
	public static Class1_Sub2_Sub20 aClass1_Sub2_Sub20_4;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!vh;")
	public static Class187 aClass187_76 = new Class187(64);

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "[J")
	public static long[] aLongArray8 = new long[500];

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[112];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!hi;I)Lclient!hi;")
	public static Class66 method2405(@OriginalArg(0) Class66 arg0) {
		@Pc(14) Class66 local14 = Static37.method682(arg0);
		if (local14 == null) {
			local14 = arg0.aClass66_19;
		}
		return local14;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public static void method2409() {
		Static158.method2714((long) Static313.anInt2966);
		if (Static270.anInt4897 != -1) {
			Static248.method3926(Static270.anInt4897);
		}
		for (@Pc(19) int local19 = 0; local19 < Static293.anInt5272; local19++) {
			if (Static304.aBooleanArray23[local19]) {
				Static116.aBooleanArray8[local19] = true;
			}
			Static307.aBooleanArray25[local19] = Static304.aBooleanArray23[local19];
			Static304.aBooleanArray23[local19] = false;
		}
		if (Static156.aBoolean211) {
			Static282.aBoolean348 = true;
		}
		Static308.anInt5489 = -1;
		Static34.anInt4474 = -1;
		Static92.anInt5553 = Static313.anInt2966;
		Static82.aClass66_18 = null;
		if (Static270.anInt4897 != -1) {
			Static293.anInt5272 = 0;
			Static264.method4163();
		}
		if (Static156.aBoolean211) {
			Static119.method2126();
		} else {
			Static25.method412();
		}
		Static81.anInt1635 = 0;
	}
}
