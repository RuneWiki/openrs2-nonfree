import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "Lclient!nu;")
	public static Class266 aClass266_1;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
	public static int anInt4586 = 0;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "F")
	public static float aFloat64 = 0.0F;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)Z")
	public static boolean method4186(@OriginalArg(1) int arg0) {
		if (Static247.anInt3836 != arg0 || Static647.aClass151_4 == null) {
			Static647.aClass151_4 = Static232.aClass151_1;
			Static247.anInt3836 = arg0;
		}
		@Pc(50) int local50;
		if (Static647.aClass151_4 == Static232.aClass151_1) {
			@Pc(33) byte[] local33 = Static560.aClass254_138.method6079(arg0);
			if (local33 == null) {
				return false;
			}
			@Pc(43) Class2_Sub20 local43 = new Class2_Sub20(local33);
			Static313.method4357(local43);
			local50 = local43.method8581(-17416);
			for (@Pc(52) int local52 = 0; local52 < local50; local52++) {
				Static131.aClass60_42.method1233(new Class2_Sub32(local43));
			}
			@Pc(75) int local75 = local43.method8592(255);
			Static73.aClass256Array1 = new Class256[local75];
			for (@Pc(80) int local80 = 0; local80 < local75; local80++) {
				Static73.aClass256Array1[local80] = new Class256(local43);
			}
			@Pc(101) int local101 = local43.method8592(255);
			Static199.aClass61Array1 = new Class61[local101];
			for (@Pc(106) int local106 = 0; local106 < local101; local106++) {
				Static199.aClass61Array1[local106] = new Class61(local43, local106);
			}
			@Pc(128) int local128 = local43.method8592(255);
			Static486.aClass398Array1 = new Class398[local128];
			for (@Pc(133) int local133 = 0; local133 < local128; local133++) {
				Static486.aClass398Array1[local133] = new Class398(local43);
			}
			@Pc(158) int local158 = local43.method8592(255);
			Static566.aClass42Array1 = new Class42[local158];
			for (@Pc(163) int local163 = 0; local163 < local158; local163++) {
				Static566.aClass42Array1[local163] = new Class42(local43);
			}
			@Pc(188) int local188 = local43.method8592(255);
			Static578.aClass15Array1 = new Class15[local188];
			for (@Pc(193) int local193 = 0; local193 < local188; local193++) {
				Static578.aClass15Array1[local193] = Static44.method588(local43);
			}
			Static647.aClass151_4 = Static232.aClass151_2;
		}
		if (Static647.aClass151_4 == Static232.aClass151_2) {
			@Pc(220) boolean local220 = true;
			@Pc(222) Class15[] local222 = Static578.aClass15Array1;
			for (local50 = 0; local50 < local222.length; local50++) {
				@Pc(230) Class15 local230 = local222[local50];
				if (!local230.method9377()) {
					local220 = false;
				}
			}
			if (!local220) {
				return false;
			}
			Static647.aClass151_4 = Static232.aClass151_3;
		}
		return true;
	}
}
