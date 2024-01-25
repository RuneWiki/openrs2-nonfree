import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
	public static int anInt6594 = -1;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!tp;I)V")
	public static void method5416(@OriginalArg(0) Class331 arg0) {
		if (Static368.anInt6985 != arg0.anInt9556) {
			return;
		}
		if (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aString35 == null) {
			arg0.anInt9495 = 0;
			arg0.anInt9518 = 0;
			return;
		}
		arg0.anInt9517 = 150;
		arg0.anInt9550 = (int) (Math.sin((double) Static435.anInt8192 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt9566 = 5;
		arg0.anInt9518 = Static616.anInt10362;
		arg0.anInt9495 = Static136.method2948(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aString35);
		arg0.anInt9538 = 0;
		arg0.anInt9579 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt8107;
		arg0.anInt9493 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt8110;
		arg0.anInt9573 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt8131;
		@Pc(79) Class97 local79 = arg0.anInt9579 == -1 ? null : Static28.aClass220_1.method5670(arg0.anInt9579);
		if (local79 != null) {
			Static168.method3340(local79, arg0.anInt9493);
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V")
	public static void method5417() {
		Static370.anInt7031 = -1;
		Static29.anInt1137 = -1;
		Static266.anInt5673 = 0;
		Static599.anInt10218 = -1;
	}
}
