import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!es", name = "w", descriptor = "I")
	public static int anInt2850;

	@OriginalMember(owner = "client!es", name = "x", descriptor = "I")
	public static int anInt2851;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BLclient!kda;Lclient!kda;Lclient!tca;Lclient!kda;)Z")
	public static boolean method2661(@OriginalArg(1) Class160 arg0, @OriginalArg(2) Class160 arg1, @OriginalArg(3) Class1_Sub12_Sub4 arg2, @OriginalArg(4) Class160 arg3) {
		Static310.aClass160_70 = arg1;
		Static543.aClass160_106 = arg0;
		Static535.aClass1_Sub12_Sub4_3 = arg2;
		Static420.aClass160_87 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)I")
	public static int method2662(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local28 | local28 >>> 16;
		return local39 + 1;
	}
}
