import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class6_Sub1_Sub23 extends Class6_Sub1 {

	@OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
	private int anInt7624 = 32768;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub23() {
		super(3, false);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(29) int[] local29 = this.method8165(1, arg0);
			@Pc(35) int[] local35 = this.method8165(2, arg0);
			for (@Pc(37) int local37 = 0; local37 < Static289.anInt5549; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = local35[local37] * this.anInt7624 >> 12;
				@Pc(64) int local64 = Static293.anIntArray416[local47] * local56 >> 12;
				@Pc(72) int local72 = Static571.anIntArray829[local47] * local56 >> 12;
				@Pc(80) int local80 = local37 + (local64 >> 12) & Static153.anInt3343;
				@Pc(88) int local88 = arg0 + (local72 >> 12) & Static574.anInt9711;
				@Pc(94) int[] local94 = this.method8165(0, local88);
				local19[local37] = local94[local80];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8158(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass184_41.method4578(arg0);
		if (super.aClass184_41.aBoolean402) {
			@Pc(31) int[] local31 = this.method8165(1, arg0);
			@Pc(37) int[] local37 = this.method8165(2, arg0);
			@Pc(41) int[] local41 = local19[0];
			@Pc(45) int[] local45 = local19[1];
			@Pc(49) int[] local49 = local19[2];
			for (@Pc(51) int local51 = 0; local51 < Static289.anInt5549; local51++) {
				@Pc(63) int local63 = local31[local51] * 255 >> 12 & 0xFF;
				@Pc(72) int local72 = local37[local51] * this.anInt7624 >> 12;
				@Pc(80) int local80 = local72 * Static293.anIntArray416[local63] >> 12;
				@Pc(88) int local88 = Static571.anIntArray829[local63] * local72 >> 12;
				@Pc(96) int local96 = Static153.anInt3343 & (local80 >> 12) + local51;
				@Pc(104) int local104 = (local88 >> 12) + arg0 & Static574.anInt9711;
				@Pc(110) int[][] local110 = this.method8162(local104, 0);
				local41[local51] = local110[0][local96];
				local45[local51] = local110[1][local96];
				local49[local51] = local110[2][local96];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt7624 = arg1.method4999() << 4;
		} else if (arg0 == 1) {
			super.aBoolean719 = arg1.method4966() == 1;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	@Override
	public void method8160() {
		Static463.method7157();
	}
}
