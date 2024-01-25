import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "[I")
	public static final int[] anIntArray553 = new int[14];

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_138 = new Class253(46, 4);

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray49 = new String[100];

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!vi;II)V")
	public static void method4853(@OriginalArg(1) Class26_Sub2_Sub4_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt7046 == arg1 && arg1 != -1) {
			@Pc(88) Class139 local88 = Static364.aClass151_2.method3293(arg1);
			@Pc(91) int local91 = local88.anInt3937;
			if (local91 == 1) {
				arg0.anInt7076 = 1;
				arg0.anInt7074 = 0;
				arg0.anInt7061 = 0;
				arg0.anInt7050 = 0;
				arg0.anInt7069 = arg2;
				Static454.method5772(local88, Static104.aClass26_Sub2_Sub4_Sub2_2 == arg0, arg0.anInt7383, arg0.aByte102, arg0.anInt7388, arg0.anInt7061);
			}
			if (local91 == 2) {
				arg0.anInt7074 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt7046 == -1 || Static364.aClass151_2.method3293(arg1).anInt3953 >= Static364.aClass151_2.method3293(arg0.anInt7046).anInt3953) {
			arg0.anInt7116 = arg0.anInt7117;
			arg0.anInt7069 = arg2;
			arg0.anInt7061 = 0;
			arg0.anInt7074 = 0;
			arg0.anInt7076 = 1;
			arg0.anInt7050 = 0;
			arg0.anInt7046 = arg1;
			if (arg0.anInt7046 != -1) {
				Static454.method5772(Static364.aClass151_2.method3293(arg0.anInt7046), Static104.aClass26_Sub2_Sub4_Sub2_2 == arg0, arg0.anInt7383, arg0.aByte102, arg0.anInt7388, arg0.anInt7061);
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZI)Z")
	public static boolean method4854(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBZI)I")
	public static int method4855(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class7_Sub27 local10 = Static288.method3810(arg1, arg0);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray324.length; local23++) {
				if (arg2 == local10.anIntArray323[local23]) {
					local21 += local10.anIntArray324[local23];
				}
			}
			return local21;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "()V")
	public static void method4856() {
		Static218.method3070(Static315.anInt5183);
	}
}
