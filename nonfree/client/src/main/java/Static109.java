import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString117;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
	public static int anInt9293;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "Ljava/lang/Object;")
	public static Object anObject30;

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray85 = new int[6][];

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "[I")
	public static final int[] anIntArray696 = new int[25];

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
	public static int anInt9295 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Z")
	public static boolean method7597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class313 local8 = Static260.aClass100_1.method2008(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local8.method6971(arg1);
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	public static void method7600() {
		Static542.aClass332_198.method7510();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)V")
	public static void method7602(@OriginalArg(1) int arg0) {
		Static44.anInt719 = arg0;
		@Pc(14) Class332 local14 = Static234.aClass332_102;
		synchronized (Static234.aClass332_102) {
			Static234.aClass332_102.method7510();
		}
		local14 = Static23.aClass332_14;
		synchronized (Static23.aClass332_14) {
			Static23.aClass332_14.method7510();
		}
	}
}
