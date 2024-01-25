import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!pq", name = "K", descriptor = "I")
	public static int anInt7993;

	@OriginalMember(owner = "client!pq", name = "L", descriptor = "I")
	public static int anInt7994;

	@OriginalMember(owner = "client!pq", name = "M", descriptor = "Lclient!gf;")
	public static Class128 aClass128_2;

	@OriginalMember(owner = "client!pq", name = "N", descriptor = "Lclient!kl;")
	public static Class204 aClass204_1;

	@OriginalMember(owner = "client!pq", name = "H", descriptor = "Lclient!tga;")
	public static final Class335 aClass335_41 = new Class335(32);

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIB)V")
	public static void method6790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class5_Sub2_Sub4 local15 = Static257.method3597(15, 0L);
		local15.method2438();
		local15.anInt2749 = arg1;
		local15.anInt2740 = arg0;
	}
}
