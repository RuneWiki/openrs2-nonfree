import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!ln", name = "K", descriptor = "Lclient!ok;")
	public static Class178 aClass178_67;

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_82 = new Class253(97, 8);

	@OriginalMember(owner = "client!ln", name = "G", descriptor = "I")
	public static final int anInt4064 = 1406;

	@OriginalMember(owner = "client!ln", name = "H", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_90 = new Class55("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!ln", name = "J", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_83 = new Class253(27, 8);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZI)V")
	public static void method3227(@OriginalArg(1) int arg0) {
		Static339.anInt5508 = 3;
		Static54.anInt935 = arg0;
		Static237.anInt4069 = -1;
		Static129.anInt2479 = 100;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIII)V")
	public static void method3228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static268.anIntArrayArray39 != null) {
			Static268.anIntArrayArray39[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static373.aShortArrayArray6 != null) {
			Static373.aShortArrayArray6[arg0][arg1] = (short) arg3;
		}
		if (Static46.aByteArrayArray3 != null) {
			Static46.aByteArrayArray3[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/lang/String;IZLclient!ok;)Lclient!hp;")
	public static Class109 method3229(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class178 arg2) {
		@Pc(10) int local10 = arg2.method3836(arg0);
		if (local10 == -1) {
			return new Class109(0);
		}
		@Pc(24) int[] local24 = arg2.method3819(local10);
		@Pc(30) Class109 local30 = new Class109(local24.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local30.anInt2937 > local37) {
				@Pc(53) Class7_Sub14 local53 = new Class7_Sub14(arg2.method3838(local24[local39++], local10));
				@Pc(57) int local57 = local53.method3938();
				@Pc(61) int local61 = local53.method3943();
				@Pc(65) int local65 = local53.method3981();
				if (!arg1 && local65 == 1) {
					local30.anInt2937--;
				} else {
					local30.anIntArray258[local37] = local57;
					local30.anIntArray259[local37] = local61;
					local37++;
				}
			}
			return local30;
		}
	}
}
