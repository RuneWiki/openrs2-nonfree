import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!j", name = "j", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V", line = 9)
	public static void method801() {
		Static24.aFontMetrics1 = null;
		Static71.anImage4 = null;
		Static20.aFont1 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V", line = 32)
	public static void method802() {
		Class27.aClass40_336 = null;
		Class27.aClass40_338 = null;
		Class27.aClass40_342 = null;
		Class27.aClass40_339 = null;
		Class27.aClass47_12 = null;
		Class27.aClass40_341 = null;
		Class27.aClass40_340 = null;
		anIntArray225 = null;
		Class27.aClass40_337 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[B", line = 79)
	public static synchronized byte[] method803(@OriginalArg(0) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Class2_Sub5.anInt737 > 0) {
			local19 = client.aByteArrayArray3[--Class2_Sub5.anInt737];
			client.aByteArrayArray3[Class2_Sub5.anInt737] = null;
			return local19;
		} else if (arg0 == 5000 && Class2_Sub2_Sub8.anInt965 > 0) {
			local19 = Class22.aByteArrayArray8[--Class2_Sub2_Sub8.anInt965];
			Class22.aByteArrayArray8[Class2_Sub2_Sub8.anInt965] = null;
			return local19;
		} else if (arg0 == 30000 && Class9.anInt264 > 0) {
			local19 = Class18.aByteArrayArray9[--Class9.anInt264];
			Class18.aByteArrayArray9[Class9.anInt264] = null;
			return local19;
		} else {
			return new byte[arg0];
		}
	}
}
