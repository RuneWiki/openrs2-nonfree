import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!pi", name = "S", descriptor = "Lclient!wd;")
	public static Class111 aClass111_35;

	@OriginalMember(owner = "client!pi", name = "T", descriptor = "[Lclient!gd;")
	public static Class2_Sub3_Sub8[] aClass2_Sub3_Sub8Array8;

	@OriginalMember(owner = "client!pi", name = "U", descriptor = "I")
	public static int anInt3727;

	@OriginalMember(owner = "client!pi", name = "L", descriptor = "Lclient!l;")
	public static Class2_Sub23_Sub1 aClass2_Sub23_Sub1_5 = new Class2_Sub23_Sub1(5000);

	@OriginalMember(owner = "client!pi", name = "R", descriptor = "Lclient!qe;")
	public static Class78 aClass78_660 = Static199.method3560("b12_full");

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIILclient!qf;JLclient!qf;Lclient!qf;)V")
	public static void method2897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) Class5 arg7) {
		@Pc(3) Class87 local3 = new Class87();
		local3.aClass5_6 = arg4;
		local3.anInt4411 = arg1 * 128 + 64;
		local3.anInt4413 = arg2 * 128 + 64;
		local3.anInt4414 = arg3;
		local3.aLong161 = arg5;
		local3.aClass5_5 = arg6;
		local3.aClass5_7 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class2_Sub12 local42 = Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt775; local46++) {
				@Pc(52) Class100 local52 = local42.aClass100Array3[local46];
				if ((local52.aLong169 & 0x400000L) == 4194304L) {
					@Pc(63) int local63 = local52.aClass5_8.method3773();
					if (local63 != -32768 && local63 < local34) {
						local34 = local63;
					}
				}
			}
		}
		local3.anInt4409 = -local34;
		if (Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2] == null) {
			Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2] = new Class2_Sub12(arg0, arg1, arg2);
		}
		Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2].aClass87_1 = local3;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZI)Lclient!qe;")
	public static Class78 method2898(@OriginalArg(2) int arg0) {
		return Static9.method189(arg0, true);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BII)V")
	public static void method2899(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static80.method1339(arg0)) {
			Static32.method3205(Static181.aClass64ArrayArray1[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(JB)V")
	public static void method2900(@OriginalArg(0) long arg0) {
		Static65.method1058();
		aClass2_Sub23_Sub1_5.anInt2703 = 0;
		aClass2_Sub23_Sub1_5.method2132(218);
		aClass2_Sub23_Sub1_5.method2103(arg0);
		Static15.anInt334 = 1;
		Static104.anInt2284 = 2;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)J")
	public static long method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub12 local7 = Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass104_1 == null ? 0L : local7.aClass104_1.aLong175;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZBLclient!oe;Lclient!oe;)V")
	public static void method2905(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class72 arg1, @OriginalArg(3) Class72 arg2) {
		Static53.aBoolean62 = arg0;
		Static34.aClass72_39 = arg2;
		Static184.aClass72_255 = arg1;
		Static184.aClass53_17 = new Class53(30);
	}

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)V")
	public static void method2906() {
		Static148.anApplet_Sub1_1.method457();
	}
}
