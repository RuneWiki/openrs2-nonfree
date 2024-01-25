import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
	public static int anInt5485;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "Lclient!aj;")
	public static Class15 aClass15_88;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_81 = new Class218(80, 8);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!vh;I)V")
	public static void method5021(@OriginalArg(0) Class28_Sub10 arg0) {
		arg0.aClass28_Sub1_Sub1_Sub1_1 = null;
		if (Static39.anInt908 < 20) {
			Static516.aClass371_5.method8908(arg0);
			Static39.anInt908++;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[BZ)[B")
	public static byte[] method5022(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static684.method5324(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
