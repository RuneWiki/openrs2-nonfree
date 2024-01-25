import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "Lclient!gm;")
	public static Class118 aClass118_1;

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "Lclient!jt;")
	public static final Class166 aClass166_46 = new Class166(64);

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_75 = new Class208(38, 8);

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "Lclient!he;")
	public static final Class128 aClass128_39 = new Class128(16);

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)Z")
	public static boolean method7392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static262.method4656(arg1, arg0) & Static399.method6445(arg0, arg1);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V")
	public static void method7393() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static442.anInt7975; local9++) {
			for (@Pc(15) int local15 = 0; local15 < Static284.anInt7916; local15++) {
				if (Static131.method2131(true, Static272.aClass97ArrayArrayArray3, local15, local9, local7)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZB)C")
	public static char method7395(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(43) char local43 = Static15.aCharArray9[local12 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local12 = local43;
		}
		return (char) local12;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBI)Z")
	public static boolean method7399(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}
}
