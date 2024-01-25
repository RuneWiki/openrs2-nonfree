import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "Z")
	public static boolean aBoolean453 = false;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Lclient!ag;")
	public static Class8 method5844(@OriginalArg(0) int arg0) {
		@Pc(8) Class8[] local8 = Static121.method2093();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class8 local16 = local8[local10];
			if (local16.anInt254 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!dd;FIFIFFFII)[B")
	public static byte[] method5855(@OriginalArg(1) Class45 arg0, @OriginalArg(2) float arg1, @OriginalArg(4) float arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(8) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static282.method4273(arg4, local10, arg1, arg2, arg5, 0, arg0, arg3);
		return local10;
	}
}
