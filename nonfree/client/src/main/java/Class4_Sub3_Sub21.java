import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class4_Sub3_Sub21 extends Class4_Sub3 {

	@OriginalMember(owner = "client!kt", name = "J", descriptor = "I")
	private int anInt4338 = 2048;

	@OriginalMember(owner = "client!kt", name = "N", descriptor = "I")
	private int anInt4342 = 3072;

	@OriginalMember(owner = "client!kt", name = "Q", descriptor = "I")
	private int anInt4345 = 1024;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(21) int[] local21 = this.method6337(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static304.anInt5637; local23++) {
				local11[local23] = this.anInt4345 + (this.anInt4338 * local21[local23] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6335(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass93_41.method2622(arg0);
		if (super.aClass93_41.aBoolean189) {
			@Pc(29) int[][] local29 = this.method6331(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static304.anInt5637; local55++) {
				local45[local55] = (local33[local55] * this.anInt4338 >> 12) + this.anInt4345;
				local49[local55] = this.anInt4345 + (this.anInt4338 * local37[local55] >> 12);
				local53[local55] = (local41[local55] * this.anInt4338 >> 12) + this.anInt4345;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "(B)V")
	@Override
	public void method6341() {
		this.anInt4338 = this.anInt4342 - this.anInt4345;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt4345 = arg1.method4560();
		} else if (arg0 == 1) {
			this.anInt4342 = arg1.method4560();
		} else if (arg0 == 2) {
			super.aBoolean587 = arg1.method4614() == 1;
		}
	}
}
