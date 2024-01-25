import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!gaa", name = "n", descriptor = "Lclient!bh;")
	public static Class2_Sub8 aClass2_Sub8_2;

	@OriginalMember(owner = "client!gaa", name = "t", descriptor = "Lclient!dda;")
	public static Class53 aClass53_47;

	@OriginalMember(owner = "client!gaa", name = "u", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IBIII[BI[BI)V")
	public static void method2576(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(28) int local28 = -arg7; local28 < 0; local28++) {
			@Pc(36) int local36;
			for (@Pc(32) int local32 = local10; local32 < 0; local32++) {
				local36 = arg1++;
				arg4[local36] += arg6[arg0++];
				@Pc(48) int local48 = arg1++;
				arg4[local48] += arg6[arg0++];
				@Pc(60) int local60 = arg1++;
				arg4[local60] += arg6[arg0++];
				@Pc(72) int local72 = arg1++;
				arg4[local72] += arg6[arg0++];
			}
			for (@Pc(87) int local87 = local15; local87 < 0; local87++) {
				local36 = arg1++;
				arg4[local36] += arg6[arg0++];
			}
			arg1 += arg2;
			arg0 += arg5;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIIIII)V")
	public static void method2578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static281.aClass2_Sub19_Sub1_1.anInt2187 != 0 && arg2 != 0 && Static374.anInt6954 < 50 && arg3 != -1) {
			Static469.aClass141Array1[Static374.anInt6954++] = new Class141((byte) 1, arg3, arg2, arg0, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(II)I")
	public static int method2580(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
