import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!qq", name = "bb", descriptor = "I")
	public static int anInt5620;

	@OriginalMember(owner = "client!qq", name = "hb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_77 = new Class134("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!qq", name = "A", descriptor = "F")
	public static float aFloat80 = 1024.0F;

	@OriginalMember(owner = "client!qq", name = "G", descriptor = "I")
	public static int anInt5613 = 0;

	@OriginalMember(owner = "client!qq", name = "Z", descriptor = "[Lclient!le;")
	public static final Class2_Sub28[] aClass2_Sub28Array1 = new Class2_Sub28[1024];

	@OriginalMember(owner = "client!qq", name = "gb", descriptor = "Lclient!at;")
	public static Class16 aClass16_17 = null;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIII)V")
	public static void method4450(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub5_Sub11 local8 = Static316.method4316(4, arg1);
		local8.method3098();
		local8.anInt3916 = arg2;
		local8.anInt3911 = arg0;
		local8.anInt3906 = arg3;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "([JII[IB)V")
	public static void method4453(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg2) / 2;
		@Pc(21) int local21 = arg2;
		@Pc(25) long local25 = arg0[local19];
		arg0[local19] = arg0[arg1];
		arg0[arg1] = local25;
		@Pc(39) int local39 = arg3[local19];
		arg3[local19] = arg3[arg1];
		arg3[arg1] = local39;
		@Pc(59) int local59 = ~local25 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg2; local61 < arg1; local61++) {
			if (local25 + (long) (local59 & local61) > arg0[local61]) {
				@Pc(83) long local83 = arg0[local61];
				arg0[local61] = arg0[local21];
				arg0[local21] = local83;
				@Pc(97) int local97 = arg3[local61];
				arg3[local61] = arg3[local21];
				arg3[local21++] = local97;
			}
		}
		arg0[arg1] = arg0[local21];
		arg0[local21] = local25;
		arg3[arg1] = arg3[local21];
		arg3[local21] = local39;
		method4453(arg0, local21 - 1, arg2, arg3);
		method4453(arg0, arg1, local21 + 1, arg3);
	}
}
