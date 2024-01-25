import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "Lclient!aea;")
	public static Class8 aClass8_7;

	@OriginalMember(owner = "client!rv", name = "w", descriptor = "Lclient!rg;")
	public static Class291 aClass291_5;

	@OriginalMember(owner = "client!rv", name = "A", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_108 = new Class61(17, 3);

	@OriginalMember(owner = "client!rv", name = "F", descriptor = "Lclient!hi;")
	public static final Class141 aClass141_13 = new Class141(2);

	@OriginalMember(owner = "client!rv", name = "G", descriptor = "I")
	public static final int anInt7940 = 1407;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BI)Lclient!lj;")
	public static Class210 method6559(@OriginalArg(1) int arg0) {
		@Pc(13) Class210[] local13 = Static528.method7386();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (arg0 == local13[local15].anInt5497) {
				return local13[local15];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(Z)V")
	public static void method6561() {
		@Pc(12) Class4_Sub41 local12 = Static128.method2707(Static279.aClass61_60, Class16_Sub3.lb);
		local12.aClass4_Sub9_Sub1_3.method5961(-345277664, 0);
		Static551.method7603(local12);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILclient!eh;I)V")
	public static void method6563(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub9 arg1) {
		if (Static268.aClass56_4 == null) {
			return;
		}
		try {
			Static268.aClass56_4.method1123(0L);
			Static268.aClass56_4.method1127(24, arg0, arg1.aByteArray97);
		} catch (@Pc(14) Exception local14) {
		}
	}
}
