import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "[Lclient!vs;")
	public static Class20_Sub2[] aClass20_Sub2Array13;

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
	public static int anInt8015;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "Lclient!wq;")
	public static final Class381 aClass381_10 = new Class381();

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method6911(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static78.anInt1660;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(24) Class31 local24 = Static568.aClass37_1.method857(arg0[local13]);
			if (local24.anInt712 != -1) {
				@Pc(37) Class32 local37 = (Class32) Static450.aClass166_43.method4805((long) local24.anInt712);
				if (local37 == null) {
					@Pc(45) Class98 local45 = Static651.method2404(Static540.aClass353_110, local24.anInt712, 0);
					if (local45 != null) {
						local37 = Static162.aClass100_7.method8773(local45, true);
						Static450.aClass166_43.method4803(local37, (long) local24.anInt712);
					}
				}
				if (local37 != null) {
					Static428.aClass32Array16[local11] = local37;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}
