import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
	public static int anInt5165;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
	public static int anInt5171;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
	public static int anInt5167 = -1;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_178 = new Class106("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Z")
	public static boolean aBoolean383 = false;

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
	public static int anInt5172 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	public static void method4766() {
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("availableProcessors");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Integer local31 = (Integer) local21.invoke(local25, (Object[]) null);
					Static196.anInt3975 = local31;
				} catch (@Pc(36) Throwable local36) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)I")
	public static int method4767() {
		return 2;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIILclient!kg;IILclient!tm;)V")
	public static void method4768(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class112 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class92 arg7) {
		@Pc(20) int local20 = arg2 * arg2 + arg1 * arg1;
		if (arg3 < local20) {
			return;
		}
		@Pc(34) int local34 = Math.min(arg4.anInt3381 / 2, arg4.anInt3444 / 2);
		if (local34 * local34 >= local20) {
			Static83.method1772(arg2, arg4, Static72.aClass4Array3[arg6], arg1, arg7, arg0, arg5);
			return;
		}
		local34 -= 10;
		@Pc(64) int local64;
		if (Static50.anInt1273 == 4) {
			local64 = (int) Static357.aFloat76 & 0x3FFF;
		} else {
			local64 = Static163.anInt3359 + (int) Static357.aFloat76 & 0x3FFF;
		}
		@Pc(77) int local77 = Class208.anIntArray479[local64];
		@Pc(81) int local81 = Class208.anIntArray478[local64];
		if (Static50.anInt1273 != 4) {
			local77 = local77 * 256 / (Static293.anInt4951 + 256);
			local81 = local81 * 256 / (Static293.anInt4951 + 256);
		}
		@Pc(110) int local110 = arg1 * local77 + arg2 * local81 >> 15;
		@Pc(120) int local120 = arg1 * local81 - local77 * arg2 >> 15;
		@Pc(126) double local126 = Math.atan2((double) local110, (double) local120);
		@Pc(133) int local133 = (int) (Math.sin(local126) * (double) local34);
		@Pc(140) int local140 = (int) (Math.cos(local126) * (double) local34);
		Static107.aClass4Array4[arg6].method5967((float) arg4.anInt3381 / 2.0F + (float) arg0 + (float) local133, (float) arg5 + (float) arg4.anInt3444 / 2.0F - (float) local140, 4096, (int) (-local126 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!at;I)Lclient!bb;")
	public static Class14 method4769(@OriginalArg(0) Class1_Sub7 arg0) {
		@Pc(13) Class14 local13 = new Class14();
		local13.anInt489 = arg0.method2161();
		local13.aClass1_Sub4_Sub16_1 = Static113.method2414(local13.anInt489);
		return local13;
	}
}
