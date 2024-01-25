import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "[I")
	public static int[] anIntArray362;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
	public static int anInt6172 = -1;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "Z")
	public static boolean aBoolean462 = true;

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
	public static final int anInt6175 = 52;

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_61 = new Class94(65, 3);

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "[F")
	public static final float[] aFloatArray54 = new float[4];

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "Z")
	public static boolean aBoolean463 = false;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[I[IILclient!qo;I)Lclient!ag;")
	public static Class1_Sub1 method5253(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class20_Sub3 arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg0 * arg4];
		for (@Pc(12) int local12 = 0; local12 < arg4; local12++) {
			@Pc(23) int local23 = arg0 * local12 + arg1[local12];
			for (@Pc(25) int local25 = 0; local25 < arg2[local12]; local25++) {
				local10[local23++] = -1;
			}
		}
		return new Class1_Sub1(arg3, arg0, arg4, local10);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!in;)V")
	public static void method5255(@OriginalArg(1) Class157 arg0) {
		Static76.anInt2398 = 0;
		Static40.anInt1337 = 0;
		Static403.aClass325_5 = new Class325();
		Static120.aClass3_Sub2_Sub2_Sub1Array1 = new Class3_Sub2_Sub2_Sub1[1024];
		Static99.aClass3_Sub9Array1 = new Class3_Sub9[Static480.anIntArray442[Static173.anInt4169] + 1];
		Static551.anInt3120 = 0;
		Static184.anInt4423 = 0;
		Static365.method6197(arg0);
		Static16.method336(arg0);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([BB)V")
	public static void method5256(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub11 local10 = new Class2_Sub11(arg0);
		@Pc(20) boolean local20 = false;
		while (true) {
			while (true) {
				@Pc(24) int local24 = local10.method8383();
				if (local24 == 0) {
					if (local20) {
						return;
					}
					if (Static367.anIntArray463 == null) {
						Static367.anIntArray463 = new int[4];
						Static349.anIntArray437 = new int[4];
						Static380.anInt7418 = 4;
					}
					for (local24 = 0; local24 < Static367.anIntArray463.length; local24++) {
						Static367.anIntArray463[local24] = 0;
						Static349.anIntArray437[local24] = local24 * 20;
					}
					return;
				}
				if (local24 == 1) {
					if (Static367.anIntArray463 == null) {
						Static367.anIntArray463 = new int[4];
						Static380.anInt7418 = 4;
						Static349.anIntArray437 = new int[4];
					}
					for (@Pc(44) int local44 = 0; local44 < Static367.anIntArray463.length; local44++) {
						Static367.anIntArray463[local44] = local10.method8368();
						Static349.anIntArray437[local44] = local10.method8368();
					}
					local20 = true;
				} else if (local24 == 2) {
					Static428.anInt5961 = local10.method8326();
				} else if (local24 == 3) {
					Static380.anInt7418 = local10.method8383();
					Static367.anIntArray463 = new int[Static380.anInt7418];
					Static349.anIntArray437 = new int[Static380.anInt7418];
				}
			}
		}
	}
}
