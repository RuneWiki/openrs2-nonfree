import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
	public static int anInt5477 = 2;

	@OriginalMember(owner = "client!pa", name = "Y", descriptor = "Lclient!gp;")
	public static final Class87 aClass87_18 = new Class87(10, -1);

	@OriginalMember(owner = "client!pa", name = "eb", descriptor = "[Lclient!uu;")
	public static final Class242[] aClass242Array1 = new Class242[4];

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!bt;I)Lclient!rs;")
	public static Class204 method4438(@OriginalArg(0) Class3_Sub2 arg0) {
		@Pc(12) Class204 local12 = new Class204();
		local12.anInt6332 = arg0.method6004();
		local12.aClass3_Sub3_Sub18_1 = Static32.aClass259_1.method5865(local12.anInt6332);
		return local12;
	}
}
