import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "Lclient!uq;")
	public static Class134_Sub1 aClass134_Sub1_2;

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "Z")
	public static boolean aBoolean242;

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "J")
	public static long aLong110 = 0L;

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "Lclient!mq;")
	public static final Class154 aClass154_24 = new Class154(4);

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
	public static void method3054() {
		for (@Pc(10) Class2_Sub22 local10 = (Class2_Sub22) Static230.aClass210_30.method5035(); local10 != null; local10 = (Class2_Sub22) Static230.aClass210_30.method5037()) {
			if (local10.anInt3083 > 0) {
				local10.anInt3083--;
			}
			if (local10.anInt3083 != 0) {
				if (local10.anInt3077 > 0) {
					local10.anInt3077--;
				}
				if (local10.anInt3077 == 0 && local10.anInt3082 >= 1 && local10.anInt3087 >= 1 && local10.anInt3082 <= Static392.anInt6751 - 2 && Static307.anInt5484 - 2 >= local10.anInt3087 && (local10.anInt3085 < 0 || Static143.method2455(local10.anInt3085, local10.anInt3093))) {
					Static165.method2698(local10.anInt3082, local10.anInt3089, local10.anInt3093, local10.anInt3085, local10.anInt3078, local10.anInt3087, -1, local10.anInt3088);
					local10.anInt3077 = -1;
					if (local10.anInt3085 == local10.anInt3080 && local10.anInt3080 == -1) {
						local10.method5745();
					} else if (local10.anInt3085 == local10.anInt3080 && local10.anInt3078 == local10.anInt3092 && local10.anInt3091 == local10.anInt3093) {
						local10.method5745();
					}
				}
			} else if (local10.anInt3080 < 0 || Static143.method2455(local10.anInt3080, local10.anInt3091)) {
				Static165.method2698(local10.anInt3082, local10.anInt3089, local10.anInt3091, local10.anInt3080, local10.anInt3092, local10.anInt3087, -1, local10.anInt3088);
				local10.method5745();
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)I")
	public static int method3057() {
		return Static344.anInt6324;
	}
}
