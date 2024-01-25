import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bba", name = "O", descriptor = "I")
	public static int anInt9380;

	@OriginalMember(owner = "client!bba", name = "U", descriptor = "Ljava/lang/Object;")
	public static Object anObject18;

	@OriginalMember(owner = "client!bba", name = "E", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_164 = new Class44(22, 3);

	@OriginalMember(owner = "client!bba", name = "K", descriptor = "Lclient!wv;")
	public static final Class395 aClass395_15 = new Class395(1, 2);

	@OriginalMember(owner = "client!bba", name = "N", descriptor = "I")
	public static int anInt9379 = 500;

	@OriginalMember(owner = "client!bba", name = "T", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_118 = new Class100(14, 7);

	@OriginalMember(owner = "client!bba", name = "V", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!bba", name = "e", descriptor = "(B)V")
	public static void method7752() {
		@Pc(18) Class14_Sub9 local18;
		for (local18 = (Class14_Sub9) Static605.aClass262_69.method6318(); local18 != null; local18 = (Class14_Sub9) Static605.aClass262_69.method6311()) {
			Static611.method8583(local18, false);
		}
		for (local18 = (Class14_Sub9) Static659.aClass262_74.method6318(); local18 != null; local18 = (Class14_Sub9) Static659.aClass262_74.method6311()) {
			Static611.method8583(local18, true);
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(I[[BLclient!rr;)V")
	public static void method7754(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class49_Sub1 arg1) {
		@Pc(17) int[] local17 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20 = arg0.length;
		@Pc(41) int local41;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(28) byte[] local28 = arg0[local22];
			if (local28 != null) {
				@Pc(35) Class14_Sub29 local35 = new Class14_Sub29(local28);
				local41 = Static332.anIntArray455[local22] >> 8;
				@Pc(47) int local47 = Static332.anIntArray455[local22] & 0xFF;
				@Pc(54) int local54 = local41 * 64 - Static329.anInt6225;
				@Pc(61) int local61 = local47 * 64 - Static202.anInt3755;
				Static299.method4404();
				arg1.method7507(Static202.anInt3755, local35, Static226.aClass226Array3, local61, local54, Static329.anInt6225);
				arg1.method7519(local17, local61, Static677.aClass137_47, local35, local54);
				if (!arg1.aBoolean636 && Static100.anInt2131 / 8 == local41 && Static403.anInt7392 / 8 == local47 && local17[0] != -1) {
					Static378.aClass153_1 = Static20.aClass385_31.method9142(local17[2], local17[1], local17[3], local17[0], Static379.aClass250_13);
					Static419.anInt7564 = local17[4];
				}
			}
		}
		for (@Pc(138) int local138 = 0; local138 < local20; local138++) {
			@Pc(151) int local151 = (Static332.anIntArray455[local138] >> 8) * 64 - Static329.anInt6225;
			local41 = (Static332.anIntArray455[local138] & 0xFF) * 64 - Static202.anInt3755;
			@Pc(166) byte[] local166 = arg0[local138];
			if (local166 == null && Static403.anInt7392 < 800) {
				Static299.method4404();
				arg1.method7506(local151, local41);
			}
		}
	}
}
