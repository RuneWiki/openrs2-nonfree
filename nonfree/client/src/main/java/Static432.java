import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "[I")
	public static final int[] anIntArray395 = new int[13];

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_79 = new Class341(86, -1);

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
	public static int anInt7901 = 0;

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "[I")
	public static final int[] anIntArray396 = new int[6];

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I")
	public static int method7061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static503.anIntArrayArray38 == null ? 0 : Static503.anIntArrayArray38[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
	public static void method7063() {
		@Pc(10) int local10 = 0;
		if (Static230.aClass2_Sub54_15 != null) {
			local10 = Static230.aClass2_Sub54_15.aClass4_Sub2_1.method172();
		}
		@Pc(29) int local29;
		@Pc(36) int local36;
		if (local10 == 2) {
			local29 = Static97.anInt1735 <= 800 ? Static97.anInt1735 : 800;
			local36 = Static360.anInt6884 <= 600 ? Static360.anInt6884 : 600;
			Static17.anInt8637 = (Static97.anInt1735 - local29) / 2;
			Static406.anInt7570 = local29;
			Static309.anInt5584 = 0;
			Static19.anInt352 = local36;
		} else if (local10 == 1) {
			local29 = Static97.anInt1735 > 1024 ? 1024 : Static97.anInt1735;
			Static406.anInt7570 = local29;
			Static17.anInt8637 = (Static97.anInt1735 - local29) / 2;
			local36 = Static360.anInt6884 > 768 ? 768 : Static360.anInt6884;
			Static19.anInt352 = local36;
			Static309.anInt5584 = 0;
		} else {
			Static19.anInt352 = Static360.anInt6884;
			Static17.anInt8637 = 0;
			Static406.anInt7570 = Static97.anInt1735;
			Static309.anInt5584 = 0;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)I")
	public static int method7064(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local28 | local28 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZI)V")
	public static void method7065(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			@Pc(6) Class2_Sub52 local6 = Static311.method5098(Static245.aClass341_52, Static125.aClass179_1);
			local6.aClass2_Sub8_Sub2_2.method5192(arg0);
			Static38.method791(local6);
		} else {
			Static518.method8030(Static42.aClass340_3, arg0, -1);
		}
	}
}
