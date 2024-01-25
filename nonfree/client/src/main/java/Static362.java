import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
	public static int anInt5836;

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_91 = new Class142("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
	public static int anInt5840 = 0;

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "J")
	public static long aLong193 = 0L;

	@OriginalMember(owner = "client!rp", name = "o", descriptor = "Lclient!nh;")
	public static final Class170 aClass170_7 = new Class170("WTQA", 2);

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method4704(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(29) int local29 = (arg0 ? Static187.aClass13_2.anInt180 : Static187.aClass13_2.anInt181) + local19;
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(38) Class1_Sub3_Sub10 local38 = Static187.aClass13_2.method198(local31);
			if (local38.aBoolean274 && local38.method2180().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static86.anInt7441 = -1;
					Static376.aShortArray104 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(68) short[] local68 = new short[local11.length * 2];
					for (@Pc(70) int local70 = 0; local70 < local13; local70++) {
						local68[local70] = local11[local70];
					}
					local11 = local68;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static376.aShortArray104 = local11;
		Static86.anInt7441 = local13;
		Static257.anInt4526 = 0;
		@Pc(112) String[] local112 = new String[Static86.anInt7441];
		for (@Pc(114) int local114 = 0; local114 < Static86.anInt7441; local114++) {
			local112[local114] = Static187.aClass13_2.method198(local11[local114]).method2180();
		}
		Static166.method2177(Static376.aShortArray104, local112);
	}
}
