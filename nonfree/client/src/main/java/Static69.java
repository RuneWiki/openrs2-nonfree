import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
	public static int anInt1711;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Lclient!rk;")
	public static Class180 aClass180_19;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "Ljava/lang/String;")
	public static final String aString125 = "flash2:";

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_17 = new Class103(16);

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "[Lclient!qo;")
	public static final Class22_Sub2_Sub1_Sub2[] aClass22_Sub2_Sub1_Sub2Array1 = new Class22_Sub2_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
	public static int anInt1714 = 0;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
	public static int anInt1715 = 0;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "[S")
	public static short[] aShortArray26 = new short[256];

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
	public static int anInt1716 = 0;

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "Z")
	public static boolean aBoolean126 = false;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIZIIII)V")
	public static void method1370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < 1 || arg1 < 1 || Static15.anInt287 - 2 < arg0 || arg1 > Static325.anInt6173 - 2) {
			return;
		}
		if (!Static105.method5089() && !Static215.method3801(arg0, arg1, arg7, Static75.anInt1865)) {
			return;
		}
		if (Static229.aClass49ArrayArrayArray6 == null) {
			return;
		}
		@Pc(41) int local41 = arg7;
		if (arg7 < 3 && Static150.method1571(arg1, arg0)) {
			local41 = arg7 + 1;
		}
		Static85.method1801(arg5, arg0, arg7, Static327.aClass149Array1[arg7], local41, arg1, Static128.aClass89_3);
		if (arg2 >= 0) {
			@Pc(65) boolean local65 = Static155.aBoolean244;
			Static155.aBoolean244 = true;
			Static345.method5563(local41, Static327.aClass149Array1[arg7], arg7, false, Static128.aClass89_3, arg6, arg1, arg3, arg2, arg4, false, arg0);
			Static155.aBoolean244 = local65;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[Lclient!kb;)V")
	public static void method1371(@OriginalArg(1) Class52[] arg0) {
		Static41.anInt1070 = arg0.length;
		Static214.aClass52Array12 = new Class52[Static41.anInt1070 + 10];
		Static130.anIntArray376 = new int[Static41.anInt1070 + 10];
		Static366.method4201(arg0, 0, Static214.aClass52Array12, 0, Static41.anInt1070);
		for (@Pc(24) int local24 = 0; local24 < Static41.anInt1070; local24++) {
			Static130.anIntArray376[local24] = Static214.aClass52Array12[local24].method4140();
		}
		for (@Pc(42) int local42 = Static41.anInt1070; local42 < Static214.aClass52Array12.length; local42++) {
			Static130.anIntArray376[local42] = 12;
		}
	}
}
