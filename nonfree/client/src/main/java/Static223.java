import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static223 {

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
	public static int anInt4013;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
	public static int anInt4015 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIBI)V")
	public static void method3357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static74.anInt1469 = arg1;
		Static171.anInt3155 = arg2;
		Static120.anInt2113 = arg3;
		Static397.anInt6903 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!vh;B)V")
	public static void method3358(@OriginalArg(0) Class250 arg0) {
		Static379.anInt6499 = 0;
		Static324.anInt5681 = 0;
		Static138.aClass188_3 = new Class188();
		Static330.aClass39_Sub2_Sub1_Sub1Array1 = new Class39_Sub2_Sub1_Sub1[1024];
		Static381.method4269(arg0);
		Static185.method2823(arg0);
	}
}
