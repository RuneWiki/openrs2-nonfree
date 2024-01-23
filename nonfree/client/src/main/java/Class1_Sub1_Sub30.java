import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class1_Sub1_Sub30 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
	private int anInt4677 = 1024;

	@OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
	private int anInt4679 = 2048;

	@OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
	private int anInt4680 = 3072;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(27) int[] local27 = this.method4746(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static75.anInt1848; local29++) {
				local17[local29] = this.anInt4677 + (this.anInt4679 * local27[local29] >> 12);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118) {
			@Pc(29) int[][] local29 = this.method4758(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[2];
			@Pc(53) int[] local53 = local19[1];
			for (@Pc(55) int local55 = 0; local55 < Static75.anInt1848; local55++) {
				local45[local55] = this.anInt4677 + (local33[local55] * this.anInt4679 >> 12);
				local53[local55] = (local37[local55] * this.anInt4679 >> 12) + this.anInt4677;
				local49[local55] = (this.anInt4679 * local41[local55] >> 12) + this.anInt4677;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4677 = arg0.method2652();
		} else if (arg1 == 1) {
			this.anInt4680 = arg0.method2652();
		} else if (arg1 == 2) {
			this.aBoolean324 = arg0.method2655() == 1;
		}
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(B)V")
	@Override
	public void method4756() {
		this.anInt4679 = this.anInt4680 - this.anInt4677;
	}
}
