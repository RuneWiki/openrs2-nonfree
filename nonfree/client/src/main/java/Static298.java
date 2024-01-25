import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString68 = "";

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILclient!pq;Lclient!e;)V")
	public static void method4141(@OriginalArg(1) Class251 arg0, @OriginalArg(2) Interface7 arg1) {
		Static60.aClass251_22 = arg0;
		Static155.anInterface7_4 = arg1;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BLclient!dga;)Lclient!bk;")
	public static Class10_Sub1 method4142(@OriginalArg(1) Class6_Sub14 arg0) {
		@Pc(7) Class10 local7 = Static490.method6769(arg0);
		@Pc(11) int local11 = arg0.method6027();
		@Pc(15) int local15 = arg0.method6027();
		return new Class10_Sub1(local7.aClass277_10, local7.aClass137_13, local7.anInt7622, local7.anInt7626, local7.anInt7621, local7.anInt7623, local7.anInt7624, local11, local15);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IBI)Z")
	public static boolean method4144(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static39.method562(arg0, arg1) || Static24.method4707(arg1, arg0);
	}
}
