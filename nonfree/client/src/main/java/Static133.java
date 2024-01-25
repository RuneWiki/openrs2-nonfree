import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static133 {

	@OriginalMember(owner = "client!efa", name = "e", descriptor = "I")
	public static int anInt2551;

	@OriginalMember(owner = "client!efa", name = "d", descriptor = "Lclient!tq;")
	public static final Class343 aClass343_2 = new Class343("", 11);

	@OriginalMember(owner = "client!efa", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray21 = new String[100];

	@OriginalMember(owner = "client!efa", name = "i", descriptor = "Z")
	public static boolean aBoolean196 = true;

	@OriginalMember(owner = "client!efa", name = "j", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject9 = null;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIIIIIB)V")
	public static void method2247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static642.anInt10555 = arg2;
		Static565.anInt9141 = arg3;
		Static120.anInt2145 = arg5;
		Static287.anInt4853 = arg1;
		Static224.anInt3860 = arg4;
		Static16.anInt10140 = arg0;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(BJ)I")
	public static int method2249(@OriginalArg(1) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(BLclient!gm;)Z")
	public static boolean method2250(@OriginalArg(1) Class135 arg0) {
		return arg0 == Static352.aClass135_8 || arg0 == Static81.aClass135_11 || arg0 == Static224.aClass135_2 || arg0 == Static268.aClass135_5;
	}
}
