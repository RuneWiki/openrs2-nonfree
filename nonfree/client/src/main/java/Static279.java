import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "Lclient!nm;")
	public static Class119 aClass119_87;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString196 = " more options";

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "J")
	public static long aLong196 = 0L;

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString197 = "M";

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
	public static int anInt5131 = 0;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIBILclient!s;II)Z")
	public static boolean method4267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class150 arg3) {
		@Pc(6) Class170 local6 = Static49.method907(arg3.anInt4556);
		if (local6.anInt5090 == -1) {
			return true;
		}
		if (arg3.aBoolean419) {
			@Pc(30) int local30 = arg1 + arg3.anInt4570;
			arg1 = local30 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(45) Class57_Sub1 local45 = local6.method4243(arg3.aBoolean408, arg1);
		if (local45 == null) {
			return false;
		}
		@Pc(52) int local52 = arg3.anInt4532;
		@Pc(55) int local55 = local45.anInt3770;
		@Pc(58) int local58 = local45.anInt3763;
		@Pc(61) int local61 = arg3.anInt4562;
		if ((arg1 & 0x1) == 1) {
			local52 = arg3.anInt4562;
			local61 = arg3.anInt4532;
		}
		if (local6.aBoolean482) {
			local58 = local61 * 4;
			local55 = local52 * 4;
		}
		if (local6.anInt5095 == 0) {
			local45.method1657(arg2 * 4 + 48, 48 - -((-local61 + -arg0 + 104) * 4), local55, local58);
		} else {
			local45.method1652(arg2 * 4 + 48, 48 - -((-arg0 + 104 + -local61) * 4), local55, local58, local6.anInt5095);
		}
		return true;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
	public static void method4269(@OriginalArg(1) int arg0) {
		if (!Static81.aBoolean176) {
			arg0 = -1;
		}
		if (arg0 == Static236.anInt4434) {
			return;
		}
		if (arg0 != -1) {
			@Pc(28) Class163 local28 = Static196.method3385(arg0);
			@Pc(32) Class1_Sub5_Sub6_Sub1 local32 = local28.method4046();
			if (local32 == null) {
				arg0 = -1;
			} else {
				Static222.aClass176_3.method4381(new Point(local28.anInt4844, local28.anInt4842), local32.anInt3626, local32.anInt3620, local32.method1283(), Static229.aCanvas2);
				Static236.anInt4434 = arg0;
			}
		}
		if (arg0 == -1 && Static236.anInt4434 != -1) {
			Static222.aClass176_3.method4381(new Point(), -1, -1, null, Static229.aCanvas2);
			Static236.anInt4434 = -1;
		}
	}
}
