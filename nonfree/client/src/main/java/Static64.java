import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
	public static int anInt1323;

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
	public static int anInt1327;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "[I")
	public static final int[] anIntArray67 = new int[1000];

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "[I")
	public static final int[] anIntArray68 = new int[500];

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLclient!af;)V")
	public static void method1159(@OriginalArg(1) Class3_Sub4_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static320.anInt5359; local7++) {
			@Pc(13) int local13 = Static135.anIntArray143[local7];
			@Pc(17) Class34_Sub1_Sub1_Sub2_Sub1 local17 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local13];
			@Pc(21) int local21 = arg0.method7954();
			if ((local21 & 0x40) != 0) {
				local21 += arg0.method7954() << 8;
			}
			if ((local21 & 0x1000) != 0) {
				local21 += arg0.method7954() << 16;
			}
			Static471.method6273(arg0, local21, local13, local17);
		}
	}
}
