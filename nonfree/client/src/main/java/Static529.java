import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "Lclient!ou;")
	public static Class177 aClass177_10;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
	public static int anInt9415;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray38;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
	public static void method7837() {
		Static29.anInt761 = -1;
		Static422.anInt7227 = 0;
		Static90.anInt1949 = -1;
		Static526.anInt8657 = -1;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIZIIII)V")
	public static void method7842(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (Static72.aClass2_Sub12_Sub1_1.anInt1916 != 0 && arg2 != 0 && Static245.anInt4559 < 50 && arg0 != -1) {
			Static515.aClass351Array1[Static245.anInt4559++] = new Class351((byte) 2, arg0, arg2, arg3, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)I")
	public static int method7843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}
}
