import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_117 = new Class25(23, 11);

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
	public static int anInt7221 = 0;

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_113 = new Class231("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	public static void method5936() {
		@Pc(7) int local7 = Static416.anInt4773;
		@Pc(9) int[] local9 = Static5.anIntArray3;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class3_Sub3_Sub6_Sub1 local19 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local9[local11]];
			if (local19 != null && local19.anInt6721 > 0) {
				local19.anInt6721--;
				if (local19.anInt6721 == 0) {
					local19.aString63 = null;
				}
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static147.anInt7038; local53++) {
			@Pc(59) int local59 = Static345.anIntArray507[local53];
			@Pc(63) Class3_Sub3_Sub6_Sub2 local63 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local59];
			if (local63 != null && local63.anInt6721 > 0) {
				local63.anInt6721--;
				if (local63.anInt6721 == 0) {
					local63.aString63 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class118 local8 = Static113.aClass127_2.method2820(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local8.method2712(arg1);
	}
}
