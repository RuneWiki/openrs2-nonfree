import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Lclient!pe;")
	public static Class89 aClass89_8;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Lclient!rk;")
	public static Class180 aClass180_93;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "[Lclient!sa;")
	public static Class8[] aClass8Array5;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "[Lclient!aa;")
	public static final Class2[] aClass2Array1 = new Class2[16];

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Ljava/lang/String;")
	public static final String aString413 = "wave2:";

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "[I")
	public static final int[] anIntArray795 = new int[128];

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([Lclient!oa;IZ[BZIIIIIILclient!pe;)V")
	public static void method5271(@OriginalArg(0) Class149[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class89 arg10) {
		@Pc(12) Class7_Sub3 local12 = new Class7_Sub3(arg3);
		@Pc(14) int local14 = -1;
		while (true) {
			@Pc(18) int local18 = local12.method2792();
			if (local18 == 0) {
				return;
			}
			local14 += local18;
			@Pc(26) int local26 = 0;
			while (true) {
				@Pc(30) int local30 = local12.method2732();
				if (local30 == 0) {
					break;
				}
				local26 += local30 - 1;
				@Pc(45) int local45 = local26 & 0x3F;
				@Pc(51) int local51 = local26 >> 6 & 0x3F;
				@Pc(55) int local55 = local26 >> 12;
				@Pc(59) int local59 = local12.method2772();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				if (local55 == arg4 && local51 >= arg5 && local51 < arg5 + 8 && arg9 <= local45 && local45 < arg9 + 8) {
					@Pc(102) Class122 local102 = Static245.method4227(local14);
					@Pc(119) int local119 = arg1 + Static227.method5320(local102.anInt3527, local51 & 0x7, local67, arg7, local102.anInt3562, local45 & 0x7);
					@Pc(136) int local136 = Static172.method2483(arg7, local67, local51 & 0x7, local45 & 0x7, local102.anInt3527, local102.anInt3562) + arg8;
					if (local119 > 0 && local136 > 0 && Static15.anInt287 - 1 > local119 && Static325.anInt6173 - 1 > local136) {
						@Pc(162) Class149 local162 = null;
						if (!arg2) {
							@Pc(166) int local166 = arg6;
							if ((Static92.aByteArrayArrayArray3[1][local119][local136] & 0x2) == 2) {
								local166 = arg6 - 1;
							}
							if (local166 >= 0) {
								local162 = arg0[local166];
							}
						}
						Static345.method5563(arg6, local162, arg6, arg2, arg10, arg7 + local67 & 0x3, local136, local63, local14, -1, true, local119);
					}
				}
			}
		}
	}
}
