import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
	public static int anInt3860;

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "Z")
	public static boolean aBoolean266;

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "Lclient!gm;")
	public static final Class135 aClass135_2 = new Class135("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
	public static int anInt3866 = 0;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
	public static void method3290() {
		if (Static613.anInt10200 == 0) {
			return;
		}
		try {
			if (++Static492.anInt838 > 2000) {
				if (Static12.aClass26_1 != null) {
					Static12.aClass26_1.method746();
					Static12.aClass26_1 = null;
				}
				if (Static288.anInt4858 >= 2) {
					Static290.anInt4896 = -5;
					Static613.anInt10200 = 0;
					return;
				}
				Static385.aClass275_6.method6084();
				Static288.anInt4858++;
				Static613.anInt10200 = 1;
				Static492.anInt838 = 0;
			}
			if (Static613.anInt10200 == 1) {
				Static500.aClass338_11 = Static385.aClass275_6.method6086(Static566.aClass92_6);
				Static613.anInt10200 = 2;
			}
			if (Static613.anInt10200 == 2) {
				if (Static500.aClass338_11.anInt9321 == 2) {
					throw new IOException();
				}
				if (Static500.aClass338_11.anInt9321 != 1) {
					return;
				}
				Static12.aClass26_1 = Static309.method4444((Socket) Static500.aClass338_11.anObject18);
				Static500.aClass338_11 = null;
				Static538.method6888();
				Static613.anInt10200 = 4;
			}
			if (Static613.anInt10200 == 4 && Static12.aClass26_1.method741(1)) {
				Static12.aClass26_1.method743(1, Static459.aClass3_Sub4_Sub1_1.aByteArray90, 0);
				@Pc(121) int local121 = Static459.aClass3_Sub4_Sub1_1.aByteArray90[0] & 0xFF;
				Static290.anInt4896 = local121;
				Static613.anInt10200 = 0;
				Static12.aClass26_1.method746();
				Static12.aClass26_1 = null;
			}
		} catch (@Pc(132) IOException local132) {
			if (Static12.aClass26_1 != null) {
				Static12.aClass26_1.method746();
				Static12.aClass26_1 = null;
			}
			if (Static288.anInt4858 >= 2) {
				Static613.anInt10200 = 0;
				Static290.anInt4896 = -4;
			} else {
				Static385.aClass275_6.method6084();
				Static288.anInt4858++;
				Static613.anInt10200 = 1;
				Static492.anInt838 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(IB)Lclient!ab;")
	public static Class2 method3291(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Class14_Sub26.aClass2Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
	public static void method3292(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static254.aClass368ArrayArrayArray2 = Static195.aClass368ArrayArrayArray1;
			Static582.aClass35Array3 = Static368.aClass35Array1;
		} else {
			Static254.aClass368ArrayArrayArray2 = Static416.aClass368ArrayArrayArray3;
			Static582.aClass35Array3 = Static556.aClass35Array2;
		}
		Static247.anInt4367 = Static254.aClass368ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)I")
	public static int method3293(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIZIZ)V")
	public static void method3294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if ((arg4 ? Static336.aClass3_Sub41_18.aClass14_Sub9_1.method2998() : Static336.aClass3_Sub41_18.aClass14_Sub9_4.method2998()) != 0 && arg1 != 0 && Static217.anInt10315 < 50 && arg2 != -1) {
			Static2.aClass51Array1[Static217.anInt10315++] = new Class51((byte) (arg4 ? 3 : 2), arg2, arg1, arg5, arg3, 0, arg0, (Class34_Sub1) null);
		}
	}
}
