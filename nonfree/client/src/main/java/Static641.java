import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static641 {

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
	public static int anInt10142;

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "F")
	public static float aFloat199;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIBLclient!uu;IZLclient!aea;)V")
	public static void method8590(@OriginalArg(1) int arg0, @OriginalArg(3) Class343 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class3_Sub3_Sub1 arg3) {
		Static471.method6966(arg2, arg1, arg0);
		Static522.aClass3_Sub3_Sub1_4 = arg3;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
	public static void method8591() {
		if (Static313.anInt6065 != -1) {
			Static379.method5972(Static313.anInt6065, -1, false, -1);
			Static313.anInt6065 = -1;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IB[BI)[B")
	public static byte[] method8592(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static651.method749(arg1, arg0, local6, 0, 32768);
		return local6;
	}
}
