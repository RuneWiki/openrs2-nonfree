import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!be", name = "n", descriptor = "I")
	public static int anInt545;

	@OriginalMember(owner = "client!be", name = "r", descriptor = "Lclient!kv;")
	public static Class196 aClass196_1;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "[I")
	public static final int[] anIntArray42 = new int[2];

	@OriginalMember(owner = "client!be", name = "w", descriptor = "J")
	public static long aLong33 = 20000000L;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
	public static void method497() {
		Static107.anInt2177 = -1;
		Static424.anInt7715 = -1;
		Static366.aClass82_11 = null;
		Static115.anInterface7_2 = null;
		Static241.anIntArray264 = null;
		Static376.aClass31_44 = null;
		Static133.aClass31_43 = null;
		Static494.anInterface7Array1 = null;
		Static495.anInt8393 = -1;
		Static122.aClass31_11 = null;
		Static16.anInt245 = -1;
		Static172.aClass47_1.method1162();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IBIIIII)V")
	public static void method498(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static32.aClass3_Sub41_3.aClass7_Sub15_2.method5663() != 0 && arg3 != 0 && Static154.anInt3152 < 50 && arg1 != -1) {
			Static110.aClass130Array1[Static154.anInt3152++] = new Class130((byte) 1, arg1, arg3, arg4, arg0, arg2, arg5, (Class9_Sub2) null);
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	public static void method501() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static399.anInt7121; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static24.anInt345; local13++) {
				if (Static571.method8267(local9, local7, local13, Static567.aClass351ArrayArrayArray4, true)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIILclient!ha;I)V")
	public static void method503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Class82 arg3, @OriginalArg(6) int arg4) {
		if ((Static282.aClass103_29 == null || Static196.aClass103_15 == null || Static259.aClass103_27 == null) && Static419.aClass343_200.method8138(Static601.anInt9749) && Static419.aClass343_200.method8138(Static284.anInt5429) && Static419.aClass343_200.method8138(Static462.anInt7901)) {
			@Pc(27) Class251 local27 = Static656.method6331(Static419.aClass343_200, Static284.anInt5429, 0);
			Static196.aClass103_15 = arg3.method6106(local27, true);
			local27.method6332();
			Static376.aClass103_48 = arg3.method6106(local27, true);
			Static282.aClass103_29 = arg3.method6106(Static656.method6331(Static419.aClass343_200, Static601.anInt9749, 0), true);
			@Pc(52) Class251 local52 = Static656.method6331(Static419.aClass343_200, Static462.anInt7901, 0);
			Static259.aClass103_27 = arg3.method6106(local52, true);
			local52.method6332();
			Static426.aClass103_37 = arg3.method6106(local52, true);
		}
		if (Static282.aClass103_29 == null || Static196.aClass103_15 == null || Static259.aClass103_27 == null) {
			return;
		}
		@Pc(88) int local88 = (arg2 - Static259.aClass103_27.method7445() * 2) / Static282.aClass103_29.method7445();
		for (@Pc(90) int local90 = 0; local90 < local88; local90++) {
			Static282.aClass103_29.method7462(Static259.aClass103_27.method7445() + arg0 + local90 * Static282.aClass103_29.method7445(), arg4 + arg1 - Static282.aClass103_29.method7440());
		}
		@Pc(125) int local125 = (arg4 - Static259.aClass103_27.method7440() - 20) / Static196.aClass103_15.method7440();
		for (@Pc(127) int local127 = 0; local127 < local125; local127++) {
			Static196.aClass103_15.method7462(arg0, Static196.aClass103_15.method7440() * local127 + arg1 + 20);
			Static376.aClass103_48.method7462(arg2 + arg0 - Static376.aClass103_48.method7445(), local127 * Static196.aClass103_15.method7440() + 20 + arg1);
		}
		Static259.aClass103_27.method7462(arg0, arg1 + arg4 - Static259.aClass103_27.method7440());
		Static426.aClass103_37.method7462(arg2 + arg0 - Static259.aClass103_27.method7445(), -Static259.aClass103_27.method7440() + arg4 + arg1);
	}
}
