import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "[Lclient!ha;")
	public static Class84[] aClass84Array12;

	@OriginalMember(owner = "client!ns", name = "s", descriptor = "Lclient!an;")
	public static Class16 aClass16_84;

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_187 = new Class88("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
	public static int anInt6435 = 0;

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "Lclient!fca;")
	public static final Class98 aClass98_6 = new Class98("", 11);

	@OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
	public static final int anInt6442 = -1;

	@OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
	public static int anInt6443 = 0;

	@OriginalMember(owner = "client!ns", name = "r", descriptor = "Z")
	public static boolean aBoolean473 = false;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIZ)V")
	public static void method5379(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static148.anInt6867 == 0) {
			Static490.method7294(false);
		} else {
			Static286.anInt5566 = Static148.anInt6867;
			Static201.method3814(0);
		}
		Static381.aBoolean523 = arg3;
		Static414.anInt7740 = arg1;
		Static248.anInt5102 = arg0;
		Static2.method4928(arg2);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!an;Lclient!an;B)V")
	public static void method5382(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1) {
		Static126.aClass16_114 = arg0;
		Static220.aClass16_58 = arg1;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)Lclient!du;")
	public static Class12_Sub12 method5383() {
		if (Static2.aClass73_48 == null || Static307.aClass162_1 == null) {
			return null;
		}
		for (@Pc(24) Class12_Sub12 local24 = (Class12_Sub12) Static307.aClass162_1.method4147(); local24 != null; local24 = (Class12_Sub12) Static307.aClass162_1.method4147()) {
			@Pc(32) Class152 local32 = Static2.aClass93_5.method2480(local24.anInt2333);
			if (local32 != null && local32.aBoolean378 && local32.method4026(Static2.anInterface9_2)) {
				return local24;
			}
		}
		return null;
	}
}
