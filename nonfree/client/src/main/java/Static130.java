import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!md", name = "Ob", descriptor = "Z")
	public static boolean aBoolean114;

	@OriginalMember(owner = "client!md", name = "Tb", descriptor = "Lclient!oh;")
	public static Class1_Sub1_Sub10 aClass1_Sub1_Sub10_2;

	@OriginalMember(owner = "client!md", name = "Gb", descriptor = "I")
	public static int anInt2695 = 0;

	@OriginalMember(owner = "client!md", name = "Hb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_903 = Static186.method3527("flash1:");

	@OriginalMember(owner = "client!md", name = "Kb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_904 = aClass50_903;

	@OriginalMember(owner = "client!md", name = "Mb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_905 = aClass50_903;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(JB)Lclient!hh;")
	public static Class50 method2183(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) long local34 = arg0;
			@Pc(36) int local36 = 0;
			while (local34 != 0L) {
				local34 /= 37L;
				local36++;
			}
			@Pc(52) byte[] local52 = new byte[local36];
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local36--;
				local52[local36] = Static109.aByteArray33[(int) (local56 - arg0 * 37L)];
			}
			@Pc(81) Class50 local81 = new Class50();
			local81.aByteArray12 = local52;
			local81.anInt1705 = local52.length;
			return local81;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!pa;IZLclient!pa;)V")
	public static void method2185(@OriginalArg(0) Class86 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class86 arg2) {
		Static155.aClass86_58 = arg0;
		Static136.aClass86_27 = arg2;
		Static137.aBoolean120 = arg1;
	}
}
