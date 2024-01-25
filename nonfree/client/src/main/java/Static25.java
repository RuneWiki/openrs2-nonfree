import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!av", name = "E", descriptor = "Lclient!an;")
	public static Class16 aClass16_5;

	@OriginalMember(owner = "client!av", name = "u", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!av", name = "C", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_6 = new Class45(22, -1);

	@OriginalMember(owner = "client!av", name = "F", descriptor = "I")
	public static int anInt419 = 0;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIII)V")
	public static void method529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class12_Sub4_Sub1 local8 = Static389.method6156(9, arg0);
		local8.method820();
		local8.anInt806 = arg1;
		local8.anInt808 = arg2;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "([BII)[B")
	public static byte[] method530(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) byte[] local11 = new byte[arg1];
		Static554.method3498(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
