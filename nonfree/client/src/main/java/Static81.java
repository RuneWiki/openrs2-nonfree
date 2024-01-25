import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "Lclient!nl;")
	public static Class171 aClass171_29;

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "Lclient!q;")
	public static Class197 aClass197_1;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_24 = new Class11(41, 4);

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_35 = new Class205(33, 8);

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
	public static int anInt1472 = 0;

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "S")
	public static short aShort7 = 256;

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
	public static int anInt1473 = 0;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V")
	public static void method1227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class2_Sub10_Sub2 local13 = Static217.method3611(arg0, 14);
		local13.method864();
		local13.anInt1037 = arg1;
	}
}
