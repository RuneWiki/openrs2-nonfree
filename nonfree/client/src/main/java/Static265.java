import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
	public static int anInt3619;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "Ljava/lang/Object;")
	public static Object anObject8;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
	public static int anInt3617 = 999999;

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "Z")
	public static boolean aBoolean260 = false;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "Z")
	public static boolean aBoolean261 = false;

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
	public static void method3201() throws IOException {
		if (Static97.aClass29_1 == null || Static299.anInt5830 <= 0) {
			return;
		}
		Static223.aClass6_Sub40_3.anInt10169 = 0;
		while (true) {
			@Pc(27) Class6_Sub9 local27 = (Class6_Sub9) Static324.aClass8_31.method149();
			if (local27 == null || local27.anInt1708 > Static223.aClass6_Sub40_3.aByteArray113.length - Static223.aClass6_Sub40_3.anInt10169) {
				Static97.aClass29_1.method4605(Static223.aClass6_Sub40_3.aByteArray113, Static223.aClass6_Sub40_3.anInt10169);
				Static475.anInt8297 = 0;
				Static247.anInt4940 += Static223.aClass6_Sub40_3.anInt10169;
				return;
			}
			Static223.aClass6_Sub40_3.method8562(0, local27.aClass6_Sub40_Sub2_1.aByteArray113, local27.anInt1708);
			Static299.anInt5830 -= local27.anInt1708;
			local27.method9043();
			local27.aClass6_Sub40_Sub2_1.method8574();
			local27.method1427();
		}
	}
}
