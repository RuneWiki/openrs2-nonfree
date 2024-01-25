import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class2_Sub6_Sub7 extends Class2_Sub6 {

	@OriginalMember(owner = "client!dt", name = "L", descriptor = "I")
	private int anInt2029 = 1024;

	@OriginalMember(owner = "client!dt", name = "P", descriptor = "I")
	private int anInt2032 = 3072;

	@OriginalMember(owner = "client!dt", name = "R", descriptor = "I")
	private int anInt2033 = 2048;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt2029 = arg1.method8546();
		} else if (arg0 == 1) {
			this.anInt2032 = arg1.method8546();
		} else if (arg0 == 2) {
			super.aBoolean743 = arg1.method8547() == 1;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V")
	@Override
	public void method8462() {
		this.anInt2033 = this.anInt2032 - this.anInt2029;
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8470(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass52_41.method962(arg0);
		if (super.aClass52_41.aBoolean88) {
			@Pc(25) int[][] local25 = this.method8465(0, arg0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			@Pc(41) int[] local41 = local15[0];
			@Pc(45) int[] local45 = local15[1];
			@Pc(49) int[] local49 = local15[2];
			for (@Pc(51) int local51 = 0; local51 < Static51.anInt1085; local51++) {
				local41[local51] = this.anInt2029 + (local29[local51] * this.anInt2033 >> 12);
				local45[local51] = (this.anInt2033 * local33[local51] >> 12) + this.anInt2029;
				local49[local51] = (this.anInt2033 * local37[local51] >> 12) + this.anInt2029;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(28) int[] local28 = this.method8461(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static51.anInt1085; local30++) {
				local18[local30] = (local28[local30] * this.anInt2033 >> 12) + this.anInt2029;
			}
		}
		return local18;
	}
}
