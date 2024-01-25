import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "Lclient!bj;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "[I")
	public static int[] anIntArray130;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "Lclient!rb;")
	public static final Class245 aClass245_8 = new Class245(4, 1, 1, 1);

	@OriginalMember(owner = "client!db", name = "f", descriptor = "I")
	public static int anInt1645 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)Z")
	public static boolean method1566(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!ps;B)V")
	public static void method1567(@OriginalArg(0) Class2_Sub29 arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static12.anInt263; local5++) {
			@Pc(12) int local12 = arg0.method5182();
			@Pc(16) int local16 = arg0.method5229();
			if (local16 == 65535) {
				local16 = -1;
			}
			if (Static365.aClass178_Sub1Array1[local12] != null) {
				Static365.aClass178_Sub1Array1[local12].anInt5251 = local16;
			}
		}
	}
}
