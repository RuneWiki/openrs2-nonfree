import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class4_Sub4_Sub15 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ir", name = "L", descriptor = "I")
	private int anInt4708 = 32768;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub15() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392) {
			@Pc(29) int[] local29 = this.method7890(1, arg0);
			@Pc(37) int[] local37 = this.method7890(2, arg0);
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local11[1];
			@Pc(49) int[] local49 = local11[2];
			for (@Pc(51) int local51 = 0; local51 < Static560.anInt9394; local51++) {
				@Pc(63) int local63 = local29[local51] * 255 >> 12 & 0xFF;
				@Pc(72) int local72 = this.anInt4708 * local37[local51] >> 12;
				@Pc(80) int local80 = local72 * Static488.anIntArray645[local63] >> 12;
				@Pc(88) int local88 = local72 * Static427.anIntArray604[local63] >> 12;
				@Pc(97) int local97 = local51 + (local80 >> 12) & Static571.anInt9405;
				@Pc(105) int local105 = (local88 >> 12) + arg0 & Static360.anInt6375;
				@Pc(111) int[][] local111 = this.method7892(0, local105);
				local41[local51] = local111[0][local97];
				local45[local51] = local111[1][local97];
				local49[local51] = local111[2][local97];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(21) int[] local21 = this.method7890(1, arg0);
			@Pc(27) int[] local27 = this.method7890(2, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static560.anInt9394; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = local27[local29] * this.anInt4708 >> 12;
				@Pc(56) int local56 = local48 * Static488.anIntArray645[local39] >> 12;
				@Pc(64) int local64 = local48 * Static427.anIntArray604[local39] >> 12;
				@Pc(72) int local72 = (local56 >> 12) + local29 & Static571.anInt9405;
				@Pc(80) int local80 = (local64 >> 12) + arg0 & Static360.anInt6375;
				@Pc(86) int[] local86 = this.method7890(0, local80);
				local11[local29] = local86[local72];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt4708 = arg1.method5982() << 4;
		} else if (arg0 == 1) {
			super.aBoolean679 = arg1.method6015() == 1;
		}
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V")
	@Override
	public void method7894() {
		Static61.method1040();
	}
}
