import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static628 {

	@OriginalMember(owner = "client!wh", name = "O", descriptor = "Lclient!qk;")
	public static Class288 aClass288_353 = new Class288(30, 6);

	@OriginalMember(owner = "client!wh", name = "X", descriptor = "[Lclient!kc;")
	public static final Class13_Sub1_Sub1_Sub1_Sub2[] aClass13_Sub1_Sub1_Sub1_Sub2Array1 = new Class13_Sub1_Sub1_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(III)Z")
	public static boolean method8428(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([IBLclient!wu;Lclient!wu;)V")
	public static void method8429(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class380 arg1, @OriginalArg(3) Class380 arg2) {
		if (arg0 != null) {
			Static200.anIntArray222 = arg0;
		}
		Static343.aClass380_80 = arg2;
		Static144.aClass380_40 = arg1;
	}
}
