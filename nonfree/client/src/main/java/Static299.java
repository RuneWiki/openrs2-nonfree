import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "Lclient!ik;")
	public static Class182 aClass182_75;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;CLjava/lang/String;I)Ljava/lang/String;")
	public static String method4204(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = local8;
		@Pc(17) int local17 = local11 - 1;
		if (local17 != 0) {
			@Pc(21) int local21 = 0;
			while (true) {
				local21 = arg1.indexOf(13, local21);
				if (local21 < 0) {
					break;
				}
				local21++;
				local13 += local17;
			}
		}
		@Pc(40) StringBuffer local40 = new StringBuffer(local13);
		@Pc(42) int local42 = 0;
		while (true) {
			@Pc(47) int local47 = arg1.indexOf(13, local42);
			if (local47 < 0) {
				local40.append(arg1.substring(local42));
				return local40.toString();
			}
			local40.append(arg1.substring(local42, local47));
			local42 = local47 + 1;
			local40.append(arg0);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!ika;)Lclient!kha;")
	public static Class210 method4205(@OriginalArg(1) Class3_Sub2 arg0) {
		@Pc(13) Class210 local13 = new Class210();
		local13.anInt5499 = arg0.method2028(-14795);
		local13.aClass3_Sub7_Sub20_1 = Static134.aClass246_1.method5420(local13.anInt5499);
		return local13;
	}
}
