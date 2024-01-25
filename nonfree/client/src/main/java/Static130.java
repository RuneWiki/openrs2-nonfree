import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
	public static int anInt2269;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "[Lclient!d;")
	public static final Class1_Sub2_Sub6[] aClass1_Sub2_Sub6Array4 = new Class1_Sub2_Sub6[14];

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V")
	public static void method1888(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4) {
		Static27.method486(arg1, arg4, arg0, null, -1, arg3, arg2);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)V")
	public static void method1889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static184.aByteArrayArrayArray3 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZ)Z")
	public static boolean method1891(@OriginalArg(0) int arg0) {
		if (Static164.aBooleanArray22[arg0]) {
			return true;
		} else if (Static136.aClass250_26.method5649(arg0)) {
			@Pc(28) int local28 = Static136.aClass250_26.method5653(arg0);
			if (local28 == 0) {
				Static164.aBooleanArray22[arg0] = true;
				return true;
			}
			if (Static448.aClass219ArrayArray2[arg0] == null) {
				Static448.aClass219ArrayArray2[arg0] = new Class219[local28];
			}
			for (@Pc(50) int local50 = 0; local50 < local28; local50++) {
				if (Static448.aClass219ArrayArray2[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static136.aClass250_26.method5667(local50, arg0);
					if (local64 != null) {
						@Pc(76) Class219 local76 = Static448.aClass219ArrayArray2[arg0][local50] = new Class219();
						local76.anInt6422 = local50 + (arg0 << 16);
						if (local64[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local76.method5137(new Class1_Sub1(local64));
					}
				}
			}
			Static164.aBooleanArray22[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
