import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!lda", name = "V", descriptor = "Lclient!n;")
	public static Class123_Sub1 aClass123_Sub1_1;

	@OriginalMember(owner = "client!lda", name = "Z", descriptor = "I")
	public static int anInt5974 = 0;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILclient!ek;)Lclient!sm;")
	public static Class306 method4713(@OriginalArg(1) Class4_Sub13 arg0) {
		@Pc(7) String local7 = arg0.method7016();
		@Pc(14) Class347 local14 = Static302.method4802()[arg0.method7004()];
		@Pc(21) Class214 local21 = Static106.method1999()[arg0.method7004()];
		@Pc(25) int local25 = arg0.method7043();
		@Pc(29) int local29 = arg0.method7043();
		@Pc(33) int local33 = arg0.method7004();
		@Pc(37) int local37 = arg0.method7004();
		@Pc(43) int local43 = arg0.method7004();
		@Pc(54) int local54 = arg0.method7054();
		@Pc(58) int local58 = arg0.method7054();
		@Pc(62) int local62 = arg0.method6990();
		@Pc(66) int local66 = arg0.method6990();
		@Pc(70) int local70 = arg0.method6990();
		return new Class306(local7, local14, local21, local25, local29, local33, local37, local43, local54, local58, local62, local66, local70);
	}

	@OriginalMember(owner = "client!lda", name = "d", descriptor = "(III)Z")
	public static boolean method4715(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
