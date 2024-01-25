import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "Lclient!on;")
	public static Class60 aClass60_2;

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "[I")
	public static final int[] anIntArray42 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "Z")
	public static boolean aBoolean33 = false;

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "[I")
	public static int[] anIntArray43 = new int[2];

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII)V")
	public static void method594(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static77.anInt1698; local3++) {
			@Pc(9) Rectangle local9 = Class11_Sub1_Sub2.aRectangleArray2[local3];
			if (arg1 < local9.width + local9.x && arg1 + arg2 > local9.x && arg0 < local9.y + local9.height && arg3 + arg0 > local9.y) {
				Static149.aBooleanArray16[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIZLclient!ct;B)V")
	public static void method597(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Class30 arg2) {
		Static192.anInt3868 = arg1;
		Static310.anInt5974 = 1;
		Static162.aBoolean224 = false;
		Static149.anInt3140 = arg0;
		Static286.anInt5851 = 0;
		Class11_Sub2_Sub3.lb = arg2;
		Static61.anInt1495 = 2;
	}
}
