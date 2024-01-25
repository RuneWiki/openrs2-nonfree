import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
	public static int anInt4255;

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "Lclient!bg;")
	public static Class24 aClass24_6;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[8];

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "Lclient!vf;")
	public static final Class238 aClass238_19 = new Class238();

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
	public static int anInt4261 = -50;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "Lclient!db;")
	public static final Class49 aClass49_5 = new Class49("WTWIP", 3);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
	public static void method3787() {
		@Pc(7) Class248 local7 = null;
		try {
			@Pc(11) Class86 local11 = Static154.aClass123_2.method3267();
			while (local11.anInt2590 == 0) {
				Static215.method3855(1L);
			}
			if (local11.anInt2590 == 1) {
				local7 = (Class248) local11.anObject2;
				@Pc(39) Class2_Sub24 local39 = new Class2_Sub24(Static350.anInt6469 * 6 + 3);
				local39.method5746(1);
				local39.method5721(Static350.anInt6469);
				for (@Pc(49) int local49 = 0; local49 < Static318.anIntArray509.length; local49++) {
					if (Static137.aBooleanArray7[local49]) {
						local39.method5721(local49);
						local39.method5734(Static318.anIntArray509[local49]);
					}
				}
				local7.method6005(local39.aByteArray100, local39.anInt6669, 0);
			}
		} catch (@Pc(80) Exception local80) {
		}
		try {
			if (local7 != null) {
				local7.method6004();
			}
		} catch (@Pc(87) Exception local87) {
		}
		Static194.aLong117 = Static101.method1805();
		Static176.aBoolean269 = false;
	}
}
