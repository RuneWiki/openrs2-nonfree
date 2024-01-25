import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "Lclient!s;")
	public static final Class217 aClass217_49 = new Class217(26, 7);

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
	public static int anInt2209 = 0;

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "Lclient!lb;")
	public static final Class151 aClass151_5 = new Class151("LIVE", 0);

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ph;BLclient!ph;Lclient!ph;Lclient!ph;)V")
	public static void method1930(@OriginalArg(0) Class187 arg0, @OriginalArg(2) Class187 arg1, @OriginalArg(3) Class187 arg2, @OriginalArg(4) Class187 arg3) {
		Static173.aClass187_70 = arg0;
		Static52.aClass187_15 = arg2;
		Static348.aClass187_107 = arg1;
		Static317.aClass187_93 = arg3;
		Static166.aClass89ArrayArray2 = new Class89[Static348.aClass187_107.method4302()][];
		Static416.aBooleanArray22 = new boolean[Static348.aClass187_107.method4302()];
	}

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V")
	public static void method1931() {
		@Pc(7) Class108 local7 = null;
		try {
			@Pc(13) Class270 local13 = Static171.aClass159_1.method3514("2", true);
			while (local13.anInt7548 == 0) {
				Static328.method5696(1L);
			}
			if (local13.anInt7548 == 1) {
				local7 = (Class108) local13.anObject9;
				@Pc(40) byte[] local40 = new byte[(int) local7.method2645()];
				@Pc(55) int local55;
				for (@Pc(42) int local42 = 0; local42 < local40.length; local42 += local55) {
					local55 = local7.method2646(local42, local40, local40.length - local42);
					if (local55 == -1) {
						throw new IOException("EOF");
					}
				}
				Static70.method1358(new Class10_Sub8(local40));
			}
		} catch (@Pc(80) Exception local80) {
		}
		try {
			if (local7 != null) {
				local7.method2643();
			}
		} catch (@Pc(87) Exception local87) {
		}
	}
}
