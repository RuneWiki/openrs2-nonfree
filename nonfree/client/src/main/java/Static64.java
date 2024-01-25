import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ds", name = "Z", descriptor = "[I")
	public static int[] anIntArray148;

	@OriginalMember(owner = "client!ds", name = "eb", descriptor = "Z")
	public static boolean aBoolean107 = false;

	@OriginalMember(owner = "client!ds", name = "ib", descriptor = "[I")
	public static final int[] anIntArray149 = new int[5];

	@OriginalMember(owner = "client!ds", name = "sb", descriptor = "I")
	public static volatile int anInt1349 = 0;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!vm;B)V")
	public static void method1087(@OriginalArg(0) Class92 arg0) {
		arg0.method4459(0, 0, Static202.anInt4258, 350);
		arg0.method4436(0, 0, Static202.anInt4258, 350, Static17.anInt362 << 24 | 0x332277, 1);
		@Pc(35) int local35;
		for (@Pc(29) int local29 = 0; local29 < 100; local29++) {
			local35 = Static139.anIntArray281[local29];
			@Pc(39) int local39 = Static327.anIntArray509[local29];
			arg0.method4436(local35, local39, 2, 2, Static258.anIntArray440[local29] << 24 | 0xFFFFFF, 1);
		}
		for (local35 = 0; local35 < Static154.aStringArray27.length; local35++) {
			Static118.aClass78_3.method4050(-1, Static154.aStringArray27[local35], 10, -16777216, 350 - Static332.anInt6590 * local35 - Static214.anInt4455 - Static232.aClass106_5.anInt3309 - 2);
		}
		arg0.method4481(350 - Static214.anInt4455, -1, Static202.anInt4258, 0);
		Static81.aClass78_2.method4050(-1, "--> " + Static260.aString193 + "*", 10, -16777216, 350 - Static242.aClass106_7.anInt3309 - 1);
	}
}
