import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!eja", name = "D", descriptor = "Lclient!id;")
	public static Class157 aClass157_3;

	@OriginalMember(owner = "client!eja", name = "G", descriptor = "Lclient!uu;")
	public static Class343 aClass343_67;

	@OriginalMember(owner = "client!eja", name = "C", descriptor = "Lclient!hca;")
	public static final Class139 aClass139_3 = new Class139();

	@OriginalMember(owner = "client!eja", name = "E", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_84 = new Class194(105, 2);

	@OriginalMember(owner = "client!eja", name = "F", descriptor = "Lclient!st;")
	public static final Class314 aClass314_44 = new Class314(50, 3);

	@OriginalMember(owner = "client!eja", name = "c", descriptor = "(B)V")
	public static void method2343() {
		Static41.anInt768 = 0;
		@Pc(23) boolean local23 = Static47.aClass3_Sub9_Sub2_1.method5626() == 1;
		@Pc(27) int local27 = Static47.aClass3_Sub9_Sub2_1.method5634();
		@Pc(31) int local31 = Static47.aClass3_Sub9_Sub2_1.method5583();
		@Pc(35) int local35 = Static47.aClass3_Sub9_Sub2_1.method5626();
		Static84.method7778();
		Static136.method2361(local35);
		@Pc(50) int local50 = (Static94.anInt1852 - Static47.aClass3_Sub9_Sub2_1.anInt6453) / 16;
		Static543.anIntArrayArray54 = new int[local50][4];
		@Pc(60) int local60;
		for (@Pc(56) int local56 = 0; local56 < local50; local56++) {
			for (local60 = 0; local60 < 4; local60++) {
				Static543.anIntArrayArray54[local56][local60] = Static47.aClass3_Sub9_Sub2_1.method5585();
			}
		}
		Static50.aByteArrayArray1 = new byte[local50][];
		Static151.aByteArrayArray10 = new byte[local50][];
		Static247.anIntArray268 = new int[local50];
		Static289.aByteArrayArray13 = new byte[local50][];
		Static544.anIntArray571 = new int[local50];
		Static243.anIntArray265 = new int[local50];
		Static606.aByteArrayArray28 = null;
		Static454.anIntArray476 = new int[local50];
		Static252.anIntArray273 = new int[local50];
		Static427.anIntArray447 = null;
		Static316.aByteArrayArray16 = new byte[local50][];
		local50 = 0;
		for (local60 = (local31 - (Static399.anInt7121 >> 4)) / 8; local60 <= (local31 + (Static399.anInt7121 >> 4)) / 8; local60++) {
			for (@Pc(137) int local137 = (local27 - (Static24.anInt345 >> 4)) / 8; local137 <= ((Static24.anInt345 >> 4) + local27) / 8; local137++) {
				Static454.anIntArray476[local50] = local137 + (local60 << 8);
				Static544.anIntArray571[local50] = Static235.aClass343_118.method8158("m" + local60 + "_" + local137);
				Static247.anIntArray268[local50] = Static235.aClass343_118.method8158("l" + local60 + "_" + local137);
				Static243.anIntArray265[local50] = Static235.aClass343_118.method8158("um" + local60 + "_" + local137);
				Static252.anIntArray273[local50] = Static235.aClass343_118.method8158("ul" + local60 + "_" + local137);
				local50++;
			}
		}
		Static442.method6636(local27, local31, 11, local23);
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(IZLclient!uv;ZI)V")
	public static void method2344(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class344 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg2.anInt9546;
		if (arg2.aByte115 == 0) {
			arg2.anInt9546 = arg2.anInt9616;
		} else if (arg2.aByte115 == 1) {
			arg2.anInt9546 = arg0 - arg2.anInt9616;
		} else if (arg2.aByte115 == 2) {
			arg2.anInt9546 = arg0 * arg2.anInt9616 >> 14;
		}
		@Pc(51) int local51 = arg2.anInt9602;
		if (arg2.aByte116 == 0) {
			arg2.anInt9602 = arg2.anInt9631;
		} else if (arg2.aByte116 == 1) {
			arg2.anInt9602 = arg3 - arg2.anInt9631;
		} else if (arg2.aByte116 == 2) {
			arg2.anInt9602 = arg3 * arg2.anInt9631 >> 14;
		}
		if (arg2.aByte115 == 4) {
			arg2.anInt9546 = arg2.anInt9602 * arg2.anInt9587 / arg2.anInt9577;
		}
		if (arg2.aByte116 == 4) {
			arg2.anInt9602 = arg2.anInt9546 * arg2.anInt9577 / arg2.anInt9587;
		}
		if (Static349.aBoolean768 && (Static76.method1311(arg2).anInt9447 != 0 || arg2.anInt9554 == 0)) {
			if (arg2.anInt9602 < 5 && arg2.anInt9546 < 5) {
				arg2.anInt9546 = 5;
				arg2.anInt9602 = 5;
			} else {
				if (arg2.anInt9602 <= 0) {
					arg2.anInt9602 = 5;
				}
				if (arg2.anInt9546 <= 0) {
					arg2.anInt9546 = 5;
				}
			}
		}
		if (arg2.anInt9604 == Static601.anInt9746) {
			Static529.aClass344_12 = arg2;
		}
		if (arg1 && arg2.anObjectArray8 != null && (arg2.anInt9546 != local8 || arg2.anInt9602 != local51)) {
			@Pc(196) Class3_Sub36 local196 = new Class3_Sub36();
			local196.anObjectArray1 = arg2.anObjectArray8;
			local196.aClass344_6 = arg2;
			Static361.aClass216_48.method5449(local196);
		}
	}
}
