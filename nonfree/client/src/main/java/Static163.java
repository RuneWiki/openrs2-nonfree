import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!gaa", name = "B", descriptor = "I")
	public static int anInt1206;

	@OriginalMember(owner = "client!gaa", name = "u", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_17 = new Class287(13, -1);

	@OriginalMember(owner = "client!gaa", name = "w", descriptor = "[I")
	public static final int[] anIntArray35 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!gaa", name = "E", descriptor = "[I")
	public static int[] anIntArray36 = new int[1];

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIILclient!ht;)V")
	public static void method1107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class25_Sub2_Sub5 arg3) {
		@Pc(4) Class333 local4 = Static195.method3408(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass25_Sub2_Sub5_1 = arg3;
		@Pc(16) int local16 = Static256.aClass127Array3 == Static108.aClass127Array5 ? 1 : 0;
		if (arg3.method6653()) {
			if (arg3.method6655()) {
				Static468.aClass25_Sub2ArrayArray4[local16][Static154.anIntArray135[local16]++] = arg3;
				return;
			}
			Static530.aClass25_Sub2ArrayArray5[local16][Static199.anIntArray186[local16]++] = arg3;
			return;
		}
		Static69.aClass25_Sub2ArrayArray3[local16][Static473.anIntArray482[local16]++] = arg3;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method1108(@OriginalArg(0) Class31 arg0) {
		for (@Pc(10) Class25_Sub7 local10 = (Class25_Sub7) Static344.aClass269_5.method5974(); local10 != null; local10 = (Class25_Sub7) Static344.aClass269_5.method5979()) {
			if (local10.aBoolean306) {
				local10.method3780(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILclient!ri;Ljava/awt/Canvas;ILclient!fa;)Lclient!r;")
	public static Class31 method1109(@OriginalArg(1) Class284 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface4 arg3) {
		if (!Static512.method6920()) {
			throw new RuntimeException("");
		} else if (Static298.method4529("jaggl")) {
			@Pc(29) OpenGL local29 = new OpenGL();
			@Pc(39) long local39 = local29.init(arg1, 8, 8, 8, 24, 0, arg2);
			if (local39 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(60) Class31_Sub1_Sub1 local60 = new Class31_Sub1_Sub1(local29, arg1, local39, arg3, arg0, arg2);
			local60.method7127();
			return local60;
		} else {
			throw new RuntimeException("");
		}
	}
}
