import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
	public static int anInt9266;

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "[I")
	public static final int[] anIntArray678 = new int[1];

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)Z")
	public static boolean method7656(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) boolean local22 = (arg0 & 0x37) == 0 ? Static385.method5715(arg0, arg1) : Static212.method3350(arg1, arg0);
		return Static266.method3896(arg0, arg1) | (arg1 & 0x10000) != 0 | local22;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZII)Lclient!wia;")
	public static Class386 method7657(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class345 local5 = null;
		if (Static388.aClass179_2 != null) {
			local5 = new Class345(arg1, Static388.aClass179_2, Static438.aClass179Array1[arg1], 1000000);
		}
		Static177.aClass167_Sub1Array1[arg1] = Static567.aClass347_1.method8433(arg1, local5, Static322.aClass345_3);
		Static177.aClass167_Sub1Array1[arg1].method3707();
		return new Class386(Static177.aClass167_Sub1Array1[arg1], arg0, arg2);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZIII)V")
	public static void method7658(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(7) int local7 = arg1 << 3;
		@Pc(11) int local11 = arg0 << 3;
		Static543.aFloat228 = (float) local11;
		Static2.aFloat1 = (float) local7;
		if (Static378.anInt6935 == 2) {
			Static219.anInt4123 = local11;
			Static4.anInt27 = 0;
			Static668.anInt11106 = local7;
		}
		Static635.method8862();
		Static137.aBoolean207 = true;
	}
}
