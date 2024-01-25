import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!v", name = "E", descriptor = "I")
	public static int anInt6614;

	@OriginalMember(owner = "client!v", name = "L", descriptor = "[Lclient!gj;")
	public static Class31[] aClass31Array17;

	@OriginalMember(owner = "client!v", name = "N", descriptor = "Lclient!ul;")
	public static Interface7 anInterface7_8;

	@OriginalMember(owner = "client!v", name = "X", descriptor = "I")
	public static int anInt6623;

	@OriginalMember(owner = "client!v", name = "U", descriptor = "Lclient!wq;")
	public static final Class216 aClass216_44 = new Class216();

	@OriginalMember(owner = "client!v", name = "W", descriptor = "Z")
	public static boolean aBoolean583 = false;

	@OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
	public static int anInt6624 = 1;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
	public static void method5733(@OriginalArg(1) int arg0) {
		@Pc(1) Class119 local1 = Static322.aClass119_196;
		synchronized (Static322.aClass119_196) {
			Static322.aClass119_196.method3304();
			Static322.aClass119_196 = new Class119(arg0);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!tq;Lclient!tq;Lclient!tq;Lclient!eo;B)Z")
	public static boolean method5737(@OriginalArg(0) Class191 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) Class191 arg2, @OriginalArg(3) Class2_Sub3_Sub3 arg3) {
		Static271.aClass2_Sub3_Sub3_3 = arg3;
		Static78.aClass191_50 = arg1;
		Static320.aClass191_199 = arg0;
		Static200.aClass191_203 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)Lclient!bj;")
	public static Class20_Sub1 method5739() {
		Static36.anInt686 = 0;
		return Static271.method4894();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII)V")
	public static void method5740(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(16) Class55_Sub5 local16 = (Class55_Sub5) Static31.aClass67_4.method2098(); local16 != null; local16 = (Class55_Sub5) Static31.aClass67_4.method2104()) {
			if (local16.anInt3713 <= Static212.anInt4090) {
				local16.method4599();
			} else {
				Static194.method3500(arg2 >> 1, (local16.anInt3712 << 7) + 64, local16.anInt3709 * 2, (local16.anInt3711 << 7) + 64, arg3 >> 1);
				Static56.aClass37_1.method5263(Static239.anIntArray366[1] + arg1, local16.anInt3714 | 0xFF000000, local16.aString33, Static239.anIntArray366[0] + arg0, 0);
			}
		}
	}
}
