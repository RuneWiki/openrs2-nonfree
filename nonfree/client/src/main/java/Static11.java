import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "Cc", descriptor = "I")
	public static int anInt494;

	@OriginalMember(owner = "client!ak", name = "Hc", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ak", name = "qc", descriptor = "[I")
	public static int[] anIntArray44 = new int[50];

	@OriginalMember(owner = "client!ak", name = "rc", descriptor = "Lclient!ab;")
	public static Class3 aClass3_2 = new Class3();

	@OriginalMember(owner = "client!ak", name = "sc", descriptor = "Ljava/lang/String;")
	public static String aString14 = "Members object";

	@OriginalMember(owner = "client!ak", name = "Ec", descriptor = "I")
	public static int anInt496 = 0;

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)I")
	public static int method220() {
		Static32.anInt934 = 0;
		return Static214.method3527();
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(III)J")
	public static long method222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null || local7.aClass144_1 == null ? 0L : local7.aClass144_1.aLong176;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V")
	public static void method224() {
		Static54.anInt1501 = -1;
		Static77.anInt2101 = 2;
		Static194.anInt4334 = 0;
		Static47.anInt1387 = -1;
		Static39.aClass51_14 = null;
		Static143.anInt3473 = 1;
		Static172.aBoolean196 = false;
	}
}
