import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!la", name = "t", descriptor = "Lclient!ec;")
	public static Class22 aClass22_485 = Static60.method1113("");

	@OriginalMember(owner = "client!la", name = "r", descriptor = "Lclient!ec;")
	public static Class22 aClass22_484 = aClass22_485;

	@OriginalMember(owner = "client!la", name = "x", descriptor = "Lclient!ec;")
	private static Class22 aClass22_487 = Static60.method1113("Enter your username (V password)3");

	@OriginalMember(owner = "client!la", name = "u", descriptor = "Lclient!ec;")
	public static Class22 aClass22_486 = aClass22_487;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "Z")
	public static boolean aBoolean163 = false;

	@OriginalMember(owner = "client!la", name = "I", descriptor = "Lclient!ec;")
	public static Class22 aClass22_488 = Static60.method1113(" ");

	@OriginalMember(owner = "client!la", name = "O", descriptor = "[I")
	public static int[] anIntArray186 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!la", name = "U", descriptor = "Lclient!ec;")
	private static Class22 aClass22_490 = Static60.method1113("The server is being updated)3");

	@OriginalMember(owner = "client!la", name = "Q", descriptor = "Lclient!ec;")
	public static Class22 aClass22_489 = aClass22_490;

	@OriginalMember(owner = "client!la", name = "T", descriptor = "Z")
	public static boolean aBoolean164 = true;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
	public static void method1139() {
		aClass22_488 = null;
		aClass22_486 = null;
		aClass22_489 = null;
		anIntArray186 = null;
		aClass22_484 = null;
		aClass22_485 = null;
		aClass22_487 = null;
		aClass22_490 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!ec;II)V")
	public static void method1141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class4_Sub7 local8 = Static108.method1767(arg3, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray13 != null) {
			@Pc(18) Class4_Sub3 local18 = new Class4_Sub3();
			local18.aClass4_Sub7_3 = local8;
			local18.aClass22_79 = arg2;
			local18.anInt208 = arg0;
			local18.anObjectArray1 = local8.anObjectArray13;
			Static133.method2036(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local8.anInt793 > 0) {
			local36 = Static18.method357(local8);
		}
		if (!local36 || !Static11.method1907(Static124.method1890(local8), arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static38.aClass4_Sub11_Sub1_1.method752(221);
			Static38.aClass4_Sub11_Sub1_1.method717(arg1);
			Static38.aClass4_Sub11_Sub1_1.method700(arg3);
		}
		if (arg0 == 2) {
			Static38.aClass4_Sub11_Sub1_1.method752(108);
			Static38.aClass4_Sub11_Sub1_1.method717(arg1);
			Static38.aClass4_Sub11_Sub1_1.method700(arg3);
		}
		if (arg0 == 3) {
			Static38.aClass4_Sub11_Sub1_1.method752(181);
			Static38.aClass4_Sub11_Sub1_1.method717(arg1);
			Static38.aClass4_Sub11_Sub1_1.method700(arg3);
		}
		if (arg0 == 4) {
			Static38.aClass4_Sub11_Sub1_1.method752(143);
			Static38.aClass4_Sub11_Sub1_1.method717(arg1);
			Static38.aClass4_Sub11_Sub1_1.method700(arg3);
		}
		if (arg0 == 5) {
			Static38.aClass4_Sub11_Sub1_1.method752(167);
			Static38.aClass4_Sub11_Sub1_1.method717(arg1);
			Static38.aClass4_Sub11_Sub1_1.method700(arg3);
		}
		if (arg0 == 6) {
			Static38.aClass4_Sub11_Sub1_1.method752(175);
			Static38.aClass4_Sub11_Sub1_1.method717(arg1);
			Static38.aClass4_Sub11_Sub1_1.method700(arg3);
		}
		if (arg0 == 7) {
			Static38.aClass4_Sub11_Sub1_1.method752(162);
			Static38.aClass4_Sub11_Sub1_1.method717(arg1);
			Static38.aClass4_Sub11_Sub1_1.method700(arg3);
		}
		if (arg0 == 8) {
			Static38.aClass4_Sub11_Sub1_1.method752(98);
			Static38.aClass4_Sub11_Sub1_1.method717(arg1);
			Static38.aClass4_Sub11_Sub1_1.method700(arg3);
		}
		if (arg0 == 9) {
			Static38.aClass4_Sub11_Sub1_1.method752(103);
			Static38.aClass4_Sub11_Sub1_1.method717(arg1);
			Static38.aClass4_Sub11_Sub1_1.method700(arg3);
		}
		if (arg0 == 10) {
			Static38.aClass4_Sub11_Sub1_1.method752(150);
			Static38.aClass4_Sub11_Sub1_1.method717(arg1);
			Static38.aClass4_Sub11_Sub1_1.method700(arg3);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ea;Lclient!ea;BLclient!ea;)V")
	public static void method1142(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(3) Class20 arg2) {
		Static65.aClass20_34 = arg1;
		Static3.aClass20_1 = arg2;
		Static115.aClass20_55 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
	public static int method1143(@OriginalArg(1) KeyEvent arg0) {
		@Pc(15) int local15 = arg0.getKeyChar();
		if (local15 == 8364) {
			return 128;
		} else {
			if (local15 <= 0 || local15 >= 256) {
				local15 = -1;
			}
			return local15;
		}
	}
}
