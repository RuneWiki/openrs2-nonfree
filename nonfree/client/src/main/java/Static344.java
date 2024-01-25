import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static344 {

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
	public static int anInt11215;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
	public static final int anInt11211 = 1407;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "[I")
	public static final int[] anIntArray829 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
	public static int anInt11217 = -1;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLclient!wia;Lclient!wia;Lclient!wia;Lclient!wia;)V")
	public static void method9316(@OriginalArg(1) Class386 arg0, @OriginalArg(2) Class386 arg1, @OriginalArg(3) Class386 arg2, @OriginalArg(4) Class386 arg3) {
		Static671.aClass386_142 = arg1;
		Static339.aClass386_82 = arg2;
		Static561.aClass386_120 = arg0;
		Static559.aClass230ArrayArray2 = new Class230[Static561.aClass386_120.method9189()][];
		Static44.aBooleanArray3 = new boolean[Static561.aClass386_120.method9189()];
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)Lclient!ru;")
	public static Class217_Sub1 method9318(@OriginalArg(1) int arg0) {
		return Static594.aBoolean711 && arg0 >= Static590.anInt10098 && arg0 <= Static468.anInt354 ? Static430.aClass217_Sub1Array2[arg0 - Static590.anInt10098] : null;
	}
}
