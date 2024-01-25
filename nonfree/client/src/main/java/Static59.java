import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
	public static int anInt723;

	@OriginalMember(owner = "client!bw", name = "w", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_19 = new Class322(25, -2);

	@OriginalMember(owner = "client!bw", name = "q", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_20 = new Class322(49, 6);

	@OriginalMember(owner = "client!bw", name = "z", descriptor = "[Lclient!lq;")
	public static Class204_Sub1[] aClass204_Sub1Array1 = new Class204_Sub1[0];

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZII)Z")
	public static boolean method706(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static484.aBoolean623) {
			return false;
		}
		@Pc(14) int local14 = arg0 >> 16;
		@Pc(18) int local18 = arg0 & 0xFFFF;
		if (Static686.aClass381ArrayArray2[local14] == null || Static686.aClass381ArrayArray2[local14][local18] == null) {
			return false;
		}
		@Pc(39) Class381 local39 = Static686.aClass381ArrayArray2[local14][local18];
		@Pc(55) Class6_Sub2_Sub11 local55;
		if (arg1 == -1 && local39.anInt10156 == 0) {
			for (local55 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8124(); local55 != null; local55 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8134()) {
				if (local55.anInt5173 == 45 || local55.anInt5173 == 1007 || local55.anInt5173 == 11 || local55.anInt5173 == 6 || local55.anInt5173 == 60) {
					for (@Pc(102) Class381 local102 = Static69.method899(local55.anInt5167); local102 != null; local102 = Static266.method4536(local102)) {
						if (local102.anInt10089 == local39.anInt10089) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8124(); local55 != null; local55 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8134()) {
				if (local55.anInt5168 == arg1 && local55.anInt5167 == local39.anInt10089 && (local55.anInt5173 == 45 || local55.anInt5173 == 1007 || local55.anInt5173 == 11 || local55.anInt5173 == 6 || local55.anInt5173 == 60)) {
					return true;
				}
			}
		}
		if (false) {
			method707(-62);
		}
		return false;
	}
}
