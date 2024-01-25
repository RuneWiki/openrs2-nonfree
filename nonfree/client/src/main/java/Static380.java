import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static380 {

	@OriginalMember(owner = "client!on", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!on", name = "k", descriptor = "Lclient!rc;")
	public static Class1_Sub40 aClass1_Sub40_3;

	@OriginalMember(owner = "client!on", name = "f", descriptor = "F")
	public static float aFloat181 = 1.0F;

	@OriginalMember(owner = "client!on", name = "g", descriptor = "[Lclient!ut;")
	public static final Class1_Sub8_Sub18[] aClass1_Sub8_Sub18Array3 = new Class1_Sub8_Sub18[14];

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III)Z")
	public static boolean method5475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static262.method3790(arg0, arg1) | Static118.method2139(arg0, arg1)) & Static100.method1477(arg1, arg0);
	}
}
