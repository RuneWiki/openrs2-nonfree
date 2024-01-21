import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!wg", name = "mb", descriptor = "I")
	public static int anInt4475;

	@OriginalMember(owner = "client!wg", name = "T", descriptor = "Lclient!q;")
	public static final Class79 aClass79_12 = new Class79(5);

	@OriginalMember(owner = "client!wg", name = "pb", descriptor = "I")
	public static int anInt4478 = 0;

	@OriginalMember(owner = "client!wg", name = "qb", descriptor = "I")
	public static int anInt4479 = 0;

	@OriginalMember(owner = "client!wg", name = "rb", descriptor = "I")
	public static int anInt4480 = 0;

	@OriginalMember(owner = "client!wg", name = "sb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1530 = Static151.method2243("<col=ffff00>*V");

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBII)I")
	public static int method3138(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 / arg0;
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(22) int local22 = arg0 - 1 & arg2;
		@Pc(27) int local27 = Static146.method2192(local3, local7);
		@Pc(34) int local34 = Static146.method2192(local3 + 1, local7);
		@Pc(40) int local40 = arg1 & arg0 - 1;
		@Pc(47) int local47 = Static146.method2192(local3, local7 + 1);
		@Pc(56) int local56 = Static146.method2192(local3 + 1, local7 - -1);
		@Pc(63) int local63 = Static50.method756(local34, arg0, local27, local22);
		@Pc(70) int local70 = Static50.method756(local56, arg0, local47, local22);
		return Static50.method756(local70, arg0, local63, local40);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!kd;B)V")
	public static void method3140(@OriginalArg(0) Class2_Sub11 arg0) {
		@Pc(12) byte[] local12 = new byte[24];
		if (Static154.aClass9_2 != null) {
			@Pc(26) int local26;
			try {
				Static154.aClass9_2.method221(0L);
				Static154.aClass9_2.method223(local12);
				for (local26 = 0; local26 < 24 && local12[local26] == 0; local26++) {
				}
				if (local26 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(51) Exception local51) {
				for (local26 = 0; local26 < 24; local26++) {
					local12[local26] = -1;
				}
			}
		}
		arg0.method1560(24, local12);
	}
}
