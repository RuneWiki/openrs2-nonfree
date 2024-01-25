import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "[Lclient!na;")
	public static Class159[] aClass159Array1;

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "Lclient!uu;")
	public static Class251 aClass251_1;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "Lclient!hv;")
	public static Class106 aClass106_1;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "Lclient!fi;")
	public static final Class77 aClass77_1 = new Class77(0);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method594(@OriginalArg(1) Class172 arg0) {
		arg0.pa(0, 0, Static333.anInt5712, 350);
		arg0.NA(0, 0, Static333.anInt5712, 350, Static323.anInt1153 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static49.anInt1181;
		@Pc(37) int local37;
		if (Static213.anInt4089 > 0) {
			local37 = 342 - Static49.anInt1181;
			@Pc(47) int local47 = local27 * local37 / (Static213.anInt4089 + local27 - 1);
			@Pc(49) int local49 = 4;
			if (Static213.anInt4089 > 1) {
				local49 = (local37 - local47) * (-Static183.anInt3946 + Static213.anInt4089 + -1) / (Static213.anInt4089 - 1) + 4;
			}
			arg0.NA(Static333.anInt5712 - 16, local49, 12, local47, Static323.anInt1153 << 24 | 0x332277, 2);
			for (@Pc(86) int local86 = Static183.anInt3946; Static183.anInt3946 + local27 > local86 && local86 < Static213.anInt4089; local86++) {
				@Pc(95) String[] local95 = Static379.method4945(Static271.aStringArray36[local86], '\b');
				@Pc(102) int local102 = (Static333.anInt5712 - 24) / local95.length;
				for (@Pc(104) int local104 = 0; local104 < local95.length; local104++) {
					@Pc(112) int local112 = local104 * local102 + 8;
					arg0.pa(local112, 0, local112 + local102 - 8, 350);
					Static299.aClass59_3.method5788(-16777216, local95[local104], -1, local112, 348 - (local86 - Static183.anInt3946) * Static49.anInt1181 - Static146.anInt2985 - Static391.aClass70_32.anInt2270);
				}
			}
		}
		arg0.pa(0, 0, Static333.anInt5712, 350);
		arg0.method5517(0, -1, 350 - Static146.anInt2985, Static333.anInt5712);
		Static321.aClass59_4.method5788(-16777216, "--> " + Static392.aString57, -1, 10, 349 - Static269.aClass70_27.anInt2270);
		local37 = -1;
		if (Static253.anInt4787 % 30 > 15) {
			local37 = 16777215;
		}
		arg0.method5504(12, Static269.aClass70_27.method1759("--> " + Static392.aString57.substring(0, Static73.anInt1828)) + 10, 350 - Static269.aClass70_27.anInt2270 - 11, local37);
	}
}
