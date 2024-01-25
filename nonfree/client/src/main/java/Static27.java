import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!av", name = "r", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!av", name = "v", descriptor = "I")
	public static int anInt475 = -1;

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(Ljava/lang/String;B)V")
	public static void method485(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			@Pc(23) Class3_Sub26 local23 = Static640.method8636(Static287.aClass344_72, Static403.aClass294_3);
			local23.aClass3_Sub15_Sub1_3.method8448(Static139.method3132(arg0));
			local23.aClass3_Sub15_Sub1_3.method8417(arg0);
			Static472.method5189(local23);
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(BIIIIII)Lclient!tj;")
	public static Class4 method486(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(38) long local38 = (long) arg2 * 76724863L ^ (long) arg4 * 67481L ^ (long) arg5 * 97549L ^ (long) arg0 * 475427L ^ (long) arg1 * 986053L ^ (long) arg3 * 32147369L;
		@Pc(44) Class4 local44 = (Class4) Static261.aClass112_32.method3640(local38);
		if (local44 == null) {
			local44 = Static174.aClass33_7.method6183(arg4, arg5, arg0, arg1, arg3, arg2);
			Static261.aClass112_32.method3636(local38, local44);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!kha;Z)V")
	public static void method487(@OriginalArg(0) Class181 arg0) {
		Static330.anInt6599 = 0;
		Static483.anInt8591 = 0;
		Static477.aClass375_7 = new Class375();
		Static267.aClass2_Sub4_Sub1_Sub1Array2 = new Class2_Sub4_Sub1_Sub1[1024];
		Static425.aClass2_Sub2Array3 = new Class2_Sub2[Static394.anIntArray467[Static251.anInt5581] + 1];
		Static224.anInt5126 = 0;
		Static206.anInt6643 = 0;
		Static139.method3136(arg0);
		Static586.method8065(arg0);
	}
}
