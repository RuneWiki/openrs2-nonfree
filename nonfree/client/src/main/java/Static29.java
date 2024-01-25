import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "[I")
	public static int[] anIntArray34;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)V")
	public static void method385(@OriginalArg(1) int arg0) {
		@Pc(16) Class3_Sub40 local16 = (Class3_Sub40) Static580.aClass25_45.method426((long) arg0);
		if (local16 != null) {
			local16.aBoolean532 = !local16.aBoolean532;
			local16.aClass172_Sub1_1.method7051(local16.aBoolean532);
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;")
	public static String method386(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(22) int local22 = local8;
		@Pc(26) int local26 = local11 - 1;
		if (local26 != 0) {
			@Pc(30) int local30 = 0;
			while (true) {
				local30 = arg1.indexOf(13, local30);
				if (local30 < 0) {
					break;
				}
				local22 += local26;
				local30++;
			}
		}
		@Pc(49) StringBuffer local49 = new StringBuffer(local22);
		@Pc(51) int local51 = 0;
		while (true) {
			@Pc(56) int local56 = arg1.indexOf(13, local51);
			if (local56 < 0) {
				local49.append(arg1.substring(local51));
				return local49.toString();
			}
			local49.append(arg1.substring(local51, local56));
			local51 = local56 + 1;
			local49.append(arg0);
		}
	}
}
