import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "Lclient!ha;")
	public static Class1_Sub2_Sub8 aClass1_Sub2_Sub8_6;

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "Lclient!ak;")
	public static Class7 aClass7_240;

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
	public static int anInt5911 = 2;

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
	public static int anInt5916 = 0;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
	public static void method4552() {
		Static64.aClass31_12.method855();
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V")
	public static void method4554(@OriginalArg(0) int arg0) {
		if (arg0 == Static98.anInt1878) {
			return;
		}
		@Pc(29) boolean local29 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		if (Static98.anInt1878 == 0) {
			Static284.method4349();
		}
		if (arg0 == 40) {
			Static264.method1811();
		}
		if (arg0 != 40 && Static38.aClass73_1 != null) {
			Static38.aClass73_1.method1691();
			Static38.aClass73_1 = null;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static298.anInt5902 = 0;
			Static290.anInt5784 = 1;
			Static229.anInt4801 = 0;
			Static88.anInt1649 = 0;
			Static199.anInt3859 = 1;
			Static115.method1777(true);
		}
		if (arg0 == 25 || arg0 == 10) {
			Static155.method2393();
		}
		if (arg0 == 5) {
			Static223.method3575(Static58.aClass7_58);
		} else {
			Static67.method1154();
		}
		@Pc(125) boolean local125 = Static98.anInt1878 == 5 || Static98.anInt1878 == 10 || Static98.anInt1878 == 28;
		if (local125 != local29) {
			if (local29) {
				Static4.anInt146 = Static92.anInt1748;
				if (Static259.anInt5233 == 0) {
					Static140.method2197();
				} else {
					Static185.method2790(255, Static67.aClass7_68, Static92.anInt1748);
				}
				Static137.aClass168_3.method4272(false);
			} else {
				Static140.method2197();
				Static137.aClass168_3.method4272(true);
			}
		}
		if (Static240.aBoolean369 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
			Static240.method3811();
		}
		Static98.anInt1878 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)Lclient!ek;")
	public static Class1_Sub2_Sub2_Sub1 method4557() {
		@Pc(19) int local19 = Static113.anIntArray273[0] * Static49.anIntArray135[0];
		@Pc(22) int[] local22 = new int[local19];
		@Pc(26) byte[] local26 = aByteArrayArray15[0];
		for (@Pc(28) int local28 = 0; local28 < local19; local28++) {
			local22[local28] = Static158.anIntArray366[local26[local28] & 0xFF];
		}
		@Pc(63) Class1_Sub2_Sub2_Sub1 local63 = new Class1_Sub2_Sub2_Sub1(Static214.anInt4248, Static67.anInt1375, Static227.anIntArray557[0], Static134.anIntArray306[0], Static49.anIntArray135[0], Static113.anIntArray273[0], local22);
		Static247.method3867();
		return local63;
	}
}
