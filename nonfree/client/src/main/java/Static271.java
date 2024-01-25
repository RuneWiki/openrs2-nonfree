import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "[I")
	public static final int[] anIntArray410 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZLclient!mg;)I")
	public static int method4023(@OriginalArg(1) Class160 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method3716(Static353.anInt5979)) {
			local10++;
		}
		if (arg0.method3716(Static367.anInt6303)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IILclient!si;)Ljava/lang/String;")
	public static String method4024(@OriginalArg(2) Class2_Sub23 arg0) {
		try {
			@Pc(7) int local7 = arg0.method5479();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt6952 += Static391.aClass157_3.method3607(arg0.anInt6952, 0, local7, local15, arg0.aByteArray130);
			return Static148.method2444(local15, local7, 0);
		} catch (@Pc(44) Exception local44) {
			return "Cabbage";
		}
	}
}
