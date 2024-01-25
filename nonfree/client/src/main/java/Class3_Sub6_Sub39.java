import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class3_Sub6_Sub39 extends Class3_Sub6 {

	@OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
	private int anInt9364 = 2048;

	@OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
	private int anInt9365 = 1024;

	@OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
	private int anInt9369 = 3072;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(29) int[] local29 = this.method7769(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static521.anInt8383; local31++) {
				local11[local31] = this.anInt9365 + (this.anInt9364 * local29[local31] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	@Override
	public void method7768() {
		this.anInt9364 = this.anInt9369 - this.anInt9365;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9365 = arg0.method5198();
		} else if (arg1 == 1) {
			this.anInt9369 = arg0.method5198();
		} else if (arg1 == 2) {
			super.aBoolean729 = arg0.method5175() == 1;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method7776(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass155_41.method3666(arg0);
		if (super.aClass155_41.aBoolean306) {
			@Pc(21) int[][] local21 = this.method7773(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static521.anInt8383; local47++) {
				local37[local47] = (this.anInt9364 * local25[local47] >> 12) + this.anInt9365;
				local41[local47] = (local29[local47] * this.anInt9364 >> 12) + this.anInt9365;
				local45[local47] = (this.anInt9364 * local33[local47] >> 12) + this.anInt9365;
			}
		}
		return local11;
	}
}
