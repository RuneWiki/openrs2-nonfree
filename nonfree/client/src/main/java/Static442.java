import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	public static int anInt7488;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
	public static void method5816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static374.aClass20_Sub1_1.anInt2360 != 0 && arg3 != 0 && Static319.anInt1933 < 50 && arg2 != -1) {
			Static25.aClass219Array1[Static319.anInt1933++] = new Class219((byte) 1, arg2, arg3, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!gi;FIFIFIFIFIB[B)V")
	public static void method5820(@OriginalArg(0) Class89 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(7) float arg5, @OriginalArg(9) float arg6, @OriginalArg(12) byte[] arg7) {
		for (@Pc(6) int local6 = 0; local6 < 16; local6++) {
			Static360.method4755(local6, arg6, arg4, arg0, arg3, arg5, arg7, arg2, arg1);
			arg2 += 16384;
		}
	}
}
