import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class4_Sub2_Sub24 extends Class4_Sub2 {

	@OriginalMember(owner = "client!raa", name = "L", descriptor = "I")
	private int anInt7956 = 3072;

	@OriginalMember(owner = "client!raa", name = "H", descriptor = "I")
	private int anInt7953 = 1024;

	@OriginalMember(owner = "client!raa", name = "D", descriptor = "I")
	private int anInt7950 = 2048;

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
	@Override
	public void method8769() {
		this.anInt7950 = this.anInt7956 - this.anInt7953;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt7953 = arg1.method8859();
		} else if (arg0 == 1) {
			this.anInt7956 = arg1.method8859();
		} else if (arg0 == 2) {
			super.aBoolean793 = arg1.method8865() == 1;
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8771(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass304_41.method6699(arg0);
		if (super.aClass304_41.aBoolean604) {
			@Pc(21) int[][] local21 = this.method8772(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static269.anInt4330; local47++) {
				local37[local47] = (local25[local47] * this.anInt7950 >> 12) + this.anInt7953;
				local41[local47] = this.anInt7953 + (local29[local47] * this.anInt7950 >> 12);
				local45[local47] = this.anInt7953 + (this.anInt7950 * local33[local47] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(21) int[] local21 = this.method8768(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static269.anInt4330; local23++) {
				local11[local23] = (local21[local23] * this.anInt7950 >> 12) + this.anInt7953;
			}
		}
		return local11;
	}
}
