import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!tp", name = "q", descriptor = "I")
	public static int anInt9541;

	@OriginalMember(owner = "client!tp", name = "r", descriptor = "[Lclient!hh;")
	public static Class6[] aClass6Array13;

	@OriginalMember(owner = "client!tp", name = "s", descriptor = "Lclient!al;")
	public static Class17 aClass17_9;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZI)Lclient!gd;")
	public static Class3_Sub21 method7782(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(20) long local20 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class3_Sub21) Static665.aClass333_44.method7489(local20);
	}
}
