import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
	public static int anInt5303 = 0;

	@OriginalMember(owner = "client!ri", name = "D", descriptor = "Lclient!bn;")
	public static Class25 aClass25_28 = new Class25(128);

	@OriginalMember(owner = "client!ri", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString199 = "M";

	@OriginalMember(owner = "client!ri", name = "J", descriptor = "Lclient!bd;")
	public static Class18 aClass18_33 = new Class18();

	@OriginalMember(owner = "client!ri", name = "P", descriptor = "Lclient!er;")
	public static final Class56 aClass56_11 = new Class56();

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V")
	public static void method4725() {
		Static294.aClass11_129.method213();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
	public static void method4726(@OriginalArg(0) int arg0) {
		Static106.anInt2355 = arg0;
		@Pc(13) Class11 local13 = Static328.aClass11_139;
		synchronized (Static328.aClass11_139) {
			Static328.aClass11_139.method213();
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V")
	public static void method4727() {
		Static316.aClass25_15.method685();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		Static273.method4630(0, arg4, arg2, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IBII)I")
	public static int method4730(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static158.aClass114Array2 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg1 >> 7;
		@Pc(20) int local20 = arg2 >> 7;
		if (local16 < 0 || local20 < 0 || Static195.anInt3965 - 1 < local16 || local20 > Static298.anInt5716 - 1) {
			return 0;
		}
		@Pc(45) int local45 = arg0;
		if (arg0 < 3 && (Static108.aByteArrayArrayArray5[1][local16][local20] & 0x2) != 0) {
			local45 = arg0 + 1;
		}
		return Static158.aClass114Array2[local45].method3607(arg1, arg2);
	}
}
