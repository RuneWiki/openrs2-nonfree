import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!kt", name = "v", descriptor = "Lclient!jo;")
	public static Class168 aClass168_68;

	@OriginalMember(owner = "client!kt", name = "y", descriptor = "Lclient!mfa;")
	public static final Class211 aClass211_39 = new Class211();

	@OriginalMember(owner = "client!kt", name = "A", descriptor = "[I")
	public static final int[] anIntArray404 = new int[5];

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
	public static void method4662() {
		@Pc(11) Class155 local11 = null;
		try {
			@Pc(17) Class280 local17 = Static414.aClass246_5.method6136("2", true);
			while (local17.anInt8467 == 0) {
				Static566.method8004(1L);
			}
			if (local17.anInt8467 == 1) {
				local11 = (Class155) local17.anObject16;
				@Pc(41) byte[] local41 = new byte[(int) local11.method4076()];
				@Pc(56) int local56;
				for (@Pc(43) int local43 = 0; local43 < local41.length; local43 += local56) {
					local56 = local11.method4074(local41, local41.length - local43, local43);
					if (local56 == -1) {
						throw new IOException("EOF");
					}
				}
				Static195.method3707(new Class6_Sub26(local41));
			}
		} catch (@Pc(80) Exception local80) {
		}
		try {
			if (local11 != null) {
				local11.method4077();
			}
		} catch (@Pc(87) Exception local87) {
		}
	}

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "(B)V")
	public static void method4664() {
		@Pc(5) Class245 local5 = Static551.aClass245_66;
		synchronized (Static551.aClass245_66) {
			Static551.aClass245_66.method6076();
		}
	}
}
