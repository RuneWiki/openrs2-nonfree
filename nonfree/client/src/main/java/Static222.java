import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "Lclient!hh;")
	public static Class109 aClass109_56;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_204 = new Class12(60, 2);

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "Z")
	public static boolean aBoolean314 = false;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "[F")
	public static final float[] aFloatArray16 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIII)V")
	public static void method3257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class1_Sub1_Sub1 local13 = Static190.method3007(arg0, 9);
		local13.method32();
		local13.anInt35 = arg1;
		local13.anInt39 = arg2;
	}
}
