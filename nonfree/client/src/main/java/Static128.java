import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "[I")
	public static int[] anIntArray181;

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "Lclient!an;")
	public static Class11 aClass11_1;

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "Lclient!sn;")
	public static final Class225 aClass225_9 = new Class225(4, 14);

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
	public static int anInt2309 = 0;

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_56 = new Class211(55, 3);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!dk;)V")
	public static void method1898(@OriginalArg(1) Class54 arg0) {
		Static217.aClass54_63 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!jp;IZBIII)V")
	public static void method1905(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static208.anInt3488 >= 50 || (arg0 == null || arg0.anIntArrayArray16 == null || arg0.anIntArrayArray16.length <= arg5 || arg0.anIntArrayArray16[arg5] == null)) {
			return;
		}
		@Pc(30) int local30 = arg0.anIntArrayArray16[arg5][0];
		@Pc(34) int local34 = local30 >> 8;
		@Pc(40) int local40 = local30 >> 5 & 0x7;
		@Pc(44) int local44 = local30 & 0x1F;
		@Pc(61) int local61;
		if (arg0.anIntArrayArray16[arg5].length > 1) {
			local61 = (int) (Math.random() * (double) arg0.anIntArrayArray16[arg5].length);
			if (local61 > 0) {
				local34 = arg0.anIntArrayArray16[arg5][local61];
			}
		}
		if (local44 == 0) {
			if (arg2) {
				Static97.method1503(255, 0, local34, local40);
			}
		} else if (Static2.aClass148_Sub1_1.anInt3790 != 0) {
			local61 = arg4 - 64 >> 7;
			@Pc(103) int local103 = arg1 - 64 >> 7;
			Static147.aClass64Array1[Static208.anInt3488++] = new Class64((byte) 1, local34, local40, 0, 255, (local103 << 8) + ((arg3 << 24) + (local61 << 16)) + local44);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/awt/Frame;Lclient!or;)V")
	public static void method1909(@OriginalArg(1) Frame arg0, @OriginalArg(2) Class183 arg1) {
		while (true) {
			@Pc(12) Class91 local12 = arg1.method3916(arg0);
			while (local12.anInt2446 == 0) {
				Static429.method5376(10L);
			}
			if (local12.anInt2446 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static429.method5376(100L);
		}
	}
}
