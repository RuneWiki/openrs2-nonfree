import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "Lclient!tj;")
	public static Class193 aClass193_43;

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "Lclient!bk;")
	public static Interface3 anInterface3_4;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
	public static int anInt2896;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "Lclient!qg;")
	public static Class166 aClass166_2;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "[I")
	public static final int[] anIntArray252 = new int[14];

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZII)V")
	public static void method2543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub4_Sub18 local8 = Static302.method4961(arg0, 14);
		local8.method4908();
		local8.anInt5705 = arg1;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
	public static void method2546() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static298.aBooleanArray26[local3] = false;
		}
		Static23.anInt459 = 0;
		Static349.anInt6620 = -1;
		Static30.anInt779 = 0;
		Static353.anInt2640 = 1;
		Static9.anInt215 = -1;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!tj;Lclient!tj;)V")
	public static void method2547(@OriginalArg(1) Class193 arg0, @OriginalArg(2) Class193 arg1) {
		Static306.aClass193_96 = arg1;
		Static255.aClass193_90 = arg0;
		Static255.aClass193_90.method5055(36);
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
	public static void method2548() {
		Static324.anInt6209 = 1;
		Static268.anInt5371 = 0;
		Static206.anInt4322 = -1;
		Static42.anInt1130 = 0;
		Static357.aBoolean490 = false;
		Static333.anInt6366 = 0;
		Static42.anInt1131 = -3;
	}
}
