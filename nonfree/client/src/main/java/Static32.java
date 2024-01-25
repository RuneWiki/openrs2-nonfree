import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas3;

	@OriginalMember(owner = "client!bda", name = "k", descriptor = "Lclient!nba;")
	public static final Class215 aClass215_1 = new Class215();

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IBIII[BI)Z")
	public static boolean method906(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg0 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(33) int local33 = -((arg2 + 8 - 1) / 8);
		@Pc(42) int local42 = -((arg0 + 8 - 1) / 8);
		for (@Pc(49) int local49 = local33; local49 < 0; local49++) {
			for (@Pc(53) int local53 = local42; local53 < 0; local53++) {
				if (arg3[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local16;
			if (arg3[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(B)V")
	public static void method909() {
		Static420.aClass128_35.method3274();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IZIIZIIII)Z")
	public static boolean method910(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray521[0];
		@Pc(13) int local13 = Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray522[0];
		if (local8 < 0 || Static473.anInt8075 <= local8 || local13 < 0 || local13 >= Static165.anInt6749) {
			return false;
		} else if (arg3 >= 0 && arg3 < Static473.anInt8075 && arg7 >= 0 && arg7 < Static165.anInt6749) {
			@Pc(69) int local69 = Static333.method5196(arg1, local13, Static579.aClass189Array4[Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108], arg0, arg4, arg2, local8, arg7, arg3, Static328.aClass4_Sub1_Sub1_Sub2_2.method5892(), Static524.anIntArray647, arg5, arg6, Static295.anIntArray408);
			if (local69 < 1) {
				return false;
			}
			Static530.anInt8828 = Static524.anIntArray647[local69 - 1];
			Static210.anInt4254 = Static295.anIntArray408[local69 - 1];
			Static71.aBoolean107 = false;
			Static494.method6740();
			return true;
		} else {
			return false;
		}
	}
}
