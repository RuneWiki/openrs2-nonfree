import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!mv", name = "L", descriptor = "Lclient!wh;")
	public static Class263 aClass263_1;

	@OriginalMember(owner = "client!mv", name = "R", descriptor = "I")
	public static int anInt4782;

	@OriginalMember(owner = "client!mv", name = "u", descriptor = "Lclient!di;")
	public static final Class54 aClass54_68 = new Class54(35, 4);

	@OriginalMember(owner = "client!mv", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString46 = null;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZII)I")
	public static int method3856(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 1023 - arg1;
		} else if (local7 == 2) {
			return 1023 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I[Lclient!l;)V")
	public static void method3857(@OriginalArg(1) Class17[] arg0) {
		Static79.anInt1766 = arg0.length;
		Static89.anIntArray160 = new int[Static79.anInt1766 + 10];
		Static90.aClass17Array3 = new Class17[Static79.anInt1766 + 10];
		Static457.method684(arg0, 0, Static90.aClass17Array3, 0, Static79.anInt1766);
		for (@Pc(26) int local26 = 0; local26 < Static79.anInt1766; local26++) {
			Static89.anIntArray160[local26] = Static90.aClass17Array3[local26].T();
		}
		for (@Pc(41) int local41 = Static79.anInt1766; local41 < Static90.aClass17Array3.length; local41++) {
			Static89.anIntArray160[local41] = 12;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BLclient!sk;)V")
	public static void method3859(@OriginalArg(1) Class3_Sub2_Sub1_Sub2 arg0) {
		@Pc(16) Class2_Sub24 local16 = (Class2_Sub24) Static216.aClass163_38.method3769((long) arg0.anInt6137);
		if (local16 == null) {
			Static54.method894(arg0.anIntArray525[0], null, arg0.anIntArray524[0], 0, arg0, arg0.aByte89, null);
		} else {
			local16.method3466();
		}
	}
}
