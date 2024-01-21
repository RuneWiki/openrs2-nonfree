import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class3_Sub1_Sub9 extends Class3_Sub1 {

	@OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
	private int anInt1208;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(21) int[] local21 = this.method2904(1, arg0);
			@Pc(27) int[] local27 = this.method2904(2, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static141.anInt3261; local29++) {
				@Pc(40) int local40 = local27[local29] * this.anInt1208 >> 12;
				@Pc(48) int local48 = local21[local29] >> 4 & 0xFF;
				@Pc(56) int local56 = local40 * Static25.anIntArray445[local48] >> 12;
				@Pc(64) int local64 = Static67.anInt1764 & (local56 >> 12) + local29;
				@Pc(72) int local72 = local40 * Static113.anIntArray218[local48] >> 12;
				@Pc(81) int local81 = arg0 + (local72 >> 12) & Static169.anInt3754;
				@Pc(87) int[] local87 = this.method2904(0, local81);
				local11[local29] = local87[local64];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method2914(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass48_39.method1402(arg0);
		if (super.aClass48_39.aBoolean87) {
			@Pc(21) int[] local21 = this.method2904(1, arg0);
			@Pc(27) int[] local27 = this.method2904(2, arg0);
			@Pc(31) int[] local31 = local11[2];
			@Pc(35) int[] local35 = local11[0];
			@Pc(39) int[] local39 = local11[1];
			for (@Pc(41) int local41 = 0; local41 < Static141.anInt3261; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = this.anInt1208 * local27[local41] >> 12;
				@Pc(70) int local70 = Static113.anIntArray218[local53] * local62 >> 12;
				@Pc(79) int local79 = arg0 + (local70 >> 12) & Static169.anInt3754;
				@Pc(87) int local87 = local62 * Static25.anIntArray445[local53] >> 12;
				@Pc(95) int local95 = Static67.anInt1764 & local41 + (local87 >> 12);
				@Pc(101) int[][] local101 = this.method2913(local79, 0);
				local35[local41] = local101[0][local95];
				local39[local41] = local101[1][local95];
				local31[local41] = local101[2][local95];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)V")
	@Override
	public void method2916() {
		Static6.method99();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt1208 = arg1.method208() << 4;
		} else if (arg0 == 1) {
			super.aBoolean171 = arg1.method191() == 1;
		}
	}
}
