import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!st", name = "j", descriptor = "I")
	public static int anInt8751;

	@OriginalMember(owner = "client!st", name = "e", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_295 = new Class288(26, 7);

	@OriginalMember(owner = "client!st", name = "h", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_113 = new Class179(2, 7);

	@OriginalMember(owner = "client!st", name = "i", descriptor = "I")
	public static int anInt8750 = 0;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIIII)V")
	public static void method7362(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(6) Class13_Sub5 local6 = (Class13_Sub5) Static246.aClass171_4.method3745(); local6 != null; local6 = (Class13_Sub5) Static246.aClass171_4.method3744()) {
			if (Static262.anInt5597 >= local6.anInt4036) {
				local6.method8394();
			} else {
				Static568.method7796((local6.anInt4029 << 9) + 256, local6.anInt4035, (local6.anInt4032 << 9) + 256, arg2 >> 1, local6.anInt4033 * 2, arg0 >> 1);
				Static194.aClass62_22.method5691(arg1 + Static526.anIntArray588[0], local6.anInt4031 | 0xFF000000, local6.aString40, 0, arg3 + Static526.anIntArray588[1]);
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
	public static void method7363() {
		if (Static324.anInt5145 == 7) {
			Static211.method2746(false);
		} else {
			Static120.aClass121_1 = Static155.aClass121_2;
			Static155.aClass121_2 = null;
			Static158.method2370(13);
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZIZI)Ljava/lang/String;")
	public static String method7364(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(39) int local39 = 2;
		for (@Pc(43) int local43 = arg0 / 10; local43 != 0; local43 /= 10) {
			local39++;
		}
		@Pc(58) char[] local58 = new char[local39];
		local58[0] = '+';
		for (@Pc(66) int local66 = local39 - 1; local66 > 0; local66--) {
			@Pc(70) int local70 = arg0;
			arg0 /= 10;
			@Pc(80) int local80 = local70 - arg0 * 10;
			if (local80 < 10) {
				local58[local66] = (char) (local80 + 48);
			} else {
				local58[local66] = (char) (local80 + 87);
			}
		}
		return new String(local58);
	}
}
