import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!te", name = "m", descriptor = "Lclient!bg;")
	public static Class22 aClass22_294;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "F")
	public static float aFloat195 = 0.0F;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IILclient!et;ILjava/awt/Component;)Lclient!ln;")
	public static Class49 method5016(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		if (Static261.anInt4928 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(49) Class49 local49 = (Class49) Class.forName("Class49_Sub1").getDeclaredConstructor().newInstance();
			local49.anInt2446 = arg2;
			local49.anIntArray162 = new int[(Static422.aBoolean649 ? 2 : 1) * 256];
			local49.method2066(arg3);
			local49.anInt2445 = (arg2 & 0xFFFFFC00) + 1024;
			if (local49.anInt2445 > 16384) {
				local49.anInt2445 = 16384;
			}
			local49.method2065(local49.anInt2445);
			if (Static322.anInt5579 > 0 && Static62.aClass227_1 == null) {
				Static62.aClass227_1 = new Class227();
				Static62.aClass227_1.aClass66_7 = arg1;
				arg1.method1741(Static322.anInt5579, Static62.aClass227_1);
			}
			if (Static62.aClass227_1 != null) {
				if (Static62.aClass227_1.aClass49Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static62.aClass227_1.aClass49Array1[arg0] = local49;
			}
			return local49;
		} catch (@Pc(122) Throwable local122) {
			try {
				@Pc(128) Class49_Sub2 local128 = new Class49_Sub2(arg1, arg0);
				local128.anIntArray162 = new int[(Static422.aBoolean649 ? 2 : 1) * 256];
				local128.anInt2446 = arg2;
				local128.method2066(arg3);
				local128.anInt2445 = 16384;
				local128.method2065(local128.anInt2445);
				if (Static322.anInt5579 > 0 && Static62.aClass227_1 == null) {
					Static62.aClass227_1 = new Class227();
					Static62.aClass227_1.aClass66_7 = arg1;
					arg1.method1741(Static322.anInt5579, Static62.aClass227_1);
				}
				if (Static62.aClass227_1 != null) {
					if (Static62.aClass227_1.aClass49Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static62.aClass227_1.aClass49Array1[arg0] = local128;
				}
				return local128;
			} catch (@Pc(192) Throwable local192) {
				return new Class49();
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IBZJILjava/lang/String;ZLjava/lang/String;III)V")
	public static void method5017(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static234.aBoolean411 && Static407.anInt6710 < 500) {
			@Pc(16) int local16 = arg9 == -1 ? Static157.anInt3147 : arg9;
			@Pc(30) Class4_Sub39 local30 = new Class4_Sub39(arg6, arg4, local16, arg0, arg8, arg2, arg3, arg7, arg5, arg1);
			Static206.aClass183_28.method4137(local30);
			Static407.anInt6710++;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!fs;ILjava/lang/String;Z)Lclient!qk;")
	public static Class195 method5018(@OriginalArg(0) Class76 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) int local18 = arg0.method2099(arg1);
		if (local18 == -1) {
			return new Class195(0);
		}
		@Pc(31) int[] local31 = arg0.method2124(local18);
		@Pc(37) Class195 local37 = new Class195(local31.length);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		while (true) {
			while (local37.anInt5679 > local39) {
				@Pc(55) Class4_Sub12 local55 = new Class4_Sub12(arg0.method2104(local31[local41++], local18));
				@Pc(59) int local59 = local55.method2529();
				@Pc(63) int local63 = local55.method2536();
				@Pc(67) int local67 = local55.method2490();
				if (!arg2 && local67 == 1) {
					local37.anInt5679--;
				} else {
					local37.anIntArray397[local39] = local59;
					local37.anIntArray396[local39] = local63;
					local39++;
				}
			}
			return local37;
		}
	}
}
