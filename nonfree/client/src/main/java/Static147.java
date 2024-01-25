import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "Lclient!ui;")
	public static Class230 aClass230_42;

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "Lclient!kc;")
	public static Class130 aClass130_3;

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "Lclient!tb;")
	public static final Class219 aClass219_3 = new Class219(128);

	@OriginalMember(owner = "client!ht", name = "h", descriptor = "Lclient!sl;")
	public static final Class213 aClass213_11 = new Class213("", 11);

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "Lclient!o;")
	public static final Class169 aClass169_131 = new Class169("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIII)I")
	public static int method2200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static373.aByteArrayArrayArray16[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static373.aByteArrayArrayArray16[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)Z")
	public static boolean method2201() {
		if (Static177.aBoolean120) {
			try {
				if ((Boolean) Static396.method1248(Static341.aClass162_5.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2202(@OriginalArg(1) String arg0) {
		return Static157.method2353(arg0, 10);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!jb;[[BB)V")
	public static void method2203(@OriginalArg(0) Class115_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int local12 = Static306.aByteArrayArray18.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(20) byte[] local20 = arg1[local14];
			if (local20 != null) {
				@Pc(33) int local33 = (Static223.anIntArray480[local14] >> 8) * 64 - Static256.anInt4410;
				@Pc(44) int local44 = (Static223.anIntArray480[local14] & 0xFF) * 64 - Static293.anInt5053;
				Static44.method683();
				arg0.method2464(local33, Static66.aClass164_2, local20, local44, Static257.aClass222Array1);
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BI)V")
	public static void method2204(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static277.aBooleanArray25[arg0]) {
			Static383.aClass230_87.method4959(arg0);
			Static137.aClass117ArrayArray1[arg0] = null;
			Static286.aClass117ArrayArray2[arg0] = null;
			Static277.aBooleanArray25[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(BI)V")
	public static void method2205(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub6_Sub11 local8 = Static295.method4455(arg0, 10);
		local8.method2998();
	}
}
