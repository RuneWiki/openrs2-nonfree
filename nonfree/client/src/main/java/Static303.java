import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "Z")
	public static boolean aBoolean482 = false;

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
	public static int anInt5361 = -1;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
	public static int anInt5363 = 0;

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
	public static final int anInt5364 = 328;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIB)Z")
	public static boolean method4110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)Z")
	public static boolean method4111() {
		try {
			if (Static27.anInt461 == 2) {
				if (Static143.aClass4_Sub30_2 == null) {
					Static143.aClass4_Sub30_2 = Static461.method3724(Static236.aClass76_49, Static14.anInt190, Static397.anInt742);
					if (Static143.aClass4_Sub30_2 == null) {
						return false;
					}
				}
				if (Static419.aClass171_1 == null) {
					Static419.aClass171_1 = new Class171(Static371.aClass76_85, Static345.aClass76_75);
				}
				if (Static56.aClass4_Sub15_Sub1_1.method1456(Static419.aClass171_1, Static195.aClass76_43, Static143.aClass4_Sub30_2)) {
					Static56.aClass4_Sub15_Sub1_1.method1438();
					Static56.aClass4_Sub15_Sub1_1.method1428(Static206.anInt3920);
					Static56.aClass4_Sub15_Sub1_1.method1450(Static19.aBoolean30, Static143.aClass4_Sub30_2);
					Static419.aClass171_1 = null;
					Static236.aClass76_49 = null;
					Static27.anInt461 = 0;
					Static143.aClass4_Sub30_2 = null;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static56.aClass4_Sub15_Sub1_1.method1440();
			Static419.aClass171_1 = null;
			Static236.aClass76_49 = null;
			Static27.anInt461 = 0;
			Static143.aClass4_Sub30_2 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method4113(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(35) int local35 = local19 + (arg0 ? Static445.aClass81_2.anInt2663 : Static445.aClass81_2.anInt2661);
		for (@Pc(37) int local37 = local19; local37 < local35; local37++) {
			@Pc(44) Class4_Sub1_Sub3 local44 = Static445.aClass81_2.method2258(local37);
			if (local44.aBoolean32 && local44.method229().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static191.aShortArray66 = null;
					Static406.anInt6702 = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(80) short[] local80 = new short[local11.length * 2];
					for (@Pc(82) int local82 = 0; local82 < local13; local82++) {
						local80[local82] = local11[local82];
					}
					local11 = local80;
				}
				local11[local13++] = (short) local37;
			}
		}
		Static406.anInt6702 = local13;
		Static47.anInt809 = 0;
		Static191.aShortArray66 = local11;
		@Pc(115) String[] local115 = new String[Static406.anInt6702];
		for (@Pc(117) int local117 = 0; local117 < Static406.anInt6702; local117++) {
			local115[local117] = Static445.aClass81_2.method2258(local11[local117]).method229();
		}
		Static67.method1278(local115, Static191.aShortArray66);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
	public static void method4114(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub1_Sub11 local15 = Static405.method5222(arg0, 13);
		local15.method2604();
		local15.anInt3083 = arg1;
	}
}
