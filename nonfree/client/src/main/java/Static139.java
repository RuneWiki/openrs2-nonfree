import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Lclient!dg;")
	public static Class2_Sub2_Sub4_Sub1_Sub1 aClass2_Sub2_Sub4_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "[Lclient!rc;")
	public static Class2_Sub2_Sub16[] aClass2_Sub2_Sub16Array15;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!i;")
	public static Class41 aClass41_880 = Static184.method2923("Benutzername: ");

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "Lclient!i;")
	private static Class41 aClass41_885 = Static184.method2923("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!i;")
	public static Class41 aClass41_881 = aClass41_885;

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
	public static int anInt3213 = 0;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "Lclient!i;")
	public static Class41 aClass41_882 = Static184.method2923("Lade)3)3)3");

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Lclient!i;")
	public static Class41 aClass41_883 = Static184.method2923("huffman");

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Lclient!i;")
	private static Class41 aClass41_884 = Static184.method2923("Loaded fonts");

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Z")
	public static boolean aBoolean184 = true;

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "Lclient!i;")
	public static Class41 aClass41_886 = aClass41_884;

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "Lclient!i;")
	public static Class41 aClass41_887 = aClass41_885;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
	public static void method2206() {
		Static126.aClass16_7.method436();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIBII)V")
	public static void method2207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg4;
		@Pc(21) int local21 = arg5 - arg4;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = local21 * local21;
		@Pc(45) int local45 = local29 << 1;
		@Pc(49) int local49 = local16 * local16;
		@Pc(53) int local53 = local25 << 1;
		@Pc(57) int local57 = local49 << 1;
		@Pc(61) int local61 = local33 << 1;
		@Pc(65) int local65 = local21 << 1;
		@Pc(74) int local74 = local61 + local49 * (1 - local65);
		@Pc(78) int local78 = arg5 << 1;
		@Pc(87) int local87 = local29 - (local78 - 1) * local53;
		@Pc(96) int local96 = (1 - local78) * local25 + local45;
		@Pc(105) int local105 = local33 - local57 * (local65 - 1);
		@Pc(109) int local109 = local29 << 2;
		@Pc(113) int local113 = local25 << 2;
		@Pc(117) int local117 = local45 * 3;
		@Pc(121) int local121 = local33 << 2;
		@Pc(125) int local125 = local49 << 2;
		@Pc(129) int local129 = local61 * 3;
		@Pc(135) int local135 = local57 * (local65 - 3);
		@Pc(137) int local137 = local109;
		@Pc(143) int local143 = (local78 - 3) * local53;
		@Pc(145) int local145 = local121;
		@Pc(163) int local163;
		@Pc(172) int local172;
		@Pc(181) int local181;
		@Pc(190) int local190;
		if (Static45.anInt1337 <= arg0 && Static17.anInt457 >= arg0) {
			@Pc(155) int[] local155 = Static3.anIntArrayArray1[arg0];
			local163 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg6 - arg2);
			local172 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg6 + arg2);
			local181 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg6 - local16);
			local190 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg6 + local16);
			Static204.method3147(local163, arg1, local181, local155);
			Static204.method3147(local181, arg3, local190, local155);
			Static204.method3147(local190, arg1, local172, local155);
		}
		@Pc(214) int local214 = (local21 - 1) * local125;
		@Pc(220) int local220 = (arg5 - 1) * local113;
		while (local5 > 0) {
			if (local96 < 0) {
				while (local96 < 0) {
					local96 += local117;
					local117 += local109;
					local3++;
					local87 += local137;
					local137 += local109;
				}
			}
			@Pc(259) boolean local259 = local21 >= local5;
			local5--;
			local172 = local5 + arg0;
			local163 = arg0 - local5;
			if (local259) {
				if (local74 < 0) {
					while (local74 < 0) {
						local105 += local145;
						local74 += local129;
						local129 += local121;
						local11++;
						local145 += local121;
					}
				}
				if (local105 < 0) {
					local105 += local145;
					local11++;
					local74 += local129;
					local129 += local121;
					local145 += local121;
				}
				local105 += -local135;
				local74 += -local214;
				local135 -= local125;
				local214 -= local125;
			}
			if (local87 < 0) {
				local87 += local137;
				local137 += local109;
				local96 += local117;
				local117 += local109;
				local3++;
			}
			local87 += -local143;
			local96 += -local220;
			local220 -= local113;
			local143 -= local113;
			if (local172 >= Static45.anInt1337 && Static17.anInt457 >= local163) {
				local181 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg6 + local3);
				local190 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg6 - local3);
				if (local259) {
					@Pc(405) int local405 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg6 + local11);
					@Pc(413) int local413 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg6 - local11);
					@Pc(424) int[] local424;
					if (local163 >= Static45.anInt1337) {
						local424 = Static3.anIntArrayArray1[local163];
						Static204.method3147(local190, arg1, local413, local424);
						Static204.method3147(local413, arg3, local405, local424);
						Static204.method3147(local405, arg1, local181, local424);
					}
					if (Static17.anInt457 >= local172) {
						local424 = Static3.anIntArrayArray1[local172];
						Static204.method3147(local190, arg1, local413, local424);
						Static204.method3147(local413, arg3, local405, local424);
						Static204.method3147(local405, arg1, local181, local424);
					}
				} else {
					if (local163 >= Static45.anInt1337) {
						Static204.method3147(local190, arg1, local181, Static3.anIntArrayArray1[local163]);
					}
					if (Static17.anInt457 >= local172) {
						Static204.method3147(local190, arg1, local181, Static3.anIntArrayArray1[local172]);
					}
				}
			}
		}
	}
}
