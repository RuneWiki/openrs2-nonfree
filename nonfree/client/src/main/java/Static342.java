import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!mr", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString159 = "";

	@OriginalMember(owner = "client!mr", name = "P", descriptor = "Z")
	public static boolean aBoolean435 = true;

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "(I)[Lclient!mea;")
	public static Class201[] method4995() {
		return new Class201[] { Static199.aClass201_9, Static62.aClass201_6, Static309.aClass201_12 };
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZB[B)Ljava/lang/Object;")
	public static Object method4996(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static115.aBoolean189) {
			try {
				@Pc(26) Class28 local26 = (Class28) Class.forName("Class28_Sub1").getDeclaredConstructor().newInstance();
				local26.method2606(arg0);
				return local26;
			} catch (@Pc(33) Throwable local33) {
				Static115.aBoolean189 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)Z")
	public static boolean method4997() {
		@Pc(7) boolean local7 = true;
		if (Static475.aClass365_2 == null) {
			if (Static194.aClass284_60.method6347(Static170.anInt8905)) {
				Static475.aClass365_2 = Static607.method8165(Static194.aClass284_60, Static170.anInt8905);
			} else {
				local7 = false;
			}
		}
		if (Static203.aClass365_1 == null) {
			if (Static194.aClass284_60.method6347(Static60.anInt1603)) {
				Static203.aClass365_1 = Static607.method8165(Static194.aClass284_60, Static60.anInt1603);
			} else {
				local7 = false;
			}
		}
		if (Static520.aClass365_3 == null) {
			if (Static194.aClass284_60.method6347(Static220.anInt4592)) {
				Static520.aClass365_3 = Static607.method8165(Static194.aClass284_60, Static220.anInt4592);
			} else {
				local7 = false;
			}
		}
		if (Static584.aClass328_13 == null) {
			if (Static336.aClass284_99.method6347(Static489.anInt9294)) {
				Static584.aClass328_13 = Static410.method5763(Static489.anInt9294, Static336.aClass284_99);
			} else {
				local7 = false;
			}
		}
		if (Static56.aClass365Array1 == null) {
			if (Static194.aClass284_60.method6347(Static489.anInt9294)) {
				Static56.aClass365Array1 = Static607.method8164(Static194.aClass284_60, Static489.anInt9294);
			} else {
				local7 = false;
			}
		}
		return local7;
	}
}
