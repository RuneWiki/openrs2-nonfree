import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!du", name = "a", descriptor = "Lclient!cq;")
	public static Class43 aClass43_3;

	@OriginalMember(owner = "client!du", name = "d", descriptor = "Lclient!lh;")
	public static Class142 aClass142_1;

	@OriginalMember(owner = "client!du", name = "f", descriptor = "[[Lclient!ng;")
	public static Class163[][] aClass163ArrayArray1;

	@OriginalMember(owner = "client!du", name = "g", descriptor = "I")
	public static int anInt1942;

	@OriginalMember(owner = "client!du", name = "h", descriptor = "I")
	public static int anInt1943;

	@OriginalMember(owner = "client!du", name = "e", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_61 = new Class189("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IZIIFIII)[I")
	public static int[] method1509(@OriginalArg(4) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class3_Sub2_Sub28 local10 = new Class3_Sub2_Sub28();
		local10.anInt5942 = 8;
		local10.anInt5938 = 35;
		local10.aBoolean514 = true;
		local10.anInt5945 = (int) (arg0 * 4096.0F);
		local10.anInt5937 = 8;
		local10.anInt5941 = 4;
		local10.method5898();
		Static44.method5688(2048, 1);
		local10.method4643(0, local6);
		return local6;
	}
}
