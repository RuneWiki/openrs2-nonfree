import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_204 = new Class158("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray45 = new String[100];

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
	public static int anInt7625 = -1;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
	public static int anInt7626 = -1;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)Z")
	public static boolean method5784(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIII)V")
	public static void method5786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= Static362.anInt6654 && arg3 <= Static164.anInt6595) {
			@Pc(11) int local11 = Static337.method4744(arg0, Static70.anInt1843, Static105.anInt2417);
			@Pc(17) int local17 = Static337.method4744(arg1, Static70.anInt1843, Static105.anInt2417);
			Static108.method1768(arg3, local11, local17, arg2);
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	public static void method5787() {
		for (@Pc(14) Class1_Sub40 local14 = (Class1_Sub40) Static239.aClass203_37.method4548(); local14 != null; local14 = (Class1_Sub40) Static239.aClass203_37.method4545()) {
			if (local14.anInt6628 > 0) {
				local14.anInt6628--;
			}
			if (local14.anInt6628 != 0) {
				if (local14.anInt6629 > 0) {
					local14.anInt6629--;
				}
				if (local14.anInt6629 == 0 && local14.anInt6621 >= 1 && local14.anInt6627 >= 1 && Static209.anInt4283 - 2 >= local14.anInt6621 && Static211.anInt4295 - 2 >= local14.anInt6627 && (local14.anInt6618 < 0 || Static280.method4120(local14.anInt6624, local14.anInt6618))) {
					Static299.method940(local14.anInt6625, local14.anInt6621, local14.anInt6627, local14.anInt6618, local14.anInt6623, -1, local14.anInt6624, local14.anInt6626);
					local14.anInt6629 = -1;
					if (local14.anInt6617 == local14.anInt6618 && local14.anInt6617 == -1) {
						local14.method6178();
					} else if (local14.anInt6617 == local14.anInt6618 && local14.anInt6622 == local14.anInt6625 && local14.anInt6630 == local14.anInt6624) {
						local14.method6178();
					}
				}
			} else if (local14.anInt6617 < 0 || Static280.method4120(local14.anInt6630, local14.anInt6617)) {
				Static299.method940(local14.anInt6622, local14.anInt6621, local14.anInt6627, local14.anInt6617, local14.anInt6623, -1, local14.anInt6630, local14.anInt6626);
				local14.method6178();
			}
		}
	}
}
