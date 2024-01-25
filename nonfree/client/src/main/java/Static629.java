import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static629 {

	@OriginalMember(owner = "client!vea", name = "Pb", descriptor = "I")
	public static int anInt10267;

	@OriginalMember(owner = "client!vea", name = "f", descriptor = "(B)Lclient!bi;")
	public static Class2_Sub2 method8677() {
		@Pc(8) Class2_Sub2 local8 = (Class2_Sub2) Static90.aClass43_3.method1082();
		if (local8 == null) {
			return new Class2_Sub2();
		} else {
			Static97.anInt1786--;
			return local8;
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(BIIII)V")
	public static void method8681(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static353.anInt6019 != 1) {
			return;
		}
		@Pc(20) int local20 = arg3 / Static208.anInt3594;
		@Pc(24) int local24 = arg0 / Static208.anInt3594;
		@Pc(28) int local28 = arg1 / Static263.anInt4574;
		@Pc(32) int local32 = arg2 / Static263.anInt4574;
		if (local20 >= Static519.anInt8647 || local24 < 0 || local28 >= Static415.anInt7233 || local32 < 0) {
			return;
		}
		if (Static519.anInt8647 <= local24) {
			local24 = Static519.anInt8647 - 1;
		}
		if (Static415.anInt7233 <= local32) {
			local32 = Static415.anInt7233 - 1;
		}
		if (local28 < 0) {
			local28 = 0;
		}
		if (local20 < 0) {
			local20 = 0;
		}
		for (@Pc(87) int local87 = local28; local87 <= local32; local87++) {
			@Pc(98) int local98 = Static340.method5004(Static604.anInt4516 + local87, Static415.anInt7233) * Static519.anInt8647;
			for (@Pc(100) int local100 = local20; local100 <= local24; local100++) {
				@Pc(111) int local111 = Static340.method5004(Static622.anInt10138 + local100, Static519.anInt8647) + local98;
				Static309.anIntArray138[local111] = Static281.anInt4834;
			}
		}
	}
}
