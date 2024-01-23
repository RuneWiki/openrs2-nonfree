import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!kn", name = "D", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray21;

	@OriginalMember(owner = "client!kn", name = "F", descriptor = "Lclient!fh;")
	public static Class58 aClass58_66;

	@OriginalMember(owner = "client!kn", name = "E", descriptor = "I")
	public static int anInt2974 = 0;

	@OriginalMember(owner = "client!kn", name = "G", descriptor = "[I")
	public static int[] anIntArray267 = new int[256];

	@OriginalMember(owner = "client!kn", name = "J", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray22 = new String[200];

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V")
	public static void method2418() {
		if (Static92.aBoolean124) {
			Static92.aBoolean124 = false;
			Static263.aClass4_Sub3_Sub14_7 = null;
			Static240.aClass56_1 = null;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
	public static void method2420() {
		Static51.aClass26_7.method511();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)J")
	public static long method2421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass42_1 == null ? 0L : local7.aClass42_1.aLong45;
	}
}
