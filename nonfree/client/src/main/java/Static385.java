import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "Z")
	public static boolean aBoolean578 = false;

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "Z")
	public static boolean aBoolean579 = false;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "[I")
	public static final int[] anIntArray733 = new int[14];

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean580 = true;

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
	public static int anInt6258 = -50;

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
	public static int anInt6259 = -60;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ug;)V")
	public static void method5447(@OriginalArg(0) Class25_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort88; local2 <= arg0.aShort87; local2++) {
			for (@Pc(6) int local6 = arg0.aShort89; local6 <= arg0.aShort90; local6++) {
				@Pc(16) Class132 local16 = Static25.aClass132ArrayArrayArray1[arg0.aByte70][local2][local6];
				if (local16 != null) {
					@Pc(21) Class116 local21 = local16.aClass116_3;
					@Pc(23) Class116 local23 = null;
					while (local21 != null) {
						if (local21.aClass25_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass116_3 = local21.aClass116_2;
							} else {
								local23.aClass116_2 = local21.aClass116_2;
							}
							local21.method2471();
							break;
						}
						local23 = local21;
						local21 = local21.aClass116_2;
					}
					local16.aByte51 = 0;
					for (@Pc(56) Class116 local56 = local16.aClass116_3; local56 != null; local56 = local56.aClass116_2) {
						local16.aByte51 = (byte) (local16.aByte51 | local56.anInt3023);
					}
				}
			}
		}
	}
}
