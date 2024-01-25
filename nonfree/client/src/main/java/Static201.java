import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
	public static int anInt3831;

	@OriginalMember(owner = "client!gj", name = "Z", descriptor = "I")
	public static int anInt3839;

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "Lclient!tq;")
	public static final Class340 aClass340_22 = new Class340(260);

	@OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
	public static int anInt3834 = 104;

	@OriginalMember(owner = "client!gj", name = "W", descriptor = "[S")
	public static final short[] aShortArray43 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!gj", name = "eb", descriptor = "[S")
	private static final short[] aShortArray44 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!gj", name = "Cb", descriptor = "[S")
	private static final short[] aShortArray48 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!gj", name = "Db", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { aShortArray48, aShortArray44, aShortArray43 };

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BII)I")
	public static int method3267(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(43) int local43 = Static110.method2088(arg0 - 1, arg1 + -1) + Static110.method2088(arg0 - 1, arg1 - -1) + Static110.method2088(arg0 + 1, arg1 - 1) + Static110.method2088(arg0 + 1, arg1 + 1);
		@Pc(82) int local82 = Static110.method2088(arg0, arg1 - 1) + Static110.method2088(arg0, arg1 + 1) + Static110.method2088(arg0 - 1, arg1) + Static110.method2088(arg0 + 1, arg1);
		@Pc(87) int local87 = Static110.method2088(arg0, arg1);
		return local43 / 16 + local82 / 8 + local87 / 4;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IJZI)Ljava/lang/String;")
	public static String method3274(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		Static622.method8435(arg1);
		@Pc(10) Calendar local10 = Static158.aCalendar1;
		@Pc(20) int local20 = local10.get(5);
		@Pc(26) int local26 = local10.get(2) + 1;
		@Pc(30) int local30 = local10.get(1);
		@Pc(42) int local42 = local10.get(11);
		@Pc(46) int local46 = local10.get(12);
		return Integer.toString(local20 / 10) + local20 % 10 + "/" + local26 / 10 + local26 % 10 + "/" + local30 % 100 / 10 + local30 % 10 + " " + local42 / 10 + local42 % 10 + ":" + local46 / 10 + local46 % 10;
	}
}
