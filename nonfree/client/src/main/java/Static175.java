import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
	public static int anInt3194;

	@OriginalMember(owner = "client!ik", name = "x", descriptor = "Lclient!lm;")
	public static Class1_Sub25 aClass1_Sub25_2;

	@OriginalMember(owner = "client!ik", name = "y", descriptor = "[I")
	public static int[] anIntArray269;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_60 = new Class237(95, 2);

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "[I")
	public static final int[] anIntArray268 = new int[13];

	@OriginalMember(owner = "client!ik", name = "r", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_61 = new Class237(37, -1);

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_88 = new Class131(71, 18);

	@OriginalMember(owner = "client!ik", name = "w", descriptor = "Lclient!qi;")
	public static final Class188 aClass188_5 = new Class188();

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZLclient!ss;ZI)V")
	public static void method2726(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class219 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg2.anInt6398;
		@Pc(11) int local11 = arg2.anInt6363;
		if (arg2.aByte79 == 0) {
			arg2.anInt6398 = arg2.anInt6365;
		} else if (arg2.aByte79 == 1) {
			arg2.anInt6398 = arg3 - arg2.anInt6365;
		} else if (arg2.aByte79 == 2) {
			arg2.anInt6398 = arg2.anInt6365 * arg3 >> 14;
		}
		if (arg2.aByte82 == 0) {
			arg2.anInt6363 = arg2.anInt6340;
		} else if (arg2.aByte82 == 1) {
			arg2.anInt6363 = arg0 - arg2.anInt6340;
		} else if (arg2.aByte82 == 2) {
			arg2.anInt6363 = arg0 * arg2.anInt6340 >> 14;
		}
		if (arg2.aByte79 == 4) {
			arg2.anInt6398 = arg2.anInt6394 * arg2.anInt6363 / arg2.anInt6411;
		}
		if (arg2.aByte82 == 4) {
			arg2.anInt6363 = arg2.anInt6411 * arg2.anInt6398 / arg2.anInt6394;
		}
		if (Static239.aBoolean287 && (Static53.method916(arg2).anInt7461 != 0 || arg2.anInt6377 == 0)) {
			if (arg2.anInt6363 < 5 && arg2.anInt6398 < 5) {
				arg2.anInt6363 = 5;
				arg2.anInt6398 = 5;
			} else {
				if (arg2.anInt6398 <= 0) {
					arg2.anInt6398 = 5;
				}
				if (arg2.anInt6363 <= 0) {
					arg2.anInt6363 = 5;
				}
			}
		}
		if (Static67.anInt1398 == arg2.anInt6384) {
			Static115.aClass219_8 = arg2;
		}
		if (arg1 && arg2.anObjectArray15 != null && (arg2.anInt6398 != local8 || local11 != arg2.anInt6363)) {
			@Pc(184) Class1_Sub6 local184 = new Class1_Sub6();
			local184.anObjectArray3 = arg2.anObjectArray15;
			local184.aClass219_4 = arg2;
			Static59.aClass266_11.method5998(local184);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BII)V")
	public static void method2734(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class27 local10 = new Class27(16);
		for (@Pc(15) Class1_Sub20 local15 = (Class1_Sub20) Static184.aClass27_23.method555(); local15 != null; local15 = (Class1_Sub20) Static184.aClass27_23.method563()) {
			local15.method6071();
			@Pc(26) int local26 = (int) (local15.aLong227 >> 28);
			@Pc(36) int local36 = (int) (local15.aLong227 >> 14 & 0x3FFFL) - arg1;
			@Pc(45) int local45 = (int) (local15.aLong227 & 0x3FFFL) - arg0;
			if (local45 >= 0 && local36 >= 0 && Static135.anInt2314 > local45 && local36 < Static352.anInt6022) {
				local10.method564((long) (local36 << 14 | local26 << 28 | local45), local15);
			}
		}
		Static184.aClass27_23 = local10;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIILclient!uo;)V")
	public static void method2736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class26_Sub2_Sub2_Sub2 arg2) {
		if (arg0 == arg2.anInt7073 && arg0 != -1) {
			@Pc(24) Class191 local24 = Static191.aClass28_1.method567(arg0);
			@Pc(27) int local27 = local24.anInt5751;
			if (local27 == 1) {
				arg2.anInt7136 = 0;
				arg2.anInt7127 = 0;
				arg2.anInt7075 = 0;
				arg2.anInt7133 = 1;
				arg2.anInt7120 = arg1;
				Static228.method3411(arg2.anInt7065, false, arg2.anInt7068, local24, arg2.anInt7075, arg2.aByte95);
			}
			if (local27 == 2) {
				arg2.anInt7136 = 0;
				return;
			}
		} else if (arg0 == -1 || arg2.anInt7073 == -1 || Static191.aClass28_1.method567(arg0).anInt5740 >= Static191.aClass28_1.method567(arg2.anInt7073).anInt5740) {
			arg2.anInt7127 = 0;
			arg2.anInt7073 = arg0;
			arg2.anInt7120 = arg1;
			arg2.anInt7133 = 1;
			arg2.anInt7147 = arg2.anInt7148;
			arg2.anInt7136 = 0;
			arg2.anInt7075 = 0;
			if (arg2.anInt7073 == -1) {
				return;
			}
			Static228.method3411(arg2.anInt7065, false, arg2.anInt7068, Static191.aClass28_1.method567(arg2.anInt7073), arg2.anInt7075, arg2.aByte95);
		}
	}
}
