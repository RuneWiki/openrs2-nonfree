import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[100];

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "Z")
	public static boolean aBoolean134 = false;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)V")
	public static void method1997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class223 local7 = Static19.aClass223ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class223 local28 = Static19.aClass223ArrayArrayArray1[local9][arg0][arg1] = Static19.aClass223ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte64--;
				for (@Pc(40) Class270 local40 = local28.aClass270_1; local40 != null; local40 = local40.aClass270_3) {
					@Pc(44) Class26_Sub2 local44 = local40.aClass26_Sub2_2;
					if (local44.aShort105 == arg0 && local44.aShort103 == arg1) {
						local44.aByte102--;
					}
				}
			}
		}
		if (Static19.aClass223ArrayArrayArray1[0][arg0][arg1] == null) {
			Static19.aClass223ArrayArrayArray1[0][arg0][arg1] = new Class223(0, arg0, arg1);
			Static19.aClass223ArrayArrayArray1[0][arg0][arg1].aByte68 = 1;
		}
		Static19.aClass223ArrayArrayArray1[0][arg0][arg1].aClass223_1 = local7;
		Static19.aClass223ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZILclient!ya;IILclient!pf;)V")
	public static void method1998(@OriginalArg(1) int arg0, @OriginalArg(2) Class51 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class189 arg4) {
		@Pc(9) Class125 local9 = Static351.aClass176_4.method3720(arg4.anInt5066);
		if (local9.anInt3466 == -1) {
			return;
		}
		if (arg4.aBoolean315) {
			@Pc(22) int local22 = arg2 + arg4.anInt5061;
			arg2 = local22 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(38) Class11 local38 = local9.method2811(arg4.aBoolean322, arg1, arg2);
		if (local38 == null) {
			return;
		}
		@Pc(49) int local49 = arg4.anInt5073;
		@Pc(52) int local52 = arg4.anInt5110;
		if ((arg2 & 0x1) == 1) {
			local52 = arg4.anInt5073;
			local49 = arg4.anInt5110;
		}
		@Pc(66) int local66 = local38.j();
		@Pc(69) int local69 = local38.T();
		if (local9.aBoolean209) {
			local69 = local52 * 4;
			local66 = local49 * 4;
		}
		if (local9.anInt3459 == 0) {
			local38.method4399(arg3, arg0 + 4 - local52 * 4, local66, local69);
		} else {
			local38.s(arg3, arg0 + 4 - local52 * 4, local66, local69, 0, local9.anInt3459 | 0xFF000000, 1);
		}
	}
}
