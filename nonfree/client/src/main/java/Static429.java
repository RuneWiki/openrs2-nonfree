import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_76 = new Class344(62, 11);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
	public static void method6379() {
		if (Static294.aClass15_2 != null) {
			Static294.aClass15_2.method5349();
		}
		if (Static364.aClass15_3 != null) {
			Static364.aClass15_3.method5349();
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V")
	public static void method6380() {
		@Pc(7) Class354 local7 = null;
		try {
			@Pc(13) Class316 local13 = Static372.aClass366_5.method8266("2", true);
			while (local13.anInt9478 == 0) {
				Static214.method3478(1L);
			}
			if (local13.anInt9478 == 1) {
				local7 = (Class354) local13.anObject136;
				@Pc(35) byte[] local35 = new byte[(int) local7.method8081()];
				@Pc(49) int local49;
				for (@Pc(37) int local37 = 0; local37 < local35.length; local37 += local49) {
					local49 = local7.method8083(local35.length - local37, local35, local37);
					if (local49 == -1) {
						throw new IOException("EOF");
					}
				}
				Static443.method6529(new Class4_Sub13(local35));
			}
		} catch (@Pc(74) Exception local74) {
		}
		try {
			if (local7 != null) {
				local7.method8089();
			}
		} catch (@Pc(86) Exception local86) {
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Z")
	public static boolean method6381(@OriginalArg(1) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}
}
