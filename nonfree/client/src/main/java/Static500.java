import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
	public static int anInt8319;

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!rba", name = "o", descriptor = "I")
	public static int anInt8325;

	@OriginalMember(owner = "client!rba", name = "m", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_194 = new Class359(118, 6);

	@OriginalMember(owner = "client!rba", name = "n", descriptor = "I")
	public static int anInt8324 = 0;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!si;IIIB)Z")
	public static boolean method7125(@OriginalArg(0) Class28_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static37.aBoolean43 || !Static521.aBoolean738) {
			return false;
		} else if (Static383.anInt6814 < 100) {
			return false;
		} else if (Static380.method5646(arg2, arg3, arg1)) {
			@Pc(38) int local38 = arg3 << Static588.anInt9672;
			@Pc(42) int local42 = arg1 << Static588.anInt9672;
			@Pc(52) int local52 = Static495.aClass109Array4[arg2].method7695(arg1, arg3) - 1;
			@Pc(58) int local58 = arg0.method8976() + local52;
			if (arg0.aShort59 == 1) {
				if (!Static395.method5806(local58, local38, local52, local42, Static671.anInt10769 + local42, local58, local38, local42, local38)) {
					return false;
				} else if (Static395.method5806(local58, local38, local52, local42, local42 + Static671.anInt10769, local52, local38, local42 + Static671.anInt10769, local38)) {
					Static464.anInt7835++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort59 == 2) {
				if (!Static395.method5806(local58, local38, local52, local42 + Static671.anInt10769, Static671.anInt10769 + local42, local58, local38, local42 + Static671.anInt10769, Static671.anInt10769 + local38)) {
					return false;
				} else if (Static395.method5806(local52, local38, local52, Static671.anInt10769 + local42, local42 - -Static671.anInt10769, local58, Static671.anInt10769 + local38, Static671.anInt10769 + local42, local38 + Static671.anInt10769)) {
					Static464.anInt7835++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort59 == 4) {
				if (!Static395.method5806(local58, local38 + Static671.anInt10769, local52, local42, local42 + Static671.anInt10769, local58, Static671.anInt10769 + local38, local42, local38 + Static671.anInt10769)) {
					return false;
				} else if (Static395.method5806(local58, local38 + Static671.anInt10769, local52, local42, Static671.anInt10769 + local42, local52, Static671.anInt10769 + local38, local42 + Static671.anInt10769, Static671.anInt10769 + local38)) {
					Static464.anInt7835++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort59 == 8) {
				if (!Static395.method5806(local58, local38, local52, local42, local42, local58, local38, local42, Static671.anInt10769 + local38)) {
					return false;
				} else if (Static395.method5806(local52, local38, local52, local42, local42, local58, local38 + Static671.anInt10769, local42, Static671.anInt10769 + local38)) {
					Static464.anInt7835++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort59 == 16) {
				if (Static421.method6265(local58, Static558.anInt7322, local38, local42 + Static558.anInt7322, local52, Static558.anInt7322)) {
					Static464.anInt7835++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort59 == 32) {
				if (Static421.method6265(local58, Static558.anInt7322, Static558.anInt7322 + local38, local42 - -Static558.anInt7322, local52, Static558.anInt7322)) {
					Static464.anInt7835++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort59 == 64) {
				if (Static421.method6265(local58, Static558.anInt7322, Static558.anInt7322 + local38, local42, local52, Static558.anInt7322)) {
					Static464.anInt7835++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort59 != 128) {
				return true;
			} else if (Static421.method6265(local58, Static558.anInt7322, local38, local42, local52, Static558.anInt7322)) {
				Static464.anInt7835++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(II)V")
	public static void method7128(@OriginalArg(0) int arg0) {
		Static660.aLong302 = 1000000000L / (long) arg0;
	}
}
