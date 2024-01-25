import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
	public static int anInt5146;

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "[I")
	public static final int[] anIntArray336 = new int[1];

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "[F")
	public static final float[] aFloatArray23 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "[I")
	public static final int[] anIntArray337 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIIBIII)V")
	public static void method4030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(13) int local13 = arg5 - arg3;
		@Pc(17) int local17 = arg3 + arg2;
		for (@Pc(19) int local19 = arg2; local19 < local17; local19++) {
			Static2.method38(arg1, arg4, Static67.anIntArrayArray13[local19], arg6);
		}
		@Pc(42) int local42 = arg1 - arg3;
		@Pc(46) int local46 = arg3 + arg6;
		for (@Pc(48) int local48 = arg5; local48 > local13; local48--) {
			Static2.method38(arg1, arg4, Static67.anIntArrayArray13[local48], arg6);
		}
		for (@Pc(68) int local68 = local17; local68 <= local13; local68++) {
			@Pc(74) int[] local74 = Static67.anIntArrayArray13[local68];
			Static2.method38(local46, arg4, local74, arg6);
			Static2.method38(local42, arg0, local74, local46);
			Static2.method38(arg1, arg4, local74, local42);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)Z")
	public static boolean method4031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V")
	public static void method4032() {
		Static334.aClass227_33.method4981();
		for (@Pc(19) Class1_Sub19 local19 = (Class1_Sub19) Static202.aClass227_21.method4967(); local19 != null; local19 = (Class1_Sub19) Static202.aClass227_21.method4973()) {
			if (local19.anInt2416 < 1000) {
				local19.method5915();
				Static334.aClass227_33.method4972(local19);
			}
		}
		Static334.aClass227_33.method4971(Static202.aClass227_21);
		@Pc(45) int local45 = -1;
		@Pc(50) Class1_Sub24 local50 = (Class1_Sub24) Static130.aClass227_19.method4967();
		if (local50 != null) {
			local45 = local50.method2417();
		}
		if (!Static17.aBoolean39) {
			if (local45 == 0 && (Static40.anInt703 == 1 && Static118.anInt2201 > 2 || Static218.method3184())) {
				local45 = 2;
			}
			if (local45 == 2 && Static118.anInt2201 > 0 && local50 != null) {
				if (Static371.aClass124_10 == null && Static339.anInt5788 == 0) {
					Static179.method2597(local50.method2421(), local50.method2418());
				} else {
					Static195.anInt3458 = 2;
				}
			}
			if (local45 == 0 && Static118.anInt2201 > 0) {
				Static297.method4603();
			}
			if (Static371.aClass124_10 == null && Static339.anInt5788 == 0) {
				Static195.anInt3458 = 0;
				Static252.aClass1_Sub19_2 = null;
				return;
			}
			return;
		}
		@Pc(121) int local121;
		@Pc(127) int local127;
		if (local45 == -1) {
			local121 = Static62.aClass96_1.method3872();
			local127 = Static62.aClass96_1.method3870();
			if (local121 < Static129.anInt2365 - 10 || local121 > Static129.anInt2365 + Static413.anInt6778 + 10 || Static187.anInt3228 - 10 > local127 || local127 > Static187.anInt3228 + Static387.anInt6440 + 10) {
				Static145.method1627();
			}
		}
		if (local45 != 0) {
			return;
		}
		local121 = Static129.anInt2365;
		local127 = Static187.anInt3228;
		@Pc(174) int local174 = Static413.anInt6778;
		@Pc(180) int local180 = local50.method2418();
		@Pc(186) int local186 = local50.method2421();
		@Pc(188) int local188 = -1;
		@Pc(207) int local207;
		for (@Pc(190) int local190 = 0; local190 < Static118.anInt2201; local190++) {
			if (Static382.aBoolean780) {
				local207 = local127 + (Static118.anInt2201 - local190 - 1) * 16 + 33;
				if (local180 > local121 && local180 < local174 + local121 && local207 - 13 < local186 && local186 < local207 + 4) {
					local188 = local190;
				}
			} else {
				local207 = local127 + (-local190 + Static118.anInt2201 + -1) * 16 + 31;
				if (local121 < local180 && local174 + local121 > local180 && local207 - 13 < local186 && local186 < local207 + 3) {
					local188 = local190;
				}
			}
		}
		if (local188 != -1) {
			local207 = 0;
			@Pc(305) Class149 local305 = new Class149(Static202.aClass227_21);
			for (@Pc(310) Class1_Sub19 local310 = (Class1_Sub19) local305.method3487(); local310 != null; local310 = (Class1_Sub19) local305.method3484()) {
				if (local188 == local207) {
					Static35.method513(local186, local310, local180);
				}
				local207++;
			}
		}
		Static145.method1627();
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/Object;ZII)[B")
	public static byte[] method4033(@OriginalArg(0) Object arg0, @OriginalArg(3) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return Static161.method2331(local13, arg1);
		} else if (arg0 instanceof Class15) {
			@Pc(25) Class15 local25 = (Class15) arg0;
			return local25.method3812(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
