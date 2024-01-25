import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "[I")
	public static int[] anIntArray469;

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "J")
	public static long aLong187 = 0L;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BLclient!oa;)V")
	public static void method6079(@OriginalArg(1) Class15 arg0) {
		arg0.ca(0, 0, Static582.anInt10234, 350);
		arg0.C(0, 0, Static582.anInt10234, 350, Static368.anInt7250 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static580.anInt10229;
		@Pc(48) int local48;
		if (Static413.anInt8076 > 0) {
			@Pc(38) int local38 = 346 - Static580.anInt10229 - 4;
			local48 = local27 * local38 / (Static413.anInt8076 + local27 - 1);
			@Pc(50) int local50 = 4;
			if (Static413.anInt8076 > 1) {
				local50 = (local38 - local48) * (-Static86.anInt1983 + -1 + Static413.anInt8076) / (Static413.anInt8076 - 1) + 4;
			}
			arg0.C(Static582.anInt10234 - 16, local50, 12, local48, Static368.anInt7250 << 24 | 0x332277, 2);
			for (@Pc(86) int local86 = Static86.anInt1983; local27 + Static86.anInt1983 > local86 && local86 < Static413.anInt8076; local86++) {
				@Pc(95) String[] local95 = Static335.method5785('\b', Static171.aStringArray14[local86]);
				@Pc(102) int local102 = (Static582.anInt10234 - 24) / local95.length;
				for (@Pc(104) int local104 = 0; local104 < local95.length; local104++) {
					@Pc(112) int local112 = local104 * local102 + 8;
					arg0.ca(local112, 0, local112 + local102 - 8, 350);
					Static137.aClass111_5.method6675(local95[local104], local112, 350 - Static475.anInt8908 - Static13.aClass297_2.anInt8935 - (local86 - Static86.anInt1983) * Static580.anInt10229 - 2, -1, -16777216);
				}
			}
		}
		arg0.ca(0, 0, Static582.anInt10234, 350);
		arg0.method5281(350 - Static475.anInt8908, Static582.anInt10234, -1, 0);
		Static162.aClass111_6.method6675("--> " + Static387.aString90, 10, 349 - Static9.aClass297_1.anInt8935, -1, -16777216);
		if (!Static62.aBoolean115) {
			return;
		}
		local48 = -1;
		if (Static129.anInt10429 % 30 > 15) {
			local48 = 16777215;
		}
		arg0.method5316(12, local48, 350 - Static9.aClass297_1.anInt8935 - 11, Static9.aClass297_1.method7314("--> " + Static387.aString90.substring(0, Static427.anInt9474)) + 10);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(II)I")
	public static int method6080(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}
}
