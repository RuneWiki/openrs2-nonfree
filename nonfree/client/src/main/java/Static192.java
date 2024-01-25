import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "[Lclient!lv;")
	public static Class212[] aClass212Array1;

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
	public static int anInt3745 = 0;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "Lclient!hu;")
	public static final Class147 aClass147_6 = new Class147("", 15);

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "[I")
	public static final int[] anIntArray181 = new int[1000];

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
	public static int anInt3751 = 0;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!f;ILclient!n;IILclient!ua;BI)V")
	public static void method3340(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class225 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6 arg5, @OriginalArg(7) int arg6) {
		if (arg0 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static166.anInt3419 == 4) {
			local16 = (int) Static201.aFloat128 & 0x3FFF;
		} else {
			local16 = Static368.anInt7167 + (int) Static201.aFloat128 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg2.anInt6529 / 2, arg2.anInt6521 / 2) + 10;
		@Pc(44) int local44 = arg4 * arg4 + arg3 * arg3;
		if (local35 * local35 < local44) {
			return;
		}
		@Pc(54) int local54 = Class4_Sub27.anIntArray296[local16];
		@Pc(58) int local58 = Class4_Sub27.anIntArray297[local16];
		if (Static166.anInt3419 != 4) {
			local54 = local54 * 256 / (Static595.anInt10298 + 256);
			local58 = local58 * 256 / (Static595.anInt10298 + 256);
		}
		@Pc(89) int local89 = arg4 * local58 + arg3 * local54 >> 14;
		@Pc(99) int local99 = arg3 * local58 - local54 * arg4 >> 14;
		arg0.method8186(local89 + arg2.anInt6529 / 2 + arg1 - arg0.A() / 2, -local99 + (arg6 - -(arg2.anInt6521 / 2)) + -(arg0.ca() / 2), arg5, arg1, arg6);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method3342(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static135.anInt2897 = -1;
		Static313.anInt4728 = 1;
		Static263.method4439(arg0, false, arg1);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZBIIIILclient!jn;)V")
	public static void method3345(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class176 arg3) {
		if (arg2 <= 0) {
			Static410.method6484(arg1, arg3, arg0);
			return;
		}
		Static450.aBoolean599 = false;
		Static353.anInt6872 = arg1;
		Static342.anInt6643 = 1;
		Static451.aClass176_108 = arg3;
		Static544.anInt9651 = 0;
		Static280.aClass4_Sub7_Sub3_2 = null;
		Static480.anInt10083 = arg0;
		Static472.anInt8704 = Static405.aClass4_Sub7_Sub3_4.method5467() / arg2;
		if (Static472.anInt8704 < 1) {
			Static472.anInt8704 = 1;
		}
	}
}
