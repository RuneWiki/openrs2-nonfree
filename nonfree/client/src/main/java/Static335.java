import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
	public static int anInt6221;

	@OriginalMember(owner = "client!naa", name = "h", descriptor = "Lclient!kh;")
	public static Class183 aClass183_3;

	@OriginalMember(owner = "client!naa", name = "e", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_118 = new Class254(101, 12);

	@OriginalMember(owner = "client!naa", name = "g", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_119 = new Class254(90, 4);

	@OriginalMember(owner = "client!naa", name = "i", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_70 = new Class181(6, 15);

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIII)V")
	public static void method5313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static547.aClass6_Sub26_Sub2_2.method4979(arg1);
		Static547.aClass6_Sub26_Sub2_2.method4946(arg0);
		Static547.aClass6_Sub26_Sub2_2.method4946(arg2);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(ILclient!oa;ZB)Lclient!hq;")
	public static Class141 method5314(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1) {
		if (arg0 == -1) {
			return null;
		}
		if (Static139.anIntArray225 != null) {
			for (@Pc(15) int local15 = 0; local15 < Static139.anIntArray225.length; local15++) {
				if (Static139.anIntArray225[local15] == arg0) {
					return Static261.aClass141Array1[local15];
				}
			}
		}
		@Pc(42) Class141 local42 = (Class141) Static548.aClass245_65.method6082((long) arg0);
		if (local42 != null) {
			if (local42.aClass82_5 == null) {
				@Pc(54) Class82 local54 = Static505.method7521(Static394.aClass168_92, arg0);
				if (local54 == null) {
					return null;
				}
				local42.aClass82_5 = local54;
			}
			return local42;
		}
		@Pc(67) Class1[] local67 = Static583.method54(Static194.aClass168_50, arg0);
		if (local67 == null) {
			return null;
		}
		@Pc(81) Class82 local81 = Static505.method7521(Static394.aClass168_92, arg0);
		if (local81 == null) {
			return null;
		} else {
			local42 = new Class141(arg1.method5393(local81, local67), local81);
			Static548.aClass245_65.method6075(local42, (long) arg0);
			return local42;
		}
	}
}
