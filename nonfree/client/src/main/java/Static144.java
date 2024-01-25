import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
	public static int anInt2671;

	@OriginalMember(owner = "client!ej", name = "F", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_24 = new Class144(85, 3);

	@OriginalMember(owner = "client!ej", name = "x", descriptor = "[I")
	public static final int[] anIntArray167 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!hla;Z)V")
	public static void method2454(@OriginalArg(0) Class3_Sub7_Sub10 arg0) {
		if (Static530.aBoolean556) {
			return;
		}
		arg0.method9596();
		Static716.anInt11158--;
		if (!arg0.aBoolean243) {
			@Pc(95) long local95 = arg0.aLong144;
			@Pc(101) Class3_Sub7_Sub5 local101;
			for (local101 = (Class3_Sub7_Sub5) Static158.aClass313_15.method7104(local95); local101 != null && !local101.aString40.equals(arg0.aString58); local101 = (Class3_Sub7_Sub5) Static158.aClass313_15.method7106()) {
			}
			if (local101 != null && local101.method2137(arg0)) {
				Static727.method9600(local101);
			}
			return;
		}
		for (@Pc(24) Class3_Sub7_Sub5 local24 = (Class3_Sub7_Sub5) Static242.aClass147_2.method3334(); local24 != null; local24 = (Class3_Sub7_Sub5) Static242.aClass147_2.method3332()) {
			if (local24.aString40.equals(arg0.aString58)) {
				@Pc(36) boolean local36 = false;
				for (@Pc(42) Class3_Sub7_Sub10 local42 = (Class3_Sub7_Sub10) local24.aClass147_1.method3334(); local42 != null; local42 = (Class3_Sub7_Sub10) local24.aClass147_1.method3332()) {
					if (arg0 == local42) {
						local36 = true;
						if (local24.method2137(arg0)) {
							Static727.method9600(local24);
						}
						break;
					}
				}
				if (local36) {
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BZII)V")
	public static void method2456(@OriginalArg(1) boolean arg0) {
		if (22050 > 48000) {
			throw new IllegalArgumentException();
		}
		Static330.aBoolean659 = arg0;
		Static330.anInt9773 = 22050;
		Static553.anInt8496 = 2;
	}
}
