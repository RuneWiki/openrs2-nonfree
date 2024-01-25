import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!av", name = "j", descriptor = "I")
	public static int anInt576;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method572(@OriginalArg(1) Class33 arg0) {
		if (Static619.anInt9724 != Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141 && (Static267.aClass73ArrayArrayArray2 != null && Static324.method4460(Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141, arg0))) {
			Static619.anInt9724 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(II)I")
	public static int method573(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
	public static void method574() {
		Static330.aClass66_24.method1988();
		Static287.aClass66_21.method1988();
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(II)V")
	public static void method575(@OriginalArg(0) int arg0) {
		@Pc(14) Class4_Sub5_Sub11 local14 = Static652.method8695((long) arg0, 6);
		local14.method3956();
	}
}
