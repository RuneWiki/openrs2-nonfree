import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "[Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2[] aClass4_Sub3_Sub6_Sub2Array8;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!cb;")
	public static Class12 aClass12_13 = new Class12(64);

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Z")
	public static boolean aBoolean65 = false;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!od;")
	public static Class60 aClass60_762 = Static41.method597("welle2:");

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Lclient!od;")
	private static Class60 aClass60_764 = Static41.method597("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!od;")
	public static Class60 aClass60_763 = aClass60_764;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIB)I")
	public static int method1239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) long local12 = (long) ((arg0 << 16) + arg1);
		return Static36.aClass4_Sub3_Sub9_1 != null && Static36.aClass4_Sub3_Sub9_1.aLong100 == local12 ? Static117.aClass4_Sub9_5.anInt1312 * 99 / (Static117.aClass4_Sub9_5.aByteArray6.length - Static36.aClass4_Sub3_Sub9_1.aByte6) + 1 : 0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
	public static void method1240() {
		aClass4_Sub3_Sub6_Sub2Array8 = null;
		aClass60_764 = null;
		aClass60_763 = null;
		aClass60_762 = null;
		aClass12_13 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!c;BILclient!c;I)Lclient!me;")
	public static Class4_Sub3_Sub6_Sub1_Sub1 method1241(@OriginalArg(0) Class10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class10 arg2, @OriginalArg(4) int arg3) {
		return Static110.method1825(arg1, arg3, arg2) ? Static7.method64(arg0.method1774(arg1, arg3)) : null;
	}
}
