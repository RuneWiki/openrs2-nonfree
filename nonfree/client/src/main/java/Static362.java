import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "I")
	public static int anInt4830 = 0;

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)I")
	public static int method4082() {
		@Pc(10) int local10 = 0;
		@Pc(20) Field[] local20 = sf.class.getDeclaredFields();
		for (@Pc(24) int local24 = 0; local24 < local20.length; local24++) {
			@Pc(29) Field local29 = local20[local24];
			if (jca.class.isAssignableFrom(local29.getType())) {
				local10++;
			}
		}
		return local10 + 1;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIII)Lclient!fi;")
	public static Class5_Sub21 method4083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class5_Sub21 local9 = null;
		if (arg0 == 0) {
			local9 = Static64.method905(Static263.aClass49_1, Static424.aClass305_65);
		}
		if (arg0 == 1) {
			local9 = Static64.method905(Static263.aClass49_1, Static424.aClass305_64);
		}
		local9.aClass5_Sub41_Sub2_1.method7809(Static153.anInt3147 + arg2);
		local9.aClass5_Sub41_Sub2_1.method7840(Static17.aClass252_1.method8818(82) ? 1 : 0);
		local9.aClass5_Sub41_Sub2_1.method7848(Static201.anInt3839 + arg1);
		Static209.aBoolean723 = false;
		Static680.anInt10897 = arg2;
		Static54.anInt802 = arg1;
		Static105.method2035();
		return local9;
	}
}
