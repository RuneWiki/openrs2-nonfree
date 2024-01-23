import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "Lclient!ek;")
	public static Class42 aClass42_100;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
	public static int anInt5531 = -1;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString192 = "green:";

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "[I")
	public static int[] anIntArray527 = new int[5];

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString193 = "Your ignore list is full. Max of 100 users.";

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
	public static int anInt5536 = 2;

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString194 = "cyan:";

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString195 = "Please remove ";

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public static void method4384() {
		Static89.aClass157_19.method4033();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIBI)Lclient!cj;")
	public static Class2_Sub8_Sub3 method4385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 | arg2 << 8;
		@Pc(24) Class2_Sub8_Sub3 local24 = (Class2_Sub8_Sub3) Static165.aClass106_5.method2986((long) local15 << 16);
		if (local24 != null) {
			return local24;
		}
		@Pc(36) byte[] local36 = Static170.aClass42_48.method1259(Static170.aClass42_48.method1262(local15));
		if (local36 == null) {
			local15 = arg0 + 65536 << 8 | arg1;
			local24 = (Class2_Sub8_Sub3) Static165.aClass106_5.method2986((long) local15 << 16);
			if (local24 != null) {
				return local24;
			}
			local36 = Static170.aClass42_48.method1259(Static170.aClass42_48.method1262(local15));
			if (local36 == null) {
				local15 = arg1 | 0xFFFF00;
				local24 = (Class2_Sub8_Sub3) Static165.aClass106_5.method2986((long) local15 << 16);
				if (local24 != null) {
					return local24;
				}
				local36 = Static170.aClass42_48.method1259(Static170.aClass42_48.method1262(local15));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					local24 = Static238.method4691(local36);
					local24.anInt983 = arg1;
					Static165.aClass106_5.method2990((long) local15 << 16, local24);
					return local24;
				}
			} else if (local36.length > 1) {
				local24 = Static238.method4691(local36);
				local24.anInt983 = arg1;
				Static165.aClass106_5.method2990((long) local15 << 16, local24);
				return local24;
			} else {
				return null;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			local24 = Static238.method4691(local36);
			local24.anInt983 = arg1;
			Static165.aClass106_5.method2990((long) local15 << 16, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!ek;I)V")
	public static void method4386(@OriginalArg(0) Class42 arg0) {
		Static54.aClass42_16 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIILclient!ek;)[Lclient!bn;")
	public static Class2_Sub8_Sub1[] method4388(@OriginalArg(2) int arg0, @OriginalArg(3) Class42 arg1) {
		return Static187.method3282(arg1, arg0, 0) ? Static11.method219() : null;
	}
}
