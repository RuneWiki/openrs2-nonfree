import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "[[[Lclient!ch;")
	public static Class53[][][] aClass53ArrayArrayArray2;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "Lclient!cj;")
	public static Class55 aClass55_2;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "[Lclient!nea;")
	public static final Class2_Sub2_Sub15[] aClass2_Sub2_Sub15Array59 = new Class2_Sub2_Sub15[14];

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
	public static Object method3515(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static605.aBoolean718) {
			try {
				@Pc(28) Class119 local28 = (Class119) Class.forName("Class119_Sub1").getDeclaredConstructor().newInstance();
				local28.method7516(arg0);
				return local28;
			} catch (@Pc(35) Throwable local35) {
				Static605.aBoolean718 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method3516() {
		if (Static66.anInt10109 == 0) {
			return;
		}
		try {
			if (++Static483.anInt7693 > 2000) {
				if (Static155.aClass121_2 != null) {
					Static155.aClass121_2.method2936();
					Static155.aClass121_2 = null;
				}
				if (Static514.anInt8562 >= 2) {
					Static304.anInt10284 = -5;
					Static66.anInt10109 = 0;
					return;
				}
				Static390.aClass326_8.method7370();
				Static514.anInt8562++;
				Static66.anInt10109 = 1;
				Static483.anInt7693 = 0;
			}
			if (Static66.anInt10109 == 1) {
				Static563.aClass108_8 = Static390.aClass326_8.method7373(Static452.aClass226_6);
				Static66.anInt10109 = 2;
			}
			if (Static66.anInt10109 == 2) {
				if (Static563.aClass108_8.anInt2766 == 2) {
					throw new IOException();
				}
				if (Static563.aClass108_8.anInt2766 != 1) {
					return;
				}
				Static155.aClass121_2 = Static592.method8037((Socket) Static563.aClass108_8.anObject6);
				Static563.aClass108_8 = null;
				Static124.method1779();
				Static66.anInt10109 = 4;
			}
			if (Static66.anInt10109 == 4) {
				if (!Static155.aClass121_2.method2934(1)) {
					return;
				}
				Static155.aClass121_2.method2938(1, 0, Static53.aClass2_Sub22_Sub2_1.aByteArray115);
				@Pc(121) int local121 = Static53.aClass2_Sub22_Sub2_1.aByteArray115[0] & 0xFF;
				Static66.anInt10109 = 0;
				Static304.anInt10284 = local121;
				Static155.aClass121_2.method2936();
				Static155.aClass121_2 = null;
				return;
			}
		} catch (@Pc(132) IOException local132) {
			if (Static155.aClass121_2 != null) {
				Static155.aClass121_2.method2936();
				Static155.aClass121_2 = null;
			}
			if (Static514.anInt8562 >= 2) {
				Static304.anInt10284 = -4;
				Static66.anInt10109 = 0;
			} else {
				Static390.aClass326_8.method7370();
				Static483.anInt7693 = 0;
				Static514.anInt8562++;
				Static66.anInt10109 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public static void method3517(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static189.aClass375_5 == Static25.aClass375_2) {
			if (!Static563.method7723(0, 1, arg0, 1, 0, false, arg1, -2)) {
				Static563.method7723(0, 1, arg0, 1, 0, false, arg1, -3);
			}
		} else if (!Static563.method7723(0, 1, arg0, 1, 0, false, arg1, -3)) {
			Static563.method7723(0, 1, arg0, 1, 0, false, arg1, -2);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBI)I")
	public static int method3518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
