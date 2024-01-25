import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "Lclient!lla;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "Lclient!ll;")
	public static final Interface12 anInterface12_3 = new Class300();

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "I")
	public static int anInt3718 = -1;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIFBIIZ)[I")
	public static int[] method3356(@OriginalArg(3) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class3_Sub1_Sub32 local10 = new Class3_Sub1_Sub32();
		local10.anInt9873 = 8;
		local10.anInt9884 = 35;
		local10.anInt9876 = 8;
		local10.aBoolean666 = true;
		local10.anInt9881 = 4;
		local10.anInt9879 = (int) (arg0 * 4096.0F);
		local10.method9578();
		Static433.method5744(2048, 1);
		local10.method8414(local6, 0);
		return local6;
	}
}
