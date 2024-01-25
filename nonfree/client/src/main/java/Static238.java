import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!io", name = "C", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_54 = new Class46(74, 4);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIBILjava/lang/String;III)V")
	public static void method3974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class4_Sub7 local7 = new Class4_Sub7();
		local7.aString50 = arg3;
		local7.anInt4684 = arg0;
		local7.anInt4689 = arg2;
		local7.anInt4692 = arg1;
		local7.anInt4691 = arg4;
		local7.anInt4688 = arg6 + Static631.anInt10493;
		local7.anInt4685 = arg5;
		Static452.aClass99_9.method2039(local7);
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V")
	public static void method3975() {
		if (Static389.aClass15_7 != Static211.aClass15_2) {
			try {
				Static653.method5177(Static475.aClient1, "tbrefresh");
			} catch (@Pc(22) Throwable local22) {
			}
		}
	}
}
