import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!ss", name = "J", descriptor = "Lclient!o;")
	public static final Class169 aClass169_301 = new Class169(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!ss", name = "K", descriptor = "I")
	public static int anInt5548 = 0;

	@OriginalMember(owner = "client!ss", name = "O", descriptor = "I")
	public static int anInt5552 = 0;

	@OriginalMember(owner = "client!ss", name = "Q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray77 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!ak;IIII)V")
	public static void method4784(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static269.method797(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static19.anInt329) {
			Static269.method797(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static269.method797(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static230.anInt6113) {
			Static269.method797(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static230.anInt6113) {
			Static269.method797(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static19.anInt329 && arg4 <= Static230.anInt6113) {
			Static269.method797(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static269.method797(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static19.anInt329 && arg4 > 0) {
			Static269.method797(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "(I)V")
	public static void method4785() {
		Static177.method1119(Static39.aClass48_27);
		Static209.aClass1_Sub33_Sub2_2.method5165(0);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!fq;III[Z)V")
	public static void method4786(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static229.aClass42Array3 == Static77.aClass42Array2) {
			return;
		}
		@Pc(9) int local9 = Static239.aClass42Array4[arg1].method3043(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class42 local22 = Static239.aClass42Array4[local11];
				if (local22 != null) {
					local22.method3054(arg0, arg2, local9 - local22.method3043(arg2, arg3), arg3);
				}
			}
		}
	}
}
