import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
	public static int anInt9157;

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
	public static int anInt9158;

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "F")
	public static float aFloat192 = 0.0F;

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "Z")
	public static boolean aBoolean741 = false;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray55 = new boolean[8];

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!aa;ILclient!hu;IIIILclient!vfa;)V")
	public static void method7808(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class357 arg6) {
		if (arg2 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static584.anInt9543 == 4) {
			local16 = (int) Static112.aFloat22 & 0x3FFF;
		} else {
			local16 = Static402.anInt9327 + (int) Static112.aFloat22 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg6.anInt9852 / 2, arg6.anInt9797 / 2) + 10;
		@Pc(43) int local43 = arg4 * arg4 + arg3 * arg3;
		if (local43 > local35 * local35) {
			return;
		}
		@Pc(53) int local53 = Class5_Sub12_Sub1.anIntArray748[local16];
		@Pc(65) int local65 = Class5_Sub12_Sub1.anIntArray749[local16];
		if (Static584.anInt9543 != 4) {
			local53 = local53 * 256 / (Static425.anInt7212 + 256);
			local65 = local65 * 256 / (Static425.anInt7212 + 256);
		}
		@Pc(95) int local95 = arg3 * local53 + arg4 * local65 >> 14;
		@Pc(106) int local106 = local65 * arg3 - arg4 * local53 >> 14;
		arg2.method5308(local95 + arg1 + arg6.anInt9852 / 2 - arg2.method5313() / 2, -local106 + arg6.anInt9797 / 2 + arg5 + -(arg2.method5325() / 2), arg0, arg1, arg5);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZB)V")
	public static void method7810(@OriginalArg(0) boolean arg0) {
		@Pc(5) int local5 = Static242.anInt4063;
		@Pc(7) int local7 = Static468.anInt7876;
		if (arg0 && Static605.aBoolean812) {
			local5 <<= 0x1;
			local7 = -local5;
		}
		Static485.aClass126_17.f(local7, local5);
	}
}
