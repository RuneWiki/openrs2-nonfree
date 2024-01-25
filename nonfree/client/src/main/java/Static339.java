import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_67 = new Class230(38, 4);

	@OriginalMember(owner = "client!nba", name = "h", descriptor = "J")
	public static long aLong179 = 0L;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V")
	public static void method5809() {
		if (!Static15.aBoolean41) {
			return;
		}
		while (true) {
			while (Static228.aClass69_Sub1Array1.length > Static485.anInt9061) {
				@Pc(21) Class69_Sub1 local21 = Static228.aClass69_Sub1Array1[Static485.anInt9061];
				if (local21 != null && local21.anInt4847 == -1) {
					if (Static43.aClass3_Sub26_30 == null) {
						Static43.aClass3_Sub26_30 = Static477.aClass285_1.method7065(local21.aString50);
					}
					@Pc(44) int local44 = Static43.aClass3_Sub26_30.anInt4727;
					if (local44 == -1) {
						return;
					}
					local21.anInt4847 = local44;
					Static485.anInt9061++;
					Static43.aClass3_Sub26_30 = null;
				} else {
					Static485.anInt9061++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "([BI)V")
	public static void method5812(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class3_Sub7 local13 = new Class3_Sub7(arg0);
		while (true) {
			@Pc(17) int local17 = local13.method6538();
			if (local17 == 0) {
				return;
			}
			if (local17 == 2) {
				Static195.anInt3801 = local13.method6535();
			}
		}
	}
}
