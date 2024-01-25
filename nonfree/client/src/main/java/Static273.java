import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "[I")
	public static int[] anIntArray254;

	@OriginalMember(owner = "client!jfa", name = "e", descriptor = "[I")
	public static final int[] anIntArray256 = new int[50];

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!rv;)Lclient!fc;")
	public static Class110 method3805(@OriginalArg(1) Class5_Sub15 arg0) {
		@Pc(10) Class112 local10 = Static17.method265()[arg0.method3642()];
		@Pc(19) Class4 local19 = Static49.method727()[arg0.method3642()];
		@Pc(23) int local23 = arg0.method3638();
		@Pc(27) int local27 = arg0.method3638();
		@Pc(31) int local31 = arg0.method3698();
		@Pc(35) int local35 = arg0.method3698();
		@Pc(39) int local39 = arg0.method3638();
		@Pc(48) int local48 = arg0.method3671();
		@Pc(54) int local54 = arg0.method3671();
		return new Class110(local10, local19, local23, local27, local31, local35, local39, local48, local54);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IIIILclient!ka;)Lclient!pw;")
	public static Class280 method3807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class114 arg3) {
		return arg3 == null ? null : new Class280(arg0, arg2, arg1, arg3.na(), arg3.V(), arg3.RA(), arg3.fa(), arg3.EA(), arg3.HA(), arg3.G());
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)V")
	public static void method3808() {
		if (Static279.anInt4365 < 0) {
			return;
		}
		@Pc(16) long local16 = Static124.method1947();
		Static279.anInt4365 = (int) ((long) Static279.anInt4365 + Static536.aLong269 - local16);
		if (Static279.anInt4365 > 0) {
			@Pc(36) int local36 = (Static279.anInt4365 << 8) / Static598.anInt9720;
			@Pc(41) int local41 = 255 - local36;
			@Pc(46) float local46 = (float) local36 / 255.0F;
			@Pc(51) float local51 = 1.0F - local46;
			Static668.anInt10415 = ((Static26.aClass378_1.anInt10125 & 0xFF00FF) * local41 + local36 * (Static123.anInt2147 & 0xFF00FF) & 0xFF00FF00) + ((Static26.aClass378_1.anInt10125 & 0xFF00) * local41 + local36 * (Static123.anInt2147 & 0xFF00) & 0xFF0000) >>> 8;
			Static522.aFloat163 = (Static26.aClass378_1.aFloat193 - Static434.aFloat146) * local51 + Static434.aFloat146;
			Static248.aFloat58 = (Static26.aClass378_1.aFloat192 - Static211.aFloat53) * local51 + Static211.aFloat53;
			Static550.aFloat169 = Static145.aFloat48 + local51 * (Static26.aClass378_1.aFloat194 - Static145.aFloat48);
			Static325.anInt5948 = local41 * Static26.aClass378_1.anInt10130 + Static244.anInt3949 * local36 >> 8;
			Static240.anInt3902 = ((Static177.anInt2911 & 0xFF00) * local36 + local41 * (Static26.aClass378_1.anInt10127 & 0xFF00) & 0xFF0000) + (local41 * (Static26.aClass378_1.anInt10127 & 0xFF00FF) + (Static177.anInt2911 & 0xFF00FF) * local36 & 0xFF00FF00) >>> 8;
			Static80.aFloat30 = (Static26.aClass378_1.aFloat191 - Static181.aFloat51) * local51 + Static181.aFloat51;
			Static84.aFloat31 = (Static26.aClass378_1.aFloat190 - Static292.aFloat61) * local51 + Static292.aFloat61;
			Static560.aFloat170 = local51 * (Static26.aClass378_1.aFloat189 - Static266.aFloat60) + Static266.aFloat60;
			if (Static176.aClass11_1 != Static26.aClass378_1.aClass11_4) {
				Static189.aClass11_2 = Static96.aClass143_3.method6267(Static176.aClass11_1, Static26.aClass378_1.aClass11_4, local51, Static189.aClass11_2);
			}
		} else {
			Static325.anInt5948 = Static26.aClass378_1.anInt10130;
			Static522.aFloat163 = Static26.aClass378_1.aFloat193;
			Static560.aFloat170 = Static26.aClass378_1.aFloat189;
			Static189.aClass11_2 = Static26.aClass378_1.aClass11_4;
			Static550.aFloat169 = Static26.aClass378_1.aFloat194;
			Static279.anInt4365 = -1;
			Static80.aFloat30 = Static26.aClass378_1.aFloat191;
			Static84.aFloat31 = Static26.aClass378_1.aFloat190;
			Static240.anInt3902 = Static26.aClass378_1.anInt10127;
			Static668.anInt10415 = Static26.aClass378_1.anInt10125;
			Static248.aFloat58 = Static26.aClass378_1.aFloat192;
		}
		Static536.aLong269 = local16;
	}
}
