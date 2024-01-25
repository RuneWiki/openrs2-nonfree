import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
	public static int anInt8698;

	@OriginalMember(owner = "client!rga", name = "k", descriptor = "I")
	public static int anInt8701;

	@OriginalMember(owner = "client!rga", name = "f", descriptor = "I")
	public static int anInt8703;

	@OriginalMember(owner = "client!rga", name = "h", descriptor = "I")
	public static int anInt8709;

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(ILclient!dk;)V")
	public static void method7444(@OriginalArg(1) Class8_Sub3 arg0) {
		arg0.aClass8_Sub1_Sub3_Sub2_1 = null;
		if (Static582.anInt9742 < 20) {
			Static630.aClass98_9.method1780(arg0);
			Static582.anInt9742++;
		}
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Ljava/lang/String;Lclient!ib;B)I")
	public static int method7446(@OriginalArg(0) String arg0, @OriginalArg(1) Class5_Sub23 arg1) {
		@Pc(6) int local6 = arg1.anInt9869;
		@Pc(16) byte[] local16 = Static468.method6845(arg0);
		arg1.method8479(local16.length);
		arg1.anInt9869 += Static559.aClass247_1.method5663(local16.length, arg1.anInt9869, arg1.aByteArray102, local16, 0);
		return arg1.anInt9869 - local6;
	}
}
