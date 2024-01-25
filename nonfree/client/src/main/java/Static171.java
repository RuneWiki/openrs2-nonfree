import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "[I")
	public static int[] anIntArray223;

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "[I")
	public static final int[] anIntArray222 = new int[256];

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!qa;Lclient!to;IIIII)V")
	public static void method2756(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static362.anInt6122) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static405.anInt6684) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static37.anInt1025 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class118 local62 = Static263.aClass118ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static444.aClass159Array3[local17].I(local23, local32) + Static444.aClass159Array3[local17].I(local23 + 1, local32) + Static444.aClass159Array3[local17].I(local23, local32 + 1) + Static444.aClass159Array3[local17].I(local23 + 1, local32 + 1)) / 4 - (Static444.aClass159Array3[arg2].I(arg3, arg4) + Static444.aClass159Array3[arg2].I(arg3 + 1, arg4) + Static444.aClass159Array3[arg2].I(arg3, arg4 + 1) + Static444.aClass159Array3[arg2].I(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class7_Sub4 local143 = local62.aClass7_Sub4_2;
									@Pc(146) Class7_Sub4 local146 = local62.aClass7_Sub4_1;
									if (local143 != null && local143.method5276()) {
										arg1.method5273((local23 - arg3) * Static205.anInt3992 + (1 - arg5) * Static421.anInt6887, arg0, local1, local143, (local32 - arg4) * Static205.anInt3992 + (1 - arg6) * Static421.anInt6887, local140);
									}
									if (local146 != null && local146.method5276()) {
										arg1.method5273((local23 - arg3) * Static205.anInt3992 + (1 - arg5) * Static421.anInt6887, arg0, local1, local146, (local32 - arg4) * Static205.anInt3992 + (1 - arg6) * Static421.anInt6887, local140);
									}
									for (@Pc(219) Class179 local219 = local62.aClass179_2; local219 != null; local219 = local219.aClass179_3) {
										@Pc(223) Class7_Sub2 local223 = local219.aClass7_Sub2_2;
										if (local223 != null && local223.method5276() && (local23 == local223.aShort71 || local23 == local3) && (local32 == local223.aShort73 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort72 + 1 - local223.aShort71;
											@Pc(260) int local260 = local223.aShort70 + 1 - local223.aShort73;
											arg1.method5273((local223.aShort71 - arg3) * Static205.anInt3992 + (local252 - arg5) * Static421.anInt6887, arg0, local1, local223, (local223.aShort73 - arg4) * Static205.anInt3992 + (local260 - arg6) * Static421.anInt6887, local140);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
	public static void method2757() {
		Static2.aClass133_1 = new Class133(8);
		Static273.anInt5071 = 0;
		for (@Pc(19) Class6_Sub8 local19 = (Class6_Sub8) Static245.aClass138_4.method3311(); local19 != null; local19 = (Class6_Sub8) Static245.aClass138_4.method3312()) {
			local19.method5928();
		}
	}
}
