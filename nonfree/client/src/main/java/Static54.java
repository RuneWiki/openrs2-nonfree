import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "F")
	public static float aFloat17;

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
	public static int anInt1162 = -1;

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "[I")
	public static final int[] anIntArray83 = new int[16];

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
	public static void method892() {
		Static316.anInt5474 = 0;
		Static378.anInt6415 = -3;
		Static385.anInt6453 = 0;
		Static103.anInt2415 = 0;
		Static305.anInt5413 = 1;
		Static362.anInt6210 = -1;
		Static235.aBoolean424 = false;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILclient!jo;IIILclient!sk;ILclient!dw;)V")
	public static void method894(@OriginalArg(0) int arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class3_Sub2_Sub1_Sub2 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class3_Sub2_Sub1_Sub1 arg6) {
		@Pc(14) Class2_Sub24 local14 = new Class2_Sub24();
		local14.anInt4285 = arg0 << 7;
		local14.anInt4279 = arg5;
		local14.anInt4276 = arg2 << 7;
		if (arg1 != null) {
			local14.aClass134_1 = arg1;
			@Pc(35) int local35 = arg1.anInt3670;
			@Pc(38) int local38 = arg1.anInt3652;
			if (arg3 == 1 || arg3 == 3) {
				local38 = arg1.anInt3670;
				local35 = arg1.anInt3652;
			}
			local14.anInt4277 = arg0 + local35 << 7;
			local14.anInt4290 = arg1.anInt3620;
			local14.anIntArray360 = arg1.anIntArray320;
			local14.anInt4286 = arg1.anInt3625;
			local14.anInt4278 = arg1.anInt3659;
			local14.anInt4289 = arg1.anInt3667;
			local14.anInt4291 = arg2 + local38 << 7;
			local14.anInt4282 = arg1.anInt3645 << 7;
			if (arg1.anIntArray322 != null) {
				local14.aBoolean311 = true;
				local14.method3466();
			}
			if (local14.anIntArray360 != null) {
				local14.anInt4283 = local14.anInt4290 + (int) (Math.random() * (double) (local14.anInt4278 - local14.anInt4290));
			}
			Static72.aClass14_7.method300(local14);
		} else if (arg6 != null) {
			local14.aClass3_Sub2_Sub1_Sub1_1 = arg6;
			@Pc(180) Class65 local180 = arg6.aClass65_1;
			if (local180.anIntArray155 != null) {
				local14.aBoolean311 = true;
				local180 = local180.method1710(Static344.aClass108_1);
			}
			if (local180 != null) {
				local14.anInt4291 = arg2 + local180.anInt2128 << 7;
				local14.anInt4277 = local180.anInt2128 + arg0 << 7;
				local14.anInt4286 = Static283.method1318(arg6);
				local14.anInt4289 = local180.anInt2144;
				local14.anInt4282 = local180.anInt2140 << 7;
			}
			Static446.aClass14_49.method300(local14);
		} else if (arg4 != null) {
			local14.aClass3_Sub2_Sub1_Sub2_5 = arg4;
			local14.anInt4277 = arg0 + arg4.method4935() << 7;
			local14.anInt4291 = arg4.method4935() + arg2 << 7;
			local14.anInt4286 = Static200.method4291(arg4);
			local14.anInt4289 = arg4.anInt6243;
			local14.anInt4282 = arg4.anInt6226 << 7;
			Static216.aClass163_38.method3764((long) arg4.anInt6137, local14);
			return;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IB)Z")
	public static boolean method895(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)V")
	public static void method897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class2_Sub5_Sub13 local10 = Static208.method3306(arg0, 1);
		local10.method4547();
		local10.anInt5641 = arg1;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BZI)V")
	public static void method900(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub38 local12 = Static448.method5748(arg1, arg0);
		if (local12 != null) {
			local12.method5866();
		}
	}
}
