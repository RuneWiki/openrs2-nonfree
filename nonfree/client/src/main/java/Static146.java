import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
	public static int anInt3812;

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
	public static int anInt3815;

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "[[B")
	public static final byte[][] aByteArrayArray6 = new byte[250][];

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1035 = Static158.method3034("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!qd", name = "I", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1036 = aClass60_1035;

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "[J")
	public static final long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)V")
	public static void method2942(@OriginalArg(1) int arg0) {
		if (!Static62.method1443(arg0)) {
			return;
		}
		@Pc(14) Class72[] local14 = Static197.aClass72ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(27) Class72 local27 = local14[local16];
			if (local27 != null) {
				local27.anInt3902 = 0;
				local27.anInt3941 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZI)Lclient!rd;")
	public static Class2_Sub1_Sub18 method2943(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub18 local10 = (Class2_Sub1_Sub18) Static168.aClass89_61.method3437((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static194.aClass13_39.method521(arg0, 16);
		local10 = new Class2_Sub1_Sub18();
		if (local20 != null) {
			local10.method3015(new Class2_Sub3(local20));
		}
		Static168.aClass89_61.method3432(local10, (long) arg0);
		return local10;
	}
}
