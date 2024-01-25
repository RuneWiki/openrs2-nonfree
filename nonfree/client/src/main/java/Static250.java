import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_63 = new Class71(76, -1);

	@OriginalMember(owner = "client!jfa", name = "e", descriptor = "I")
	public static int anInt5522 = 0;

	@OriginalMember(owner = "client!jfa", name = "h", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_64 = new Class71(78, 2);

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Z)V")
	public static void method4532() {
		@Pc(7) Class379 local7 = null;
		try {
			@Pc(13) Class301 local13 = Static51.aClass118_1.method3396("2");
			while (local13.anInt8915 == 0) {
				Static214.method4061(1L);
			}
			if (local13.anInt8915 == 1) {
				local7 = (Class379) local13.anObject18;
				@Pc(38) byte[] local38 = new byte[(int) local7.method8627()];
				@Pc(52) int local52;
				for (@Pc(40) int local40 = 0; local40 < local38.length; local40 += local52) {
					local52 = local7.method8634(local38, local40, local38.length - local40);
					if (local52 == -1) {
						throw new IOException("EOF");
					}
				}
				Static224.method4177(new Class8_Sub8(local38));
			}
		} catch (@Pc(76) Exception local76) {
		}
		try {
			if (local7 != null) {
				local7.method8628();
			}
		} catch (@Pc(83) Exception local83) {
		}
	}
}
