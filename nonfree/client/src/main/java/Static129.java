import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!qe", name = "hb", descriptor = "[I")
	public static int[] anIntArray330;

	@OriginalMember(owner = "client!qe", name = "jb", descriptor = "I")
	public static int anInt3681;

	@OriginalMember(owner = "client!qe", name = "kb", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!qe", name = "Z", descriptor = "Lclient!rc;")
	public static Class66 aClass66_16 = new Class66(500);

	@OriginalMember(owner = "client!qe", name = "bb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_929 = Static8.method128("Cancel");

	@OriginalMember(owner = "client!qe", name = "ab", descriptor = "Lclient!ea;")
	public static Class18 aClass18_928 = aClass18_929;

	@OriginalMember(owner = "client!qe", name = "db", descriptor = "Lclient!ea;")
	public static Class18 aClass18_930 = Static8.method128("<)4col> x");

	@OriginalMember(owner = "client!qe", name = "ib", descriptor = "I")
	public static int anInt3680 = 0;

	@OriginalMember(owner = "client!qe", name = "lb", descriptor = "I")
	public static int anInt3682 = 0;

	@OriginalMember(owner = "client!qe", name = "mb", descriptor = "I")
	public static volatile int anInt3683 = -1;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBI[BLclient!re;[Lclient!fh;)V")
	public static void method2516(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class68 arg3, @OriginalArg(5) Class22[] arg4) {
		@Pc(15) int local15 = -1;
		@Pc(20) Class1_Sub6 local20 = new Class1_Sub6(arg2);
		while (true) {
			@Pc(24) int local24 = local20.method527();
			if (local24 == 0) {
				return;
			}
			@Pc(31) int local31 = 0;
			local15 += local24;
			while (true) {
				@Pc(39) int local39 = local20.method527();
				if (local39 == 0) {
					break;
				}
				local31 += local39 - 1;
				@Pc(54) int local54 = local31 & 0x3F;
				@Pc(60) int local60 = local31 >> 6 & 0x3F;
				@Pc(64) int local64 = local20.method544();
				@Pc(68) int local68 = local31 >> 12;
				@Pc(72) int local72 = local64 >> 2;
				@Pc(76) int local76 = arg0 + local54;
				@Pc(80) int local80 = arg1 + local60;
				@Pc(84) int local84 = local64 & 0x3;
				if (local80 > 0 && local76 > 0 && local80 < 103 && local76 < 103) {
					@Pc(106) Class22 local106 = null;
					@Pc(108) int local108 = local68;
					if ((Static2.aByteArrayArrayArray1[1][local80][local76] & 0x2) == 2) {
						local108 = local68 - 1;
					}
					if (local108 >= 0) {
						local106 = arg4[local108];
					}
					Static119.method2351(local15, local72, local84, local68, arg3, local76, local80, local106);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
	public static void method2517() {
		anIntArray330 = null;
		aClass18_928 = null;
		aClass18_929 = null;
		aClass66_16 = null;
		anIntArray331 = null;
		aClass18_930 = null;
	}
}
