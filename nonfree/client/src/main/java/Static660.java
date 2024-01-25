import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static660 {

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "Lclient!og;")
	public static Class266 aClass266_13;

	@OriginalMember(owner = "client!wfa", name = "e", descriptor = "[Lclient!ls;")
	public static Class34_Sub7[] aClass34_Sub7Array1;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_114 = new Class240(6, 7);

	@OriginalMember(owner = "client!wfa", name = "f", descriptor = "I")
	public static int anInt10727 = 0;

	@OriginalMember(owner = "client!wfa", name = "g", descriptor = "[I")
	public static final int[] anIntArray589 = new int[13];

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)Z")
	public static boolean method8808() {
		if (Static158.aBoolean218) {
			try {
				Static680.method795(Static339.anApplet2, "showVideoAd");
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)V")
	public static void method8809(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub5_Sub20 local9 = Static447.method6065((long) arg0, 16);
		local9.method8834();
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(II)I")
	public static int method8810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static403.anIntArrayArray59 == null ? 0 : Static403.anIntArrayArray59[arg0][arg1] & 0xFFFFFF;
	}
}
