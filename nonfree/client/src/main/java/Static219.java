import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!q", name = "f", descriptor = "Lclient!rn;")
	public static Class155 aClass155_90;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "I")
	public static int anInt4296 = 0;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "Lclient!fk;")
	public static Class56 aClass56_21 = new Class56();

	@OriginalMember(owner = "client!q", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray29 = null;

	@OriginalMember(owner = "client!q", name = "h", descriptor = "S")
	public static short aShort37 = 1;

	@OriginalMember(owner = "client!q", name = "i", descriptor = "Z")
	public static boolean aBoolean308 = false;

	@OriginalMember(owner = "client!q", name = "j", descriptor = "[S")
	public static short[] aShortArray77 = new short[256];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IZI)V")
	public static void method3604(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static229.anIntArray496[arg1] = arg0;
		@Pc(18) Class3_Sub32 local18 = (Class3_Sub32) Static187.aClass30_20.method663((long) arg1);
		if (local18 == null) {
			local18 = new Class3_Sub32(4611686018427387905L);
			Static187.aClass30_20.method668(local18, (long) arg1);
		} else if (local18.aLong242 != 4611686018427387905L) {
			local18.aLong242 = Static128.method2196() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILclient!rn;Lclient!rn;Z)Lclient!bi;")
	public static Class3_Sub4_Sub2 method3606(@OriginalArg(0) int arg0, @OriginalArg(2) Class155 arg1, @OriginalArg(3) Class155 arg2) {
		return Static115.method1878(0, arg2, arg0) ? Static66.method1030(arg1.method4121(arg0, 0)) : null;
	}
}
