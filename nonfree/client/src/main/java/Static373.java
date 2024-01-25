import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "Lclient!dn;")
	public static Class54 aClass54_2;

	@OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
	public static int anInt6112;

	@OriginalMember(owner = "client!ss", name = "r", descriptor = "[I")
	public static int[] anIntArray492;

	@OriginalMember(owner = "client!ss", name = "s", descriptor = "I")
	public static int anInt6115 = -1;

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)I")
	public static int method4910() {
		if (Static11.aClass110_1 == null) {
			if (!Static339.aBoolean390 && Static351.anInt5841 > 0) {
				if (Static196.aBoolean269 && Static180.aClass107_1.method2003(81) && Static351.anInt5841 > 2) {
					return ((Class4_Sub30) Static41.aClass244_2.aClass4_227.aClass4_262.aClass4_262).anInt4616;
				}
				return ((Class4_Sub30) Static41.aClass244_2.aClass4_227.aClass4_262).anInt4616;
			}
			@Pc(20) int local20 = Static455.aClass48_1.method1138();
			@Pc(24) int local24 = Static455.aClass48_1.method1142();
			@Pc(26) int local26 = Static50.anInt816;
			@Pc(28) int local28 = Static328.anInt5318;
			@Pc(30) int local30 = Static128.anInt7338;
			if (local20 > local26 && local20 < local30 + local26) {
				@Pc(44) int local44 = -1;
				@Pc(62) int local62;
				for (@Pc(46) int local46 = 0; local46 < Static351.anInt5841; local46++) {
					if (Static265.aBoolean325) {
						local62 = local28 + (Static351.anInt5841 - 1 - local46) * 16 + 33;
						if (local24 > local62 - 13 && local24 <= local62 + 3) {
							local44 = local46;
						}
					} else {
						local62 = (Static351.anInt5841 - local46 - 1) * 16 + local28 + 31;
						if (local24 > local62 - 13 && local62 + 3 >= local24) {
							local44 = local46;
						}
					}
				}
				if (local44 != -1) {
					local62 = 0;
					@Pc(120) Class208 local120 = new Class208(Static41.aClass244_2);
					for (@Pc(125) Class4_Sub30 local125 = (Class4_Sub30) local120.method4290(); local125 != null; local125 = (Class4_Sub30) local120.method4288()) {
						if (local62++ == local44) {
							return local125.anInt4616;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILclient!qn;Z)Lclient!li;")
	public static Class158 method4911(@OriginalArg(0) int arg0, @OriginalArg(1) Class211 arg1) {
		@Pc(8) byte[] local8 = arg1.method4353(arg0);
		return local8 == null ? null : new Class158(local8);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4912(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
