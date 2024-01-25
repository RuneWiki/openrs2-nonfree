import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
	public static int anInt7278 = -1;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
	public static void method5778(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub2_Sub9 local8 = Static72.method1073(2, arg0);
		local8.method3024();
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)V")
	public static void method5784() {
		for (@Pc(16) Class5_Sub2_Sub7 local16 = (Class5_Sub2_Sub7) Static311.aClass177_31.method3618(); local16 != null; local16 = (Class5_Sub2_Sub7) Static311.aClass177_31.method3619()) {
			@Pc(21) Class2_Sub1_Sub2 local21 = local16.aClass2_Sub1_Sub2_1;
			if (local21.aBoolean240) {
				local16.method6003();
				local21.method2925();
			} else if (Static85.anInt1536 >= local21.anInt3677) {
				local21.method2924(Static173.anInt2946);
				if (local21.aBoolean240) {
					local16.method6003();
				} else {
					Static462.method6056(local21, true);
				}
			}
		}
	}
}
