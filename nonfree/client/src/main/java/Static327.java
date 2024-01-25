import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!ur", name = "D", descriptor = "[I")
	public static int[] anIntArray527;

	@OriginalMember(owner = "client!ur", name = "P", descriptor = "I")
	public static int anInt6306;

	@OriginalMember(owner = "client!ur", name = "w", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_59 = new Class198(64);

	@OriginalMember(owner = "client!ur", name = "G", descriptor = "Z")
	public static boolean aBoolean429 = true;

	@OriginalMember(owner = "client!ur", name = "L", descriptor = "I")
	public static int anInt6302 = 0;

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "(I)V")
	public static void method5346() {
		for (@Pc(12) Class3_Sub42 local12 = (Class3_Sub42) Static83.aClass127_3.method3402(); local12 != null; local12 = (Class3_Sub42) Static83.aClass127_3.method3400()) {
			if (local12.anInt6536 > 0) {
				local12.anInt6536--;
			}
			if (local12.anInt6536 != 0) {
				if (local12.anInt6545 > 0) {
					local12.anInt6545--;
				}
				if (local12.anInt6545 == 0 && local12.anInt6544 >= 1 && local12.anInt6546 >= 1 && Static162.anInt2152 - 2 >= local12.anInt6544 && local12.anInt6546 <= Static122.anInt2632 - 2 && (local12.anInt6541 < 0 || Static353.method5712(local12.anInt6543, local12.anInt6541))) {
					Static306.method5115(local12.anInt6541, local12.anInt6539, local12.anInt6549, local12.anInt6538, -1, local12.anInt6546, local12.anInt6544, local12.anInt6543);
					local12.anInt6545 = -1;
					if (local12.anInt6541 == local12.anInt6548 && local12.anInt6548 == -1) {
						local12.method5717();
					} else if (local12.anInt6548 == local12.anInt6541 && local12.anInt6551 == local12.anInt6549 && local12.anInt6543 == local12.anInt6547) {
						local12.method5717();
					}
				}
			} else if (local12.anInt6548 < 0 || Static353.method5712(local12.anInt6547, local12.anInt6548)) {
				Static306.method5115(local12.anInt6548, local12.anInt6539, local12.anInt6551, local12.anInt6538, -1, local12.anInt6546, local12.anInt6544, local12.anInt6547);
				local12.method5717();
			}
		}
	}
}
