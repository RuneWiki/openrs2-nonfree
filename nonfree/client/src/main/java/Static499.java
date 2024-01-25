import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "Lclient!tb;")
	public static final Class328 aClass328_9 = new Class328();

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_106 = new Class179(53, 7);

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIII)V")
	public static void method6900(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(43) String local43 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local43);
		Static542.method7480(false, local43, true);
	}
}
