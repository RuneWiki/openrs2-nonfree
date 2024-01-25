import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!li", name = "L", descriptor = "[I")
	public static int[] anIntArray333;

	@OriginalMember(owner = "client!li", name = "P", descriptor = "[I")
	public static int[] anIntArray335;

	@OriginalMember(owner = "client!li", name = "T", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!li", name = "M", descriptor = "I")
	public static int anInt3827 = 0;

	@OriginalMember(owner = "client!li", name = "O", descriptor = "[I")
	public static final int[] anIntArray334 = new int[14];

	@OriginalMember(owner = "client!li", name = "X", descriptor = "I")
	public static int anInt3835 = 0;

	@OriginalMember(owner = "client!li", name = "Z", descriptor = "Z")
	public static boolean aBoolean319 = false;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IJLclient!vm;)V")
	public static void method3264(@OriginalArg(1) long arg0, @OriginalArg(2) Class92 arg1) {
		Static214.anInt4453 = Static167.anInt3706;
		Static116.anInt1033 = 0;
		Static167.anInt3706 = 0;
		@Pc(22) long local22 = Static274.method4763();
		for (@Pc(27) Class17_Sub3 local27 = (Class17_Sub3) Static140.aClass204_6.method5359(); local27 != null; local27 = (Class17_Sub3) Static140.aClass204_6.method5357()) {
			if (local27.method1066(arg1, arg0)) {
				Static116.anInt1033++;
			}
		}
		if (Static161.aBoolean302 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static140.aClass204_6.method5361() + ", running: " + Static116.anInt1033 + ". Particles: " + Static167.anInt3706 + ". Time taken: " + (Static274.method4763() - local22) + "ms");
		}
	}

	@OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V")
	public static void method3266() {
		Static332.anInt6590 = Static232.aClass106_5.anInt3309 + Static232.aClass106_5.anInt3299 + 2;
		Static214.anInt4455 = Static242.aClass106_7.anInt3299 + Static242.aClass106_7.anInt3309 + 2;
		Static154.aStringArray27 = new String[350 / Static332.anInt6590];
		for (@Pc(37) int local37 = 0; local37 < Static154.aStringArray27.length; local37++) {
			Static154.aStringArray27[local37] = "";
		}
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "(II)V")
	public static void method3267() {
		@Pc(5) Class154 local5 = Static148.aClass154_75;
		synchronized (Static148.aClass154_75) {
			Static148.aClass154_75.method4220(5);
		}
		local5 = Static251.aClass154_79;
		synchronized (Static251.aClass154_79) {
			Static251.aClass154_79.method4220(5);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIFIIIIZ)[[I")
	public static int[][] method3268(@OriginalArg(3) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class4_Sub4_Sub23 local13 = new Class4_Sub4_Sub23();
		local13.aBoolean357 = false;
		local13.anInt4292 = 3;
		local13.anInt4293 = (int) (arg0 * 4096.0F);
		local13.anInt4294 = 8;
		local13.anInt4297 = 4;
		local13.method5392();
		Static39.method744(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local13.method3614(local9[local45], local45);
		}
		return local9;
	}
}
