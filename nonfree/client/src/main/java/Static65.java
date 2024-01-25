import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "Lclient!rk;")
	public static Class180 aClass180_18;

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "[I")
	public static int[] anIntArray235;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "Lclient!mk;")
	public static Class70 aClass70_5;

	@OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
	public static int anInt1637;

	@OriginalMember(owner = "client!ds", name = "x", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
	public static int anInt1630 = -1;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIII)V")
	public static void method1319(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class7_Sub1_Sub15 local8 = Static315.method5104(8, arg2);
		local8.method4790();
		local8.anInt5696 = arg1;
		local8.anInt5687 = arg0;
		local8.anInt5692 = arg3;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!rk;B)V")
	public static void method1320(@OriginalArg(0) Class180 arg0) {
		Static5.aClass180_1 = arg0;
		Static28.anInt644 = Static5.aClass180_1.method4553(19);
	}
}
