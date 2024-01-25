import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Lclient!qp;")
	public static Class201 aClass201_2;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
	public static int anInt6515 = -1;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)V")
	public static void method5393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class3_Sub3_Sub4 local13 = Static281.method3883(9, arg1);
		local13.method1003();
		local13.anInt970 = arg0;
		local13.anInt972 = arg2;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZBI)V")
	public static void method5395(@OriginalArg(1) boolean arg0) {
		Static203.anInt3626 = 22050;
		Static158.aBoolean222 = arg0;
		Static293.anInt5087 = 2;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([I[ILclient!nq;III)Lclient!at;")
	public static Class14_Sub1 method5396(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class167_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg3 * arg4];
		for (@Pc(12) int local12 = 0; local12 < arg4; local12++) {
			@Pc(28) int local28 = arg3 * local12 + arg0[local12];
			for (@Pc(30) int local30 = 0; local30 < arg1[local12]; local30++) {
				local10[local28++] = -1;
			}
		}
		return new Class14_Sub1(arg2, arg3, arg4, local10);
	}
}
