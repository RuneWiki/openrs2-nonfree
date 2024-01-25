import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!sfa", name = "v", descriptor = "Lclient!jd;")
	public static final Class1_Sub20_Sub1 aClass1_Sub20_Sub1_1 = new Class1_Sub20_Sub1(7500);

	@OriginalMember(owner = "client!sfa", name = "J", descriptor = "I")
	public static int anInt8097 = 0;

	@OriginalMember(owner = "client!sfa", name = "L", descriptor = "[I")
	public static final int[] anIntArray537 = new int[3];

	@OriginalMember(owner = "client!sfa", name = "U", descriptor = "[Lclient!cca;")
	public static final Class43[] aClass43Array1 = new Class43[4];

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V")
	public static void method6734() {
		@Pc(7) int local7 = Static60.anInt1505;
		@Pc(9) int[] local9 = Static346.anIntArray413;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class20_Sub2_Sub4_Sub1_Sub1 local19 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local9[local11]];
			if (local19 != null && local19.anInt6463 > 0) {
				local19.anInt6463--;
				if (local19.anInt6463 == 0) {
					local19.aString66 = null;
				}
			}
		}
		for (@Pc(45) int local45 = 0; local45 < anInt8097; local45++) {
			@Pc(52) long local52 = (long) Static542.anIntArray599[local45];
			@Pc(58) Class1_Sub39 local58 = (Class1_Sub39) Static131.aClass356_32.method7796(local52);
			if (local58 != null) {
				@Pc(63) Class20_Sub2_Sub4_Sub1_Sub2 local63 = local58.aClass20_Sub2_Sub4_Sub1_Sub2_2;
				if (local63.anInt6463 > 0) {
					local63.anInt6463--;
					if (local63.anInt6463 == 0) {
						local63.aString66 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "([Lclient!ir;II)V")
	public static void method6736(@OriginalArg(0) Class20_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class20_Sub2 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt8787;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt8787 < local27 + (local29 & 0x1)) {
				@Pc(44) Class20_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method6736(arg0, arg1, local10 - 1);
		method6736(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method6741(@OriginalArg(0) String arg0) {
		return Static456.method6391(arg0, 10);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lclient!io;B)Lclient!tba;")
	public static Class251 method6743(@OriginalArg(0) Class1_Sub20 arg0) {
		@Pc(7) int local7 = arg0.method4426();
		@Pc(14) Class314 local14 = Static303.method7887()[arg0.method4393()];
		@Pc(26) Class103 local26 = Static208.method7270()[arg0.method4393()];
		@Pc(30) int local30 = arg0.method4391();
		@Pc(34) int local34 = arg0.method4391();
		return new Class251(local7, local14, local26, local30, local34);
	}
}
