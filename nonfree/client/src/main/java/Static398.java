import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!tu", name = "E", descriptor = "Lclient!ok;")
	public static Class178 aClass178_122;

	@OriginalMember(owner = "client!tu", name = "G", descriptor = "I")
	public static int anInt6357 = 0;

	@OriginalMember(owner = "client!tu", name = "M", descriptor = "J")
	public static long aLong203 = 0L;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZLclient!ya;)V")
	public static void method5050(@OriginalArg(1) Class51 arg0) {
		arg0.OA(0, 0, Static251.anInt4258, 350);
		arg0.O(0, 0, Static251.anInt4258, 350, Static55.anInt939 << 24 | 0x332277, 1);
		@Pc(32) int local32 = 350 / Static41.anInt687;
		@Pc(40) int local40;
		if (Static72.anInt1377 > 0) {
			local40 = 346 - Static41.anInt687 - 4;
			@Pc(50) int local50 = local40 * local32 / (Static72.anInt1377 + local32 - 1);
			@Pc(52) int local52 = 4;
			if (Static72.anInt1377 > 1) {
				local52 = (Static72.anInt1377 - Static68.anInt1324 - 1) * (-local50 + local40) / (Static72.anInt1377 - 1) + 4;
			}
			arg0.O(Static251.anInt4258 - 16, local52, 12, local50, Static55.anInt939 << 24 | 0x332277, 2);
			for (@Pc(89) int local89 = Static68.anInt1324; local32 + Static68.anInt1324 > local89 && local89 < Static72.anInt1377; local89++) {
				@Pc(98) String[] local98 = Static295.method3893(Static231.aStringArray52[local89], '\b');
				@Pc(107) int local107 = (Static251.anInt4258 - 16 - 8) / local98.length;
				for (@Pc(109) int local109 = 0; local109 < local98.length; local109++) {
					@Pc(118) int local118 = local107 * local109 + 8;
					arg0.OA(local118, 0, local107 + local118 - 8, 350);
					Static259.aClass63_7.method4581(-16777216, 350 - Static112.aClass57_6.anInt1596 - Static82.anInt1670 - Static41.anInt687 * (local89 - Static68.anInt1324) - 2, -1, local98[local109], local118);
				}
			}
		}
		arg0.OA(0, 0, Static251.anInt4258, 350);
		arg0.method5313(0, -1, 350 - Static82.anInt1670, Static251.anInt4258);
		Static305.aClass63_15.method4581(-16777216, 350 - Static35.aClass57_13.anInt1596 - 1, -1, "--> " + Static223.aString46, 10);
		local40 = -1;
		if (Static274.anInt4617 % 30 > 15) {
			local40 = 16777215;
		}
		arg0.method5324(350 - Static35.aClass57_13.anInt1596 - 11, 12, local40, Static35.aClass57_13.method1387("--> " + Static223.aString46.substring(0, Static422.anInt6912)) + 10);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BLjava/awt/Component;Z)Lclient!de;")
	public static Class50 method5052(@OriginalArg(1) Component arg0) {
		return new Class50_Sub1(arg0, true);
	}
}
