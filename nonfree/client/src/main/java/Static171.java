import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!jk", name = "O", descriptor = "Lclient!b;")
	public static Class20 aClass20_43;

	@OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
	public static int anInt3000;

	@OriginalMember(owner = "client!jk", name = "M", descriptor = "Lclient!ku;")
	public static final Class139 aClass139_36 = new Class139(8);

	@OriginalMember(owner = "client!jk", name = "R", descriptor = "J")
	public static long aLong117 = 0L;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method2654(@OriginalArg(1) String arg0) {
		if (Static361.aStringArray42 == null) {
			Static323.method4976();
		}
		@Pc(14) String[] local14 = Static63.method1103('\n', arg0);
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			for (@Pc(25) int local25 = Static125.anInt2385; local25 > 0; local25--) {
				Static361.aStringArray42[local25] = Static361.aStringArray42[local25 - 1];
			}
			Static361.aStringArray42[0] = local14[local21];
			if (Static125.anInt2385 < Static361.aStringArray42.length - 1) {
				if (Static319.anInt5444 > 0) {
					Static319.anInt5444++;
				}
				Static125.anInt2385++;
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!ck;B)V")
	public static void method2655(@OriginalArg(0) Class3_Sub5_Sub1 arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static20.anInt242; local12++) {
			@Pc(18) int local18 = Static231.anIntArray441[local12];
			@Pc(22) Class28_Sub1_Sub1_Sub2 local22 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local18];
			@Pc(26) int local26 = arg0.method2739();
			if ((local26 & 0x4) != 0) {
				local26 += arg0.method2739() << 8;
			}
			Static186.method2926(local22, local18, arg0, local26);
		}
	}
}
