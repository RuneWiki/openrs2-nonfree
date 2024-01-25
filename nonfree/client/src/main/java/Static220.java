import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!im", name = "g", descriptor = "Lclient!iv;")
	public static final Class162 aClass162_11 = new Class162(7, 17);

	@OriginalMember(owner = "client!im", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[200];

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)Z")
	public static boolean method3589() {
		return Static339.anInt6583 > 0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method3590(@OriginalArg(1) String arg0) {
		return Static393.method6219(arg0);
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V")
	public static void method3591() {
		Static574.anInt10047 = 0;
		Static8.anInt182 = -1;
		Static582.anInt10107 = -1;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!ec;IB)V")
	public static void method3592(@OriginalArg(0) Class1_Sub4_Sub2_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(14) int local14 = 0;
		if (Static106.anInt2418 < arg0.anInt8426) {
			Static443.method6833(arg0);
		} else if (arg0.anInt8413 >= Static106.anInt2418) {
			Static163.method2973(arg0);
		} else {
			Static410.method6486(false, arg0);
			local7 = Static105.anInt2402;
			local14 = Static398.anInt7614;
		}
		if (arg0.anInt9934 < 512 || arg0.anInt9935 < 512 || (Static428.anInt8046 - 1) * 512 <= arg0.anInt9934 || arg0.anInt9935 >= Static119.anInt2717 * 512 - 512) {
			arg0.anInt8413 = 0;
			arg0.anInt8412 = -1;
			arg0.anIntArray459 = null;
			arg0.anInt8403 = -1;
			arg0.anInt8406 = -1;
			local14 = 0;
			local7 = -1;
			arg0.anInt8426 = 0;
			arg0.anInt9934 = arg0.anIntArray463[0] * 512 + arg0.method6925() * 256;
			arg0.anInt9935 = arg0.anIntArray462[0] * 512 + arg0.method6925() * 256;
			arg0.method6938();
		}
		if (arg0 == Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1 && (arg0.anInt9934 < 6144 || arg0.anInt9935 < 6144 || arg0.anInt9934 >= Static428.anInt8046 * 512 - 6144 || (Static119.anInt2717 - 12) * 512 <= arg0.anInt9935)) {
			arg0.anInt8413 = 0;
			local14 = 0;
			arg0.anInt8426 = 0;
			arg0.anIntArray459 = null;
			arg0.anInt8406 = -1;
			arg0.anInt8412 = -1;
			local7 = -1;
			arg0.anInt8403 = -1;
			arg0.anInt9934 = arg0.anIntArray463[0] * 512 + arg0.method6925() * 256;
			arg0.anInt9935 = arg0.anIntArray462[0] * 512 + arg0.method6925() * 256;
			arg0.method6938();
		}
		@Pc(215) int local215 = Static125.method2596(arg0);
		Static149.method2821(arg0);
		Static50.method664(arg0, local7, local215, local14);
		Static74.method1214(local7, arg0);
		Static219.method3588(arg0);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIB)I")
	public static int method3593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = 0;
		while (arg0 > 0) {
			local13 = local13 << 1 | arg1 & 0x1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local13;
	}
}
