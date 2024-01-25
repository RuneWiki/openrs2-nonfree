import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "Lclient!qa;")
	public static Class42 aClass42_5;

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_52 = new Class77(71, 12);

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
	public static int anInt5566 = -1;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)V")
	public static void method4674(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class12_Sub4_Sub1 local8 = Static389.method6156(12, arg1);
		local8.method820();
		local8.anInt806 = arg0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)Z")
	public static boolean method4675(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static477.anInt8709; local1 < Static36.anInt8450; local1++) {
			@Pc(6) Class37[][] local6 = Static120.aClass37ArrayArrayArray1[local1];
			for (@Pc(9) int local9 = -Static307.anInt5970; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static176.anInt3987 + local9;
				@Pc(18) int local18 = Static176.anInt3987 - local9;
				if (local14 >= Static355.anInt6649 || local18 < Static59.anInt1440) {
					for (@Pc(27) int local27 = -Static307.anInt5970; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static412.anInt7717 + local27;
						@Pc(36) int local36 = Static412.anInt7717 - local27;
						@Pc(48) Class37 local48;
						if (local14 >= Static355.anInt6649) {
							if (local32 >= Static415.anInt3796) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean48) {
									Static182.aBoolean338 = arg0;
									Static308.aClass126_1.method7347(local48);
									Static308.aClass126_1.method7342();
								}
							}
							if (local36 < Static369.anInt6844) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean48) {
									Static182.aBoolean338 = arg0;
									Static308.aClass126_1.method7347(local48);
									Static308.aClass126_1.method7342();
								}
							}
						}
						if (local18 < Static59.anInt1440) {
							if (local32 >= Static415.anInt3796) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean48) {
									Static182.aBoolean338 = arg0;
									Static308.aClass126_1.method7347(local48);
									Static308.aClass126_1.method7342();
								}
							}
							if (local36 < Static369.anInt6844) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean48) {
									Static182.aBoolean338 = arg0;
									Static308.aClass126_1.method7347(local48);
									Static308.aClass126_1.method7342();
								}
							}
						}
						if (Static96.anInt2250 == 0) {
							if (Static205.aBoolean359) {
								Static308.aClass126_1.method7340(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
