import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!ki", name = "fb", descriptor = "F")
	public static float aFloat132;

	@OriginalMember(owner = "client!ki", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString56 = "";

	@OriginalMember(owner = "client!ki", name = "hb", descriptor = "Lclient!oh;")
	public static final Class252 aClass252_10 = new Class252(9, 2);

	@OriginalMember(owner = "client!ki", name = "jb", descriptor = "[I")
	public static final int[] anIntArray274 = new int[4096];

	@OriginalMember(owner = "client!ki", name = "ub", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_65 = new Class208(15, 8);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)I")
	public static int method3981(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static155.anInt2940 == -1) {
			return 1;
		}
		if (Static286.anInt5239 != arg1) {
			Static291.method4350(Static375.aClass253_17.method5453(Static161.anInt3095), arg1);
			if (Static286.anInt5239 != arg1) {
				return -1;
			}
		}
		try {
			@Pc(36) Dimension local36 = Static103.aCanvas2.getSize();
			Static307.method6069(Static375.aClass253_17.method5453(Static161.anInt3095), Static339.aClass96_9, true, Static31.aClass78_18, Static552.aClass352_20);
			@Pc(59) Class231 local59 = Static317.method7563(Static155.anInt2940, Static184.aClass308_76);
			@Pc(62) long local62 = Static480.method6650();
			Static31.aClass78_18.JA();
			Static160.aClass34_1.NA(0, Static513.anInt8858, 0);
			Static31.aClass78_18.method6812(Static160.aClass34_1);
			Static31.aClass78_18.la(local36.width / 2, local36.height / 2, 512, 512);
			Static31.aClass78_18.ra(1.0F);
			Static31.aClass78_18.VA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(103) Class52 local103 = Static31.aClass78_18.method6817(local59, 2048, 64, 64, 768);
			@Pc(105) int local105 = 0;
			label41: for (@Pc(107) int local107 = 0; local107 < 500; local107++) {
				Static31.aClass78_18.ja(0);
				Static31.aClass78_18.ya();
				for (@Pc(116) int local116 = 15; local116 >= 0; local116--) {
					for (@Pc(120) int local120 = 0; local120 <= local116; local120++) {
						Static586.aClass34_6.NA((int) ((float) Static165.anInt3157 * (-((float) local116 / 2.0F) + (float) local120)), 0, Static165.anInt3157 * (local116 + 1));
						local105++;
						local103.method7413(Static586.aClass34_6, null, 0);
						if (Static480.method6650() - local62 >= (long) arg0) {
							break label41;
						}
					}
				}
			}
			Static31.aClass78_18.method6834();
			@Pc(189) long local189 = (long) (local105 * 1000) / (Static480.method6650() - local62);
			Static31.aClass78_18.ja(0);
			Static31.aClass78_18.ya();
			return (int) local189;
		} catch (@Pc(198) Throwable local198) {
			local198.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIBI)Z")
	public static boolean method3983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static85.aByteArrayArrayArray1[0][arg2][arg3] & 0x2) != 0) {
			return true;
		} else if ((Static85.aByteArrayArrayArray1[arg1][arg2][arg3] & 0x10) == 0) {
			return arg0 == Static65.method1050(arg1, arg2, arg3);
		} else {
			return false;
		}
	}
}
