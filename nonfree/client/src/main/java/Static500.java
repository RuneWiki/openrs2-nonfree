import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "Lclient!ee;")
	public static final Class83 aClass83_37 = new Class83(8);

	@OriginalMember(owner = "client!qq", name = "q", descriptor = "[I")
	public static final int[] anIntArray758 = new int[2];

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)V")
	public static void method7775() {
		@Pc(7) int local7 = Static393.anInt6147;
		@Pc(9) int[] local9 = Static430.anIntArray612;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class28_Sub1_Sub1_Sub1_Sub1 local19 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local9[local11]];
			if (local19 != null) {
				Static139.method2540(local19.method9314(), local19);
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)[Lclient!rda;")
	public static Class299[] method7780() {
		return new Class299[] { Static442.aClass299_2, Static513.aClass299_3, Static668.aClass299_4 };
	}
}
