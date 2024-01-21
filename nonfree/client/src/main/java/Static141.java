import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "Lclient!nh;")
	public static Class62 aClass62_36;

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
	public static int anInt3281 = 0;

	@OriginalMember(owner = "client!qe", name = "E", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1210 = Static177.method3050("Error connecting to server)3");

	@OriginalMember(owner = "client!qe", name = "s", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1208 = aClass46_1210;

	@OriginalMember(owner = "client!qe", name = "D", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1209 = Static177.method3050("<col=00ff80>");

	@OriginalMember(owner = "client!qe", name = "H", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII[Lclient!mb;II[BII)V")
	public static void method2414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class58[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(6) Class4_Sub11 local6 = new Class4_Sub11(arg6);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local6.method1240();
			if (local16 == 0) {
				return;
			}
			@Pc(23) int local23 = 0;
			local12 += local16;
			while (true) {
				@Pc(31) int local31 = local6.method1240();
				if (local31 == 0) {
					break;
				}
				@Pc(37) int local37 = local6.method1253();
				local23 += local31 - 1;
				@Pc(49) int local49 = local23 >> 6 & 0x3F;
				@Pc(53) int local53 = local23 & 0x3F;
				@Pc(57) int local57 = local23 >> 12;
				@Pc(61) int local61 = local37 >> 2;
				@Pc(65) int local65 = local37 & 0x3;
				if (local57 == arg5 && local49 >= arg1 && arg1 + 8 > local49 && arg2 <= local53 && local53 < arg2 + 8) {
					@Pc(92) Class4_Sub1_Sub19 local92 = Static113.method2090(local12);
					@Pc(110) int local110 = arg7 + Static187.method3163(local65, local92.anInt4187, arg0, local53 & 0x7, local49 & 0x7, local92.anInt4191);
					@Pc(128) int local128 = arg8 + Static147.method480(local65, local49 & 0x7, local53 & 0x7, local92.anInt4191, arg0, local92.anInt4187);
					if (local110 > 0 && local128 > 0 && local110 < 103 && local128 < 103) {
						@Pc(140) int local140 = arg4;
						@Pc(142) Class58 local142 = null;
						if ((Static53.aByteArrayArrayArray2[1][local110][local128] & 0x2) == 2) {
							local140 = arg4 - 1;
						}
						if (local140 >= 0) {
							local142 = arg3[local140];
						}
						Static85.method1708(local128, local142, local12, arg4, arg0 + local65 & 0x3, local110, local61);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	public static void method2415() {
		Static14.aClass11_2 = new Class11();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!nh;III)Z")
	public static boolean method2417(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) byte[] local14 = arg0.method2878(arg2, arg1);
		if (local14 == null) {
			return false;
		} else {
			Static117.method2131(local14);
			return true;
		}
	}
}
