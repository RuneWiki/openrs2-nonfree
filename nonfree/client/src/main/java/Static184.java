import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Lclient!oe;")
	public static Class72 aClass72_254;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Lclient!oe;")
	public static Class72 aClass72_255;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "Lclient!eg;")
	public static Class33 aClass33_15;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Lclient!jh;")
	public static Class53 aClass53_17;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
	public static int anInt4292 = 10;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
	public static volatile int anInt4293 = 0;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Lclient!qe;")
	public static Class78 aClass78_736 = Static199.method3560("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static89.anIntArrayArrayArray3[arg0][local16][local20] == -Static132.anInt3070) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static144.anIntArrayArrayArray7[arg0][arg1][arg3] + arg5;
			if (!Static201.method3570(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static201.method3570(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static201.method3570(local20, local156, local182)) {
				return false;
			} else if (Static201.method3570(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static209.method3067(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static201.method3570(local16 + 1, Static144.anIntArrayArrayArray7[arg0][arg1][arg3] + arg5, local20 + 1) && Static201.method3570(local16 + 128 - 1, Static144.anIntArrayArrayArray7[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static201.method3570(local16 + 128 - 1, Static144.anIntArrayArrayArray7[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static201.method3570(local16 + 1, Static144.anIntArrayArrayArray7[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLjava/awt/Component;Lclient!gj;II)Lclient!gf;")
	public static Class40 method3395(@OriginalArg(1) Component arg0, @OriginalArg(2) Class41 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static161.anInt3727 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(31) Class40 local31 = (Class40) Class.forName("Class40_Sub2").getDeclaredConstructor().newInstance();
			local31.anIntArray744 = new int[(Static40.aBoolean26 ? 2 : 1) * 256];
			local31.anInt4692 = arg2;
			local31.method3714(arg0);
			local31.anInt4694 = (arg2 & 0xFFFFFC00) + 1024;
			if (local31.anInt4694 > 16384) {
				local31.anInt4694 = 16384;
			}
			local31.method3706(local31.anInt4694);
			if (Static47.anInt858 > 0 && Static13.aClass50_1 == null) {
				Static13.aClass50_1 = new Class50();
				Static13.aClass50_1.aClass41_1 = arg1;
				arg1.method1259(Static47.anInt858, Static13.aClass50_1);
			}
			if (Static13.aClass50_1 != null) {
				if (Static13.aClass50_1.aClass40Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static13.aClass50_1.aClass40Array1[arg3] = local31;
			}
			return local31;
		} catch (@Pc(111) Throwable local111) {
			try {
				@Pc(117) Class40_Sub1 local117 = new Class40_Sub1(arg1, arg3);
				local117.anInt4692 = arg2;
				local117.anIntArray744 = new int[(Static40.aBoolean26 ? 2 : 1) * 256];
				local117.method3714(arg0);
				local117.anInt4694 = 16384;
				local117.method3706(local117.anInt4694);
				if (Static47.anInt858 > 0 && Static13.aClass50_1 == null) {
					Static13.aClass50_1 = new Class50();
					Static13.aClass50_1.aClass41_1 = arg1;
					arg1.method1259(Static47.anInt858, Static13.aClass50_1);
				}
				if (Static13.aClass50_1 != null) {
					if (Static13.aClass50_1.aClass40Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static13.aClass50_1.aClass40Array1[arg3] = local117;
				}
				return local117;
			} catch (@Pc(176) Throwable local176) {
				return new Class40();
			}
		}
	}
}
