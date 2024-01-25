import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!ui;")
	public static Class230 aClass230_70;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString60;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_188 = new Class48(23, 7);

	@OriginalMember(owner = "client!s", name = "o", descriptor = "Lclient!es;")
	public static final Class73 aClass73_5 = new Class73("LIVE", 0);

	@OriginalMember(owner = "client!s", name = "p", descriptor = "Lclient!j;")
	public static final Class113 aClass113_14 = new Class113(12, 17);

	@OriginalMember(owner = "client!s", name = "q", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)I")
	public static int method4641(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
	public static void method4644() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static66.aClass132ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static66.aClass132ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static19.anInt329; local6++) {
					for (local9 = 0; local9 < Static230.anInt6113; local9++) {
						if (Static66.aClass132ArrayArrayArray2[local3][local6][local9] != null) {
							Static66.aClass132ArrayArrayArray2[local3][local6][local9].method2682();
						}
						Static66.aClass132ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static66.aClass132ArrayArrayArray2 = null;
		Static239.aClass42Array4 = null;
		if (Static329.aClass132ArrayArrayArray4 != null) {
			for (local3 = 0; local3 < Static329.aClass132ArrayArrayArray4.length; local3++) {
				for (local6 = 0; local6 < Static19.anInt329; local6++) {
					for (local9 = 0; local9 < Static230.anInt6113; local9++) {
						if (Static329.aClass132ArrayArrayArray4[local3][local6][local9] != null) {
							Static329.aClass132ArrayArrayArray4[local3][local6][local9].method2682();
						}
						Static329.aClass132ArrayArrayArray4[local3][local6][local9] = null;
					}
				}
			}
		}
		Static329.aClass132ArrayArrayArray4 = null;
		Static77.aClass42Array2 = null;
		Static25.aClass132ArrayArrayArray1 = null;
		Static229.aClass42Array3 = null;
		Static287.anInt4942 = 0;
		if (Static120.aClass5Array1 != null) {
			for (local3 = 0; local3 < Static287.anInt4942; local3++) {
				Static120.aClass5Array1[local3] = null;
			}
		}
		if (Static65.aClass25_Sub1Array2 != null) {
			for (local3 = 0; local3 < Static143.anInt2670; local3++) {
				Static65.aClass25_Sub1Array2[local3] = null;
			}
			Static143.anInt2670 = 0;
		}
		if (Static300.aClass1_Sub27_Sub1Array3 != null) {
			for (local3 = 0; local3 < Static164.anInt2967; local3++) {
				Static300.aClass1_Sub27_Sub1Array3[local3] = null;
			}
			for (local6 = 0; local6 < Static337.anInt5599; local6++) {
				for (local9 = 0; local9 < Static19.anInt329; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static230.anInt6113; local160++) {
						Static295.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static164.anInt2967 = 0;
		}
		Static248.anIntArrayArrayArray12 = null;
		Static104.method1484();
		Static118.aClass208_6.method4657();
		Static35.aByteArrayArray1 = null;
		Static113.anIntArrayArray30 = null;
		Static351.aByteArrayArray20 = null;
		Static273.aClass54_1 = null;
		Static134.aClass127_4 = null;
		Static90.aClass164_3 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IBI)V")
	public static void method4647(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static102.aClass110_3.method2413(Static39.aClass169_32.method3680(Static48.anInt952));
		@Pc(24) int local24;
		for (@Pc(18) Class1_Sub40 local18 = (Class1_Sub40) Static358.aClass17_66.method202(); local18 != null; local18 = (Class1_Sub40) Static358.aClass17_66.method207()) {
			local24 = Static143.method2170(local18);
			if (local13 < local24) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static215.anInt3678 * 16 + 21;
		@Pc(54) int local54 = arg0 - local13 / 2;
		if (Static136.anInt6304 < local13 + local54) {
			local54 = Static136.anInt6304 - local13;
		}
		if (local54 < 0) {
			local54 = 0;
		}
		@Pc(70) int local70 = arg1;
		if (local24 + arg1 > Static218.anInt3871) {
			local70 = Static218.anInt3871 - local24;
		}
		if (local70 < 0) {
			local70 = 0;
		}
		Static90.anInt1655 = local54;
		Static65.aBoolean115 = true;
		Static265.anInt4594 = (Static122.aBoolean178 ? 26 : 22) + Static215.anInt3678 * 16;
		Static56.anInt1146 = local13;
		Static38.anInt737 = local70;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;IZLclient!ui;)Lclient!gn;")
	public static Class93 method4648(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class230 arg2) {
		@Pc(10) int local10 = arg2.method4970(arg0);
		if (local10 == -1) {
			return new Class93(0);
		}
		@Pc(28) int[] local28 = arg2.method4983(local10);
		@Pc(34) Class93 local34 = new Class93(local28.length);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local34.anInt2185 > local36) {
				@Pc(52) Class1_Sub33 local52 = new Class1_Sub33(arg2.method4985(local28[local38++], local10));
				@Pc(56) int local56 = local52.method5150();
				@Pc(60) int local60 = local52.method5177();
				@Pc(66) int local66 = local52.method5174();
				if (!arg1 && local66 == 1) {
					local34.anInt2185--;
				} else {
					local34.anIntArray275[local36] = local56;
					local34.anIntArray276[local36] = local60;
					local36++;
				}
			}
			return local34;
		}
	}
}
