import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!m", name = "R", descriptor = "I")
	public static int anInt4528;

	@OriginalMember(owner = "client!m", name = "S", descriptor = "Lclient!mg;")
	public static Class160 aClass160_47;

	@OriginalMember(owner = "client!m", name = "U", descriptor = "I")
	public static int anInt4530;

	@OriginalMember(owner = "client!m", name = "P", descriptor = "I")
	public static int anInt4526 = -1;

	@OriginalMember(owner = "client!m", name = "V", descriptor = "Z")
	public static boolean aBoolean327 = true;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILjava/awt/Component;IILclient!dr;)Lclient!eb;")
	public static Class18 method3657(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class59 arg3) {
		if (Static410.anInt6842 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(40) Class18 local40 = (Class18) Class.forName("Class18_Sub1").getDeclaredConstructor().newInstance();
			local40.anIntArray601 = new int[(Static314.aBoolean392 ? 2 : 1) * 256];
			local40.anInt7143 = arg2;
			local40.method5632(arg1);
			local40.anInt7145 = (arg2 & 0xFFFFFC00) + 1024;
			if (local40.anInt7145 > 16384) {
				local40.anInt7145 = 16384;
			}
			local40.method5643(local40.anInt7145);
			if (Static41.anInt770 > 0 && Static120.aClass53_1 == null) {
				Static120.aClass53_1 = new Class53();
				Static120.aClass53_1.aClass59_3 = arg3;
				arg3.method1372(Static120.aClass53_1, Static41.anInt770);
			}
			if (Static120.aClass53_1 != null) {
				if (Static120.aClass53_1.aClass18Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static120.aClass53_1.aClass18Array1[arg0] = local40;
			}
			return local40;
		} catch (@Pc(113) Throwable local113) {
			try {
				@Pc(119) Class18_Sub2 local119 = new Class18_Sub2(arg3, arg0);
				local119.anInt7143 = arg2;
				local119.anIntArray601 = new int[(Static314.aBoolean392 ? 2 : 1) * 256];
				local119.method5632(arg1);
				local119.anInt7145 = 16384;
				local119.method5643(local119.anInt7145);
				if (Static41.anInt770 > 0 && Static120.aClass53_1 == null) {
					Static120.aClass53_1 = new Class53();
					Static120.aClass53_1.aClass59_3 = arg3;
					arg3.method1372(Static120.aClass53_1, Static41.anInt770);
				}
				if (Static120.aClass53_1 != null) {
					if (Static120.aClass53_1.aClass18Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static120.aClass53_1.aClass18Array1[arg0] = local119;
				}
				return local119;
			} catch (@Pc(181) Throwable local181) {
				return new Class18();
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II[I[IZ)V")
	public static void method3658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(15) int local15 = (arg1 + arg0) / 2;
		@Pc(17) int local17 = arg1;
		@Pc(21) int local21 = arg3[local15];
		arg3[local15] = arg3[arg0];
		arg3[arg0] = local21;
		@Pc(35) int local35 = arg2[local15];
		arg2[local15] = arg2[arg0];
		arg2[arg0] = local35;
		@Pc(54) int local54 = ~local21 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg1; local56 < arg0; local56++) {
			if (arg3[local56] < (local54 & local56) + local21) {
				@Pc(75) int local75 = arg3[local56];
				arg3[local56] = arg3[local17];
				arg3[local17] = local75;
				@Pc(89) int local89 = arg2[local56];
				arg2[local56] = arg2[local17];
				arg2[local17++] = local89;
			}
		}
		arg3[arg0] = arg3[local17];
		arg3[local17] = local21;
		arg2[arg0] = arg2[local17];
		arg2[local17] = local35;
		method3658(local17 - 1, arg1, arg2, arg3);
		method3658(arg0, local17 + 1, arg2, arg3);
	}
}
