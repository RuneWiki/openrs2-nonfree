import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!bq", name = "I", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_12 = new Class171(108, 4);

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/io/File;I)[B")
	public static byte[] method1067(@OriginalArg(0) File arg0) {
		return Static290.method4177(arg0, (int) arg0.length());
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(III)V")
	public static void method1069(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static565.aClass95_13 == null) {
			return;
		}
		@Pc(10) int local10 = Static620.anInt10280;
		@Pc(12) int local12 = Static358.anInt6116;
		Static600.method7967(arg0, arg1);
		if (Static471.anInt7481 == 0) {
			Static491.anInterface10_1 = null;
			Static491.anInterface10_1 = Static565.aClass95_13.method8004(Static565.aClass95_13.method8030(Static233.anInt4125, Static320.anInt5358), Static565.aClass95_13.method7987(Static233.anInt4125, Static320.anInt5358));
		} else if (Static471.anInt7481 == 1 && (Static354.anInterface10Array1 == null || local10 != Static620.anInt10280 || Static358.anInt6116 != local12)) {
			Static354.anInterface10Array1 = new Interface10[Static620.anInt10280 * Static358.anInt6116];
			for (@Pc(65) int local65 = 0; local65 < Static354.anInterface10Array1.length; local65++) {
				Static354.anInterface10Array1[local65] = Static565.aClass95_13.method8004(Static565.aClass95_13.method8030(Static141.anInt2656, Static456.anInt7325), Static565.aClass95_13.method7987(Static141.anInt2656, Static456.anInt7325));
			}
			Static170.anInt3112 = 1;
			Static42.anIntArray52 = new int[Static358.anInt6116 * Static620.anInt10280];
		}
		Static182.aBoolean246 = true;
	}
}
