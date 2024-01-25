import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "[[Lclient!sba;")
	public static Class302[][] aClass302ArrayArray1;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!mg;IIIII)V")
	public static void method4442(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 < 1 || arg1 < 1 || Static306.anInt6176 - 2 < arg3 || arg1 > Static108.anInt2930 - 2) {
			return;
		}
		if (Static26.aClass186ArrayArrayArray1 == null) {
			return;
		}
		@Pc(40) Interface22 local40 = Static479.aClass210_Sub1_2.method5807(arg1, arg4, arg2, arg3);
		if (local40 == null) {
			return;
		}
		if (local40 instanceof Class9_Sub4_Sub2_Sub5) {
			((Class9_Sub4_Sub2_Sub5) local40).method7833(arg0);
		} else if (local40 instanceof Class9_Sub4_Sub3_Sub2) {
			((Class9_Sub4_Sub3_Sub2) local40).method6805(arg0);
		} else if (local40 instanceof Class9_Sub4_Sub5_Sub1) {
			((Class9_Sub4_Sub5_Sub1) local40).method7792(arg0);
		} else if (local40 instanceof Class9_Sub4_Sub1_Sub1) {
			((Class9_Sub4_Sub1_Sub1) local40).method1872(arg0);
		}
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(B)V")
	public static void method4444() {
		if (!Static8.aBoolean54) {
			Static338.aFloat133 += (24.0F - Static338.aFloat133) / 2.0F;
			Static94.aBoolean215 = true;
			Static8.aBoolean54 = true;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IZZLclient!ni;IIIJ)V")
	public static void method4445(@OriginalArg(3) Class223 arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2, @OriginalArg(7) long arg3) {
		Static214.aClass6_Sub4_Sub2_2 = null;
		Static619.anInt7284 = arg1;
		Static224.anInt5036 = arg2;
		Static453.anInt8163 = 1;
		Static473.aClass223_111 = arg0;
		Static597.anInt10148 = 10000;
		Static309.anInt6223 = 0;
		Static257.aLong150 = arg3;
		Static3.aBoolean7 = false;
		Static47.anInt1661 = 0;
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(II)V")
	public static void method4447(@OriginalArg(1) int arg0) {
		Static203.anInt4455 = arg0;
		Static241.aClass94_21.method2952();
	}
}
