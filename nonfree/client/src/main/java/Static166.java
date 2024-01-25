import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!kn", name = "K", descriptor = "I")
	public static int anInt3360;

	@OriginalMember(owner = "client!kn", name = "O", descriptor = "[B")
	public static byte[] aByteArray41;

	@OriginalMember(owner = "client!kn", name = "N", descriptor = "[I")
	public static final int[] anIntArray232 = new int[13];

	@OriginalMember(owner = "client!kn", name = "Q", descriptor = "Lclient!wf;")
	public static final Class215 aClass215_4 = new Class215(64);

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIII)V")
	public static void method3083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static334.anInt6315 < arg1 || arg2 < Static314.anInt6018) {
			return;
		}
		@Pc(24) boolean local24;
		if (arg0 < Static184.anInt6250) {
			local24 = false;
			arg0 = Static184.anInt6250;
		} else if (arg0 <= Static80.anInt4809) {
			local24 = true;
		} else {
			arg0 = Static80.anInt4809;
			local24 = false;
		}
		@Pc(48) boolean local48;
		if (Static184.anInt6250 > arg3) {
			local48 = false;
			arg3 = Static184.anInt6250;
		} else if (Static80.anInt4809 < arg3) {
			local48 = false;
			arg3 = Static80.anInt4809;
		} else {
			local48 = true;
		}
		if (Static314.anInt6018 <= arg1) {
			Static247.method3552(arg4, arg0, Static332.anIntArrayArray56[arg1++], arg3);
		} else {
			arg1 = Static314.anInt6018;
		}
		if (arg2 <= Static334.anInt6315) {
			Static247.method3552(arg4, arg0, Static332.anIntArrayArray56[arg2--], arg3);
		} else {
			arg2 = Static334.anInt6315;
		}
		@Pc(105) int local105;
		if (local24 && local48) {
			for (local105 = arg1; local105 <= arg2; local105++) {
				@Pc(111) int[] local111 = Static332.anIntArrayArray56[local105];
				local111[arg0] = local111[arg3] = arg4;
			}
		} else if (local24) {
			for (local105 = arg1; local105 <= arg2; local105++) {
				Static332.anIntArrayArray56[local105][arg0] = arg4;
			}
		} else if (local48) {
			for (local105 = arg1; local105 <= arg2; local105++) {
				Static332.anIntArrayArray56[local105][arg3] = arg4;
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(II)V")
	public static void method3085(@OriginalArg(0) int arg0) {
		@Pc(14) Class5_Sub9_Sub16 local14 = Static239.method4052(2, arg0);
		local14.method4138();
	}
}
