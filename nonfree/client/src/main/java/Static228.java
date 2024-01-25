import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "F")
	public static float aFloat92;

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
	public static int anInt4681;

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "Lclient!nb;")
	public static Class4_Sub13_Sub3 aClass4_Sub13_Sub3_2;

	@OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
	public static int anInt4680 = 0;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V")
	public static void method3965() {
		for (@Pc(15) Class4_Sub18 local15 = (Class4_Sub18) Static354.aClass124_32.method3267(); local15 != null; local15 = (Class4_Sub18) Static354.aClass124_32.method3273()) {
			if (Static324.method4905(local15.anInt3158)) {
				Static325.method4908(local15);
			}
		}
		if (Static300.anInt5730 == 1) {
			Static31.method556();
			return;
		}
		Static268.method4360(Static473.anInt7981, Static100.anInt9640, Static35.anInt711, Static333.anInt5926);
		@Pc(51) int local51 = Static195.aClass196_5.method4386(Static275.aClass198_23.method4407(Static56.anInt953));
		for (@Pc(56) Class4_Sub18 local56 = (Class4_Sub18) Static354.aClass124_32.method3267(); local56 != null; local56 = (Class4_Sub18) Static354.aClass124_32.method3273()) {
			@Pc(62) int local62 = Static1.method43(local56);
			if (local51 < local62) {
				local51 = local62;
			}
		}
		Static35.anInt711 = Static300.anInt5730 * 16 + (Static272.aBoolean390 ? 26 : 22);
		Static100.anInt9640 = local51 + 8;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "([SI[Ljava/lang/String;II)V")
	public static void method3966(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg1) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) String local20 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local20;
		@Pc(34) short local34 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg1; local46++) {
			if (local20 == null || arg2[local46] != null && arg2[local46].compareTo(local20) < (local46 & 0x1)) {
				@Pc(71) String local71 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16] = local71;
				@Pc(85) short local85 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local85;
			}
		}
		arg2[arg1] = arg2[local16];
		arg2[local16] = local20;
		arg0[arg1] = arg0[local16];
		arg0[local16] = local34;
		method3966(arg0, local16 - 1, arg2, arg3);
		method3966(arg0, arg1, arg2, local16 + 1);
	}
}
