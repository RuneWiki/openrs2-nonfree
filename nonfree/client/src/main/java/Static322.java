import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_142 = new Class263(16, 0);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!za;)V")
	public static void method4580(@OriginalArg(0) Class106 arg0) {
		for (@Pc(1) int local1 = Static307.anInt5772; local1 < Static220.anInt4418; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static216.anInt4346; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static198.anInt7949; local7++) {
					@Pc(16) Class252 local16 = Static67.aClass252ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class30_Sub3 local21 = local16.aClass30_Sub3_3;
						@Pc(24) Class30_Sub3 local24 = local16.aClass30_Sub3_2;
						if (local21 != null && local21.method5719()) {
							Static271.method4038(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5719()) {
								Static271.method4038(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5718(0, arg0, 0, 0, local21, false);
								local24.method5721();
							}
							local21.method5721();
						}
						for (@Pc(70) Class208 local70 = local16.aClass208_3; local70 != null; local70 = local70.aClass208_2) {
							@Pc(74) Class30_Sub1 local74 = local70.aClass30_Sub1_1;
							if (local74 != null && local74.method5719()) {
								Static271.method4038(arg0, local74, local1, local4, local7, local74.aShort105 + 1 - local74.aShort104, local74.aShort102 - local74.aShort103 + 1);
								local74.method5721();
							}
						}
						@Pc(111) Class30_Sub4 local111 = local16.aClass30_Sub4_2;
						if (local111 != null && local111.method5719()) {
							Static26.method559(arg0, local111, local1, local4, local7);
							local111.method5721();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)I")
	public static int method4581() {
		@Pc(10) Class91 local10 = Static406.aClass91_61;
		synchronized (Static406.aClass91_61) {
			return Static406.aClass91_61.method1994();
		}
	}
}
