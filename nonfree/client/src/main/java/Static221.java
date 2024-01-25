import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!gu", name = "n", descriptor = "Lclient!cga;")
	public static final Class60 aClass60_73 = new Class60();

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "([IIIIZIII)Z")
	public static boolean method3094(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static451.anInt7308 < arg3) {
			arg3 = Static451.anInt7308;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		if (arg3 <= arg4) {
			return true;
		}
		@Pc(35) int local35 = arg3 - arg4 >> 2;
		arg1 += arg4 * arg2;
		arg5 += arg4 - 1;
		@Pc(93) int local93;
		@Pc(77) int local77;
		@Pc(65) int local65;
		if (Static637.anInt4095 == 1) {
			Static170.anInt2918 += local35;
			while (true) {
				local35--;
				if (local35 < 0) {
					local35 = arg3 - arg4 & 0x3;
					while (true) {
						local35--;
						if (local35 < 0) {
							return true;
						}
						local93 = ~arg1;
						arg5++;
						if (local93 > ~arg0[arg5]) {
							arg0[arg5] = arg1;
						}
						arg1 += arg2;
					}
				}
				local65 = arg5 + 1;
				if (arg0[local65] > arg1) {
					arg0[local65] = arg1;
				}
				local77 = arg1 + arg2;
				local93 = ~local77;
				local65++;
				if (local93 > ~arg0[local65]) {
					arg0[local65] = local77;
				}
				local77 += arg2;
				local93 = ~local77;
				local65++;
				if (local93 > ~arg0[local65]) {
					arg0[local65] = local77;
				}
				local77 += arg2;
				arg5 = local65 + 1;
				if (local77 < arg0[arg5]) {
					arg0[arg5] = local77;
				}
				arg1 = local77 + arg2;
			}
		} else {
			arg1 -= 38400;
			while (true) {
				local35--;
				if (local35 < 0) {
					local35 = arg3 - arg4 & 0x3;
					while (true) {
						local35--;
						if (local35 < 0) {
							return true;
						}
						local93 = ~arg1;
						arg5++;
						if (local93 > ~arg0[arg5]) {
							return false;
						}
						arg1 += arg2;
					}
				}
				local65 = arg5 + 1;
				if (arg1 < arg0[local65]) {
					return false;
				}
				local77 = arg1 + arg2;
				local65++;
				if (arg0[local65] > local77) {
					return false;
				}
				local77 += arg2;
				local93 = ~local77;
				local65++;
				if (local93 > ~arg0[local65]) {
					return false;
				}
				local77 += arg2;
				local93 = ~local77;
				arg5 = local65 + 1;
				if (local93 > ~arg0[arg5]) {
					return false;
				}
				arg1 = local77 + arg2;
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)Lclient!sh;")
	public static Class2_Sub51 method3095() {
		if (Static90.aClass60_65 == null || Static346.aClass190_1 == null) {
			return null;
		}
		for (@Pc(28) Class2_Sub51 local28 = (Class2_Sub51) Static346.aClass190_1.method4062(); local28 != null; local28 = (Class2_Sub51) Static346.aClass190_1.method4062()) {
			@Pc(36) Class259 local36 = Static90.aClass196_3.method4194(local28.anInt9158);
			if (local36 != null && local36.aBoolean584 && local36.method6247(Static90.anInterface26_2)) {
				return local28;
			}
		}
		return null;
	}
}
