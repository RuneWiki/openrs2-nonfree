import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!j", name = "m", descriptor = "Lclient!bg;")
	public static Class22 aClass22_1;

	@OriginalMember(owner = "client!j", name = "z", descriptor = "I")
	public static int anInt3180;

	@OriginalMember(owner = "client!j", name = "r", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_106 = new Class221(20, -1);

	@OriginalMember(owner = "client!j", name = "u", descriptor = "I")
	public static int anInt3175 = 64;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)V")
	public static void method2851(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static121.aByteArrayArray8;
			local11 = 1;
		} else {
			local9 = Static84.aByteArrayArray4;
			local11 = 4;
		}
		for (@Pc(19) int local19 = 0; local19 < local11; local19++) {
			Static276.method4761();
			for (@Pc(25) int local25 = 0; local25 < Static66.anInt1177 >> 3; local25++) {
				for (@Pc(29) int local29 = 0; local29 < Static12.anInt213 >> 3; local29++) {
					@Pc(39) int local39 = Static53.anIntArrayArrayArray4[local19][local25][local29];
					if (local39 != -1) {
						@Pc(48) int local48 = local39 >> 24 & 0x3;
						if (!arg0 || local48 == 0) {
							@Pc(58) int local58 = local39 >> 1 & 0x3;
							@Pc(64) int local64 = local39 >> 14 & 0x3FF;
							@Pc(70) int local70 = local39 >> 3 & 0x7FF;
							@Pc(80) int local80 = local70 / 8 + (local64 / 8 << 8);
							for (@Pc(82) int local82 = 0; local82 < Static25.anIntArray50.length; local82++) {
								if (local80 == Static25.anIntArray50[local82] && local9[local82] != null) {
									Static242.method4785(local58, (local70 & 0x7) * 8, local48, local19, arg0, local25 * 8, local9[local82], (local64 & 0x7) * 8, Static182.aClass61Array2, Static51.aClass37_1, local29 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
	public static void method2852(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class2_Sub9_Sub4 local16 = Static98.method1971(9, arg1);
		local16.method1801();
		local16.anInt1729 = arg2;
		local16.anInt1723 = arg0;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V")
	public static void method2853() {
		@Pc(5) Class107 local5 = Static217.aClass107_29;
		synchronized (Static217.aClass107_29) {
			Static217.aClass107_29.method3011(5);
		}
		local5 = Static258.aClass107_38;
		synchronized (Static258.aClass107_38) {
			Static258.aClass107_38.method3011(5);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)Lclient!si;")
	public static Class182 method2855(@OriginalArg(0) int arg0) {
		@Pc(17) Class182 local17 = (Class182) Static291.aClass107_33.method3021((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static149.aClass104_88.method2756(29, arg0);
		local17 = new Class182();
		if (local27 != null) {
			local17.method4936(arg0, new Class2_Sub12(local27));
		}
		Static291.aClass107_33.method3018((long) arg0, local17);
		return local17;
	}
}
