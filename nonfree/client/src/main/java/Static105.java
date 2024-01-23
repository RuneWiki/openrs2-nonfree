import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "Lclient!rj;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_3;

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "Lclient!jd;")
	public static Class84 aClass84_45;

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString115 = "Prepared sound engine";

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
	public static int anInt2264 = 0;

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString116 = "white:";

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
	public static int anInt2269 = 3;

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
	public static void method1948() {
		if (Static92.aFloat22 > Static280.aFloat55) {
			Static280.aFloat55 = (float) ((double) Static280.aFloat55 + (double) Static280.aFloat55 / 30.0D);
			if (Static280.aFloat55 > Static92.aFloat22) {
				Static280.aFloat55 = Static92.aFloat22;
			}
			Static133.method2322();
		} else if (Static280.aFloat55 > Static92.aFloat22) {
			Static280.aFloat55 = (float) ((double) Static280.aFloat55 - (double) Static280.aFloat55 / 30.0D);
			if (Static280.aFloat55 < Static92.aFloat22) {
				Static280.aFloat55 = Static92.aFloat22;
			}
			Static133.method2322();
		}
		if (Static157.anInt3299 == -1 || Static34.anInt1968 == -1) {
			return;
		}
		@Pc(69) int local69 = Static157.anInt3299 - Static219.anInt4587;
		if (local69 < 2 || local69 > 2) {
			local69 >>= 0x4;
		}
		Static219.anInt4587 += local69;
		@Pc(90) int local90 = Static34.anInt1968 - Static61.anInt2999;
		if (local90 < 2 || local90 > 2) {
			local90 >>= 0x4;
		}
		Static61.anInt2999 += local90;
		if (local69 == 0 && local90 == 0) {
			Static157.anInt3299 = -1;
			Static34.anInt1968 = -1;
		}
		Static133.method2322();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!mn;II)V")
	public static void method1949(@OriginalArg(0) int arg0, @OriginalArg(1) Class115 arg1, @OriginalArg(3) int arg2) {
		if (Static216.anInt4481 < 2 && Static106.anInt2305 == 0 && !Static133.aBoolean219) {
			return;
		}
		@Pc(17) String local17 = Static62.method1202();
		if (arg1 == null) {
			@Pc(84) int local84 = Static153.aClass2_Sub3_Sub5_1.method3311(local17, arg0 + 4, arg2 - -15, Static169.aRandom1, Static176.anInt3788);
			Static121.method2215(15, arg0 + 4, arg2, Static153.aClass2_Sub3_Sub5_1.method3325(local17) + local84);
			return;
		}
		@Pc(29) Class2_Sub3_Sub5 local29 = arg1.method2851(Static4.aClass71Array1);
		if (local29 == null) {
			local29 = Static153.aClass2_Sub3_Sub5_1;
		}
		local29.method3323(local17, arg0, arg2, arg1.anInt3555, arg1.anInt3487, arg1.anInt3543, arg1.anInt3526, arg1.anInt3511, arg1.anInt3477, Static169.aRandom1, Static176.anInt3788, Static1.anIntArray2);
		Static121.method2215(Static1.anIntArray2[3], Static1.anIntArray2[0], Static1.anIntArray2[1], Static1.anIntArray2[2]);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)Lclient!qe;")
	public static Class140 method1956(@OriginalArg(0) int arg0) {
		@Pc(10) Class140 local10 = (Class140) Static246.aClass46_33.method1074((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = aClass84_45.method2127(arg0, 16);
		local10 = new Class140();
		if (local21 != null) {
			local10.method3626(new Class2_Sub26(local21));
		}
		Static246.aClass46_33.method1071(local10, (long) arg0);
		return local10;
	}
}
