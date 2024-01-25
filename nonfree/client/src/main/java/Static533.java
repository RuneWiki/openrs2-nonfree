import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "Lclient!oca;")
	public static final Class225 aClass225_27 = new Class225(6, 0, 4, 2);

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IZIIIIIF)[I")
	public static int[] method7879(@OriginalArg(7) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class12_Sub1_Sub33 local10 = new Class12_Sub1_Sub33();
		local10.anInt8609 = 8;
		local10.anInt8608 = 8;
		local10.anInt8610 = 35;
		local10.anInt8613 = (int) (arg0 * 4096.0F);
		local10.anInt8619 = 4;
		local10.aBoolean611 = true;
		local10.method7797();
		Static33.method3595(1, 2048);
		local10.method7080(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)V")
	public static void method7880() {
		Static127.method2688();
		Static365.method5697();
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIBII)V")
	public static void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static108.method2267(arg3, Static507.anInt9124, Static234.anInt4897);
		@Pc(17) int local17 = Static108.method2267(arg2, Static507.anInt9124, Static234.anInt4897);
		@Pc(31) int local31 = Static108.method2267(arg0, Static251.anInt5168, Static341.anInt6481);
		@Pc(37) int local37 = Static108.method2267(arg1, Static251.anInt5168, Static341.anInt6481);
		for (@Pc(39) int local39 = local11; local39 <= local17; local39++) {
			Static118.method2461(Static228.anIntArrayArray46[local39], local37, arg4, local31);
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(III)Lclient!fba;")
	public static Class30_Sub4 method7882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class37 local7 = Static120.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass30_Sub4_2;
	}
}
