import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "Lclient!m;")
	public static Interface8 anInterface8_7;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
	public static int anInt3949 = 1;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Z")
	public static boolean method3163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static417.method5650(arg1, arg0) & Static122.method1778(arg1, arg0);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Z")
	public static boolean method3164() {
		return Static415.anInt7247 == 0 ? Static151.aClass2_Sub18_Sub2_1.method2912() : true;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)I")
	public static int method3165(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(22) int local22 = (arg0 & 0x7F) * 96 >> 7;
		if (local22 < 2) {
			local22 = 2;
		} else if (local22 > 126) {
			local22 = 126;
		}
		return local22 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIZFZII)[I")
	public static int[] method3166(@OriginalArg(4) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class2_Sub1_Sub27 local10 = new Class2_Sub1_Sub27();
		local10.anInt5928 = (int) (arg0 * 4096.0F);
		local10.anInt5920 = 8;
		local10.anInt5927 = 8;
		local10.aBoolean520 = true;
		local10.anInt5923 = 35;
		local10.anInt5922 = 4;
		local10.method6034();
		Static447.method3797(2048, 1);
		local10.method4737(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!md;I)Lclient!bw;")
	public static Class31_Sub1 method3168(@OriginalArg(0) Class2_Sub20 arg0) {
		return new Class31_Sub1(arg0.method3701(), arg0.method3701(), arg0.method3701(), arg0.method3701(), arg0.method3748(), arg0.method3748(), arg0.method3737());
	}
}
