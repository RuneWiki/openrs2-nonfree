import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "Lclient!ui;")
	public static Class230 aClass230_60;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "Lclient!bm;")
	public static Class28 aClass28_3;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "[I")
	public static final int[] anIntArray495 = new int[200];

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILjava/lang/String;JZZILjava/lang/String;IZBI)V")
	public static void method3214(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class1_Sub33 local30 = new Class1_Sub33(128);
		local30.method5165(10);
		local30.method5138((arg4 ? 4 : 0) | (arg3 ? 1 : 0) | (arg8 ? 2 : 0));
		local30.method5127(arg2);
		local30.method5142(local8[0]);
		local30.method5143(arg1);
		local30.method5142(local8[1]);
		local30.method5138(Static380.anInt6150);
		local30.method5165(arg0);
		local30.method5165(arg9);
		local30.method5142(local8[2]);
		local30.method5138(arg5);
		local30.method5138(arg7);
		local30.method5142(local8[3]);
		local30.method5130(Static356.aBigInteger3, Static122.aBigInteger1);
		@Pc(116) Class1_Sub33 local116 = new Class1_Sub33(350);
		local116.method5143(arg6);
		@Pc(128) int local128 = 8 - Static56.method903(arg6) % 8;
		for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
			local116.method5165((int) (Math.random() * 255.0D));
		}
		local116.method5175(local8);
		Static209.aClass1_Sub33_Sub2_2.lb = 0;
		Static209.aClass1_Sub33_Sub2_2.method5165(Static159.aClass66_8.anInt1518);
		Static209.aClass1_Sub33_Sub2_2.method5138(local30.lb + local116.lb + 2);
		Static209.aClass1_Sub33_Sub2_2.method5138(575);
		Static209.aClass1_Sub33_Sub2_2.method5152(local30.lb, local30.aByteArray86);
		Static209.aClass1_Sub33_Sub2_2.method5152(local116.lb, local116.aByteArray86);
		Static19.anInt321 = 0;
		Static300.anInt5112 = 1;
		Static288.anInt4949 = 0;
		Static324.anInt2339 = -3;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I")
	public static int method3217(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIII)I")
	public static int method3218(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg0;
		}
		@Pc(13) int local13 = 128 - arg2;
		@Pc(27) int local27 = (arg0 & 0x7F) * local13 + arg2 * (arg1 & 0x7F) >> 7;
		@Pc(41) int local41 = (arg1 & 0x380) * arg2 + local13 * (arg0 & 0x380) >> 7;
		@Pc(55) int local55 = local13 * (arg0 & 0xFC00) + (arg1 & 0xFC00) * arg2 >> 7;
		return local27 & 0x7F | local55 & 0xFC00 | local41 & 0x380;
	}
}
