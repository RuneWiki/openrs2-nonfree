import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cha", name = "b", descriptor = "[[Lclient!ofa;")
	public static Class265[][] aClass265ArrayArray1;

	@OriginalMember(owner = "client!cha", name = "e", descriptor = "Lclient!jb;")
	public static Class171 aClass171_15;

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(IBLclient!ofa;)I")
	public static int method1306(@OriginalArg(0) int arg0, @OriginalArg(2) Class265 arg1) {
		if (!Static86.method1383(arg1).method6486(arg0) && arg1.anObjectArray13 == null) {
			return -1;
		} else if (arg1.anIntArray380 == null || arg0 >= arg1.anIntArray380.length) {
			return -1;
		} else {
			return arg1.anIntArray380[arg0];
		}
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method1307(@OriginalArg(0) Class95 arg0) {
		Static342.aClass221Array1 = new Class221[Static407.anIntArray349.length];
		for (@Pc(16) int local16 = 0; local16 < Static407.anIntArray349.length; local16++) {
			@Pc(22) int local22 = Static407.anIntArray349[local16];
			@Pc(27) Class91 local27 = Static473.method6301(local22, Static516.aClass362_111);
			@Pc(35) Class67 local35 = arg0.method8032(local27, Static688.method8599(Static197.aClass362_42, local22));
			Static342.aClass221Array1[local16] = new Class221(local35, local27);
		}
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(Lclient!cm;I)V")
	public static void method1308(@OriginalArg(0) Class34_Sub1_Sub1_Sub2_Sub1 arg0) {
		@Pc(11) Class3_Sub30 local11 = (Class3_Sub30) Static588.aClass333_42.method7489((long) arg0.anInt9671);
		if (local11 == null) {
			return;
		}
		if (local11.aClass3_Sub12_Sub4_4 != null) {
			Static156.aClass3_Sub12_Sub1_1.method1766(local11.aClass3_Sub12_Sub4_4);
			local11.aClass3_Sub12_Sub4_4 = null;
		}
		local11.method9034();
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(BIIIIIII)V")
	public static void method1309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(16) int local16 = Static166.method2620(arg2, Static229.anInt4089, Static617.anInt6260);
		@Pc(22) int local22 = Static166.method2620(arg4, Static229.anInt4089, Static617.anInt6260);
		@Pc(28) int local28 = Static166.method2620(arg6, Static629.anInt10412, Static300.anInt5091);
		@Pc(34) int local34 = Static166.method2620(arg0, Static629.anInt10412, Static300.anInt5091);
		@Pc(43) int local43 = Static166.method2620(arg2 + arg5, Static229.anInt4089, Static617.anInt6260);
		@Pc(52) int local52 = Static166.method2620(arg4 - arg5, Static229.anInt4089, Static617.anInt6260);
		for (@Pc(54) int local54 = local16; local54 < local43; local54++) {
			Static578.method7640(arg3, local28, local34, Static276.anIntArrayArray32[local54]);
		}
		for (@Pc(74) int local74 = local22; local74 > local52; local74--) {
			Static578.method7640(arg3, local28, local34, Static276.anIntArrayArray32[local74]);
		}
		@Pc(102) int local102 = Static166.method2620(arg5 + arg6, Static629.anInt10412, Static300.anInt5091);
		@Pc(111) int local111 = Static166.method2620(arg0 - arg5, Static629.anInt10412, Static300.anInt5091);
		for (@Pc(113) int local113 = local43; local113 <= local52; local113++) {
			@Pc(119) int[] local119 = Static276.anIntArrayArray32[local113];
			Static578.method7640(arg3, local28, local102, local119);
			Static578.method7640(arg1, local102, local111, local119);
			Static578.method7640(arg3, local111, local34, local119);
		}
	}
}
