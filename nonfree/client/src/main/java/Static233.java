import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!lg", name = "V", descriptor = "F")
	public static float aFloat59;

	@OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
	public static int anInt3984 = 0;

	@OriginalMember(owner = "client!lg", name = "bb", descriptor = "Lclient!la;")
	public static final Class136 aClass136_114 = new Class136(70, 0);

	@OriginalMember(owner = "client!lg", name = "cb", descriptor = "I")
	public static int anInt3996 = 0;

	@OriginalMember(owner = "client!lg", name = "db", descriptor = "I")
	public static int anInt3997 = -1;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BZ[B)V")
	public static void method3409(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static128.aClass3_Sub25_2 == null) {
			Static128.aClass3_Sub25_2 = new Class3_Sub25(20000);
		}
		Static128.aClass3_Sub25_2.method4098(arg1, arg1.length);
		if (!arg0) {
			return;
		}
		Static454.method6192(Static128.aClass3_Sub25_2.aByteArray88);
		Static121.aClass41_Sub1Array1 = new Class41_Sub1[Static102.anInt1841];
		@Pc(36) int local36 = 0;
		for (@Pc(38) int local38 = Static73.anInt1338; local38 <= Static134.anInt2393; local38++) {
			@Pc(44) Class41_Sub1 local44 = Static157.method2462(local38);
			if (local44 != null) {
				Static121.aClass41_Sub1Array1[local36++] = local44;
			}
		}
		Static89.aBoolean107 = false;
		Static238.aLong141 = Static354.method4966();
		Static128.aClass3_Sub25_2 = null;
	}
}
