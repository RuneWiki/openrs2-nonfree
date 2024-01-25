import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ada", name = "f", descriptor = "I")
	public static int anInt148;

	@OriginalMember(owner = "client!ada", name = "s", descriptor = "I")
	public static int anInt159;

	@OriginalMember(owner = "client!ada", name = "h", descriptor = "I")
	public static int anInt150 = -1;

	@OriginalMember(owner = "client!ada", name = "q", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_1 = new Class208(46, 3);

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(III)I")
	public static int method153(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(22) int local22 = (arg0 & 0x7F) * 96 >> 7;
		if (local22 < 2) {
			local22 = 2;
		} else if (local22 > 126) {
			local22 = 126;
		}
		return local22 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!ada", name = "g", descriptor = "(I)V")
	public static void method158() {
		@Pc(7) Class171 local7 = null;
		try {
			@Pc(13) Class328 local13 = Static529.aClass112_6.method3241("2");
			while (local13.anInt9389 == 0) {
				Static179.method3254(1L);
			}
			if (local13.anInt9389 == 1) {
				local7 = (Class171) local13.anObject21;
				@Pc(37) byte[] local37 = new byte[(int) local7.method4935()];
				@Pc(51) int local51;
				for (@Pc(39) int local39 = 0; local39 < local37.length; local39 += local51) {
					local51 = local7.method4930(local37, local39, local37.length - local39);
					if (local51 == -1) {
						throw new IOException("EOF");
					}
				}
				Static212.method3634(new Class6_Sub40(local37));
			}
		} catch (@Pc(76) Exception local76) {
		}
		try {
			if (local7 != null) {
				local7.method4934();
			}
		} catch (@Pc(88) Exception local88) {
		}
	}
}
