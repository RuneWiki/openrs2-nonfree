import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array15;

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "Ljava/lang/Object;")
	public static Object anObject13;

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
	public static int anInt5044;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
	public static int anInt5035 = 0;

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "Z")
	public static boolean aBoolean410 = false;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BII)I")
	public static int method4103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)I")
	public static int method4106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) int local17 = arg2 & 0xF;
		@Pc(26) int local26 = local17 < 8 ? arg0 : arg3;
		@Pc(43) int local43 = local17 < 4 ? arg3 : local17 == 12 || local17 == 14 ? arg0 : arg1;
		return ((local17 & 0x2) == 0 ? local43 : -local43) + ((local17 & 0x1) == 0 ? local26 : -local26);
	}
}
