import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static630 {

	@OriginalMember(owner = "client!vf", name = "Lg", descriptor = "[Lclient!hk;")
	public static Class155[] aClass155Array21;

	@OriginalMember(owner = "client!vf", name = "A", descriptor = "Lclient!iha;")
	public static final Class168 aClass168_93 = new Class168(32);

	@OriginalMember(owner = "client!vf", name = "Lb", descriptor = "I")
	public static int anInt10209 = 0;

	@OriginalMember(owner = "client!vf", name = "sb", descriptor = "I")
	public static int anInt10217 = -50;

	@OriginalMember(owner = "client!vf", name = "gf", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_206 = new Class156(49, 3);

	@OriginalMember(owner = "client!vf", name = "Je", descriptor = "I")
	public static final int anInt10248 = -1;

	@OriginalMember(owner = "client!vf", name = "A", descriptor = "(I)V")
	public static void method8667() {
		Static111.anInt1795 = 0;
		Static488.anInt7901 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static58.anInt7090; local11++) {
			@Pc(17) int local17 = local11 * Static492.anInt7974;
			for (@Pc(19) int local19 = 0; local19 < Static492.anInt7974; local19++) {
				@Pc(26) int local26 = local17 + local19;
				Static111.anInterface24Array1[local26].method8998(local19 * Static659.anInt10729, local11 * Static122.anInt2024, Static659.anInt10729, Static122.anInt2024, true);
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)V")
	public static void method8717(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class5_Sub1_Sub18 local11 = Static123.method1827((long) arg0, 16);
		local11.method7441();
		local11.anInt8635 = arg1;
	}
}
