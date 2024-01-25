import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!md", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString71 = "";

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIBI)Z")
	public static boolean method4882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) boolean local10 = true;
		@Pc(16) Interface17 local16 = (Interface17) Static216.method3734(arg0, arg2, arg1);
		if (local16 != null) {
			local10 = Static256.method4268(local16) & true;
		}
		local16 = (Interface17) Static541.method7510(arg0, arg2, arg1, qi.class);
		if (local16 != null) {
			local10 &= Static256.method4268(local16);
		}
		local16 = (Interface17) Static38.method651(arg0, arg2, arg1);
		if (local16 != null) {
			local10 &= Static256.method4268(local16);
		}
		return local10;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!oa;Lclient!ni;III)V")
	public static void method4889(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class100 local12;
		if (arg3 < Static173.anInt3719) {
			local12 = Static309.aClass100ArrayArrayArray2[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass10_Sub5_1 != null && local12.aClass10_Sub5_1.method7730()) {
				arg1.method7732(Static514.anInt8839, arg0, 0, local12.aClass10_Sub5_1, true, 0);
			}
		}
		if (arg4 < Static173.anInt3719) {
			local12 = Static309.aClass100ArrayArrayArray2[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass10_Sub5_1 != null && local12.aClass10_Sub5_1.method7730()) {
				arg1.method7732(0, arg0, 0, local12.aClass10_Sub5_1, true, Static514.anInt8839);
			}
		}
		if (arg3 < Static173.anInt3719 && arg4 < Static357.anInt6212) {
			local12 = Static309.aClass100ArrayArrayArray2[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass10_Sub5_1 != null && local12.aClass10_Sub5_1.method7730()) {
				arg1.method7732(Static514.anInt8839, arg0, 0, local12.aClass10_Sub5_1, true, Static514.anInt8839);
			}
		}
		if (arg3 < Static173.anInt3719 && arg4 > 0) {
			local12 = Static309.aClass100ArrayArrayArray2[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass10_Sub5_1 != null && local12.aClass10_Sub5_1.method7730()) {
				arg1.method7732(Static514.anInt8839, arg0, 0, local12.aClass10_Sub5_1, true, -Static514.anInt8839);
			}
		}
	}
}
