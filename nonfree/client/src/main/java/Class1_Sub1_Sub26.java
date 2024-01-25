import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class1_Sub1_Sub26 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nt", name = "C", descriptor = "I")
	private int anInt5993 = 1024;

	@OriginalMember(owner = "client!nt", name = "I", descriptor = "I")
	private int anInt5998 = 2048;

	@OriginalMember(owner = "client!nt", name = "L", descriptor = "I")
	private int anInt6000 = 3072;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
	@Override
	public void method7699() {
		this.anInt5998 = this.anInt6000 - this.anInt5993;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			@Pc(21) int[] local21 = this.method7709(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static279.anInt4906; local23++) {
				local11[local23] = this.anInt5993 + (this.anInt5998 * local21[local23] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5993 = arg0.method5771();
		} else if (arg1 == 1) {
			this.anInt6000 = arg0.method5771();
		} else if (arg1 == 2) {
			super.aBoolean737 = arg0.method5750() == 1;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7705(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass46_41.method856(arg0);
		if (super.aClass46_41.aBoolean76) {
			@Pc(21) int[][] local21 = this.method7700(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static279.anInt4906; local47++) {
				local37[local47] = this.anInt5993 + (local25[local47] * this.anInt5998 >> 12);
				local41[local47] = (local29[local47] * this.anInt5998 >> 12) + this.anInt5993;
				local45[local47] = (this.anInt5998 * local33[local47] >> 12) + this.anInt5993;
			}
		}
		return local11;
	}
}
