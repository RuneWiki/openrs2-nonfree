import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!em", name = "e", descriptor = "Z")
	public static boolean aBoolean215;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "I")
	public static int anInt2739 = -1;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIZLclient!pe;ZI)V")
	public static void method2383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class254 arg3) {
		Static340.anInt6985 = arg1;
		Static274.anInt5814 = arg2;
		Static273.anInt5808 = 0;
		Static178.anInt3592 = 1;
		Static93.aBoolean180 = false;
		Static568.aClass254_136 = arg3;
		Static207.anInt4266 = Static547.aClass3_Sub14_Sub4_3.method7847() / arg0;
		if (Static207.anInt4266 < 1) {
			Static207.anInt4266 = 1;
		}
	}
}
