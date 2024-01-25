import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
	public static int anInt4787;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "Lclient!mv;")
	public static Class229 aClass229_68;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_55 = new Class154(41, 8);

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_78 = new Class349(114, -2);

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZIBILclient!ps;)V")
	public static void method4019(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class273 arg3) {
		@Pc(8) int local8 = arg3.anInt6883;
		@Pc(15) int local15 = arg3.anInt6814;
		if (arg3.aByte87 == 0) {
			arg3.anInt6883 = arg3.anInt6871;
		} else if (arg3.aByte87 == 1) {
			arg3.anInt6883 = arg2 - arg3.anInt6871;
		} else if (arg3.aByte87 == 2) {
			arg3.anInt6883 = arg3.anInt6871 * arg2 >> 14;
		}
		if (arg3.aByte89 == 0) {
			arg3.anInt6814 = arg3.anInt6861;
		} else if (arg3.aByte89 == 1) {
			arg3.anInt6814 = arg1 - arg3.anInt6861;
		} else if (arg3.aByte89 == 2) {
			arg3.anInt6814 = arg1 * arg3.anInt6861 >> 14;
		}
		if (arg3.aByte87 == 4) {
			arg3.anInt6883 = arg3.anInt6804 * arg3.anInt6814 / arg3.anInt6809;
		}
		if (arg3.aByte89 == 4) {
			arg3.anInt6814 = arg3.anInt6809 * arg3.anInt6883 / arg3.anInt6804;
		}
		if (Static440.aBoolean582 && (Static70.method1164(arg3).anInt3330 != 0 || arg3.anInt6868 == 0)) {
			if (arg3.anInt6814 < 5 && arg3.anInt6883 < 5) {
				arg3.anInt6814 = 5;
				arg3.anInt6883 = 5;
			} else {
				if (arg3.anInt6883 <= 0) {
					arg3.anInt6883 = 5;
				}
				if (arg3.anInt6814 <= 0) {
					arg3.anInt6814 = 5;
				}
			}
		}
		if (Static318.anInt5356 == arg3.anInt6825) {
			Static61.aClass273_1 = arg3;
		}
		if (arg0 && arg3.anObjectArray14 != null && (arg3.anInt6883 != local8 || arg3.anInt6814 != local15)) {
			@Pc(201) Class2_Sub10 local201 = new Class2_Sub10();
			local201.anObjectArray1 = arg3.anObjectArray14;
			local201.aClass273_4 = arg3;
			Static213.aClass70_15.method1269(local201);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZII)I")
	public static int method4021(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
