import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class4_Sub4_Sub26 extends Class4_Sub4 {

	@OriginalMember(owner = "client!oh", name = "Q", descriptor = "I")
	private int anInt4750 = 3072;

	@OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
	private int anInt4747 = 1024;

	@OriginalMember(owner = "client!oh", name = "U", descriptor = "I")
	private int anInt4753 = 2048;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt4747 = arg1.method2404();
		} else if (arg0 == 1) {
			this.anInt4750 = arg1.method2404();
		} else if (arg0 == 2) {
			super.aBoolean563 = arg1.method2380() == 1;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(23) int[] local23 = this.method5386(0, arg0);
			for (@Pc(25) int local25 = 0; local25 < Static124.anInt3576; local25++) {
				local11[local25] = (this.anInt4753 * local23[local25] >> 12) + this.anInt4747;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(Z)V")
	@Override
	public void method5392() {
		this.anInt4753 = this.anInt4750 - this.anInt4747;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5383(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method4316(arg0);
		if (super.aClass160_41.aBoolean441) {
			@Pc(21) int[][] local21 = this.method5384(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static124.anInt3576; local47++) {
				local37[local47] = (this.anInt4753 * local25[local47] >> 12) + this.anInt4747;
				local41[local47] = this.anInt4747 + (this.anInt4753 * local29[local47] >> 12);
				local45[local47] = (this.anInt4753 * local33[local47] >> 12) + this.anInt4747;
			}
		}
		return local11;
	}
}
