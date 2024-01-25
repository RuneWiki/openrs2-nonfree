import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_179 = new Class184(101, -1);

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Z")
	public static boolean aBoolean370 = false;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static320.method4653(arg0, arg1) || Static64.method1273(arg1, arg0);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!eo;)Z")
	public static boolean method3992(@OriginalArg(1) Class68 arg0) {
		if (arg0.anInt2211 == Static444.anInt7528) {
			Static233.anInt4493 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
	public static void method3993() {
		if (!Static242.aBoolean351) {
			return;
		}
		while (true) {
			while (Static309.anInt5632 < Static279.aClass145_Sub1Array9.length) {
				@Pc(21) Class145_Sub1 local21 = Static279.aClass145_Sub1Array9[Static309.anInt5632];
				if (local21 != null && local21.anInt4488 == -1) {
					if (Static119.aClass3_Sub43_1 == null) {
						Static119.aClass3_Sub43_1 = Static159.aClass66_1.method1634(local21.aString44);
					}
					@Pc(44) int local44 = Static119.aClass3_Sub43_1.anInt7106;
					if (local44 == -1) {
						return;
					}
					Static119.aClass3_Sub43_1 = null;
					local21.anInt4488 = local44;
					Static309.anInt5632++;
				} else {
					Static309.anInt5632++;
				}
			}
			return;
		}
	}
}
