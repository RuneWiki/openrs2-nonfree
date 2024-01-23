import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
	public static int anInt4072;

	@OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
	public static int anInt4076;

	@OriginalMember(owner = "client!lk", name = "Ub", descriptor = "I")
	public static int anInt4136 = 0;

	@OriginalMember(owner = "client!lk", name = "Wb", descriptor = "I")
	public static int anInt4138 = 0;

	@OriginalMember(owner = "client!lk", name = "ic", descriptor = "I")
	public static int anInt4147 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)I")
	public static int method3103(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local10 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local10 += 8;
		}
		if (arg0 >= 16) {
			local10 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local10 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local10++;
			arg0 >>>= 0x1;
		}
		return arg0 + local10;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
	public static void method3106() {
		Static66.aClass8_Sub2_Sub1_4.method2398(193);
		Static66.aClass8_Sub2_Sub1_4.method2333(Static182.anInt3573);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!ph;B)I")
	public static int method3108(@OriginalArg(0) Class36_Sub3_Sub2 arg0) {
		@Pc(8) Class173 local8 = arg0.aClass173_1;
		if (local8.anIntArray491 != null) {
			local8 = local8.method4245();
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(27) int local27 = local8.anInt5625;
		@Pc(31) Class12 local31 = arg0.method3105();
		if (local31.anInt423 == arg0.anInt4067) {
			local27 = local8.anInt5611;
		} else if (arg0.anInt4067 == local31.anInt421 || local31.anInt399 == arg0.anInt4067 || arg0.anInt4067 == local31.anInt413 || local31.anInt397 == arg0.anInt4067) {
			local27 = local8.anInt5603;
		} else if (arg0.anInt4067 == local31.anInt408 || arg0.anInt4067 == local31.anInt386 || arg0.anInt4067 == local31.anInt416 || arg0.anInt4067 == local31.anInt394) {
			local27 = local8.anInt5602;
		}
		return local27;
	}
}
