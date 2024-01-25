import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "J")
	public static long aLong47 = -1L;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Lclient!os;")
	public static final Class182 aClass182_58 = new Class182("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!gh;I)Z")
	public static boolean method1354(@OriginalArg(0) Class89 arg0) {
		if (Static355.anInt6050 == arg0.anInt2715) {
			Static146.anInt3027 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([Ljava/lang/String;BII[S)V")
	public static void method1355(@OriginalArg(0) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg2 + arg1) / 2;
		@Pc(17) int local17 = arg2;
		@Pc(21) String local21 = arg0[local15];
		arg0[local15] = arg0[arg1];
		arg0[arg1] = local21;
		@Pc(35) short local35 = arg3[local15];
		arg3[local15] = arg3[arg1];
		arg3[arg1] = local35;
		for (@Pc(47) int local47 = arg2; local47 < arg1; local47++) {
			if (local21 == null || arg0[local47] != null && arg0[local47].compareTo(local21) < (local47 & 0x1)) {
				@Pc(72) String local72 = arg0[local47];
				arg0[local47] = arg0[local17];
				arg0[local17] = local72;
				@Pc(86) short local86 = arg3[local47];
				arg3[local47] = arg3[local17];
				arg3[local17++] = local86;
			}
		}
		arg0[arg1] = arg0[local17];
		arg0[local17] = local21;
		arg3[arg1] = arg3[local17];
		arg3[local17] = local35;
		method1355(arg0, local17 - 1, arg2, arg3);
		method1355(arg0, arg1, local17 + 1, arg3);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method1356() {
		Static265.aClass267_47.method6011();
	}
}
