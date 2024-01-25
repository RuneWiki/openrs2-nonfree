import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "Z")
	public static boolean aBoolean583;

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[8];

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_156 = new Class151(37, -1);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	public static void method6470() {
		Static665.aClass92_9 = null;
		Static131.anIntArray159 = null;
		Static494.anInt7907 = -1;
		Static491.aClass92_8 = null;
		Static417.anInterface18_1 = null;
		Static151.anInterface18Array1 = null;
		Static633.anInt9789 = -1;
		Static106.anInt2134 = -1;
		Static46.aClass92_1 = null;
		Static340.aClass33_9 = null;
		Static423.anInt6689 = -1;
		Static395.aClass223_2.method4810();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!es;I)V")
	public static void method6476(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static165.aClass252_4 != null) {
			@Pc(25) int local25;
			try {
				Static165.aClass252_4.method5153(0L);
				Static165.aClass252_4.method5154(local13);
				for (local25 = 0; local25 < 24 && local13[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(45) Exception local45) {
				for (local25 = 0; local25 < 24; local25++) {
					local13[local25] = -1;
				}
			}
		}
		arg0.method8824(local13, 24, 0);
	}
}
