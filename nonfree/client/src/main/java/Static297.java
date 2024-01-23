import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!wl", name = "Q", descriptor = "Lclient!o;")
	public static Class116 aClass116_8;

	@OriginalMember(owner = "client!wl", name = "R", descriptor = "I")
	public static int anInt5618;

	@OriginalMember(owner = "client!wl", name = "P", descriptor = "Lclient!fm;")
	public static Class49 aClass49_13 = new Class49(64);

	@OriginalMember(owner = "client!wl", name = "S", descriptor = "Z")
	public static boolean aBoolean452 = false;

	@OriginalMember(owner = "client!wl", name = "T", descriptor = "Z")
	public static boolean aBoolean453 = false;

	@OriginalMember(owner = "client!wl", name = "U", descriptor = "I")
	public static int anInt5619 = 0;

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "(B)V")
	public static void method4458() {
		for (@Pc(3) int local3 = 0; local3 < Static1.anInt4241; local3++) {
			@Pc(14) int local14 = Static226.anIntArray399[local3];
			@Pc(18) Class14_Sub2_Sub1 local18 = Static98.aClass14_Sub2_Sub1Array1[local14];
			@Pc(22) int local22 = Static187.aClass1_Sub11_Sub1_2.method2690();
			if ((local22 & 0x40) != 0) {
				local22 += Static187.aClass1_Sub11_Sub1_2.method2690() << 8;
			}
			Static183.method3508(local14, local22, local18);
		}
	}
}
