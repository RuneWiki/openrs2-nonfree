import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString128 = " is already on your friend list.";

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)I")
	public static int method3246() {
		return ((Static62.anInt1130 == 0 ? 0 : 1) << 21) + ((Static252.anInt4702 == 0 ? 0 : 1) << 20) + ((Static314.aBoolean195 ? 1 : 0) << 19) + (Static163.anInt3087 << 17) + ((Static334.aBoolean407 ? 1 : 0) << 16) + ((Static29.anInt564 & 0x7) - -((Static43.aBoolean72 ? 1 : 0) << 3)) + ((Static14.aBoolean22 ? 1 : 0) << 4) + ((Static293.aBoolean382 ? 1 : 0) << 5) + ((Static61.aBoolean81 ? 1 : 0) << 6) + ((Static349.aBoolean421 ? 1 : 0) << 8) + ((Static119.aBoolean190 ? 1 : 0) << 9) + ((Static196.aBoolean281 ? 1 : 0) << 10) + ((Static282.anInt5340 & 0x3) << 11) + ((Static194.aBoolean277 ? 1 : 0) << 13) + ((Static20.aBoolean26 ? 1 : 0) << 15) + ((Static243.anInt4564 == 0 ? 0 : 1) << 22) + (Static311.method5288() << 23) + (Static172.anInt3235 << 25) + ((Static354.aBoolean428 ? 1 : 0) << 27) + (Static213.anInt3920 << 28);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIBII)V")
	public static void method3247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static25.anInt504; local3++) {
			@Pc(17) Rectangle local17 = Class44.aRectangleArray21[local3];
			if (arg2 < local17.x + local17.width && arg2 + arg3 > local17.x && local17.height + local17.y > arg1 && local17.y < arg1 + arg0) {
				Static120.aBooleanArray20[local3] = true;
			}
		}
	}
}
