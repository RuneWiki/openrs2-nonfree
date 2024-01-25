import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!sk", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[100];

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!o;)V")
	public static void method5227(@OriginalArg(0) int arg0, @OriginalArg(1) Class55 arg1) {
		Static178.aClass55Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!wj;)V")
	public static void method5235(@OriginalArg(1) Class1_Sub2_Sub6 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt7611 == Static172.anInt3107 || arg0.anInt7612 == -1 || arg0.anInt7624 != 0) {
			local5 = true;
		} else {
			@Pc(26) Class261 local26 = Static444.aClass59_3.method1552(arg0.anInt7612);
			if (local26.aBoolean502 || local26.anIntArray493[arg0.anInt7588] < arg0.anInt7620 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(54) int local54 = arg0.anInt7611 - arg0.anInt7568;
			@Pc(60) int local60 = Static172.anInt3107 - arg0.anInt7568;
			@Pc(72) int local72 = arg0.anInt7577 * 128 + arg0.method6204() * 64;
			@Pc(83) int local83 = arg0.anInt7601 * 128 + arg0.method6204() * 64;
			@Pc(95) int local95 = arg0.anInt7610 * 128 + arg0.method6204() * 64;
			@Pc(106) int local106 = arg0.anInt7587 * 128 + arg0.method6204() * 64;
			arg0.anInt7560 = ((local54 - local60) * local72 + local95 * local60) / local54;
			arg0.anInt7557 = (local106 * local60 + (local54 - local60) * local83) / local54;
		}
		arg0.anInt7642 = 0;
		if (arg0.anInt7565 == 0) {
			arg0.method6200(8192, false);
		}
		if (arg0.anInt7565 == 1) {
			arg0.method6200(12288, false);
		}
		if (arg0.anInt7565 == 2) {
			arg0.method6200(0, false);
		}
		if (arg0.anInt7565 == 3) {
			arg0.method6200(4096, false);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BC)Z")
	public static boolean method5236(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
