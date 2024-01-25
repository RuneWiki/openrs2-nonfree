import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "F")
	public static float aFloat99;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)Z")
	public static boolean method5679(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIII)Z")
	public static boolean method5680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static456.method6229(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static437.anInt7308;
			@Pc(14) int local14 = arg2 << Static437.anInt7308;
			return Static303.method4310(local10 + 1, Static178.aClass55Array1[arg0].oa(arg1, arg2) + arg3, local14 + 1) && Static303.method4310(local10 + Static99.anInt1803 - 1, Static178.aClass55Array1[arg0].oa(arg1 + 1, arg2) + arg3, local14 + 1) && Static303.method4310(local10 + Static99.anInt1803 - 1, Static178.aClass55Array1[arg0].oa(arg1 + 1, arg2 + 1) + arg3, local14 + Static99.anInt1803 - 1) && Static303.method4310(local10 + 1, Static178.aClass55Array1[arg0].oa(arg1, arg2 + 1) + arg3, local14 + Static99.anInt1803 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZIIIZ)Lclient!uu;")
	public static Class250 method5681(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(5) Class253 local5 = null;
		if (Static272.aClass176_3 != null) {
			local5 = new Class253(arg1, Static272.aClass176_3, Static118.aClass176Array1[arg1], 1000000);
		}
		Static311.aClass101_Sub1Array2[arg1] = Static251.aClass107_3.method2622(Static37.aClass253_1, arg1, local5);
		if (arg2) {
			Static311.aClass101_Sub1Array2[arg1].method2461();
		}
		return new Class250(Static311.aClass101_Sub1Array2[arg1], arg0, 1);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BZ)V")
	public static void method5682(@OriginalArg(1) boolean arg0) {
		Static44.method856();
		if (!Static1.method6243(Static345.anInt5823)) {
			return;
		}
		Static15.anInt283++;
		if (Static15.anInt283 < 50 && !arg0) {
			return;
		}
		Static15.anInt283 = 0;
		if (!Static346.aBoolean409 && Static328.aClass116_1 != null) {
			Static307.method4633(Static266.aClass163_114);
			try {
				Static328.aClass116_1.method2918(Static243.aClass3_Sub25_Sub1_7.anInt4974, Static243.aClass3_Sub25_Sub1_7.aByteArray88);
				Static243.aClass3_Sub25_Sub1_7.anInt4974 = 0;
			} catch (@Pc(56) IOException local56) {
				Static346.aBoolean409 = true;
			}
		}
		Static44.method856();
	}
}
