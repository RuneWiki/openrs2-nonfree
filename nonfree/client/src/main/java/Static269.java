import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "F")
	public static float aFloat150;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "Lclient!cg;")
	public static Class22 aClass22_95;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
	public static int anInt5357;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "[I")
	public static int[] anIntArray419 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I")
	public static int method4236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = arg0 * (arg1 & 0x7F) >> 7;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0 + (arg1 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)V")
	public static void method4237(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub2_Sub15 local8 = Static131.method1210(arg0, 9);
		local8.method2875();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method4238(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static221.anInt4249 = arg0;
		Static157.aString16 = arg1;
		Static256.aString170 = arg2;
		if (Static157.aString16.equals("") || Static256.aString170.equals("")) {
			Static140.anInt2773 = 3;
		} else if (Static250.anInt4906 == -1) {
			Static174.anInt3541 = 1;
			Static263.anInt5160 = 0;
			Static37.anInt2375 = 0;
			Static140.anInt2773 = -3;
			@Pc(44) Class4_Sub24 local44 = new Class4_Sub24(128);
			local44.method3116(10);
			local44.method3066((int) (Math.random() * 9.9999999E7D));
			local44.method3079(Static193.method3171(Static157.aString16));
			local44.method3066((int) (Math.random() * 9.9999999E7D));
			local44.method3095(Static256.aString170);
			local44.method3066((int) (Math.random() * 9.9999999E7D));
			local44.method3076(Static8.aBigInteger1, Static154.aBigInteger2);
			Static175.aClass4_Sub24_Sub1_1.anInt3822 = 0;
			Static175.aClass4_Sub24_Sub1_1.method3116(24);
			Static175.aClass4_Sub24_Sub1_1.method3116(local44.anInt3822 + 2);
			Static175.aClass4_Sub24_Sub1_1.method3105(546);
			Static175.aClass4_Sub24_Sub1_1.method3091(local44.anInt3822, local44.aByteArray47);
		} else {
			Static240.method2128();
		}
	}
}
