import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "Lclient!qj;")
	public static Class165 aClass165_14;

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
	public static int anInt891;

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "[S")
	public static short[] aShortArray16;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "[I")
	public static int[] anIntArray110 = new int[2];

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "[I")
	public static final int[] anIntArray111 = new int[14];

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
	public static final int anInt892 = -9017772;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)Lclient!pe;")
	public static Class1_Sub1_Sub16 method944(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub16 local10 = (Class1_Sub1_Sub16) Static264.aClass156_11.method4258((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static25.aClass165_8.method4508(arg0, 5);
		local10 = new Class1_Sub1_Sub16();
		if (local20 != null) {
			local10.method4210(new Class1_Sub7(local20));
		}
		Static264.aClass156_11.method4256(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!aa;IILclient!cj;BII)Lclient!lf;")
	public static Class90 method945(@OriginalArg(0) int arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class31 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static350.aClass100_1.anInt2843 = arg2;
		Static350.aClass100_1.anInt2847 = arg3;
		Static350.aClass100_1.aBoolean252 = arg4 != null;
		Static350.aClass100_1.anInt2848 = arg1.anInt3495;
		Static350.aClass100_1.anInt2840 = arg0;
		Static350.aClass100_1.anInt2846 = arg6;
		Static350.aClass100_1.anInt2841 = arg5;
		return (Class90) Static234.aClass33_1.method1158(Static350.aClass100_1);
	}
}
