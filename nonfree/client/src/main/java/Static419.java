import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "Lclient!la;")
	public static Class29 aClass29_13;

	@OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
	public static int anInt6525;

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "Z")
	public static boolean aBoolean511 = false;

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
	public static int anInt6521 = -1;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILclient!vda;)Z")
	public static boolean method5466(@OriginalArg(1) Interface24 arg0) {
		@Pc(10) Class32 local10 = Static541.aClass97_4.method1794(arg0.method7337());
		if (local10.anInt784 == -1) {
			return true;
		} else {
			@Pc(24) Class358 local24 = Static165.aClass306_3.method6830(local10.anInt784);
			return local24.anInt9511 == -1 ? true : local24.method7911();
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)Z")
	public static boolean method5470(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
