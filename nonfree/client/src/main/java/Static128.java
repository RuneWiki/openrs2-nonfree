import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!w", name = "o", descriptor = "[I")
	public static int[] anIntArray362;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1760 = Static28.method504("Error loading your profile)3");

	@OriginalMember(owner = "client!w", name = "a", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1759 = aClass39_1760;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "[I")
	public static int[] anIntArray361 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!w", name = "d", descriptor = "I")
	public static volatile int anInt3141 = -1;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1763 = Static28.method504("Bad session id)3");

	@OriginalMember(owner = "client!w", name = "f", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1761 = aClass39_1763;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1762 = Static28.method504("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!w", name = "i", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1764 = Static28.method504("gelb:");

	@OriginalMember(owner = "client!w", name = "j", descriptor = "I")
	public static int anInt3143 = 0;

	@OriginalMember(owner = "client!w", name = "m", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1765 = Static28.method504("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!w", name = "n", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1766 = Static28.method504("http:)4)4");

	@OriginalMember(owner = "client!w", name = "p", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1767 = Static28.method504("");

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BILclient!ja;)V")
	public static void method2179(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1) {
		Static114.aClass4_Sub16_Sub1_3.method1499(85);
		Static114.aClass4_Sub16_Sub1_3.method1442(arg0);
		Static114.aClass4_Sub16_Sub1_3.method1443(arg1.method941());
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!pd;Lclient!pd;Z)V")
	public static void method2180(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1) {
		Static127.aClass20_61 = arg0;
		Static14.aClass20_9 = arg1;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	public static void method2181() {
		aClass39_1766 = null;
		aClass39_1765 = null;
		aClass39_1763 = null;
		aClass39_1764 = null;
		aClass39_1760 = null;
		aClass39_1767 = null;
		aClass39_1762 = null;
		aClass39_1761 = null;
		aClass39_1759 = null;
		anIntArray362 = null;
		anIntArray361 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I[B[Lclient!we;ZILclient!ka;)V")
	public static void method2182(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class81[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class43 arg4) {
		@Pc(17) Class4_Sub16 local17 = new Class4_Sub16(arg1);
		@Pc(19) int local19 = -1;
		while (true) {
			@Pc(23) int local23 = local17.method1450();
			if (local23 == 0) {
				return;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local17.method1450();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(50) int local50 = local31 & 0x3F;
				@Pc(56) int local56 = local31 >> 6 & 0x3F;
				@Pc(60) int local60 = local31 >> 12;
				@Pc(64) int local64 = local17.method1474();
				@Pc(68) int local68 = local64 & 0x3;
				@Pc(72) int local72 = arg3 + local56;
				@Pc(76) int local76 = arg0 + local50;
				@Pc(80) int local80 = local64 >> 2;
				if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
					@Pc(100) int local100 = local60;
					@Pc(102) Class81 local102 = null;
					if ((Static131.aByteArrayArrayArray7[1][local72][local76] & 0x2) == 2) {
						local100 = local60 - 1;
					}
					if (local100 >= 0) {
						local102 = arg2[local100];
					}
					Static23.method430(local60, local102, local76, local72, local68, local19, arg4, local80);
				}
			}
		}
	}
}
