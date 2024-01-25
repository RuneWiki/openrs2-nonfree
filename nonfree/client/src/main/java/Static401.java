import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "Lclient!hh;")
	public static Class109 aClass109_89;

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
	public static int anInt7129;

	@OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
	public static int anInt7130;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_101 = new Class96("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
	public static int anInt7120 = -1;

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "Lclient!sv;")
	public static final Class222 aClass222_20 = new Class222(10, 2, 2, 0);

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "[I")
	public static final int[] anIntArray526 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!uf", name = "x", descriptor = "[I")
	public static final int[] anIntArray527 = new int[32];

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIII)V")
	public static void method5478(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = Static327.aClass230_Sub1_1.anInt7311 * arg0 >> 8;
		if (local10 != 0 && arg1 != -1) {
			Static195.method3033(local10, arg1, Static21.aClass109_8);
			Static292.aBoolean390 = true;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public static void method5479() {
		if (Static178.anInt3353 == 0) {
			return;
		}
		try {
			if (++Static277.anInt4670 > 1500) {
				if (Static169.aClass114_4 != null) {
					Static169.aClass114_4.method2496();
					Static169.aClass114_4 = null;
				}
				if (Static305.anInt5157 >= 1) {
					Static195.anInt3545 = -5;
					Static178.anInt3353 = 0;
					return;
				}
				Static178.anInt3353 = 1;
				if (Static369.anInt6689 == anInt7129) {
					anInt7129 = Static4.anInt147;
				} else {
					anInt7129 = Static369.anInt6689;
				}
				Static305.anInt5157++;
				Static277.anInt4670 = 0;
			}
			if (Static178.anInt3353 == 1) {
				Static439.aClass159_9 = Static403.aClass42_6.method656(Static94.aString34, anInt7129);
				Static178.anInt3353 = 2;
			}
			@Pc(129) int local129;
			if (Static178.anInt3353 == 2) {
				if (Static439.aClass159_9.anInt4271 == 2) {
					throw new IOException();
				}
				if (Static439.aClass159_9.anInt4271 != 1) {
					return;
				}
				Static169.aClass114_4 = new Class114((Socket) Static439.aClass159_9.anObject8, Static403.aClass42_6);
				Static439.aClass159_9 = null;
				Static169.aClass114_4.method2497(Static201.aClass1_Sub14_Sub2_2.anInt5695, Static201.aClass1_Sub14_Sub2_2.aByteArray65);
				Static206.method3160();
				local129 = Static169.aClass114_4.method2499();
				Static206.method3160();
				if (local129 != 101) {
					Static195.anInt3545 = local129;
					Static178.anInt3353 = 0;
					Static169.aClass114_4.method2496();
					Static169.aClass114_4 = null;
					return;
				}
				Static178.anInt3353 = 3;
			}
			if (Static178.anInt3353 == 3 && Static169.aClass114_4.method2495() >= 2) {
				local129 = Static169.aClass114_4.method2499() << 8 | Static169.aClass114_4.method2499();
				Static323.method4477(local129);
				if (Static20.anInt299 == -1) {
					Static178.anInt3353 = 0;
					Static195.anInt3545 = 6;
					Static169.aClass114_4.method2496();
					Static169.aClass114_4 = null;
				} else {
					Static178.anInt3353 = 0;
					Static169.aClass114_4.method2496();
					Static169.aClass114_4 = null;
					Static168.method2629();
				}
			}
		} catch (@Pc(200) IOException local200) {
			if (Static169.aClass114_4 != null) {
				Static169.aClass114_4.method2496();
				Static169.aClass114_4 = null;
			}
			if (Static305.anInt5157 >= 1) {
				Static195.anInt3545 = -4;
				Static178.anInt3353 = 0;
			} else {
				Static178.anInt3353 = 1;
				Static305.anInt5157++;
				Static277.anInt4670 = 0;
				if (anInt7129 == Static369.anInt6689) {
					anInt7129 = Static4.anInt147;
				} else {
					anInt7129 = Static369.anInt6689;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	public static void method5480() {
		Static328.aClass121_9.ua(Static71.aFloat20 * ((float) Static327.aClass230_Sub1_1.anInt7304 * 0.1F + 0.7F));
		Static328.aClass121_9.XA(Static114.anInt2191, Static383.aFloat64, Static138.aFloat122, (float) (Static130.anInt4554 << 0), (float) (Static139.anInt2523 << 0), (float) (Static298.anInt4991 << 0));
		Static328.aClass121_9.method4597(Static402.aClass89_5);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIBIIIII)Z")
	public static boolean method5482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 + arg3 > arg5 && arg5 + arg7 > arg1) {
			return arg2 + arg6 > arg4 && arg2 < arg4 + arg0;
		} else {
			return false;
		}
	}
}
