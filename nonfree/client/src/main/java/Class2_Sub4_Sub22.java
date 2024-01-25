import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class2_Sub4_Sub22 extends Class2_Sub4 {

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			super.aBoolean789 = arg1.method4464() == 1;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7561(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass143_41.method2531(arg0);
		if (super.aClass143_41.aBoolean214) {
			@Pc(26) int[] local26 = local18[0];
			@Pc(30) int[] local30 = local18[1];
			@Pc(34) int[] local34 = local18[2];
			for (@Pc(36) int local36 = 0; local36 < Static143.anInt7434; local36++) {
				this.method5203(local36, arg0);
				@Pc(49) int[][] local49 = this.method7567(Static440.anInt7074, 0);
				local26[local36] = local49[0][Static288.anInt4881];
				local30[local36] = local49[1][Static288.anInt4881];
				local34[local36] = local49[2][Static288.anInt4881];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(BII)V")
	private void method5203(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static519.anIntArray155[arg0];
		@Pc(13) int local13 = Static13.anIntArray418[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static440.anInt7074 = arg1;
			Static288.anInt4881 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static288.anInt4881 = arg1;
			Static440.anInt7074 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static288.anInt4881 = Static143.anInt7434 - arg1;
			Static440.anInt7074 = arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static288.anInt4881 = arg0;
			Static440.anInt7074 = Static42.anInt782 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static440.anInt7074 = Static42.anInt782 - arg1;
			Static288.anInt4881 = Static143.anInt7434 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static288.anInt4881 = Static143.anInt7434 - arg1;
			Static440.anInt7074 = Static42.anInt782 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static288.anInt4881 = arg1;
			Static440.anInt7074 = Static42.anInt782 - arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static440.anInt7074 = arg1;
			Static288.anInt4881 = Static143.anInt7434 - arg0;
		}
		Static440.anInt7074 &= Static407.anInt6676;
		Static288.anInt4881 &= Static464.anInt7427;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			for (@Pc(25) int local25 = 0; local25 < Static143.anInt7434; local25++) {
				this.method5203(local25, arg0);
				@Pc(38) int[] local38 = this.method7568(Static440.anInt7074, 0);
				local19[local25] = local38[Static288.anInt4881];
			}
		}
		return local19;
	}
}
