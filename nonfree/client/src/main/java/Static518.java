import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!vm", name = "E", descriptor = "Lclient!qaa;")
	public static Class241 aClass241_1;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method7128(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(29) int local29 = (arg1 ? Static166.aClass278_2.anInt7947 : Static166.aClass278_2.anInt7948) + local19;
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(38) Class5_Sub2_Sub10 local38 = Static166.aClass278_2.method6455(local31);
			if (local38.aBoolean139 && local38.method2003().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static273.anInt5367 = -1;
					Static235.aShortArray46 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(67) short[] local67 = new short[local11.length * 2];
					for (@Pc(69) int local69 = 0; local69 < local13; local69++) {
						local67[local69] = local11[local69];
					}
					local11 = local67;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static235.aShortArray46 = local11;
		Static265.anInt5240 = 0;
		Static273.anInt5367 = local13;
		@Pc(107) String[] local107 = new String[Static273.anInt5367];
		for (@Pc(109) int local109 = 0; local109 < Static273.anInt5367; local109++) {
			local107[local109] = Static166.aClass278_2.method6455(local11[local109]).method2003();
		}
		Static306.method4963(Static235.aShortArray46, local107);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[BII)I")
	public static int method7133(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg2; local14 < arg0; local14++) {
			local7 = local7 >>> 8 ^ OutputStream_Sub2.anIntArray404[(arg1[local14] ^ local7) & 0xFF];
		}
		return ~local7;
	}
}
