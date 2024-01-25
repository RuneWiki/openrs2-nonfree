import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!em", name = "e", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_70 = new Class88("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!em", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean219 = true;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "([BIIIIII)Z")
	public static boolean method2449(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg4 + 8 - 1) / 8);
		@Pc(41) int local41 = -((arg2 + 7) / 8);
		for (@Pc(47) int local47 = local32; local47 < 0; local47++) {
			for (@Pc(51) int local51 = local41; local51 < 0; local51++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local16;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg3;
		}
		return false;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I[Lclient!ha;)V")
	public static void method2450(@OriginalArg(1) Class84[] arg0) {
		Static254.anInt5218 = arg0.length;
		Static515.anIntArray677 = new int[Static254.anInt5218 + 10];
		Static519.aClass84Array15 = new Class84[Static254.anInt5218 + 10];
		Static554.method3497(arg0, 0, Static519.aClass84Array15, 0, Static254.anInt5218);
		for (@Pc(31) int local31 = 0; local31 < Static254.anInt5218; local31++) {
			Static515.anIntArray677[local31] = Static519.aClass84Array15[local31].ma();
		}
		for (@Pc(46) int local46 = Static254.anInt5218; local46 < Static519.aClass84Array15.length; local46++) {
			Static515.anIntArray677[local46] = 12;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILjava/awt/Component;)Lclient!re;")
	public static Class5 method2452(@OriginalArg(1) Component arg0) {
		return new Class5_Sub1(arg0);
	}
}
