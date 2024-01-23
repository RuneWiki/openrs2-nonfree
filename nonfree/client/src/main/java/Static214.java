import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "[Lclient!rj;")
	public static Class2_Sub3_Sub1[] aClass2_Sub3_Sub1Array10;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Lclient!jd;")
	public static Class84 aClass84_96;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "Lclient!gi;")
	public static Class61 aClass61_7;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray22 = new String[500];

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
	public static int anInt4468 = 127;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "[I")
	public static int[] anIntArray363 = new int[5];

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
	public static void method3628() {
		Static11.aClass46_4.method1077();
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)[Lclient!hk;")
	public static Class71_Sub1[] method3629() {
		@Pc(13) Class71_Sub1[] local13 = new Class71_Sub1[Static27.anInt576];
		for (@Pc(15) int local15 = 0; local15 < Static27.anInt576; local15++) {
			local13[local15] = new Class71_Sub1(Static148.anInt3175, Static260.anInt5414, Static262.anIntArray528[local15], Static40.anIntArray59[local15], Static30.anIntArray46[local15], Static19.anIntArray30[local15], Static273.aByteArrayArray115[local15], Static187.anIntArray314);
		}
		Static171.method2953();
		return local13;
	}
}
