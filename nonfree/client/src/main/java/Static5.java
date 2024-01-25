import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "[Lclient!o;")
	public static Class49[] aClass49Array1;

	@OriginalMember(owner = "client!ad", name = "I", descriptor = "Lclient!um;")
	public static Class243 aClass243_4;

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "Lclient!mo;")
	public static final Class163 aClass163_1 = new Class163(14, 16);

	@OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
	public static int anInt89 = -1;

	@OriginalMember(owner = "client!ad", name = "Q", descriptor = "[I")
	public static final int[] anIntArray5 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method81(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 == '<' || local24 == '>') {
				local10 += 3;
			}
		}
		@Pc(47) StringBuffer local47 = new StringBuffer(local8 + local10);
		for (@Pc(49) int local49 = 0; local49 < local8; local49++) {
			@Pc(55) char local55 = arg0.charAt(local49);
			if (local55 == '<') {
				local47.append("<lt>");
			} else if (local55 == '>') {
				local47.append("<gt>");
			} else {
				local47.append(local55);
			}
		}
		return local47.toString();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!tt;)V")
	public static void method82(@OriginalArg(1) Class200_Sub2 arg0) {
		@Pc(18) byte[] local18;
		if (Static153.anObject7 == null) {
			@Pc(9) Class92_Sub1_Sub1 local9 = new Class92_Sub1_Sub1();
			local18 = local9.method2069();
			Static153.anObject7 = Static148.method2143(local18);
		}
		if (Static36.anObject2 == null) {
			@Pc(29) Class92_Sub2_Sub1 local29 = new Class92_Sub2_Sub1();
			local18 = local29.method3793();
			Static36.anObject2 = Static148.method2143(local18);
		}
		@Pc(53) Class134 local53 = arg0.aClass134_1;
		if (local53.method2824() && Static408.anObject9 == null) {
			local18 = Static119.method2856(4.0F, 0.5F, 16.0F, 4.0F, 0.6F, new Class3_Sub1(419684));
			Static408.anObject9 = Static148.method2143(local18);
		}
	}
}
