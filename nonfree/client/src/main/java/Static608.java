import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static608 {

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "Z")
	public static boolean aBoolean712;

	@OriginalMember(owner = "client!ud", name = "E", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_181 = new Class322(41, 0);

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "[I")
	public static final int[] anIntArray624 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "Lclient!gia;")
	public static final Class136 aClass136_4 = new Class136("LIVE", 0);

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
	public static void method8373(@OriginalArg(0) int arg0) {
		if (Static687.aClass6_Sub44_33.aClass7_Sub30_1.method8787() == 0) {
			arg0 = -1;
		}
		if (arg0 == Static527.anInt8630) {
			return;
		}
		if (arg0 != -1) {
			@Pc(29) Class151 local29 = Static319.aClass337_2.method8065(arg0);
			@Pc(33) Class64 local33 = local29.method4012();
			if (local33 == null) {
				arg0 = -1;
			} else {
				Static651.aClass122_38.method3348(local33.method1248(), local33.method1244(), local33.method1238(), Static4.aCanvas1, new Point(local29.anInt4354, local29.anInt4350));
				Static527.anInt8630 = arg0;
			}
		}
		if (arg0 == -1 && Static527.anInt8630 != -1) {
			Static651.aClass122_38.method3348((int[]) null, -1, -1, Static4.aCanvas1, new Point());
			Static527.anInt8630 = -1;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[S[Ljava/lang/String;)V")
	public static void method8374(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static571.method7992(arg1.length - 1, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "(I)V")
	public static void method8380() {
		for (@Pc(15) Class6_Sub2_Sub6 local15 = (Class6_Sub2_Sub6) Static437.aClass340_58.method8124(); local15 != null; local15 = (Class6_Sub2_Sub6) Static437.aClass340_58.method8134()) {
			@Pc(20) Class60_Sub1_Sub1_Sub5 local20 = local15.aClass60_Sub1_Sub1_Sub5_1;
			if (Static141.anInt8737 > local20.anInt8314) {
				local15.method9051();
				local20.method7290();
			} else if (Static141.anInt8737 >= local20.anInt8329) {
				local20.method7283();
				if (local20.anInt8322 > 0) {
					@Pc(66) Class6_Sub11 local66 = (Class6_Sub11) Static419.aClass74_45.method1401((long) (local20.anInt8322 - 1));
					if (local66 != null) {
						@Pc(71) Class60_Sub1_Sub1_Sub3_Sub2 local71 = local66.aClass60_Sub1_Sub1_Sub3_Sub2_1;
						if (local71.anInt9048 >= 0 && local71.anInt9048 < Static29.anInt380 * 512 && local71.anInt9057 >= 0 && Static327.anInt5650 * 512 > local71.anInt9057) {
							local20.method7282(Static248.method4318(local71.anInt9057, local20.aByte135, local71.anInt9048) - local20.anInt8316, local71.anInt9057, Static141.anInt8737, local71.anInt9048);
						}
					}
				}
				if (local20.anInt8322 < 0) {
					@Pc(128) int local128 = -local20.anInt8322 - 1;
					@Pc(137) Class60_Sub1_Sub1_Sub3_Sub1 local137;
					if (local128 == Static503.anInt8407) {
						local137 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1;
					} else {
						local137 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local128];
					}
					if (local137 != null && local137.anInt9048 >= 0 && Static29.anInt380 * 512 > local137.anInt9048 && local137.anInt9057 >= 0 && Static327.anInt5650 * 512 > local137.anInt9057) {
						local20.method7282(Static248.method4318(local137.anInt9057, local20.aByte135, local137.anInt9048) - local20.anInt8316, local137.anInt9057, Static141.anInt8737, local137.anInt9048);
					}
				}
				local20.method7291(Static2.anInt3);
				Static610.method8414(local20, true);
			}
		}
	}
}
