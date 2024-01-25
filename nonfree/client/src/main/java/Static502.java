import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "[I")
	public static int[] anIntArray361;

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
	public static final int anInt4118 = 1337;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)[Lclient!mt;")
	public static Class228[] method3751() {
		return new Class228[] { Static506.aClass228_12, Static341.aClass228_7, Static52.aClass228_2, Static60.aClass228_3, Static154.aClass228_4, Static447.aClass228_9, Static665.aClass228_15, Static293.aClass228_6, Static362.aClass228_8, Static5.aClass228_1, Static675.aClass228_16, Static488.aClass228_14, Static468.aClass228_13, Static231.aClass228_5 };
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)Z")
	public static boolean method3752() {
		Static12.aBoolean12 = true;
		Static611.anInt9850++;
		return true;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)S")
	public static short method3753(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(43) int local43 = local24 <= 64 ? local24 * local15 >> 7 : local15 * (127 - local24) >> 7;
		@Pc(47) int local47 = local43 + local24;
		@Pc(53) int local53;
		if (local47 == 0) {
			local53 = local43 << 1;
		} else {
			local53 = (local43 << 8) / local47;
		}
		return (short) (local9 << 10 | local53 >> 4 << 7 | local47);
	}
}
