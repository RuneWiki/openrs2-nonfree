import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "Lclient!nl;")
	public static Class171 aClass171_75;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "Z")
	public static boolean aBoolean354 = false;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method4185() {
		Static335.anInt5738 = 0;
		for (@Pc(9) int local9 = 0; local9 < 2048; local9++) {
			Static43.aClass2_Sub16Array1[local9] = null;
			Static95.aByteArray114[local9] = 1;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILclient!kk;)Ljava/lang/String;")
	public static String method4187(@OriginalArg(2) Class2_Sub16 arg0) {
		try {
			@Pc(12) int local12 = arg0.method5311();
			if (local12 > 32767) {
				local12 = 32767;
			}
			@Pc(24) byte[] local24 = new byte[local12];
			arg0.anInt6145 += Static383.aClass42_1.method875(0, local12, arg0.aByteArray112, arg0.anInt6145, local24);
			return Static49.method851(local24, local12, 0);
		} catch (@Pc(48) Exception local48) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZBLjava/lang/String;ZLjava/lang/String;IJIIII)V")
	public static void method4192(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) long arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static269.aBoolean349 && Static285.anInt4946 < 500) {
			@Pc(17) int local17 = arg9 == -1 ? Static62.anInt1263 : arg9;
			@Pc(31) Class2_Sub26 local31 = new Class2_Sub26(arg3, arg1, local17, arg6, arg8, arg5, arg4, arg7, arg2, arg0);
			Static195.aClass30_28.method685(local31);
			Static285.anInt4946++;
		}
	}
}
