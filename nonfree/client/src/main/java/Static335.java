import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!th", name = "S", descriptor = "I")
	public static int anInt6209;

	@OriginalMember(owner = "client!th", name = "Q", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_98 = new Class183(0, -1);

	@OriginalMember(owner = "client!th", name = "T", descriptor = "[I")
	public static final int[] anIntArray534 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!th", name = "U", descriptor = "F")
	public static float aFloat72 = 0.0F;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method5402(@OriginalArg(0) String arg0) {
		return Static234.method4206(arg0, 10);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!ab;Lclient!ab;I)V")
	public static void method5403(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		Static77.method1332(Static61.aClass183_18);
		Static76.aClass2_Sub24_Sub2_7.method5734(arg1.anInt94);
		Static76.aClass2_Sub24_Sub2_7.method5721(arg1.anInt56);
		Static76.aClass2_Sub24_Sub2_7.method5735(arg0.anInt56);
		Static76.aClass2_Sub24_Sub2_7.method5721(arg0.anInt45);
		Static76.aClass2_Sub24_Sub2_7.method5735(arg1.anInt45);
		Static76.aClass2_Sub24_Sub2_7.method5754(arg0.anInt94);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!cu;IIB)V")
	public static void method5404(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(14) Class2_Sub41 local14 = (Class2_Sub41) Static314.aClass238_34.method5795(); local14 != null; local14 = (Class2_Sub41) Static314.aClass238_34.method5799()) {
			if (arg3 == local14.anInt6930 && arg2 * 128 == local14.anInt6938 && local14.anInt6932 == arg0 * 128 && arg1.anInt1234 == local14.aClass47_1.anInt1234) {
				if (local14.aClass2_Sub11_Sub2_3 != null) {
					Static192.aClass2_Sub11_Sub4_1.method4879(local14.aClass2_Sub11_Sub2_3);
					local14.aClass2_Sub11_Sub2_3 = null;
				}
				if (local14.aClass2_Sub11_Sub2_2 != null) {
					Static192.aClass2_Sub11_Sub4_1.method4879(local14.aClass2_Sub11_Sub2_2);
					local14.aClass2_Sub11_Sub2_2 = null;
				}
				local14.method6130();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
	public static void method5408() {
		if (Static375.anInt6902 < 0) {
			Static8.anInt492 = -1;
			Static375.anInt6902 = 0;
			Static79.anInt1735 = -1;
		}
		if (Static375.anInt6902 > Static20.anInt4612) {
			Static375.anInt6902 = Static20.anInt4612;
			Static8.anInt492 = -1;
			Static79.anInt1735 = -1;
		}
		if (Static208.anInt4249 < 0) {
			Static208.anInt4249 = 0;
			Static79.anInt1735 = -1;
			Static8.anInt492 = -1;
		}
		if (Static20.anInt4603 < Static208.anInt4249) {
			Static8.anInt492 = -1;
			Static79.anInt1735 = -1;
			Static208.anInt4249 = Static20.anInt4603;
		}
	}
}
