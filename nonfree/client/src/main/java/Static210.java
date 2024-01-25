import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
	public static int anInt4269;

	@OriginalMember(owner = "client!nj", name = "x", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!nj", name = "z", descriptor = "Z")
	public static boolean aBoolean290;

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "Z")
	public static boolean aBoolean289 = true;

	@OriginalMember(owner = "client!nj", name = "y", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_39 = new Class26(128);

	@OriginalMember(owner = "client!nj", name = "A", descriptor = "[I")
	public static final int[] anIntArray331 = new int[32];

	@OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
	public static int anInt4281 = 0;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!ms;BI)Ljava/lang/String;")
	public static String method3753(@OriginalArg(0) Class137 arg0, @OriginalArg(2) int arg1) {
		if (!Static42.method634(arg0).method4733(arg1) && arg0.anObjectArray16 == null) {
			return null;
		} else if (arg0.aStringArray33 == null || arg1 >= arg0.aStringArray33.length || arg0.aStringArray33[arg1] == null || arg0.aStringArray33[arg1].trim().length() == 0) {
			return Static332.aBoolean414 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray33[arg1];
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	public static void method3757() {
		@Pc(1) Class26 local1 = Static196.aClass26_38;
		synchronized (Static196.aClass26_38) {
			Static196.aClass26_38.method328();
		}
		local1 = Static281.aClass26_51;
		synchronized (Static281.aClass26_51) {
			Static281.aClass26_51.method328();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!kh;)V")
	public static void method3761(@OriginalArg(1) Class11_Sub25 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static27.anInt493; local3++) {
			@Pc(9) int local9 = arg0.method5188();
			@Pc(13) int local13 = arg0.method5187();
			if (local13 == 65535) {
				local13 = -1;
			}
			if (Static80.aClass157_Sub1Array7[local9] != null) {
				Static80.aClass157_Sub1Array7[local9].anInt4794 = local13;
			}
		}
	}
}
