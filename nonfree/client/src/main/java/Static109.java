import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!gs", name = "x", descriptor = "I")
	public static int anInt2399;

	@OriginalMember(owner = "client!gs", name = "z", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!gs", name = "H", descriptor = "I")
	public static int anInt2406;

	@OriginalMember(owner = "client!gs", name = "K", descriptor = "I")
	public static int anInt2409;

	@OriginalMember(owner = "client!gs", name = "w", descriptor = "Z")
	public static boolean aBoolean207 = false;

	@OriginalMember(owner = "client!gs", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString81 = "Created gameworld";

	@OriginalMember(owner = "client!gs", name = "I", descriptor = "I")
	public static int anInt2407 = 0;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIIII)V")
	public static void method2028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 >= Static338.anInt5369 && arg5 <= Static295.anInt5964 && arg1 >= Static229.anInt4777 && Static165.anInt3366 >= arg2) {
			if (arg0 == 1) {
				Static177.method4966(arg5, arg2, arg3, arg4, arg1);
			} else {
				Static292.method4976(arg2, arg0, arg4, arg1, arg3, arg5);
			}
		} else if (arg0 == 1) {
			Static279.method4786(arg1, arg4, arg5, arg2, arg3);
		} else {
			Static214.method3713(arg0, arg2, arg3, arg4, arg5, arg1);
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!vm;)V")
	public static void method2033(@OriginalArg(0) Class92 arg0) {
		for (@Pc(1) int local1 = Static297.anInt6000; local1 < Static112.anInt2455; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static151.anInt3338; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static220.anInt4569; local7++) {
					@Pc(16) Class57 local16 = Static18.aClass57ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class2_Sub4 local21 = local16.aClass2_Sub4_1;
						@Pc(24) Class2_Sub4 local24 = local16.aClass2_Sub4_2;
						if (local21 != null && local21.method5411()) {
							Static286.method4907(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5411()) {
								Static286.method4907(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5406(false, 0, 0, local21, 0, arg0);
								local24.method5408();
							}
							local21.method5408();
						}
						for (@Pc(70) Class95 local70 = local16.aClass95_2; local70 != null; local70 = local70.aClass95_3) {
							@Pc(74) Class2_Sub2 local74 = local70.aClass2_Sub2_1;
							if (local74 != null && local74.method5411()) {
								Static286.method4907(arg0, local74, local1, local4, local7, local74.aShort83 + 1 - local74.aShort85, local74.aShort82 - local74.aShort84 + 1);
								local74.method5408();
							}
						}
						@Pc(111) Class2_Sub5 local111 = local16.aClass2_Sub5_1;
						if (local111 != null && local111.method5411()) {
							Static71.method1356(arg0, local111, local1, local4, local7);
							local111.method5408();
						}
					}
				}
			}
		}
	}
}
