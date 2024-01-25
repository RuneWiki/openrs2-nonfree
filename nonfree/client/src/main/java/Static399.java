import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!oe", name = "M", descriptor = "Lclient!ha;")
	public static Class100 aClass100_13;

	@OriginalMember(owner = "client!oe", name = "R", descriptor = "Lclient!vd;")
	public static Class353 aClass353_73;

	@OriginalMember(owner = "client!oe", name = "T", descriptor = "[I")
	public static int[] anIntArray446;

	@OriginalMember(owner = "client!oe", name = "U", descriptor = "Ljava/lang/Object;")
	public static Object anObject18;

	@OriginalMember(owner = "client!oe", name = "V", descriptor = "Z")
	public static boolean aBoolean503;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BII)Z")
	public static boolean method6443(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Z")
	public static boolean method6445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLclient!ha;I)Lclient!pga;")
	public static Class32 method6446(@OriginalArg(1) Class100 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class6_Sub35 local10 = (Class6_Sub35) Static227.aClass128_12.method3560((long) arg1);
		if (local10 != null) {
			@Pc(22) Class6_Sub13_Sub1 local22 = local10.aClass62_Sub1_1.method8476();
			local10.aBoolean534 = true;
			if (local22 != null) {
				return local22.method1915(arg0);
			}
		}
		return null;
	}
}
