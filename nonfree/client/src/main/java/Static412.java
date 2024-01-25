import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!or", name = "f", descriptor = "Lclient!cr;")
	public static Class51 aClass51_25;

	@OriginalMember(owner = "client!or", name = "g", descriptor = "Lclient!kha;")
	public static Class181 aClass181_78;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_93 = new Class218(83, 6);

	@OriginalMember(owner = "client!or", name = "b", descriptor = "Lclient!cha;")
	public static Class3_Sub14 aClass3_Sub14_2 = null;

	@OriginalMember(owner = "client!or", name = "c", descriptor = "I")
	public static int anInt7699 = 0;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIIIII)V")
	public static void method6447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static429.method6586(arg5, Static583.anInt9761, Static246.anInt5506);
		@Pc(17) int local17 = Static429.method6586(arg0, Static583.anInt9761, Static246.anInt5506);
		@Pc(23) int local23 = Static429.method6586(arg3, Static202.anInt4720, Static472.anInt6105);
		@Pc(29) int local29 = Static429.method6586(arg2, Static202.anInt4720, Static472.anInt6105);
		@Pc(37) int local37 = Static429.method6586(arg4 + arg5, Static583.anInt9761, Static246.anInt5506);
		@Pc(46) int local46 = Static429.method6586(arg0 - arg4, Static583.anInt9761, Static246.anInt5506);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static580.method8027(Static104.anIntArrayArray24[local48], local29, local23, arg1);
		}
		for (@Pc(68) int local68 = local17; local68 > local46; local68--) {
			Static580.method8027(Static104.anIntArrayArray24[local68], local29, local23, arg1);
		}
		@Pc(90) int local90 = Static429.method6586(arg4 + arg3, Static202.anInt4720, Static472.anInt6105);
		@Pc(98) int local98 = Static429.method6586(arg2 - arg4, Static202.anInt4720, Static472.anInt6105);
		for (@Pc(100) int local100 = local37; local100 <= local46; local100++) {
			@Pc(106) int[] local106 = Static104.anIntArrayArray24[local100];
			Static580.method8027(local106, local90, local23, arg1);
			Static580.method8027(local106, local29, local98, arg1);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6448(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static629.method8529(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static644.anInt10532; local30++) {
			@Pc(36) String local36 = Static615.aStringArray41[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static629.method8529(local36);
			if (local36 != null && local36.equals(local25)) {
				Static644.anInt10532--;
				for (@Pc(60) int local60 = local30; local60 < Static644.anInt10532; local60++) {
					Static615.aStringArray41[local60] = Static615.aStringArray41[local60 + 1];
					Static552.aStringArray39[local60] = Static552.aStringArray39[local60 + 1];
					Static228.aStringArray20[local60] = Static228.aStringArray20[local60 + 1];
					Static330.aStringArray27[local60] = Static330.aStringArray27[local60 + 1];
					Static512.aBooleanArray24[local60] = Static512.aBooleanArray24[local60 + 1];
				}
				Static246.anInt5500 = Static244.anInt5487;
				@Pc(117) Class3_Sub26 local117 = Static640.method8636(Static405.aClass344_88, Static403.aClass294_3);
				local117.aClass3_Sub15_Sub1_3.method8448(Static139.method3132(arg0));
				local117.aClass3_Sub15_Sub1_3.method8417(arg0);
				Static472.method5189(local117);
				return;
			}
		}
	}
}
