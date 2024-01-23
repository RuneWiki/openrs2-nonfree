import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "F")
	public static float aFloat43;

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
	public static int anInt4365;

	@OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
	public static int anInt4374;

	@OriginalMember(owner = "client!qn", name = "M", descriptor = "I")
	public static int anInt4376;

	@OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
	public static int anInt4370 = 0;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZZ)V")
	public static void method3469(@OriginalArg(1) boolean arg0) {
		Static105.method1947();
		if (Static194.anInt4017 != 30 && Static194.anInt4017 != 25) {
			return;
		}
		Static241.anInt4779++;
		if (Static241.anInt4779 < 50 && !arg0) {
			return;
		}
		Static241.anInt4779 = 0;
		if (!Static23.aBoolean38 && Static87.aClass113_1 != null) {
			Static283.aClass1_Sub11_Sub1_3.method2697(242);
			try {
				Static87.aClass113_1.method3017(Static283.aClass1_Sub11_Sub1_3.anInt3264, Static283.aClass1_Sub11_Sub1_3.aByteArray47);
				Static283.aClass1_Sub11_Sub1_3.anInt3264 = 0;
			} catch (@Pc(56) IOException local56) {
				Static23.aBoolean38 = true;
			}
		}
		Static105.method1947();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V")
	public static void method3470() {
		if (Static203.aBoolean318) {
			return;
		}
		Static203.aBoolean318 = true;
		Static192.aBoolean301 = true;
		if (Static19.aBoolean30) {
			Static298.aFloat58 = (int) Static298.aFloat58 + 191 & 0xFFFFFF80;
		} else {
			Static88.aFloat10 += (24.0F - Static88.aFloat10) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)Z")
	public static boolean method3471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static214.anIntArrayArrayArray9[arg0][arg1][arg2];
		if (local7 == -Static107.anInt2499) {
			return false;
		} else if (local7 == Static107.anInt2499) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static255.method3903(local22 + 1, Static55.anIntArrayArrayArray3[arg0][arg1][arg2], local26 + 1) && Static255.method3903(local22 + 128 - 1, Static55.anIntArrayArrayArray3[arg0][arg1 + 1][arg2], local26 + 1) && Static255.method3903(local22 + 128 - 1, Static55.anIntArrayArrayArray3[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static255.method3903(local22 + 1, Static55.anIntArrayArrayArray3[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static214.anIntArrayArrayArray9[arg0][arg1][arg2] = Static107.anInt2499;
				return true;
			} else {
				Static214.anIntArrayArrayArray9[arg0][arg1][arg2] = -Static107.anInt2499;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)Z")
	public static boolean method3472(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}
}
