import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
	public static int anInt7274;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Lclient!ss;")
	public static Class219 aClass219_18 = null;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "Lclient!qo;")
	public static final Class190 aClass190_9 = new Class190("", 14);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)I")
	public static int method5631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method5633(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		Static383.aClass250_75.anInt7316 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(23) int local23 = 0; local23 < Static196.aClass139_1.anInt3869; local23++) {
			@Pc(30) Class268 local30 = Static196.aClass139_1.method3228(local23);
			if ((!arg0 || local30.aBoolean492) && local30.anInt7768 == -1 && local30.anInt7780 == -1 && local30.anInt7765 == 0 && local30.aString66.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static233.aShortArray53 = null;
					Static379.anInt6500 = -1;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(77) short[] local77 = new short[local14.length * 2];
					for (@Pc(79) int local79 = 0; local79 < local16; local79++) {
						local77[local79] = local14[local79];
					}
					local14 = local77;
				}
				local14[local16++] = (short) local23;
			}
		}
		Static233.aShortArray53 = local14;
		Static282.anInt4977 = 0;
		Static379.anInt6500 = local16;
		@Pc(117) String[] local117 = new String[Static379.anInt6500];
		for (@Pc(119) int local119 = 0; local119 < Static379.anInt6500; local119++) {
			local117[local119] = Static196.aClass139_1.method3228(local14[local119]).aString66;
		}
		Static232.method3441(local117, Static233.aShortArray53);
		Static383.aClass250_75.method5676();
		Static383.aClass250_75.anInt7316 = 2;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZII)Z")
	public static boolean method5634(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface6 local9 = (Interface6) Static259.method5039(arg2, arg0, arg1);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static13.method302(local9) & true;
		}
		local9 = (Interface6) Static278.method5819(arg2, arg0, arg1, jv.class);
		if (local9 != null) {
			local11 &= Static13.method302(local9);
		}
		local9 = (Interface6) Static366.method4342(arg2, arg0, arg1);
		if (local9 != null) {
			local11 &= Static13.method302(local9);
		}
		return local11;
	}
}
