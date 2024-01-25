import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "Lclient!ll;")
	public static Class146 aClass146_2;

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23;

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "[B")
	public static final byte[] aByteArray32 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BI)I")
	public static int method1325(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local28 | local28 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!ui;B)V")
	public static void method1329(@OriginalArg(0) Class230 arg0) {
		Static99.anInt1793 = 0;
		Static222.anInt4504 = 0;
		Static63.aClass208_8 = new Class208();
		Static305.aClass41_Sub2_Sub1_Sub1Array2 = new Class41_Sub2_Sub1_Sub1[1024];
		Static347.method5356(arg0);
		Static108.method1518(arg0);
	}
}
