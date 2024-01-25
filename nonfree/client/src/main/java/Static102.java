import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!gf", name = "Y", descriptor = "I")
	public static int anInt2329;

	@OriginalMember(owner = "client!gf", name = "bb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14;

	@OriginalMember(owner = "client!gf", name = "L", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_67 = new Class119(500);

	@OriginalMember(owner = "client!gf", name = "W", descriptor = "Lclient!sf;")
	public static final Class180 aClass180_1 = new Class180();

	@OriginalMember(owner = "client!gf", name = "X", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_43 = new Class93("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!gf", name = "Z", descriptor = "[I")
	public static final int[] anIntArray217 = new int[250];

	@OriginalMember(owner = "client!gf", name = "ab", descriptor = "I")
	public static int anInt2330 = 0;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(JB)V")
	public static void method2276(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static252.method4575(arg0 - 1L);
			Static252.method4575(1L);
		} else {
			Static252.method4575(arg0);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method2277(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(19) String local19 = arg0[arg1];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(31) int local31 = arg2 + arg1;
			@Pc(33) int local33 = 0;
			for (@Pc(35) int local35 = arg1; local35 < local31; local35++) {
				@Pc(41) String local41 = arg0[local35];
				if (local41 == null) {
					local33 += 4;
				} else {
					local33 += local41.length();
				}
			}
			@Pc(65) StringBuffer local65 = new StringBuffer(local33);
			for (@Pc(67) int local67 = arg1; local67 < local31; local67++) {
				@Pc(73) String local73 = arg0[local67];
				if (local73 == null) {
					local65.append("null");
				} else {
					local65.append(local73);
				}
			}
			return local65.toString();
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(III)V")
	public static void method2280(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17;
		if (Static339.anInt6735 != arg1) {
			Static212.anIntArray325 = new int[arg1];
			for (local17 = 0; local17 < arg1; local17++) {
				Static212.anIntArray325[local17] = (local17 << 12) / arg1;
			}
			Static25.anInt1346 = arg1 - 1;
			Static295.anInt5968 = arg1 * 32;
			Static339.anInt6735 = arg1;
		}
		if (arg0 == Static84.anInt1830) {
			return;
		}
		if (arg0 == Static339.anInt6735) {
			Class208.lb = Static212.anIntArray325;
		} else {
			Class208.lb = new int[arg0];
			for (local17 = 0; local17 < arg0; local17++) {
				Class208.lb[local17] = (local17 << 12) / arg0;
			}
		}
		Static84.anInt1830 = arg0;
		Static285.anInt5782 = arg0 - 1;
	}
}
