import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!of", name = "t", descriptor = "Ljava/lang/Object;")
	public static Object anObject17;

	@OriginalMember(owner = "client!of", name = "s", descriptor = "Lclient!dja;")
	public static final Class80 aClass80_9 = new Class80("game3", "Game 3", 2);

	@OriginalMember(owner = "client!of", name = "n", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_178 = new Class251(43, 3);

	@OriginalMember(owner = "client!of", name = "r", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_193 = new Class160(116, 6);

	@OriginalMember(owner = "client!of", name = "w", descriptor = "[I")
	public static final int[] anIntArray387 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IZ)V")
	public static void method6480(@OriginalArg(1) boolean arg0) {
		Static599.method8480();
		if (!Static111.method1779(Static387.anInt9114)) {
			return;
		}
		@Pc(15) Class347[] local15 = Static277.aClass347Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(22) Class347 local22 = local15[local17];
			local22.anInt9632++;
			if (local22.anInt9632 < 50 && !arg0) {
				return;
			}
			local22.anInt9632 = 0;
			if (!local22.aBoolean662 && local22.aClass278_2 != null) {
				@Pc(61) Class14_Sub54 local61 = Static72.method1195(local22.aClass197_2, Static117.aClass251_66);
				local22.method8308(local61);
				try {
					local22.method8303();
				} catch (@Pc(70) IOException local70) {
					local22.aBoolean662 = true;
				}
			}
		}
		Static599.method8480();
	}
}
