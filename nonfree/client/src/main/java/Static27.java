import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!as", name = "m", descriptor = "I")
	public static int anInt464;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!cn;Lclient!fs;ZILclient!aa;II)V")
	public static void method453(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == null) {
			return;
		}
		@Pc(17) int local17;
		if (Static79.anInt1216 == 4) {
			local17 = (int) Static429.aFloat132 & 0x3FFF;
		} else {
			local17 = Static609.anInt10107 + (int) Static429.aFloat132 & 0x3FFF;
		}
		@Pc(36) int local36 = Math.max(arg1.anInt1384 / 2, arg1.anInt1394 / 2) + 10;
		@Pc(44) int local44 = arg5 * arg5 + arg6 * arg6;
		if (local44 > local36 * local36) {
			return;
		}
		@Pc(59) int local59 = Class5_Sub12.anIntArray544[local17];
		@Pc(68) int local68 = Class5_Sub12.anIntArray543[local17];
		if (Static79.anInt1216 != 4) {
			local59 = local59 * 256 / (Static438.anInt7509 + 256);
			local68 = local68 * 256 / (Static438.anInt7509 + 256);
		}
		@Pc(97) int local97 = arg5 * local59 + arg6 * local68 >> 14;
		@Pc(108) int local108 = local68 * arg5 - arg6 * local59 >> 14;
		arg2.method9220(local97 + arg3 + arg1.anInt1384 / 2 - arg2.method9231() / 2, -local108 + (arg0 - -(arg1.anInt1394 / 2) - arg2.method9232() / 2), arg4, arg3, arg0);
	}
}
