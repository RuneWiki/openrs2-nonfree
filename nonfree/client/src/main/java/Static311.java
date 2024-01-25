import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!po", name = "v", descriptor = "I")
	public static int anInt6696;

	@OriginalMember(owner = "client!po", name = "q", descriptor = "J")
	public static long aLong201 = 0L;

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(B)V")
	public static void method5189() {
		if (Static444.aBoolean517) {
			return;
		}
		if (Static2.aClass148_Sub1_1.aBoolean245) {
			Static332.aFloat80 = (int) Static332.aFloat80 - 17 & 0xFFFFFFF0;
		} else {
			Static371.aFloat96 += (-12.0F - Static371.aFloat96) / 2.0F;
		}
		Static444.aBoolean517 = true;
		Static257.aBoolean292 = true;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method5191(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg2.indexOf(arg0); local14 != -1; local14 = arg2.indexOf(arg0, local14 + arg1.length())) {
			arg2 = arg2.substring(0, local14) + arg1 + arg2.substring(local14 + arg0.length());
		}
		return arg2;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5192(@OriginalArg(1) String arg0) {
		if (Static46.aClass237Array1 != null) {
			Static29.method451(Static285.aClass102_141);
			Static456.aClass2_Sub13_Sub2_2.method3602(Static385.method4939(arg0));
			Static456.aClass2_Sub13_Sub2_2.method3590(arg0);
		}
	}
}
