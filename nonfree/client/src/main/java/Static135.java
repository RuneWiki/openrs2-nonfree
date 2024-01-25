import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "I")
	public static int anInt2895 = 0;

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZIILclient!om;JII)V")
	public static void method2613(@OriginalArg(1) int arg0, @OriginalArg(3) Class246 arg1, @OriginalArg(4) long arg2, @OriginalArg(6) int arg3) {
		Static262.method4322(arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(II)V")
	public static void method2614(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static363.method5457(arg0, 3);
		local8.method845();
	}
}
