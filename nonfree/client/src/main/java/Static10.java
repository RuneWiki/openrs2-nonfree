import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ai", name = "X", descriptor = "Lclient!sf;")
	public static Class209 aClass209_1;

	@OriginalMember(owner = "client!ai", name = "Y", descriptor = "Lclient!we;")
	public static Class246 aClass246_1;

	@OriginalMember(owner = "client!ai", name = "S", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_4 = new Class211(59, -2);

	@OriginalMember(owner = "client!ai", name = "V", descriptor = "Lclient!sc;")
	public static final Class208 aClass208_1 = new Class208();

	@OriginalMember(owner = "client!ai", name = "W", descriptor = "Lclient!o;")
	public static final Class169 aClass169_11 = new Class169("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	public static void method97() {
		@Pc(12) Class237 local12 = null;
		try {
			@Pc(16) Class112 local16 = Static341.aClass162_5.method3265();
			while (local16.anInt2969 == 0) {
				Static57.method5056(1L);
			}
			if (local16.anInt2969 == 1) {
				local12 = (Class237) local16.anObject5;
				@Pc(40) byte[] local40 = new byte[(int) local12.method5211()];
				@Pc(57) int local57;
				for (@Pc(42) int local42 = 0; local42 < local40.length; local42 += local57) {
					local57 = local12.method5209(local40, local40.length - local42, local42);
					if (local57 == -1) {
						throw new IOException("EOF");
					}
				}
				Static124.method1810(new Class1_Sub33(local40));
			}
		} catch (@Pc(81) Exception local81) {
		}
		try {
			if (local12 != null) {
				local12.method5212();
			}
		} catch (@Pc(88) Exception local88) {
		}
	}
}
