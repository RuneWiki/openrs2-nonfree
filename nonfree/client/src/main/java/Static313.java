import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "[I")
	public static int[] anIntArray627;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "[I")
	public static final int[] anIntArray626 = new int[100];

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
	public static final int anInt5341 = 1337;

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "Lclient!o;")
	public static final Class169 aClass169_290 = new Class169("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString59 = null;

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "Lclient!gp;")
	public static Class94 aClass94_8 = null;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)Lclient!st;")
	public static Class41_Sub6 method4637() {
		@Pc(13) Class41_Sub6 local13 = (Class41_Sub6) Static367.aClass208_9.method4656();
		if (local13 == null) {
			return new Class41_Sub6();
		} else {
			Static281.anInt4885--;
			return local13;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!tq;ZJ)V")
	public static void method4638(@OriginalArg(0) Class164 arg0, @OriginalArg(2) long arg1) {
		Static337.anInt5595 = Static288.anInt4961;
		Static103.anInt1816 = 0;
		Static288.anInt4961 = 0;
		@Pc(19) long local19 = Static378.method5293();
		for (@Pc(24) Class41_Sub3 local24 = (Class41_Sub3) Static63.aClass208_8.method4661(); local24 != null; local24 = (Class41_Sub3) Static63.aClass208_8.method4663()) {
			if (local24.method2144(arg0, arg1)) {
				Static103.anInt1816++;
			}
		}
		if (Static132.aBoolean205 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static63.aClass208_8.method4665() + ", running: " + Static103.anInt1816 + ". Particles: " + Static288.anInt4961 + ". Time taken: " + (Static378.method5293() - local19) + "ms");
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIILclient!go;Lclient!go;)V")
	public static void method4639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class25_Sub3 arg3, @OriginalArg(4) Class25_Sub3 arg4) {
		@Pc(4) Class132 local4 = Static18.method2854(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass25_Sub3_2 = arg3;
			local4.aClass25_Sub3_1 = arg4;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIBLclient!bg;)V")
	public static void method4640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class25_Sub1_Sub1_Sub1 arg2) {
		if (arg2.anInt2333 == arg0 && arg0 != -1) {
			@Pc(80) Class185 local80 = Static25.aClass67_1.method1227(arg0);
			@Pc(83) int local83 = local80.anInt4802;
			if (local83 == 1) {
				arg2.anInt2354 = 0;
				arg2.anInt2323 = arg1;
				arg2.anInt2322 = 0;
				arg2.anInt2325 = 1;
				arg2.anInt2359 = 0;
				Static4.method52(arg2.anInt2322, arg2.anInt6080, arg2 == Static321.aClass25_Sub1_Sub1_Sub1_2, arg2.aByte70, local80, arg2.anInt6077);
			}
			if (local83 == 2) {
				arg2.anInt2359 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt2333 == -1 || Static25.aClass67_1.method1227(arg0).anInt4805 >= Static25.aClass67_1.method1227(arg2.anInt2333).anInt4805) {
			arg2.anInt2354 = 0;
			arg2.anInt2322 = 0;
			arg2.anInt2323 = arg1;
			arg2.anInt2379 = arg2.anInt2381;
			arg2.anInt2359 = 0;
			arg2.anInt2333 = arg0;
			arg2.anInt2325 = 1;
			if (arg2.anInt2333 != -1) {
				Static4.method52(arg2.anInt2322, arg2.anInt6080, Static321.aClass25_Sub1_Sub1_Sub1_2 == arg2, arg2.aByte70, Static25.aClass67_1.method1227(arg2.anInt2333), arg2.anInt6077);
			}
		}
	}
}
