import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
	public static int anInt1437;

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "Lclient!gga;")
	public static Class124 aClass124_20;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray7 = new int[6][];

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
	public static int anInt1445 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)Z")
	public static boolean method1390() {
		try {
			@Pc(7) Class216 local7 = new Class216();
			@Pc(12) byte[] local12 = local7.method5739(Static113.aByteArray23);
			Static71.method1304(local12);
			return true;
		} catch (@Pc(24) Exception local24) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
	public static void method1391() {
		if (!Static378.aBoolean541) {
			Static378.aBoolean541 = true;
			Static24.aFloat3 += (12.0F - Static24.aFloat3) / 2.0F;
			Static561.aBoolean715 = true;
		}
	}
}
