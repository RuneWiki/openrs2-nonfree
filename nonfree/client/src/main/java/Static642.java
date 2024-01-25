import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "Z")
	public static boolean aBoolean763;

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
	public static int anInt10687 = 0;

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
	public static int anInt10689 = 0;

	@OriginalMember(owner = "client!wv", name = "f", descriptor = "[I")
	public static final int[] anIntArray626 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_154 = new Class71(98, 6);

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIII)V")
	public static void method8625(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 != 8 && arg3 != 16) {
			@Pc(21) Class56 local21 = Static405.aClass56ArrayArrayArray2[arg5][arg1][arg4];
			if (local21 == null) {
				local21 = new Class56(arg5);
			}
			if (arg3 == 1) {
				local21.aShort20 = (short) arg0;
				local21.aShort21 = (short) arg2;
			} else if (arg3 == 2) {
				local21.aShort22 = (short) arg2;
				local21.aShort23 = (short) arg0;
			}
			if (Static76.aBoolean169) {
				Static412.method6490();
			}
			return;
		}
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(89) int local89;
		@Pc(101) int local101;
		if (arg3 != 8) {
			local69 = Static572.anInt9827 + (arg1 << Static172.anInt4156);
			local73 = local69 - Static572.anInt9827;
			local77 = arg4 << Static172.anInt4156;
			local81 = local77 + Static572.anInt9827;
			local89 = Static86.aClass86Array2[arg5].method8086(arg4, arg1 + 1);
			local101 = Static86.aClass86Array2[arg5].method8086(arg4 + 1, arg1);
			Static619.aClass372Array4[Static134.anInt3553++] = new Class372(arg3, arg5, local69, local73, local73, local69, local89, local101, local101 - arg0, -arg0 + local89, local77, local81, local81, local77);
			return;
		}
		local69 = arg1 << Static172.anInt4156;
		local73 = local69 + Static572.anInt9827;
		local77 = arg4 << Static172.anInt4156;
		local81 = Static572.anInt9827 + local77;
		local89 = Static86.aClass86Array2[arg5].method8086(arg4, arg1);
		local101 = Static86.aClass86Array2[arg5].method8086(arg4 + 1, arg1 + 1);
		Static619.aClass372Array4[Static134.anInt3553++] = new Class372(arg3, arg5, local69, local73, local73, local69, local89, local101, local101 - arg0, local89 + -arg0, local77, local81, local81, local77);
	}
}
