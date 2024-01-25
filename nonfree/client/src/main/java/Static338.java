import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!to", name = "R", descriptor = "Lclient!b;")
	public static Class20 aClass20_87;

	@OriginalMember(owner = "client!to", name = "N", descriptor = "Lclient!us;")
	public static final Class234 aClass234_114 = new Class234(77, 12);

	@OriginalMember(owner = "client!to", name = "Q", descriptor = "[B")
	public static final byte[] aByteArray81 = new byte[2048];

	@OriginalMember(owner = "client!to", name = "S", descriptor = "I")
	public static int anInt5723 = 0;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public static int method5140(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + Static281.method4462(arg0.charAt(local12)) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(II)I")
	public static int method5141(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method5143(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local29++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local52.append(Static82.aCharArray4[(int) (local56 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}
}
