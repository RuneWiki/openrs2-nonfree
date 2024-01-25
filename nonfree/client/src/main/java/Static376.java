import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!on", name = "e", descriptor = "I")
	public static int anInt6855;

	@OriginalMember(owner = "client!on", name = "i", descriptor = "Lclient!gd;")
	public static Class116 aClass116_1;

	@OriginalMember(owner = "client!on", name = "o", descriptor = "Z")
	public static boolean aBoolean471 = false;

	@OriginalMember(owner = "client!on", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray60 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIILclient!oa;)V")
	public static void method5504(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class90 arg2) {
		Static89.aClass90_3 = arg2;
		Static368.aClass5ArrayArray1 = new Class5[arg1][arg0];
		if (Static528.anIntArray644 != null) {
			Static476.aClass3_4 = Static216.method1061(Static528.anIntArray644[1], Static528.anIntArray644[3], Static528.anIntArray644[4], Static528.anIntArray644[5], Static528.anIntArray644[2], Static528.anIntArray644[0]);
		}
		Static9.aClass5_1 = new Class5();
		Static391.method5697();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)V")
	public static void method5505(@OriginalArg(1) int arg0) {
		@Pc(12) Class6_Sub5_Sub8 local12 = Static49.method760(12, arg0);
		local12.method3257();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!e;ILjava/awt/Canvas;Lclient!pj;I)Lclient!oa;")
	public static Class90 method5506(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) Class248 arg3) {
		if (!Static413.method5908()) {
			throw new RuntimeException("");
		} else if (Static560.method7781("jaggl")) {
			@Pc(24) OpenGL local24 = new OpenGL();
			@Pc(34) long local34 = local24.init(arg2, 8, 8, 8, 24, 0, arg1);
			if (local34 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(58) Class90_Sub3_Sub1 local58 = new Class90_Sub3_Sub1(local24, arg2, local34, arg0, arg3, arg1);
			local58.method7632();
			return local58;
		} else {
			throw new RuntimeException("");
		}
	}
}
