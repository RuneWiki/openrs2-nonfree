import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!kea", name = "j", descriptor = "Lclient!fg;")
	public static Class4_Sub18 aClass4_Sub18_2;

	@OriginalMember(owner = "client!kea", name = "k", descriptor = "I")
	public static int anInt5152;

	@OriginalMember(owner = "client!kea", name = "l", descriptor = "Lclient!ck;")
	public static Class56 aClass56_4;

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "Z")
	public static boolean aBoolean388 = false;

	@OriginalMember(owner = "client!kea", name = "m", descriptor = "[F")
	public static final float[] aFloatArray35 = new float[16];

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIZ)V")
	public static void method4360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(9) int local9 = 0; local9 < Static433.anInt7419; local9++) {
			@Pc(15) Rectangle local15 = Class63_Sub1.aRectangleArray4[local9];
			if (local15.x + local15.width > arg0 && local15.x < arg0 + arg1 && local15.height + local15.y > arg3 && arg2 + arg3 > local15.y) {
				Static271.aBooleanArray21[local9] = true;
			}
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)I")
	public static int method4361() {
		if (Static287.aClass115_12 == null) {
			if (!Static325.aBoolean431 && Static300.anInt5730 > 0) {
				if (Static307.aBoolean423 && Static12.aClass173_1.method6259(81) && Static300.anInt5730 > 2) {
					return ((Class4_Sub18) Static354.aClass124_32.aClass4_90.aClass4_288.aClass4_288).anInt3159;
				}
				return ((Class4_Sub18) Static354.aClass124_32.aClass4_90.aClass4_288).anInt3159;
			}
			@Pc(23) int local23 = Static86.aClass50_1.method7100();
			@Pc(27) int local27 = Static86.aClass50_1.method7102();
			@Pc(29) int local29 = Static473.anInt7981;
			@Pc(31) int local31 = Static333.anInt5926;
			@Pc(33) int local33 = Static100.anInt9640;
			if (local23 > local29 && local33 + local29 > local23) {
				@Pc(51) int local51 = -1;
				@Pc(70) int local70;
				for (@Pc(53) int local53 = 0; local53 < Static300.anInt5730; local53++) {
					if (Static272.aBoolean390) {
						local70 = local31 + (-local53 + -1 + Static300.anInt5730) * 16 + 33;
						if (local70 - 13 < local27 && local27 <= local70 + 3) {
							local51 = local53;
						}
					} else {
						local70 = (Static300.anInt5730 - local53 - 1) * 16 + local31 + 31;
						if (local27 > local70 - 13 && local27 <= local70 + 3) {
							local51 = local53;
						}
					}
				}
				if (local51 != -1) {
					local70 = 0;
					@Pc(132) Class331 local132 = new Class331(Static354.aClass124_32);
					for (@Pc(137) Class4_Sub18 local137 = (Class4_Sub18) local132.method7399(); local137 != null; local137 = (Class4_Sub18) local132.method7401()) {
						if (local51 == local70++) {
							return local137.anInt3159;
						}
					}
				}
			}
		}
		return -1;
	}
}
