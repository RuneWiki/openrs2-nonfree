import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cba", name = "p", descriptor = "Lclient!mt;")
	public static final Class228 aClass228_3 = new Class228(4, 1, 1, 1);

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(III)Z")
	public static boolean method1284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)Lclient!lda;")
	public static Class98_Sub1 method1286() {
		return Static128.anInt2638 < Static665.aClass98_Sub1Array3.length ? Static665.aClass98_Sub1Array3[Static128.anInt2638++] : null;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IZI)V")
	public static void method1287(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) Class3_Sub24 local8 = Static640.method8894(arg0, arg1);
		if (local8 != null) {
			local8.method9380();
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IZB)V")
	public static void method1289(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) Class3_Sub30 local9 = arg1 ? Static90.aClass3_Sub30_10 : Static195.aClass3_Sub30_4;
		if (local9 == null || arg0 < 0 || arg0 >= local9.anInt4268) {
			return;
		}
		@Pc(27) Class391 local27 = local9.aClass391Array1[arg0];
		if (local27.aByte181 != -1) {
			return;
		}
		@Pc(40) String local40 = local27.aString127;
		@Pc(45) Class3_Sub34 local45 = Static172.method3123(Static163.aClass375_1, Static669.aClass218_156);
		local45.aClass3_Sub25_Sub1_2.method8614(Static440.method6269(local40) + 3);
		local45.aClass3_Sub25_Sub1_2.method8614(arg1 ? 1 : 0);
		local45.aClass3_Sub25_Sub1_2.method8649(arg0);
		local45.aClass3_Sub25_Sub1_2.method8583(local40);
		Static441.method6275(local45);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZB)V")
	public static void method1290(@OriginalArg(0) boolean arg0) {
		Static638.aClass239_10.method9247(Static316.aClass13_10.method8528());
		@Pc(10) int[] local10 = Static316.aClass13_10.Y();
		Static111.anInt2276 = local10[0];
		Static254.anInt4540 = local10[2];
		Static72.anInt1350 = local10[3];
		Static445.anInt7377 = local10[1];
		if (arg0) {
			Static316.aClass13_10.DA(Static18.anInt438, Static498.anInt10144, Static519.anInt8358, Static372.anInt5975);
			Static341.method5109(Static433.aDouble27);
		} else {
			Static316.aClass13_10.DA(Static31.anInt617, Static173.anInt3444, Static97.anInt642, Static503.anInt8161);
			Static341.method5109(Static160.aDouble5);
		}
	}
}
