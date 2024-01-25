import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class11_Sub2_Sub11 extends Class11_Sub2 {

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5709(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass63_41.method1118(arg0);
		if (super.aClass63_41.aBoolean85) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static339.anInt6549; local29++) {
				this.method1752(arg0, local29);
				@Pc(44) int[][] local44 = this.method5715(Static165.anInt3287, 0);
				local19[local29] = local44[0][Static210.anInt4281];
				local23[local29] = local44[1][Static210.anInt4281];
				local27[local29] = local44[2][Static210.anInt4281];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(III)V")
	private void method1752(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static73.anIntArray91[arg1];
		@Pc(17) int local17 = Static155.anIntArray196[arg0];
		@Pc(28) float local28 = (float) Math.atan2((double) (local13 - 2048), (double) (local17 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static165.anInt3287 = arg0;
			Static210.anInt4281 = arg1;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static165.anInt3287 = arg1;
			Static210.anInt4281 = arg0;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static165.anInt3287 = arg1;
			Static210.anInt4281 = Static339.anInt6549 - arg0;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static165.anInt3287 = Static113.anInt2160 - arg0;
			Static210.anInt4281 = arg1;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static210.anInt4281 = Static339.anInt6549 - arg1;
			Static165.anInt3287 = Static113.anInt2160 - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static210.anInt4281 = Static339.anInt6549 - arg0;
			Static165.anInt3287 = Static113.anInt2160 - arg1;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static210.anInt4281 = arg0;
			Static165.anInt3287 = Static113.anInt2160 - arg1;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static165.anInt3287 = arg0;
			Static210.anInt4281 = Static339.anInt6549 - arg1;
		}
		Static210.anInt4281 &= Static323.anInt6272;
		Static165.anInt3287 &= Static75.anInt1419;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			for (@Pc(22) int local22 = 0; local22 < Static339.anInt6549; local22++) {
				this.method1752(arg0, local22);
				@Pc(35) int[] local35 = this.method5710(0, Static165.anInt3287);
				local11[local22] = local35[Static210.anInt4281];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean427 = arg0.method5185() == 1;
		}
	}
}
