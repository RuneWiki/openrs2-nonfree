import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "[I")
	public static int[] anIntArray301;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
	public static int anInt2658;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
	public static int anInt2654 = 0;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Z")
	public static boolean aBoolean200 = false;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Z")
	public static boolean aBoolean201 = false;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "[I")
	public static final int[] anIntArray302 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIB)B")
	public static byte method2495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B[S)[S")
	public static short[] method2496(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) short[] local18 = new short[arg0.length];
			Static406.method5652(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Lclient!md;")
	public static Class2_Sub1_Sub10 method2497(@OriginalArg(0) int arg0) {
		@Pc(18) Class2_Sub1_Sub10 local18 = (Class2_Sub1_Sub10) Static6.aClass55_1.method1250((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(33) byte[] local33;
		if (arg0 >= 32768) {
			local33 = Static338.aClass71_81.method1555(1, arg0 & 0x7FFF);
		} else {
			local33 = Static217.aClass71_52.method1555(1, arg0);
		}
		local18 = new Class2_Sub1_Sub10();
		if (local33 != null) {
			local18.method3614(new Class2_Sub13(local33));
		}
		if (arg0 >= 32768) {
			local18.method3615();
		}
		Static6.aClass55_1.method1248((long) arg0, local18);
		return local18;
	}
}
