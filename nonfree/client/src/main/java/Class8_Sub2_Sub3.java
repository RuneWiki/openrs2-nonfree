import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bha")
public final class Class8_Sub2_Sub3 extends Class8_Sub2 {

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			for (@Pc(25) int local25 = 0; local25 < Static538.anInt9297; local25++) {
				this.method1305(arg0, local25);
				@Pc(38) int[] local38 = this.method8505(Static70.anInt2087, 0);
				local11[local25] = local38[Static365.anInt6936];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			super.aBoolean753 = arg1.method8525() == 1;
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8500(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass269_41.method6817(arg0);
		if (super.aClass269_41.aBoolean591) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static538.anInt9297; local37++) {
				this.method1305(arg0, local37);
				@Pc(50) int[][] local50 = this.method8510(0, Static70.anInt2087);
				local27[local37] = local50[0][Static365.anInt6936];
				local31[local37] = local50[1][Static365.anInt6936];
				local35[local37] = local50[2][Static365.anInt6936];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "(IIB)V")
	private void method1305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static93.anIntArray111[arg1];
		@Pc(17) int local17 = Static426.anIntArray424[arg0];
		@Pc(28) float local28 = (float) Math.atan2((double) (local13 - 2048), (double) (local17 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static70.anInt2087 = arg0;
			Static365.anInt6936 = arg1;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static365.anInt6936 = arg0;
			Static70.anInt2087 = arg1;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static365.anInt6936 = Static538.anInt9297 - arg0;
			Static70.anInt2087 = arg1;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static365.anInt6936 = arg1;
			Static70.anInt2087 = Static159.anInt8698 - arg0;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static365.anInt6936 = Static538.anInt9297 - arg1;
			Static70.anInt2087 = Static159.anInt8698 - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static70.anInt2087 = Static159.anInt8698 - arg1;
			Static365.anInt6936 = Static538.anInt9297 - arg0;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static365.anInt6936 = arg0;
			Static70.anInt2087 = Static159.anInt8698 - arg1;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static365.anInt6936 = Static538.anInt9297 - arg1;
			Static70.anInt2087 = arg0;
		}
		Static70.anInt2087 &= Static17.anInt866;
		Static365.anInt6936 &= Static263.anInt5634;
	}
}
