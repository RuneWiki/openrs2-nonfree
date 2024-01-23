import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!nc", name = "V", descriptor = "[I")
	public static int[] anIntArray293;

	@OriginalMember(owner = "client!nc", name = "fb", descriptor = "I")
	public static int anInt3613;

	@OriginalMember(owner = "client!nc", name = "jb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!nc", name = "qb", descriptor = "Lclient!jb;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!nc", name = "T", descriptor = "[I")
	public static int[] anIntArray292 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

	@OriginalMember(owner = "client!nc", name = "eb", descriptor = "[I")
	public static int[] anIntArray294 = new int[2];

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(II)V")
	public static void method2925(@OriginalArg(1) int arg0) {
		if (Static249.method3997(arg0)) {
			Static115.method2112(Static219.aClass115ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)V")
	public static void method2926() {
		Static74.aClass46_10.method1068(5);
		Static285.aClass46_41.method1068(5);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!t;)V")
	public static void method2928(@OriginalArg(1) Class36_Sub3 arg0) {
		if (arg0.anInt5123 == Static148.anInt3168 || arg0.anInt5087 == -1 || arg0.anInt5070 != 0 || arg0.anInt5081 + 1 > Static35.method706(arg0.anInt5087).anIntArray28[arg0.anInt5106]) {
			@Pc(35) int local35 = arg0.anInt5123 - arg0.anInt5121;
			@Pc(40) int local40 = Static148.anInt3168 - arg0.anInt5121;
			@Pc(52) int local52 = arg0.anInt5144 * 128 + arg0.method4097() * 64;
			@Pc(66) int local66 = arg0.anInt5104 * 128 + arg0.method4097() * 64;
			@Pc(77) int local77 = arg0.anInt5073 * 128 + arg0.method4097() * 64;
			@Pc(88) int local88 = arg0.anInt5124 * 128 + arg0.method4097() * 64;
			arg0.anInt5109 = (local88 * local40 + (local35 - local40) * local66) / local35;
			arg0.anInt5093 = (local52 * (local35 - local40) + local77 * local40) / local35;
		}
		arg0.anInt5137 = 0;
		if (arg0.anInt5130 == 0) {
			arg0.anInt5063 = 1024;
		}
		if (arg0.anInt5130 == 1) {
			arg0.anInt5063 = 1536;
		}
		if (arg0.anInt5130 == 2) {
			arg0.anInt5063 = 0;
		}
		if (arg0.anInt5130 == 3) {
			arg0.anInt5063 = 512;
		}
		arg0.anInt5069 = arg0.anInt5063;
	}
}
