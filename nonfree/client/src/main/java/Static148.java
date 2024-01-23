import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!kl", name = "Y", descriptor = "I")
	public static int anInt2920;

	@OriginalMember(owner = "client!kl", name = "Z", descriptor = "Lclient!ic;")
	public static Class85 aClass85_13 = new Class85(8);

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)V")
	public static void method2366() {
		Static287.aClass26_55.method515();
		Static210.aClass26_41.method515();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "()V")
	public static void method2367() {
		for (@Pc(1) int local1 = 0; local1 < Static139.anInt2661; local1++) {
			@Pc(8) Class33 local8 = Static171.aClass33Array2[local1];
			Static122.method1903(local8);
			Static171.aClass33Array2[local1] = null;
		}
		Static139.anInt2661 = 0;
	}

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "(B)Z")
	public static boolean method2368() {
		@Pc(15) Class164 local15 = Static275.aClass164_1;
		synchronized (Static275.aClass164_1) {
			if (Static278.anInt5312 == Static223.anInt4305) {
				return false;
			} else {
				Static54.anInt1042 = Static80.anIntArray125[Static223.anInt4305];
				Static265.aChar4 = Static212.aCharArray2[Static223.anInt4305];
				Static223.anInt4305 = Static223.anInt4305 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILclient!fh;Lclient!fh;)V")
	public static void method2369(@OriginalArg(1) Class58 arg0, @OriginalArg(2) Class58 arg1) {
		Static250.aClass58_89 = arg0;
		Static138.aClass58_64 = arg1;
	}
}
