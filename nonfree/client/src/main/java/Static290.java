import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "Lclient!um;")
	public static Class244 aClass244_5;

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "[Lclient!tu;")
	public static final Class237[] aClass237Array1 = new Class237[6];

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "Z")
	public static boolean aBoolean384 = false;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(III)Z")
	public static boolean method3790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(III)Z")
	public static boolean method3791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static126.anIntArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == -Static214.anInt7431) {
			return false;
		} else if (local7 == Static214.anInt7431) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static384.anInt6381;
			@Pc(26) int local26 = arg2 << Static384.anInt6381;
			if (Static95.method1363(local22 + 1, Static202.aClass163Array2[arg0].I(arg1, arg2), local26 + 1) && Static95.method1363(local22 + Static329.anInt5395 - 1, Static202.aClass163Array2[arg0].I(arg1 + 1, arg2), local26 + 1) && Static95.method1363(local22 + Static329.anInt5395 - 1, Static202.aClass163Array2[arg0].I(arg1 + 1, arg2 + 1), local26 + Static329.anInt5395 - 1) && Static95.method1363(local22 + 1, Static202.aClass163Array2[arg0].I(arg1, arg2 + 1), local26 + Static329.anInt5395 - 1) && Static95.method1363(local22 + Static188.anInt3025, Static202.aClass163Array2[arg0].I(arg1, arg2), local26 + 1) && Static95.method1363(local22 + Static329.anInt5395 - 1, Static202.aClass163Array2[arg0].I(arg1 + 1, arg2), local26 + Static188.anInt3025) && Static95.method1363(local22 + Static188.anInt3025, Static202.aClass163Array2[arg0].I(arg1, arg2 + 1), local26 + Static329.anInt5395 - 1) && Static95.method1363(local22 + Static329.anInt5395 - 1, Static202.aClass163Array2[arg0].I(arg1, arg2), local26 + Static188.anInt3025) && Static95.method1363(local22 + Static188.anInt3025, Static202.aClass163Array2[arg0].I(arg1, arg2), local26 + Static188.anInt3025)) {
				Static126.anIntArrayArrayArray2[arg0][arg1][arg2] = Static214.anInt7431;
				return true;
			} else {
				Static126.anIntArrayArrayArray2[arg0][arg1][arg2] = -Static214.anInt7431;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)I")
	public static int method3792() {
		@Pc(7) Class128 local7 = Static213.aClass128_22;
		@Pc(17) boolean local17 = false;
		if (Static410.anInt6680 != 0) {
			@Pc(26) Canvas local26 = new Canvas();
			local26.setSize(100, 100);
			local17 = true;
			local7 = Static321.method3583(local26, 0, null, null, 0);
		}
		@Pc(43) long local43 = Static232.method3058();
		for (@Pc(45) int local45 = 0; local45 < 10000; local45++) {
			local7.method3591();
		}
		@Pc(70) int local70 = (int) (Static232.method3058() - local43);
		local7.method3580(0, 0, 100, -16777216, 100);
		if (local17) {
			local7.method3596();
		}
		return local70;
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(III)B")
	public static byte method3793(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
