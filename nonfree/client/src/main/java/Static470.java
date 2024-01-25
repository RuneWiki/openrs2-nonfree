import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "Lclient!ma;")
	public static Class228 aClass228_6;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "Lclient!sw;")
	public static Class342 aClass342_1;

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "Lclient!mba;")
	public static Class230 aClass230_8;

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
	public static int anInt8100;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "Ljava/lang/Object;")
	public static Object anObject18;

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
	public static int anInt8102;

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "Lclient!vj;")
	public static final Class378 aClass378_3 = new Class378(128);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)V")
	public static void method7059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static588.method8381(arg1, arg0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!np;)Z")
	public static boolean method7060(@OriginalArg(1) Interface16 arg0) {
		@Pc(16) Class128 local16 = Static212.aClass249_4.method6119(arg0.method9501());
		if (local16.anInt2993 == -1) {
			return true;
		} else {
			@Pc(29) Class146 local29 = Static94.aClass334_3.method8127(local16.anInt2993);
			return local29.anInt3728 == -1 ? true : local29.method3250();
		}
	}
}
