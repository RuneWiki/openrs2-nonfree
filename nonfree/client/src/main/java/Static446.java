import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!sh", name = "A", descriptor = "Ljava/awt/Image;")
	public static Image anImage2;

	@OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
	public static int anInt7823 = -1;

	@OriginalMember(owner = "client!sh", name = "x", descriptor = "[I")
	public static final int[] anIntArray726 = new int[4];

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIII)V")
	public static void method6922(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static230.anInt4474 = arg2;
		Static526.anInt9307 = arg1;
		Static387.anInt6848 = arg0;
		Static113.anInt2324 = arg3;
		Static28.anInt771 = arg4;
		if (Static230.anInt4474 >= 100) {
			@Pc(27) int local27 = Static526.anInt9307 * 128 + 64;
			@Pc(33) int local33 = Static28.anInt771 * 128 + 64;
			@Pc(43) int local43 = Static508.method7754(local33, local27, Static322.anInt6113) - Static113.anInt2324;
			@Pc(48) int local48 = local27 - Static321.anInt6064;
			@Pc(53) int local53 = local43 - Static276.anInt8653;
			@Pc(58) int local58 = local33 - Static46.anInt1256;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local48 * local48 + local58 * local58));
			Static536.anInt9434 = (int) (Math.atan2((double) local53, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static469.anInt8096 = (int) (Math.atan2((double) local48, (double) local58) * -2607.5945876176133D) & 0x3FFF;
			if (Static536.anInt9434 < 1024) {
				Static536.anInt9434 = 1024;
			}
			Static505.anInt6155 = 0;
			if (Static536.anInt9434 > 3072) {
				Static536.anInt9434 = 3072;
			}
		}
		Static170.anInt3418 = 2;
	}
}
