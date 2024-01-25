import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!de", name = "j", descriptor = "I")
	public static int anInt1441;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "I")
	public static int anInt1443;

	@OriginalMember(owner = "client!de", name = "m", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Lclient!tt;")
	public static Class221 aClass221_2;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "I")
	public static int anInt1440 = 0;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "Lclient!pr;")
	public static final Class187 aClass187_1 = new Class187();

	@OriginalMember(owner = "client!de", name = "n", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_28 = new Class208(87, 17);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIZI)I")
	public static int method1179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg2 >>= 0x4;
		} else if (arg0 > 217) {
			arg2 >>= 0x3;
		} else if (arg0 > 192) {
			arg2 >>= 0x2;
		} else if (arg0 > 179) {
			arg2 >>= 0x1;
		}
		return (arg2 >> 5 << 7) + ((arg1 >> 2 & 0x3F) << 10) + (arg0 >> 1);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
	public static void method1181() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static89.anInt1891; local9++) {
			for (@Pc(18) int local18 = 0; local18 < Static85.anInt1839; local18++) {
				if (Static190.method3482(Static45.aClass188ArrayArrayArray5, local9, true, local18, local7)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
