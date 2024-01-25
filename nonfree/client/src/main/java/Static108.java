import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "Lclient!mr;")
	public static final Class223 aClass223_12 = new Class223();

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "Lclient!ui;")
	public static final Class339 aClass339_3 = new Class339();

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "[S")
	public static short[] aShortArray26 = new short[256];

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_23 = new Class200(18, 0);

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "[I")
	public static final int[] anIntArray93 = new int[3];

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
	public static void method2177() {
		@Pc(7) Class175 local7 = null;
		try {
			@Pc(13) Class304 local13 = Static205.aClass138_2.method3581("");
			while (local13.anInt8838 == 0) {
				Static258.method4293(1L);
			}
			if (local13.anInt8838 == 1) {
				local7 = (Class175) local13.anObject16;
				@Pc(45) Class3_Sub3 local45 = Static262.aClass3_Sub27_12.method3238();
				local7.method4464(local45.anInt4736, 0, local45.aByteArray54);
			}
		} catch (@Pc(55) Exception local55) {
		}
		try {
			if (local7 != null) {
				local7.method4462();
			}
		} catch (@Pc(62) Exception local62) {
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIILclient!ha;I)V")
	public static void method2179(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class5 arg2) {
		Static398.aClass5_13 = arg2;
		Static72.aClass39_3 = Static398.aClass5_13.method7552();
		Static46.aClass39_2 = Static398.aClass5_13.method7552();
		Static420.aClass39_10 = Static398.aClass5_13.method7552();
		Static440.anInterface8Array1 = null;
		Static505.anInt8728 = 100;
		Static39.anInt1252 = 100;
		Static234.anInt4427 = 0;
		Static194.anIntArray198 = null;
		Static434.method6781(arg0, arg1);
		Static26.anInt961 = -1;
		Static222.anInt4226 = -1;
		Static176.anInt3424 = -1;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZII)Z")
	public static boolean method2180(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
