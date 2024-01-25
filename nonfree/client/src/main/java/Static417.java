import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!re", name = "q", descriptor = "I")
	public static int anInt7805 = -2;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIBIIIIIIIII)V")
	public static void method6464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static511.aClass52Array3 == null) {
			return;
		}
		@Pc(8) Class6_Sub1_Sub2 local8 = null;
		@Pc(15) int local15;
		if (arg6 < 0) {
			local15 = -arg6 - 1;
			if (Static342.anInt6448 == local15) {
				local8 = Static111.aClass6_Sub1_Sub2_Sub1_3;
			} else {
				local8 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local15];
			}
		} else {
			local15 = arg6 - 1;
			@Pc(41) Class3_Sub3 local41 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local15);
			if (local41 != null) {
				local8 = local41.aClass6_Sub1_Sub2_Sub2_1;
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(59) Class242 local59 = Static454.aClass298_3.method7185(arg3);
		@Pc(73) int local73;
		@Pc(70) int local70;
		if (arg7 == 1 || arg7 == 3) {
			local70 = local59.anInt7193;
			local73 = local59.anInt7195;
		} else {
			local73 = local59.anInt7193;
			local70 = local59.anInt7195;
		}
		@Pc(88) int local88 = arg5 + (local70 >> 1);
		@Pc(97) int local97 = arg5 + (local70 + 1 >> 1);
		@Pc(103) int local103 = (local73 >> 1) + arg0;
		@Pc(112) int local112 = arg0 + (local73 + 1 >> 1);
		@Pc(116) Class52 local116 = Static511.aClass52Array3[arg2];
		@Pc(139) int local139 = local116.JA(local88, local103) + local116.JA(local97, local103) + local116.JA(local88, local112) + local116.JA(local97, local112) >> 2;
		@Pc(143) Class3_Sub38 local143 = new Class3_Sub38();
		@Pc(152) int local152;
		if (arg9 > arg11) {
			local152 = arg9;
			arg9 = arg11;
			arg11 = local152;
		}
		local143.anInt6984 = local8.aByte100;
		local143.anInt6971 = arg7;
		local143.anInt6986 = Static223.anInt4829 + arg4;
		local143.anInt6977 = arg0;
		local143.anInt6985 = arg8 + Static223.anInt4829;
		local143.anInt6973 = arg5;
		local143.anInt6981 = arg3;
		local143.anInt6976 = arg10;
		local143.anInt6975 = arg5 + arg11;
		if (arg1 > arg12) {
			local152 = arg1;
			arg1 = arg12;
			arg12 = local152;
		}
		local143.anInt6974 = arg9 + arg5;
		local143.anInt6970 = arg12 + arg0;
		local143.anInt6969 = local139;
		local143.anInt6983 = (local70 << 8) + (local143.anInt6973 << 9);
		local143.anInt6972 = arg1 + arg0;
		local143.anInt6980 = (local143.anInt6977 << 9) + (local73 << 8);
		Static230.aClass71_39.method2076(local143);
		local8.aClass3_Sub38_3 = local143;
	}
}
