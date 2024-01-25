import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static443 {

	@OriginalMember(owner = "client!pda", name = "v", descriptor = "I")
	public static int anInt7617;

	@OriginalMember(owner = "client!pda", name = "F", descriptor = "Lclient!el;")
	public static final Class109 aClass109_163 = new Class109(122, 0);

	@OriginalMember(owner = "client!pda", name = "H", descriptor = "I")
	public static int anInt7613 = 0;

	@OriginalMember(owner = "client!pda", name = "D", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_79 = new Class387(66, 7);

	@OriginalMember(owner = "client!pda", name = "r", descriptor = "Lclient!ni;")
	public static final Class249 aClass249_4 = new Class249("LIVE", 0);

	@OriginalMember(owner = "client!pda", name = "G", descriptor = "I")
	public static int anInt7616 = 0;

	@OriginalMember(owner = "client!pda", name = "t", descriptor = "Lclient!um;")
	public static final Class354 aClass354_17 = new Class354("", 10);

	@OriginalMember(owner = "client!pda", name = "B", descriptor = "Z")
	public static boolean aBoolean588 = false;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIIIIB)V")
	public static void method6563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static637.aClass5_Sub20_31.aClass24_Sub12_4.method3413() != 0 && arg2 != 0 && Static21.anInt322 < 50 && arg4 != -1) {
			Static377.aClass50Array1[Static21.anInt322++] = new Class50((byte) 1, arg4, arg2, arg0, arg3, 0, arg1, (Class8_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IZIII)V")
	public static void method6565(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() == 0) {
			Static511.method6253(false);
		} else {
			Static71.anInt1144 = Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153();
			Static565.method8890(0, true);
		}
		Static675.aBoolean794 = arg1;
		Static11.anInt223 = arg3;
		Static528.anInt8867 = arg2;
		Static629.method8385(arg0);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/io/File;B)[B")
	public static byte[] method6568(@OriginalArg(0) File arg0) {
		return Static269.method4022((int) arg0.length(), arg0);
	}
}
