import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!pr", name = "S", descriptor = "[Z")
	public static boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!pr", name = "J", descriptor = "Lclient!o;")
	public static final Class169 aClass169_260 = new Class169("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!pr", name = "P", descriptor = "[I")
	public static int[] anIntArray586 = new int[2];

	@OriginalMember(owner = "client!pr", name = "Q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray69 = new String[100];

	@OriginalMember(owner = "client!pr", name = "R", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!pr", name = "V", descriptor = "I")
	public static int anInt4833 = 0;

	@OriginalMember(owner = "client!pr", name = "X", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[100];

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZI)V")
	public static void method4252() {
		Static177.method1119(Static357.aClass48_213);
		for (@Pc(17) Class1_Sub38 local17 = (Class1_Sub38) Static22.aClass77_29.method1359(); local17 != null; local17 = (Class1_Sub38) Static22.aClass77_29.method1360()) {
			if (!local17.method5576()) {
				local17 = (Class1_Sub38) Static22.aClass77_29.method1359();
				if (local17 == null) {
					break;
				}
			}
			if (local17.anInt5052 == 0) {
				Static229.method3190(true, local17, true);
			}
		}
		if (Static363.aClass117_17 != null) {
			Static312.method4635(Static363.aClass117_17);
			Static363.aClass117_17 = null;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZLjava/lang/Object;B)[B")
	public static byte[] method4253(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static368.method5118(local13) : local13;
		} else if (arg1 instanceof Class71) {
			@Pc(27) Class71 local27 = (Class71) arg1;
			return local27.method1327();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(II)Lclient!cj;")
	public static Class41_Sub1 method4255(@OriginalArg(0) int arg0) {
		@Pc(13) Class208[] local13 = Class1_Sub6_Sub13.aClass208Array1;
		synchronized (Class1_Sub6_Sub13.aClass208Array1) {
			@Pc(32) Class41_Sub1 local32;
			if (arg0 >= Class1_Sub6_Sub13.aClass208Array1.length || Class1_Sub6_Sub13.aClass208Array1[arg0].method4659()) {
				local32 = new Class41_Sub1();
				local32.aClass41_Sub5Array1 = new Class41_Sub5[arg0];
				for (@Pc(54) int local54 = 0; local54 < arg0; local54++) {
					local32.aClass41_Sub5Array1[local54] = new Class41_Sub5();
				}
			} else {
				local32 = (Class41_Sub1) Class1_Sub6_Sub13.aClass208Array1[arg0].method4662();
				local32.method5475();
				@Pc(39) int local39 = Static262.anIntArray742[arg0]--;
			}
			return local32;
		}
	}
}
