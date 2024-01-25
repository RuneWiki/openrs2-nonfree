import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!rr", name = "x", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_457 = new Class305(40, 10);

	@OriginalMember(owner = "client!rr", name = "J", descriptor = "[[I")
	public static final int[][] anIntArrayArray124 = new int[128][128];

	@OriginalMember(owner = "client!rr", name = "K", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_139 = new Class252(38, 8);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(III[B)I")
	public static int method8157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(17) int local17 = arg0; local17 < arg1; local17++) {
			local7 = Class240.anIntArray677[(arg2[local17] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(IIII)V")
	public static void method8162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static379.aByteArrayArrayArray13 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BI)Lclient!mca;")
	public static Class38_Sub1 method8163(@OriginalArg(1) int arg0) {
		return Static69.aBoolean144 && arg0 >= Static411.anInt9221 && Static81.anInt1884 >= arg0 ? Static332.aClass38_Sub1Array99[arg0 - Static411.anInt9221] : null;
	}
}
