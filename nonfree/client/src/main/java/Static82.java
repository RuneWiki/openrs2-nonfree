import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Lclient!ah;")
	public static Class6 aClass6_10;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "D")
	public static double aDouble2;

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
	public static int anInt1950;

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "[[Lclient!ah;")
	public static Class6[][] aClass6ArrayArray1;

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "Lclient!nb;")
	public static Class1_Sub1_Sub6_Sub1 aClass1_Sub1_Sub6_Sub1_3;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "[I")
	public static int[] anIntArray229 = new int[100];

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
	public static int anInt1945 = 0;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!kh;")
	public static Class60 aClass60_637 = Static200.method3116("<col=ff0000>");

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "Lclient!eh;")
	public static Class27 aClass27_49 = new Class27(500);

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "Lclient!kh;")
	public static Class60 aClass60_638 = Static200.method3116("Starte 3D)2Softwarebibliothek)3");

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "Lclient!kh;")
	private static Class60 aClass60_640 = Static200.method3116("Unable to connect)3");

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "Lclient!kh;")
	public static Class60 aClass60_639 = aClass60_640;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "Lclient!kh;")
	private static Class60 aClass60_641 = Static200.method3116("Free world");

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "[Lclient!kh;")
	public static Class60[] aClass60Array13 = new Class60[8];

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "Lclient!kh;")
	public static Class60 aClass60_642 = aClass60_641;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "Lclient!kh;")
	public static Class60 aClass60_643 = aClass60_640;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
			Static104.anInt2368 = -1;
			Static52.anInt1422 = -1;
			return;
		}
		@Pc(32) int local32 = Static165.method2268(arg2, Static180.anInt3841, arg0) - arg3;
		@Pc(36) int local36 = arg2 - Static165.anInt2958;
		@Pc(40) int local40 = Class46.anIntArray226[Static134.anInt2897];
		@Pc(44) int local44 = local32 - Static28.anInt2840;
		@Pc(48) int local48 = Class46.anIntArray225[Static79.anInt1908];
		@Pc(52) int local52 = Class46.anIntArray226[Static79.anInt1908];
		@Pc(56) int local56 = Class46.anIntArray225[Static134.anInt2897];
		@Pc(63) int local63 = arg0 - Static17.anInt438;
		@Pc(74) int local74 = local52 * local36 + local63 * local48 >> 16;
		@Pc(85) int local85 = local48 * local36 - local63 * local52 >> 16;
		@Pc(87) int local87 = local74;
		@Pc(98) int local98 = local44 * local56 - local85 * local40 >> 16;
		@Pc(108) int local108 = local40 * local44 + local85 * local56 >> 16;
		if (local108 >= 50) {
			Static52.anInt1422 = (local87 << 9) / local108 + arg1;
			Static104.anInt2368 = (local98 << 9) / local108 + arg4;
		} else {
			Static52.anInt1422 = -1;
			Static104.anInt2368 = -1;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIILclient!dd;JLclient!dd;Lclient!dd;)V")
	public static void method1452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class9 arg6, @OriginalArg(7) Class9 arg7) {
		@Pc(3) Class78 local3 = new Class78();
		local3.aClass9_8 = arg4;
		local3.anInt3552 = arg1 * 128 + 64;
		local3.anInt3550 = arg2 * 128 + 64;
		local3.anInt3545 = arg3;
		local3.aLong118 = arg5;
		local3.aClass9_7 = arg6;
		local3.aClass9_9 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class1_Sub22 local42 = Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt3358; local46++) {
				@Pc(52) Class29 local52 = local42.aClass29Array3[local46];
				if ((local52.aLong43 & 0x400000L) == 4194304L) {
					@Pc(63) int local63 = local52.aClass9_3.method2902();
					if (local63 != -32768 && local63 < local34) {
						local34 = local63;
					}
				}
			}
		}
		local3.anInt3549 = -local34;
		if (Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2] == null) {
			Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2] = new Class1_Sub22(arg0, arg1, arg2);
		}
		Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2].aClass78_1 = local3;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III[Lclient!kh;)Lclient!kh;")
	public static Class60 method1453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class60[] arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
			if (arg2[arg1 + local9] == null) {
				arg2[arg1 + local9] = Static164.aClass60_1239;
			}
			local7 += arg2[local9 + arg1].anInt2439;
		}
		@Pc(39) byte[] local39 = new byte[local7];
		@Pc(41) int local41 = 0;
		@Pc(60) Class60 local60;
		for (@Pc(51) int local51 = 0; local51 < arg0; local51++) {
			local60 = arg2[arg1 + local51];
			Static221.method35(local60.aByteArray34, 0, local39, local41, local60.anInt2439);
			local41 += local60.anInt2439;
		}
		local60 = new Class60();
		local60.anInt2439 = local7;
		local60.aByteArray34 = local39;
		return local60;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public static void method1454() {
		Static96.aClass1_Sub9_Sub1_3.method953(24);
		for (@Pc(10) Class1_Sub11 local10 = (Class1_Sub11) Static10.aClass33_1.method1067(); local10 != null; local10 = (Class1_Sub11) Static10.aClass33_1.method1070()) {
			if (local10.anInt1627 == 0) {
				Static92.method1615(local10, true);
			}
		}
		if (Static168.aClass6_14 != null) {
			Static57.method1068(Static168.aClass6_14);
			Static168.aClass6_14 = null;
		}
	}
}
