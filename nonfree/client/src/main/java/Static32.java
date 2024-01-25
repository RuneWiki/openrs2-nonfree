import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
	public static int anInt6037;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
	public static int anInt6040;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_160 = new Class77(103, -1);

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "Z")
	public static boolean aBoolean456 = false;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
	public static int anInt6038 = 0;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_161 = new Class77(68, 3);

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_162 = new Class77(41, 3);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)I")
	public static int method5232(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static336.anIntArray716[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5235(@OriginalArg(0) String arg0) {
		if (Static98.aStringArray12 == null) {
			Static170.method2762();
		}
		@Pc(20) String[] local20 = Static29.method705(arg0, '\n');
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			for (@Pc(26) int local26 = Static214.anInt3953; local26 > 0; local26--) {
				Static98.aStringArray12[local26] = Static98.aStringArray12[local26 - 1];
			}
			Static98.aStringArray12[0] = local20[local22];
			if (Static98.aStringArray12.length - 1 > Static214.anInt3953) {
				if (Static154.anInt2771 > 0) {
					Static154.anInt2771++;
				}
				Static214.anInt3953++;
			}
		}
	}
}
