import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
	public static int anInt5 = -1;

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "[I")
	public static int[] anIntArray3 = new int[1];

	@OriginalMember(owner = "client!aaa", name = "j", descriptor = "F")
	public static float aFloat1 = 1024.0F;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IZZLjava/lang/String;Ljava/lang/String;)V")
	public static void method22(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		Static459.aBoolean556 = arg0;
		if (!arg1) {
			Static242.anInt4374 = -1;
		}
		Static238.aString49 = arg3;
		Static121.aBoolean201 = arg1;
		Static12.aString1 = arg2;
		if (!Static121.aBoolean201 && (Static238.aString49.equals("") || Static12.aString1.equals(""))) {
			Static5.method6556(3);
			return;
		}
		Static91.aBoolean169 = false;
		if (Static494.anInt8821 != 1) {
			Static54.anInt1375 = 0;
			Static252.anInt4470 = -1;
		}
		Static5.method6556(-3);
		Static499.anInt8832 = 1;
		Static88.anInt10791 = 0;
		Static511.anInt3031 = 0;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZI)V")
	public static void method23(@OriginalArg(1) int arg0) {
		@Pc(9) Class14_Sub3_Sub9 local9 = Static142.method2219((long) arg0, 14);
		local9.method2822();
	}
}
