import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[200];

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
	public static int anInt2989 = 0;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_108 = new Class56(19, 0);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII)V")
	public static void method2281(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static156.anInt2885 = arg2;
		Static306.anInt5011 = arg1;
		Static262.anInt4696 = arg3;
		Static3.anInt50 = arg0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public static void method2282() {
		if (Static254.anInt4212 == 0) {
			return;
		}
		try {
			if (++Static344.anInt5705 > 2000) {
				if (Static338.aClass152_4 != null) {
					Static338.aClass152_4.method2924();
					Static338.aClass152_4 = null;
				}
				if (Static313.anInt5081 >= 1) {
					Static26.anInt634 = -5;
					Static254.anInt4212 = 0;
					return;
				}
				Static313.anInt5081++;
				Static240.aClass220_3.aBoolean406 = !Static240.aClass220_3.aBoolean406;
				Static254.anInt4212 = 1;
				Static344.anInt5705 = 0;
			}
			if (Static254.anInt4212 == 1) {
				Static329.aClass45_7 = Static24.aClass196_1.method3914(Static240.aClass220_3.aString62, Static240.aClass220_3.method4602());
				Static254.anInt4212 = 2;
			}
			@Pc(111) int local111;
			if (Static254.anInt4212 == 2) {
				if (Static329.aClass45_7.anInt1129 == 2) {
					throw new IOException();
				}
				if (Static329.aClass45_7.anInt1129 != 1) {
					return;
				}
				Static338.aClass152_4 = new Class152((Socket) Static329.aClass45_7.anObject5, Static24.aClass196_1);
				Static329.aClass45_7 = null;
				Static338.aClass152_4.method2926(Static247.aClass4_Sub9_Sub2_2.anInt6207, Static247.aClass4_Sub9_Sub2_2.aByteArray81);
				Static170.method5836();
				local111 = Static338.aClass152_4.method2925();
				Static170.method5836();
				if (local111 != 21) {
					Static254.anInt4212 = 0;
					Static26.anInt634 = local111;
					Static338.aClass152_4.method2924();
					Static338.aClass152_4 = null;
					return;
				}
				Static254.anInt4212 = 3;
			}
			if (Static254.anInt4212 == 3) {
				if (Static338.aClass152_4.method2921() < 1) {
					return;
				}
				Static263.aStringArray30 = new String[Static338.aClass152_4.method2925()];
				Static254.anInt4212 = 4;
			}
			if (Static254.anInt4212 == 4 && Static338.aClass152_4.method2921() >= Static263.aStringArray30.length * 8) {
				Static56.aClass4_Sub9_Sub2_1.anInt6207 = 0;
				Static338.aClass152_4.method2923(Static263.aStringArray30.length * 8, Static56.aClass4_Sub9_Sub2_1.aByteArray81, 0);
				for (local111 = 0; local111 < Static263.aStringArray30.length; local111++) {
					Static263.aStringArray30[local111] = Static272.method3613(Static56.aClass4_Sub9_Sub2_1.method5024());
				}
				Static254.anInt4212 = 0;
				Static26.anInt634 = 21;
				Static338.aClass152_4.method2924();
				Static338.aClass152_4 = null;
			}
		} catch (@Pc(208) IOException local208) {
			if (Static338.aClass152_4 != null) {
				Static338.aClass152_4.method2924();
				Static338.aClass152_4 = null;
			}
			if (Static313.anInt5081 >= 1) {
				Static254.anInt4212 = 0;
				Static26.anInt634 = -4;
			} else {
				Static344.anInt5705 = 0;
				Static313.anInt5081++;
				Static240.aClass220_3.aBoolean406 = !Static240.aClass220_3.aBoolean406;
				Static254.anInt4212 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)Lclient!fg;")
	public static Class9 method2283() {
		try {
			return (Class9) Class.forName("Class9_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I")
	public static int method2285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static240.aShortArrayArray4 == null ? 0 : Static240.aShortArrayArray4[arg0][arg1] & 0xFFFF;
	}
}
