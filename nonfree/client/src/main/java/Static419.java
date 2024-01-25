import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static419 {

	@OriginalMember(owner = "client!v", name = "P", descriptor = "Lclient!bu;")
	public static Class32 aClass32_84;

	@OriginalMember(owner = "client!v", name = "R", descriptor = "[[B")
	public static byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!v", name = "J", descriptor = "I")
	public static int anInt6868 = -1;

	@OriginalMember(owner = "client!v", name = "K", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_226 = new Class189("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!v", name = "O", descriptor = "Lclient!fi;")
	public static final Class77 aClass77_4 = new Class77(1);

	@OriginalMember(owner = "client!v", name = "U", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_149 = new Class119(82, 0);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIZI)V")
	public static void method5367(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static105.anInt2382 == 0) {
			Static210.method3247(false);
		} else {
			Static167.anInt3389 = Static105.anInt2382;
			Static111.method1883(0);
		}
		Static116.anInt5392 = arg0;
		Static169.anInt5823 = arg1;
		Static60.aBoolean127 = arg2;
		Static144.method4257(arg3);
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(B)V")
	public static void method5368() {
		Static209.aClass126_24.method3135();
	}
}
