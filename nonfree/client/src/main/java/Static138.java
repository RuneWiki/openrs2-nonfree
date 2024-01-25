import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "[I")
	public static int[] anIntArray145;

	@OriginalMember(owner = "client!eia", name = "e", descriptor = "Ljava/lang/Object;")
	public static Object anObject10;

	@OriginalMember(owner = "client!eia", name = "c", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(ILclient!ha;I)Lclient!hh;")
	public static Class6 method2314(@OriginalArg(1) Class95 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub15 local10 = (Class3_Sub15) Static484.aClass333_30.method7489((long) arg1);
		if (local10 != null) {
			@Pc(17) Class3_Sub14_Sub4 local17 = local10.aClass207_Sub1_1.method8471();
			local10.aBoolean207 = true;
			if (local17 != null) {
				return local17.method7827(arg0);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(II)V")
	public static void method2316(@OriginalArg(1) int arg0) {
		for (@Pc(5) Class3 local5 = Static26.aClass333_3.method7490(); local5 != null; local5 = Static26.aClass333_3.method7487()) {
			if ((local5.aLong313 >> 48 & 0xFFFFL) == (long) arg0) {
				local5.method9034();
			}
		}
	}
}
