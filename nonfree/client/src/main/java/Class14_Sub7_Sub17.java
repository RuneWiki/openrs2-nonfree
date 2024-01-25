import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class14_Sub7_Sub17 extends Class14_Sub7 {

	@OriginalMember(owner = "client!iw", name = "N", descriptor = "I")
	private int anInt4970 = 3072;

	@OriginalMember(owner = "client!iw", name = "M", descriptor = "I")
	private int anInt4972 = 1024;

	@OriginalMember(owner = "client!iw", name = "J", descriptor = "I")
	private int anInt4974 = 2048;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655) {
			@Pc(29) int[][] local29 = this.method9384(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static613.anInt10114; local55++) {
				local45[local55] = this.anInt4972 + (this.anInt4974 * local33[local55] >> 12);
				local49[local55] = (local37[local55] * this.anInt4974 >> 12) + this.anInt4972;
				local53[local55] = this.anInt4972 + (local41[local55] * this.anInt4974 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt4972 = arg1.method7717(-1978450544);
		} else if (arg0 == 1) {
			this.anInt4970 = arg1.method7717(-1978450544);
		} else if (arg0 == 2) {
			super.aBoolean773 = arg1.method7695(109) == 1;
		}
	}

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "(I)V")
	@Override
	public void method9386() {
		this.anInt4974 = this.anInt4970 - this.anInt4972;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(21) int[] local21 = this.method9379(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static613.anInt10114; local23++) {
				local11[local23] = this.anInt4972 + (this.anInt4974 * local21[local23] >> 12);
			}
		}
		return local11;
	}
}
