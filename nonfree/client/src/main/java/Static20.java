import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "I")
	public static int anInt357;

	@OriginalMember(owner = "client!aja", name = "f", descriptor = "I")
	public static int anInt361;

	@OriginalMember(owner = "client!aja", name = "e", descriptor = "[I")
	public static final int[] anIntArray33 = new int[14];

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(ZLclient!ol;)Lclient!lu;")
	public static Class226_Sub1 method379(@OriginalArg(1) Class2_Sub8 arg0) {
		@Pc(12) Class226 local12 = Static172.method3362(arg0);
		@Pc(16) int local16 = arg0.method5193();
		return new Class226_Sub1(local12.anInt6813, local12.aClass236_7, local12.aClass103_7, local12.anInt6815, local12.anInt6814, local16);
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(IIII)V")
	public static void method381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == Static283.anInt5221 && arg1 == Static584.anInt4542 && arg2 == Static387.anInt7331) {
			return;
		}
		Static283.anInt5221 = arg0;
		Static387.anInt7331 = arg2;
		Static207.aBoolean327 = true;
		Static584.anInt4542 = arg1;
		@Pc(39) double local39 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(49) double local49 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(57) double local57 = Math.cos(local49);
		@Pc(60) double local60 = Math.sin(local49);
		@Pc(63) double local63 = Math.cos(local39);
		@Pc(66) double local66 = Math.sin(local39);
		Static573.aDouble23 = -local60 * local63;
		Static426.aDouble31 = local60;
		Static456.aDouble16 = local57;
		Static300.aDouble22 = 0.0D;
		Static579.aDouble24 = local66;
		Static223.aDouble13 = local63;
		Static142.aDouble3 = local63 * local57;
		Static598.aDouble26 = -local57 * local66;
		Static522.aDouble21 = local60 * local66;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IC)Ljava/lang/String;")
	public static String method382(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = local8;
		@Pc(17) int local17 = local11 - 1;
		if (local17 != 0) {
			@Pc(32) int local32 = 0;
			while (true) {
				local32 = arg0.indexOf(13, local32);
				if (local32 < 0) {
					break;
				}
				local13 += local17;
				local32++;
			}
		}
		@Pc(54) StringBuffer local54 = new StringBuffer(local13);
		@Pc(56) int local56 = 0;
		while (true) {
			@Pc(61) int local61 = arg0.indexOf(13, local56);
			if (local61 < 0) {
				local54.append(arg0.substring(local56));
				return local54.toString();
			}
			local54.append(arg0.substring(local56, local61));
			local56 = local61 + 1;
			local54.append(arg1);
		}
	}
}
