import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "Lclient!aj;")
	public static Class15 aClass15_96;

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_88 = new Class218(25, 15);

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)Z")
	public static boolean method5315(@OriginalArg(0) int arg0) {
		if (arg0 == 13 || arg0 == 58 || arg0 == 23 || arg0 == 17 || arg0 == 1012) {
			return true;
		} else {
			return arg0 == 22 || arg0 == 1008;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!wc;BIII)V")
	public static void method5316(@OriginalArg(0) Class28_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(15) int local15 = arg0.anIntArray956[0];
		@Pc(20) int local20 = arg0.anIntArray955[0];
		if (local15 < 0 || local15 >= Static158.anInt927 || local20 < 0 || local20 >= Static515.anInt8292 || (arg2 < 0 || arg2 >= Static158.anInt927 || arg1 < 0 || Static515.anInt8292 <= arg1)) {
			return;
		}
		@Pc(73) int local73 = Static180.method3220(arg1, arg0.method9314(), Static597.anIntArray826, 0, true, local15, Static62.anIntArray112, local20, 0, Static1.aClass252Array5[arg0.aByte174], 0, arg2, -4, 0);
		if (local73 >= 1 && local73 <= 3) {
			for (@Pc(85) int local85 = 0; local85 < local73 - 1; local85++) {
				arg0.method9101(Static62.anIntArray112[local85], (byte) 2, Static597.anIntArray826[local85]);
			}
		}
	}
}
