import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "I")
	public static final int anInt998 = 1338;

	@OriginalMember(owner = "client!cba", name = "h", descriptor = "[[B")
	public static final byte[][] aByteArrayArray1 = new byte[250][];

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(II)Z")
	public static boolean method930(@OriginalArg(0) int arg0) {
		if (arg0 == 6 || arg0 == 59 || arg0 == 20 || arg0 == 53 || arg0 == 1010) {
			return true;
		} else {
			return arg0 == 25 || arg0 == 1007;
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(BLclient!wq;II)V")
	public static void method936(@OriginalArg(1) Class394 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray30 != null) {
			@Pc(13) Class5_Sub28 local13 = new Class5_Sub28();
			local13.aClass394_2 = arg0;
			local13.anObjectArray2 = arg0.anObjectArray30;
			Static497.method7205(local13);
		}
		Static386.aBoolean482 = true;
		Static476.anInt8267 = arg0.anInt10478;
		Static537.anInt10359 = arg0.anInt10502;
		Static54.anInt8558 = arg0.anInt10484;
		Static404.anInt6945 = arg0.anInt10490;
		Static350.anInt6210 = arg1;
		Static669.anInt10434 = arg0.anInt10469;
		Static2.anInt22 = arg2;
		Static609.method8190(arg0);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIBLclient!cb;ZII)V")
	public static void method937(@OriginalArg(0) int arg0, @OriginalArg(3) Class50 arg1, @OriginalArg(6) int arg2) {
		Static30.anInt411 = 0;
		Static332.anInt6016 = arg0;
		Static342.aBoolean452 = false;
		Static464.aClass5_Sub14_Sub4_25 = null;
		Static516.aClass50_76 = arg1;
		Static133.anInt2251 = 2;
		Static643.anInt10179 = arg2;
		Static175.anInt2881 = 1;
	}
}
