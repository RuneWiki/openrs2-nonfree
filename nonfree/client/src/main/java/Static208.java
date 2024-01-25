import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "Lclient!nc;")
	public static Class159 aClass159_1;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "Lclient!of;")
	public static final Class174 aClass174_111 = new Class174("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public static void method3157() {
		for (@Pc(6) Class23_Sub2 local6 = (Class23_Sub2) Static185.aClass194_4.method4575(); local6 != null; local6 = (Class23_Sub2) Static185.aClass194_4.method4575()) {
			Static25.method466(local6);
		}
		@Pc(29) int local29;
		@Pc(31) int local31;
		if (Static39.aClass79_Sub1_1.method1948(Static402.anInt6656)) {
			local29 = 0;
			local31 = 3;
		} else {
			local31 = Static436.anInt7298;
			local29 = Static436.anInt7298;
		}
		Static54.method1045();
		for (@Pc(45) int local45 = local29; local45 <= local31; local45++) {
			Static54.method1061();
			Static54.method1057(local45);
			Static54.method1056(local45);
		}
		Static54.method1050();
		Static54.method1043();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)I")
	public static int method3161(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLclient!nj;)Lclient!pu;")
	public static Class155_Sub3 method3162(@OriginalArg(1) Class3_Sub25 arg0) {
		return new Class155_Sub3(arg0.method4065(), arg0.method4065(), arg0.method4065(), arg0.method4065(), arg0.method4065(), arg0.method4065(), arg0.method4065(), arg0.method4065(), arg0.method4099(), arg0.method4096());
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBIII)V")
	public static void method3163(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static100.anInt1815; local7++) {
			@Pc(13) Rectangle local13 = Class43.aRectangleArray1[local7];
			if (arg1 < local13.width + local13.x && arg0 + arg1 > local13.x && arg3 < local13.height + local13.y && arg3 + arg2 > local13.y) {
				Static391.aBooleanArray22[local7] = true;
			}
		}
	}
}
