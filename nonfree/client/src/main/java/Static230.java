import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!hn", name = "Z", descriptor = "Lclient!mu;")
	public static Class243 aClass243_2;

	@OriginalMember(owner = "client!hn", name = "db", descriptor = "Lclient!bd;")
	public static final Class32 aClass32_24 = new Class32();

	@OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
	public static int anInt4432 = -1;

	@OriginalMember(owner = "client!hn", name = "z", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_105 = new Class251(84, 4);

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIBI)I")
	public static int method3884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg0;
		@Pc(17) int local17 = arg2 / arg1;
		@Pc(23) int local23 = arg1 - 1 & arg2;
		@Pc(28) int local28 = Static455.method6712(local7, local17);
		@Pc(35) int local35 = Static455.method6712(local7 + 1, local17);
		@Pc(42) int local42 = Static455.method6712(local7, local17 + 1);
		@Pc(51) int local51 = Static455.method6712(local7 + 1, local17 + 1);
		@Pc(58) int local58 = Static282.method4749(local13, local28, local35, arg1);
		@Pc(65) int local65 = Static282.method4749(local13, local42, local51, arg1);
		return Static282.method4749(local23, local58, local65, arg1);
	}
}
