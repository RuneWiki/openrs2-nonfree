import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!mg", name = "G", descriptor = "[I")
	public static int[] anIntArray375;

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "Lclient!sf;")
	public static Class157 aClass157_32 = new Class157(30);

	@OriginalMember(owner = "client!mg", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString129 = "Created gameworld";

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!g;IIILclient!ob;II)V")
	public static void method3155(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class93 arg4, @OriginalArg(6) int arg5) {
		if (arg4 == null) {
			return;
		}
		@Pc(29) int local29;
		if (Static16.anInt342 == 4) {
			local29 = (int) Static239.aFloat51 & 0x7FF;
		} else {
			local29 = (int) Static239.aFloat51 + Static301.anInt5810 & 0x7FF;
		}
		@Pc(48) int local48 = Math.max(arg0.anInt2057 / 2, arg0.anInt2031 / 2) + 10;
		@Pc(56) int local56 = arg5 * arg5 + arg3 * arg3;
		if (local56 > local48 * local48) {
			return;
		}
		@Pc(71) int local71 = Class1.anIntArray4[local29];
		@Pc(75) int local75 = Class1.anIntArray3[local29];
		if (Static16.anInt342 != 4) {
			local71 = local71 * 256 / (Static141.anInt3097 + 256);
			local75 = local75 * 256 / (Static141.anInt3097 + 256);
		}
		@Pc(106) int local106 = local75 * arg5 - local71 * arg3 >> 16;
		@Pc(116) int local116 = arg5 * local71 + arg3 * local75 >> 16;
		if (Static116.aBoolean184) {
			((Class93_Sub2) arg4).method3568(local116 + arg2 + arg0.anInt2057 / 2 - arg4.anInt4361 / 2, -(arg4.anInt4354 / 2) + -local106 + arg1 - -(arg0.anInt2031 / 2), (Class2_Sub8_Sub1_Sub2) arg0.method1555(false));
		} else {
			((Class93_Sub1) arg4).method2566(local116 + arg2 + arg0.anInt2057 / 2 - arg4.anInt4361 / 2, -(arg4.anInt4354 / 2) + arg0.anInt2031 / 2 + arg1 + -local106, arg0.anIntArray181, arg0.anIntArray176);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZZ)I")
	public static int method3156(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static221.method3670();
		for (@Pc(25) Class2_Sub11 local25 = arg0 ? (Class2_Sub11) Static164.aClass101_12.method2868() : (Class2_Sub11) Static164.aClass101_12.method2859(); local25 != null; local25 = (Class2_Sub11) Static164.aClass101_12.method2859()) {
			if ((local25.aLong43 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local25.aLong43 & 0x4000000000000000L) != 0L) {
					@Pc(54) int local54 = (int) local25.aLong214;
					Static64.anIntArray134[local54] = Static20.anIntArray55[local54];
					local25.method4743();
					return local54;
				}
				local25.method4743();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BILclient!ek;I)[Lclient!ka;")
	public static Class93_Sub1[] method3157(@OriginalArg(1) int arg0, @OriginalArg(2) Class42 arg1) {
		return Static187.method3282(arg1, arg0, 0) ? Static110.method1872() : null;
	}
}
