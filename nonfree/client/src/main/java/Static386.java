import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
	public static int anInt6719;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "Lclient!cq;")
	public static Class38 aClass38_1 = new Class38(8);

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "Z")
	public static boolean aBoolean447 = true;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "Z")
	public static boolean aBoolean448 = false;

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
	public static int anInt6718 = 2;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)Z")
	public static boolean method5221(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 9 || arg0 == 1008 || arg0 == 46 || arg0 == 45;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(FIIBIIZI)[I")
	public static int[] method5225(@OriginalArg(0) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class4_Sub2_Sub10 local10 = new Class4_Sub2_Sub10();
		local10.aBoolean188 = true;
		local10.anInt2447 = (int) (arg0 * 4096.0F);
		local10.anInt2453 = 8;
		local10.anInt2451 = 4;
		local10.anInt2449 = 8;
		local10.anInt2452 = 35;
		local10.method5845();
		Static105.method1659(2048, 1);
		local10.method1841(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!co;III)V")
	public static void method5226(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static420.aLongArrayArrayArray128[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt4351 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass4_Sub8Array3[arg0.anInt4351++] = Static200.aClass169Array1[local21 - 1].aClass4_Sub8_1;
			local9 += 16L;
		}
		for (local21 = arg0.anInt4351; local21 < 4; local21++) {
			arg0.aClass4_Sub8Array3[local21] = null;
		}
	}
}
