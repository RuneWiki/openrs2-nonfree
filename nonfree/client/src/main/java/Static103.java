import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!l", name = "P", descriptor = "[I")
	public static int[] anIntArray236;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(III)V")
	public static void method1808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static192.aBoolean178 = true;
		Static117.anInt2703 = arg0;
		Static169.anInt3514 = arg1;
		Static214.anInt4257 = arg2;
		Static132.anInt2867 = -1;
		Static201.anInt4001 = -1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IILjava/awt/Component;Lclient!a;I)Lclient!bb;")
	public static Class10 method1810(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Class1 arg2, @OriginalArg(4) int arg3) {
		if (Static68.anInt1622 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class10 local33 = (Class10) Class.forName("Class10_Sub2").getDeclaredConstructor().newInstance();
			local33.anIntArray234 = new int[(Static105.aBoolean119 ? 2 : 1) * 256];
			local33.anInt2378 = arg3;
			local33.method1775(arg1);
			local33.anInt2370 = (arg3 & 0xFFFFFC00) + 1024;
			if (local33.anInt2370 > 16384) {
				local33.anInt2370 = 16384;
			}
			local33.method1785(local33.anInt2370);
			if (Static152.anInt3096 > 0 && Static66.aClass33_1 == null) {
				Static66.aClass33_1 = new Class33();
				Static66.aClass33_1.aClass1_3 = arg2;
				arg2.method8(Static66.aClass33_1, Static152.anInt3096);
			}
			if (Static66.aClass33_1 != null) {
				if (Static66.aClass33_1.aClass10Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static66.aClass33_1.aClass10Array1[arg0] = local33;
			}
			return local33;
		} catch (@Pc(105) Throwable local105) {
			try {
				@Pc(111) Class10_Sub1 local111 = new Class10_Sub1(arg2, arg0);
				local111.anIntArray234 = new int[(Static105.aBoolean119 ? 2 : 1) * 256];
				local111.anInt2378 = arg3;
				local111.method1775(arg1);
				local111.anInt2370 = 16384;
				local111.method1785(local111.anInt2370);
				if (Static152.anInt3096 > 0 && Static66.aClass33_1 == null) {
					Static66.aClass33_1 = new Class33();
					Static66.aClass33_1.aClass1_3 = arg2;
					arg2.method8(Static66.aClass33_1, Static152.anInt3096);
				}
				if (Static66.aClass33_1 != null) {
					if (Static66.aClass33_1.aClass10Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static66.aClass33_1.aClass10Array1[arg0] = local111;
				}
				return local111;
			} catch (@Pc(173) Throwable local173) {
				return new Class10();
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(I)I")
	public static int method1811() {
		@Pc(9) int local9 = Static177.method2711(Static21.anInt567, Static43.anInt1126, Static174.anInt3596);
		return local9 - Static199.anInt3952 >= 800 || (Static9.aByteArrayArrayArray7[Static43.anInt1126][Static21.anInt567 >> 7][Static174.anInt3596 >> 7] & 0x4) == 0 ? 3 : Static43.anInt1126;
	}
}
