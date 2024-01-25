import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Lclient!fda;")
	public static final Class112 aClass112_15 = new Class112();

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "[I")
	public static final int[] anIntArray425 = new int[200];

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
	public static int anInt7601 = 0;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZI)V")
	public static void method6478(@OriginalArg(0) boolean arg0) {
		@Pc(5) int local5 = Static629.anInt10056;
		@Pc(13) int local13 = Static269.anInt4246;
		if (arg0 && Static426.aBoolean555) {
			local5 <<= 0x1;
			local13 = -local5;
		}
		Static563.aClass143_13.f(local13, local5);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method6479(@OriginalArg(0) String arg0) {
		return Static360.method5294(arg0, jia.class);
	}
}
