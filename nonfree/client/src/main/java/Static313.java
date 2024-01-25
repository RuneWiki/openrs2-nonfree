import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
	public static int anInt6151;

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
	public static int anInt6146 = 2;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
	public static void method5190() {
		@Pc(1) Class107 local1 = Static197.aClass107_22;
		synchronized (Static197.aClass107_22) {
			Static197.aClass107_22.method3015();
		}
		local1 = Static257.aClass107_35;
		synchronized (Static257.aClass107_35) {
			Static257.aClass107_35.method3015();
		}
		local1 = Static338.aClass107_54;
		synchronized (Static338.aClass107_54) {
			Static338.aClass107_54.method3015();
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5191(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local15 += 3;
			}
		}
		@Pc(49) StringBuffer local49 = new StringBuffer(local15 + local8);
		for (@Pc(51) int local51 = 0; local51 < local8; local51++) {
			@Pc(57) char local57 = arg0.charAt(local51);
			if (local57 == '<') {
				local49.append("<lt>");
			} else if (local57 == '>') {
				local49.append("<gt>");
			} else {
				local49.append(local57);
			}
		}
		return local49.toString();
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!mr;II)V")
	public static void method5192(@OriginalArg(0) Class1_Sub2_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static6.anInt91 < arg0.anInt6956) {
			Static343.method3352(arg0);
		} else if (Static6.anInt91 <= arg0.anInt6933) {
			Static353.method5004(arg0);
		} else {
			Static109.method2120(false, arg0);
			local7 = Static316.anInt6235;
			local9 = Static118.anInt2491;
		}
		if (arg0.anInt6893 < 128 || arg0.anInt6888 < 128 || arg0.anInt6893 >= Static66.anInt1177 * 128 - 128 || arg0.anInt6888 >= Static12.anInt213 * 128 - 128) {
			local7 = -1;
			local9 = 0;
			arg0.anInt6902 = -1;
			arg0.anInt6956 = 0;
			arg0.anInt6933 = 0;
			arg0.anInt6915 = -1;
			arg0.anInt6893 = arg0.anIntArray535[0] * 128 + arg0.method5787() * 64;
			arg0.anInt6888 = arg0.anIntArray534[0] * 128 + arg0.method5787() * 64;
			arg0.method5786();
		}
		if (Static177.aClass1_Sub2_Sub3_Sub1_1 == arg0 && (arg0.anInt6893 < 1536 || arg0.anInt6888 < 1536 || arg0.anInt6893 >= (Static66.anInt1177 - 12) * 128 || Static12.anInt213 * 128 - 1536 <= arg0.anInt6888)) {
			arg0.anInt6933 = 0;
			arg0.anInt6902 = -1;
			local7 = -1;
			local9 = 0;
			arg0.anInt6956 = 0;
			arg0.anInt6915 = -1;
			arg0.anInt6893 = arg0.anIntArray535[0] * 128 + arg0.method5787() * 64;
			arg0.anInt6888 = arg0.anIntArray534[0] * 128 + arg0.method5787() * 64;
			arg0.method5786();
		}
		@Pc(210) int local210 = Static180.method3461(arg0);
		Static19.method272(local9, arg0, local7, local210);
		Static155.method3198(arg0);
	}
}
