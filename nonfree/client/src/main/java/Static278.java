import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method4563() throws IOException {
		if (Static563.aClass127_2 == null || Static249.anInt4924 <= 0) {
			return;
		}
		@Pc(7) int local7 = 0;
		while (true) {
			@Pc(12) Class6_Sub31 local12 = (Class6_Sub31) Static585.aClass361_70.method7838();
			if (local12 == null) {
				Static75.anInt1633 += local7;
				Static133.anInt2978 = 0;
				break;
			}
			Static563.aClass127_2.method6309(local12.anInt5591, local12.aClass6_Sub21_Sub2_2.aByteArray93);
			local7 += local12.anInt5591;
			Static249.anInt4924 -= local12.anInt5591;
			local12.method7804();
			local12.aClass6_Sub21_Sub2_2.method6013();
			local12.method4812();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static void method4564() {
		@Pc(7) int local7 = 0;
		if (Static140.aClass6_Sub48_Sub1_1 != null) {
			local7 = Static140.aClass6_Sub48_Sub1_1.method7381(Static560.anInt9242);
		}
		@Pc(30) int local30;
		@Pc(39) int local39;
		if (local7 == 2) {
			local30 = Static1.anInt9404 > 800 ? 800 : Static1.anInt9404;
			local39 = Static120.anInt2852 <= 600 ? Static120.anInt2852 : 600;
			Static543.anInt8951 = (Static1.anInt9404 - local30) / 2;
			Static240.anInt4852 = local30;
			Static309.anInt5674 = 0;
			Static196.anInt4059 = local39;
		} else if (local7 == 1) {
			local30 = Static1.anInt9404 <= 1024 ? Static1.anInt9404 : 1024;
			Static240.anInt4852 = local30;
			Static543.anInt8951 = (Static1.anInt9404 - local30) / 2;
			local39 = Static120.anInt2852 > 768 ? 768 : Static120.anInt2852;
			Static196.anInt4059 = local39;
			Static309.anInt5674 = 0;
		} else {
			Static240.anInt4852 = Static1.anInt9404;
			Static543.anInt8951 = 0;
			Static309.anInt5674 = 0;
			Static196.anInt4059 = Static120.anInt2852;
		}
	}
}
