import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
	public static int anInt6445;

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "Lclient!nc;")
	public static final Class208 aClass208_9 = new Class208();

	@OriginalMember(owner = "client!ov", name = "m", descriptor = "Lclient!ll;")
	public static final Class186 aClass186_2 = new Class186();

	@OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
	public static int anInt6451 = 0;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIB)Z")
	public static boolean method5478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static550.method7576(arg0, arg1) | Static151.method2221(arg1, arg0)) & Static152.method2237(arg0, arg1);
	}

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "(I)V")
	public static void method5480() {
		@Pc(7) Class133 local7 = null;
		try {
			@Pc(13) Class278 local13 = Static152.aClass57_4.method929(true, "2");
			while (local13.anInt7757 == 0) {
				Static149.method2211(1L);
			}
			if (local13.anInt7757 == 1) {
				local7 = (Class133) local13.anObject24;
				@Pc(37) byte[] local37 = new byte[(int) local7.method2789()];
				@Pc(52) int local52;
				for (@Pc(39) int local39 = 0; local39 < local37.length; local39 += local52) {
					local52 = local7.method2787(local37, local39, local37.length - local39);
					if (local52 == -1) {
						throw new IOException("EOF");
					}
				}
				Static22.method293(new Class6_Sub14(local37));
			}
		} catch (@Pc(76) Exception local76) {
		}
		try {
			if (local7 != null) {
				local7.method2788();
			}
		} catch (@Pc(83) Exception local83) {
		}
	}
}
