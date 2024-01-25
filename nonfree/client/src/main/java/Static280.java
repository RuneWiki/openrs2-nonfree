import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "Lclient!ac;")
	public static Class4 aClass4_6;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_38 = new Class10(16);

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[100];

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "[S")
	public static short[] aShortArray105 = new short[256];

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZZ)V")
	public static void method4170(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static161.anInt3337 != -1) {
				Static94.method1901(Static161.anInt3337);
			}
			for (@Pc(20) Class7_Sub17 local20 = (Class7_Sub17) Static247.aClass10_40.method157(); local20 != null; local20 = (Class7_Sub17) Static247.aClass10_40.method155()) {
				if (!local20.method5651()) {
					local20 = (Class7_Sub17) Static247.aClass10_40.method157();
					if (local20 == null) {
						break;
					}
				}
				Static89.method1858(true, false, local20);
			}
			Static161.anInt3337 = -1;
			Static247.aClass10_40 = new Class10(8);
			Static75.method1502();
			Static161.anInt3337 = Static274.anInt5408;
			Static341.method5541(false);
			Static183.method3347();
			Static83.method1762(Static161.anInt3337);
		}
		Static283.method4694();
		Static221.anInt4408 = -1;
		Static291.method4774(Static348.anInt6555);
		Static252.aClass22_Sub2_Sub1_Sub1_4 = new Class22_Sub2_Sub1_Sub1();
		Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967 = 6656;
		Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973 = 6656;
		Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0] = 52;
		Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0] = 52;
		Static24.anInt478 = 0;
		Static203.anInt4014 = 0;
		if (Static118.anInt6324 == 2) {
			Static24.anInt478 = Static318.anInt614 << 7;
			Static203.anInt4014 = Static198.anInt3898 << 7;
		} else {
			Static329.method5250();
		}
		Static198.method3548();
		if (Static203.anInt4014 == 0 || Static24.anInt478 == 0) {
			Static82.method1759(10);
		} else {
			Static261.method4377();
			Static82.method1759(28);
		}
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(II)Lclient!lk;")
	public static Class131 method4174(@OriginalArg(0) int arg0) {
		@Pc(12) Class131 local12 = (Class131) Static182.aClass103_31.method2682((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static331.aClass180_93.method4560(arg0, 33);
		local12 = new Class131();
		if (local27 != null) {
			local12.method3417(new Class7_Sub3(local27), arg0);
		}
		Static182.aClass103_31.method2687(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
	public static void method4175() {
		Static319.method5154(false);
		if (Static177.anInt3641 >= 0 && Static177.anInt3641 != 0) {
			Static244.method4219(Static177.anInt3641);
			Static177.anInt3641 = -1;
		}
	}
}
