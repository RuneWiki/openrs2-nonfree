import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Lclient!sv;")
	public static Class2_Sub13 aClass2_Sub13_5;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Lclient!vv;")
	public static final Class261 aClass261_9 = new Class261();

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
	public static int anInt3896 = 0;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method3082(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static131.aClass134_42.method2720(Static331.anInt5597) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static30.aClass134_14.method2720(Static331.anInt5597) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V")
	public static void method3083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class2_Sub5_Sub11 local12 = Static316.method4316(1, arg0);
		local12.method3098();
		local12.anInt3911 = arg1;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIII)V")
	public static void method3085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static282.anInt3475 / (float) Static282.anInt3468;
		@Pc(11) int local11 = arg0;
		@Pc(13) int local13 = arg2;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg0);
		} else {
			local11 = (int) ((float) arg2 / local9);
		}
		@Pc(40) int local40 = arg1 - (arg2 - local13) / 2;
		@Pc(49) int local49 = arg3 - (arg0 - local11) / 2;
		Static379.anInt6865 = Static282.anInt3468 * local49 / local11;
		Static49.anInt857 = -1;
		Static301.anInt3360 = Static282.anInt3475 - Static282.anInt3475 * local40 / local13;
		Static435.anInt7039 = -1;
		Static108.method1681();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)Z")
	public static boolean method3086() {
		@Pc(12) Class2 local12 = Static261.aClass156_13.aClass2_159.aClass2_263;
		if (local12 == null || local12 == Static261.aClass156_13.aClass2_159) {
			return false;
		}
		@Pc(23) Class2_Sub46 local23 = (Class2_Sub46) local12;
		if (local23.anInt7283 >= 2000) {
			local23.anInt7283 -= 2000;
		}
		return local23.anInt7283 == 1002;
	}
}
