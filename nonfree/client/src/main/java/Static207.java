import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
	public static int anInt3647 = 0;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_80 = new Class55(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray9 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
	public static int anInt3651 = 2;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
	public static void method2973(@OriginalArg(1) int arg0) {
		@Pc(12) Class7_Sub4_Sub14 local12 = Static54.method750(arg0, 3);
		local12.method4710();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
	public static void method2975(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static267.anInt4536 = 1;
		Static233.anInt5382 = -1;
		Static451.method5736(arg1, arg0);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIBIII)V")
	public static void method2976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static278.method3708(arg0, Static82.anInt1667, Static316.anInt5188);
		@Pc(25) int local25 = Static278.method3708(arg2, Static82.anInt1667, Static316.anInt5188);
		@Pc(31) int local31 = Static278.method3708(arg1, Static137.anInt2576, Static293.anInt4886);
		@Pc(37) int local37 = Static278.method3708(arg4, Static137.anInt2576, Static293.anInt4886);
		for (@Pc(39) int local39 = local11; local39 <= local25; local39++) {
			Static404.method5769(Static353.anIntArrayArray48[local39], local31, local37, arg3);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ya;ILclient!ut;)I")
	public static int method2977(@OriginalArg(0) Class51 arg0, @OriginalArg(2) Class251 arg1) {
		if (arg1.anInt6607 != -1) {
			return arg1.anInt6607;
		}
		if (arg1.anInt6608 != -1) {
			@Pc(30) Class203 local30 = arg0.anInterface4_8.method3138(arg0.method5316() ? arg1.anInt6608 : arg1.anInt6602);
			if (!local30.aBoolean360) {
				return local30.aShort67;
			}
		}
		return arg1.anInt6603;
	}
}
