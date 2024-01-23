import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
	public static int anInt1555;

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
	public static int anInt1561;

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "Lclient!ec;")
	public static Class46 aClass46_8 = new Class46(64);

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "Z")
	public static boolean aBoolean128 = false;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
	public static void method1335() {
		@Pc(9) Container local9;
		if (Static8.aFrame1 != null) {
			local9 = Static8.aFrame1;
		} else if (Static298.aFrame3 == null) {
			local9 = Static299.aClass177_5.anApplet1;
		} else {
			local9 = Static298.aFrame3;
		}
		Static7.anInt240 = local9.getSize().width;
		Static112.anInt2423 = local9.getSize().height;
		@Pc(35) Insets local35;
		if (Static298.aFrame3 == local9) {
			local35 = Static298.aFrame3.getInsets();
			Static112.anInt2423 -= local35.top + local35.bottom;
			Static7.anInt240 -= local35.left + local35.right;
		}
		if (Static293.method4858() >= 2) {
			Static239.anInt4867 = 0;
			Static20.anInt1235 = Static112.anInt2423;
			Static10.anInt283 = 0;
			Static257.anInt5343 = Static7.anInt240;
		} else {
			Static257.anInt5343 = 765;
			Static239.anInt4867 = (Static7.anInt240 - 765) / 2;
			Static10.anInt283 = 0;
			Static20.anInt1235 = 503;
		}
		if (Static60.aBoolean106) {
			Static60.method1175(Static257.anInt5343, Static20.anInt1235);
		}
		Static105.aCanvas1.setSize(Static257.anInt5343, Static20.anInt1235);
		if (Static298.aFrame3 == local9) {
			local35 = Static298.aFrame3.getInsets();
			Static105.aCanvas1.setLocation(Static239.anInt4867 + local35.left, local35.top - -Static10.anInt283);
		} else {
			Static105.aCanvas1.setLocation(Static239.anInt4867, Static10.anInt283);
		}
		if (Static17.anInt427 != -1) {
			Static208.method3526(true);
		}
		Static241.method3944();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBII)I")
	public static int method1336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 1) + (arg0 >> 2 << 10) + (arg1 >> 5 << 7);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IC)C")
	public static char method1337(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)I")
	public static int method1338(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub18 local10 = (Class2_Sub18) Static50.aClass79_4.method2002((long) arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 >= 0 && local10.anIntArray290.length > arg0) {
			return local10.anIntArray290[arg0];
		} else {
			return 0;
		}
	}
}
