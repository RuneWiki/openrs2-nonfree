import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
	public static int anInt4015;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "F")
	public static float aFloat57;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
	public static int anInt4010 = 0;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "Lclient!sr;")
	public static final Class227 aClass227_24 = new Class227();

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!sd;")
	public static final Class220 aClass220_23 = new Class220(10, 2, 2, 0);

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLjava/awt/Frame;Lclient!fq;)V")
	public static void method3259(@OriginalArg(1) Frame arg0, @OriginalArg(2) Class83 arg1) {
		while (true) {
			@Pc(6) Class232 local6 = arg1.method1864(arg0);
			while (local6.anInt6402 == 0) {
				Static223.method4582(10L);
			}
			if (local6.anInt6402 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static223.method4582(100L);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIBI)I")
	public static int method3260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method3261() {
		if (Static353.aClass125_1 != null) {
			Static353.aClass125_1.method5869();
		}
		if (Static356.aClass125_2 != null) {
			Static356.aClass125_2.method5869();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V")
	public static void method3263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static427.anInt7214 <= arg0 && arg0 <= Static434.anInt7302) {
			@Pc(23) int local23 = Static412.method5316(Static289.anInt5053, Static93.anInt1676, arg2);
			@Pc(29) int local29 = Static412.method5316(Static289.anInt5053, Static93.anInt1676, arg3);
			Static188.method2690(local29, local23, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method3264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg7 && arg5 == arg8 && arg3 == arg1 && arg2 == arg6) {
			Static161.method2329(arg3, arg7, arg8, arg0, arg6);
			return;
		}
		@Pc(19) int local19 = arg7;
		@Pc(21) int local21 = arg8;
		@Pc(25) int local25 = arg7 * 3;
		@Pc(29) int local29 = arg8 * 3;
		@Pc(33) int local33 = arg4 * 3;
		@Pc(37) int local37 = arg5 * 3;
		@Pc(41) int local41 = arg1 * 3;
		@Pc(45) int local45 = arg2 * 3;
		@Pc(56) int local56 = arg3 + local33 - arg7 - local41;
		@Pc(66) int local66 = local37 + arg6 - arg8 - local45;
		@Pc(76) int local76 = local41 + local25 - local33 - local33;
		@Pc(85) int local85 = local29 + local45 - local37 - local37;
		@Pc(90) int local90 = local33 - local25;
		@Pc(95) int local95 = local37 - local29;
		for (@Pc(97) int local97 = 128; local97 <= 4096; local97 += 128) {
			@Pc(105) int local105 = local97 * local97 >> 12;
			@Pc(111) int local111 = local105 * local97 >> 12;
			@Pc(115) int local115 = local56 * local111;
			@Pc(119) int local119 = local111 * local66;
			@Pc(123) int local123 = local105 * local76;
			@Pc(127) int local127 = local85 * local105;
			@Pc(131) int local131 = local97 * local90;
			@Pc(135) int local135 = local97 * local95;
			@Pc(145) int local145 = (local131 + local123 + local115 >> 12) + arg7;
			@Pc(156) int local156 = (local135 + local119 + local127 >> 12) + arg8;
			Static161.method2329(local145, local19, local21, arg0, local156);
			local19 = local145;
			local21 = local156;
		}
	}
}
