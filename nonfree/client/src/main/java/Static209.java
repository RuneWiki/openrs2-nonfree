import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "Lclient!dk;")
	public static Class54 aClass54_61;

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
	public static int anInt3497;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "Z")
	public static boolean aBoolean214 = false;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Lclient!ka;")
	public static final Class132 aClass132_27 = new Class132(8);

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
	public static int anInt3493 = 0;

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
	public static int anInt3494 = 0;

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
	public static int anInt3498 = 0;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/awt/Component;ILclient!or;II)Lclient!eq;")
	public static Class38 method2803(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class183 arg2, @OriginalArg(3) int arg3) {
		if (Static333.anInt5628 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class38 local36 = (Class38) Class.forName("Class38_Sub2").getDeclaredConstructor().newInstance();
			local36.anInt1841 = arg1;
			local36.anIntArray141 = new int[(Static257.aBoolean291 ? 2 : 1) * 256];
			local36.method1483(arg0);
			local36.anInt1836 = (arg1 & 0xFFFFFC00) + 1024;
			if (local36.anInt1836 > 16384) {
				local36.anInt1836 = 16384;
			}
			local36.method1488(local36.anInt1836);
			if (Static441.anInt7097 > 0 && Static292.aClass5_1 == null) {
				Static292.aClass5_1 = new Class5();
				Static292.aClass5_1.aClass183_1 = arg2;
				arg2.method3904(Static292.aClass5_1, Static441.anInt7097);
			}
			if (Static292.aClass5_1 != null) {
				if (Static292.aClass5_1.aClass38Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static292.aClass5_1.aClass38Array1[arg3] = local36;
			}
			return local36;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class38_Sub1 local114 = new Class38_Sub1(arg2, arg3);
				local114.anIntArray141 = new int[(Static257.aBoolean291 ? 2 : 1) * 256];
				local114.anInt1841 = arg1;
				local114.method1483(arg0);
				local114.anInt1836 = 16384;
				local114.method1488(local114.anInt1836);
				if (Static441.anInt7097 > 0 && Static292.aClass5_1 == null) {
					Static292.aClass5_1 = new Class5();
					Static292.aClass5_1.aClass183_1 = arg2;
					arg2.method3904(Static292.aClass5_1, Static441.anInt7097);
				}
				if (Static292.aClass5_1 != null) {
					if (Static292.aClass5_1.aClass38Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static292.aClass5_1.aClass38Array1[arg3] = local114;
				}
				return local114;
			} catch (@Pc(176) Throwable local176) {
				return new Class38();
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Lclient!ql;")
	public static Class21_Sub6 method2805(@OriginalArg(0) int arg0) {
		@Pc(12) Class93[] local12 = Class7_Sub1.aClass93Array1;
		synchronized (Class7_Sub1.aClass93Array1) {
			@Pc(31) Class21_Sub6 local31;
			if (arg0 >= Class7_Sub1.aClass93Array1.length || Class7_Sub1.aClass93Array1[arg0].method2078()) {
				local31 = new Class21_Sub6();
				local31.aClass21_Sub7Array1 = new Class21_Sub7[arg0];
				for (@Pc(53) int local53 = 0; local53 < arg0; local53++) {
					local31.aClass21_Sub7Array1[local53] = new Class21_Sub7();
				}
			} else {
				local31 = (Class21_Sub6) Class7_Sub1.aClass93Array1[arg0].method2075();
				local31.method5593();
				@Pc(38) int local38 = Static309.anIntArray435[arg0]--;
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;II)I")
	public static int method2806(@OriginalArg(0) String arg0) {
		return Static276.method3716(16, arg0);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)I")
	public static int method2807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (local7 + arg1) / arg0 - local7;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBI)V")
	public static void method2808(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class159 local13 = Static411.aClass159ArrayArray1[arg1][arg0];
		if (local13 != null) {
			Static272.anInt4442 = local13.anInt4050;
			Static308.anInt5306 = local13.anInt4052;
			Static244.anInt3907 = local13.anInt4053;
		}
		Static62.method924();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIFIIIIBFFII[F)V")
	public static void method2809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float[] arg11) {
		@Pc(9) int local9 = arg9 - arg1;
		@Pc(18) int local18 = arg10 - arg4;
		@Pc(22) int local22 = arg0 - arg6;
		@Pc(43) float local43 = (float) local9 * arg11[2] + arg11[0] * (float) local18 + arg11[1] * (float) local22;
		@Pc(64) float local64 = arg11[4] * (float) local22 + (float) local18 * arg11[3] + (float) local9 * arg11[5];
		@Pc(85) float local85 = (float) local22 * arg11[7] + arg11[6] * (float) local18 + arg11[8] * (float) local9;
		@Pc(96) float local96;
		@Pc(102) float local102;
		if (arg5 == 0) {
			local96 = local43 + arg2 + 0.5F;
			local102 = arg7 + 0.5F - local85;
		} else if (arg5 == 1) {
			local96 = arg2 + local43 + 0.5F;
			local102 = local85 + arg7 + 0.5F;
		} else if (arg5 == 2) {
			local96 = arg2 + 0.5F - local43;
			local102 = arg8 + 0.5F - local64;
		} else if (arg5 == 3) {
			local96 = arg2 + local43 + 0.5F;
			local102 = arg8 + 0.5F - local64;
		} else if (arg5 == 4) {
			local96 = arg7 + local85 + 0.5F;
			local102 = arg8 + 0.5F - local64;
		} else {
			local96 = arg7 + 0.5F - local85;
			local102 = arg8 + 0.5F - local64;
		}
		@Pc(205) float local205;
		if (arg3 == 1) {
			local205 = local96;
			local96 = -local102;
			local102 = local205;
		} else if (arg3 == 2) {
			local102 = -local102;
			local96 = -local96;
		} else if (arg3 == 3) {
			local205 = local96;
			local96 = local102;
			local102 = -local205;
		}
		Static62.aFloat15 = local96;
		Static250.aFloat44 = local102;
	}
}
