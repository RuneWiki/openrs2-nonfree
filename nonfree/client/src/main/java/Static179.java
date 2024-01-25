import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
	public static int anInt3379;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	public static void method3120(@OriginalArg(0) int arg0) {
		if (Static605.aClass5_Sub55_3 == null || (arg0 < 0 || Static605.aClass5_Sub55_3.anInt10883 <= arg0)) {
			return;
		}
		@Pc(31) Class395 local31 = Static605.aClass5_Sub55_3.aClass395Array1[arg0];
		if (local31.aByte147 != -1) {
			return;
		}
		@Pc(40) Class389 local40 = Static120.method1769(false);
		@Pc(46) Class5_Sub41 local46 = Static647.method8905(Static25.aClass381_13, local40.aClass393_2);
		local46.aClass5_Sub36_Sub2_1.method7324(Static271.method4453(local31.aString120) + 2);
		local46.aClass5_Sub36_Sub2_1.method7296(arg0);
		local46.aClass5_Sub36_Sub2_1.method7327(local31.aString120);
		local40.method9079(local46);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BILclient!oe;)V")
	public static void method3121(@OriginalArg(1) int arg0, @OriginalArg(2) Class264 arg1) {
		if (Static65.anInt1087 >= 50 || (arg1 == null || arg1.anIntArrayArray46 == null || arg1.anIntArrayArray46.length <= arg0 || arg1.anIntArrayArray46[arg0] == null)) {
			return;
		}
		@Pc(38) int local38 = arg1.anIntArrayArray46[arg0][0];
		@Pc(42) int local42 = local38 >> 8;
		@Pc(48) int local48 = local38 >> 5 & 0x7;
		if (arg1.anIntArrayArray46[arg0].length > 1) {
			@Pc(67) int local67 = (int) (Math.random() * (double) arg1.anIntArrayArray46[arg0].length);
			if (local67 > 0) {
				local42 = arg1.anIntArrayArray46[arg0][local67];
			}
		}
		@Pc(89) int local89 = 256;
		if (arg1.anIntArray424 != null && arg1.anIntArray421 != null) {
			local89 = Static629.method8579(arg1.anIntArray424[arg0], arg1.anIntArray421[arg0]);
		}
		if (arg1.aBoolean469) {
			Static152.method2787(local48, local89, local42, 0, 255, false);
		} else {
			Static649.method8959(255, local89, local48, 0, local42);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public static void method3122() {
		Static445.aClass5_Sub4_Sub2_6.method1799();
		Static27.aClass5_Sub4_Sub2_1 = null;
		Static310.anInt5335 = 1;
		Static342.aClass126_159 = null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method3123(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(10) Class389 local10 = Static120.method1769(false);
		@Pc(25) Class5_Sub41 local25 = Static647.method8905(Static678.aClass381_275, local10.aClass393_2);
		local25.aClass5_Sub36_Sub2_1.method7324(Static271.method4453(arg1) + 1);
		local25.aClass5_Sub36_Sub2_1.method7324(arg0);
		local25.aClass5_Sub36_Sub2_1.method7327(arg1);
		local10.method9079(local25);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZ)V")
	public static void method3125(@OriginalArg(1) boolean arg0) {
		Static455.method6423();
		if (!Static372.method5547(Static652.anInt10664)) {
			return;
		}
		@Pc(24) Class389[] local24 = Static4.aClass389Array8;
		for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
			@Pc(32) Class389 local32 = local24[local26];
			local32.anInt10760++;
			if (local32.anInt10760 < 50 && !arg0) {
				return;
			}
			local32.anInt10760 = 0;
			if (!local32.aBoolean759 && local32.aClass50_2 != null) {
				@Pc(71) Class5_Sub41 local71 = Static647.method8905(Static510.aClass381_211, local32.aClass393_2);
				local32.method9079(local71);
				try {
					local32.method9078(121);
				} catch (@Pc(80) IOException local80) {
					local32.aBoolean759 = true;
				}
			}
		}
		Static455.method6423();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[B)Ljava/lang/String;")
	public static String method3126(@OriginalArg(1) byte[] arg0) {
		return Static262.method4274(arg0, 0, arg0.length);
	}
}
