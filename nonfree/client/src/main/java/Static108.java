import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!dt", name = "H", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!dt", name = "I", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_46 = new Class136(90, -2);

	@OriginalMember(owner = "client!dt", name = "J", descriptor = "I")
	public static int anInt1716 = 0;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)V")
	public static void method1597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub4_Sub13 local8 = Static506.method2916(arg1, 14);
		local8.method4140();
		local8.anInt4508 = arg0;
	}
}
