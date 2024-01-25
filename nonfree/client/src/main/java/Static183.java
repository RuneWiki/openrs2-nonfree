import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!je", name = "x", descriptor = "I")
	public static int anInt3440;

	@OriginalMember(owner = "client!je", name = "A", descriptor = "Z")
	public static boolean aBoolean268;

	@OriginalMember(owner = "client!je", name = "B", descriptor = "Lclient!bp;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!je", name = "C", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_51 = new Class96("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!je", name = "u", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_178 = new Class12(65, 6);

	@OriginalMember(owner = "client!je", name = "y", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_74 = new Class254(70, 4);

	@OriginalMember(owner = "client!je", name = "z", descriptor = "[J")
	public static final long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;BC)I")
	public static int method2944(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local10; local20++) {
			if (arg0.charAt(local20) == arg1) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIILclient!ir;Lclient!ir;IIIII)V")
	public static void method2947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class47_Sub1_Sub5 arg3, @OriginalArg(4) Class47_Sub1_Sub5 arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) int local7 = arg4.method4319();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class78 local20 = (Class78) Static323.aClass151_139.method3288((long) local7);
		if (local20 == null) {
			@Pc(27) Class63[] local27 = Static457.method1166(Static353.aClass109_79, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static447.aClass121_11.method4589(local27[0]);
			Static323.aClass151_139.method3291((long) local7, local20);
		}
		Static435.method4778(0, arg1 >> 1, arg0 >> 1, arg3.anInt7060, arg3.aByte97, arg3.anInt7066, arg3.method4317() * 64);
		@Pc(73) int local73 = Static116.anIntArray114[0] + arg5 - 18;
		@Pc(81) int local81 = local73 + arg6 / 4 * 18;
		@Pc(89) int local89 = arg2 + Static116.anIntArray114[1] - 70;
		@Pc(97) int local97 = local89 + arg6 % 4 * 18;
		local20.method6003(local81, local97);
		if (arg3 == arg4) {
			Static447.aClass121_11.method4601(18, local81 - 1, 18, -256, local97 - 1);
		}
		@Pc(119) Class36_Sub4 local119 = Static370.method5896();
		local119.aClass47_Sub1_Sub5_1 = arg4;
		local119.anInt3857 = local81 + 16;
		local119.anInt3859 = local81;
		local119.anInt3858 = local97 + 16;
		local119.anInt3860 = local97;
		Static337.aClass242_6.method5501(local119);
	}
}
