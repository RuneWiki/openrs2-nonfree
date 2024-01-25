import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
	public static int anInt5345;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
	public static int anInt5340 = 0;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "[I")
	public static final int[] anIntArray459 = new int[50];

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
	public static int anInt5346 = -1;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLclient!gn;I)V")
	public static void method4758(@OriginalArg(1) Class1_Sub2_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg0.anInt5416 > Static339.anInt6265) {
			Static385.method6039(arg0);
		} else if (arg0.anInt5415 >= Static339.anInt6265) {
			Static9.method98(arg0);
		} else {
			Static328.method5288(arg0, false);
			local7 = Static209.anInt4255;
			local9 = Static263.anInt5015;
		}
		if (arg0.anInt6800 < 128 || arg0.anInt6798 < 128 || arg0.anInt6800 >= (Static89.anInt1891 - 1) * 128 || arg0.anInt6798 >= (Static85.anInt1839 - 1) * 128) {
			arg0.anInt5396 = -1;
			arg0.anInt5415 = 0;
			local9 = 0;
			local7 = -1;
			arg0.anInt5416 = 0;
			arg0.anInt5366 = -1;
			arg0.anInt6800 = arg0.anIntArray466[0] * 128 + arg0.method4792() * 64;
			arg0.anInt6798 = arg0.anIntArray465[0] * 128 + arg0.method4792() * 64;
			arg0.method4794();
		}
		if (Static182.aClass1_Sub2_Sub1_Sub1_1 == arg0 && (arg0.anInt6800 < 1536 || arg0.anInt6798 < 1536 || arg0.anInt6800 >= (Static89.anInt1891 - 12) * 128 || (Static85.anInt1839 - 12) * 128 <= arg0.anInt6798)) {
			local9 = 0;
			local7 = -1;
			arg0.anInt5415 = 0;
			arg0.anInt5396 = -1;
			arg0.anInt5416 = 0;
			arg0.anInt5366 = -1;
			arg0.anInt6800 = arg0.anIntArray466[0] * 128 + arg0.method4792() * 64;
			arg0.anInt6798 = arg0.anIntArray465[0] * 128 + arg0.method4792() * 64;
			arg0.method4794();
		}
		@Pc(207) int local207 = Static69.method1259(arg0);
		Static381.method5694(arg0, local9, local207, local7);
		Static288.method4745(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public static void method4759() {
		Static55.anInt1202 = 0;
		Static391.anInt7123 = -1;
		Static280.anInt5248 = -1;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(JB)V")
	public static void method4760(@OriginalArg(0) long arg0) {
		Static76.aClass2_Sub24_Sub2_7.anInt6669 = 0;
		Static76.aClass2_Sub24_Sub2_7.method5746(Static290.aClass15_7.anInt268);
		Static76.aClass2_Sub24_Sub2_7.method5766(arg0);
		Static178.anInt3760 = 0;
		Static35.anInt619 = 1;
		Static70.anInt1555 = -3;
		Static179.anInt3762 = 0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
	public static void method4761(@OriginalArg(0) int arg0) {
		if (!Static224.aBoolean324) {
			arg0 = -1;
		}
		if (Static196.anInt2472 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(24) Class74 local24 = Static253.aClass67_2.method1494(arg0);
			@Pc(28) Class128 local28 = local24.method1643();
			if (local28 == null) {
				arg0 = -1;
			} else {
				Static154.aClass123_2.method3244(local28.method3376(), local28.method3366(), local28.method3371(), Static343.aCanvas5, new Point(local24.anInt2057, local24.anInt2061));
				Static196.anInt2472 = arg0;
			}
		}
		if (arg0 == -1 && Static196.anInt2472 != -1) {
			Static154.aClass123_2.method3244(null, -1, -1, Static343.aCanvas5, new Point());
			Static196.anInt2472 = -1;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ab;B)V")
	public static void method4762(@OriginalArg(0) Class3 arg0) {
		@Pc(12) Class3 local12 = Static280.method4693(arg0);
		@Pc(18) int local18;
		@Pc(16) int local16;
		if (local12 == null) {
			local16 = Static336.anInt6217;
			local18 = Static7.anInt157;
		} else {
			local16 = local12.anInt116;
			local18 = local12.anInt64;
		}
		Static260.method4469(false, arg0, local18, local16);
		Static361.method3589(arg0, local18, local16);
	}
}
