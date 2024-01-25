import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!rn", name = "y", descriptor = "Lclient!f;")
	public static Class3_Sub2_Sub2 aClass3_Sub2_Sub2_2;

	@OriginalMember(owner = "client!rn", name = "J", descriptor = "Lclient!ir;")
	public static Class100 aClass100_109;

	@OriginalMember(owner = "client!rn", name = "z", descriptor = "I")
	public static int anInt5473 = 0;

	@OriginalMember(owner = "client!rn", name = "B", descriptor = "[S")
	public static final short[] aShortArray103 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!rn", name = "E", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!rn", name = "H", descriptor = "[I")
	public static final int[] anIntArray436 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!rn", name = "Q", descriptor = "I")
	public static int anInt5484 = -1;

	@OriginalMember(owner = "client!rn", name = "R", descriptor = "Z")
	public static boolean aBoolean343 = false;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!tj;BILclient!sj;I)V")
	public static void method4609(@OriginalArg(0) Class122 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class181 arg2, @OriginalArg(4) int arg3) {
		if (arg2.anInt5715 == 2) {
			for (@Pc(72) int local72 = arg3; local72 <= arg1; local72++) {
				@Pc(81) int local81 = arg2.anIntArray469[local72] - 1;
				if (local81 != -1) {
					@Pc(118) boolean local118;
					if (Static235.anInt4719 == 1 && local72 == Static67.anInt1361 && arg2.anInt5761 == Static331.anInt6460) {
						local118 = Static263.method4429(arg2.anIntArray456[local72], 0, null, arg2.anInt5746, arg0, 2, local81) == null;
						if (local118) {
							Static225.aClass127_29.method3387(new Class3_Sub18(local81, arg2.anIntArray456[local72], 2, 0, arg2.anInt5746, false));
						}
					} else {
						local118 = Static263.method4429(arg2.anIntArray456[local72], -13623264, null, arg2.anInt5746, arg0, 1, local81) == null;
						if (local118) {
							Static225.aClass127_29.method3387(new Class3_Sub18(local81, arg2.anIntArray456[local72], 1, -13623264, arg2.anInt5746, false));
						}
					}
				}
			}
		} else if (arg2.anInt5715 == 5) {
			@Pc(46) boolean local46 = Static263.method4429(arg2.anInt5707, arg2.anInt5736 | 0xFF000000, arg2.aBoolean389 ? Static349.aClass5_Sub4_Sub4_Sub1_2.aClass174_1 : null, arg2.anInt5746, arg0, arg2.anInt5710, arg2.anInt5684) == null;
			if (local46) {
				Static225.aClass127_29.method3387(new Class3_Sub18(arg2.anInt5684, arg2.anInt5707, arg2.anInt5710, arg2.anInt5736 | 0xFF000000, arg2.anInt5746, arg2.aBoolean389));
			}
		}
	}
}
