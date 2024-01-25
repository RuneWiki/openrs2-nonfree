import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "D", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!aa", name = "B", descriptor = "I")
	public static int anInt6422 = 0;

	@OriginalMember(owner = "client!aa", name = "C", descriptor = "Lclient!pn;")
	public static final Class103 aClass103_2 = Static329.method5660();

	@OriginalMember(owner = "client!aa", name = "F", descriptor = "Z")
	public static boolean aBoolean433 = false;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)V")
	public static void method5705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class213 local7 = Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass10_Sub4_1 != null) {
			local7.aClass10_Sub4_1 = null;
		}
		if (local7.aClass10_Sub4_2 != null) {
			local7.aClass10_Sub4_2 = null;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
	public static int method5706(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!mo;Lclient!mo;I)V")
	public static void method5707(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class143 arg1) {
		Static237.aClass143_88 = arg0;
		Static314.aClass143_109 = arg1;
		Static314.aClass143_109.method3732(34);
	}

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V")
	public static void method5708() {
		if (Static96.method2208() || Static125.anInt2720 == Static219.anInt4400) {
			Static67.method1659(Static218.aClass46_5);
			if (Static219.anInt4400 != Static266.anInt5050) {
				Static224.method4014();
			}
		} else {
			Static63.method1496(false, Static219.anInt4400, Static217.anInt4356, false, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static31.anInt735);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIZI)V")
	public static void method5709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static126.method2624(arg1)) {
			Static64.method1506(Static182.aClass146ArrayArray1[arg1], arg3, -1, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIB)Lclient!ln;")
	public static Class14_Sub2_Sub13 method5711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class14_Sub2_Sub13 local15 = (Class14_Sub2_Sub13) Static157.aClass25_10.method691((long) arg0 << 32 | (long) arg1);
		if (local15 == null) {
			local15 = new Class14_Sub2_Sub13(arg0, arg1);
			Static157.aClass25_10.method687(local15.aLong217, local15);
		}
		return local15;
	}
}
