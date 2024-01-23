import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!me", name = "H", descriptor = "[Lclient!gg;")
	public static Class47[] aClass47Array2;

	@OriginalMember(owner = "client!me", name = "M", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!me", name = "K", descriptor = "Lclient!vd;")
	public static Class140 aClass140_10 = new Class140(16);

	@OriginalMember(owner = "client!me", name = "O", descriptor = "I")
	public static int anInt3517 = 0;

	@OriginalMember(owner = "client!me", name = "P", descriptor = "I")
	public static int anInt3518 = -1;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!ql;)V")
	public static void method2631(@OriginalArg(1) Class1_Sub13 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static211.aClass5_15 != null) {
			@Pc(22) int local22;
			try {
				Static211.aClass5_15.method90(0L);
				Static211.aClass5_15.method92(local8);
				for (local22 = 0; local22 < 24 && local8[local22] == 0; local22++) {
				}
				if (local22 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(45) Exception local45) {
				for (local22 = 0; local22 < 24; local22++) {
					local8[local22] = -1;
				}
			}
		}
		arg0.method1771(local8, 24);
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(B)Z")
	public static boolean method2632() {
		if (Static250.aBoolean272) {
			try {
				if ((Boolean) Static267.method82("showingVideoAd", Static38.aClass28_1.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(26) Throwable local26) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIBIII)I")
	public static int method2635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = arg1 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(22) int local22 = arg5;
			arg5 = arg2;
			arg2 = local22;
		}
		if (local13 == 0) {
			return arg0;
		} else if (local13 == 1) {
			return 7 + 1 - arg3 - arg5;
		} else if (local13 == 2) {
			return 7 + 1 - arg0 - arg2;
		} else {
			return arg3;
		}
	}
}
