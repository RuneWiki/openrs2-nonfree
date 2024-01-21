import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class3_Sub5_Sub1 extends Class3_Sub5 {

	@OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
	private int anInt443;

	@OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
	private int anInt444;

	@OriginalMember(owner = "client!bi", name = "V", descriptor = "I")
	private int anInt446;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(29) int[] local29 = this.method3167(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static104.anInt2195; local31++) {
				local19[local31] = (local29[local31] * this.anInt444 >> 12) + this.anInt446;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt446 = arg1.method2111();
		} else if (arg0 == 1) {
			this.anInt443 = arg1.method2111();
		} else if (arg0 == 2) {
			super.aBoolean178 = arg1.method2107() == 1;
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3172(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass89_41.method2876(arg0);
		if (super.aClass89_41.aBoolean160) {
			@Pc(21) int[][] local21 = this.method3163(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int[] local41 = local11[2];
			@Pc(45) int[] local45 = local11[0];
			for (@Pc(47) int local47 = 0; local47 < Static104.anInt2195; local47++) {
				local45[local47] = this.anInt446 + (this.anInt444 * local25[local47] >> 12);
				local37[local47] = this.anInt446 + (this.anInt444 * local29[local47] >> 12);
				local41[local47] = (this.anInt444 * local33[local47] >> 12) + this.anInt446;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
	@Override
	public void method3164() {
		this.anInt444 = this.anInt443 - this.anInt446;
	}
}
