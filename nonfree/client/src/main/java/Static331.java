import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!lea", name = "t", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_60 = new Class187(90, 4);

	@OriginalMember(owner = "client!lea", name = "F", descriptor = "I")
	public static int anInt6012 = 0;

	@OriginalMember(owner = "client!lea", name = "G", descriptor = "I")
	public static int anInt6013 = 0;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(JI)V")
	public static void method5123(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static476.anInt8263;
		@Pc(9) int local9 = Static170.anInt2808;
		@Pc(21) int local21;
		@Pc(29) int local29;
		if (local7 != Static171.anInt2825) {
			local21 = local7 - Static171.anInt2825;
			local29 = (int) ((long) local21 * arg0 / 320L);
			if (local21 > 0) {
				if (local29 == 0) {
					local29 = 1;
				} else if (local29 > local21) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = -1;
			} else if (local21 > local29) {
				local29 = local21;
			}
			Static171.anInt2825 += local29;
		}
		Static495.aFloat161 += (float) arg0 * Static644.aFloat196 / 40.0F * 8.0F;
		if (local9 != Static602.anInt9872) {
			local21 = local9 - Static602.anInt9872;
			local29 = (int) (arg0 * (long) local21 / 320L);
			if (local21 <= 0) {
				if (local29 == 0) {
					local29 = -1;
				} else if (local21 > local29) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = 1;
			} else if (local29 > local21) {
				local29 = local21;
			}
			Static602.anInt9872 += local29;
		}
		Static329.aFloat117 += (float) arg0 * Static147.aFloat198 / 40.0F * 8.0F;
		Static221.method3130();
	}
}
