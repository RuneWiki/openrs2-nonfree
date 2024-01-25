import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!md", name = "c", descriptor = "[S")
	public static short[] aShortArray75;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "I")
	public static int anInt4632 = 0;

	@OriginalMember(owner = "client!md", name = "i", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_95 = new Class254(12, 6);

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)Lclient!nc;")
	public static Class171 method3805(@OriginalArg(1) int arg0) {
		@Pc(8) Class171[] local8 = Static329.method4754();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) Class171 local21 = local8[local15];
			if (arg0 == local21.anInt4462) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIB)Z")
	public static boolean method3806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!ps;II)V")
	public static void method3808(@OriginalArg(0) int arg0, @OriginalArg(1) Class47_Sub1_Sub5_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == arg1.anInt5348 && arg0 != -1) {
			@Pc(84) Class58 local84 = Static322.aClass45_5.method690(arg0);
			@Pc(87) int local87 = local84.anInt1436;
			if (local87 == 1) {
				arg1.anInt5370 = arg2;
				arg1.anInt5372 = 1;
				arg1.anInt5403 = 0;
				arg1.anInt5350 = 0;
				arg1.anInt5339 = 0;
				Static385.method5367(arg1.aByte97, arg1.anInt7066, arg1.anInt5350, local84, arg1 == Static255.aClass47_Sub1_Sub5_Sub2_2, arg1.anInt7060);
			}
			if (local87 == 2) {
				arg1.anInt5339 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt5348 == -1 || Static322.aClass45_5.method690(arg0).anInt1426 >= Static322.aClass45_5.method690(arg1.anInt5348).anInt1426) {
			arg1.anInt5420 = arg1.anInt5421;
			arg1.anInt5370 = arg2;
			arg1.anInt5339 = 0;
			arg1.anInt5403 = 0;
			arg1.anInt5348 = arg0;
			arg1.anInt5372 = 1;
			arg1.anInt5350 = 0;
			if (arg1.anInt5348 != -1) {
				Static385.method5367(arg1.aByte97, arg1.anInt7066, arg1.anInt5350, Static322.aClass45_5.method690(arg1.anInt5348), arg1 == Static255.aClass47_Sub1_Sub5_Sub2_2, arg1.anInt7060);
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public static void method3809() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static45.aBooleanArray3[local3] = false;
		}
		Static59.anInt1065 = Static123.anInt2333;
		Static214.anInt6452 = Static401.anInt7130;
		Static54.anInt987 = Static302.anInt5030;
		Static306.anInt5194 = -1;
		Static383.anInt3787 = 0;
		Static336.anInt6117 = Static4.anInt149;
		Static151.anInt2734 = Static432.anInt7548;
		Static72.anInt1374 = Static264.anInt4481;
		Static57.anInt883 = 5;
		Static95.anInt1875 = -1;
		Static207.anInt3759 = 0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Lclient!cp;")
	public static Class48_Sub1 method3810(@OriginalArg(0) int arg0) {
		return Static444.aBoolean652 && arg0 >= Static343.anInt6245 && Static231.anInt4052 >= arg0 ? Static57.aClass48_Sub1Array3[arg0 - Static343.anInt6245] : null;
	}
}
