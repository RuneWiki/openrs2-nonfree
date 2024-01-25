import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!tba", name = "m", descriptor = "[Ljava/lang/Object;")
	public static Object[] anObjectArray36;

	@OriginalMember(owner = "client!tba", name = "n", descriptor = "Lclient!rl;")
	public static final Class317 aClass317_65 = new Class317(3000000, 200);

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "(II)V")
	public static void method8247(@OriginalArg(1) int arg0) {
		Static384.anIntArray349 = new int[arg0];
		Static547.anIntArray230 = new int[arg0];
		Static275.anIntArray283 = new int[arg0];
		Static503.anIntArray454 = new int[arg0];
		Static143.anIntArray144 = new int[arg0];
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(BLclient!jc;)Lclient!kd;")
	public static Class132_Sub1 method8248(@OriginalArg(1) Class14_Sub21 arg0) {
		@Pc(7) Class132 local7 = Static689.method9504(arg0);
		@Pc(11) int local11 = arg0.method7717(-1978450544);
		@Pc(15) int local15 = arg0.method7717(-1978450544);
		@Pc(19) int local19 = arg0.method7717(-1978450544);
		@Pc(23) int local23 = arg0.method7717(-1978450544);
		@Pc(27) int local27 = arg0.method7717(-1978450544);
		@Pc(37) int local37 = arg0.method7717(-1978450544);
		return new Class132_Sub1(local7.aClass258_12, local7.aClass205_16, local7.anInt9744, local7.anInt9746, local7.anInt9737, local7.anInt9742, local7.anInt9740, local7.anInt9739, local7.anInt9747, local11, local15, local19, local23, local27, local37);
	}
}
