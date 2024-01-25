import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!pe", name = "M", descriptor = "Z")
	public static boolean aBoolean362;

	@OriginalMember(owner = "client!pe", name = "Q", descriptor = "[Lclient!ae;")
	public static Class4[] aClass4Array15;

	@OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
	public static int anInt4853 = -1;

	@OriginalMember(owner = "client!pe", name = "N", descriptor = "Lclient!ig;")
	public static final Class89 aClass89_6 = new Class89();

	@OriginalMember(owner = "client!pe", name = "O", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_164 = new Class18(15, 3);

	@OriginalMember(owner = "client!pe", name = "P", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_128 = new Class21(2);

	@OriginalMember(owner = "client!pe", name = "R", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[100];

	@OriginalMember(owner = "client!pe", name = "S", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!pe", name = "T", descriptor = "Z")
	public static boolean aBoolean363 = true;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
	public static void method4426() {
		Static301.aClass21_154.method857();
	}

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "(B)V")
	public static void method4427() {
		@Pc(1) Class21 local1 = Static102.aClass21_181;
		synchronized (Static102.aClass21_181) {
			Static102.aClass21_181.method851();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIII)V")
	public static void method4428(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 >= Static93.anInt5014 && Static122.anInt1360 >= arg3 && Static131.anInt2843 <= arg2 && Static38.anInt945 >= arg0) {
			Static72.method1601(arg0, arg1, arg4, arg2, arg3);
		} else {
			Static246.method6012(arg0, arg2, arg4, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIBI)V")
	public static void method4430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (Static272.method4850(arg0)) {
			Static22.method5878(arg1, arg3, arg4, arg2, arg5, arg6, Static341.aClass112ArrayArray1[arg0], -1, arg7);
		} else if (arg7 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static207.aBooleanArray21[local19] = true;
			}
		} else {
			Static207.aBooleanArray21[arg7] = true;
		}
	}
}
