import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	public static int anInt8355;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
	public static int anInt8356;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "[I")
	public static int[] anIntArray497;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "F")
	public static float aFloat179;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
	public static int anInt8358;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Lclient!ja;")
	public static Class154 aClass154_13;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "[I")
	public static final int[] anIntArray496 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLclient!r;)V")
	public static void method6558(@OriginalArg(1) Class31 arg0) {
		Static298.aClass346Array1 = new Class346[Static294.anIntArray262.length];
		for (@Pc(17) int local17 = 0; local17 < Static294.anIntArray262.length; local17++) {
			@Pc(23) int local23 = Static294.anIntArray262[local17];
			@Pc(28) Class328 local28 = Static410.method5763(local23, Static451.aClass284_127);
			@Pc(36) Class63 local36 = arg0.method8027(local28, Static607.method8164(Static537.aClass284_152, local23));
			Static298.aClass346Array1[local17] = new Class346(local36, local28);
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)[I")
	public static int[] method6561() {
		return new int[] { Static555.anInt9701, Static252.anInt4919, Static438.anInt4272 };
	}
}
