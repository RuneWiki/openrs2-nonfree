import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static653 {

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "[I")
	public static int[] anIntArray608;

	@OriginalMember(owner = "client!waa", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!waa", name = "d", descriptor = "Lclient!kaa;")
	public static Class196 aClass196_39;

	@OriginalMember(owner = "client!waa", name = "e", descriptor = "I")
	public static int anInt10666 = 0;

	@OriginalMember(owner = "client!waa", name = "k", descriptor = "Lclient!eh;")
	public static final Class94 aClass94_5 = new Class94();

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIIIIII)V")
	public static void method8999(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(3) Class212[] local3 = Static8.aClass212Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(24) Class212 local24 = local3[local5];
			if (local24 != null && local24.anInt5367 == 2) {
				Static402.method5854(local24.anInt5366, local24.anInt5372, local24.anInt5371 * 2, local24.anInt5374, 256, arg2 >> 1, 256, arg1 >> 1, -65536);
				if (Static663.anIntArray616[0] > -1 && Static565.anInt8921 % 20 < 10) {
					@Pc(78) Class155 local78 = Static453.aClass155Array19[local24.anInt5370];
					@Pc(86) int local86 = Static663.anIntArray616[0] + arg0 - 12;
					@Pc(95) int local95 = arg3 + Static663.anIntArray616[1] - 28;
					local78.method7202(local86, local95);
					Static395.method5811(local95, local78.method7206() + local86, local95 + local78.method7209(), local86);
				}
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!wq;I)Lclient!du;")
	public static Class88 method9001(@OriginalArg(0) Class5_Sub36 arg0) {
		@Pc(7) int local7 = arg0.method7291();
		@Pc(14) Class189 local14 = Static447.method6379()[arg0.method7291()];
		@Pc(21) Class346 local21 = Static378.method5602()[arg0.method7291()];
		@Pc(25) int local25 = arg0.method7303();
		@Pc(29) int local29 = arg0.method7303();
		@Pc(33) int local33 = arg0.method7333();
		@Pc(37) int local37 = arg0.method7333();
		@Pc(49) int local49 = arg0.method7268();
		@Pc(53) int local53 = arg0.method7268();
		@Pc(57) int local57 = arg0.method7268();
		@Pc(69) boolean local69 = arg0.method7291() == 1;
		return new Class88(local7, local14, local21, local25, local29, local33, local37, local49, local53, local57, local69);
	}
}
