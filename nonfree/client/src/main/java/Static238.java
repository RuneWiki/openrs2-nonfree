import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!on", name = "m", descriptor = "I")
	public static int anInt5092;

	@OriginalMember(owner = "client!on", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!on", name = "o", descriptor = "J")
	public static long aLong155 = 0L;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BI)V")
	public static void method4325() {
		Static204.aClass107_25.method3011(50);
		Static354.aClass107_57.method3011(50);
		Static364.aClass107_61.method3011(50);
		Static274.aClass107_42.method3011(50);
		Static355.aClass107_58.method3011(50);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BIII)V")
	public static void method4326(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static243.aByteArrayArrayArray10 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III)V")
	public static void method4327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub9_Sub4 local8 = Static98.method1971(5, arg1);
		local8.method1801();
		local8.anInt1723 = arg0;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BZI)Lclient!in;")
	public static Class2_Sub21 method4329(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(12) long local12 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class2_Sub21) Static193.aClass41_20.method902(local12);
	}
}
