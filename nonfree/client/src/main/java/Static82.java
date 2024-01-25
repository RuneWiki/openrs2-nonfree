import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "Lclient!ir;")
	public static Class100 aClass100_32;

	@OriginalMember(owner = "client!en", name = "c", descriptor = "Lclient!ir;")
	public static Class100 aClass100_33;

	@OriginalMember(owner = "client!en", name = "d", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array4;

	@OriginalMember(owner = "client!en", name = "e", descriptor = "Lclient!vn;")
	public static Class209 aClass209_1;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
	public static void method1277() {
		@Pc(7) Class39 local7 = null;
		try {
			@Pc(15) Class207 local15 = Static353.aClass42_5.method971();
			while (local15.anInt6346 == 0) {
				Static134.method2241(1L);
			}
			if (local15.anInt6346 == 1) {
				local7 = (Class39) local15.anObject7;
				@Pc(37) byte[] local37 = new byte[(int) local7.method899()];
				@Pc(52) int local52;
				for (@Pc(39) int local39 = 0; local39 < local37.length; local39 += local52) {
					local52 = local7.method901(local39, local37.length - local39, local37);
					if (local52 == -1) {
						throw new IOException("EOF");
					}
				}
				Static143.method5631(new Class3_Sub4(local37));
			}
		} catch (@Pc(76) Exception local76) {
		}
		try {
			if (local7 != null) {
				local7.method903();
			}
		} catch (@Pc(83) Exception local83) {
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BII)V")
	public static void method1278(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static149.method2419(arg0)) {
			Static310.method5217(Static311.aClass181ArrayArray1[arg0], arg1);
		}
	}
}
