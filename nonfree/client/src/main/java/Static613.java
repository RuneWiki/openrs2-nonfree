import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static613 {

	@OriginalMember(owner = "client!ul", name = "Q", descriptor = "I")
	public static int anInt10201;

	@OriginalMember(owner = "client!ul", name = "G", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_109 = new Class240(68, 3);

	@OriginalMember(owner = "client!ul", name = "N", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_149 = new Class171(110, -1);

	@OriginalMember(owner = "client!ul", name = "P", descriptor = "I")
	public static int anInt10200 = 0;

	@OriginalMember(owner = "client!ul", name = "R", descriptor = "[J")
	public static final long[] aLongArray20 = new long[10];

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BIIII)V")
	public static void method8313(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) Class3_Sub5_Sub20 local19 = Static447.method6065((long) arg0 | (long) arg1 << 32, 18);
		local19.method8832();
		local19.anInt10754 = arg3;
		local19.anInt10756 = arg2;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
	public static void method8314(@OriginalArg(0) int arg0) {
		Static146.anInt2698 = -1;
		Static426.anInt6954 = -1;
		Static81.anInt10273 = arg0;
		Static2.method25();
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)V")
	public static void method8315() {
		Static152.aClass12_12.method8266();
		for (@Pc(16) int local16 = 0; local16 < 32; local16++) {
			Static32.aLongArray1[local16] = 0L;
		}
		for (@Pc(28) int local28 = 0; local28 < 32; local28++) {
			Static344.aLongArray12[local28] = 0L;
		}
		Static435.anInt7103 = 0;
	}

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)[Lclient!re;")
	public static Class304[] method8317() {
		if (Static367.aClass304Array166 == null) {
			@Pc(7) Class304[] local7 = Static539.method6915(Static566.aClass92_6);
			@Pc(11) Class304[] local11 = new Class304[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(18) int local18 = Static336.aClass3_Sub41_18.aClass14_Sub29_1.method8914();
			@Pc(84) int local84;
			@Pc(90) Class304 local90;
			label69: for (@Pc(20) int local20 = 0; local20 < local7.length; local20++) {
				@Pc(26) Class304 local26 = local7[local20];
				if ((local26.anInt8110 <= 0 || local26.anInt8110 >= 24) && local26.anInt8105 >= 800 && local26.anInt8107 >= 600 && (local18 != 2 || local26.anInt8105 <= 800 && local26.anInt8107 <= 600) && (local18 != 1 || local26.anInt8105 <= 1024 && local26.anInt8107 <= 768)) {
					for (local84 = 0; local84 < local13; local84++) {
						local90 = local11[local84];
						if (local90.anInt8105 == local26.anInt8105 && local26.anInt8107 == local90.anInt8107) {
							if (local90.anInt8110 < local26.anInt8110) {
								local11[local84] = local26;
							}
							continue label69;
						}
					}
					local11[local13] = local26;
					local13++;
				}
			}
			Static367.aClass304Array166 = new Class304[local13];
			Static681.method4033(local11, 0, Static367.aClass304Array166, 0, local13);
			@Pc(146) int[] local146 = new int[Static367.aClass304Array166.length];
			for (local84 = 0; local84 < Static367.aClass304Array166.length; local84++) {
				local90 = Static367.aClass304Array166[local84];
				local146[local84] = local90.anInt8105 * local90.anInt8107;
			}
			Static302.method4387(Static367.aClass304Array166, local146);
		}
		return Static367.aClass304Array166;
	}
}
