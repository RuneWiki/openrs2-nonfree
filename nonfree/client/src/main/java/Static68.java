import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
	public static int anInt4065;

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)V")
	public static void method3621() {
		if (Static123.aClass192_2 == null) {
			return;
		}
		if (Static123.aClass192_2.anInt5186 == 1) {
			Static123.aClass192_2 = null;
			return;
		}
		if (Static123.aClass192_2.anInt5186 == 2) {
			Static563.method7493(Static23.aClass221_3, Static41.aString20, 2);
			Static123.aClass192_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	public static void method3622() {
		if (Static493.aBoolean547) {
			return;
		}
		Static493.aBoolean547 = true;
		if (Static278.aClass3_Sub13_Sub1_1.lb) {
			Static527.aFloat183 = (int) Static527.aFloat183 + 47 & 0xFFFFFFF0;
		} else {
			Static4.aFloat1 += (12.0F - Static4.aFloat1) / 2.0F;
		}
		Static350.aBoolean631 = true;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!gfa;III)V")
	public static void method3623(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class63 local12;
		if (arg2 < Static411.anInt6927) {
			local12 = Static554.aClass63ArrayArrayArray4[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass9_Sub1_Sub3_1 != null && local12.aClass9_Sub1_Sub3_1.method7483()) {
				arg0.method7479(Static511.anInt8116, local12.aClass9_Sub1_Sub3_1, 0, 0, Static482.aClass43_12, true);
			}
		}
		if (arg3 < Static411.anInt6927) {
			local12 = Static554.aClass63ArrayArrayArray4[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass9_Sub1_Sub3_1 != null && local12.aClass9_Sub1_Sub3_1.method7483()) {
				arg0.method7479(0, local12.aClass9_Sub1_Sub3_1, Static511.anInt8116, 0, Static482.aClass43_12, true);
			}
		}
		if (arg2 < Static411.anInt6927 && arg3 < Static157.anInt3168) {
			local12 = Static554.aClass63ArrayArrayArray4[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass9_Sub1_Sub3_1 != null && local12.aClass9_Sub1_Sub3_1.method7483()) {
				arg0.method7479(Static511.anInt8116, local12.aClass9_Sub1_Sub3_1, Static511.anInt8116, 0, Static482.aClass43_12, true);
			}
		}
		if (arg2 < Static411.anInt6927 && arg3 > 0) {
			local12 = Static554.aClass63ArrayArrayArray4[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass9_Sub1_Sub3_1 != null && local12.aClass9_Sub1_Sub3_1.method7483()) {
				arg0.method7479(Static511.anInt8116, local12.aClass9_Sub1_Sub3_1, -Static511.anInt8116, 0, Static482.aClass43_12, true);
			}
		}
	}
}
