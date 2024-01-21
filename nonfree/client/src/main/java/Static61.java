import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!g", name = "G", descriptor = "Lclient!ve;")
	public static Class69 aClass69_17;

	@OriginalMember(owner = "client!g", name = "y", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_411 = Static81.method1507(" ");

	@OriginalMember(owner = "client!g", name = "B", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_412 = Static81.method1507("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!g", name = "E", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_413 = Static81.method1507("Benutzen");

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Lclient!le;")
	public static Class1_Sub2_Sub8_Sub2 method1190() {
		@Pc(7) Class1_Sub2_Sub8_Sub2 local7 = new Class1_Sub2_Sub8_Sub2();
		local7.anInt2559 = Static35.anIntArray360[0];
		local7.anInt2563 = Static85.anIntArray288[0];
		local7.anInt2564 = Static83.anInt2001;
		local7.anIntArray202 = Static148.anIntArray279;
		local7.aByteArray24 = Static53.aByteArrayArray5[0];
		local7.anInt2562 = Static153.anIntArray291[0];
		local7.anInt2560 = Static201.anInt4511;
		local7.anInt2561 = Static80.anIntArray164[0];
		Static110.method1908();
		return local7;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void method1192() {
		@Pc(9) int local9 = Static89.anInt2083 >> 7;
		Static66.anInt1655 &= 0x7FF;
		if (Static57.anInt1425 < 128) {
			Static57.anInt1425 = 128;
		}
		if (Static57.anInt1425 > 383) {
			Static57.anInt1425 = 383;
		}
		@Pc(27) int local27 = Static159.anInt3548 >> 7;
		@Pc(33) int local33 = Static37.method699(Static159.anInt3548, Static170.anInt3799, Static89.anInt2083);
		@Pc(35) int local35 = 0;
		@Pc(57) int local57;
		if (local9 > 3 && local27 > 3 && local9 < 100 && local27 < 100) {
			for (local57 = local9 - 4; local57 <= local9 + 4; local57++) {
				for (@Pc(63) int local63 = local27 - 4; local63 <= local27 + 4; local63++) {
					@Pc(67) int local67 = Static170.anInt3799;
					if (local67 < 3 && (Static43.aByteArrayArrayArray3[1][local57][local63] & 0x2) == 2) {
						local67++;
					}
					@Pc(95) int local95 = local33 - Static186.anIntArrayArrayArray2[local67][local57][local63];
					if (local95 > local35) {
						local35 = local95;
					}
				}
			}
		}
		local57 = local35 * 192;
		if (local57 > 98048) {
			local57 = 98048;
		}
		if (local57 < 32768) {
			local57 = 32768;
		}
		if (local57 > Static100.anInt2253) {
			Static100.anInt2253 += (local57 - Static100.anInt2253) / 24;
		} else if (Static100.anInt2253 > local57) {
			Static100.anInt2253 += (local57 - Static100.anInt2253) / 80;
			return;
		}
	}
}
