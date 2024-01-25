import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
	public static int anInt2930;

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "Lclient!oh;")
	public static Class273 aClass273_3 = null;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "Lclient!ji;")
	public static final Class197 aClass197_10 = new Class197(10, 2, 2, 0);

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray19 = new int[128][128];

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "Lclient!cga;")
	public static final Class60 aClass60_55 = new Class60();

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "Lclient!cga;")
	public static final Class60 aClass60_56 = new Class60();

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2545(@OriginalArg(1) String arg0) {
		return Static376.method5449(arg0, 10);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIBI)V")
	public static void method2547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) Class2_Sub6_Sub12 local18 = Static636.method8647(4, (long) arg3);
		local18.method6239();
		local18.anInt6936 = arg0;
		local18.anInt6938 = arg2;
		local18.anInt6934 = arg1;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
	public static void method2548() {
		Static193.aClass85_21.method1748();
	}
}
