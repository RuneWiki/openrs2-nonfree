import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
	public static int anInt5036;

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_215 = new Class296(67, 3);

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
	public static int anInt5038 = -1;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
	public static void method4362() {
		Static122.aClass313_12.method7398();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IFIIIIZIZ)[[I")
	public static int[][] method4363(@OriginalArg(1) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class1_Sub3_Sub35 local13 = new Class1_Sub3_Sub35();
		local13.anInt7691 = 3;
		local13.aBoolean552 = false;
		local13.anInt7700 = 8;
		local13.anInt7689 = (int) (arg0 * 4096.0F);
		local13.anInt7693 = 4;
		local13.method7126();
		Static190.method2953(64, 256);
		for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
			local13.method6401(local54, local9[local54]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method4365(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(22) char local22 = arg0.charAt(local12);
			if (local22 >= 'A' && local22 <= 'Z') {
				local7 += local22 + 1 - 65;
			} else if (local22 >= 'a' && local22 <= 'z') {
				local7 += local22 - 96;
			} else if (local22 >= '0' && local22 <= '9') {
				local7 += local22 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}
}
