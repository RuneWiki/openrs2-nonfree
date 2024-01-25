import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!er", name = "a", descriptor = "I")
	public static int anInt2527 = 104;

	@OriginalMember(owner = "client!er", name = "d", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_31 = new Class158(83, 6);

	@OriginalMember(owner = "client!er", name = "e", descriptor = "Z")
	public static boolean aBoolean189 = true;

	@OriginalMember(owner = "client!er", name = "f", descriptor = "Lclient!eea;")
	public static final Class71 aClass71_21 = new Class71();

	@OriginalMember(owner = "client!er", name = "g", descriptor = "[I")
	public static final int[] anIntArray257 = new int[8];

	@OriginalMember(owner = "client!er", name = "h", descriptor = "I")
	public static int anInt2530 = 0;

	@OriginalMember(owner = "client!er", name = "i", descriptor = "[S")
	public static final short[] aShortArray63 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!rt;I)Ljava/lang/String;")
	public static String method2163(@OriginalArg(0) Class3_Sub27 arg0) {
		return Static24.method775(arg0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	public static void method2165() {
		@Pc(7) Class323 local7 = null;
		try {
			@Pc(13) Class212 local13 = Static401.aClass285_11.method7034(true, "2");
			while (local13.anInt6547 == 0) {
				Static327.method5231(1L);
			}
			if (local13.anInt6547 == 1) {
				local7 = (Class323) local13.anObject13;
				@Pc(38) byte[] local38 = new byte[(int) local7.method7799()];
				@Pc(53) int local53;
				for (@Pc(40) int local40 = 0; local40 < local38.length; local40 += local53) {
					local53 = local7.method7797(local40, local38, local38.length - local40);
					if (local53 == -1) {
						throw new IOException("EOF");
					}
				}
				Static311.method5067(new Class3_Sub27(local38));
			}
		} catch (@Pc(77) Exception local77) {
		}
		try {
			if (local7 != null) {
				local7.method7794();
			}
		} catch (@Pc(84) Exception local84) {
		}
	}
}
