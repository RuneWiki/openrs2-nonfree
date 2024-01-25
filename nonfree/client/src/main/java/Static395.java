import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "Lclient!lg;")
	public static final Class146 aClass146_13 = new Class146(10, 3);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)Lclient!ls;")
	public static Class1_Sub28 method5365() {
		if (Static7.aClass266_18 == null || Static229.aClass93_3 == null) {
			return null;
		}
		for (@Pc(18) Class1_Sub28 local18 = (Class1_Sub28) Static229.aClass93_3.method1882(); local18 != null; local18 = (Class1_Sub28) Static229.aClass93_3.method1882()) {
			@Pc(26) Class231 local26 = Static7.aClass224_3.method5302(local18.anInt4274);
			if (local26 != null && local26.aBoolean446 && local26.method5358(Static7.anInterface12_2)) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(B)V")
	public static void method5367() {
		if (Static210.anInt3860 == 2) {
			Static113.anInt5764 = 96;
			return;
		}
		try {
			@Pc(15) Method local15 = Runtime.class.getMethod("maxMemory");
			if (local15 != null) {
				try {
					@Pc(19) Runtime local19 = Runtime.getRuntime();
					@Pc(25) Long local25 = (Long) local15.invoke(local19, (Object[]) null);
					Static113.anInt5764 = (int) (local25 / 1048576L) + 1;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V")
	public static void method5368() {
		for (@Pc(15) Class1_Sub19 local15 = (Class1_Sub19) Static225.aClass266_35.method6000(); local15 != null; local15 = (Class1_Sub19) Static225.aClass266_35.method5994()) {
			if (local15.anInt3375 > 0) {
				local15.anInt3375--;
			}
			if (local15.anInt3375 != 0) {
				if (local15.anInt3382 > 0) {
					local15.anInt3382--;
				}
				if (local15.anInt3382 == 0 && local15.anInt3387 >= 1 && local15.anInt3386 >= 1 && local15.anInt3387 <= Static135.anInt2314 - 2 && Static352.anInt6022 - 2 >= local15.anInt3386 && (local15.anInt3376 < 0 || Static277.method4017(local15.anInt3376, local15.anInt3383))) {
					Static405.method5578(local15.anInt3385, local15.anInt3387, local15.anInt3383, local15.anInt3376, local15.anInt3386, local15.anInt3384, -1, local15.anInt3378);
					local15.anInt3382 = -1;
					if (local15.anInt3376 == local15.anInt3381 && local15.anInt3381 == -1) {
						local15.method6071();
					} else if (local15.anInt3381 == local15.anInt3376 && local15.anInt3384 == local15.anInt3377 && local15.anInt3379 == local15.anInt3383) {
						local15.method6071();
					}
				}
			} else if (local15.anInt3381 < 0 || Static277.method4017(local15.anInt3381, local15.anInt3379)) {
				Static405.method5578(local15.anInt3385, local15.anInt3387, local15.anInt3379, local15.anInt3381, local15.anInt3386, local15.anInt3377, -1, local15.anInt3378);
				local15.method6071();
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!ss;B)V")
	public static void method5369(@OriginalArg(0) Class219 arg0) {
		if (arg0.anInt6377 == 5 && arg0.anInt6421 != -1) {
			Static374.method5131(arg0, Static276.aClass109_10);
		}
	}
}
