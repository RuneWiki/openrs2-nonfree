import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "Lclient!jda;")
	public static Class170 aClass170_4;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Lclient!tb;")
	public static final Class313 aClass313_28 = new Class313(128, 4);

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "Lclient!rca;")
	public static final Class280 aClass280_2 = new Class280();

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILclient!kp;Lclient!f;IBLclient!ua;)V")
	public static void method4087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class196 arg3, @OriginalArg(4) Class39 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class20 arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(18) int local18;
		if (Static311.anInt5570 == 4) {
			local18 = (int) Static447.aFloat233 & 0x3FFF;
		} else {
			local18 = (int) Static447.aFloat233 + Static417.anInt7188 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg3.anInt5130 / 2, arg3.anInt5078 / 2) + 10;
		@Pc(45) int local45 = arg1 * arg1 + arg2 * arg2;
		if (local37 * local37 < local45) {
			return;
		}
		@Pc(59) int local59 = Class363.anIntArray697[local18];
		@Pc(63) int local63 = Class363.anIntArray698[local18];
		if (Static311.anInt5570 != 4) {
			local63 = local63 * 256 / (Static557.anInt9152 + 256);
			local59 = local59 * 256 / (Static557.anInt9152 + 256);
		}
		@Pc(100) int local100 = local59 * arg1 + local63 * arg2 >> 14;
		@Pc(111) int local111 = local63 * arg1 - local59 * arg2 >> 14;
		arg4.method7859(local100 + arg3.anInt5130 / 2 + arg5 - arg4.A() / 2, -local111 + arg0 + arg3.anInt5078 / 2 + -(arg4.ca() / 2), arg6, arg5, arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)Z")
	public static boolean method4089(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static67.method1100(arg1, arg0) || Static287.method4272(arg1, arg0);
	}
}
