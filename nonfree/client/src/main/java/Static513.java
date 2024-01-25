import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "[S")
	public static short[] aShortArray140 = new short[256];

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_110 = new Class316(64, -1);

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "[F")
	public static final float[] aFloatArray74 = new float[4];

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[BIIII)V")
	public static void method6920(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(21) int local21 = arg1 - arg3 >> 2;
		arg2 += arg3;
		while (true) {
			local21--;
			if (local21 < 0) {
				local21 = arg1 - arg3 & 0x3;
				while (true) {
					local21--;
					if (local21 < 0) {
						return;
					}
					arg0[arg2++] = 1;
				}
			}
			@Pc(30) int local30 = arg2 + 1;
			arg0[arg2] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg0[local30] = 1;
			@Pc(40) int local40 = local35 + 1;
			arg0[local35] = 1;
			arg2 = local40 + 1;
			arg0[local40] = 1;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(JJ)J")
	public static long method6921(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	public static void method6926() {
		try {
			if (Static131.anInt2504 == 1) {
				@Pc(16) int local16 = Static373.aClass6_Sub15_Sub3_2.method6660();
				if (local16 > 0 && Static373.aClass6_Sub15_Sub3_2.method6647()) {
					local16 -= Static321.anInt6142;
					if (local16 < 0) {
						local16 = 0;
					}
					Static373.aClass6_Sub15_Sub3_2.method6644(local16);
				} else {
					Static373.aClass6_Sub15_Sub3_2.method6656();
					Static373.aClass6_Sub15_Sub3_2.method6646();
					Static498.aClass6_Sub19_2 = null;
					Static353.aClass198_1 = null;
					if (Static226.aClass248_33 == null) {
						Static131.anInt2504 = 0;
					} else {
						Static131.anInt2504 = 2;
					}
				}
			}
		} catch (@Pc(57) Exception local57) {
			local57.printStackTrace();
			Static373.aClass6_Sub15_Sub3_2.method6656();
			Static226.aClass248_33 = null;
			Static498.aClass6_Sub19_2 = null;
			Static131.anInt2504 = 0;
			Static353.aClass198_1 = null;
		}
	}
}
