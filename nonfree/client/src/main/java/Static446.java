import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
	public static int anInt7039;

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
	public static int anInt7040;

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
	public static int anInt7032 = 0;

	@OriginalMember(owner = "client!wb", name = "K", descriptor = "Z")
	public static boolean aBoolean613 = false;

	@OriginalMember(owner = "client!wb", name = "U", descriptor = "Lclient!hm;")
	public static Class107 aClass107_16 = null;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
	public static void method5650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg2) {
			Static298.method3977(arg2, arg1, arg0, Static194.anIntArrayArray28[arg3]);
		} else {
			Static298.method3977(arg0, arg1, arg2, Static194.anIntArrayArray28[arg3]);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIZ)I")
	public static int method5651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class1_Sub28 local8 = Static133.method1698(arg2, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && local8.anIntArray291.length > arg1) {
			return local8.anIntArray291[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBI)Z")
	public static boolean method5652(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([BI)[B")
	public static byte[] method5654(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static471.method3062(arg0, 0, local14, 0, local11);
		return local14;
	}
}
