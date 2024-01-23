import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "[[Lclient!g;")
	public static Class56[][] aClass56ArrayArray1;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "Lclient!ek;")
	public static Class42 aClass42_83;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
	public static int anInt5150 = 0;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "Z")
	public static boolean aBoolean344 = false;

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
	public static int anInt5152 = -1;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray43 = new String[100];

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!ek;I)V")
	public static void method4103(@OriginalArg(0) Class42 arg0) {
		Static215.aClass42_67 = arg0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)Lclient!vn;")
	public static Class189 method4104(@OriginalArg(1) int arg0) {
		@Pc(10) Class189 local10 = (Class189) Static89.aClass157_17.method4031((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static183.aClass42_52.method1256(29, arg0);
		local10 = new Class189();
		if (local21 != null) {
			local10.method4622(new Class2_Sub16(local21), arg0);
		}
		Static89.aClass157_17.method4026((long) arg0, local10);
		return local10;
	}
}
