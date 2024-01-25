import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	public static int anInt1655;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_18 = new Class215(36, 3);

	@OriginalMember(owner = "client!e", name = "g", descriptor = "[I")
	public static final int[] anIntArray137 = new int[14];

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_80 = new Class22(1, -2);

	@OriginalMember(owner = "client!e", name = "i", descriptor = "Lclient!pp;")
	public static final Class187 aClass187_1 = new Class187();

	@OriginalMember(owner = "client!e", name = "k", descriptor = "I")
	public static final int anInt1656 = 1;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg6 && arg3 == arg0 && arg8 == arg5 && arg2 == arg4) {
			Static167.method2738(arg0, arg7, arg1, arg2, arg5);
			return;
		}
		@Pc(39) int local39 = arg7;
		@Pc(41) int local41 = arg0;
		@Pc(45) int local45 = arg7 * 3;
		@Pc(49) int local49 = arg0 * 3;
		@Pc(53) int local53 = arg6 * 3;
		@Pc(57) int local57 = arg3 * 3;
		@Pc(61) int local61 = arg8 * 3;
		@Pc(65) int local65 = arg4 * 3;
		@Pc(74) int local74 = arg5 + local53 - local61 - arg7;
		@Pc(84) int local84 = local57 + arg2 - arg0 - local65;
		@Pc(94) int local94 = local45 + local61 - local53 - local53;
		@Pc(105) int local105 = local65 + local49 - local57 - local57;
		@Pc(110) int local110 = local53 - local45;
		@Pc(115) int local115 = local57 - local49;
		for (@Pc(117) int local117 = 128; local117 <= 4096; local117 += 128) {
			@Pc(125) int local125 = local117 * local117 >> 12;
			@Pc(131) int local131 = local125 * local117 >> 12;
			@Pc(135) int local135 = local74 * local131;
			@Pc(139) int local139 = local84 * local131;
			@Pc(143) int local143 = local125 * local94;
			@Pc(147) int local147 = local105 * local125;
			@Pc(151) int local151 = local117 * local110;
			@Pc(155) int local155 = local117 * local115;
			@Pc(166) int local166 = arg7 + (local151 + local143 + local135 >> 12);
			@Pc(177) int local177 = arg0 + (local147 + local139 + local155 >> 12);
			Static167.method2738(local41, local39, arg1, local177, local166);
			local41 = local177;
			local39 = local166;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)S")
	public static short method1470(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = arg0 >> 10 & 0x3F;
		@Pc(23) int local23 = arg0 >> 3 & 0x70;
		@Pc(27) int local27 = arg0 & 0x7F;
		@Pc(44) int local44 = local27 <= 64 ? local27 * local23 >> 7 : (127 - local27) * local23 >> 7;
		@Pc(48) int local48 = local44 + local27;
		@Pc(59) int local59;
		if (local48 == 0) {
			local59 = local44 << 1;
		} else {
			local59 = (local44 << 8) / local48;
		}
		return (short) (local17 << 10 | local59 >> 4 << 7 | local48);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BLclient!iv;)V")
	public static void method1471(@OriginalArg(1) Class4_Sub12 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static394.aClass139_4 != null) {
			@Pc(25) int local25;
			try {
				Static394.aClass139_4.method3466(0L);
				Static394.aClass139_4.method3462(local13);
				for (local25 = 0; local25 < 24 && local13[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(48) Exception local48) {
				for (local25 = 0; local25 < 24; local25++) {
					local13[local25] = -1;
				}
			}
		}
		arg0.method2519(local13, 24);
	}
}
