import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "Lclient!bs;")
	public static Class20_Sub2_Sub2_Sub1_Sub1 aClass20_Sub2_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
	public static int anInt4131;

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_69 = new Class268(65, 7);

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
	public static int anInt4130 = -1;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIII)V")
	public static void method3605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class6_Sub2_Sub9 local8 = Static144.method2332(8, arg3);
		local8.method3723();
		local8.anInt4294 = arg2;
		local8.anInt4291 = arg1;
		local8.anInt4293 = arg0;
	}
}
