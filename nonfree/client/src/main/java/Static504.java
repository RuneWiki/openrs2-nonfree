import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!th", name = "M", descriptor = "F")
	public static float aFloat183;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)V")
	public static void method7605() {
		if (Static435.aBoolean685) {
			return;
		}
		Static151.aBoolean260 = true;
		Static435.aBoolean685 = true;
		if (Static455.aClass3_Sub27_Sub1_1.aBoolean390) {
			Static533.aFloat188 = (int) Static533.aFloat188 - 65 & 0xFFFFFF80;
		} else {
			Static297.aFloat119 += (-24.0F - Static297.aFloat119) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/Object;II)[B")
	public static byte[] method7606(@OriginalArg(1) Object arg0, @OriginalArg(3) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return Static416.method8167(arg1, local13);
		} else if (arg0 instanceof Class158) {
			@Pc(25) Class158 local25 = (Class158) arg0;
			return local25.method5024(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(II)S")
	public static short method7607(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(36) int local36 = local19 <= 64 ? local19 * local15 >> 7 : local15 * (127 - local19) >> 7;
		@Pc(41) int local41 = local19 + local36;
		@Pc(57) int local57;
		if (local41 == 0) {
			local57 = local36 << 1;
		} else {
			local57 = (local36 << 8) / local41;
		}
		return (short) (local41 | local57 >> 4 << 7 | local9 << 10);
	}
}
