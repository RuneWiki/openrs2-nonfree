import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Lclient!h;")
	public static final Class114 aClass114_15 = new Class114("Loading SW3D - ", "Lade SW3D - ", "Chargement SW3D - ", "Carregando SW3D - ");

	@OriginalMember(owner = "client!bc", name = "J", descriptor = "Lclient!h;")
	public static final Class114 aClass114_16 = new Class114(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!bc", name = "U", descriptor = "F")
	public static float aFloat50 = 0.0F;

	@OriginalMember(owner = "client!bc", name = "Z", descriptor = "[I")
	public static final int[] anIntArray118 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
	public static void method1185(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub1_Sub13 local8 = Static476.method6225(11, arg0);
		local8.method4925();
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)I")
	public static int method1190(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1192(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(23) String local23 = Static361.method5639(arg0);
		if (local23 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < Static108.anInt2509; local28++) {
			@Pc(33) String local33 = Static366.aStringArray40[local28];
			if (local33.startsWith("*")) {
				local33 = local33.substring(1);
			}
			local33 = Static361.method5639(local33);
			if (local33 != null && local33.equals(local23)) {
				Static108.anInt2509--;
				for (@Pc(57) int local57 = local28; local57 < Static108.anInt2509; local57++) {
					Static366.aStringArray40[local57] = Static366.aStringArray40[local57 + 1];
					Static417.aStringArray28[local57] = Static417.aStringArray28[local57 + 1];
					Static210.anIntArray326[local57] = Static210.anIntArray326[local57 + 1];
					Static19.aStringArray1[local57] = Static19.aStringArray1[local57 + 1];
					Static226.anIntArray333[local57] = Static226.anIntArray333[local57 + 1];
					Static372.aBooleanArray24[local57] = Static372.aBooleanArray24[local57 + 1];
				}
				Static340.anInt6357 = Static418.anInt7279;
				Static444.method6416(Static176.aClass186_54);
				Static192.aClass1_Sub13_Sub2_1.method3060(Static443.method6412(arg0));
				Static192.aClass1_Sub13_Sub2_1.method3061(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(III)V")
	public static void method1193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static128.anInt3069 = arg0 - Static451.anInt3558;
		Static241.anInt2906 = arg1 - Static451.anInt3553;
	}
}
