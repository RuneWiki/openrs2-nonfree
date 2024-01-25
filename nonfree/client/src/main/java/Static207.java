import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!kn", name = "v", descriptor = "I")
	public static int anInt3928;

	@OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
	public static int anInt3929;

	@OriginalMember(owner = "client!kn", name = "p", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_120 = new Class107(8, -2);

	@OriginalMember(owner = "client!kn", name = "t", descriptor = "I")
	public static int anInt3927 = -1;

	@OriginalMember(owner = "client!kn", name = "u", descriptor = "[I")
	public static final int[] anIntArray327 = new int[25];

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!kk;I)V")
	public static void method3308(@OriginalArg(0) Class31_Sub2_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static378.anInt4244 == arg0.anInt7312 || arg0.anInt7365 == -1 || arg0.anInt7323 != 0) {
			local5 = true;
		} else {
			@Pc(26) Class223 local26 = Static293.aClass127_1.method2975(arg0.anInt7365);
			if (local26.aBoolean422 || local26.anIntArray559[arg0.anInt7350] < arg0.anInt7320 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(54) int local54 = arg0.anInt7312 - arg0.anInt7351;
			@Pc(60) int local60 = Static378.anInt4244 - arg0.anInt7351;
			@Pc(71) int local71 = arg0.anInt7353 * 128 + arg0.method5989() * 64;
			@Pc(82) int local82 = arg0.anInt7324 * 128 + arg0.method5989() * 64;
			@Pc(93) int local93 = arg0.anInt7358 * 128 + arg0.method5989() * 64;
			@Pc(104) int local104 = arg0.anInt7308 * 128 + arg0.method5989() * 64;
			arg0.anInt7300 = (local93 * local60 + local71 * (local54 - local60)) / local54;
			arg0.anInt7298 = ((local54 - local60) * local82 + local60 * local104) / local54;
		}
		arg0.anInt7380 = 0;
		if (arg0.anInt7362 == 0) {
			arg0.method5988(8192);
		}
		if (arg0.anInt7362 == 1) {
			arg0.method5988(12288);
		}
		if (arg0.anInt7362 == 2) {
			arg0.method5988(0);
		}
		if (arg0.anInt7362 == 3) {
			arg0.method5988(4096);
		}
	}
}
