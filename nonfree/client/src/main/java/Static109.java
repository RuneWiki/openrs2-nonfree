import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!gq", name = "B", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!gq", name = "C", descriptor = "[I")
	public static final int[] anIntArray136 = new int[50];

	@OriginalMember(owner = "client!gq", name = "D", descriptor = "J")
	public static long aLong90 = 0L;

	@OriginalMember(owner = "client!gq", name = "I", descriptor = "I")
	public static int anInt2315 = 0;

	@OriginalMember(owner = "client!gq", name = "L", descriptor = "[Lclient!fb;")
	public static final Class3_Sub4[] aClass3_Sub4Array1 = new Class3_Sub4[2048];

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIII)Z")
	public static boolean method1871(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static160.aByteArrayArrayArray9[0][arg2][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static160.aByteArrayArrayArray9[arg1][arg2][arg0] & 0x10) == 0) {
			return Static32.method619(arg2, arg1, arg0) == arg3;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IB)V")
	public static void method1872() {
		@Pc(5) Class198 local5 = Static37.aClass198_60;
		synchronized (Static37.aClass198_60) {
			Static37.aClass198_60.method5243(5);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLclient!ob;Lclient!ob;)V")
	public static void method1874(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		if (arg1.aClass3_247 != null) {
			arg1.method5717();
		}
		arg1.aClass3_247 = arg0.aClass3_247;
		arg1.aClass3_248 = arg0;
		arg1.aClass3_247.aClass3_248 = arg1;
		arg1.aClass3_248.aClass3_247 = arg1;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)I")
	public static int method1875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 >> 31 & arg0 - 1;
		return ((arg1 >>> 31) + arg1) % arg0 + local11;
	}
}
