import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
	public static final int[] anIntArray523 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
	public static int anInt9785 = -1;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method7991(@OriginalArg(0) Class44 arg0) {
		if (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126 != Static384.anInt7375 && (Static60.aClass53ArrayArrayArray1 != null && Static125.method2595(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126, arg0))) {
			Static384.anInt7375 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126;
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V")
	public static void method7992(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class4_Sub5_Sub16 local14 = Static219.method3587(arg0, 7);
		local14.method7133();
		local14.anInt8736 = arg1;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(III)V")
	public static void method7993(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static542.method7871(arg1, arg0);
	}
}
