import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!kba", name = "f", descriptor = "Lclient!oea;")
	public static final Class252 aClass252_9 = new Class252();

	@OriginalMember(owner = "client!kba", name = "v", descriptor = "I")
	public static int anInt5179 = -1;

	@OriginalMember(owner = "client!kba", name = "G", descriptor = "[I")
	public static final int[] anIntArray329 = new int[1];

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIIIZ)V")
	public static void method4530(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687() == 0) {
			Static212.method3537(false);
		} else {
			Static508.anInt8218 = Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687();
			Static99.method1936(true, 0);
		}
		Static386.aBoolean469 = arg3;
		Static573.anInt9359 = arg2;
		Static614.anInt10090 = arg1;
		Static371.method7976(arg0);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IZIII)V")
	public static void method4534(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		if (arg3 > arg2) {
			for (local14 = arg2; local14 < arg3; local14++) {
				Static349.anIntArrayArray71[local14][arg0] = arg1;
			}
		} else {
			for (local14 = arg3; local14 < arg2; local14++) {
				Static349.anIntArrayArray71[local14][arg0] = arg1;
			}
		}
	}
}
