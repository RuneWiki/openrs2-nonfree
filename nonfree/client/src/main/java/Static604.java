import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	public static void method8436() {
		if (Static356.aClass310Array1 == null) {
			Static356.aClass310Array1 = Static523.method7731();
			Static582.aClass310_23 = Static356.aClass310Array1[0];
			Static624.aLong266 = Static374.method6036();
		}
		if (Static101.aClass59_1 == null) {
			Static474.method7123();
		}
		@Pc(29) Class310 local29 = Static582.aClass310_23;
		@Pc(32) int local32 = Static496.method2278();
		if (Static582.aClass310_23 == local29) {
			Static404.aString80 = Static582.aClass310_23.aClass43_64.method1598(Static325.anInt6083);
			if (Static582.aClass310_23.aBoolean642) {
				Static89.anInt2126 = Static582.aClass310_23.anInt8983 + (Static582.aClass310_23.anInt8980 - Static582.aClass310_23.anInt8983) * local32 / 100;
			}
			if (Static582.aClass310_23.aBoolean643) {
				Static404.aString80 = Static404.aString80 + Static89.anInt2126 + "%";
			}
		} else if (Static523.aClass310_22 == Static582.aClass310_23) {
			Static101.aClass59_1 = null;
			Static256.method4279(3);
		} else {
			Static404.aString80 = local29.aClass43_63.method1598(Static325.anInt6083);
			if (Static582.aClass310_23.aBoolean643) {
				Static404.aString80 = Static404.aString80 + local29.anInt8980 + "%";
			}
			Static89.anInt2126 = local29.anInt8980;
			if (Static582.aClass310_23.aBoolean642 || local29.aBoolean642) {
				Static624.aLong266 = Static374.method6036();
			}
		}
		if (Static101.aClass59_1 == null) {
			return;
		}
		Static101.aClass59_1.method1963(Static582.aClass310_23, Static404.aString80, Static624.aLong266, Static89.anInt2126);
		if (Static29.anInterface21Array1 == null) {
			return;
		}
		for (@Pc(137) int local137 = Static585.anInt9591 + 1; local137 < Static29.anInterface21Array1.length; local137++) {
			if (Static29.anInterface21Array1[local137].method3923() >= 100 && local137 - 1 == Static585.anInt9591 && Static485.anInt8420 >= 1 && Static101.aClass59_1.method1964()) {
				try {
					Static29.anInterface21Array1[local137].method3922();
				} catch (@Pc(165) Exception local165) {
					Static29.anInterface21Array1 = null;
					return;
				}
				Static101.aClass59_1.method1962(Static29.anInterface21Array1[local137]);
				Static585.anInt9591++;
				if (Static585.anInt9591 >= Static29.anInterface21Array1.length - 1 && Static29.anInterface21Array1.length > 1) {
					Static585.anInt9591 = Static143.aClass153_1.method3934() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILjava/awt/Canvas;B)Lclient!mj;")
	public static Class3_Sub12 method8437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class3_Sub12_Sub1");
			@Pc(15) Class3_Sub12 local15 = (Class3_Sub12) local11.getDeclaredConstructor().newInstance();
			local15.method5831(arg1, arg2, arg0);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class3_Sub12_Sub2 local28 = new Class3_Sub12_Sub2();
			local28.method5831(arg1, arg2, arg0);
			return local28;
		}
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)I")
	public static int method8438() {
		return Static234.anInt4427 == 1 ? Static476.anInt8315 : Static245.anInt4546;
	}
}
