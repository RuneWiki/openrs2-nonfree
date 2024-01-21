import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class3_Sub1_Sub19 extends Class3_Sub1 {

	@OriginalMember(owner = "client!lc", name = "W", descriptor = "I")
	private int anInt2209;

	@OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
	private int anInt2212;

	@OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
	private int anInt2205;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt2205 = arg1.method208();
		} else if (arg0 == 1) {
			this.anInt2212 = arg1.method208();
		} else if (arg0 == 2) {
			super.aBoolean171 = arg1.method191() == 1;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(29) int[] local29 = this.method2904(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static141.anInt3261; local31++) {
				local19[local31] = this.anInt2205 + (local29[local31] * this.anInt2209 >> 12);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method2914(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass48_39.method1402(arg0);
		if (super.aClass48_39.aBoolean87) {
			@Pc(29) int[][] local29 = this.method2913(arg0, 0);
			@Pc(33) int[] local33 = local29[1];
			@Pc(37) int[] local37 = local29[2];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local29[0];
			@Pc(49) int[] local49 = local11[0];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static141.anInt3261; local55++) {
				local49[local55] = this.anInt2205 + (this.anInt2209 * local45[local55] >> 12);
				local41[local55] = (this.anInt2209 * local33[local55] >> 12) + this.anInt2205;
				local53[local55] = this.anInt2205 + (local37[local55] * this.anInt2209 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
	@Override
	public void method2916() {
		this.anInt2209 = this.anInt2212 - this.anInt2205;
	}
}
