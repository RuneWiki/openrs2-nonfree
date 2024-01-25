import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "Lclient!da;")
	public static Class69 aClass69_9;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "Z")
	public static final boolean aBoolean407 = false;

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
	public static volatile int anInt5201 = -1;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!fl;B)V")
	public static void method4413(@OriginalArg(0) Class23_Sub2_Sub1_Sub2_Sub1 arg0) {
		@Pc(16) Class3_Sub32 local16 = (Class3_Sub32) Static554.aClass62_43.method1682((long) arg0.anInt10180);
		if (local16 == null) {
			Static420.method5992(arg0.anIntArray660[0], arg0.aByte142, (Class178) null, 0, arg0.anIntArray659[0], arg0, (Class23_Sub2_Sub1_Sub2_Sub2) null);
		} else {
			local16.method5085();
		}
	}
}
