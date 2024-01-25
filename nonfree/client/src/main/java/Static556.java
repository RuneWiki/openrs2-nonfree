import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!ts", name = "jb", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ts", name = "Vb", descriptor = "Lclient!gw;")
	public static final Class136 aClass136_64 = new Class136(64);

	@OriginalMember(owner = "client!ts", name = "Wb", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_282 = new Class194(57, 8);

	@OriginalMember(owner = "client!ts", name = "Xb", descriptor = "Lclient!ww;")
	public static final Class384 aClass384_68 = new Class384(2, 2);

	@OriginalMember(owner = "client!ts", name = "Yb", descriptor = "I")
	public static int anInt9246 = 0;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
	public static void method7888() {
		if (Static528.anInt8950 == -1) {
			return;
		}
		@Pc(12) int local12 = Static281.aClass49_1.method2426();
		@Pc(16) int local16 = Static281.aClass49_1.method2429();
		@Pc(21) Class3_Sub21 local21 = (Class3_Sub21) Static172.aClass216_29.method5457();
		if (local21 != null) {
			local12 = local21.method5064();
			local16 = local21.method5060();
		}
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (Static80.aBoolean118) {
			local33 = Static211.method3297();
			local35 = Static551.method7856();
		}
		Static531.method7701(Static330.anInt6254 + local33, local33 + local12, Static528.anInt8950, local16, local35, local35, local33, local35 + local16, local33, local12, Static190.anInt3576 + local35);
		if (Static165.aClass344_4 != null) {
			Static256.method4305(local35 + local16, local12 + local33);
		}
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)Z")
	public static boolean method7889() {
		return Static169.anInt3281 != 0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method7897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static529.method7687(arg3, arg4, arg5)) {
			return false;
		}
		@Pc(15) int local15 = Static217.anIntArray243[1];
		@Pc(19) int local19 = Static217.anIntArray243[2];
		@Pc(23) int local23 = Static217.anIntArray243[0];
		if (!Static529.method7687(arg1, arg7, arg8)) {
			return false;
		}
		@Pc(43) int local43 = Static217.anIntArray243[1];
		@Pc(47) int local47 = Static217.anIntArray243[2];
		@Pc(51) int local51 = Static217.anIntArray243[0];
		if (Static529.method7687(arg6, arg0, arg2)) {
			@Pc(63) int local63 = Static217.anIntArray243[2];
			@Pc(67) int local67 = Static217.anIntArray243[1];
			@Pc(71) int local71 = Static217.anIntArray243[0];
			return Static497.method5024(local15, local23, local71, local47, local51, local19, local67, local63, local43);
		} else {
			return false;
		}
	}
}
