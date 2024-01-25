import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILclient!r;I)Lclient!aga;")
	public static Class13 method2255(@OriginalArg(0) int arg0, @OriginalArg(1) Class12 arg1) {
		@Pc(14) Class281 local14 = Static491.method1540(arg0, true, arg1);
		return local14 == null ? null : local14.aClass13_12;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILclient!io;)Ljava/lang/String;")
	public static String method2256(@OriginalArg(2) Class1_Sub20 arg0) {
		try {
			@Pc(9) int local9 = arg0.method4427();
			if (local9 > 32767) {
				local9 = 32767;
			}
			@Pc(17) byte[] local17 = new byte[local9];
			arg0.anInt5238 += Static254.aClass67_1.method1755(0, local17, local9, arg0.aByteArray52, arg0.anInt5238);
			return Static440.method6212(local17, local9, 0);
		} catch (@Pc(41) Exception local41) {
			return "Cabbage";
		}
	}
}
