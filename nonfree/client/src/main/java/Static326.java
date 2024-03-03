import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!ug", name = "x", descriptor = "[Z")
	public static boolean[] aBooleanArray57;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(IB)I", line = 3)
	public static int method5856(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/awt/Canvas;I)Lclient!tr;", line = 39)
	public static Class155 method5857(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class155_Sub2");
			@Pc(15) Class155 local15 = (Class155) local11.getDeclaredConstructor().newInstance();
			local15.method5151(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class155_Sub1 local26 = new Class155_Sub1();
			local26.method5151(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ur;ZLjava/lang/String;B)V", line = 63)
	public static void method5858(@OriginalArg(0) Class130 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		@Pc(20) int local20 = Static155.aClass239_3.method6125(null, arg2, 250);
		@Pc(29) int local29 = Static155.aClass239_3.method6124(arg2, 250, null) * 13;
		Static177.aClass19_8.method2903(6, 6, local20 + 8, local29 + 4 + 4, -16777216, 0);
		Static177.aClass19_8.method2838(6, 6, local20 + 8, local29 + 4 - -4, -1, 0);
		arg0.method5894(0, 0, 10, 1, -1, null, 0, null, local29, arg2, 1, 10, null, -1, local20);
		Static344.method6222(local20 + 4 + 4, 6, local29 + 4 + 4, 6);
		if (arg1) {
			Static177.aClass19_8.method2885();
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V", line = 104)
	public static void method5860() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Class132.aBooleanArray33[local7] = false;
		}
		Class165.anInt4438 = Class83.anInt2345;
		Static5.anInt105 = Static95.anInt3588;
		Class230.anInt6443 = -1;
		Class104.anInt2714 = -1;
		Static291.anInt5899 = 5;
		Static250.anInt5013 = Static4.anInt87;
		Static214.anInt4066 = Static244.anInt4847;
		Static183.anInt3314 = Static197.anInt3773;
		Static219.anInt4302 = 0;
		Static32.anInt4456 = 0;
		Static99.anInt2215 = Static127.anInt6765;
	}
}
