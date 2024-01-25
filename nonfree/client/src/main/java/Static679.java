import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static679 {

	@OriginalMember(owner = "client!ww", name = "g", descriptor = "I")
	public static int anInt10885;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method9046(@OriginalArg(1) Class65 arg0) {
		Static431.aClass73_10 = Static503.method7181(Static363.anInt9292, true, arg0);
		Static258.aClass247_9 = Static483.method6868(Static363.anInt9292, arg0);
		Static604.aClass73_15 = Static503.method7181(Static575.anInt9390, true, arg0);
		Static247.aClass247_16 = Static483.method6868(Static575.anInt9390, arg0);
		Static231.aClass73_8 = Static503.method7181(Static620.anInt10161, true, arg0);
		Static299.aClass247_11 = Static483.method6868(Static620.anInt10161, arg0);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "([SI[Ljava/lang/String;)V")
	public static void method9047(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static40.method585(arg1.length - 1, arg0, arg1, 0);
	}
}
