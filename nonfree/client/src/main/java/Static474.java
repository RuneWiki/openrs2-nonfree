import java.awt.Canvas;
import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!qea", name = "d", descriptor = "Ljava/lang/Class;")
	private static Class aClass23;

	@OriginalMember(owner = "client!qea", name = "e", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_85 = new Class387(75, 3);

	@OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
	public static int anInt8030 = 0;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIII)V")
	public static void method6908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19 = Static637.aClass5_Sub20_31.aClass24_Sub12_3.method3413() * arg1 >> 8;
		if (arg0 == -1 && !Static152.aBoolean200) {
			Static243.method3610();
		} else if (arg0 != -1 && (Static252.anInt4340 != arg0 || !Static41.method691(0)) && local19 != 0 && !Static152.aBoolean200) {
			Static148.method2090(Static229.aClass208_57, local19, arg2, arg0);
			Static664.method9163();
		}
		if (arg0 != Static252.anInt4340) {
			Static57.aClass5_Sub16_Sub4_2 = null;
		}
		Static252.anInt4340 = arg0;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Ljava/awt/Canvas;IIILclient!d;)Lclient!ha;")
	public static Class57 method6910(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface1 arg3) {
		return new oa(arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(BIIIIILclient!ha;I)V")
	public static void method6911(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class57 arg3, @OriginalArg(7) int arg4) {
		arg3.method7731(-10660793, arg2, arg4, arg0, arg1);
		arg3.method7731(-16777216, arg2 + 1, 16, arg0 - 2, arg1 + 1);
		arg3.method7723(arg2 + 1, arg4 + -19, -16777216, arg0 - 2, arg1 + 18);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IZLjava/io/File;)V")
	public static void method6912(@OriginalArg(2) File arg0) {
		if (Static25.anObject1 == null) {
			Static166.method2391();
		}
		try {
			@Pc(27) Class local27 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(53) Method local53 = local27.getDeclaredMethod("dumpHeap", aClass23 == null ? (aClass23 = Class288.a("java.lang.String")) : aClass23, Boolean.TYPE);
			local53.invoke(Static25.anObject1, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(73) Exception local73) {
			System.out.println("HeapDump error:");
			local73.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIZIIII)V")
	public static void method6913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static637.aClass5_Sub20_31.aClass24_Sub12_4.method3413() != 0 && arg5 != 0 && Static21.anInt322 < 50 && arg4 != -1) {
			Static377.aClass50Array1[Static21.anInt322++] = new Class50((byte) 1, arg4, arg5, arg2, arg1, arg0, arg3, (Class8_Sub1) null);
		}
	}
}
