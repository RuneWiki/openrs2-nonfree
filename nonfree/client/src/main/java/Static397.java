import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "Ljava/lang/Object;")
	public static Object anObject9;

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Lclient!pc;")
	public static Class188 aClass188_116;

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
	public static int anInt6958;

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "Lclient!df;")
	public static Class49 aClass49_28;

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_143 = new Class256("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
	public static final int anInt6953 = 1401;

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "Z")
	public static boolean aBoolean589 = true;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)I")
	public static int method5449() {
		@Pc(10) Class129 local10 = Static115.aClass129_58;
		synchronized (Static115.aClass129_58) {
			return Static115.aClass129_58.method3034();
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!pc;I)V")
	public static void method5450(@OriginalArg(0) Class188 arg0) {
		Static118.aClass188_36 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
	public static void method5452() {
		if (Static34.aBoolean56) {
			return;
		}
		Static18.aBoolean33 = true;
		Static34.aBoolean56 = true;
		if (Static399.aClass167_Sub1_1.aBoolean480) {
			Static328.aFloat179 = (int) Static328.aFloat179 - 17 & 0xFFFFFFF0;
		} else {
			Static317.aFloat171 += (-12.0F - Static317.aFloat171) / 2.0F;
		}
	}
}
