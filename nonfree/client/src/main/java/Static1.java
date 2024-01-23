import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "Lclient!cg;")
	public static Class22 aClass22_1;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "[I")
	public static int[] anIntArray1 = new int[2];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	public static void method2(@OriginalArg(1) int arg0) {
		Static182.method2940();
		Static213.method3348();
		@Pc(16) int local16 = Static198.method3233(arg0).anInt3361;
		if (local16 == 0) {
			return;
		}
		@Pc(27) int local27 = Static298.anIntArray414[arg0];
		if (local16 == 9) {
			Static150.anInt2944 = local27;
		}
		if (local16 == 6) {
			Static278.anInt5381 = local27;
		}
		if (local16 == 5) {
			Static115.anInt2331 = local27;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public static void method3() {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 104; local17++) {
			for (@Pc(24) int local24 = 0; local24 < 104; local24++) {
				if (Static55.method1059(local15, Static261.aClass4_Sub21ArrayArrayArray4, local24, local17, true)) {
					local15++;
				}
				if (local15 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)V")
	public static void method4() {
		Static136.aClass172_23.method4349(5);
		Static177.aClass172_34.method4349(5);
		Static95.aClass172_18.method4349(5);
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)Lclient!dj;")
	public static Class34 method5(@OriginalArg(0) int arg0) {
		@Pc(16) Class34 local16 = (Class34) Static175.aClass172_32.method4347((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(26) byte[] local26 = Static127.aClass22_41.method665(4, arg0);
		local16 = new Class34();
		if (local26 != null) {
			local16.method1031(new Class4_Sub24(local26), arg0);
		}
		Static175.aClass172_32.method4345(local16, (long) arg0);
		return local16;
	}
}
