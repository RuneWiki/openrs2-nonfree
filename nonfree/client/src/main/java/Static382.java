import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "[I")
	public static final int[] anIntArray485 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
	public static void method6045(@OriginalArg(0) int arg0) {
		if (!Static291.method4732(arg0)) {
			return;
		}
		@Pc(22) Class198[] local22 = Static71.aClass198ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class198 local30 = local22[local24];
			if (local30 != null) {
				local30.anInt5753 = 0;
				local30.anInt5783 = 1;
				local30.anInt5735 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(JJ)J")
	public static long method6046(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
	public static void method6047() {
		@Pc(13) Class12_Sub3 local13 = (Class12_Sub3) Static55.aClass73_13.method2005();
		@Pc(24) boolean local24 = Static191.aClass198_6 != null || Static351.anInt6572 > 0;
		if (local24) {
			Static58.anInt1425 = 1;
		}
		if (Static435.aBoolean553 && Static23.aClass5_3.method211(81) && Static8.anInt118 > 2) {
			if (local24) {
				Static419.aClass12_Sub20_3 = (Class12_Sub20) Static192.aClass73_33.aClass12_47.aClass12_284.aClass12_284;
			} else {
				Static246.method4224(local13.method6279(), local13.method6275(), (Class12_Sub20) Static192.aClass73_33.aClass12_47.aClass12_284.aClass12_284);
			}
		} else if (local24) {
			Static419.aClass12_Sub20_3 = (Class12_Sub20) Static192.aClass73_33.aClass12_47.aClass12_284;
		} else {
			Static246.method4224(local13.method6279(), local13.method6275(), (Class12_Sub20) Static192.aClass73_33.aClass12_47.aClass12_284);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)Z")
	public static boolean method6051(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
