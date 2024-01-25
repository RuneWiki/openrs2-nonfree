import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!tba", name = "t", descriptor = "I")
	public static int anInt9042 = 0;

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(III)Z")
	public static boolean method7375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static30.method388(arg1, arg0) || Static448.method6201(arg1, arg0);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!ft;I)[Lclient!wl;")
	public static Class359[] method7380(@OriginalArg(0) Class109 arg0) {
		if (!arg0.method2179()) {
			return new Class359[0];
		}
		@Pc(16) Class260 local16 = arg0.method2184();
		while (local16.anInt7041 == 0) {
			Static391.method5400(10L);
		}
		if (local16.anInt7041 == 2) {
			return new Class359[0];
		}
		@Pc(38) int[] local38 = (int[]) local16.anObject16;
		@Pc(44) Class359[] local44 = new Class359[local38.length >> 2];
		for (@Pc(54) int local54 = 0; local54 < local44.length; local54++) {
			@Pc(60) Class359 local60 = new Class359();
			local44[local54] = local60;
			local60.anInt9567 = local38[local54 << 2];
			local60.anInt9566 = local38[(local54 << 2) + 1];
			local60.anInt9568 = local38[(local54 << 2) + 2];
			local60.anInt9563 = local38[(local54 << 2) + 3];
		}
		return local44;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method7383(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static176.method2504(arg3, Static451.anInt7775, Static514.anInt8722);
		@Pc(21) int local21 = Static176.method2504(arg5, Static451.anInt7775, Static514.anInt8722);
		@Pc(27) int local27 = Static176.method2504(arg1, Static162.anInt2935, Static270.anInt4759);
		@Pc(33) int local33 = Static176.method2504(arg0, Static162.anInt2935, Static270.anInt4759);
		@Pc(41) int local41 = Static176.method2504(arg6 + arg3, Static451.anInt7775, Static514.anInt8722);
		@Pc(50) int local50 = Static176.method2504(arg5 - arg6, Static451.anInt7775, Static514.anInt8722);
		for (@Pc(52) int local52 = local11; local52 < local41; local52++) {
			Static433.method6039(arg4, local33, Static171.anIntArrayArray79[local52], local27);
		}
		for (@Pc(72) int local72 = local21; local72 > local50; local72--) {
			Static433.method6039(arg4, local33, Static171.anIntArrayArray79[local72], local27);
		}
		@Pc(95) int local95 = Static176.method2504(arg1 + arg6, Static162.anInt2935, Static270.anInt4759);
		@Pc(104) int local104 = Static176.method2504(arg0 - arg6, Static162.anInt2935, Static270.anInt4759);
		for (@Pc(106) int local106 = local41; local106 <= local50; local106++) {
			@Pc(112) int[] local112 = Static171.anIntArrayArray79[local106];
			Static433.method6039(arg4, local95, local112, local27);
			Static433.method6039(arg2, local104, local112, local95);
			Static433.method6039(arg4, local33, local112, local104);
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(BLclient!mw;)Lclient!fv;")
	public static Class111 method7386(@OriginalArg(1) Class8_Sub3_Sub3 arg0) {
		@Pc(9) Class111 local9;
		if (Static513.aClass111_3 == null) {
			local9 = new Class111();
		} else {
			local9 = Static513.aClass111_3;
			Static513.aClass111_3 = Static513.aClass111_3.aClass111_2;
			Static5.anInt65--;
			local9.aClass111_2 = null;
		}
		local9.aClass8_Sub3_Sub3_1 = arg0;
		return local9;
	}
}
