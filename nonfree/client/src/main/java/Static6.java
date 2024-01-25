import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
	public static int anInt81 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)Lclient!iu;")
	public static Class180_Sub1 method89() {
		Static541.anInt9234 = 0;
		return Static452.method6467();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIZIFII)[I")
	public static int[] method93(@OriginalArg(5) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class5_Sub1_Sub22 local10 = new Class5_Sub1_Sub22();
		local10.anInt7260 = (int) ((float) 4096 * arg0);
		local10.anInt7271 = 4;
		local10.anInt7273 = 35;
		local10.anInt7266 = 8;
		local10.aBoolean561 = true;
		local10.anInt7263 = 8;
		local10.method9204();
		Static345.method5217(1, 2048);
		local10.method6284(0, local6);
		return local6;
	}
}
