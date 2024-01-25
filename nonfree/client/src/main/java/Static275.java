import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_70 = new Class218(22, -2);

	@OriginalMember(owner = "client!jv", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString60 = null;

	@OriginalMember(owner = "client!jv", name = "p", descriptor = "[I")
	public static int[] anIntArray340 = new int[4];

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "([BI)V")
	public static void method4944(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class3_Sub15 local10 = new Class3_Sub15(arg0);
		@Pc(16) boolean local16 = false;
		while (true) {
			while (true) {
				@Pc(20) int local20 = local10.method8401();
				if (local20 == 0) {
					if (local16) {
						return;
					}
					if (Static152.anIntArray203 == null) {
						Static191.anIntArray241 = new int[4];
						Static152.anIntArray203 = new int[4];
						Static445.anInt8058 = 4;
					}
					for (local20 = 0; local20 < Static152.anIntArray203.length; local20++) {
						Static152.anIntArray203[local20] = 0;
						Static191.anIntArray241[local20] = local20 * 20;
					}
					return;
				}
				if (local20 == 1) {
					if (Static152.anIntArray203 == null) {
						Static152.anIntArray203 = new int[4];
						Static191.anIntArray241 = new int[4];
						Static445.anInt8058 = 4;
					}
					for (@Pc(66) int local66 = 0; local66 < Static152.anIntArray203.length; local66++) {
						Static152.anIntArray203[local66] = local10.method8444();
						Static191.anIntArray241[local66] = local10.method8444();
					}
					local16 = true;
				} else if (local20 == 2) {
					Static130.anInt3199 = local10.method8414();
				} else if (local20 == 3) {
					Static445.anInt8058 = local10.method8401();
					Static191.anIntArray241 = new int[Static445.anInt8058];
					Static152.anIntArray203 = new int[Static445.anInt8058];
				}
			}
		}
	}
}
