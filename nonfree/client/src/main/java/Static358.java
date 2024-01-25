import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!mba", name = "p", descriptor = "I")
	public static int anInt6116;

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "I")
	public static int anInt6108 = 16777215;

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "I")
	public static int anInt6109 = 0;

	@OriginalMember(owner = "client!mba", name = "m", descriptor = "Lclient!sja;")
	public static final Class325 aClass325_1 = new Class325(16);

	@OriginalMember(owner = "client!mba", name = "o", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_97 = new Class171(54, 2);

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)V")
	public static void method5170() {
		@Pc(5) Class295 local5 = Static324.aClass295_30;
		synchronized (Static324.aClass295_30) {
			Static324.aClass295_30.method6474();
		}
		local5 = Static641.aClass295_68;
		synchronized (Static641.aClass295_68) {
			Static641.aClass295_68.method6474();
		}
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(Z)I")
	public static int method5173() {
		return Static480.anInt7634;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILclient!dt;)V")
	public static void method5176(@OriginalArg(1) Class3_Sub4 arg0) {
		@Pc(9) int local9 = arg0.method7896();
		Static415.aClass90Array1 = new Class90[local9];
		for (@Pc(18) int local18 = 0; local18 < local9; local18++) {
			Static415.aClass90Array1[local18] = new Class90();
			Static415.aClass90Array1[local18].anInt2194 = arg0.method7896();
			Static415.aClass90Array1[local18].aString32 = arg0.method7928();
		}
		Static77.anInt1372 = arg0.method7896();
		Static195.anInt3524 = arg0.method7896();
		Static569.anInt9180 = arg0.method7896();
		Static257.aClass236_Sub1Array1 = new Class236_Sub1[Static195.anInt3524 + 1 - Static77.anInt1372];
		for (@Pc(67) int local67 = 0; local67 < Static569.anInt9180; local67++) {
			@Pc(75) int local75 = arg0.method7896();
			@Pc(83) Class236_Sub1 local83 = Static257.aClass236_Sub1Array1[local75] = new Class236_Sub1();
			local83.anInt6382 = arg0.method7954();
			local83.anInt6386 = arg0.method7895();
			local83.anInt6389 = local75 + Static77.anInt1372;
			local83.aString80 = arg0.method7928();
			local83.aString81 = arg0.method7928();
		}
		Static587.anInt9548 = arg0.method7895();
		Static407.aBoolean470 = true;
	}
}
