import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!vk", name = "O", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_122 = new Class237(75, -1);

	@OriginalMember(owner = "client!vk", name = "Q", descriptor = "I")
	public static int anInt7378 = -1;

	@OriginalMember(owner = "client!vk", name = "R", descriptor = "[I")
	public static final int[] anIntArray630 = new int[50];

	@OriginalMember(owner = "client!vk", name = "S", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_123 = new Class237(26, 15);

	@OriginalMember(owner = "client!vk", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString57 = "";

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZZ)Z")
	public static boolean method5708(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!ss;IB)V")
	public static void method5709(@OriginalArg(0) int arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) int arg2) {
		Static356.anInt6061 = arg0;
		Static373.aClass219_16 = arg1;
		Static362.anInt6137 = arg2;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!uo;)V")
	public static void method5710(@OriginalArg(1) Class26_Sub2_Sub2_Sub2 arg0) {
		for (@Pc(14) Class1_Sub29 local14 = (Class1_Sub29) Static14.aClass266_3.method6000(); local14 != null; local14 = (Class1_Sub29) Static14.aClass266_3.method5994()) {
			if (local14.aClass26_Sub2_Sub2_Sub2_1 == arg0) {
				if (local14.aClass1_Sub7_Sub4_3 != null) {
					Static38.aClass1_Sub7_Sub1_1.method3979(local14.aClass1_Sub7_Sub4_3);
					local14.aClass1_Sub7_Sub4_3 = null;
				}
				local14.method6071();
				return;
			}
		}
	}
}
