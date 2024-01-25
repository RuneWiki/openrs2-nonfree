import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!qja", name = "r", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_125 = new Class171(62, 10);

	@OriginalMember(owner = "client!qja", name = "v", descriptor = "[F")
	public static final float[] aFloatArray43 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!qja", name = "w", descriptor = "I")
	public static int anInt7829 = 0;

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(BI)Lclient!ef;")
	public static Class97 method6481(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static671.aFloat183 == 3.0D) {
				return Static26.aClass97_1;
			}
			if ((double) Static671.aFloat183 == 4.0D) {
				return Static290.aClass97_3;
			}
			if ((double) Static671.aFloat183 == 6.0D) {
				return Static635.aClass97_7;
			}
			if ((double) Static671.aFloat183 >= 8.0D) {
				return Static142.aClass97_2;
			}
		} else if (arg0 == 1) {
			if ((double) Static671.aFloat183 == 3.0D) {
				return Static635.aClass97_7;
			}
			if ((double) Static671.aFloat183 == 4.0D) {
				return Static142.aClass97_2;
			}
			if ((double) Static671.aFloat183 == 6.0D) {
				return Static465.aClass97_5;
			}
			if ((double) Static671.aFloat183 >= 8.0D) {
				return Static515.aClass97_6;
			}
		} else if (arg0 == 2) {
			if ((double) Static671.aFloat183 == 3.0D) {
				return Static465.aClass97_5;
			}
			if ((double) Static671.aFloat183 == 4.0D) {
				return Static515.aClass97_6;
			}
			if ((double) Static671.aFloat183 == 6.0D) {
				return Static405.aClass97_4;
			}
			if ((double) Static671.aFloat183 >= 8.0D) {
				return Static654.aClass97_8;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(ZI[BIIII)Z")
	public static boolean method6487(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(19) int local19;
		if (local9 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg3 + 8 - 1) / 8);
		@Pc(46) int local46 = -((arg4 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local32; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local46; local52 < 0; local52++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local19;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg2;
		}
		return false;
	}
}
