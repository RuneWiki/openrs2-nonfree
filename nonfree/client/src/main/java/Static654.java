import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static654 {

	@OriginalMember(owner = "client!wda", name = "J", descriptor = "[Lclient!pu;")
	public static Class50[] aClass50Array15;

	@OriginalMember(owner = "client!wda", name = "M", descriptor = "[Lclient!lq;")
	public static Class28_Sub1[] aClass28_Sub1Array5;

	@OriginalMember(owner = "client!wda", name = "K", descriptor = "Lclient!jf;")
	public static final Class178 aClass178_5 = new Class178();

	@OriginalMember(owner = "client!wda", name = "O", descriptor = "Lclient!ega;")
	public static final Class98 aClass98_7 = new Class98("game4", 3);

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "(I)V")
	public static void method8787() {
		Static367.aClass65_11.xa(((float) Static172.aClass5_Sub50_14.aClass12_Sub22_1.method6464() * 0.1F + 0.7F) * Static176.aFloat86);
		Static367.aClass65_11.ZA(Static390.anInt6936, Static349.aFloat121, Static416.aFloat143, (float) (Static311.anInt5912 << 2), (float) (Static331.anInt6125 << 2), (float) (Static148.anInt3030 << 2));
		Static367.aClass65_11.method6905(Static282.aClass57_1);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!qf;I)I")
	public static int method8789(@OriginalArg(0) Class5_Sub3_Sub15 arg0) {
		@Pc(14) String local14 = Static545.method7614(arg0);
		return Static299.aClass247_11.method5764(local14, Static364.aClass50Array8);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIZI)Lclient!fda;")
	public static Class28_Sub1_Sub4_Sub2 method8790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class226 local16 = Static635.aClass226ArrayArrayArray3[arg0][arg2][arg1];
		if (local16 == null) {
			return null;
		}
		@Pc(22) Class28_Sub1_Sub4_Sub2 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class41 local27 = local16.aClass41_3; local27 != null; local27 = local27.aClass41_2) {
			@Pc(31) Class28_Sub1_Sub4 local31 = local27.aClass28_Sub1_Sub4_1;
			if (local31 instanceof Class28_Sub1_Sub4_Sub2) {
				@Pc(37) Class28_Sub1_Sub4_Sub2 local37 = (Class28_Sub1_Sub4_Sub2) local31;
				@Pc(47) int local47 = local37.method4599() * 256 + 252 - 256;
				@Pc(55) int local55 = local37.anInt10781 - local47 >> 9;
				@Pc(63) int local63 = local37.anInt10784 - local47 >> 9;
				@Pc(70) int local70 = local47 + local37.anInt10781 >> 9;
				@Pc(77) int local77 = local47 + local37.anInt10784 >> 9;
				if (arg2 >= local55 && local63 <= arg1 && arg2 <= local70 && local77 >= arg1) {
					@Pc(115) int local115 = (local77 + 1 - arg1) * (local70 - (-1 - -arg2));
					if (local115 > local24) {
						local22 = local37;
						local24 = local115;
					}
				}
			}
		}
		return local22;
	}
}
