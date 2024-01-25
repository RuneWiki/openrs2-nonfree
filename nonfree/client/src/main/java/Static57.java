import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!dm", name = "M", descriptor = "Lclient!ug;")
	public static Class171 aClass171_1;

	@OriginalMember(owner = "client!dm", name = "I", descriptor = "[I")
	public static final int[] anIntArray162 = new int[4096];

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(JIBI)V")
	public static void method1492(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg0 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg0 >> 20 & 0x3;
		@Pc(32) int local32 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static63.method4860(arg1, arg2, local10, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0], 0, 0, local17, true, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], 0);
			return;
		}
		@Pc(69) Class141 local69 = Static119.method2548(local32);
		@Pc(82) int local82;
		@Pc(79) int local79;
		if (local17 == 0 || local17 == 2) {
			local79 = local69.anInt4256;
			local82 = local69.anInt4297;
		} else {
			local82 = local69.anInt4256;
			local79 = local69.anInt4297;
		}
		@Pc(93) int local93 = local69.anInt4273;
		if (local17 != 0) {
			local93 = (local93 << local17 & 0xF) + (local93 >> 4 - local17);
		}
		Static63.method4860(arg1, arg2, 0, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0], local82, local79, 0, true, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], local93);
	}

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "(I)V")
	public static void method1493() {
		for (@Pc(3) int local3 = 0; local3 < Static125.anInt2818; local3++) {
			@Pc(9) int local9 = Static191.anIntArray373[local3];
			@Pc(13) Class17_Sub1_Sub1_Sub1 local13 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local9];
			@Pc(17) int local17 = Static311.aClass1_Sub8_Sub1_8.method4532();
			if ((local17 & 0x10) != 0) {
				local17 += Static311.aClass1_Sub8_Sub1_8.method4532() << 8;
			}
			Static331.method5386(local17, local13, local9);
		}
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(II)I")
	public static int method1494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static85.anIntArrayArray56 == null ? 0 : Static85.anIntArrayArray56[arg0][arg1] >>> 21 & 0x7F8;
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(III)I")
	public static int method1495(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return (arg0 & 0xFF80) + local16;
	}
}
