import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_54 = new Class71(33, 6);

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "Z")
	public static boolean aBoolean388 = false;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V")
	public static void method4244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 != 8 && arg1 != 16) {
			@Pc(94) Class56 local94 = Static405.aClass56ArrayArrayArray2[arg3][arg0][arg2];
			if (local94 != null) {
				if (arg1 == 1) {
					local94.aShort20 = 0;
				} else if (arg1 == 2) {
					local94.aShort23 = 0;
				}
			}
			Static412.method6490();
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < Static134.anInt3553; local21++) {
			@Pc(27) Class372 local27 = Static619.aClass372Array4[local21];
			if (arg1 == local27.aByte129 && arg0 == local27.aShort125 && arg2 == local27.aShort123 || local27.aShort124 == arg0 && arg2 == local27.aShort123) {
				if (Static134.anInt3553 != local21) {
					Static649.method5530(Static619.aClass372Array4, local21 + 1, Static619.aClass372Array4, local21, Static619.aClass372Array4.length - local21 - 1);
				}
				Static134.anInt3553--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)Z")
	public static boolean method4246(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
