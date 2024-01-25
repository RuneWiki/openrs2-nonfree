import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!co", name = "t", descriptor = "I")
	public static int anInt1985;

	@OriginalMember(owner = "client!co", name = "y", descriptor = "Lclient!ri;")
	public static Class284 aClass284_29;

	@OriginalMember(owner = "client!co", name = "z", descriptor = "J")
	public static long aLong34;

	@OriginalMember(owner = "client!co", name = "B", descriptor = "I")
	public static int anInt1991;

	@OriginalMember(owner = "client!co", name = "w", descriptor = "I")
	public static int anInt1988 = -1;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!ie;B)Lclient!ng;")
	public static Class3_Sub6 method1742(@OriginalArg(0) Class3_Sub26 arg0) {
		arg0.method6814();
		@Pc(21) int local21 = arg0.method6814();
		@Pc(25) Class3_Sub6 local25 = Static31.method476(local21);
		local25.anInt10200 = arg0.method6814();
		@Pc(34) int local34 = arg0.method6814();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(42) int local42 = arg0.method6814();
			local25.method8003(arg0, local42);
		}
		local25.method8012();
		return local25;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BLclient!r;)V")
	public static void method1743(@OriginalArg(1) Class31 arg0) {
		arg0.da(0, 0, Static34.anInt3201, 350);
		arg0.J(0, 0, Static34.anInt3201, 350, Static324.anInt5928 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static361.anInt6364;
		@Pc(36) int local36;
		if (Static340.anInt6134 > 0) {
			local36 = 346 - Static361.anInt6364 - 4;
			@Pc(46) int local46 = local27 * local36 / (local27 + Static340.anInt6134 - 1);
			@Pc(48) int local48 = 4;
			if (Static340.anInt6134 > 1) {
				local48 = (local36 - local46) * (-Static298.anInt5568 + -1 + Static340.anInt6134) / (Static340.anInt6134 - 1) + 4;
			}
			arg0.J(Static34.anInt3201 - 16, local48, 12, local46, Static324.anInt5928 << 24 | 0x332277, 2);
			for (@Pc(87) int local87 = Static298.anInt5568; Static298.anInt5568 + local27 > local87 && local87 < Static340.anInt6134; local87++) {
				@Pc(96) String[] local96 = Static317.method4706('\b', Static495.aStringArray41[local87]);
				@Pc(103) int local103 = (Static34.anInt3201 - 24) / local96.length;
				for (@Pc(105) int local105 = 0; local105 < local96.length; local105++) {
					@Pc(113) int local113 = local103 * local105 + 8;
					arg0.da(local113, 0, local113 + local103 - 8, 350);
					Static2.aClass63_1.method6881(Static533.method7300(local96[local105]), -16777216, local113, -1, 350 - Static318.aClass328_8.anInt9397 - Static215.anInt4497 - (local87 - Static298.anInt5568) * Static361.anInt6364 - 2);
				}
			}
		}
		Static393.aClass63_9.method6879(330, -16777216, Static34.anInt3201 - 25, -1, "Build: 625");
		arg0.da(0, 0, Static34.anInt3201, 350);
		arg0.method8042(-1, Static34.anInt3201, 0, 350 - Static215.anInt4497);
		Static465.aClass63_10.method6881("--> " + Static533.method7300(Static527.aString267), -16777216, 10, -1, 349 - Static35.aClass328_1.anInt9397);
		if (!Static269.aBoolean336) {
			return;
		}
		local36 = -1;
		if (Static397.anInt6998 % 30 > 15) {
			local36 = 16777215;
		}
		arg0.method8029(Static35.aClass328_1.method7371("--> " + Static533.method7300(Static527.aString267).substring(0, Static329.anInt5996)) + 10, -Static35.aClass328_1.anInt9397 + -11 + 350, 12, local36);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!kfa;IBII)V")
	public static void method1746(@OriginalArg(0) Class3_Sub31 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg2 << 28 | arg1 << 14 | arg3);
		@Pc(22) Class3_Sub4 local22 = (Class3_Sub4) Static537.aClass297_34.method6531(local16);
		if (local22 == null) {
			local22 = new Class3_Sub4();
			Static537.aClass297_34.method6537(local16, local22);
			local22.aClass244_1.method5570(arg0);
			return;
		}
		@Pc(49) Class133 local49 = Static272.aClass121_2.method3327(arg0.anInt5292);
		@Pc(52) int local52 = local49.anInt4397;
		if (local49.anInt4411 == 1) {
			local52 *= arg0.anInt5291 + 1;
		}
		for (@Pc(71) Class3_Sub31 local71 = (Class3_Sub31) local22.aClass244_1.method5572(); local71 != null; local71 = (Class3_Sub31) local22.aClass244_1.method5576()) {
			local49 = Static272.aClass121_2.method3327(local71.anInt5292);
			@Pc(82) int local82 = local49.anInt4397;
			if (local49.anInt4411 == 1) {
				local82 *= local71.anInt5291 + 1;
			}
			if (local82 < local52) {
				Static209.method7859(arg0, local71);
				return;
			}
		}
		local22.aClass244_1.method5570(arg0);
	}
}
