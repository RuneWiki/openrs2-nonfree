import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!hj", name = "J", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_56 = new Class254(72, 7);

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
	public static int anInt2664 = -1;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILclient!ti;)Ljava/lang/String;")
	public static String method2379(@OriginalArg(2) Class1_Sub14 arg0) {
		try {
			@Pc(7) int local7 = arg0.method4521();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt5695 += Static347.aClass217_1.method5119(arg0.aByteArray65, local19, 0, arg0.anInt5695, local7);
			return Static332.method4783(0, local19, local7);
		} catch (@Pc(43) Exception local43) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method2380(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(29) int local29 = (arg0 ? Static42.aClass228_5.anInt6851 : Static42.aClass228_5.anInt6849) + local19;
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(38) Class1_Sub1_Sub5 local38 = Static42.aClass228_5.method5369(local31);
			if (local38.aBoolean75 && local38.method774().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static295.aShortArray83 = null;
					Static255.anInt4373 = -1;
					return;
				}
				if (local11.length <= local13) {
					@Pc(74) short[] local74 = new short[local11.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local13; local76++) {
						local74[local76] = local11[local76];
					}
					local11 = local74;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static255.anInt4373 = local13;
		Static295.aShortArray83 = local11;
		Static54.anInt976 = 0;
		@Pc(113) String[] local113 = new String[Static255.anInt4373];
		for (@Pc(115) int local115 = 0; local115 < Static255.anInt4373; local115++) {
			local113[local115] = Static42.aClass228_5.method5369(local11[local115]).method774();
		}
		Static449.method5975(Static295.aShortArray83, local113);
	}
}
