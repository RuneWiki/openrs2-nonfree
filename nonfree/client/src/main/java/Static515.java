import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!vm", name = "L", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[100];

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!dn;III)Lclient!oda;")
	public static Class1_Sub2_Sub12 method7894(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class1_Sub17 local14 = new Class1_Sub17(arg0.method1888(arg2, arg1));
		@Pc(47) Class1_Sub2_Sub12 local47 = new Class1_Sub2_Sub12(arg2, local14.method4491(), local14.method4491(), local14.method4481(), local14.method4481(), local14.method4487() == 1, local14.method4487(), local14.method4487());
		@Pc(51) int local51 = local14.method4487();
		for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
			local47.aClass295_37.method7533(new Class1_Sub44(local14.method4487(), local14.method4494(), local14.method4494(), local14.method4494(), local14.method4494(), local14.method4494(), local14.method4494(), local14.method4494(), local14.method4494()));
		}
		local47.method5742();
		return local47;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IBZI)Ljava/lang/String;")
	public static String method7895(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(32) int local32 = 2;
		for (@Pc(36) int local36 = arg0 / 10; local36 != 0; local36 /= 10) {
			local32++;
		}
		@Pc(51) char[] local51 = new char[local32];
		local51[0] = '+';
		for (@Pc(64) int local64 = local32 - 1; local64 > 0; local64--) {
			@Pc(68) int local68 = arg0;
			arg0 /= 10;
			@Pc(79) int local79 = local68 - arg0 * 10;
			if (local79 < 10) {
				local51[local64] = (char) (local79 + 48);
			} else {
				local51[local64] = (char) (local79 + 87);
			}
		}
		return new String(local51);
	}
}
