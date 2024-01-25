import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "I")
	public static int anInt3253;

	@OriginalMember(owner = "client!hw", name = "o", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!hw", name = "j", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_49 = new Class212(22, -1);

	@OriginalMember(owner = "client!hw", name = "m", descriptor = "I")
	public static int anInt3257 = 0;

	@OriginalMember(owner = "client!hw", name = "n", descriptor = "I")
	public static final int anInt3258 = 1401;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZI)Z")
	public static boolean method2901(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)Z")
	public static boolean method2903(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static87.aBoolean142) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(22) int local22 = arg0 & 0xFFFF;
		if (Static122.aClass240ArrayArray2[local13] == null || Static122.aClass240ArrayArray2[local13][local22] == null) {
			return false;
		}
		@Pc(40) Class240 local40 = Static122.aClass240ArrayArray2[local13][local22];
		@Pc(52) Class4_Sub14 local52;
		if (arg1 == -1 && local40.anInt6873 == 0) {
			for (local52 = (Class4_Sub14) Static289.aClass91_31.method2584(); local52 != null; local52 = (Class4_Sub14) Static289.aClass91_31.method2586()) {
				if (local52.anInt2132 == 3 || local52.anInt2132 == 1008 || local52.anInt2132 == 51 || local52.anInt2132 == 6 || local52.anInt2132 == 11) {
					for (@Pc(148) Class240 local148 = Static92.method1820(local52.anInt2135); local148 != null; local148 = Static71.method1564(local148)) {
						if (local148.anInt6909 == local40.anInt6909) {
							return true;
						}
					}
				}
			}
		} else {
			for (local52 = (Class4_Sub14) Static289.aClass91_31.method2584(); local52 != null; local52 = (Class4_Sub14) Static289.aClass91_31.method2586()) {
				if (local52.anInt2133 == arg1 && local40.anInt6909 == local52.anInt2135 && (local52.anInt2132 == 3 || local52.anInt2132 == 1008 || local52.anInt2132 == 51 || local52.anInt2132 == 6 || local52.anInt2132 == 11)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!ci;I)V")
	public static void method2904(@OriginalArg(0) Class38 arg0) {
		Static351.aClass38_73 = arg0;
	}
}
