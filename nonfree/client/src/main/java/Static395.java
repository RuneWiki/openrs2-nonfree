import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!nha", name = "p", descriptor = "[I")
	public static int[] anIntArray385;

	@OriginalMember(owner = "client!nha", name = "i", descriptor = "Lclient!pa;")
	public static final Class265 aClass265_41 = new Class265(4);

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5733(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			local8 = arg0.charAt(local10) + (local8 << 5) - local8;
		}
		return local8;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(III)Lclient!bk;")
	public static Class40 method5735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class313 local7 = Static129.aClass313ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass40_3;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(JBI)Ljava/lang/String;")
	public static String method5738(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		Static625.method8337(arg0);
		@Pc(10) int local10 = Static594.aCalendar3.get(5);
		@Pc(19) int local19 = Static594.aCalendar3.get(2);
		@Pc(23) int local23 = Static594.aCalendar3.get(1);
		return arg1 == 3 ? Static139.method2063(arg0, arg1) : Integer.toString(local10 / 10) + local10 % 10 + "-" + Static312.aStringArrayArray1[arg1][local19] + "-" + local23;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIZ)V")
	public static void method5739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class5_Sub2_Sub4 local9 = Static257.method3597(1, (long) arg1);
		local9.method2438();
		local9.anInt2749 = arg0;
	}
}
