import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
	public static int anInt3101;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
	public static int anInt3102;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "[I")
	public static int[] anIntArray232 = new int[2];

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!bea;BII)V")
	public static void method2812(@OriginalArg(0) Class30_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0.anInt4138 && arg2 != -1) {
			@Pc(25) Class64 local25 = Static47.aClass41_1.method911(arg2);
			@Pc(28) int local28 = local25.anInt1972;
			if (local28 == 1) {
				arg0.anInt4189 = 0;
				arg0.anInt4178 = arg1;
				arg0.anInt4142 = 0;
				arg0.anInt4188 = 1;
				arg0.anInt4164 = 0;
				Static349.method5479(arg0.anInt9416, arg0.aByte99, Static440.aClass30_Sub1_Sub1_Sub1_2 == arg0, arg0.anInt4142, local25, arg0.anInt9418);
			}
			if (local28 == 2) {
				arg0.anInt4189 = 0;
				return;
			}
		} else if (arg2 == -1 || arg0.anInt4138 == -1 || Static47.aClass41_1.method911(arg2).anInt1968 >= Static47.aClass41_1.method911(arg0.anInt4138).anInt1968) {
			arg0.anInt4203 = arg0.anInt4201;
			arg0.anInt4164 = 0;
			arg0.anInt4178 = arg1;
			arg0.anInt4142 = 0;
			arg0.anInt4138 = arg2;
			arg0.anInt4188 = 1;
			arg0.anInt4189 = 0;
			if (arg0.anInt4138 == -1) {
				return;
			}
			Static349.method5479(arg0.anInt9416, arg0.aByte99, arg0 == Static440.aClass30_Sub1_Sub1_Sub1_2, arg0.anInt4142, Static47.aClass41_1.method911(arg0.anInt4138), arg0.anInt9418);
		}
	}
}
