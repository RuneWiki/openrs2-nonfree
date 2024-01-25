import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bd", name = "ab", descriptor = "Lclient!te;")
	public static final Class318 aClass318_2 = new Class318("", 14);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)V")
	public static void method576(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static278.aClass3_Sub13_Sub1_1.anInt5153 != 0 && arg2 != 0 && Static407.anInt6912 < 50 && arg3 != -1) {
			Static567.aClass232Array1[Static407.anInt6912++] = new Class232((byte) 1, arg3, arg2, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!r;)V")
	public static void method590(@OriginalArg(1) Class43 arg0) {
		arg0.da(0, 0, Static318.anInt5754, 350);
		arg0.J(0, 0, Static318.anInt5754, 350, Static470.anInt7686 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static508.anInt8080;
		@Pc(48) int local48;
		if (Static536.anInt8399 > 0) {
			@Pc(38) int local38 = 346 - Static508.anInt8080 - 4;
			local48 = local27 * local38 / (local27 + Static536.anInt8399 - 1);
			@Pc(50) int local50 = 4;
			if (Static536.anInt8399 > 1) {
				local50 = (local38 - local48) * (-Static442.anInt8541 + Static536.anInt8399 - 1) / (Static536.anInt8399 - 1) + 4;
			}
			arg0.J(Static318.anInt5754 - 16, local50, 12, local48, Static470.anInt7686 << 24 | 0x332277, 2);
			for (@Pc(87) int local87 = Static442.anInt8541; local27 + Static442.anInt8541 > local87 && local87 < Static536.anInt8399; local87++) {
				@Pc(96) String[] local96 = Static583.method7710('\b', Static190.aStringArray24[local87]);
				@Pc(105) int local105 = (Static318.anInt5754 - 8 - 16) / local96.length;
				for (@Pc(107) int local107 = 0; local107 < local96.length; local107++) {
					@Pc(115) int local115 = local105 * local107 + 8;
					arg0.da(local115, 0, local115 + local105 - 8, 350);
					Static49.aClass117_1.method7654(Static390.method5749(local96[local107]), 350 - Static103.aClass58_6.anInt2031 - Static355.anInt6156 - (local87 - Static442.anInt8541) * Static508.anInt8080 - 2, -1, local115, -16777216);
				}
			}
		}
		Static410.aClass117_8.method7659(-1, Static318.anInt5754 - 25, -16777216, "Build: 620", 330);
		arg0.da(0, 0, Static318.anInt5754, 350);
		arg0.method7200(0, -1, Static318.anInt5754, 350 - Static355.anInt6156);
		Static480.aClass117_9.method7654("--> " + Static390.method5749(Static6.aString2), 350 - Static159.aClass58_7.anInt2031 - 1, -1, 10, -16777216);
		if (!Static538.aBoolean658) {
			return;
		}
		local48 = -1;
		if (Static305.anInt5560 % 30 > 15) {
			local48 = 16777215;
		}
		arg0.method7213(Static159.aClass58_7.method1767("--> " + Static390.method5749(Static6.aString2).substring(0, Static186.anInt3605)) + 10, 12, local48, 350 - Static159.aClass58_7.anInt2031 - 11);
	}
}
