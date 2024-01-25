import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!de", name = "k", descriptor = "I")
	public static int anInt1480;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Lclient!s;")
	public static final Class217 aClass217_37 = new Class217(22, 0);

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString10 = null;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "[I")
	public static final int[] anIntArray110 = new int[1];

	@OriginalMember(owner = "client!de", name = "i", descriptor = "I")
	public static int anInt1479 = 0;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "Lclient!mf;")
	public static final Class163 aClass163_13 = new Class163();

	@OriginalMember(owner = "client!de", name = "l", descriptor = "Lclient!mf;")
	public static final Class163 aClass163_14 = new Class163();

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!nn;)V")
	public static void method1358(@OriginalArg(1) Class10_Sub8 arg0) {
		if (arg0.aByteArray44.length - arg0.anInt2989 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method2502();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray44.length - arg0.anInt2989 < 2) {
			return;
		}
		@Pc(44) int local44 = arg0.method2485();
		if (arg0.aByteArray44.length - arg0.anInt2989 < local44 * 6) {
			return;
		}
		for (@Pc(57) int local57 = 0; local57 < local44; local57++) {
			@Pc(63) int local63 = arg0.method2485();
			@Pc(67) int local67 = arg0.method2459();
			if (local63 < Static136.anIntArray282.length && Static156.aBooleanArray7[local63] && (Static334.aClass202_1.method4516(local63).aChar3 != '1' || local67 >= -1 && local67 <= 1)) {
				Static136.anIntArray282[local63] = local67;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IC)Z")
	public static boolean method1359(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!ph;)V")
	public static void method1361(@OriginalArg(1) Class187 arg0) {
		Static343.anInt5846 = arg0.method4278("titlebg");
		Static217.anInt4139 = arg0.method4278("logo");
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZII)I")
	public static int method1362(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static12.anIntArray13[arg0 & 0x3] : 256;
	}
}
