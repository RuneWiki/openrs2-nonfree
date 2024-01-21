import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
	public static int anInt1747;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "[I")
	public static int[] anIntArray193;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!va;")
	private static Class61 aClass61_721 = Static88.method1421("Connection timed out)3");

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "Lclient!va;")
	public static Class61 aClass61_722 = Static88.method1421(" @whi@");

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
	public static int anInt1750 = 0;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "Lclient!va;")
	public static Class61 aClass61_723 = aClass61_721;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!be;BI)V")
	public static void method947(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static49.aClass10_Sub10_3 == null) {
			Static106.method1669(true, null, 0, (byte) 0, 255, 255);
			Static5.aClass11_Sub1Array1[arg1] = arg0;
		} else {
			Static49.aClass10_Sub10_3.anInt1957 = arg1 * 4 + 5;
			@Pc(26) int local26 = Static49.aClass10_Sub10_3.method1112();
			arg0.method235(local26);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method948() {
		aClass61_723 = null;
		aClass61_721 = null;
		aByteArrayArray9 = null;
		aClass61_722 = null;
		anIntArray193 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZII[BI)V")
	public static void method949(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (Static5.aClass13_1 == null) {
			return;
		}
		if (Static55.anInt1488 >= 0) {
			Static62.anInt1711 = arg1;
			if (Static55.anInt1488 == 0) {
				Static80.anInt2152 = 1;
			} else {
				@Pc(20) int local20 = Static56.method821(Static55.anInt1488);
				@Pc(24) int local24 = local20 - Static25.anInt781;
				Static80.anInt2152 = (local24 + 3600) / arg1;
				if (Static80.anInt2152 < 1) {
					Static80.anInt2152 = 1;
				}
			}
			Static40.aByteArray4 = arg3;
			Static78.anInt2114 = arg2;
			Static55.aBoolean73 = arg0;
		} else if (Static80.anInt2152 == 0) {
			Static6.method64(arg2, arg3, arg0);
		} else {
			Static78.anInt2114 = arg2;
			Static55.aBoolean73 = arg0;
			Static40.aByteArray4 = arg3;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
	public static void method950() {
		Static38.aClass29_29.method646();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[Lclient!cb;[BIII)V")
	public static void method951(@OriginalArg(1) int arg0, @OriginalArg(2) Class12[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(9) int local9 = 0; local9 < 64; local9++) {
				for (local13 = 0; local13 < 64; local13++) {
					if (local9 + arg5 > 0 && arg5 + local9 < 103 && arg3 + local13 > 0 && arg3 + local13 < 103) {
						arg1[local3].anIntArrayArray6[arg5 + local9][arg3 + local13] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(87) Class10_Sub10 local87 = new Class10_Sub10(arg2);
		for (local13 = 0; local13 < 4; local13++) {
			for (@Pc(93) int local93 = 0; local93 < 64; local93++) {
				for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
					Static82.method1282(arg0, local97 + arg3, 0, local13, arg4, arg5 + local93, local87);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(JI)V")
	public static void method952(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < Static6.anInt70; local16++) {
			if (Static76.aLongArray6[local16] == arg0) {
				Static80.aBoolean94 = true;
				Static6.anInt70--;
				for (@Pc(36) int local36 = local16; local36 < Static6.anInt70; local36++) {
					Static106.aClass61Array15[local36] = Static106.aClass61Array15[local36 + 1];
					Static33.anIntArray112[local36] = Static33.anIntArray112[local36 + 1];
					Static76.aLongArray6[local36] = Static76.aLongArray6[local36 + 1];
				}
				Static50.aClass10_Sub10_Sub1_3.method1167(164);
				Static50.aClass10_Sub10_Sub1_3.method1125(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)V")
	public static void method953(@OriginalArg(0) boolean arg0) {
		if (Static79.aClass27_3 == null) {
			return;
		}
		try {
			@Pc(20) Class10_Sub10 local20 = new Class10_Sub10(4);
			local20.method1126(arg0 ? 2 : 3);
			local20.method1159(0);
			Static79.aClass27_3.method613(local20.aByteArray9, 4);
		} catch (@Pc(41) IOException local41) {
			try {
				Static79.aClass27_3.method610();
			} catch (@Pc(46) Exception local46) {
			}
			Static48.anInt1337++;
			Static79.aClass27_3 = null;
		}
	}
}
