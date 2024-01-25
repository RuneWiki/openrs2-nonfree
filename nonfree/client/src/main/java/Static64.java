import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_19 = new Class94(82, 18);

	@OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
	public static int anInt2065 = -1;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIBI)I")
	public static int method1966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 / arg0;
		@Pc(21) int local21 = arg0 - 1 & arg2;
		@Pc(25) int local25 = arg1 / arg0;
		@Pc(31) int local31 = arg1 & arg0 - 1;
		@Pc(36) int local36 = Static244.method4516(local15, local25);
		@Pc(43) int local43 = Static244.method4516(local15 + 1, local25);
		@Pc(50) int local50 = Static244.method4516(local15, local25 + 1);
		@Pc(59) int local59 = Static244.method4516(local15 + 1, local25 + 1);
		@Pc(66) int local66 = Static370.method6242(local43, arg0, local21, local36);
		@Pc(73) int local73 = Static370.method6242(local59, arg0, local21, local50);
		return Static370.method6242(local73, arg0, local31, local66);
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZIIII)I")
	public static int method1967(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg0 & 0xF;
		@Pc(21) int local21 = local7 < 8 ? arg3 : arg2;
		@Pc(40) int local40 = local7 < 4 ? arg2 : local7 == 12 || local7 == 14 ? arg3 : arg1;
		return ((local7 & 0x1) == 0 ? local21 : -local21) + ((local7 & 0x2) == 0 ? local40 : -local40);
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(BI)V")
	public static void method1968(@OriginalArg(0) byte arg0) {
		if (Static612.aByteArrayArrayArray18 == null) {
			Static612.aByteArrayArrayArray18 = new byte[4][Static47.anInt1794][Static209.anInt4742];
		}
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			for (@Pc(27) int local27 = 0; local27 < Static47.anInt1794; local27++) {
				for (@Pc(31) int local31 = 0; local31 < Static209.anInt4742; local31++) {
					Static612.aByteArrayArrayArray18[local23][local27][local31] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)V")
	public static void method1970() {
		Static328.method5641(false);
		if (Static357.anInt7109 >= 0 && Static357.anInt7109 != 0) {
			Static316.method5509(false, Static357.anInt7109);
			Static357.anInt7109 = -1;
		}
	}
}
