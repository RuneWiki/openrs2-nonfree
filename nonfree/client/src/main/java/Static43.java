import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_12 = new Class70(64, -1);

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "[I")
	public static final int[] anIntArray84 = new int[2];

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
	public static int anInt696 = 0;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
	public static int anInt697 = 0;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIZIIII)V")
	public static void method636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) Class39 local22 = Static292.aClass39ArrayArrayArray2[arg4][arg0][arg1];
		if (local22 == null) {
			local22 = new Class39(arg4);
		}
		if (arg5 == 1) {
			local22.aShort4 = (short) arg3;
			local22.aShort5 = (short) arg2;
		} else if (arg5 == 2) {
			local22.aShort6 = (short) arg2;
			local22.aShort7 = (short) arg3;
		}
		if (Static146.aBoolean750) {
			Static583.method7801();
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
	public static void method637() {
		Static375.method5037((long) Static301.anInt5197, Static16.aClass134_1);
		if (Static422.anInt7311 != -1) {
			Static508.method7080(Static422.anInt7311);
		}
		for (@Pc(19) int local19 = 0; local19 < Static367.anInt6098; local19++) {
			if (Static166.aBooleanArray5[local19]) {
				Static544.aBooleanArray24[local19] = true;
			}
			Static504.aBooleanArray14[local19] = Static166.aBooleanArray5[local19];
			Static166.aBooleanArray5[local19] = false;
		}
		Static182.anInt3238 = Static301.anInt5197;
		if (Static422.anInt7311 != -1) {
			Static367.anInt6098 = 0;
			Static102.method1687();
		}
		Static16.aClass134_1.JA();
		Static501.method6995(Static16.aClass134_1);
		@Pc(65) int local65 = Static370.method4989();
		if (local65 == -1) {
			local65 = Static447.anInt7729;
		}
		if (local65 == -1) {
			local65 = Static196.anInt3665;
		}
		Static411.method5664(local65);
		Static504.anInt5717 = 0;
	}
}
