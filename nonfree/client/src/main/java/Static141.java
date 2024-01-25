import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!hp", name = "S", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!hp", name = "R", descriptor = "Lclient!dt;")
	public static Class62 aClass62_9 = null;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZIBZ)V")
	public static void method2245(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		Static205.method302(arg3, 0, Static97.aClass23_Sub1Array1.length - 1, arg2, arg1, arg0);
		Static197.anInt3538 = 0;
		Static113.aClass3_Sub2_1 = null;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIII)V")
	public static void method2248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(12) int local12 = -arg1;
		@Pc(14) int local14 = -1;
		Static349.method5265(arg3 - arg1, arg1 + arg3, arg0, Static325.anIntArrayArray50[arg2]);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(51) int[] local51 = Static325.anIntArrayArray50[arg2 + local9];
				@Pc(57) int[] local57 = Static325.anIntArrayArray50[arg2 - local9];
				@Pc(61) int local61 = local7 + arg3;
				@Pc(66) int local66 = arg3 - local7;
				Static349.method5265(local66, local61, arg0, local51);
				Static349.method5265(local66, local61, arg0, local57);
			}
			@Pc(83) int local83 = arg3 + local9;
			@Pc(88) int local88 = arg3 - local9;
			@Pc(95) int[] local95 = Static325.anIntArrayArray50[arg2 + local7];
			@Pc(102) int[] local102 = Static325.anIntArrayArray50[arg2 - local7];
			Static349.method5265(local88, local83, arg0, local95);
			Static349.method5265(local88, local83, arg0, local102);
		}
	}
}
