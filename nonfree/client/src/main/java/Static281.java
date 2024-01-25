import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
	public static int anInt4446;

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
	public static int anInt4448;

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "[S")
	public static final short[] aShortArray77 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
	public static int anInt4445 = 0;

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "S")
	public static short aShort63 = 256;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString39 = "";

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
	public static void method3560() {
		for (@Pc(15) Class2_Sub35 local15 = (Class2_Sub35) Static93.aClass181_7.method3972(); local15 != null; local15 = (Class2_Sub35) Static93.aClass181_7.method3975()) {
			if (Static129.method2041(local15.anInt5875)) {
				Static193.method2764(local15);
			}
		}
		if (Static377.anInt6585 == 1) {
			Static428.method5827();
			return;
		}
		Static437.method5911(Static204.anInt3495, Static168.anInt6340, Static407.anInt7040, anInt4448);
		@Pc(56) int local56 = Static9.aClass15_9.method320(Static14.aClass231_7.method5261(Static80.anInt6195));
		for (@Pc(61) Class2_Sub35 local61 = (Class2_Sub35) Static93.aClass181_7.method3972(); local61 != null; local61 = (Class2_Sub35) Static93.aClass181_7.method3975()) {
			@Pc(67) int local67 = Static287.method4059(local61);
			if (local56 < local67) {
				local56 = local67;
			}
		}
		Static204.anInt3495 = local56 + 8;
		Static407.anInt7040 = (Static237.aBoolean264 ? 26 : 22) + Static377.anInt6585 * 16;
	}
}
