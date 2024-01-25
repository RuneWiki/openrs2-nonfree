import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!hs", name = "B", descriptor = "I")
	public static int anInt3881;

	@OriginalMember(owner = "client!hs", name = "q", descriptor = "I")
	public static int anInt3872 = 100;

	@OriginalMember(owner = "client!hs", name = "A", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_57 = new Class45("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3598(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(21) int local21 = 0; local21 < local12; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 == '%' && local21 + 2 < local12) {
				local27 = arg0.charAt(local21 + 1);
				@Pc(78) int local78;
				if (local27 >= '0' && local27 <= '9') {
					local78 = local27 - 48;
				} else if (local27 >= 'a' && local27 <= 'f') {
					local78 = local27 + 10 - 97;
				} else {
					if (local27 < 'A' || local27 > 'F') {
						local9.append('%');
						continue;
					}
					local78 = local27 + 10 - 65;
				}
				local78 *= 16;
				local27 = arg0.charAt(local21 + 2);
				if (local27 >= '0' && local27 <= '9') {
					local78 += local27 - 48;
				} else if (local27 >= 'a' && local27 <= 'f') {
					local78 += local27 + 10 - 97;
				} else {
					if (local27 < 'A' || local27 > 'F') {
						local9.append('%');
						continue;
					}
					local78 += local27 + '\n' - 65;
				}
				local21 += 2;
				if (local78 != 0 && Static168.method3192((byte) local78)) {
					local9.append(Static253.method4580((byte) local78));
				}
			} else if (local27 == '+') {
				local9.append(' ');
			} else {
				local9.append(local27);
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IBI)V")
	public static void method3600(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub2_Sub16 local10 = Static422.method6588(7, arg1);
		local10.method6693();
		local10.anInt7487 = arg0;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!md;)I")
	public static int method3601(@OriginalArg(1) Class20_Sub1_Sub1 arg0) {
		if (arg0.anInt9018 == 0) {
			return 0;
		}
		@Pc(68) int local68;
		@Pc(61) int local61;
		if (arg0.anInt9034 != -1) {
			@Pc(23) Class20_Sub1_Sub1 local23 = null;
			if (arg0.anInt9034 < 32768) {
				@Pc(35) Class1_Sub41 local35 = (Class1_Sub41) Static362.aClass230_46.method6144((long) arg0.anInt9034);
				if (local35 != null) {
					local23 = local35.aClass20_Sub1_Sub1_Sub2_2;
				}
			} else if (arg0.anInt9034 >= 32768) {
				local23 = Static511.aClass20_Sub1_Sub1_Sub1Array1[arg0.anInt9034 - 32768];
			}
			if (local23 != null) {
				local61 = arg0.anInt8954 - local23.anInt8954;
				local68 = arg0.anInt8949 - local23.anInt8949;
				if (local61 != 0 || local68 != 0) {
					arg0.method7820((int) (Math.atan2((double) local61, (double) local68) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class20_Sub1_Sub1_Sub1) {
			@Pc(169) Class20_Sub1_Sub1_Sub1 local169 = (Class20_Sub1_Sub1_Sub1) arg0;
			if (local169.anInt657 != -1 && (local169.anInt9035 == 0 || local169.anInt9036 > 0)) {
				local169.method7820(local169.anInt657);
				local169.anInt657 = -1;
			}
		} else if (arg0 instanceof Class20_Sub1_Sub1_Sub2) {
			@Pc(97) Class20_Sub1_Sub1_Sub2 local97 = (Class20_Sub1_Sub1_Sub2) arg0;
			if (local97.anInt9043 != -1 && (local97.anInt9035 == 0 || local97.anInt9036 > 0)) {
				local61 = local97.anInt8954 - (local97.anInt9043 - Static538.anInt9485 - Static538.anInt9485) * 64;
				local68 = local97.anInt8949 - (local97.anInt9050 - Static282.anInt5380 - Static282.anInt5380) * 64;
				if (local61 != 0 || local68 != 0) {
					local97.method7820((int) (Math.atan2((double) local61, (double) local68) * 2607.5945876176133D) & 0x3FFF);
				}
				local97.anInt9043 = -1;
			}
		}
		return arg0.method7809();
	}
}
