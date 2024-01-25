import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!uf", name = "K", descriptor = "F")
	public static float aFloat157;

	@OriginalMember(owner = "client!uf", name = "F", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_166 = new Class56(98, 2);

	@OriginalMember(owner = "client!uf", name = "L", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(II)I")
	public static int method7080(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIZIII)V")
	public static void method7082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static310.anInt5292 = arg4;
		Static303.anInt5127 = arg5;
		Static162.anInt985 = arg0;
		Static480.anInt7907 = arg2;
		Static121.anInt2793 = arg3;
		Static187.anInt3554 = arg1;
	}

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V")
	public static void method7083() {
		try {
			@Pc(10) int local10;
			if (Static565.anInt9228 == 1) {
				local10 = Static323.aClass3_Sub4_Sub3_2.method6363();
				if (local10 > 0 && Static323.aClass3_Sub4_Sub3_2.method6353()) {
					local10 -= Static417.anInt7075;
					if (local10 < 0) {
						local10 = 0;
					}
					Static323.aClass3_Sub4_Sub3_2.method6354(local10);
					return;
				}
				Static323.aClass3_Sub4_Sub3_2.method6335();
				Static323.aClass3_Sub4_Sub3_2.method6344();
				Static96.aClass3_Sub24_1 = null;
				if (Static24.aClass322_5 == null) {
					Static565.anInt9228 = 0;
				} else {
					Static565.anInt9228 = 2;
				}
				Static392.aClass160_1 = null;
			}
			if (Static565.anInt9228 == 3) {
				local10 = Static323.aClass3_Sub4_Sub3_2.method6363();
				if (Static225.anInt3978 > local10 && Static323.aClass3_Sub4_Sub3_2.method6353()) {
					local10 += Static410.anInt7034;
					if (local10 > Static225.anInt3978) {
						local10 = Static225.anInt3978;
					}
					Static323.aClass3_Sub4_Sub3_2.method6354(local10);
					return;
				}
				Static565.anInt9228 = 0;
				Static410.anInt7034 = 0;
			}
		} catch (@Pc(99) Exception local99) {
			local99.printStackTrace();
			Static323.aClass3_Sub4_Sub3_2.method6335();
			Static24.aClass322_5 = null;
			Static565.anInt9228 = 0;
			Static392.aClass160_1 = null;
			Static96.aClass3_Sub24_1 = null;
		}
	}
}
