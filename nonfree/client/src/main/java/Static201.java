import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!ve", name = "hb", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ve", name = "qb", descriptor = "Lclient!qc;")
	public static Class3_Sub3_Sub2_Sub2 aClass3_Sub3_Sub2_Sub2_4;

	@OriginalMember(owner = "client!ve", name = "cb", descriptor = "[I")
	public static final int[] anIntArray357 = new int[1000];

	@OriginalMember(owner = "client!ve", name = "eb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2043 = Static193.method3027("p11_full");

	@OriginalMember(owner = "client!ve", name = "nb", descriptor = "I")
	public static int anInt4110 = 0;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V")
	public static void method3204() {
		@Pc(10) int local10 = Static105.anInt2111 + Static144.aClass26_Sub2_Sub1_1.anInt2593;
		if (Static81.aBooleanArray4[98]) {
			Static53.anInt1131 += (12 - Static53.anInt1131) / 2;
		} else if (Static81.aBooleanArray4[99]) {
			Static53.anInt1131 += (-Static53.anInt1131 - 12) / 2;
		} else {
			Static53.anInt1131 /= 2;
		}
		if (Static81.aBooleanArray4[96]) {
			Static37.anInt3222 += (-Static37.anInt3222 - 24) / 2;
		} else if (Static81.aBooleanArray4[97]) {
			Static37.anInt3222 += (24 - Static37.anInt3222) / 2;
		} else {
			Static37.anInt3222 /= 2;
		}
		Static179.anInt1329 += Static37.anInt3222 / 2;
		@Pc(88) int local88 = Static198.anInt4041 + Static144.aClass26_Sub2_Sub1_1.anInt2611;
		if (Static119.anInt2412 - local10 < -500 || Static119.anInt2412 - local10 > 500 || Static47.anInt972 - local88 < -500 || Static47.anInt972 - local88 > 500) {
			Static119.anInt2412 = local10;
			Static47.anInt972 = local88;
		}
		if (local10 != Static119.anInt2412) {
			Static119.anInt2412 += (local10 - Static119.anInt2412) / 16;
		}
		if (Static47.anInt972 != local88) {
			Static47.anInt972 += (local88 - Static47.anInt972) / 16;
		}
		Static97.anInt2019 += Static53.anInt1131 / 2;
		Static113.method1638();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZZZ)Lclient!kh;")
	public static Class52_Sub1 method3205(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Class18 local10 = null;
		if (Static92.aClass82_3 != null) {
			local10 = new Class18(arg0, Static92.aClass82_3, Static118.aClass82Array1[arg0], 1000000);
		}
		return new Class52_Sub1(local10, Static97.aClass18_1, arg0, arg2, arg3, arg1);
	}
}
