import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
	public static int anInt177;

	@OriginalMember(owner = "client!ak", name = "v", descriptor = "Lclient!qn;")
	public static Class211 aClass211_9;

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "Z")
	public static boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ak", name = "m", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_11 = new Class56(75, -2);

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
	public static int anInt178 = -1;

	@OriginalMember(owner = "client!ak", name = "w", descriptor = "Lclient!hd;")
	public static Class110 aClass110_1 = null;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!bf;)V")
	public static void method158(@OriginalArg(1) Class8_Sub3_Sub1 arg0) {
		@Pc(11) boolean local11 = false;
		if (arg0.anInt7349 == Static265.anInt4371 || arg0.anInt7365 == -1 || arg0.anInt7359 != 0) {
			local11 = true;
		} else {
			@Pc(35) Class119 local35 = Static170.aClass125_3.method2389(arg0.anInt7365);
			if (local35.aBoolean223 || local35.anIntArray242[arg0.anInt7375] < arg0.anInt7373 + 1) {
				local11 = true;
			}
		}
		if (local11) {
			@Pc(63) int local63 = arg0.anInt7349 - arg0.anInt7351;
			@Pc(69) int local69 = Static265.anInt4371 - arg0.anInt7351;
			@Pc(81) int local81 = arg0.anInt7350 * 128 + arg0.method5894() * 64;
			@Pc(92) int local92 = arg0.anInt7411 * 128 + arg0.method5894() * 64;
			@Pc(103) int local103 = arg0.anInt7413 * 128 + arg0.method5894() * 64;
			@Pc(114) int local114 = arg0.anInt7423 * 128 + arg0.method5894() * 64;
			arg0.anInt7343 = ((local63 - local69) * local92 + local114 * local69) / local63;
			arg0.anInt7339 = (local103 * local69 + (local63 - local69) * local81) / local63;
		}
		arg0.anInt7426 = 0;
		if (arg0.anInt7368 == 0) {
			arg0.method5889(8192);
		}
		if (arg0.anInt7368 == 1) {
			arg0.method5889(12288);
		}
		if (arg0.anInt7368 == 2) {
			arg0.method5889(0);
		}
		if (arg0.anInt7368 == 3) {
			arg0.method5889(4096);
		}
	}
}
