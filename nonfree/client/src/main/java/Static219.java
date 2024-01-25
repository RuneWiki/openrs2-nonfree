import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
	public static int anInt4373 = -1;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!qi;IZII)V")
	public static void method3870(@OriginalArg(1) Class170 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static235.anInt4675 >= 50 || (arg0 == null || arg0.anIntArrayArray44 == null || arg3 >= arg0.anIntArrayArray44.length || arg0.anIntArrayArray44[arg3] == null)) {
			return;
		}
		@Pc(34) int local34 = arg0.anIntArrayArray44[arg3][0];
		@Pc(44) int local44 = local34 >> 8;
		@Pc(50) int local50 = local34 >> 5 & 0x7;
		@Pc(69) int local69;
		if (arg0.anIntArrayArray44[arg3].length > 1) {
			local69 = (int) ((double) arg0.anIntArrayArray44[arg3].length * Math.random());
			if (local69 > 0) {
				local44 = arg0.anIntArrayArray44[arg3][local69];
			}
		}
		@Pc(85) int local85 = local34 & 0x1F;
		if (local85 == 0) {
			if (arg2) {
				Static72.method1408(local50, 255, 0, local44);
			}
		} else if (Static165.anInt3445 != 0) {
			Static51.anIntArray205[Static235.anInt4675] = local44;
			Static23.anIntArray726[Static235.anInt4675] = local50;
			Static32.anIntArray133[Static235.anInt4675] = 0;
			Static105.aClass68Array3[Static235.anInt4675] = null;
			Static105.anIntArray754[Static235.anInt4675] = 255;
			local69 = (arg4 - 64) / 128;
			@Pc(137) int local137 = (arg1 - 64) / 128;
			Static138.anIntArray397[Static235.anInt4675] = (local137 << 8) + ((local69 << 16) + local85);
			Static235.anInt4675++;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!pg;Lclient!bd;Ljava/awt/Canvas;II)Lclient!pe;")
	public static Class89 method3871(@OriginalArg(0) int arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) Canvas arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			if (!Static339.aBooleanArray29[local7]) {
				Static339.aBooleanArray29[local7] = true;
				local5 = local7;
				break;
			}
		}
		if (local5 == -1) {
			throw new IllegalStateException("No free toolkit instances");
		} else if (arg4 == 0) {
			return Static154.method2993(local5, arg3, arg1);
		} else if (arg4 == 1) {
			return Static44.method982(arg1, arg0, arg3, arg2, local5);
		} else {
			throw new IllegalArgumentException("Unsupported mode");
		}
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(ZI)V")
	public static void method3872() {
		@Pc(5) Class103 local5 = Static193.aClass103_36;
		synchronized (Static193.aClass103_36) {
			Static193.aClass103_36.method2679(5);
		}
	}
}
