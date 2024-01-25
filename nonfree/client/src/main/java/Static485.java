import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!rca", name = "h", descriptor = "[Lclient!s;")
	public static Class91[] aClass91Array1;

	@OriginalMember(owner = "client!rca", name = "i", descriptor = "I")
	public static int anInt8241;

	@OriginalMember(owner = "client!rca", name = "j", descriptor = "I")
	public static int anInt8242;

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "Lclient!st;")
	public static final Class314 aClass314_120 = new Class314(14, 8);

	@OriginalMember(owner = "client!rca", name = "g", descriptor = "I")
	public static int anInt8240 = 0;

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)Lclient!qea;")
	public static Class3_Sub41 method7135() {
		@Pc(7) Class4 local7 = null;
		@Pc(13) Class3_Sub41 local13 = new Class3_Sub41(Static431.aClass133_11, 0);
		try {
			@Pc(19) Class174 local19 = Static48.aClass298_12.method7290("");
			while (local19.anInt5121 == 0) {
				Static143.method2414(1L);
			}
			if (local19.anInt5121 == 1) {
				local7 = (Class4) local19.anObject12;
				@Pc(51) byte[] local51 = new byte[(int) local7.method85()];
				@Pc(66) int local66;
				for (@Pc(53) int local53 = 0; local53 < local51.length; local53 += local66) {
					local66 = local7.method79(local51, local51.length - local53, local53);
					if (local66 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class3_Sub41(new Class3_Sub9(local51), Static431.aClass133_11, 0);
			}
		} catch (@Pc(95) Exception local95) {
		}
		try {
			if (local7 != null) {
				local7.method84();
			}
		} catch (@Pc(102) Exception local102) {
		}
		return local13;
	}
}
