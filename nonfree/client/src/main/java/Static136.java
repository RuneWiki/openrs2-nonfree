import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!im", name = "e", descriptor = "J")
	public static long aLong86 = 0L;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BLclient!tm;)V")
	public static void method2750(@OriginalArg(1) Class10_Sub3_Sub3_Sub2 arg0) {
		@Pc(19) Class14_Sub28 local19 = (Class14_Sub28) Static316.aClass25_16.method691((long) arg0.anInt5954);
		if (local19 == null) {
			return;
		}
		if (local19.aClass14_Sub19_Sub3_2 != null) {
			Static49.aClass14_Sub19_Sub2_1.method4245(local19.aClass14_Sub19_Sub3_2);
			local19.aClass14_Sub19_Sub3_2 = null;
		}
		local19.method5986();
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;IILclient!ap;)Lclient!vd;")
	public static Class205 method2751(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class15 arg2) {
		if (arg1 == 0) {
			return arg2.method282(arg0);
		}
		@Pc(36) Class205 local36;
		if (arg1 == 1) {
			try {
				Static356.method170(arg2.anApplet1, "openjs", new Object[] { (new URL(arg2.anApplet1.getCodeBase(), arg0)).toString() });
				local36 = new Class205();
				local36.anInt6370 = 1;
				return local36;
			} catch (@Pc(42) Throwable local42) {
				local36 = new Class205();
				local36.anInt6370 = 2;
				return local36;
			}
		} else if (arg1 == 2) {
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg0), "_blank");
				local36 = new Class205();
				local36.anInt6370 = 1;
				return local36;
			} catch (@Pc(78) Exception local78) {
				local36 = new Class205();
				local36.anInt6370 = 2;
				return local36;
			}
		} else if (arg1 == 3) {
			try {
				Static356.method171(arg2.anApplet1, "loggedout");
			} catch (@Pc(105) Throwable local105) {
			}
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg0), "_top");
				local36 = new Class205();
				local36.anInt6370 = 1;
				return local36;
			} catch (@Pc(127) Exception local127) {
				local36 = new Class205();
				local36.anInt6370 = 2;
				return local36;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method2752(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
	public static void method2753() {
		Static256.aClass11_110.method214();
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ID)V")
	public static void method2754(@OriginalArg(1) double arg0) {
		if (Static124.aDouble1 == arg0) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(31) int local31 = (int) (Math.pow((double) local19 / 255.0D, arg0) * 255.0D);
			Static198.anIntArray339[local19] = local31 <= 255 ? local31 : 255;
		}
		Static124.aDouble1 = arg0;
	}
}
