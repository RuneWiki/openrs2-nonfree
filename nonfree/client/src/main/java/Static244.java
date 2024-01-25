import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!og", name = "h", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_96 = new Class205(91, 7);

	@OriginalMember(owner = "client!og", name = "i", descriptor = "I")
	public static int anInt4347 = -1;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(JI)V")
	public static void method3907(@OriginalArg(0) long arg0) {
		@Pc(11) int local11 = Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 + Static174.anInt3329;
		@Pc(16) int local16 = Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386 + Static250.anInt4448;
		if (Static28.anInt601 - local11 < -500 || Static28.anInt601 - local11 > 500 || Static289.anInt5022 - local16 < -500 || Static289.anInt5022 - local16 > 500) {
			Static289.anInt5022 = local16;
			Static28.anInt601 = local11;
		}
		@Pc(61) int local61;
		@Pc(69) int local69;
		if (local11 != Static28.anInt601) {
			local61 = local11 - Static28.anInt601;
			local69 = (int) (arg0 * (long) local61 / 320L);
			if (local61 > 0) {
				if (local69 == 0) {
					local69 = 1;
				} else if (local69 > local61) {
					local69 = local61;
				}
			} else if (local69 == 0) {
				local69 = -1;
			} else if (local69 < local61) {
				local69 = local61;
			}
			Static28.anInt601 += local69;
		}
		if (Static289.anInt5022 != local16) {
			local61 = local16 - Static289.anInt5022;
			local69 = (int) ((long) local61 * arg0 / 320L);
			if (local61 <= 0) {
				if (local69 == 0) {
					local69 = -1;
				} else if (local61 > local69) {
					local69 = local61;
				}
			} else if (local69 == 0) {
				local69 = 1;
			} else if (local69 > local61) {
				local69 = local61;
			}
			Static289.anInt5022 += local69;
		}
		if (!Static207.aBoolean371) {
			Static127.aFloat41 += Static345.aFloat82 * (float) arg0 / 6.0F;
			Static1.aFloat80 += Static283.aFloat70 * (float) arg0 / 6.0F;
		}
		Static43.method732();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIB)V")
	public static void method3910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub10_Sub2 local8 = Static217.method3611(arg1, 6);
		local8.method864();
		local8.anInt1037 = arg0;
	}
}
