import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!te", name = "c", descriptor = "Lclient!lj;")
	public static Class1_Sub5_Sub6 aClass1_Sub5_Sub6_10;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "C")
	public static char aChar4;

	@OriginalMember(owner = "client!te", name = "m", descriptor = "Lclient!nm;")
	public static Class119 aClass119_82;

	@OriginalMember(owner = "client!te", name = "o", descriptor = "I")
	public static int anInt4880;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString186 = "Loading defaults - ";

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZI)I")
	public static int method4068(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub18 local15 = (Class1_Sub18) Static1.aClass86_1.method2136((long) arg0);
		if (local15 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local15.anIntArray219.length) {
			return local15.anIntArray219[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
	public static void method4069() {
		Static1.aClass86_1 = new Class86(32);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIILclient!km;Lclient!km;IIJ)V")
	public static void method4078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class11 arg4, @OriginalArg(5) Class11 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class39 local8 = new Class39();
		local8.aLong48 = arg8;
		local8.anInt1261 = arg1 * 128 + 64;
		local8.anInt1258 = arg2 * 128 + 64;
		local8.anInt1259 = arg3;
		local8.aClass11_4 = arg4;
		local8.aClass11_3 = arg5;
		local8.anInt1260 = arg6;
		local8.anInt1253 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static254.aClass1_Sub16ArrayArrayArray3[local42][arg1][arg2] == null) {
				Static254.aClass1_Sub16ArrayArrayArray3[local42][arg1][arg2] = new Class1_Sub16(local42, arg1, arg2);
			}
		}
		Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2].aClass39_1 = local8;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)V")
	public static void method4083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class1_Sub5_Sub21 local10 = Static278.method4266(10, arg2);
		local10.method4062();
		local10.anInt4864 = arg1;
		local10.anInt4862 = arg3;
		local10.anInt4863 = arg0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 128 || arg6 < 128 || arg1 > 13056 || arg6 > 13056) {
			Static165.anInt5548 = -1;
			Static105.anInt2226 = -1;
			return;
		}
		@Pc(36) int local36 = Static42.method768(arg1, Static132.anInt2608, arg6) - arg2;
		@Pc(40) int local40 = local36 - Static283.anInt5144;
		@Pc(44) int local44 = Class87.anIntArray173[Static53.anInt1161];
		@Pc(48) int local48 = Class87.anIntArray177[Static53.anInt1161];
		@Pc(52) int local52 = arg1 - Static273.anInt5035;
		@Pc(65) int local65 = Class87.anIntArray177[Static305.anInt5484];
		@Pc(69) int local69 = arg6 - Static87.anInt1875;
		@Pc(73) int local73 = Class87.anIntArray173[Static305.anInt5484];
		@Pc(83) int local83 = local52 * local65 + local69 * local73 >> 16;
		@Pc(94) int local94 = local69 * local65 - local73 * local52 >> 16;
		@Pc(96) int local96 = local83;
		@Pc(107) int local107 = local40 * local48 - local44 * local94 >> 16;
		@Pc(117) int local117 = local40 * local44 + local94 * local48 >> 16;
		if (local117 < 50) {
			Static165.anInt5548 = -1;
			Static105.anInt2226 = -1;
		} else if (Static71.aBoolean165) {
			@Pc(148) int local148 = arg0 * 512 >> 8;
			@Pc(154) int local154 = arg3 * 512 >> 8;
			Static165.anInt5548 = local96 * local148 / local117 + arg4;
			Static105.anInt2226 = local154 * local107 / local117 + arg5;
		} else {
			Static105.anInt2226 = arg5 + (local107 << 9) / local117;
			Static165.anInt5548 = arg4 + (local96 << 9) / local117;
		}
	}
}
