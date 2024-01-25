import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "Lclient!ke;")
	public static Class70 aClass70_1;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_326 = new Class22(107, -1);

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[200];

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_327 = new Class22(103, 6);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!ya;I)V")
	public static void method5498(@OriginalArg(0) Class19 arg0) {
		arg0.OA(0, 0, Static141.anInt2881, 350);
		arg0.O(0, 0, Static141.anInt2881, 350, Static259.anInt4882 << 24 | 0x332277, 1);
		@Pc(33) int local33 = 350 / Static181.anInt3464;
		@Pc(45) int local45;
		if (Static93.anInt1881 > 0) {
			local45 = 346 - Static181.anInt3464 - 4;
			@Pc(55) int local55 = local33 * local45 / (local33 + Static93.anInt1881 - 1);
			@Pc(57) int local57 = 4;
			if (Static93.anInt1881 > 1) {
				local57 = (Static93.anInt1881 - Static167.anInt3231 - 1) * (-local55 + local45) / (Static93.anInt1881 - 1) + 4;
			}
			arg0.O(Static141.anInt2881 - 16, local57, 12, local55, Static259.anInt4882 << 24 | 0x332277, 2);
			for (@Pc(96) int local96 = Static167.anInt3231; local96 < Static167.anInt3231 + local33 && local96 < Static93.anInt1881; local96++) {
				@Pc(105) String[] local105 = Static113.method2058(Static102.aStringArray8[local96], '\b');
				@Pc(112) int local112 = (Static141.anInt2881 - 24) / local105.length;
				for (@Pc(114) int local114 = 0; local114 < local105.length; local114++) {
					@Pc(122) int local122 = local114 * local112 + 8;
					arg0.OA(local122, 0, local122 + local112 - 8, 350);
					Static207.aClass46_9.method5058(-16777216, -1, local105[local114], 350 - (local96 - Static167.anInt3231) * Static181.anInt3464 - Static363.anInt6275 - Static34.aClass89_1.anInt2778 - 2, local122);
				}
			}
		}
		arg0.OA(0, 0, Static141.anInt2881, 350);
		arg0.method4256(Static141.anInt2881, 350 - Static363.anInt6275, 0, -1);
		Static331.aClass46_10.method5058(-16777216, -1, "--> " + Static117.aString29, 350 - Static118.aClass89_5.anInt2778 - 1, 10);
		local45 = -1;
		if (Static24.anInt5323 % 30 > 15) {
			local45 = 16777215;
		}
		arg0.method4240(350 - Static118.aClass89_5.anInt2778 - 11, 12, Static118.aClass89_5.method2340("--> " + Static117.aString29.substring(0, Static238.anInt4511)) + 10, local45);
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
	public static void method5500() {
		Static348.aClipboard1 = null;
		Static69.aBoolean292 = false;
		Static369.method4940();
	}
}
