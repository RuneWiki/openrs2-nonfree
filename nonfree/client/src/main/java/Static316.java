import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "[Lclient!jm;")
	public static final Class107[] aClass107Array2 = new Class107[29];

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "Lclient!bn;")
	public static final Class25 aClass25_15 = new Class25(32);

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "[I")
	public static final int[] anIntArray309 = new int[3];

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "Lclient!bn;")
	public static final Class25 aClass25_16 = new Class25(16);

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "Lclient!bd;")
	public static final Class18 aClass18_17 = new Class18();

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "Z")
	public static boolean aBoolean225 = false;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
	public static void method3313(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class14_Sub2_Sub13 local12 = Static1.method5711(13, arg1);
		local12.method3540();
		local12.anInt3805 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILjava/lang/String;IIIZJZLjava/lang/String;IZ)V")
	public static void method3318(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) long arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class14_Sub4 local30 = new Class14_Sub4(128);
		local30.method2538(10);
		local30.method2509((arg6 ? 2 : 0) | (arg9 ? 1 : 0) | (arg4 ? 4 : 0));
		local30.method2544(arg5);
		local30.method2541(local8[0]);
		local30.method2527(arg1);
		local30.method2541(local8[1]);
		local30.method2509(Static74.anInt5346);
		local30.method2538(arg3);
		local30.method2538(arg0);
		local30.method2541(local8[2]);
		local30.method2509(arg2);
		local30.method2509(arg8);
		local30.method2541(local8[3]);
		local30.method2534(Static166.aBigInteger2, Static101.aBigInteger1);
		@Pc(120) Class14_Sub4 local120 = new Class14_Sub4(350);
		local120.method2527(arg7);
		@Pc(136) int local136 = 8 - Static333.method5739(arg7) % 8;
		for (@Pc(138) int local138 = 0; local138 < local136; local138++) {
			local120.method2538((int) (Math.random() * 255.0D));
		}
		local120.method2508(local8);
		Static164.aClass14_Sub4_Sub2_3.anInt2637 = 0;
		Static164.aClass14_Sub4_Sub2_3.method2538(22);
		Static164.aClass14_Sub4_Sub2_3.method2509(local30.anInt2637 + local120.anInt2637 + 2);
		Static164.aClass14_Sub4_Sub2_3.method2509(564);
		Static164.aClass14_Sub4_Sub2_3.method2495(local30.aByteArray74, local30.anInt2637);
		Static164.aClass14_Sub4_Sub2_3.method2495(local120.aByteArray74, local120.anInt2637);
		Static309.anInt5892 = 0;
		Static108.anInt2423 = 1;
		Static68.anInt1635 = 0;
		Static57.anInt1379 = -3;
	}
}
