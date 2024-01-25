import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
	public static int anInt2803;

	@OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
	public static int anInt2808;

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
	public static int anInt2804 = 0;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!dn;I)V")
	public static void method2619(@OriginalArg(0) Class69 arg0) {
		Static275.aClass69_55 = arg0;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!jj;I)Ljava/lang/String;")
	public static String method2620(@OriginalArg(0) Class1_Sub25 arg0) {
		return arg0.aString95 == null || arg0.aString95.length() <= 0 ? arg0.aString94 : arg0.aString94 + Static354.aClass45_99.method1474(Static544.anInt7853) + arg0.aString95;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method2622(@OriginalArg(1) String arg0) {
		@Pc(14) long local14 = 0L;
		@Pc(17) int local17 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			local14 *= 37L;
			@Pc(29) char local29 = arg0.charAt(local19);
			if (local29 >= 'A' && local29 <= 'Z') {
				local14 += local29 + 1 - 65;
			} else if (local29 >= 'a' && local29 <= 'z') {
				local14 += local29 - 96;
			} else if (local29 >= '0' && local29 <= '9') {
				local14 += local29 + 27 - 48;
			}
			if (local14 >= 177917621779460413L) {
				break;
			}
		}
		while (local14 % 37L == 0L && local14 != 0L) {
			local14 /= 37L;
		}
		return local14;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(FFIF)I")
	public static int method2623(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(21) float local21 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(31) float local31 = arg2 < (float) 0 ? -arg2 : arg2;
		if (local12 < local21 && local31 < local21) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local12 < local31 && local31 > local21) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
