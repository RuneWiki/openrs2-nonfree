import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
	public static int anInt7851;

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_111 = new Class376(22, 3);

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(B)V")
	public static void method6587() {
		Static638.anInt9840 = 0;
		Static125.anInt2416 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static653.anInt10053; local16++) {
			@Pc(22) int local22 = local16 * Static67.anInt9115;
			for (@Pc(24) int local24 = 0; local24 < Static67.anInt9115; local24++) {
				@Pc(30) int local30 = local24 + local22;
				Static560.anInterface8Array1[local30].method8722(local24 * Static552.anInt8938, Static502.anInt8445 * local16, Static552.anInt8938, Static502.anInt8445, true);
			}
		}
	}
}
