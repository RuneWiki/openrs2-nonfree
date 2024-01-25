import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "[I")
	public static final int[] anIntArray560 = new int[4096];

	@OriginalMember(owner = "client!qda", name = "i", descriptor = "[I")
	public static final int[] anIntArray561 = new int[] { 25000, 2000 };

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZLclient!ro;)I")
	public static int method6052(@OriginalArg(1) Class292 arg0) {
		if (arg0 == Static461.aClass292_11) {
			return 5120;
		} else if (Static461.aClass292_12 == arg0) {
			return 5122;
		} else if (Static461.aClass292_13 == arg0) {
			return 5124;
		} else if (arg0 == Static461.aClass292_14) {
			return 5121;
		} else if (Static461.aClass292_15 == arg0) {
			return 5123;
		} else if (arg0 == Static461.aClass292_16) {
			return 5125;
		} else if (arg0 == Static461.aClass292_17) {
			return 5131;
		} else if (arg0 == Static461.aClass292_18) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)Z")
	public static boolean method6053(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && Static154.aByteArrayArrayArray15[1].length > arg0 && arg1 < Static154.aByteArrayArrayArray15[1][arg0].length) {
			return (Static154.aByteArrayArrayArray15[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(BLclient!saa;)V")
	public static void method6057(@OriginalArg(1) Class3_Sub44 arg0) {
		if (!Static255.aBoolean352) {
			arg0.method7812();
			Static151.anInt3123--;
		}
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)V")
	public static void method6058() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static400.anInt6818; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static271.anInt5050; local13++) {
				if (Static384.method5671(local9, true, Static554.aClass63ArrayArrayArray4, local13, local7)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)V")
	public static void method6060() {
		@Pc(9) int local9 = (int) ((double) Static400.anInt6818 * 34.46D);
		local9 <<= 0x2;
		if (Static4.aClass43_1.method7192()) {
			local9 += 512;
		}
		Static4.aClass43_1.GA(200, local9);
	}
}
