import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
	public static int anInt1421;

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "Lclient!nb;")
	public static Class214 aClass214_1;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_15 = new Class185(82, 8);

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
	public static void method1337(@OriginalArg(1) int arg0) {
		for (@Pc(5) Class6 local5 = Static314.aClass380_23.method8755(); local5 != null; local5 = Static314.aClass380_23.method8752()) {
			if ((local5.aLong278 >> 48 & 0xFFFFL) == (long) arg0) {
				local5.method8792();
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!ha;IIBIILjava/lang/String;)V")
	public static void method1339(@OriginalArg(1) Class5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (Static66.aClass4_8 == null || Static522.aClass4_28 == null) {
			if (Static436.aClass223_98.method5951(Static76.anInt2541) && Static436.aClass223_98.method5951(Static397.anInt7408)) {
				Static66.aClass4_8 = arg0.method6121(Static655.method7892(Static436.aClass223_98, Static76.anInt2541, 0), true);
				@Pc(49) Class331 local49 = Static655.method7892(Static436.aClass223_98, Static397.anInt7408, 0);
				Static522.aClass4_28 = arg0.method6121(local49, true);
				local49.method7898();
				Static635.aClass4_34 = arg0.method6121(local49, true);
			} else {
				arg0.aa(arg3, arg4, arg1, 20, 255 - Static607.anInt10283 << 24 | Static461.anInt8260, 1);
			}
		}
		if (Static66.aClass4_8 != null && Static522.aClass4_28 != null) {
			@Pc(75) int local75 = (arg1 - Static522.aClass4_28.method7697() * 2) / Static66.aClass4_8.method7697();
			for (@Pc(77) int local77 = 0; local77 < local75; local77++) {
				Static66.aClass4_8.method7698(Static522.aClass4_28.method7697() + arg3 + local77 * Static66.aClass4_8.method7697(), arg4);
			}
			Static522.aClass4_28.method7698(arg3, arg4);
			Static635.aClass4_34.method7698(arg3 + arg1 - Static635.aClass4_34.method7697(), arg4);
		}
		Static537.aClass34_12.method8598(arg4 + 14, arg5, Static285.anInt5954 | 0xFF000000, -1, arg3 + 3);
		arg0.aa(arg3, arg4 + 20, arg1, arg2 - 20, -Static607.anInt10283 + 255 << 24 | Static461.anInt8260, 1);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIILclient!oi;II)V")
	public static void method1341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class9_Sub4_Sub2_Sub1 arg2, @OriginalArg(5) int arg3) {
		Static314.method5260(arg1, arg2.anInt10360, arg3, 0, arg2.anInt10357, arg2.aByte135, arg0);
	}
}
