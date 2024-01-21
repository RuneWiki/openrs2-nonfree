import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "[I")
	public static int[] anIntArray360;

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Lclient!vc;")
	public static Class98 aClass98_16;

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
	public static int anInt4158;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
	public static int anInt4154 = 0;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1198 = Static81.method1507("0(U");

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "[I")
	public static final int[] anIntArray361 = new int[5];

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
	public static int anInt4161 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)V")
	public static void method3214() {
		for (@Pc(1) int local1 = 0; local1 < Static143.anInt3201; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static60.anInt3602; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static18.anInt3874; local7++) {
					@Pc(16) Class1_Sub8 local16 = Static29.aClass1_Sub8ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class19 local21 = local16.aClass19_1;
						if (local21 != null && local21.aClass5_1.method3166()) {
							Static65.method1311(local21.aClass5_1, local1, local4, local7, 1, 1);
							if (local21.aClass5_2 != null && local21.aClass5_2.method3166()) {
								Static65.method1311(local21.aClass5_2, local1, local4, local7, 1, 1);
								local21.aClass5_1.method3165(local21.aClass5_2, 0, 0, 0, false);
								local21.aClass5_2 = local21.aClass5_2.method3161();
							}
							local21.aClass5_1 = local21.aClass5_1.method3161();
						}
						for (@Pc(77) int local77 = 0; local77 < local16.anInt1550; local77++) {
							@Pc(83) Class51 local83 = local16.aClass51Array1[local77];
							if (local83 != null && local83.aClass5_6.method3166()) {
								Static65.method1311(local83.aClass5_6, local1, local4, local7, local83.anInt2208 + 1 - local83.anInt2213, local83.anInt2205 - local83.anInt2218 + 1);
								local83.aClass5_6 = local83.aClass5_6.method3161();
							}
						}
						@Pc(125) Class96 local125 = local16.aClass96_1;
						if (local125 != null && local125.aClass5_11.method3166()) {
							Static117.method2006(local125.aClass5_11, local1, local4, local7);
							local125.aClass5_11 = local125.aClass5_11.method3161();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BJ)Lclient!dj;")
	public static Class24 method3219(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) long local27 = arg0;
			@Pc(29) int local29 = 0;
			while (local27 != 0L) {
				local29++;
				local27 /= 37L;
			}
			@Pc(42) byte[] local42 = new byte[local29];
			while (arg0 != 0L) {
				@Pc(49) long local49 = arg0;
				arg0 /= 37L;
				local29--;
				local42[local29] = Static49.aByteArray14[(int) (local49 - arg0 * 37L)];
			}
			@Pc(74) Class24 local74 = new Class24();
			local74.aByteArray13 = local42;
			local74.anInt1084 = local42.length;
			return local74;
		}
	}
}
