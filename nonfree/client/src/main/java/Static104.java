import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
	public static int anInt3085;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)[Lclient!em;")
	public static Class48[] method2543() {
		@Pc(14) Class48[] local14 = new Class48[Static105.anInt1963];
		for (@Pc(16) int local16 = 0; local16 < Static105.anInt1963; local16++) {
			if (Static240.aBoolean369) {
				local14[local16] = new Class48_Sub1(Static214.anInt4248, Static67.anInt1375, Static227.anIntArray557[local16], Static134.anIntArray306[local16], Static49.anIntArray135[local16], Static113.anIntArray273[local16], Static299.aByteArrayArray15[local16], Static158.anIntArray366);
			} else {
				local14[local16] = new Class48_Sub2(Static214.anInt4248, Static67.anInt1375, Static227.anIntArray557[local16], Static134.anIntArray306[local16], Static49.anIntArray135[local16], Static113.anIntArray273[local16], Static299.aByteArrayArray15[local16], Static158.anIntArray366);
			}
		}
		Static247.method3867();
		return local14;
	}

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "(I)V")
	public static void method2544() {
		Static264.anIntArray276 = Static156.method1492(0.4F);
	}

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)V")
	public static void method2545() {
		Static270.aClass1_Sub18_Sub1_3.method3130(75);
		Static270.aClass1_Sub18_Sub1_3.method3093(Static136.method2157());
		Static270.aClass1_Sub18_Sub1_3.method3123(Static145.anInt2690);
		Static270.aClass1_Sub18_Sub1_3.method3123(Static166.anInt3046);
		Static270.aClass1_Sub18_Sub1_3.method3093(Static29.anInt623);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZIIIIIII)V")
	public static void method2548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) int local8 = arg5 - arg3;
		@Pc(13) int local13 = arg6 - arg7;
		@Pc(22) int local22 = (arg4 - arg1 << 16) / local13;
		@Pc(31) int local31 = (arg8 - arg0 << 16) / local8;
		Static292.method4478(arg1, local22, arg0, arg3, arg2, local31, arg5, arg7, arg6);
	}
}
