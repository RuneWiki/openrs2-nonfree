import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!rfa", name = "f", descriptor = "Lclient!wu;")
	public static Class380 aClass380_110;

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_273 = new Class288(111, -2);

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "Lclient!ag;")
	public static final Class8 aClass8_6 = new Class8(7, 2);

	@OriginalMember(owner = "client!rfa", name = "g", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_274 = new Class288(15, 2);

	@OriginalMember(owner = "client!rfa", name = "h", descriptor = "Z")
	public static boolean aBoolean602 = false;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BII)V")
	public static void method6822(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub2_Sub4 local13 = Static566.method7763(arg0, 14);
		local13.method662();
		local13.anInt823 = arg1;
	}
}
