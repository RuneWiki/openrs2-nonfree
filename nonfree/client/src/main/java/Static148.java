import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString30;

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "Lclient!io;")
	public static final Class152 aClass152_4 = new Class152(1, 2);

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "Lclient!jg;")
	public static final Class160 aClass160_1 = new Class160();

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZBI)Lclient!es;")
	public static Class6_Sub16 method2357(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class6_Sub16) Static16.aClass128_2.method3560(local17);
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(II)Z")
	public static boolean method2358(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
	public static void method2361() {
		Static308.aClass128_19.method3562();
		Static223.aClass286_3.method7237();
		Static223.aClass286_4.method7237();
	}
}
