import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!oja", name = "C", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_86 = new Class44(121, 9);

	@OriginalMember(owner = "client!oja", name = "F", descriptor = "[I")
	public static final int[] anIntArray351 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!oja", name = "G", descriptor = "I")
	public static int anInt4560 = -1;

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(Z)V")
	public static void method3774() {
		Static325.anInt6165 = 0;
		@Pc(17) int local17 = Static329.anInt6225 + (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998 >> 9);
		@Pc(24) int local24 = Static202.anInt3755 + (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002 >> 9);
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static325.anInt6165 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static325.anInt6165 = 1;
		}
		if (Static325.anInt6165 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static325.anInt6165 = 0;
		}
	}

	@OriginalMember(owner = "client!oja", name = "b", descriptor = "(Z)V")
	public static void method3775() {
		for (@Pc(10) Class14_Sub3_Sub4 local10 = (Class14_Sub3_Sub4) Static551.aClass262_40.method6318(); local10 != null; local10 = (Class14_Sub3_Sub4) Static551.aClass262_40.method6311()) {
			@Pc(15) Class12_Sub2_Sub2_Sub5 local15 = local10.aClass12_Sub2_Sub2_Sub5_1;
			if (local15.aBoolean741) {
				local10.method9315();
				local15.method8974();
			} else if (Static87.anInt1951 >= local15.anInt10772) {
				local15.method8973(Static475.anInt8259);
				if (local15.aBoolean741) {
					local10.method9315();
				} else {
					Static662.method9184(local15, true);
				}
			}
		}
	}
}
