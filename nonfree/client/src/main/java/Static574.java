import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
	public static int anInt10047 = 0;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
	public static int anInt10049 = -1;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V")
	public static void method8209(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static502.method7386(arg2, arg5, null, arg3, arg4, -1, arg1, arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)J")
	public static synchronized long method8210() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static69.aLong39 > local5) {
			Static221.aLong121 += Static69.aLong39 - local5;
		}
		Static69.aLong39 = local5;
		return local5 + Static221.aLong121;
	}
}
