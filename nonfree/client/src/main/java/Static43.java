import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	public static int anInt7321;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Lclient!he;")
	public static Class93 aClass93_4;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public static int anInt7322;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Lclient!la;")
	public static Class46 aClass46_12;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_151 = new Class83("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_332 = new Class22(59, -2);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZILclient!uu;II)V")
	public static void method5658(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class247 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg2.anInt6833;
		if (arg2.aByte80 == 0) {
			arg2.anInt6833 = arg2.anInt6816;
		} else if (arg2.aByte80 == 1) {
			arg2.anInt6833 = arg1 - arg2.anInt6816;
		} else if (arg2.aByte80 == 2) {
			arg2.anInt6833 = arg2.anInt6816 * arg1 >> 14;
		}
		@Pc(52) int local52 = arg2.anInt6805;
		if (arg2.aByte78 == 0) {
			arg2.anInt6805 = arg2.anInt6802;
		} else if (arg2.aByte78 == 1) {
			arg2.anInt6805 = arg3 - arg2.anInt6802;
		} else if (arg2.aByte78 == 2) {
			arg2.anInt6805 = arg2.anInt6802 * arg3 >> 14;
		}
		if (arg2.aByte80 == 4) {
			arg2.anInt6833 = arg2.anInt6774 * arg2.anInt6805 / arg2.anInt6856;
		}
		if (arg2.aByte78 == 4) {
			arg2.anInt6805 = arg2.anInt6856 * arg2.anInt6833 / arg2.anInt6774;
		}
		if (Static415.aBoolean626 && (Static53.method900(arg2).anInt5105 != 0 || arg2.anInt6840 == 0)) {
			if (arg2.anInt6805 < 5 && arg2.anInt6833 < 5) {
				arg2.anInt6805 = 5;
				arg2.anInt6833 = 5;
			} else {
				if (arg2.anInt6805 <= 0) {
					arg2.anInt6805 = 5;
				}
				if (arg2.anInt6833 <= 0) {
					arg2.anInt6833 = 5;
				}
			}
		}
		if (arg2.anInt6842 == Static21.anInt295) {
			Static198.aClass247_7 = arg2;
		}
		if (arg0 && arg2.anObjectArray7 != null && (local8 != arg2.anInt6833 || local52 != arg2.anInt6805)) {
			@Pc(203) Class4_Sub34 local203 = new Class4_Sub34();
			local203.aClass247_15 = arg2;
			local203.anObjectArray4 = arg2.anObjectArray7;
			Static291.aClass183_35.method4137(local203);
		}
	}
}
