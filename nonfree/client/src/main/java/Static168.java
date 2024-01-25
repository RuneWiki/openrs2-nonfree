import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_123 = new Class123(52, 7);

	@OriginalMember(owner = "client!ge", name = "C", descriptor = "Z")
	public static boolean aBoolean262 = false;

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
	public static int anInt3738 = 0;

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "S")
	public static short aShort46 = 32767;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IBII)V")
	public static void method3019(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub7_Sub19 local8 = Static73.method5992(9, arg2);
		local8.method7363();
		local8.anInt9381 = arg0;
		local8.anInt9377 = arg1;
	}
}
