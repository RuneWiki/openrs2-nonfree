import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!sg", name = "K", descriptor = "Lclient!lb;")
	public static Class221 aClass221_147;

	@OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
	public static int anInt9512;

	@OriginalMember(owner = "client!sg", name = "L", descriptor = "Z")
	public static volatile boolean aBoolean690 = true;

	@OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
	public static int anInt9508 = 0;

	@OriginalMember(owner = "client!sg", name = "O", descriptor = "I")
	public static int anInt9510 = -1;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(FZFFI)F")
	public static float method8023(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(14) float[] local14 = Static686.aFloatArrayArray13[arg3];
		return arg2 * local14[1] + arg0 * local14[0] + local14[2] * arg1;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
	public static String method8024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(17) String local17 = arg2[arg1];
			return local17 == null ? "null" : local17.toString();
		} else {
			@Pc(31) int local31 = arg1 + arg0;
			@Pc(33) int local33 = 0;
			for (@Pc(35) int local35 = arg1; local35 < local31; local35++) {
				@Pc(41) String local41 = arg2[local35];
				if (local41 == null) {
					local33 += 4;
				} else {
					local33 += local41.length();
				}
			}
			@Pc(66) StringBuffer local66 = new StringBuffer(local33);
			for (@Pc(68) int local68 = arg1; local68 < local31; local68++) {
				@Pc(76) String local76 = arg2[local68];
				if (local76 == null) {
					local66.append("null");
				} else {
					local66.append(local76);
				}
			}
			return local66.toString();
		}
	}
}
