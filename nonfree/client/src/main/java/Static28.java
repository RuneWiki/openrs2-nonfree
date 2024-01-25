import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "[I")
	public static int[] anIntArray18;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method395(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
	public static void method397() {
		if (!Static618.aBoolean481) {
			return;
		}
		while (true) {
			while (Static208.anInt3615 < Static372.aClass256_Sub1Array1.length) {
				@Pc(32) Class256_Sub1 local32 = Static372.aClass256_Sub1Array1[Static208.anInt3615];
				if (local32 != null && local32.anInt7713 == -1) {
					if (Static430.aClass3_Sub46_1 == null) {
						Static430.aClass3_Sub46_1 = Static371.aClass383_1.method8940(local32.aString106);
					}
					@Pc(62) int local62 = Static430.aClass3_Sub46_1.anInt9328;
					if (local62 == -1) {
						return;
					}
					local32.anInt7713 = local62;
					Static208.anInt3615++;
					Static430.aClass3_Sub46_1 = null;
				} else {
					Static208.anInt3615++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IB)Z")
	public static boolean method398(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}
}
