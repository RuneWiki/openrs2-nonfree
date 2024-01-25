import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static43 {

	@OriginalMember(owner = "client!bha", name = "l", descriptor = "Lclient!ma;")
	public static Class228 aClass228_1;

	@OriginalMember(owner = "client!bha", name = "w", descriptor = "I")
	public static int anInt695 = 0;

	@OriginalMember(owner = "client!bha", name = "q", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_25 = new Class251(66, 8);

	@OriginalMember(owner = "client!bha", name = "x", descriptor = "[I")
	public static final int[] anIntArray35 = new int[2048];

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(III)Z")
	public static boolean method710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bha", name = "c", descriptor = "(B)[Lclient!kka;")
	public static Class205[] method711() {
		return new Class205[] { Static591.aClass205_17, Static1.aClass205_12, Static272.aClass205_15 };
	}
}
