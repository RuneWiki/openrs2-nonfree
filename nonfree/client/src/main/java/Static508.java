import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!rfa", name = "n", descriptor = "I")
	public static int anInt8975;

	@OriginalMember(owner = "client!rfa", name = "o", descriptor = "[I")
	public static int[] anIntArray662;

	@OriginalMember(owner = "client!rfa", name = "p", descriptor = "I")
	public static int anInt8976;

	@OriginalMember(owner = "client!rfa", name = "k", descriptor = "Lclient!ne;")
	public static final Class240 aClass240_6 = new Class240("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!rfa", name = "l", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_107 = new Class100(79, 8);

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method7427(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static120.aBoolean646) {
			try {
				@Pc(18) Class19 local18 = (Class19) Class.forName("Class19_Sub1").getDeclaredConstructor().newInstance();
				local18.method350(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Static120.aBoolean646 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(II)Z")
	public static boolean method7431(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIBIIII)V")
	public static void method7433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(14) Class12_Sub5 local14 = (Class12_Sub5) Static239.aClass376_4.method9008(); local14 != null; local14 = (Class12_Sub5) Static239.aClass376_4.method9014()) {
			if (Static87.anInt1951 >= local14.anInt4130) {
				local14.method9143();
			} else {
				Static11.method438(local14.anInt4124 * 2, local14.anInt4125, (local14.anInt4129 << 9) + 256, arg2 >> 1, (local14.anInt4127 << 9) + 256, arg0 >> 1);
				Static448.aClass38_10.method8989(local14.aString47, local14.anInt4128 | 0xFF000000, arg3 + Static599.anIntArray449[1], 0, Static599.anIntArray449[0] + arg1);
			}
		}
	}
}
