import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!mn", name = "r", descriptor = "Lclient!mo;")
	public static Class143 aClass143_78;

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
	public static int anInt4054 = 0;

	@OriginalMember(owner = "client!mn", name = "t", descriptor = "I")
	public static int anInt4056 = -1;

	@OriginalMember(owner = "client!mn", name = "B", descriptor = "[I")
	public static final int[] anIntArray352 = new int[25];

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	public static void method3728() {
		@Pc(14) Class11 local14 = Static189.aClass11_134;
		synchronized (Static189.aClass11_134) {
			Static189.aClass11_134.method213();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!e;IZILclient!bd;)V")
	public static void method3730(@OriginalArg(0) Class46 arg0, @OriginalArg(4) Class18 arg1) {
		Static326.aClass18_44.method461();
		if (Static254.aBoolean325) {
			return;
		}
		for (@Pc(20) Class14_Sub5 local20 = (Class14_Sub5) arg1.method459(); local20 != null; local20 = (Class14_Sub5) arg1.method453()) {
			@Pc(27) Class52 local27 = Static247.method4306(local20.anInt725);
			if (Static32.method785(local27)) {
				@Pc(39) boolean local39 = Static140.method2819(local27, local20, arg0);
				if (local39) {
					Static220.method3969(arg0, local20, local27);
				}
			}
		}
	}
}
