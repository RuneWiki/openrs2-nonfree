import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "Lclient!la;")
	public static Class196 aClass196_42;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "Z")
	public static boolean aBoolean264 = false;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
	public static void method3472() {
		Static69.aClass102_6.method2681();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Z")
	public static boolean method3474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static356.method5860(arg0, arg1)) {
			return (arg1 & 0xB000) != 0 | Static15.method837(arg1, arg0) | Static311.method6191(arg0, arg1) ? true : (Static485.method7224(arg0, arg1) | Static405.method7056(arg1, arg0)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)I")
	public static int method3476() {
		@Pc(15) int local15 = 0;
		@Pc(25) Field[] local25 = gp.class.getDeclaredFields();
		for (@Pc(29) int local29 = 0; local29 < local25.length; local29++) {
			@Pc(35) Field local35 = local25[local29];
			if (uc.class.isAssignableFrom(local35.getType())) {
				local15++;
			}
		}
		return local15 + 1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBII)V")
	public static void method3478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = Static262.aClass3_Sub27_12.aClass21_Sub14_2.method5405() * arg1 >> 8;
		if (local13 == 0 || arg0 == -1) {
			return;
		}
		if (!Static120.aBoolean173 && Static472.anInt8274 != -1 && Static438.method6829() && !Static490.method7293()) {
			Static391.aClass3_Sub7_Sub2_2 = Static189.method3225();
			@Pc(46) Class3_Sub7_Sub2 local46 = Static596.method8353(Static391.aClass3_Sub7_Sub2_2);
			Static429.method6680(local46);
		}
		Static189.method3227(arg0, Static29.aClass196_9, local13);
		Static447.method6931(-1, 255);
		Static120.aBoolean173 = true;
	}
}
