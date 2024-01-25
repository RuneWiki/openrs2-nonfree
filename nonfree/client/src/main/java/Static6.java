import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "Lclient!as;")
	public static Class16 aClass16_5;

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array23;

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
	public static int anInt6087;

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
	public static int anInt6079 = 0;

	@OriginalMember(owner = "client!ae", name = "C", descriptor = "Lclient!sj;")
	public static Class181 aClass181_48 = null;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I")
	public static int method5168(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjava/lang/String;ZZJIILjava/lang/String;IZI)V")
	public static void method5169(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) long arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class3_Sub4 local30 = new Class3_Sub4(128);
		local30.method3614(10);
		local30.method3660((arg8 ? 1 : 0) | (arg2 ? 2 : 0) | (arg1 ? 4 : 0));
		local30.method3668(arg3);
		local30.method3650(local8[0]);
		local30.method3624(arg0);
		local30.method3650(local8[1]);
		local30.method3660(Static329.anInt6344);
		local30.method3614(arg5);
		local30.method3614(arg4);
		local30.method3650(local8[2]);
		local30.method3660(arg9);
		local30.method3660(arg7);
		local30.method3650(local8[3]);
		local30.method3626(Static248.aBigInteger2, Static41.aBigInteger1);
		@Pc(120) Class3_Sub4 local120 = new Class3_Sub4(350);
		local120.method3624(arg6);
		@Pc(138) int local138 = 8 - Static54.method909(arg6) % 8;
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			local120.method3614((int) (Math.random() * 255.0D));
		}
		local120.method3654(local8);
		Static291.aClass3_Sub4_Sub2_3.anInt4268 = 0;
		Static291.aClass3_Sub4_Sub2_3.method3614(22);
		Static291.aClass3_Sub4_Sub2_3.method3660(local30.anInt4268 + local120.anInt4268 + 2);
		Static291.aClass3_Sub4_Sub2_3.method3660(556);
		Static291.aClass3_Sub4_Sub2_3.method3662(local30.anInt4268, local30.aByteArray70);
		Static291.aClass3_Sub4_Sub2_3.method3662(local120.anInt4268, local120.aByteArray70);
		Static273.anInt5473 = 0;
		Static307.anInt6097 = 0;
		Static92.anInt1817 = -3;
		Static104.anInt2185 = 1;
	}
}
