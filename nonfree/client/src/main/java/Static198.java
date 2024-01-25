import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "Lclient!ha;")
	public static Class104 aClass104_18;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_183 = new Class305(51, -1);

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "J")
	public static long aLong104 = 20000000L;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIZIZ)Lclient!lw;")
	public static Class1_Sub35 method3755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub35 local7 = new Class1_Sub35();
		local7.anInt5499 = arg3;
		local7.anInt5502 = arg0;
		Static362.aClass230_45.method6139((long) arg1, local7);
		Static529.method8235(arg0);
		@Pc(26) Class91 local26 = Static384.method6156(arg1);
		if (local26 != null) {
			Static243.method4316(local26);
		}
		if (Static447.aClass91_14 != null) {
			Static243.method4316(Static447.aClass91_14);
			Static447.aClass91_14 = null;
		}
		Static503.method5020();
		if (local26 != null) {
			Static64.method1611(local26, !arg2);
		}
		if (!arg2) {
			Static173.method3206(arg0);
		}
		if (!arg2 && Static328.anInt6167 != -1) {
			Static120.method7553(Static328.anInt6167, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IFIIFIIFFLclient!tp;I[BF)V")
	public static void method3757(@OriginalArg(1) float arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) Class157 arg5, @OriginalArg(11) byte[] arg6, @OriginalArg(12) float arg7) {
		for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
			Static538.method8168(arg2, arg6, arg1, arg3, arg0, arg7, local5, arg4, arg5);
			arg1 += 16384;
		}
	}
}
