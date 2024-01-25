import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_12 = new Class208(40, -1);

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "[I")
	public static final int[] anIntArray110 = new int[250];

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
	public static void method1292() {
		Static426.anInt7764 = 0;
		Static14.anInt268 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static316.anInt6064; local16++) {
			@Pc(22) int local22 = Static406.anInt7520 * local16;
			for (@Pc(24) int local24 = 0; local24 < Static406.anInt7520; local24++) {
				@Pc(30) int local30 = local22 + local24;
				Static363.anInterface20Array1[local30].method8647(local24 * Static345.anInt6515, Static11.anInt221 * local16, Static345.anInt6515, Static11.anInt221, true);
			}
		}
	}
}
