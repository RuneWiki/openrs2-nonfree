import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_111 = new Class171(98, 1);

	@OriginalMember(owner = "client!oe", name = "x", descriptor = "Lclient!jea;")
	public static final Class177 aClass177_21 = new Class177(9, 3);

	@OriginalMember(owner = "client!oe", name = "y", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_112 = new Class171(42, 3);

	@OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
	public static int anInt6954 = -1;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
	public static void method5889() {
		for (@Pc(11) int local11 = 0; local11 < Static52.anInt1140; local11++) {
			@Pc(17) int local17 = Static603.anIntArray537[local11];
			@Pc(24) Class3_Sub52 local24 = (Class3_Sub52) Static105.aClass333_11.method7489((long) local17);
			if (local24 != null) {
				@Pc(29) Class34_Sub1_Sub1_Sub2_Sub2 local29 = local24.aClass34_Sub1_Sub1_Sub2_Sub2_2;
				Static675.method8999(local29.aClass261_1.anInt6807, local29);
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(JIZ)Ljava/lang/String;")
	public static String method5890(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Static593.method7811(arg0);
		@Pc(10) int local10 = Static387.aCalendar2.get(5);
		@Pc(16) int local16 = Static387.aCalendar2.get(2) + 1;
		@Pc(20) int local20 = Static387.aCalendar2.get(1);
		return Integer.toString(local10 / 10) + local10 % 10 + "/" + local16 / 10 + local16 % 10 + "/" + local20 % 100 / 10 + local20 % 10;
	}
}
