import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IBI)V")
	public static void method299(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class3_Sub4_Sub12 local13 = Static393.method5080(arg1, 14);
		local13.method3248();
		local13.anInt4063 = arg0;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIZ)V")
	public static void method300(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Class3_Sub32 local8 = Static238.method3609(arg0, arg1);
		if (local8 != null) {
			for (@Pc(13) int local13 = 0; local13 < local8.anIntArray339.length; local13++) {
				local8.anIntArray339[local13] = -1;
				local8.anIntArray340[local13] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
	public static void method304() {
		if (Static47.aClass16_2 != null) {
			Static47.aClass16_2.method4107();
		}
		if (Static42.aClass16_1 != null) {
			Static42.aClass16_1.method4107();
		}
	}
}
