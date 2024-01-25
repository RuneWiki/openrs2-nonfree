import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!te", name = "G", descriptor = "Lclient!bda;")
	public static final Class21 aClass21_6 = new Class21("WTI", 5);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IBIII[BI[BI)V")
	public static void method6520(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(18) int local18 = -arg0; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg5++;
				arg6[local26] += arg4[arg2++];
				@Pc(38) int local38 = arg5++;
				arg6[local38] += arg4[arg2++];
				@Pc(50) int local50 = arg5++;
				arg6[local50] += arg4[arg2++];
				@Pc(62) int local62 = arg5++;
				arg6[local62] += arg4[arg2++];
			}
			for (@Pc(77) int local77 = local15; local77 < 0; local77++) {
				local26 = arg5++;
				arg6[local26] += arg4[arg2++];
			}
			arg5 += arg3;
			arg2 += arg1;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)V")
	public static void method6521(@OriginalArg(0) boolean arg0) {
		if (Static69.aString12.length() == 0) {
			return;
		}
		Static508.method7026("--> " + Static69.aString12);
		Static314.method4912(Static69.aString12, arg0, false);
		Static69.aString12 = "";
		Static25.anInt547 = 0;
		Static132.anInt2616 = 0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BZ)V")
	public static void method6525(@OriginalArg(1) boolean arg0) {
		Static63.method1142();
		if (!Static64.method1156(Static268.anInt5100)) {
			return;
		}
		Static94.anInt1936++;
		if (Static94.anInt1936 < 50 && !arg0) {
			return;
		}
		Static94.anInt1936 = 0;
		if (!Static229.aBoolean316 && Static402.aClass56_2 != null) {
			Static144.method2331(Static221.aClass296_188);
			try {
				Static402.aClass56_2.method1315(Static455.aClass1_Sub6_Sub2_2.anInt4555, Static455.aClass1_Sub6_Sub2_2.aByteArray66);
				Static455.aClass1_Sub6_Sub2_2.anInt4555 = 0;
			} catch (@Pc(50) IOException local50) {
				Static229.aBoolean316 = true;
			}
		}
		Static63.method1142();
	}
}
