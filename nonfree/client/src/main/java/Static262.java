import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!mn", name = "o", descriptor = "[S")
	public static short[] aShortArray72;

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "Lclient!jf;")
	public static Class122 aClass122_2;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!bc;III)V")
	public static void method3349(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static76.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt6451 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass5_Sub19Array2[arg0.anInt6451++] = Static68.aClass111Array1[local21 - 1].aClass5_Sub19_2;
			local9 += 16L;
		}
		for (local21 = arg0.anInt6451; local21 < 4; local21++) {
			arg0.aClass5_Sub19Array2[local21] = null;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	public static void method3350() {
		Static329.aClass21_1.method5369();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static447.aLongArray37[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static43.aLongArray28[local24] = 0L;
		}
		Static195.anInt3248 = 0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V")
	public static void method3351(@OriginalArg(0) int arg0) {
		@Pc(12) Class5_Sub2_Sub9 local12 = Static72.method1073(12, arg0);
		local12.method3024();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V")
	public static void method3352() {
		Static105.aClass5_Sub41_1 = new Class5_Sub41(Static260.aClass198_70.method4012(Static38.anInt4834), "", Static333.anInt5333, 1011, -1, 0L, 0, 0, true, false);
	}
}
