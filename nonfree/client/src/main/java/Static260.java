import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
	public static int anInt4621;

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
	public static int anInt4625;

	@OriginalMember(owner = "client!mt", name = "j", descriptor = "[S")
	public static short[] aShortArray69;

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "Lclient!s;")
	public static final Class217 aClass217_103 = new Class217(72, 8);

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BZ)V")
	public static void method3743(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static143.aClass10_Sub1_Sub2_2 != null) {
			Static262.anInt4662 = Static143.aClass10_Sub1_Sub2_2.anInt250;
		} else {
			Static262.anInt4662 = -1;
		}
		Static339.aClass163_38 = null;
		Static264.anInt4667 = 0;
		Static11.aClass89_1 = null;
		Static143.aClass10_Sub1_Sub2_2 = null;
		Static143.method2388();
		Static143.aClass163_27.method3619();
		Static63.aClass262_4 = null;
		Static236.aClass262_6 = null;
		Static126.anInt2600 = -1;
		Static454.aClass262_10 = null;
		Static370.anInt6392 = -1;
		Static299.aClass262_7 = null;
		Static143.aClass125_3 = null;
		Static315.aClass80_18 = null;
		Static332.aClass262_9 = null;
		Static226.aClass262_5 = null;
		Static52.aClass262_3 = null;
		Static287.aClass262_8 = null;
		Static143.aClass88_2.method2269();
		Static143.aClass2_3.method10(64, 64);
		Static143.aClass88_2.method2270(64, 128);
		Static143.aClass237_2.method5204(64);
		Static189.aClass112_1.method2698(64);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Ljava/lang/String;IIJIZILjava/lang/String;ZII)V")
	public static void method3744(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static35.aBoolean37 && Static207.anInt4055 < 500) {
			@Pc(21) int local21 = arg5 == -1 ? Static40.anInt656 : arg5;
			@Pc(35) Class10_Sub45 local35 = new Class10_Sub45(arg0, arg6, local21, arg1, arg8, arg2, arg3, arg9, arg7, arg4);
			Static70.aClass163_13.method3613(local35);
			Static207.anInt4055++;
		}
	}
}
