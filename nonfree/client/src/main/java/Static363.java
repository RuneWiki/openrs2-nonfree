import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!pia;B)V")
	public static void method8905(@OriginalArg(0) Class34_Sub8 arg0) {
		arg0.aClass34_Sub1_20 = null;
		@Pc(20) int local20 = arg0.aClass34_Sub6Array1.length;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			arg0.aClass34_Sub6Array1[local22].aBoolean332 = false;
		}
		@Pc(40) Class317[] local40 = Class3_Sub46.aClass317Array1;
		synchronized (Class3_Sub46.aClass317Array1) {
			if (Class3_Sub46.aClass317Array1.length > local20 && Static38.anIntArray31[local20] < 200) {
				Class3_Sub46.aClass317Array1[local20].method6890(arg0);
				@Pc(61) int local61 = Static38.anIntArray31[local20]++;
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IZIIIIII)V")
	public static void method8908(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static336.aClass3_Sub41_18.aClass14_Sub9_4.method2998() != 0 && arg4 != 0 && Static217.anInt10315 < 50 && arg0 != -1) {
			Static2.aClass51Array1[Static217.anInt10315++] = new Class51((byte) 2, arg0, arg4, arg3, arg5, arg2, arg1, (Class34_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZB)C")
	public static char method8911(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(48) char local48 = Static439.aCharArray7[local7 - 128];
			if (local48 == '\u0000') {
				local48 = '?';
			}
			local7 = local48;
		}
		return (char) local7;
	}
}
