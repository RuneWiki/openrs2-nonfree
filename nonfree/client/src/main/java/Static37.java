import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bf", name = "T", descriptor = "Lclient!dw;")
	public static Class70_Sub1 aClass70_Sub1_1;

	@OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
	public static int anInt878;

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "[[B")
	public static final byte[][] aByteArrayArray1 = new byte[50][];

	@OriginalMember(owner = "client!bf", name = "O", descriptor = "Lclient!ja;")
	public static final Class158 aClass158_1 = new Class158(15, 0, 1, 0);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIILclient!ps;)V")
	public static void method656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9_Sub1_Sub5 arg4) {
		@Pc(4) Class63 local4 = Static343.method5228(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt8975 = (arg1 << Static458.anInt7508) + Static122.anInt2780;
		arg4.anInt8977 = arg3;
		arg4.anInt8980 = (arg2 << Static458.anInt7508) + Static122.anInt2780;
		if (local4.aClass9_Sub1_Sub3_1 != null) {
			arg4.anInt8977 -= local4.aClass9_Sub1_Sub3_1.aShort42;
		}
		local4.aClass9_Sub1_Sub5_1 = arg4;
		@Pc(44) int local44 = Static29.aClass139Array6 == Static168.aClass139Array22 ? 1 : 0;
		if (arg4.method7481()) {
			if (arg4.method7473()) {
				Static239.aClass9_Sub1ArrayArray2[local44][Static343.anIntArray471[local44]++] = arg4;
				return;
			}
			Static499.aClass9_Sub1ArrayArray3[local44][Static332.anIntArray459[local44]++] = arg4;
			return;
		}
		Static225.aClass9_Sub1ArrayArray1[local44][Static1.anIntArray1[local44]++] = arg4;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)I")
	public static int method657() {
		return 16;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V")
	public static void method659(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static363.method5457(arg0, 6);
		local8.method845();
	}
}
