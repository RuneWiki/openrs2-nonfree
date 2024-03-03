import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!kt", name = "V", descriptor = "[I")
	public static int[] anIntArray208;

	@OriginalMember(owner = "client!kt", name = "X", descriptor = "Lclient!wm;")
	public static Class19 aClass19_8;

	@OriginalMember(owner = "client!kt", name = "Z", descriptor = "Lclient!tg;")
	public static Class221 aClass221_1;

	@OriginalMember(owner = "client!kt", name = "db", descriptor = "Lclient!bu;")
	public static Class29_Sub1 aClass29_Sub1_63;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIILclient!wm;)V", line = 3)
	public static void method3501(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19 arg2) {
		Static61.aClass19_3 = arg2;
		Static309.aClass21ArrayArray3 = new Class21[arg1][arg0];
		if (Static195.anIntArray228 != null) {
			Static58.aClass42_5 = Static274.method5108(Static195.anIntArray228[2], Static195.anIntArray228[4], Static195.anIntArray228[5], Static195.anIntArray228[1], Static195.anIntArray228[0], Static195.anIntArray228[3]);
		}
		Static112.aClass21_1 = new Class21();
		Static20.method560();
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIII)V", line = 128)
	public static void method3502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class2_Sub2_Sub7 local12 = Static293.method5414(4, arg3);
		local12.method2313();
		local12.anInt2287 = arg0;
		local12.anInt2281 = arg1;
		local12.anInt2286 = arg2;
	}

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "(I)V", line = 146)
	public static void method3503() {
		Static197.aClass13_13 = null;
		Static316.aClass13_18 = null;
		Static71.aClass13_5 = null;
		Static314.aClass13_17 = null;
		Static34.aClass13_3 = null;
		Static184.aClass13_12 = null;
		Static103.aClass13_6 = null;
		Static129.aClass13_8 = null;
	}
}
