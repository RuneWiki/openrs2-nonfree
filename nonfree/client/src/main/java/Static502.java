import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!tg", name = "M", descriptor = "[Z")
	public static boolean[] aBooleanArray32;

	@OriginalMember(owner = "client!tg", name = "H", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_90 = new Class208(70, 2);

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLjava/io/File;I)[B")
	public static byte[] method6056(@OriginalArg(1) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(14) byte[] local14 = new byte[arg1];
			Static524.method1220(arg1, arg0, local14);
			return local14;
		} catch (@Pc(22) IOException local22) {
			return null;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!la;Lclient!vn;ILclient!ua;Lclient!in;IIILjava/lang/String;IB)V")
	public static void method6057(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) Class352 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class181 arg4, @OriginalArg(5) Class160 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) String arg9, @OriginalArg(10) int arg10) {
		@Pc(15) int local15;
		if (Static358.anInt9363 == 4) {
			local15 = (int) Static331.aFloat172 & 0x3FFF;
		} else {
			local15 = (int) Static331.aFloat172 + Static272.anInt5007 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg5.anInt4182 / 2, arg5.anInt4156 / 2) + 10;
		@Pc(43) int local43 = arg7 * arg7 + arg8 * arg8;
		if (local34 * local34 < local43) {
			return;
		}
		@Pc(57) int local57 = Class85_Sub8.anIntArray426[local15];
		@Pc(61) int local61 = Class85_Sub8.anIntArray427[local15];
		if (Static358.anInt9363 != 4) {
			local57 = local57 * 256 / (Static267.anInt4887 + 256);
			local61 = local61 * 256 / (Static267.anInt4887 + 256);
		}
		@Pc(101) int local101 = arg8 * local57 + local61 * arg7 >> 14;
		@Pc(112) int local112 = local61 * arg8 - local57 * arg7 >> 14;
		@Pc(119) int local119 = arg2.method7574(100, arg9, null);
		@Pc(125) int local125 = local101 - local119 / 2;
		@Pc(133) int local133 = arg2.method7570(null, 0, arg9, 100);
		if (-arg5.anInt4182 <= local125 && arg5.anInt4182 >= local125 && local112 >= -arg5.anInt4156 && local112 <= arg5.anInt4156) {
			arg1.method7261(0, arg3, arg4, arg6, arg6 + arg5.anInt4156 / 2 - local133 - arg0 - local112, 0, null, arg10, 1, arg5.anInt4182 / 2 + arg3 + local125, local119, 0, 50, arg9, null);
		}
	}
}
