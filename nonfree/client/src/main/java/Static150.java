import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!k", name = "zb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!k", name = "Bb", descriptor = "I")
	public static int anInt3342;

	@OriginalMember(owner = "client!k", name = "Ab", descriptor = "Lclient!bb;")
	public static final Class16 aClass16_15 = new Class16();

	@OriginalMember(owner = "client!k", name = "Cb", descriptor = "[Lclient!bo;")
	public static final Class24[] aClass24Array1 = new Class24[14];

	@OriginalMember(owner = "client!k", name = "Db", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_29 = new Class87(200);

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IJ)V")
	public static void method2988(@OriginalArg(1) long arg0) {
		Static342.aClass1_Sub8_Sub1_7.anInt5182 = 0;
		Static342.aClass1_Sub8_Sub1_7.method4562(21);
		Static342.aClass1_Sub8_Sub1_7.method4560(arg0);
		Static64.anInt1799 = 0;
		Static278.anInt5664 = 0;
		Static292.anInt4644 = -3;
		Static130.anInt2868 = 1;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2991(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static293.method4939(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < Static191.anInt4095; local31++) {
			@Pc(37) String local37 = Static235.aStringArray49[local31];
			if (local37.startsWith("*")) {
				local37 = local37.substring(1);
			}
			local37 = Static293.method4939(local37);
			if (local37 != null && local37.equals(local20)) {
				Static191.anInt4095--;
				for (@Pc(61) int local61 = local31; local61 < Static191.anInt4095; local61++) {
					Static235.aStringArray49[local61] = Static235.aStringArray49[local61 + 1];
					Static58.aStringArray16[local61] = Static58.aStringArray16[local61 + 1];
					Static202.anIntArray385[local61] = Static202.anIntArray385[local61 + 1];
					Static247.aStringArray54[local61] = Static247.aStringArray54[local61 + 1];
					Static22.anIntArray443[local61] = Static22.anIntArray443[local61 + 1];
					Static148.aBooleanArray13[local61] = Static148.aBooleanArray13[local61 + 1];
				}
				Static88.anInt2213 = Static314.anInt6116;
				Static342.aClass1_Sub8_Sub1_7.method3229(10);
				Static342.aClass1_Sub8_Sub1_7.method4562(Static321.method5243(arg0));
				Static342.aClass1_Sub8_Sub1_7.method4531(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!wo;)V")
	public static void method2996(@OriginalArg(1) Class216 arg0) {
		Static152.aClass216_71 = arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
	public static void method3000() {
		@Pc(5) Class87 local5 = Static115.aClass87_23;
		synchronized (Static115.aClass87_23) {
			Static115.aClass87_23.method2477();
		}
	}
}
