import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!aca", name = "y", descriptor = "[I")
	public static final int[] anIntArray14 = new int[32];

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)V")
	public static void method226() {
		Static404.method7823();
		Static397.aClass9_6 = null;
		Static365.aClass25_6 = null;
		Static208.aClass308ArrayArray1 = null;
		Static384.aClass25_4 = null;
		Static160.aClass25_3 = null;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IZ)V")
	public static void method228(@OriginalArg(1) boolean arg0) {
		for (@Pc(4) Class1_Sub9 local4 = (Class1_Sub9) Static497.aClass38_70.method1419(); local4 != null; local4 = (Class1_Sub9) Static497.aClass38_70.method1415()) {
			if (local4.aClass1_Sub12_Sub1_2 != null) {
				Static445.aClass1_Sub12_Sub3_2.method6363(local4.aClass1_Sub12_Sub1_2);
				local4.aClass1_Sub12_Sub1_2 = null;
			}
			if (local4.aClass1_Sub12_Sub1_1 != null) {
				Static445.aClass1_Sub12_Sub3_2.method6363(local4.aClass1_Sub12_Sub1_1);
				local4.aClass1_Sub12_Sub1_1 = null;
			}
			local4.method7983();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class1_Sub9 local54 = (Class1_Sub9) Static94.aClass38_20.method1419(); local54 != null; local54 = (Class1_Sub9) Static94.aClass38_20.method1415()) {
			if (local54.aClass1_Sub12_Sub1_2 != null) {
				Static445.aClass1_Sub12_Sub3_2.method6363(local54.aClass1_Sub12_Sub1_2);
				local54.aClass1_Sub12_Sub1_2 = null;
			}
			local54.method7983();
		}
		for (@Pc(80) Class1_Sub9 local80 = (Class1_Sub9) Static527.aClass174_39.method4421(); local80 != null; local80 = (Class1_Sub9) Static527.aClass174_39.method4429()) {
			if (local80.aClass1_Sub12_Sub1_2 != null) {
				Static445.aClass1_Sub12_Sub3_2.method6363(local80.aClass1_Sub12_Sub1_2);
				local80.aClass1_Sub12_Sub1_2 = null;
			}
			local80.method7983();
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I[B)Lclient!od;")
	public static Class1_Sub1_Sub16 method229(@OriginalArg(1) byte[] arg0) {
		@Pc(7) Class1_Sub1_Sub16 local7 = new Class1_Sub1_Sub16();
		@Pc(12) Class1_Sub13 local12 = new Class1_Sub13(arg0);
		local12.anInt3400 = local12.aByteArray45.length - 2;
		@Pc(23) int local23 = local12.method3056();
		@Pc(34) int local34 = local12.aByteArray45.length - local23 - 12 - 2;
		local12.anInt3400 = local34;
		@Pc(41) int local41 = local12.method3037();
		local7.anInt6355 = local12.method3056();
		local7.anInt6356 = local12.method3056();
		local7.anInt6352 = local12.method3056();
		local7.anInt6359 = local12.method3056();
		@Pc(65) int local65 = local12.method3043();
		@Pc(76) int local76;
		@Pc(81) int local81;
		if (local65 > 0) {
			local7.aClass174Array1 = new Class174[local65];
			for (local76 = 0; local76 < local65; local76++) {
				local81 = local12.method3056();
				@Pc(88) Class174 local88 = new Class174(Static117.method2662(local81));
				local7.aClass174Array1[local76] = local88;
				while (local81-- > 0) {
					@Pc(98) int local98 = local12.method3037();
					@Pc(102) int local102 = local12.method3037();
					local88.method4420(new Class1_Sub33(local102), (long) local98);
				}
			}
		}
		local12.anInt3400 = 0;
		local7.aString59 = local12.method3051();
		local7.anIntArray473 = new int[local41];
		local7.anIntArray474 = new int[local41];
		local7.aStringArray29 = new String[local41];
		local76 = 0;
		while (local12.anInt3400 < local34) {
			local81 = local12.method3056();
			if (local81 == 3) {
				local7.aStringArray29[local76] = local12.method3034().intern();
			} else if (local81 >= 100 || local81 == 21 || local81 == 38 || local81 == 39) {
				local7.anIntArray473[local76] = local12.method3043();
			} else {
				local7.anIntArray473[local76] = local12.method3037();
			}
			local7.anIntArray474[local76++] = local81;
		}
		return local7;
	}
}
