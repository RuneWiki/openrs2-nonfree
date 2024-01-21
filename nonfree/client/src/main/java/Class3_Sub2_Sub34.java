import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class3_Sub2_Sub34 extends Class3_Sub2 {

	@OriginalMember(owner = "client!th", name = "ib", descriptor = "I")
	private int anInt3807 = 3072;

	@OriginalMember(owner = "client!th", name = "fb", descriptor = "I")
	private int anInt3805 = 2048;

	@OriginalMember(owner = "client!th", name = "rb", descriptor = "I")
	private int anInt3813 = 1024;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(29) int[] local29 = this.method3328(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static190.anInt3865; local31++) {
				local19[local31] = this.anInt3813 + (local29[local31] * this.anInt3805 >> 12);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3813 = arg0.method1270();
		} else if (arg1 == 1) {
			this.anInt3807 = arg0.method1270();
		} else if (arg1 == 2) {
			super.aBoolean190 = arg0.method1278() == 1;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135) {
			@Pc(29) int[][] local29 = this.method3332(0, arg0);
			@Pc(33) int[] local33 = local29[1];
			@Pc(37) int[] local37 = local29[2];
			@Pc(41) int[] local41 = local19[0];
			@Pc(45) int[] local45 = local29[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static190.anInt3865; local55++) {
				local41[local55] = this.anInt3813 + (this.anInt3805 * local45[local55] >> 12);
				local49[local55] = (this.anInt3805 * local33[local55] >> 12) + this.anInt3813;
				local53[local55] = this.anInt3813 + (local37[local55] * this.anInt3805 >> 12);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
	@Override
	public void method3329() {
		this.anInt3805 = this.anInt3807 - this.anInt3813;
	}
}
