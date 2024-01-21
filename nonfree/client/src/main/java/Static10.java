import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "Lclient!b;")
	public static Class7 aClass7_3 = new Class7(64);

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "Lclient!b;")
	public static Class7 aClass7_4 = new Class7(5);

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "Lclient!k;")
	public static Class3_Sub12_Sub1 aClass3_Sub12_Sub1_1 = new Class3_Sub12_Sub1(5000);

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
	public static int anInt277 = 0;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
	public static void method176() {
		aClass3_Sub12_Sub1_1 = null;
		aClass7_3 = null;
		aClass7_4 = null;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
	public static void method177() {
		if (Static43.anInt1007 > 0) {
			Static150.method2591();
		} else {
			Static78.method1320(40);
			Static91.aClass2_3 = Static42.aClass2_2;
			Static42.aClass2_2 = null;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!f;Z)V")
	public static void method178(@OriginalArg(0) Class13 arg0) {
		Static23.aClass13_4 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)Z")
	public static boolean method179() {
		@Pc(5) Class56 local5 = Static4.aClass56_1;
		synchronized (Static4.aClass56_1) {
			if (Static155.anInt3421 == Static54.anInt1289) {
				return false;
			} else {
				Static68.anInt1572 = Static146.anIntArray362[Static54.anInt1289];
				Static31.anInt814 = Static120.anIntArray305[Static54.anInt1289];
				Static54.anInt1289 = Static54.anInt1289 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
	public static void method180() {
		Static33.aClass7_7.method190();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)I")
	public static int method181(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
