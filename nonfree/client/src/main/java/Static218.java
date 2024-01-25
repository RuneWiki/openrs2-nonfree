import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
	public static int anInt7513;

	@OriginalMember(owner = "client!ko", name = "I", descriptor = "I")
	public static int anInt7514;

	@OriginalMember(owner = "client!ko", name = "A", descriptor = "Lclient!of;")
	public static final Class174 aClass174_209 = new Class174("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!ko", name = "E", descriptor = "Lclient!la;")
	public static final Class136 aClass136_200 = new Class136(69, -1);

	@OriginalMember(owner = "client!ko", name = "F", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_192 = new Class163(68, 2);

	@OriginalMember(owner = "client!ko", name = "G", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray42 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!ko", name = "H", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_193 = new Class163(5, 0);

	@OriginalMember(owner = "client!ko", name = "J", descriptor = "Lclient!of;")
	public static final Class174 aClass174_210 = new Class174("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIZ)V")
	public static void method6133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = Static39.aClass79_Sub1_1.anInt2147 * arg0 >> 8;
		if (arg2 == -1 && !Static240.aBoolean428) {
			Static322.method4455();
		} else if (arg2 != -1 && (arg2 != Static81.anInt1464 || !Static358.method5007()) && local6 != 0 && !Static240.aBoolean428) {
			Static343.method4803(local6, Static28.aClass250_12, arg1, arg2);
		}
		Static81.anInt1464 = arg2;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIII)V")
	public static void method6135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(17) int local17 = -arg3;
		@Pc(19) int local19 = -1;
		Static201.method3084(Static296.anIntArrayArray42[arg0], arg1 - arg3, arg1 - -arg3, arg2);
		while (local7 < local9) {
			local19 += 2;
			local7++;
			local17 += local19;
			if (local17 >= 0) {
				local9--;
				local17 -= local9 << 1;
				@Pc(55) int[] local55 = Static296.anIntArrayArray42[local9 + arg0];
				@Pc(62) int[] local62 = Static296.anIntArrayArray42[arg0 - local9];
				@Pc(67) int local67 = arg1 + local7;
				@Pc(71) int local71 = arg1 - local7;
				Static201.method3084(local55, local71, local67, arg2);
				Static201.method3084(local62, local71, local67, arg2);
			}
			@Pc(87) int local87 = local9 + arg1;
			@Pc(92) int local92 = arg1 - local9;
			@Pc(98) int[] local98 = Static296.anIntArrayArray42[local7 + arg0];
			@Pc(105) int[] local105 = Static296.anIntArrayArray42[arg0 - local7];
			Static201.method3084(local98, local92, local87, arg2);
			Static201.method3084(local105, local92, local87, arg2);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIIII)I")
	public static int method6142(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg5 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(14) int local14 = arg1;
			arg1 = arg4;
			arg4 = local14;
		}
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg3;
		} else if (local7 == 2) {
			return 7 + 1 - arg0 - arg1;
		} else {
			return 1 + 7 - arg4 - arg3;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZI)I")
	public static int method6143(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub32 local14 = Static457.method6232(false, arg0);
		if (local14 == null) {
			return Static247.aClass46_2.method1264(arg0).anInt6394;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray274.length; local26++) {
			if (local14.anIntArray274[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static247.aClass46_2.method1264(arg0).anInt6394 - local14.anIntArray274.length;
	}
}
