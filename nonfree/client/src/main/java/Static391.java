import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!nca", name = "r", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("a399cfc2263d0378f7c40db20a3e00a081247f39b24e3c57f8c392465337d6f1650d2024774986824928b8d50ff6c8ed83aa0673d6b95948a1a3ccd612912dbb", 16);

	@OriginalMember(owner = "client!nca", name = "x", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_63 = new Class240(43, 7);

	@OriginalMember(owner = "client!nca", name = "d", descriptor = "(B)V")
	public static void method5472() {
		Static582.method7723();
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "([II[ILclient!ee;II)Lclient!qb;")
	public static Class1_Sub2 method5475(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class95_Sub1 arg3, @OriginalArg(5) int arg4) {
		@Pc(26) int local26;
		@Pc(37) int local37;
		@Pc(39) int local39;
		if (!arg3.method8151(Static666.aClass389_16, Static111.aClass122_5)) {
			@Pc(73) int[] local73 = new int[arg1 * arg4];
			for (local26 = 0; local26 < arg4; local26++) {
				local37 = arg1 * local26 + arg0[local26];
				for (local39 = 0; local39 < arg2[local26]; local39++) {
					local73[local37++] = -16777216;
				}
			}
			return new Class1_Sub2(arg3, arg1, arg4, local73);
		}
		@Pc(24) byte[] local24 = new byte[arg4 * arg1];
		for (local26 = 0; local26 < arg4; local26++) {
			local37 = local26 * arg1 + arg0[local26];
			for (local39 = 0; local39 < arg2[local26]; local39++) {
				local24[local37++] = -1;
			}
		}
		return new Class1_Sub2(arg3, arg1, arg4, local24);
	}
}
