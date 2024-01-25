import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!qw", name = "I", descriptor = "Lclient!au;")
	public static final Class22 aClass22_56 = new Class22();

	@OriginalMember(owner = "client!qw", name = "M", descriptor = "[I")
	public static final int[] anIntArray494 = new int[2];

	@OriginalMember(owner = "client!qw", name = "N", descriptor = "I")
	public static int anInt8493 = -1;

	@OriginalMember(owner = "client!qw", name = "O", descriptor = "[I")
	public static final int[] anIntArray495 = new int[5];

	@OriginalMember(owner = "client!qw", name = "S", descriptor = "I")
	public static int anInt8497 = 0;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6579(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static517.method8197(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(II)V")
	public static void method6580(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static204.anInt8817 = arg0;
		Static110.aClass21_Sub5Array1 = new Class21_Sub5[Static414.anIntArray447[Static204.anInt8817] + 1];
		Static179.anInt3755 = 0;
		Static517.anInt10516 = 0;
	}

	@OriginalMember(owner = "client!qw", name = "d", descriptor = "(I)V")
	public static void method6581() throws IOException {
		if (Static528.aClass36_2 == null || Static328.anInt6426 <= 0) {
			return;
		}
		@Pc(16) int local16 = 0;
		while (true) {
			@Pc(21) Class4_Sub39 local21 = (Class4_Sub39) Static10.aClass22_10.method895();
			if (local21 == null) {
				Static94.anInt2372 += local16;
				Static494.anInt9313 = 0;
				break;
			}
			Static528.aClass36_2.method1991(local21.aClass4_Sub13_Sub2_1.aByteArray88, local21.anInt7832);
			local16 += local21.anInt7832;
			Static328.anInt6426 -= local21.anInt7832;
			local21.method8193();
			local21.aClass4_Sub13_Sub2_1.method7037();
			local21.method6126();
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!ek;II)V")
	public static void method6582(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (Static357.aClass283_2 == null) {
			return;
		}
		try {
			Static357.aClass283_2.method6489(0L);
			Static357.aClass283_2.method6486(24, arg0.aByteArray88, arg1);
		} catch (@Pc(23) Exception local23) {
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(ZLclient!vo;)V")
	public static void method6583(@OriginalArg(1) Class348 arg0) {
		Static37.anInt1238 = 0;
		Static284.anInt5830 = 0;
		Static109.aClass158_8 = new Class158();
		Static248.aClass21_Sub3_Sub1_Sub1Array2 = new Class21_Sub3_Sub1_Sub1[1024];
		Static110.aClass21_Sub5Array1 = new Class21_Sub5[Static414.anIntArray447[Static204.anInt8817] + 1];
		Static517.anInt10516 = 0;
		Static179.anInt3755 = 0;
		Static250.method3978(arg0);
		Static112.method2049(arg0);
	}
}
