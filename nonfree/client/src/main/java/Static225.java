import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!hq", name = "L", descriptor = "[Lclient!hk;")
	public static Class155[] aClass155Array12;

	// $FF: synthetic field
	@OriginalMember(owner = "client!hq", name = "N", descriptor = "Ljava/lang/Class;")
	private static Class aClass14;

	@OriginalMember(owner = "client!hq", name = "Q", descriptor = "[I")
	public static final int[] anIntArray193 = new int[4];

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZLclient!wq;)Lclient!jaa;")
	public static Class178 method3571(@OriginalArg(1) Class5_Sub36 arg0) {
		@Pc(7) String local7 = arg0.method7281();
		@Pc(19) Class189 local19 = Static447.method6379()[arg0.method7291()];
		@Pc(26) Class346 local26 = Static378.method5602()[arg0.method7291()];
		@Pc(30) int local30 = arg0.method7303();
		@Pc(34) int local34 = arg0.method7303();
		@Pc(38) int local38 = arg0.method7291();
		@Pc(42) int local42 = arg0.method7291();
		@Pc(46) int local46 = arg0.method7291();
		@Pc(50) int local50 = arg0.method7333();
		@Pc(54) int local54 = arg0.method7333();
		@Pc(64) int local64 = arg0.method7268();
		@Pc(68) int local68 = arg0.method7268();
		@Pc(72) int local72 = arg0.method7268();
		return new Class178(local7, local19, local26, local30, local34, local38, local42, local46, local50, local54, local64, local68, local72);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/io/File;ZB)V")
	public static void method3572(@OriginalArg(0) File arg0) {
		if (Static224.anObject9 == null) {
			Static67.method1110();
		}
		try {
			@Pc(14) Class local14 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(40) Method local40 = local14.getDeclaredMethod("dumpHeap", aClass14 == null ? (aClass14 = Class5_Sub3_Sub17.a("java.lang.String")) : aClass14, Boolean.TYPE);
			local40.invoke(Static224.anObject9, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(67) Exception local67) {
			System.out.println("HeapDump error:");
			local67.printStackTrace();
		}
	}
}
