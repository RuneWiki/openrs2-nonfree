import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!qa", name = "T", descriptor = "Lclient!dp;")
	public static Class53 aClass53_117;

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "I")
	public static int anInt4703;

	@OriginalMember(owner = "client!qa", name = "ab", descriptor = "I")
	public static int anInt4704;

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "Lclient!vq;")
	public static final Class211 aClass211_28 = new Class211();

	@OriginalMember(owner = "client!qa", name = "P", descriptor = "Lclient!jj;")
	public static final Class108 aClass108_28 = new Class108(8);

	@OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
	public static int anInt4702 = 127;

	@OriginalMember(owner = "client!qa", name = "Y", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!qa", name = "bb", descriptor = "Ljava/lang/String;")
	public static String aString198 = "Loaded wordpack";

	@OriginalMember(owner = "client!qa", name = "cb", descriptor = "I")
	public static int anInt4705 = -1;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method4318(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(48) StringBuffer local48 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local48.append(Static212.aCharArray3[(int) (local52 - arg0 * 37L)]);
			}
			return local48.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!pe;B)V")
	public static void method4319(@OriginalArg(0) Class44_Sub4_Sub4 arg0) {
		@Pc(9) boolean local9 = false;
		if (Static76.anInt2853 == arg0.anInt5134 || arg0.anInt5099 == -1 || arg0.anInt5118 != 0) {
			local9 = true;
		} else {
			@Pc(37) Class24 local37 = Static209.method3737(arg0.anInt5099);
			if (local37.aBoolean43 || local37.anIntArray66[arg0.anInt5152] < arg0.anInt5119 + 1) {
				local9 = true;
			}
		}
		if (local9) {
			@Pc(61) int local61 = arg0.anInt5134 - arg0.anInt5084;
			@Pc(67) int local67 = Static76.anInt2853 - arg0.anInt5084;
			@Pc(79) int local79 = arg0.anInt5109 * 128 + arg0.method4714() * 64;
			@Pc(90) int local90 = arg0.anInt5097 * 128 + arg0.method4714() * 64;
			@Pc(102) int local102 = arg0.anInt5102 * 128 + arg0.method4714() * 64;
			@Pc(113) int local113 = arg0.anInt5087 * 128 + arg0.method4714() * 64;
			arg0.anInt6339 = ((local61 - local67) * local90 + local67 * local113) / local61;
			arg0.anInt6340 = (local79 * (local61 - local67) + local67 * local102) / local61;
		}
		arg0.anInt5155 = 0;
		if (arg0.anInt5143 == 0) {
			arg0.method4715(8192);
		}
		if (arg0.anInt5143 == 1) {
			arg0.method4715(12288);
		}
		if (arg0.anInt5143 == 2) {
			arg0.method4715(0);
		}
		if (arg0.anInt5143 == 3) {
			arg0.method4715(4096);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public static void method4322() {
		@Pc(1) Class70 local1 = Static340.aClass70_20;
		synchronized (Static340.aClass70_20) {
			Static340.aClass70_20.method1399();
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!dp;B)V")
	public static void method4323(@OriginalArg(0) Class53 arg0) {
		Static281.aClass53_129 = arg0;
		anInt4704 = Static281.aClass53_129.method1011(15);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B[Ljava/lang/Object;[J)V")
	public static void method4326(@OriginalArg(1) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static197.method4806(0, arg1.length - 1, arg1, arg0);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
	public static void method4328() {
		Static242.aClass70_81.method1405();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V")
	public static void method4330() {
		@Pc(1) Class70 local1 = Static136.aClass70_47;
		synchronized (Static136.aClass70_47) {
			Static136.aClass70_47.method1397(5);
		}
		local1 = Static141.aClass70_50;
		synchronized (Static141.aClass70_50) {
			Static141.aClass70_50.method1397(5);
		}
	}
}
