import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
	public static int anInt5790;

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "J")
	public static long aLong173;

	@OriginalMember(owner = "client!qu", name = "o", descriptor = "Lclient!o;")
	public static Class6 aClass6_45;

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "Lclient!sr;")
	public static final Class227 aClass227_35 = new Class227();

	@OriginalMember(owner = "client!qu", name = "p", descriptor = "Z")
	public static boolean aBoolean663 = false;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BJ)V")
	public static void method4541(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static356.anInt6091 + Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518;
		@Pc(15) int local15 = Static130.anInt2372 + Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514;
		if (Static140.anInt2485 - local10 < -500 || Static140.anInt2485 - local10 > 500 || Static52.anInt896 - local15 < -500 || Static52.anInt896 - local15 > 500) {
			Static52.anInt896 = local15;
			Static140.anInt2485 = local10;
		}
		@Pc(61) int local61;
		@Pc(69) int local69;
		if (Static140.anInt2485 != local10) {
			local61 = local10 - Static140.anInt2485;
			local69 = (int) (arg0 * (long) local61 / 320L);
			if (local61 <= 0) {
				if (local69 == 0) {
					local69 = -1;
				} else if (local69 < local61) {
					local69 = local61;
				}
			} else if (local69 == 0) {
				local69 = 1;
			} else if (local69 > local61) {
				local69 = local61;
			}
			Static140.anInt2485 += local69;
		}
		if (!Static453.aClass136_Sub1_1.aBoolean495) {
			Static262.aFloat62 += (float) arg0 * Static351.aFloat72 / 6.0F;
			Static98.aFloat20 += Static252.aFloat61 * (float) arg0 / 6.0F;
		}
		if (Static52.anInt896 != local15) {
			local61 = local15 - Static52.anInt896;
			local69 = (int) (arg0 * (long) local61 / 320L);
			if (local61 > 0) {
				if (local69 == 0) {
					local69 = 1;
				} else if (local61 < local69) {
					local69 = local61;
				}
			} else if (local69 == 0) {
				local69 = -1;
			} else if (local61 > local69) {
				local69 = local61;
			}
			Static52.anInt896 += local69;
		}
		Static415.method5402();
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILclient!ie;BI)V")
	public static void method4543(@OriginalArg(0) int arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(3) int arg2) {
		Static383.aClass109ArrayArray1[arg2][arg0] = arg1;
	}
}
