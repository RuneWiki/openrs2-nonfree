import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "F")
	public static float aFloat140;

	@OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
	public static int anInt6246 = 2;

	@OriginalMember(owner = "client!mp", name = "t", descriptor = "J")
	public static long aLong197 = 0L;

	@OriginalMember(owner = "client!mp", name = "u", descriptor = "I")
	public static int anInt6252 = 1;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)Lclient!om;")
	public static Class14_Sub2_Sub15 method5589(@OriginalArg(0) int arg0) {
		@Pc(5) Class11 local5 = Static191.aClass11_86;
		@Pc(14) Class14_Sub2_Sub15 local14;
		synchronized (Static191.aClass11_86) {
			local14 = (Class14_Sub2_Sub15) Static191.aClass11_86.method209((long) arg0);
			if (local14 == null) {
				local14 = new Class14_Sub2_Sub15(arg0);
				Static191.aClass11_86.method219((long) arg0, local14);
			}
		}
		synchronized (local14) {
			return local14.method4104() ? local14 : null;
		}
	}
}
