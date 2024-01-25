import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!om", name = "k", descriptor = "F")
	public static float aFloat180;

	@OriginalMember(owner = "client!om", name = "p", descriptor = "Lclient!sea;")
	public static Class308 aClass308_135;

	@OriginalMember(owner = "client!om", name = "r", descriptor = "I")
	public static int anInt6760;

	@OriginalMember(owner = "client!om", name = "c", descriptor = "Lclient!gca;")
	public static Class111 aClass111_42 = new Class111();

	@OriginalMember(owner = "client!om", name = "m", descriptor = "Lclient!em;")
	public static final Class83 aClass83_143 = new Class83(2, -1);

	@OriginalMember(owner = "client!om", name = "n", descriptor = "[I")
	public static final int[] anIntArray393 = new int[4096];

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([BIIIIIB)Z")
	public static boolean method5468(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg2 + 8 - 1) / 8);
		@Pc(41) int local41 = -((arg3 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local32; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local41; local52 < 0; local52++) {
				if (arg0[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local16;
			if (arg0[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!in;I)V")
	public static void method5471(@OriginalArg(0) Class160 arg0) {
		if (!Static563.aBoolean697) {
			return;
		}
		if (arg0.anObjectArray11 != null) {
			@Pc(18) Class160 local18 = Static420.method5959(Static594.anInt9808, Static299.anInt5617);
			if (local18 != null) {
				@Pc(24) Class1_Sub22 local24 = new Class1_Sub22();
				local24.anObjectArray1 = arg0.anObjectArray11;
				local24.aClass160_9 = local18;
				local24.aClass160_10 = arg0;
				Static451.method6311(local24);
			}
		}
		@Pc(41) Class1_Sub9 local41 = Static123.method2194(Static469.aClass235_2, Static520.aClass208_112);
		local41.aClass1_Sub3_Sub1_1.method7936(arg0.anInt4199);
		local41.aClass1_Sub3_Sub1_1.method7937(arg0.anInt4205);
		local41.aClass1_Sub3_Sub1_1.method7937(Static299.anInt5617);
		local41.aClass1_Sub3_Sub1_1.method7918(arg0.anInt4146);
		local41.aClass1_Sub3_Sub1_1.method7912(Static253.anInt4623);
		local41.aClass1_Sub3_Sub1_1.method7956(Static594.anInt9808);
		Static42.method746(local41);
	}
}
