import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!faa;)I")
	public static int method5480(@OriginalArg(1) Class47_Sub2_Sub3 arg0) {
		if (arg0.anInt5001 == 0) {
			return 0;
		}
		@Pc(64) int local64;
		@Pc(57) int local57;
		if (arg0.anInt5061 != -1) {
			@Pc(17) Class47_Sub2_Sub3 local17 = null;
			if (arg0.anInt5061 < 32768) {
				@Pc(29) Class1_Sub10 local29 = (Class1_Sub10) Static258.aClass174_15.method4422((long) arg0.anInt5061);
				if (local29 != null) {
					local17 = local29.aClass47_Sub2_Sub3_Sub1_2;
				}
			} else if (arg0.anInt5061 >= 32768) {
				local17 = Static473.aClass47_Sub2_Sub3_Sub2Array1[arg0.anInt5061 - 32768];
			}
			if (local17 != null) {
				local57 = arg0.anInt8189 - local17.anInt8189;
				local64 = arg0.anInt8191 - local17.anInt8191;
				if (local57 != 0 || local64 != 0) {
					arg0.method4364((int) (Math.atan2((double) local57, (double) local64) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class47_Sub2_Sub3_Sub2) {
			@Pc(155) Class47_Sub2_Sub3_Sub2 local155 = (Class47_Sub2_Sub3_Sub2) arg0;
			if (local155.anInt5084 != -1 && (local155.anInt5082 == 0 || local155.anInt5081 > 0)) {
				local155.method4364(local155.anInt5084);
				local155.anInt5084 = -1;
			}
		} else if (arg0 instanceof Class47_Sub2_Sub3_Sub1) {
			@Pc(90) Class47_Sub2_Sub3_Sub1 local90 = (Class47_Sub2_Sub3_Sub1) arg0;
			if (local90.anInt4225 != -1 && (local90.anInt5082 == 0 || local90.anInt5081 > 0)) {
				local57 = local90.anInt8189 - (local90.anInt4225 - Static324.anInt6132 - Static324.anInt6132) * 64;
				local64 = local90.anInt8191 - (local90.anInt4213 - Static517.anInt8716 - Static517.anInt8716) * 64;
				if (local57 != 0 || local64 != 0) {
					local90.method4364((int) (Math.atan2((double) local57, (double) local64) * 2607.5945876176133D) & 0x3FFF);
				}
				local90.anInt4225 = -1;
			}
		}
		return arg0.method4365();
	}
}
