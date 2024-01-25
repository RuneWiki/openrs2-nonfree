import java.awt.Rectangle;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!om", name = "F", descriptor = "[I")
	public static int[] anIntArray412;

	@OriginalMember(owner = "client!om", name = "q", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!om", name = "M", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_108 = new Class349(13, -1);

	@OriginalMember(owner = "client!om", name = "S", descriptor = "I")
	public static int anInt6454 = 1;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method5386(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)V")
	public static void method5389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static292.anInt4935; local7++) {
			@Pc(13) Rectangle local13 = Class198.aRectangleArray2[local7];
			if (local13.x + local13.width > arg3 && arg2 + arg3 > local13.x && arg0 < local13.height + local13.y && local13.y < arg0 + arg1) {
				Static217.aBooleanArray11[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!caa;[Lclient!tg;)V")
	public static void method5390(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) Class2_Sub11[] arg1) {
		@Pc(6) int local6;
		if (Static107.aBoolean120) {
			local6 = arg0.method7505(arg1);
			Static337.aClass162_13.method6874(local6, arg1);
		}
		if (Static320.aClass151Array3 == Static114.aClass151Array1) {
			@Pc(28) int local28;
			if (arg0 instanceof Class12_Sub2_Sub1) {
				local6 = ((Class12_Sub2_Sub1) arg0).aShort120;
				local28 = ((Class12_Sub2_Sub1) arg0).aShort121;
			} else {
				local6 = arg0.anInt9374 >> Static562.anInt9207;
				local28 = arg0.anInt9375 >> Static562.anInt9207;
			}
			Static337.aClass162_13.YA(Static261.aClass151Array2[0].method7680(arg0.anInt9374, arg0.anInt9375), Static376.method5249(local6, local28), Static64.method1092(local6, local28), Static543.method7103(local6, local28));
		}
		@Pc(64) Class12_Sub3 local64 = arg0.method7496(Static337.aClass162_13);
		if (local64 == null) {
			return;
		}
		local64.aClass12_Sub2_2 = arg0;
		if (Static492.aBoolean660) {
			@Pc(73) Class220 local73 = Static224.aClass220_4;
			synchronized (Static224.aClass220_4) {
				@Pc(77) boolean local77 = false;
				for (@Pc(82) Class12_Sub3 local82 = (Class12_Sub3) Static224.aClass220_4.method4661(); local82 != null; local82 = (Class12_Sub3) Static224.aClass220_4.method4660()) {
					if (arg0.anInt9377 >= local82.aClass12_Sub2_2.anInt9377) {
						Static559.method7309(local82, local64);
						local77 = true;
						break;
					}
				}
				if (!local77) {
					Static224.aClass220_4.method4659(local64);
				}
				return;
			}
		}
		@Pc(117) boolean local117 = false;
		for (@Pc(122) Class12_Sub3 local122 = (Class12_Sub3) Static224.aClass220_4.method4661(); local122 != null; local122 = (Class12_Sub3) Static224.aClass220_4.method4660()) {
			if (arg0.anInt9377 >= local122.aClass12_Sub2_2.anInt9377) {
				Static559.method7309(local122, local64);
				local117 = true;
				break;
			}
		}
		if (!local117) {
			Static224.aClass220_4.method4659(local64);
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
	public static void method5391() {
		if (Static526.method7746(Static540.anInt8912) || Static397.method5446(Static540.anInt8912)) {
			Static168.method2199(Static285.anInt2206 >> 12, Static469.anInt7519 >> 12, 5000);
		} else {
			@Pc(37) int local37 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray566[0] >> 3;
			@Pc(44) int local44 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray565[0] >> 3;
			if (local37 >= 0 && local37 < Static281.anInt4822 >> 3 && local44 >= 0 && Static29.anInt491 >> 3 > local44) {
				Static168.method2199(local37, local44, 5000);
			} else {
				Static168.method2199(Static281.anInt4822 >> 4, Static29.anInt491 >> 4, 0);
			}
		}
		Static89.method1345();
		Static220.method2686();
		Static240.method7693();
		Static344.method5011();
	}
}
