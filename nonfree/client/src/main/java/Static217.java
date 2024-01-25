import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!kn", name = "L", descriptor = "Z")
	private static boolean aBoolean68;

	@OriginalMember(owner = "client!kn", name = "M", descriptor = "I")
	private static int anInt1041;

	@OriginalMember(owner = "client!kn", name = "N", descriptor = "I")
	private static int anInt1042;

	@OriginalMember(owner = "client!kn", name = "O", descriptor = "Z")
	private static boolean aBoolean69;

	@OriginalMember(owner = "client!kn", name = "x", descriptor = "Lclient!pa;")
	public static final Class183 aClass183_6 = new Class183(2, 4);

	@OriginalMember(owner = "client!kn", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString10 = "";

	@OriginalMember(owner = "client!kn", name = "J", descriptor = "Lclient!pa;")
	public static final Class183 aClass183_7 = new Class183(0, 17);

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(ZI)Lclient!ou;")
	public static Class23_Sub5 method1031(@OriginalArg(1) int arg0) {
		@Pc(7) Class194[] local7 = Class23.aClass194Array12;
		synchronized (Class23.aClass194Array12) {
			@Pc(32) Class23_Sub5 local32;
			if (arg0 >= Class23.aClass194Array12.length || Class23.aClass194Array12[arg0].method4576()) {
				local32 = new Class23_Sub5();
				local32.aClass23_Sub6Array1 = new Class23_Sub6[arg0];
				for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
					local32.aClass23_Sub6Array1[local38] = new Class23_Sub6();
				}
			} else {
				local32 = (Class23_Sub5) Class23.aClass194Array12[arg0].method4578();
				local32.method5853();
				@Pc(67) int local67 = Static112.anIntArray98[arg0]--;
			}
			return local32;
		}
	}

	@OriginalMember(owner = "client!kn", name = "providesignlink", descriptor = "(Lclient!dq;)V")
	public static void method1039(@OriginalArg(0) Class51 arg0) {
		Static32.aClass51_1 = arg0;
		Static106.aClass51_5 = arg0;
	}
}
