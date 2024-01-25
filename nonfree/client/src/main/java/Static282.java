import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "Lclient!nm;")
	public static Class138 aClass138_7;

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
	public static int anInt5473;

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "[I")
	public static final int[] anIntArray408 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)V")
	public static void method4771(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub9_Sub16 local8 = Static239.method4052(10, arg0);
		local8.method4138();
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)V")
	public static void method4773() {
		for (@Pc(7) int local7 = 0; local7 < Static47.anInt1211; local7++) {
			@Pc(13) int local13 = Static178.anIntArray266[local7];
			@Pc(17) Class25_Sub1_Sub1_Sub1 local17 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local13];
			@Pc(21) int local21 = Static6.aClass5_Sub1_Sub1_1.method1832();
			if ((local21 & 0x8) != 0) {
				local21 += Static6.aClass5_Sub1_Sub1_1.method1832() << 8;
			}
			Static237.method4036(local13, local21, local17);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!ra;ZLclient!ra;)V")
	public static void method4774(@OriginalArg(0) Class170 arg0, @OriginalArg(2) Class170 arg1) {
		Static293.aClass170_97 = arg1;
		Static189.aClass170_71 = arg0;
		Static189.aClass170_71.method4575(36);
	}
}
