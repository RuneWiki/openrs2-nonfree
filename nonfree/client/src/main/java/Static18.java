import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
	public static int anInt439;

	@OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
	public static int anInt441;

	@OriginalMember(owner = "client!ar", name = "G", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_8 = new Class158("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!ar", name = "K", descriptor = "Lclient!ec;")
	public static Class68 aClass68_1 = null;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIBI)V")
	public static void method368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg1) {
			Static285.method4177(arg0, arg4, arg2, arg3);
		} else if (Static105.anInt2417 <= arg2 - arg3 && Static70.anInt1843 >= arg2 + arg3 && arg0 - arg1 >= Static362.anInt6654 && Static164.anInt6595 >= arg0 + arg1) {
			Static443.method6130(arg3, arg1, arg4, arg2, arg0);
		} else {
			Static219.method3421(arg3, arg4, arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/awt/Component;B)Lclient!ws;")
	public static Class48 method369(@OriginalArg(0) Component arg0) {
		return new Class48_Sub1(arg0);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(DI)V")
	public static void method370(@OriginalArg(0) double arg0) {
		if (Static327.aDouble8 == arg0) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < 256; local5++) {
			@Pc(16) int local16 = (int) (Math.pow((double) local5 / 255.0D, arg0) * 255.0D);
			Static388.anIntArray674[local5] = local16 > 255 ? 255 : local16;
		}
		Static327.aDouble8 = arg0;
	}

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "(I)V")
	public static void method372() {
		for (@Pc(3) int local3 = 0; local3 < Static113.anInt2513; local3++) {
			@Pc(9) Class45 local9 = Static117.aClass45Array1[local3];
			if (local9.aByte35 == 2) {
				if (local9.aClass1_Sub19_Sub4_2 == null) {
					local9.anInt1514 = Integer.MIN_VALUE;
				} else {
					Static12.aClass1_Sub19_Sub2_1.method3181(local9.aClass1_Sub19_Sub4_2);
				}
			}
		}
	}
}
