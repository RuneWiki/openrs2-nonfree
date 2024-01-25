import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bea", name = "v", descriptor = "I")
	public static int anInt867;

	@OriginalMember(owner = "client!bea", name = "C", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!bea", name = "t", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_10 = new Class171(13, 2);

	@OriginalMember(owner = "client!bea", name = "B", descriptor = "J")
	public static long aLong30 = -1L;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(BI)Z")
	public static boolean method772(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!bea", name = "e", descriptor = "(B)V")
	public static void method774() {
		for (@Pc(15) Class3_Sub5_Sub6 local15 = (Class3_Sub5_Sub6) Static29.aClass302_3.method6603(); local15 != null; local15 = (Class3_Sub5_Sub6) Static29.aClass302_3.method6605()) {
			@Pc(20) Class34_Sub1_Sub1_Sub3 local20 = local15.aClass34_Sub1_Sub1_Sub3_1;
			if (Static122.anInt2190 > local20.anInt2615) {
				local15.method9034();
				local20.method2306();
			} else if (Static122.anInt2190 >= local20.anInt2609) {
				local20.method2310();
				if (local20.anInt2627 > 0) {
					@Pc(52) Class3_Sub52 local52 = (Class3_Sub52) Static105.aClass333_11.method7489((long) (local20.anInt2627 - 1));
					if (local52 != null) {
						@Pc(57) Class34_Sub1_Sub1_Sub2_Sub2 local57 = local52.aClass34_Sub1_Sub1_Sub2_Sub2_2;
						if (local57.anInt9614 >= 0 && Static98.anInt361 * 512 > local57.anInt9614 && local57.anInt9619 >= 0 && Static438.anInt7120 * 512 > local57.anInt9619) {
							local20.method2312(local57.anInt9614, Static662.method8831(local57.anInt9619, local57.anInt9614, local20.aByte132) - local20.anInt2617, Static122.anInt2190, local57.anInt9619);
						}
					}
				}
				if (local20.anInt2627 < 0) {
					@Pc(110) int local110 = -local20.anInt2627 - 1;
					@Pc(117) Class34_Sub1_Sub1_Sub2_Sub1 local117;
					if (local110 == Static291.anInt4955) {
						local117 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1;
					} else {
						local117 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local110];
					}
					if (local117 != null && local117.anInt9614 >= 0 && Static98.anInt361 * 512 > local117.anInt9614 && local117.anInt9619 >= 0 && Static438.anInt7120 * 512 > local117.anInt9619) {
						local20.method2312(local117.anInt9614, Static662.method8831(local117.anInt9619, local117.anInt9614, local20.aByte132) - local20.anInt2617, Static122.anInt2190, local117.anInt9619);
					}
				}
				local20.method2307(Static281.anInt4774);
				Static92.method1530(local20, true);
			}
		}
	}
}
