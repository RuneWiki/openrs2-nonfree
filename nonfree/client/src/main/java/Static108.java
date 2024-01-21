import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ng", name = "eb", descriptor = "I")
	public static int anInt2798;

	@OriginalMember(owner = "client!ng", name = "ob", descriptor = "Lclient!fd;")
	public static Class7_Sub1 aClass7_Sub1_12;

	@OriginalMember(owner = "client!ng", name = "Y", descriptor = "Z")
	public static boolean aBoolean136 = false;

	@OriginalMember(owner = "client!ng", name = "hb", descriptor = "Lclient!ea;")
	public static Class23 aClass23_11 = new Class23();

	@OriginalMember(owner = "client!ng", name = "jb", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!ng", name = "lb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_903 = Static170.method3101("Connection lost)3");

	@OriginalMember(owner = "client!ng", name = "mb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_904 = aClass28_903;

	@OriginalMember(owner = "client!ng", name = "nb", descriptor = "I")
	public static int anInt2803 = 0;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)V")
	public static void method2204() {
		Static110.aClass63_19.method2344();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class65 local3 = new Class65();
		local3.anInt3171 = arg2 / 128;
		local3.anInt3172 = arg3 / 128;
		local3.anInt3167 = arg4 / 128;
		local3.anInt3161 = arg5 / 128;
		local3.anInt3176 = arg1;
		local3.anInt3163 = arg2;
		local3.anInt3168 = arg3;
		local3.anInt3166 = arg4;
		local3.anInt3175 = arg5;
		local3.anInt3179 = arg6;
		local3.anInt3180 = arg7;
		Static103.aClass65ArrayArray1[arg0][Static103.anIntArray469[arg0]++] = local3;
	}

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "(I)V")
	public static void method2206() {
		if (Static139.aClass48_3 != null) {
			@Pc(7) Class48 local7 = Static139.aClass48_3;
			synchronized (Static139.aClass48_3) {
				Static139.aClass48_3 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "(I)V")
	public static void method2207() {
		aClass28_903 = null;
		aClass7_Sub1_12 = null;
		aClass23_11 = null;
		aClass28_904 = null;
	}
}
