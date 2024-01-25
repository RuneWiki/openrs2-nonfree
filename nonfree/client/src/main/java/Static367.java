import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!pca", name = "G", descriptor = "I")
	public static int anInt6638;

	@OriginalMember(owner = "client!pca", name = "D", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_343 = new Class305(20, 0);

	@OriginalMember(owner = "client!pca", name = "F", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_344 = new Class305(24, 0);

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(III)V")
	public static void method5955(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static270.aClass96_10.method2370(Static544.aClass45_115.method1474(Static544.anInt7853));
		@Pc(29) int local29;
		for (@Pc(18) Class1_Sub25 local18 = (Class1_Sub25) Static105.aClass295_10.method7543(); local18 != null; local18 = (Class1_Sub25) Static105.aClass295_10.method7540()) {
			local29 = Static250.method4430(local18);
			if (local29 > local13) {
				local13 = local29;
			}
		}
		local13 += 8;
		local29 = Static197.anInt4015 * 16 + 21;
		@Pc(61) int local61 = arg1 - local13 / 2;
		if (local61 + local13 > Static70.anInt1753) {
			local61 = Static70.anInt1753 - local13;
		}
		if (local61 < 0) {
			local61 = 0;
		}
		@Pc(84) int local84 = arg0;
		if (Static508.anInt8910 < local29 + arg0) {
			local84 = Static508.anInt8910 - local29;
		}
		if (local84 < 0) {
			local84 = 0;
		}
		Static513.anInt9093 = local61;
		Static336.anInt6244 = Static197.anInt4015 * 16 + (Static242.aBoolean356 ? 26 : 22);
		Static324.anInt6120 = local13;
		Static238.aBoolean354 = true;
		Static276.anInt8648 = local84;
	}

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "(B)V")
	public static void method5956() {
		Static461.aClass277_67.method7019();
	}
}
