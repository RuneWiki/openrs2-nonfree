import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static700 {

	@OriginalMember(owner = "client!waa", name = "e", descriptor = "I")
	public static int anInt10967;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(BII)Z")
	public static boolean method9155(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(II)I")
	public static int method9156(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local11 += 16;
		}
		if (arg0 >= 256) {
			local11 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local11 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local11 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local11++;
			arg0 >>>= 0x1;
		}
		return local11 + arg0;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
	public static void method9157() {
		if (Static259.aBoolean418) {
			return;
		}
		Static85.method1105(Static274.aClass262ArrayArrayArray1);
		if (Static712.aClass262ArrayArrayArray3 != null) {
			Static85.method1105(Static712.aClass262ArrayArrayArray3);
		}
		Static259.aBoolean418 = true;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIIIIB)V")
	public static void method9158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static713.aClass3_Sub55_31.aClass15_Sub8_4.method2888() != 0 && arg0 != 0 && Static581.anInt9508 < 50 && arg1 != -1) {
			Static326.aClass239Array1[Static581.anInt9508++] = new Class239((byte) 1, arg1, arg0, arg2, arg4, 0, arg3, (Class19_Sub1) null);
		}
	}
}
