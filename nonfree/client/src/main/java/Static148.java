import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static148 {

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "F")
	public static float aFloat229;

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
	public static int anInt10017;

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_229 = new Class362(101, 7);

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "Lclient!mq;")
	public static final Class223 aClass223_65 = new Class223(8);

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZII)Z")
	public static boolean method8177(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static476.method7153(arg0, arg1) | (arg1 & 0x800) != 0 || Static363.method5856(arg1, arg0);
	}
}
