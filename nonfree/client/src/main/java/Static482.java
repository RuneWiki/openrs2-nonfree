import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
	public static int anInt8389;

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
	public static int anInt8390;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "[F")
	public static final float[] aFloatArray72 = new float[4];

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "Lclient!af;")
	public static final Class9 aClass9_4 = new Class9();

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public static void method7191() {
		Static334.aClass280_27.method7100();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)I")
	public static int method7192(@OriginalArg(1) boolean arg0) {
		if (Static307.anIntArray298 == null) {
			return 0;
		} else if (arg0 || Static151.aClass95Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < Static307.anIntArray298.length; local22++) {
				@Pc(34) int local34 = Static307.anIntArray298[local22];
				if (Static592.aClass196_123.method5111(local34)) {
					local20++;
				}
				if (Static303.aClass196_59.method5111(local34)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static307.anIntArray298.length * 2;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!qk;)V")
	public static void method7193(@OriginalArg(1) Class279 arg0) {
		if (arg0.anInt8208 == Static174.anInt3395) {
			Static477.aBooleanArray21[arg0.anInt8215] = true;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
	public static void method7194() {
		@Pc(8) Class3_Sub31 local8 = (Class3_Sub31) Static537.aClass223_58.method5874();
		@Pc(19) boolean local19 = Static608.aClass279_18 != null || Static242.anInt4494 > 0;
		@Pc(23) int local23 = local8.method6921();
		@Pc(27) int local27 = local8.method6924();
		if (local19) {
			Static564.anInt9411 = 1;
		}
		if (local19) {
			Static639.aClass3_Sub4_Sub13_4 = Static203.aClass3_Sub4_Sub13_1;
		} else {
			Static517.method7721(local27, local23, Static203.aClass3_Sub4_Sub13_1);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method7195(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			@Pc(17) Class3_Sub14 local17 = Static139.method2308(Static529.aClass130_118, Static24.aClass233_1);
			local17.aClass3_Sub3_Sub2_2.method4220(Static161.method2888(arg0));
			local17.aClass3_Sub3_Sub2_2.method4241(arg0);
			Static562.method8096(local17);
		}
	}
}
