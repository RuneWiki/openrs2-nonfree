import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!le", name = "C", descriptor = "[[Lclient!gs;")
	public static Class11_Sub1[][] aClass11_Sub1ArrayArray2;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_58 = new Class269(25, 7);

	@OriginalMember(owner = "client!le", name = "q", descriptor = "[I")
	public static final int[] anIntArray389 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!le", name = "r", descriptor = "I")
	public static int anInt5736 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public static void method4791() {
		if (Static375.aClass359_4.aBoolean728) {
			Static545.anInt9053 = 96;
			return;
		}
		try {
			@Pc(27) Method local27 = Runtime.class.getMethod("maxMemory");
			if (local27 != null) {
				try {
					@Pc(31) Runtime local31 = Runtime.getRuntime();
					@Pc(37) Long local37 = (Long) local27.invoke(local31, (Object[]) null);
					Static545.anInt9053 = (int) (local37 / 1048576L) + 1;
				} catch (@Pc(47) Throwable local47) {
				}
			}
		} catch (@Pc(49) Exception local49) {
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!vr;I)[I")
	public static int[] method4792(@OriginalArg(0) Class2_Sub50 arg0) {
		@Pc(8) Class2_Sub34 local8 = new Class2_Sub34(518);
		@Pc(11) int[] local11 = new int[4];
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			local11[local13] = (int) (Math.random() * 9.9999999E7D);
		}
		local8.method6894(10);
		local8.method6864(local11[0]);
		local8.method6864(local11[1]);
		local8.method6864(local11[2]);
		local8.method6864(local11[3]);
		for (@Pc(64) int local64 = 0; local64 < 10; local64++) {
			local8.method6864((int) (Math.random() * 9.9999999E7D));
		}
		local8.method6854((int) (Math.random() * 9.9999999E7D));
		local8.method6895(Static3.aBigInteger1, Static67.aBigInteger2);
		arg0.aClass2_Sub34_Sub2_2.method6914(0, local8.aByteArray77, local8.anInt8188);
		return local11;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(B)[Lclient!qca;")
	public static Class271[] method4794() {
		return new Class271[] { Static558.aClass271_12, Static71.aClass271_2, Static593.aClass271_13, Static266.aClass271_6, Static636.aClass271_14, Static414.aClass271_8, Static161.aClass271_4, Static515.aClass271_11, Static496.aClass271_10, Static240.aClass271_5, Static412.aClass271_7, Static462.aClass271_9, Static137.aClass271_3, Static23.aClass271_1 };
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)V")
	public static void method4796(@OriginalArg(0) int arg0) {
		Static416.anInt7592 = arg0;
		Static413.anInt7559 = -1;
		Static92.anInt1857 = -1;
		Static466.method3730();
	}
}
