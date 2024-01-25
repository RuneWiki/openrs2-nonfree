import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString44 = null;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "Lclient!db;")
	public static final Class64 aClass64_174 = new Class64(103, 0);

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
	public static final int anInt4324 = -1;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_50 = new Class61(53, -1);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!oa;IIIILclient!gba;IILclient!fa;)V")
	public static void method3677(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class115 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class98 arg7) {
		@Pc(15) Class86 local15 = Static152.aClass337_2.method7441(arg6);
		if (local15 == null || !local15.aBoolean216 || !local15.method2406(Static511.aClass335_2)) {
			return;
		}
		@Pc(35) int local35;
		if (local15.anIntArray252 != null) {
			@Pc(33) int[] local33 = new int[local15.anIntArray252.length];
			@Pc(47) int local47;
			for (local35 = 0; local35 < local33.length / 2; local35++) {
				if (Static555.anInt9335 == 4) {
					local47 = (int) Static477.aFloat164 & 0x3FFF;
				} else {
					local47 = Static402.anInt6978 + (int) Static477.aFloat164 & 0x3FFF;
				}
				@Pc(58) int local58 = Class4_Sub11.anIntArray148[local47];
				@Pc(62) int local62 = Class4_Sub11.anIntArray147[local47];
				if (Static555.anInt9335 != 4) {
					local62 = local62 * 256 / (Static380.anInt6751 + 256);
					local58 = local58 * 256 / (Static380.anInt6751 + 256);
				}
				local33[local35 * 2] = (local62 * (arg4 + local15.anIntArray252[local35 * 2] * 4) + (arg2 + local15.anIntArray252[local35 * 2 + 1] * 4) * local58 >> 14) + arg5.anInt3474 / 2 + arg1;
				local33[local35 * 2 + 1] = arg5.anInt3481 / 2 + arg3 - (local62 * (local15.anIntArray252[local35 * 2 + 1] * 4 + arg2) - local58 * (local15.anIntArray252[local35 * 2] * 4 + arg4) >> 14);
			}
			Static144.method2979(arg0, local33, local15.anInt2725, arg5.anIntArray319, arg5.anIntArray320);
			for (local47 = 0; local47 < local33.length / 2 - 1; local47++) {
				arg0.method6844(local33[local47 * 2], local33[local47 * 2 + 1], local33[local47 * 2 + 2], local33[(local47 + 1) * 2 + 1], local15.anInt2722, arg7, arg1, arg3);
			}
			arg0.method6844(local33[local33.length - 2], local33[local33.length - 1], local33[0], local33[1], local15.anInt2722, arg7, arg1, arg3);
		}
		@Pc(270) Class13 local270 = null;
		if (local15.anInt2727 != -1) {
			local270 = local15.method2404(false, arg0);
			if (local270 != null) {
				Static283.method4483(arg7, arg1, arg2, arg4, arg5, local270, arg3);
			}
		}
		if (local15.aString22 == null) {
			return;
		}
		local35 = 0;
		if (local270 != null) {
			local35 = local270.b();
		}
		@Pc(303) Class91 local303 = Static334.aClass91_5;
		@Pc(305) Class196 local305 = Static272.aClass196_7;
		if (local15.anInt2720 == 1) {
			local303 = Static375.aClass91_7;
			local305 = Static162.aClass196_4;
		}
		if (local15.anInt2720 == 2) {
			local305 = Static195.aClass196_5;
			local303 = Static65.aClass91_4;
		}
		Static54.method825(arg5, arg1, local35, arg3, local15.aString22, arg4, arg7, local15.anInt2719, local305, arg2, local303);
		return;
	}
}
