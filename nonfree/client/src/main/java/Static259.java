import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!td", name = "C", descriptor = "I")
	public static int anInt5087 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;II)V")
	public static void method4047(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static31.anIntArray83[local7] = Static31.anIntArray83[local7 - 1];
			Static305.aStringArray37[local7] = Static305.aStringArray37[local7 - 1];
			Static7.aStringArray1[local7] = Static7.aStringArray1[local7 - 1];
			Static146.aStringArray17[local7] = Static146.aStringArray17[local7 - 1];
			Static210.anIntArray344[local7] = Static210.anIntArray344[local7 - 1];
		}
		Static31.anIntArray83[0] = arg4;
		Static305.aStringArray37[0] = arg0;
		Static210.anIntArray344[0] = arg3;
		Static7.aStringArray1[0] = arg1;
		Static36.anInt690 = Static131.anInt1441;
		Static146.aStringArray17[0] = arg2;
		Static174.anInt3535++;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLclient!qe;)V")
	public static void method4048(@OriginalArg(1) Class13_Sub5_Sub1 arg0) {
		@Pc(20) Class4_Sub26 local20 = (Class4_Sub26) Static5.aClass163_1.method4188(Static193.method3171(arg0.aString148));
		if (local20 == null) {
			Static276.method4340(arg0.anIntArray411[0], arg0.anIntArray418[0], 0, arg0, Static222.anInt4467, null, null);
		} else {
			local20.method3178();
		}
	}
}
