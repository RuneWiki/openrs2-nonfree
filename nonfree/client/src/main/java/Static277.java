import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Lclient!qn;")
	public static Class211 aClass211_67;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "[F")
	public static final float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
	public static void method3666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class4_Sub2_Sub17 local14 = Static34.method1709(6, arg0);
		local14.method5529();
		local14.anInt6873 = arg1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public static void method3667() {
		Static223.method3023();
		Static372.method4899(Static413.aClass49_Sub1_1.aBoolean234);
		Static226.aClass53_1 = Static304.method3977(22050, Static24.aClass196_1, Static391.aCanvas5, 0);
		Static226.aClass53_1.method5621(Static412.aClass4_Sub14_Sub1_3);
		Static413.aClass53_2 = Static304.method3977(2048, Static24.aClass196_1, Static391.aCanvas5, 1);
		Static413.aClass53_2.method5621(Static406.aClass4_Sub14_Sub2_2);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZII)I")
	public static int method3668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static23.anIntArray510[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method3669() {
		for (@Pc(3) int local3 = 0; local3 < Static67.aClass206ArrayArray1.length; local3++) {
			for (@Pc(9) int local9 = 0; local9 < Static67.aClass206ArrayArray1[local3].length; local9++) {
				Static67.aClass206ArrayArray1[local3][local9] = Static18.aClass206_1;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!wg;I)V")
	public static void method3671(@OriginalArg(0) Class8_Sub3_Sub1_Sub2 arg0) {
		for (@Pc(10) Class4_Sub22 local10 = (Class4_Sub22) Static273.aClass244_23.method5263(); local10 != null; local10 = (Class4_Sub22) Static273.aClass244_23.method5271()) {
			if (arg0 == local10.aClass8_Sub3_Sub1_Sub2_1) {
				if (local10.aClass4_Sub14_Sub4_2 != null) {
					Static406.aClass4_Sub14_Sub2_2.method2420(local10.aClass4_Sub14_Sub4_2);
					local10.aClass4_Sub14_Sub4_2 = null;
				}
				local10.method6059();
				return;
			}
		}
	}
}
