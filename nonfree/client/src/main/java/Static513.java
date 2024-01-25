import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!ria", name = "b", descriptor = "Lclient!wv;")
	public static Class395 aClass395_3;

	@OriginalMember(owner = "client!ria", name = "f", descriptor = "I")
	public static int anInt8561;

	@OriginalMember(owner = "client!ria", name = "g", descriptor = "I")
	public static int anInt8562;

	@OriginalMember(owner = "client!ria", name = "e", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_79 = new Class305(61, 1);

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)Z")
	public static boolean method7299() {
		return Static278.method4508("jaclib") ? Static278.method4508("hw3d") : false;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!el;[[BI)V")
	public static void method7300(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int local12 = Static457.aByteArrayArray25.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(20) byte[] local20 = arg1[local14];
			if (local20 != null) {
				@Pc(33) int local33 = (Static611.anIntArray552[local14] >> 8) * 64 - Static153.anInt3147;
				@Pc(44) int local44 = (Static611.anIntArray552[local14] & 0xFF) * 64 - Static201.anInt3839;
				Static250.method3863();
				arg0.method2592(Static275.aClass106Array1, local33, local44, Static208.aClass65_7, local20);
			}
		}
	}

	@OriginalMember(owner = "client!ria", name = "b", descriptor = "(I)V")
	public static void method7301() {
		Static290.anInt5662 = -1;
		Static54.anInt802 = -1;
		Static595.anInt9783 = 0;
		Static680.anInt10897 = -1;
	}
}
