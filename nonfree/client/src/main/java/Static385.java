import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!ol", name = "r", descriptor = "Lclient!bp;")
	public static Class39 aClass39_2;

	@OriginalMember(owner = "client!ol", name = "s", descriptor = "F")
	public static float aFloat140;

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_70 = new Class303(74, 8);

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)Z")
	public static boolean method5693(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZIII[Lclient!wp;)V")
	public static void method5694(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class361[] arg4) {
		for (@Pc(15) int local15 = 0; local15 < arg4.length; local15++) {
			@Pc(21) Class361 local21 = arg4[local15];
			if (local21 != null && local21.anInt9663 == arg3) {
				Static572.method7700(arg1, arg2, local21, arg0);
				Static531.method7100(local21, arg2, arg1);
				if (local21.anInt9633 > local21.anInt9595 - local21.anInt9668) {
					local21.anInt9633 = local21.anInt9595 - local21.anInt9668;
				}
				if (local21.anInt9633 < 0) {
					local21.anInt9633 = 0;
				}
				if (local21.anInt9655 > local21.anInt9651 - local21.anInt9650) {
					local21.anInt9655 = local21.anInt9651 - local21.anInt9650;
				}
				if (local21.anInt9655 < 0) {
					local21.anInt9655 = 0;
				}
				if (local21.anInt9665 == 0) {
					Static70.method1495(arg0, local21);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!r;Z)V")
	public static void method5695(@OriginalArg(0) Class45 arg0) {
		arg0.da(0, 0, Static40.anInt758, 350);
		arg0.J(0, 0, Static40.anInt758, 350, Static202.anInt3741 << 24 | 0x332277, 1);
		@Pc(31) int local31 = 350 / Static422.anInt8671;
		@Pc(42) int local42;
		if (Static59.anInt1292 > 0) {
			local42 = 346 - Static422.anInt8671 - 4;
			@Pc(53) int local53 = local31 * local42 / (local31 + Static59.anInt1292 - 1);
			@Pc(55) int local55 = 4;
			if (Static59.anInt1292 > 1) {
				local55 = (local42 - local53) * (Static59.anInt1292 + (-1 - Static98.anInt1998)) / (Static59.anInt1292 - 1) + 4;
			}
			arg0.J(Static40.anInt758 - 16, local55, 12, local53, Static202.anInt3741 << 24 | 0x332277, 2);
			for (@Pc(92) int local92 = Static98.anInt1998; local92 < Static98.anInt1998 + local31 && Static59.anInt1292 > local92; local92++) {
				@Pc(101) String[] local101 = Static572.method7699('\b', Static421.aStringArray28[local92]);
				@Pc(108) int local108 = (Static40.anInt758 - 24) / local101.length;
				for (@Pc(110) int local110 = 0; local110 < local101.length; local110++) {
					@Pc(118) int local118 = local108 * local110 + 8;
					arg0.da(local118, 0, local118 + local108 - 8, 350);
					Static569.aClass54_9.method7796(Static145.method2806(local101[local110]), -16777216, local118, -1, 348 - Static521.aClass134_12.anInt3760 - Static292.anInt4989 - Static422.anInt8671 * (-Static98.anInt1998 + local92));
				}
			}
		}
		Static544.aClass54_15.method7789(-1, Static40.anInt758 - 25, "Build: 622", -16777216, 330);
		arg0.da(0, 0, Static40.anInt758, 350);
		arg0.method7427(0, 350 - Static292.anInt4989, Static40.anInt758, -1);
		Static460.aClass54_10.method7796("--> " + Static145.method2806(Static274.aString32), -16777216, 10, -1, 350 - Static75.aClass134_7.anInt3760 - 1);
		if (!Static301.aBoolean389) {
			return;
		}
		local42 = -1;
		if (Static506.anInt8251 % 30 > 15) {
			local42 = 16777215;
		}
		arg0.method7383(350 - Static75.aClass134_7.anInt3760 - 11, local42, Static75.aClass134_7.method3348("--> " + Static145.method2806(Static274.aString32).substring(0, Static252.anInt4476)) + 10, 12);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	public static void method5696() {
		for (@Pc(3) int local3 = 0; local3 < Static554.aClass344ArrayArray1.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static554.aClass344ArrayArray1[local3].length; local7++) {
				Static554.aClass344ArrayArray1[local3][local7] = Static429.aClass344_2;
			}
		}
	}
}
