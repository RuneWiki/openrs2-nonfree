import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Lclient!tf;")
	public static Class322 aClass322_124;

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "Lclient!vc;")
	public static Class344 aClass344_2;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_143 = new Class56(33, 8);

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)Z")
	public static boolean method6065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static230.method3587(arg0, arg1) | Static246.method3792(arg0, arg1) | Static64.method1419(arg0, arg1)) & Static338.method4801(arg1, arg0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBI)Z")
	public static boolean method6066(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static302.method4446(arg0, arg1) || Static187.method3171(arg0, arg1);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	public static void method6068() {
		@Pc(11) Class204 local11 = null;
		try {
			@Pc(17) Class39 local17 = Static237.aClass258_3.method5895("2", true);
			while (local17.anInt894 == 0) {
				Static589.method7892(1L);
			}
			if (local17.anInt894 == 1) {
				local11 = (Class204) local17.anObject2;
				@Pc(44) byte[] local44 = new byte[(int) local11.method4676()];
				@Pc(58) int local58;
				for (@Pc(46) int local46 = 0; local46 < local44.length; local46 += local58) {
					local58 = local11.method4681(local44, local46, local44.length - local46);
					if (local58 == -1) {
						throw new IOException("EOF");
					}
				}
				Static165.method2985(new Class3_Sub11(local44));
			}
		} catch (@Pc(87) Exception local87) {
		}
		try {
			if (local11 != null) {
				local11.method4677();
			}
		} catch (@Pc(94) Exception local94) {
		}
	}
}
