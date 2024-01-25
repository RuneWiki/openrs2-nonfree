import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
	public static int anInt6352;

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
	public static int anInt6353;

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "Lclient!fh;")
	public static final Class107 aClass107_5 = new Class107("LOCAL", 4);

	@OriginalMember(owner = "client!ks", name = "i", descriptor = "Lclient!pha;")
	public static Class262 aClass262_1 = new Class262();

	@OriginalMember(owner = "client!ks", name = "j", descriptor = "F")
	public static float aFloat154 = 1024.0F;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IBIIII[II)Z")
	public static boolean method5398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5) {
		if (Static640.anInt11044 < arg2) {
			arg2 = Static640.anInt11044;
		}
		if (arg3 < 0) {
			arg3 = 0;
		}
		if (arg3 >= arg2) {
			return true;
		}
		arg5 += arg3 - 1;
		arg1 += arg0 * arg3;
		@Pc(50) int local50 = arg2 - arg3 >> 2;
		@Pc(64) int local64;
		@Pc(77) int local77;
		@Pc(66) int local66;
		if (Static126.anInt3222 == 1) {
			Static513.anInt9411 += local50;
			while (true) {
				local50--;
				if (local50 < 0) {
					local50 = arg2 - arg3 & 0x3;
					while (true) {
						local50--;
						if (local50 < 0) {
							return true;
						}
						local64 = ~arg1;
						arg5++;
						if (local64 > ~arg4[arg5]) {
							arg4[arg5] = arg1;
						}
						arg1 += arg0;
					}
				}
				local64 = ~arg1;
				local66 = arg5 + 1;
				if (local64 > ~arg4[local66]) {
					arg4[local66] = arg1;
				}
				local77 = arg1 + arg0;
				local64 = ~local77;
				local66++;
				if (local64 > ~arg4[local66]) {
					arg4[local66] = local77;
				}
				local77 += arg0;
				local66++;
				if (local77 < arg4[local66]) {
					arg4[local66] = local77;
				}
				local77 += arg0;
				local64 = ~local77;
				arg5 = local66 + 1;
				if (local64 > ~arg4[arg5]) {
					arg4[arg5] = local77;
				}
				arg1 = local77 + arg0;
			}
		} else {
			arg1 -= 38400;
			while (true) {
				local50--;
				if (local50 < 0) {
					local50 = arg2 - arg3 & 0x3;
					while (true) {
						local50--;
						if (local50 < 0) {
							return true;
						}
						arg5++;
						if (arg1 < arg4[arg5]) {
							return false;
						}
						arg1 += arg0;
					}
				}
				local64 = ~arg1;
				local66 = arg5 + 1;
				if (local64 > ~arg4[local66]) {
					return false;
				}
				local77 = arg1 + arg0;
				local66++;
				if (arg4[local66] > local77) {
					return false;
				}
				local77 += arg0;
				local66++;
				if (local77 < arg4[local66]) {
					return false;
				}
				local77 += arg0;
				arg5 = local66 + 1;
				if (arg4[arg5] > local77) {
					return false;
				}
				arg1 = local77 + arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V")
	public static void method5400() {
		Static304.aBoolean472 = true;
	}
}
