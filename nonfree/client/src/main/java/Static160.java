import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
	public static int anInt6707;

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
	public static int anInt6708;

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "Lclient!wt;")
	public static final Class268 aClass268_133 = new Class268("", 17);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLclient!oq;)V")
	public static void method5147(@OriginalArg(1) Class20_Sub3_Sub3_Sub1 arg0) {
		@Pc(19) Class1_Sub42 local19 = (Class1_Sub42) Static374.aClass257_29.method5503((long) arg0.anInt6045);
		if (local19 == null) {
			Static62.method970(null, arg0, 0, arg0.anIntArray369[0], null, arg0.anIntArray370[0], arg0.aByte89);
		} else {
			local19.method5165();
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5151(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static330.method4213(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static360.anInt5990; local25++) {
			@Pc(37) String local37 = Static76.aStringArray10[local25];
			if (local37.startsWith("*")) {
				local37 = local37.substring(1);
			}
			local37 = Static330.method4213(local37);
			if (local37 != null && local37.equals(local20)) {
				Static360.anInt5990--;
				for (@Pc(61) int local61 = local25; local61 < Static360.anInt5990; local61++) {
					Static76.aStringArray10[local61] = Static76.aStringArray10[local61 + 1];
					Static43.aStringArray44[local61] = Static43.aStringArray44[local61 + 1];
					Static11.aStringArray1[local61] = Static11.aStringArray1[local61 + 1];
					Static272.aStringArray37[local61] = Static272.aStringArray37[local61 + 1];
					Static304.aBooleanArray23[local61] = Static304.aBooleanArray23[local61 + 1];
				}
				Static136.anInt2311 = Static443.anInt6230;
				Static5.method94(Static121.aClass137_93);
				Static75.aClass1_Sub11_Sub1_1.method4445(Static221.method2944(arg0));
				Static75.aClass1_Sub11_Sub1_1.method4453(arg0);
				return;
			}
		}
	}
}
