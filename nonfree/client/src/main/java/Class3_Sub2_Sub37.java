import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class3_Sub2_Sub37 extends Class3_Sub2 {

	@OriginalMember(owner = "client!vp", name = "Q", descriptor = "I")
	private int anInt7265 = 1024;

	@OriginalMember(owner = "client!vp", name = "P", descriptor = "I")
	private int anInt7264 = 3072;

	@OriginalMember(owner = "client!vp", name = "I", descriptor = "I")
	private int anInt7260 = 2048;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5303(arg0);
		if (super.aClass249_41.aBoolean583) {
			@Pc(21) int[][] local21 = this.method5899(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static406.anInt6694; local47++) {
				local37[local47] = this.anInt7265 + (this.anInt7260 * local25[local47] >> 12);
				local41[local47] = (local29[local47] * this.anInt7260 >> 12) + this.anInt7265;
				local45[local47] = this.anInt7265 + (this.anInt7260 * local33[local47] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(25) int[] local25 = this.method5894(0, arg0);
			for (@Pc(27) int local27 = 0; local27 < Static406.anInt6694; local27++) {
				local15[local27] = (this.anInt7260 * local25[local27] >> 12) + this.anInt7265;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)V")
	@Override
	public void method5898() {
		this.anInt7260 = this.anInt7264 - this.anInt7265;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7265 = arg0.method2588();
		} else if (arg1 == 1) {
			this.anInt7264 = arg0.method2588();
		} else if (arg1 == 2) {
			super.aBoolean650 = arg0.method2582() == 1;
		}
	}
}
