import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!up", name = "s", descriptor = "I")
	public static int anInt9731;

	@OriginalMember(owner = "client!up", name = "u", descriptor = "I")
	public static int anInt9733 = -1;

	@OriginalMember(owner = "client!up", name = "C", descriptor = "I")
	public static int anInt9741 = -1;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Ljava/lang/String;CLjava/lang/String;I)Ljava/lang/String;")
	public static String method8046(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = local8;
		@Pc(17) int local17 = local11 - 1;
		if (local17 != 0) {
			@Pc(24) int local24 = 0;
			while (true) {
				local24 = arg1.indexOf(13, local24);
				if (local24 < 0) {
					break;
				}
				local13 += local17;
				local24++;
			}
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(local13);
		@Pc(45) int local45 = 0;
		while (true) {
			@Pc(50) int local50 = arg1.indexOf(13, local45);
			if (local50 < 0) {
				local43.append(arg1.substring(local45));
				return local43.toString();
			}
			local43.append(arg1.substring(local45, local50));
			local43.append(arg0);
			local45 = local50 + 1;
		}
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
	public static void method8047() {
		if (Static198.aClass3_Sub1_Sub10_1 != null) {
			Static198.aClass3_Sub1_Sub10_1 = null;
			Static251.method4761(Static468.anInt8459, Static280.anInt5854, Static609.anInt10063, Static285.anInt5876);
		}
	}
}
