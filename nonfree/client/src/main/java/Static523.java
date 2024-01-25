import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
	public static int anInt9004;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Z")
	public static boolean aBoolean627 = false;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZZ)Z")
	public static boolean method7770(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public static void method7771() {
		for (@Pc(8) Class14_Sub2_Sub17 local8 = (Class14_Sub2_Sub17) Static440.aClass269_60.method6494(); local8 != null; local8 = (Class14_Sub2_Sub17) Static440.aClass269_60.method6491()) {
			if (local8.anInt9298 > 1) {
				local8.anInt9298 = 0;
				Static103.aClass317_9.method7875(((Class14_Sub2_Sub20) local8.aClass269_142.aClass14_Sub2_42.aClass14_Sub2_67).aLong280, local8);
				local8.aClass269_142.method6492();
			}
		}
		Static638.anInt10454 = 0;
		Static164.anInt2537 = 0;
		Static111.aClass32_7.method588();
		Static468.aClass125_32.method2628();
		Static440.aClass269_60.method6492();
		Static455.aBoolean533 = false;
	}
}
