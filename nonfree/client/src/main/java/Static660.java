import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static660 {

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_147 = new Class349(22, -1);

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_199 = new Class225(37, -1);

	@OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
	public static int anInt10311 = 0;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;I)V")
	public static void method9034(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class405 local9 = Static98.aClass405Array1[99];
		for (@Pc(18) int local18 = 99; local18 > 0; local18--) {
			Static98.aClass405Array1[local18] = Static98.aClass405Array1[local18 - 1];
		}
		if (local9 == null) {
			local9 = new Class405(arg4, arg7, arg5, arg6, arg3, arg1, arg0, arg2);
		} else {
			local9.method9517(arg3, arg5, arg0, arg2, arg7, arg4, arg1, arg6);
		}
		Static527.anInt8374++;
		Static143.anInt2459 = Static602.anInt10526;
		Static98.aClass405Array1[0] = local9;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!ha;III)V")
	public static void method9035(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static307.aClass264ArrayArray1 = new Class264[arg1][arg2];
		Static587.aClass145_12 = arg0;
		if (Static44.anIntArray54 != null) {
			Static302.aClass74_3 = Static629.method8511(Static44.anIntArray54[0], Static44.anIntArray54[5], Static44.anIntArray54[3], Static44.anIntArray54[2], Static44.anIntArray54[1], Static44.anIntArray54[4]);
		}
		Static682.aClass358_35 = null;
		Static559.aClass264_2 = new Class264();
		Static8.method116();
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBZ)V")
	public static void method9037(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(14) Class2_Sub6_Sub12 local14 = Static636.method8647(21, (long) arg0);
		local14.method6239();
		local14.anInt6936 = arg1 ? 1 : 0;
	}
}
