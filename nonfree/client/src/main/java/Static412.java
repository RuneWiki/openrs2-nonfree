import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "[Lclient!ui;")
	public static Class333[] aClass333Array6;

	@OriginalMember(owner = "client!pv", name = "u", descriptor = "F")
	public static float aFloat187;

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
	public static final int anInt7297 = 0;

	@OriginalMember(owner = "client!pv", name = "p", descriptor = "J")
	public static long aLong176 = 0L;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z[B)Lclient!f;")
	public static Class5 method5863(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static475.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static475.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static475.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(58) int[] local58 = new int[local34 * local38];
					@Pc(70) PixelGrabber local70 = new PixelGrabber(local19, 0, 0, local34, local38, local58, 0, local34);
					local70.grabPixels();
					return Static31.aClass78_18.method6842(local58, local34, local34, local38);
				}
				throw new RuntimeException("");
			} catch (@Pc(82) InterruptedException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V")
	public static void method5864() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Integer local31 = (Integer) local16.invoke(local25, (Object[]) null);
					Static107.anInt1802 = local31;
				} catch (@Pc(36) Throwable local36) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(Z)V")
	public static void method5871() {
		Static7.aClass90_1.method2266();
		Static441.aClass92_4.method2280();
		Static423.aClass323_1.method7154();
		Static347.aClass122_4.method2774();
		Static84.aClass242_1.method5282();
		Static230.aClass225_1.method4860();
		Static223.aClass245_1.method5309();
		Static583.aClass256_2.method5473();
		Static300.aClass321_3.method7116();
		Static433.aClass117_2.method2697();
		Static241.aClass340_1.method7432();
		Static191.aClass33_2.method791();
		Static144.aClass113_1.method2590();
		Static197.aClass284_1.method6121();
		Static256.aClass263_1.method5597();
		Static544.aClass237_1.method5210();
		Static40.aClass164_1.method3422();
		Static400.aClass351_1.method7558();
		Static215.aClass18_2.method494();
		Static381.aClass359_1.method7784();
		Static425.method6083();
		Static408.method5840();
		Static402.method5788();
		Static537.method7320();
		if (Static76.aClass93_3 != Static405.aClass93_6) {
			for (@Pc(82) int local82 = 0; local82 < Static277.aByteArrayArray12.length; local82++) {
				Static277.aByteArrayArray12[local82] = null;
			}
			Static553.anInt9224 = 0;
		}
		Static511.method7150();
		Static487.method6714();
		Static166.method6219();
		Static520.method7994();
		Static234.method3455();
		Static451.aClass207_47.method4392();
		Static31.aClass78_18.method6816();
		Static250.method3667();
		Static22.method489();
		Static443.aClass308_158.method6543();
		Static118.aClass308_46.method6543();
		Static298.aClass308_106.method6543();
		Static227.aClass308_91.method6543();
		Static341.aClass308_120.method6543();
		Static141.aClass308_56.method6543();
		Static51.aClass308_24.method6543();
		Static184.aClass308_76.method6543();
		Static121.aClass308_48.method6543();
		Static528.aClass308_179.method6543();
		Static294.aClass308_104.method6543();
		Static303.aClass308_109.method6543();
		Static220.aClass308_111.method6543();
		Static77.aClass308_183.method6543();
		Static133.aClass308_53.method6543();
		Static218.aClass308_86.method6543();
		Static411.aClass308_147.method6543();
		Static379.aClass308_135.method6543();
		Static575.aClass308_192.method6543();
		Static161.aClass308_66.method6543();
		Static506.aClass308_171.method6543();
		Static231.aClass308_94.method6543();
		Static559.aClass308_187.method6543();
		Static193.aClass308_80.method6543();
		Static438.aClass308_156.method6543();
		Static485.aClass308_165.method6543();
		Static106.aClass308_41.method6543();
		Static584.aClass308_194.method6543();
		Static141.aClass308_57.method6543();
		Static563.aClass308_188.method6543();
		Static155.aClass308_60.method6543();
		Static461.aClass308_163.method6543();
		Static148.aClass207_12.method4392();
		Static318.aClass207_31.method4392();
		Static118.aClass207_8.method4392();
		Static364.aClass207_50.method4392();
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IZLjava/lang/Object;I)[B")
	public static byte[] method5872(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static394.method5650(local13, arg0);
		} else if (arg1 instanceof Class184) {
			@Pc(25) Class184 local25 = (Class184) arg1;
			return local25.method3815(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)Lclient!go;")
	public static Class121 method5875(@OriginalArg(1) int arg0) {
		@Pc(16) Class121[] local16 = Static522.method7234();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			if (local16[local18].anInt3214 == arg0) {
				return local16[local18];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIFBI[FFIIII)V")
	public static void method5876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(13) int local13 = arg7 - arg6;
		@Pc(17) int local17 = arg3 - arg0;
		@Pc(21) int local21 = arg1 - arg9;
		@Pc(46) float local46 = (float) local13 * arg4[2] + (float) local17 * arg4[1] + arg4[0] * (float) local21;
		@Pc(67) float local67 = arg4[4] * (float) local17 + (float) local21 * arg4[3] + (float) local13 * arg4[5];
		@Pc(88) float local88 = (float) local21 * arg4[6] + (float) local17 * arg4[7] + (float) local13 * arg4[8];
		@Pc(99) float local99 = (float) Math.atan2((double) local46, (double) local88) / 6.2831855F + 0.5F;
		if (arg5 != 1.0F) {
			local99 *= arg5;
		}
		@Pc(113) float local113 = arg2 + local67 + 0.5F;
		@Pc(132) float local132;
		if (arg8 == 1) {
			local132 = local99;
			local99 = -local113;
			local113 = local132;
		} else if (arg8 == 2) {
			local99 = -local99;
			local113 = -local113;
		} else if (arg8 == 3) {
			local132 = local99;
			local99 = local113;
			local113 = -local132;
		}
		Static106.aFloat41 = local113;
		Static70.aFloat37 = local99;
	}
}
