import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!hs", name = "J", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!hs", name = "S", descriptor = "Lclient!pq;")
	public static Class251 aClass251_67;

	@OriginalMember(owner = "client!hs", name = "x", descriptor = "Lclient!gj;")
	public static final Class120 aClass120_1 = new Class120();

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIIIIIIB)V")
	public static void method2957(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		if (arg3 < 512 || arg6 < 512 || arg3 > Static301.anInt4912 * 512 - 1024 || arg6 > (Static473.anInt7969 - 2) * 512) {
			Static550.anIntArray695[0] = Static550.anIntArray695[1] = -1;
			return;
		}
		@Pc(45) int local45 = Static490.method6768(arg3, arg2, arg6) - arg1;
		Static90.aClass34_8.G(arg0, 0, 0);
		Static176.aClass121_5.method7112(Static90.aClass34_8);
		Static176.aClass121_5.na(arg3, local45, arg6, Static550.anIntArray695);
		Static90.aClass34_8.G(-arg0, 0, 0);
		Static176.aClass121_5.method7112(Static90.aClass34_8);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I[BBI)Ljava/lang/String;")
	public static String method2960(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(27) int local27 = arg1[local17 + arg2] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(48) char local48 = Static486.aCharArray9[local27 - 128];
					if (local48 == '\u0000') {
						local48 = '?';
					}
					local27 = local48;
				}
				local8[local10++] = (char) local27;
			}
		}
		return new String(local8, 0, local10);
	}
}
