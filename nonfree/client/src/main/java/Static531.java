import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
	public static int anInt9137;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)Z")
	public static boolean method7239(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static251.anInt4609; local1 < Static431.anInt7712; local1++) {
			@Pc(6) Class133[][] local6 = Static113.aClass133ArrayArrayArray1[local1];
			for (@Pc(9) int local9 = -Static2.anInt40; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static207.anInt3926 + local9;
				@Pc(18) int local18 = Static207.anInt3926 - local9;
				if (local14 >= Static538.anInt9252 || local18 < Static70.anInt1182) {
					for (@Pc(27) int local27 = -Static2.anInt40; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static3.anInt7083 + local27;
						@Pc(36) int local36 = Static3.anInt7083 - local27;
						@Pc(48) Class133 local48;
						if (local14 >= Static538.anInt9252) {
							if (local32 >= Static203.anInt3852) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean302) {
									Static486.aBoolean560 = arg0;
									Static221.aClass175_1.method4153(local48);
									Static221.aClass175_1.method4154();
								}
							}
							if (local36 < Static210.anInt3998) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean302) {
									Static486.aBoolean560 = arg0;
									Static221.aClass175_1.method4153(local48);
									Static221.aClass175_1.method4154();
								}
							}
						}
						if (local18 < Static70.anInt1182) {
							if (local32 >= Static203.anInt3852) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean302) {
									Static486.aBoolean560 = arg0;
									Static221.aClass175_1.method4153(local48);
									Static221.aClass175_1.method4154();
								}
							}
							if (local36 < Static210.anInt3998) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean302) {
									Static486.aBoolean560 = arg0;
									Static221.aClass175_1.method4153(local48);
									Static221.aClass175_1.method4154();
								}
							}
						}
						if (Static324.anInt6153 == 0) {
							if (Static301.aBoolean384) {
								Static221.aClass175_1.method4159(24);
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
