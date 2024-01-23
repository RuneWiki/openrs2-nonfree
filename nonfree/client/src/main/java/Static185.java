import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "Lclient!jd;")
	public static Class61 aClass61_92 = new Class61(30);

	@OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
	public static int anInt4913 = 0;

	@OriginalMember(owner = "client!rh", name = "G", descriptor = "Lclient!id;")
	public static Class56 aClass56_26 = new Class56();

	@OriginalMember(owner = "client!rh", name = "H", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1330 = Static231.method3737("<img=1>");

	@OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
	public static int anInt4914 = -1;

	@OriginalMember(owner = "client!rh", name = "J", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1331 = Static231.method3737("Select");

	@OriginalMember(owner = "client!rh", name = "K", descriptor = "Z")
	public static boolean aBoolean438 = false;

	@OriginalMember(owner = "client!rh", name = "L", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1332 = aClass107_1331;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIB)V")
	public static void method3678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static193.aClass1_Sub26_Sub1_2.method3000(145);
		Static193.aClass1_Sub26_Sub1_2.method2934(arg0);
		Static193.aClass1_Sub26_Sub1_2.method2963(arg1);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BZ)V")
	public static void method3679(@OriginalArg(0) byte arg0) {
		if (Static186.aByteArrayArrayArray11 == null) {
			Static186.aByteArrayArrayArray11 = new byte[4][104][104];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(20) int local20 = 0; local20 < 104; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 104; local24++) {
					Static186.aByteArrayArrayArray11[local14][local20][local24] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
	public static void method3681() {
		for (@Pc(13) Class1_Sub24 local13 = (Class1_Sub24) Static86.aClass120_10.method3564(); local13 != null; local13 = (Class1_Sub24) Static86.aClass120_10.method3561()) {
			if (local13.anInt3738 == -1) {
				local13.anInt3733 = 0;
				Static64.method1207(local13);
			} else {
				local13.method3735();
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)V")
	public static void method3683() {
		Static154.anInt3399++;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!af;III)V")
	public static void method3684(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub9 local12;
		if (arg2 < Static159.anInt3497) {
			local12 = Static174.aClass1_Sub9ArrayArrayArray2[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass40_1 != null && local12.aClass40_1.aClass5_1.method2302()) {
				arg0.method2296(local12.aClass40_1.aClass5_1, 128, 0, 0, true);
			}
		}
		if (arg3 < Static159.anInt3497) {
			local12 = Static174.aClass1_Sub9ArrayArrayArray2[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass40_1 != null && local12.aClass40_1.aClass5_1.method2302()) {
				arg0.method2296(local12.aClass40_1.aClass5_1, 0, 0, 128, true);
			}
		}
		if (arg2 < Static159.anInt3497 && arg3 < Static213.anInt4593) {
			local12 = Static174.aClass1_Sub9ArrayArrayArray2[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass40_1 != null && local12.aClass40_1.aClass5_1.method2302()) {
				arg0.method2296(local12.aClass40_1.aClass5_1, 128, 0, 128, true);
			}
		}
		if (arg2 < Static159.anInt3497 && arg3 > 0) {
			local12 = Static174.aClass1_Sub9ArrayArrayArray2[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass40_1 != null && local12.aClass40_1.aClass5_1.method2302()) {
				arg0.method2296(local12.aClass40_1.aClass5_1, 128, 0, -128, true);
			}
		}
	}
}
