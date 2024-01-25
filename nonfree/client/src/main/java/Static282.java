import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
	public static int anInt5483;

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "[Lclient!bl;")
	public static final Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array4 = new Class1_Sub1_Sub3[14];

	@OriginalMember(owner = "client!sf", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString219 = "Hidden";

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIILclient!sk;I)V")
	public static void method4867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class188 arg3) {
		for (@Pc(15) Class1_Sub36 local15 = (Class1_Sub36) Static233.aClass195_41.method5029(); local15 != null; local15 = (Class1_Sub36) Static233.aClass195_41.method5021()) {
			if (arg0 == local15.anInt5652 && arg2 * 128 == local15.anInt5655 && local15.anInt5637 == arg1 * 128 && local15.aClass188_1.anInt5535 == arg3.anInt5535) {
				if (local15.aClass1_Sub6_Sub3_1 != null) {
					Static170.aClass1_Sub6_Sub4_2.method1665(local15.aClass1_Sub6_Sub3_1);
					local15.aClass1_Sub6_Sub3_1 = null;
				}
				if (local15.aClass1_Sub6_Sub3_2 != null) {
					Static170.aClass1_Sub6_Sub4_2.method1665(local15.aClass1_Sub6_Sub3_2);
					local15.aClass1_Sub6_Sub3_2 = null;
				}
				local15.method5710();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)I")
	public static int method4868() {
		return 15;
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)V")
	public static void method4870() {
		Static248.aClass1_Sub7_Sub1_2.anInt3368 = 0;
		Static176.anInt3652 = 0;
		Static322.anInt6152 = -1;
		Static28.anInt732 = -1;
		Static351.anInt6505 = -1;
		Static210.anInt4174 = 0;
		Static187.anInt3893 = -1;
		Static230.anInt4529 = 0;
		Static232.aClass1_Sub7_Sub1_4.anInt3368 = 0;
		Static10.method292();
		Static76.method1469();
		for (@Pc(31) int local31 = 0; local31 < Static254.aClass5_Sub3_Sub3_Sub1Array1.length; local31++) {
			if (Static254.aClass5_Sub3_Sub3_Sub1Array1[local31] != null) {
				Static254.aClass5_Sub3_Sub3_Sub1Array1[local31].anInt4964 = -1;
			}
		}
		for (@Pc(49) int local49 = 0; local49 < Static169.aClass5_Sub3_Sub3_Sub2Array2.length; local49++) {
			if (Static169.aClass5_Sub3_Sub3_Sub2Array2[local49] != null) {
				Static169.aClass5_Sub3_Sub3_Sub2Array2[local49].anInt4964 = -1;
			}
		}
		Static196.method3691();
		Static81.anInt1609 = 1;
		Static72.method1427(30);
		for (@Pc(74) int local74 = 0; local74 < 100; local74++) {
			Static313.aBooleanArray30[local74] = true;
		}
		Static154.method2925();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V")
	public static void method4871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static49.anIntArray126[arg1] = arg0;
		@Pc(19) Class1_Sub24 local19 = (Class1_Sub24) Static318.aClass26_28.method870((long) arg1);
		if (local19 == null) {
			local19 = new Class1_Sub24(4611686018427387905L);
			Static318.aClass26_28.method877((long) arg1, local19);
		} else if (local19.aLong140 != 4611686018427387905L) {
			local19.aLong140 = Static349.method5647() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!kq;Ljava/awt/Frame;I)V")
	public static void method4874(@OriginalArg(0) Class110 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(6) Class134 local6 = arg0.method3366(arg1);
			while (local6.anInt4033 == 0) {
				Static134.method2598(10L);
			}
			if (local6.anInt4033 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static134.method2598(100L);
		}
	}
}
