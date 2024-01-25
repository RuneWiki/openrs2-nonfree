import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!om", name = "z", descriptor = "Lclient!tm;")
	public static Class361 aClass361_6;

	@OriginalMember(owner = "client!om", name = "C", descriptor = "Z")
	public static boolean aBoolean500;

	@OriginalMember(owner = "client!om", name = "E", descriptor = "Lclient!taa;")
	public static final Class352 aClass352_10 = new Class352();

	@OriginalMember(owner = "client!om", name = "D", descriptor = "[I")
	public static final int[] anIntArray552 = new int[32];

	@OriginalMember(owner = "client!om", name = "H", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[100];

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!ha;BZLclient!da;Lclient!hw;Ljava/lang/String;)V")
	public static void method6430(@OriginalArg(0) Class22 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class57 arg2, @OriginalArg(4) Class169 arg3, @OriginalArg(5) String arg4) {
		@Pc(17) boolean local17 = !Static133.aBoolean169 || Static442.method5871();
		if (!local17) {
			return;
		}
		@Pc(42) int local42;
		@Pc(51) int local51;
		if (Static133.aBoolean169 && local17) {
			@Pc(29) Class169 local29 = Static341.aClass169_7;
			@Pc(35) Class57 local35 = arg0.method9353(local29, Static260.aClass361Array1, true);
			local42 = local29.method3652(250, (Class178[]) null, arg4);
			local51 = local29.method3651(local29.anInt4040, (Class178[]) null, 250, arg4);
			@Pc(54) int local54 = aClass361_6.anInt9706;
			@Pc(58) int local58 = local54 + 4;
			local51 += local58 * 2;
			local42 += local58 * 2;
			if (Static663.anInt10168 > local51) {
				local51 = Static663.anInt10168;
			}
			if (local42 < Static495.anInt7880) {
				local42 = Static495.anInt7880;
			}
			@Pc(93) int local93 = Static577.aClass223_12.method5074(local42, Static221.anInt3616) + Static615.anInt9306;
			@Pc(102) int local102 = Static314.aClass352_7.method7803(Static700.anInt10927, local51) + Static659.anInt10099;
			if (Static347.aBoolean360) {
				local93 += Static308.method4570();
				local102 += Static541.method7180();
			}
			arg0.method9363(Static711.aClass361_8, false).method7629(Static549.aClass361_5.anInt9706 + local93, Static549.aClass361_5.anInt9707 + local102, local42 - Static549.aClass361_5.anInt9706 * 2, local51 - Static549.aClass361_5.anInt9707 * 2, 1, 0, 0);
			arg0.method9363(Static549.aClass361_5, true).method7637(local93, local102);
			Static549.aClass361_5.method8282();
			arg0.method9363(Static549.aClass361_5, true).method7637(local93 + local42 - local54, local102);
			Static549.aClass361_5.method8273();
			arg0.method9363(Static549.aClass361_5, true).method7637(local93 + local42 - local54, local51 + (local102 - local54));
			Static549.aClass361_5.method8282();
			arg0.method9363(Static549.aClass361_5, true).method7637(local93, local102 + local51 - local54);
			Static549.aClass361_5.method8273();
			arg0.method9363(aClass361_6, true).method7621(local93, local102 + Static549.aClass361_5.anInt9707, local54, local51 - Static549.aClass361_5.anInt9707 * 2);
			aClass361_6.method8274();
			arg0.method9363(aClass361_6, true).method7621(local93 + Static549.aClass361_5.anInt9706, local102, local42 - Static549.aClass361_5.anInt9706 * 2, local54);
			aClass361_6.method8274();
			arg0.method9363(aClass361_6, true).method7621(local42 + local93 - local54, Static549.aClass361_5.anInt9707 + local102, local54, local51 - Static549.aClass361_5.anInt9707 * 2);
			aClass361_6.method8274();
			arg0.method9363(aClass361_6, true).method7621(local93 + Static549.aClass361_5.anInt9706, local51 + local102 + -local54, local42 - Static549.aClass361_5.anInt9706 * 2, local54);
			aClass361_6.method8274();
			local35.method9135(0, local102 + local58, (int[]) null, 0, Static463.anInt7226 | 0xFF000000, (Class178[]) null, 0, local93 + local58, local51 + -(local58 * 2), -1, arg4, 1, (Class1) null, 1, local42 - local58 * 2);
			Static216.method3227(local102, local42, local51, local93);
		} else {
			local42 = arg3.method3652(250, (Class178[]) null, arg4);
			local51 = arg3.method3647(250, (Class178[]) null, arg4) * 13;
			arg0.aa(6, 6, local42 + 8, 4 + 4 + local51, -16777216, 0);
			arg0.method9403(6, 6, local42 + 8, local51 + 4 + 4, -1, 0);
			arg2.method9135(0, 10, (int[]) null, 0, -1, (Class178[]) null, 0, 10, local51, -1, arg4, 1, (Class1) null, 1, local42);
			Static216.method3227(6, local42 + 8, local51 - -4 + 4, 6);
		}
		if (!arg1) {
			return;
		}
		try {
			if (Static347.aBoolean360) {
				Static627.method8257();
			} else {
				arg0.method9358();
			}
		} catch (@Pc(460) Exception_Sub1 local460) {
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(BI)Z")
	public static boolean method6431(@OriginalArg(1) int arg0) {
		return arg0 == 11 || arg0 == 12 || arg0 == 13;
	}
}
