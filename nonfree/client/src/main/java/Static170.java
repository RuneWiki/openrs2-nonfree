import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
	public static int anInt3052;

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "Z")
	public static boolean aBoolean209 = false;

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
	public static int anInt3050 = -1;

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[5];

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString32 = null;

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[100];

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIII)I")
	public static int method2588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 / arg0;
		@Pc(21) int local21 = arg2 & arg0 - 1;
		@Pc(25) int local25 = arg1 / arg0;
		@Pc(31) int local31 = arg1 & arg0 - 1;
		@Pc(36) int local36 = Static382.method5847(local25, local7);
		@Pc(43) int local43 = Static382.method5847(local25, local7 + 1);
		@Pc(50) int local50 = Static382.method5847(local25 + 1, local7);
		@Pc(59) int local59 = Static382.method5847(local25 + 1, local7 - -1);
		@Pc(66) int local66 = Static499.method6920(local36, local21, local43, arg0);
		@Pc(73) int local73 = Static499.method6920(local50, local21, local59, arg0);
		return Static499.method6920(local66, local31, local73, arg0);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!n;ILclient!kr;Ljava/awt/Canvas;I)Lclient!qa;")
	public static Class122 method2589(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) Class171 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3) {
		if (!Static528.method7330()) {
			throw new RuntimeException("");
		} else if (Static193.method6050("jaggl")) {
			@Pc(24) OpenGL local24 = new OpenGL();
			@Pc(34) long local34 = local24.init(arg2, 8, 8, 8, 24, 0, arg3);
			if (local34 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(55) Class122_Sub2_Sub2 local55 = new Class122_Sub2_Sub2(local24, arg2, local34, arg0, arg1, arg3);
			local55.method5619();
			return local55;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
	public static void method2590() {
		Static365.anInt6459 = Static381.aClass232_6.anInt6455 + Static381.aClass232_6.anInt6464 + 2;
		Static25.anInt551 = Static448.aClass232_7.anInt6455 + Static448.aClass232_7.anInt6464 + 2;
		Static200.aStringArray19 = new String[500];
		for (@Pc(37) int local37 = 0; local37 < Static200.aStringArray19.length; local37++) {
			Static200.aStringArray19[local37] = "";
		}
	}
}
