import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!il", name = "e", descriptor = "I")
	public static int anInt2942;

	@OriginalMember(owner = "client!il", name = "i", descriptor = "Lclient!hf;")
	public static Class103 aClass103_3;

	@OriginalMember(owner = "client!il", name = "j", descriptor = "Lclient!ll;")
	public static Class152 aClass152_6;

	@OriginalMember(owner = "client!il", name = "l", descriptor = "[Lclient!ig;")
	public static Class12[] aClass12Array10;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "I")
	public static int anInt2940 = 0;

	@OriginalMember(owner = "client!il", name = "d", descriptor = "Z")
	public static boolean aBoolean204 = true;

	@OriginalMember(owner = "client!il", name = "f", descriptor = "I")
	public static int anInt2943 = 503;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
	public static void method2688(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static30.aClass189ArrayArrayArray2 = Static280.aClass189ArrayArrayArray3;
			Static420.aClass84Array4 = Static365.aClass84Array3;
		} else {
			Static30.aClass189ArrayArrayArray2 = Static14.aClass189ArrayArrayArray1;
			Static420.aClass84Array4 = Static93.aClass84Array1;
		}
		Static268.anInt4600 = Static30.aClass189ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIB)I")
	public static int method2689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static420.aClass84Array4 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg0 >> 7;
		@Pc(15) int local15 = arg2 >> 7;
		if (local11 < 0 || local15 < 0 || local11 > Static84.anInt1632 - 1 || local15 > Static261.anInt4480 - 1) {
			return 0;
		}
		@Pc(37) int local37 = arg1;
		if (arg1 < 3 && (Static179.aByteArrayArrayArray3[1][local11][local15] & 0x2) != 0) {
			local37 = arg1 + 1;
		}
		return Static420.aClass84Array4[local37].method5334(arg0, arg2);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
	public static void method2690(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static303.anInt4991 = arg0;
	}
}
