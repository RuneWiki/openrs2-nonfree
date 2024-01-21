import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
	public static int anInt3103 = 0;

	@OriginalMember(owner = "client!rf", name = "Y", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1367 = Static51.method932("<)4col>");

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([BIII[Lclient!fh;IIIII)V")
	public static void method2216(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class27[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (local7 + arg3 > 0 && local7 + arg3 < 103 && arg5 + local11 > 0 && local11 + arg5 < 103) {
					arg4[arg8].anIntArrayArray16[local7 + arg3][arg5 + local11] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(80) Class2_Sub11 local80 = new Class2_Sub11(arg0);
		for (@Pc(82) int local82 = 0; local82 < 4; local82++) {
			for (@Pc(86) int local86 = 0; local86 < 64; local86++) {
				for (@Pc(90) int local90 = 0; local90 < 64; local90++) {
					if (local82 == arg1 && local86 >= arg2 && local86 < arg2 + 8 && arg6 <= local90 && arg6 + 8 > local90) {
						Static93.method1564(arg8, arg3 + Static9.method164(arg7, local90 & 0x7, local86 & 0x7), local80, 0, Static90.method1524(arg7, local86 & 0x7, local90 & 0x7) + arg5, arg7, 0);
					} else {
						Static93.method1564(0, -1, local80, 0, -1, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V")
	public static void method2217() {
		aClass10_1367 = null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!va;I)Lclient!ha;")
	public static Class2_Sub2 method2218(@OriginalArg(0) Class2_Sub11 arg0) {
		@Pc(9) int local9 = arg0.method1461();
		@Pc(13) int local13 = arg0.method1461();
		@Pc(17) Class local17 = Static90.method1525(local13);
		try {
			@Pc(26) Class2_Sub2 local26 = (Class2_Sub2) local17.getDeclaredConstructor().newInstance();
			if (local26 != null) {
				local26.anInt3643 = local9;
				local26.anInt3630 = arg0.method1461();
				@Pc(40) int local40 = arg0.method1461();
				for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
					@Pc(48) int local48 = arg0.method1461();
					local26.method2580(local48, arg0);
				}
			}
			local26.method2574();
			return local26;
		} catch (@Pc(63) IllegalAccessException local63) {
			throw new RuntimeException();
		} catch (@Pc(68) InstantiationException local68) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
	public static void method2219() {
		Static113.aBoolean113 = true;
		Static170.aBoolean163 = true;
	}
}
