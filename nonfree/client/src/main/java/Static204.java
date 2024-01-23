import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "[I")
	public static int[] anIntArray370;

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
	public static int anInt4137;

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
	public static int anInt4141;

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)Lclient!kn;")
	public static Class1_Sub2_Sub11_Sub2 method3285() {
		@Pc(9) int local9 = Static31.anIntArray78[0] * Static44.anIntArray97[0];
		@Pc(13) byte[] local13 = Static268.aByteArrayArray13[0];
		@Pc(26) int[] local26 = new int[local9];
		for (@Pc(28) int local28 = 0; local28 < local9; local28++) {
			local26[local28] = Static133.anIntArray266[local13[local28] & 0xFF];
		}
		@Pc(67) Class1_Sub2_Sub11_Sub2 local67 = new Class1_Sub2_Sub11_Sub2(Static60.anInt1268, Static267.anInt5199, Static268.anIntArray461[0], Static289.anIntArray543[0], Static31.anIntArray78[0], Static44.anIntArray97[0], local26);
		Static91.method1595();
		return local67;
	}
}
