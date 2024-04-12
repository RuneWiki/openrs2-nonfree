import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_6;

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_7;

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
	public static int anInt824;

	@OriginalMember(owner = "client!ge", name = "I", descriptor = "Lclient!p;")
	public static Class45 aClass45_16;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V", line = 3)
	public static void method632(@OriginalArg(1) int arg0) {
		if (Static98.aClass12_1 == null) {
			return;
		}
		if (Class15.anInt432 != 0) {
			if (Static23.aByteArray9 == null) {
				return;
			}
			Static26.anInt685 = arg0;
		} else if (Class34.anInt1548 >= 0) {
			Class34.anInt1548 = arg0;
			Static98.aClass12_1.method1244(0, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V", line = 65)
	public static void method633() {
		Static68.aByteArrayArrayArray8 = new byte[4][104][104];
		Static69.aByteArrayArrayArray9 = new byte[4][104][104];
		Static19.anIntArray91 = new int[104];
		Static77.anIntArray434 = new int[104];
		Static14.aByteArrayArrayArray10 = new byte[4][104][104];
		Static35.aByteArrayArrayArray4 = new byte[4][104][104];
		Static43.anIntArray543 = new int[104];
		Static55.aByteArrayArrayArray6 = new byte[4][105][105];
		Static24.anIntArray126 = new int[104];
		Static30.anIntArrayArrayArray3 = new int[4][105][105];
		Static9.anIntArrayArray5 = new int[105][105];
		Class2_Sub6.anInt807 = 99;
		Static75.anIntArray428 = new int[104];
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)Z", line = 117)
	public static boolean method634(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(11) int local11 = Class2_Sub2_Sub12_Sub1_Sub1.anIntArray287[arg0];
		if (local11 >= 2000) {
			local11 -= 2000;
		}
		return local11 == 51;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V", line = 141)
	public static void method635() {
		aClass5_Sub1_6 = null;
		Class2_Sub7.aClass40_252 = null;
		Class2_Sub7.aClass40_255 = null;
		Class2_Sub7.anIntArray161 = null;
		aClass5_Sub1_7 = null;
		Class2_Sub7.anIntArray159 = null;
		Class2_Sub7.anIntArray160 = null;
		Class2_Sub7.aClass40_254 = null;
		Class2_Sub7.aLongArray3 = null;
		Class2_Sub7.aClass40_253 = null;
		aClass45_16 = null;
	}
}
