import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!hda", name = "w", descriptor = "Lclient!kr;")
	public static Class171 aClass171_69;

	@OriginalMember(owner = "client!hda", name = "q", descriptor = "I")
	public static int anInt3165 = 0;

	@OriginalMember(owner = "client!hda", name = "u", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_39 = new Class306("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!hda", name = "v", descriptor = "I")
	public static int anInt3168 = 0;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(II)V")
	public static void method2671(@OriginalArg(1) int arg0) {
		@Pc(1) Class1_Sub1_Sub9 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class205 local8 = Static16.aClass205Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static382.anInt6965; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static93.anInt1898; local15++) {
						local1 = local8.X(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static451.anInt7905;
							@Pc(32) int local32 = local12 << Static451.anInt7905;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class205 local41 = Static16.aClass205Array1[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.ba(local15, local12) - local41.ba(local15, local12);
									@Pc(67) int local67 = local8.ba(local15 + 1, local12) - local41.ba(local15 + 1, local12);
									@Pc(85) int local85 = local8.ba(local15 + 1, local12 + 1) - local41.ba(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.ba(local15, local12 + 1) - local41.ba(local15, local12 + 1);
									local41.ya(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
