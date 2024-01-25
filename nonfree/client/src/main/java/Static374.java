import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!mja", name = "b", descriptor = "I")
	public static int anInt6314 = 0;

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(Lclient!uq;Lclient!br;Lclient!tga;Lclient!uq;BLclient!uq;)Z")
	public static boolean method5317(@OriginalArg(0) Class362 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) Class3_Sub12_Sub3 arg2, @OriginalArg(3) Class362 arg3, @OriginalArg(5) Class362 arg4) {
		Static515.aClass362_110 = arg0;
		Static33.aClass362_119 = arg4;
		Static59.anIntArray61 = new int[16];
		Static574.aClass3_Sub12_Sub3_3 = arg2;
		Static628.aClass362_150 = arg3;
		Static282.aClass41_1 = arg1;
		for (@Pc(28) int local28 = 0; local28 < 16; local28++) {
			Static59.anIntArray61[local28] = 255;
		}
		return true;
	}
}
