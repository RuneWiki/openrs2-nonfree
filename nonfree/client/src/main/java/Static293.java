import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
	public static int anInt1093;

	@OriginalMember(owner = "client!qq", name = "N", descriptor = "Z")
	private static boolean aBoolean85;

	@OriginalMember(owner = "client!qq", name = "O", descriptor = "Z")
	private static boolean aBoolean86;

	@OriginalMember(owner = "client!qq", name = "P", descriptor = "Z")
	private static boolean aBoolean87;

	@OriginalMember(owner = "client!qq", name = "Q", descriptor = "I")
	private static int anInt1096;

	@OriginalMember(owner = "client!qq", name = "u", descriptor = "I")
	public static int anInt1079 = 0;

	@OriginalMember(owner = "client!qq", name = "x", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_32 = new Class62("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V")
	public static void method763() {
		Static55.anInt1202 = 0;
		Static280.anInt5248 = -1;
		Static278.anInt5164 = -1;
		Static391.anInt7123 = -1;
	}

	@OriginalMember(owner = "client!qq", name = "providesignlink", descriptor = "(Lclient!kd;)V")
	private static void method771(@OriginalArg(0) Class123 arg0) {
		Static154.aClass123_2 = arg0;
		Static181.aClass123_3 = arg0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!fc;Lclient!oj;Lclient!so;ILclient!fg;III)V")
	public static void method773(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub10 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) int local14 = arg4.anInt2185 - arg3 / 2 - 5;
		@Pc(18) int local18 = arg6 + 2;
		if (arg2.anInt5978 != 0) {
			arg1.method2509(arg6 + arg0.method1635() * arg5 + 1 - local18, arg3 + 10, local18, arg2.anInt5978, local14);
		}
		if (arg2.anInt6003 != 0) {
			arg1.method2484(arg6 + arg0.method1635() * arg5 + 1 - local18, local14, arg3 + 10, arg2.anInt6003, local18);
		}
		@Pc(78) int local78 = arg2.anInt5972;
		if (arg4.aBoolean161 && arg2.anInt5980 != -1) {
			local78 = arg2.anInt5980;
		}
		for (@Pc(91) int local91 = 0; local91 < arg5; local91++) {
			@Pc(97) String local97 = Static376.aStringArray43[local91];
			if (local91 < arg5 - 1) {
				local97 = local97.substring(0, local97.length() - 4);
			}
			arg0.method1636(arg1, local97, arg4.anInt2185, arg6, local78);
			arg6 += arg0.method1635();
		}
	}
}
