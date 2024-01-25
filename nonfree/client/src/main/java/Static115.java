import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!fk", name = "Z", descriptor = "I")
	public static int anInt2361;

	@OriginalMember(owner = "client!fk", name = "W", descriptor = "Lclient!mf;")
	public static Class163 aClass163_23 = new Class163();

	@OriginalMember(owner = "client!fk", name = "Y", descriptor = "I")
	public static int anInt2360 = -1;

	@OriginalMember(owner = "client!fk", name = "ab", descriptor = "I")
	public static int anInt2362 = 0;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!lt;I)[Lclient!vg;")
	public static Class256[] method2030(@OriginalArg(0) Class159 arg0) {
		if (!arg0.method3510()) {
			return new Class256[0];
		}
		@Pc(16) Class270 local16 = arg0.method3521();
		while (local16.anInt7548 == 0) {
			Static328.method5696(10L);
		}
		if (local16.anInt7548 == 2) {
			return new Class256[0];
		}
		@Pc(39) int[] local39 = (int[]) local16.anObject9;
		@Pc(45) Class256[] local45 = new Class256[local39.length >> 2];
		for (@Pc(53) int local53 = 0; local53 < local45.length; local53++) {
			@Pc(59) Class256 local59 = new Class256();
			local45[local53] = local59;
			local59.anInt7177 = local39[local53 << 2];
			local59.anInt7176 = local39[(local53 << 2) + 1];
			local59.anInt7175 = local39[(local53 << 2) + 2];
			local59.anInt7178 = local39[(local53 << 2) + 3];
		}
		return local45;
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(II)V")
	public static void method2031(@OriginalArg(0) int arg0) {
		@Pc(12) Class10_Sub1_Sub17 local12 = Static154.method2630(12, arg0);
		local12.method5346();
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(Z)V")
	public static void method2032() {
		Static407.aClass10_Sub45_2 = new Class10_Sub45(Static152.aClass182_109.method4155(Static191.anInt3842), "", Static40.anInt656, 1007, -1, 0L, 0, 0, true, false);
	}
}
