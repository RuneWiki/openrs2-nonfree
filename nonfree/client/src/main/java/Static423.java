import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
	public static int anInt7106;

	@OriginalMember(owner = "client!vb", name = "O", descriptor = "[Lclient!o;")
	public static Class80[] aClass80Array20;

	@OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
	public static int anInt7114 = -1;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)V")
	public static void method5590(@OriginalArg(0) int arg0) {
		Static241.method3525();
		@Pc(15) int local15 = Static82.aClass271_1.method6056(arg0).anInt2126;
		if (local15 == 0) {
			return;
		}
		@Pc(26) int local26 = Static329.aClass201_9.anIntArray549[arg0];
		if (local15 == 6) {
			Static326.anInt5606 = local26;
		}
		if (local15 == 5) {
			Static334.anInt5660 = local26;
		}
	}

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "(I)V")
	public static void method5591() {
		for (@Pc(6) Class40_Sub3 local6 = (Class40_Sub3) Static427.aClass240_7.method5226(); local6 != null; local6 = (Class40_Sub3) Static427.aClass240_7.method5226()) {
			Static429.method5682(local6);
		}
		@Pc(29) int local29;
		@Pc(31) int local31;
		if (Static361.aClass85_Sub1_1.method2113(anInt7114)) {
			local29 = 0;
			local31 = 3;
		} else {
			local31 = Static166.anInt3284;
			local29 = Static166.anInt3284;
		}
		Static56.method1004();
		for (@Pc(40) int local40 = local29; local40 <= local31; local40++) {
			Static56.method987();
			Static56.method999(local40);
			Static56.method988(local40);
		}
		Static56.method994();
		Static56.method1000();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!ph;Lclient!l;I)V")
	public static void method5593(@OriginalArg(0) Class187 arg0, @OriginalArg(1) Interface7 arg1) {
		Static147.anInterface7_3 = arg1;
		Static97.aClass187_23 = arg0;
	}
}
