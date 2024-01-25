import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class2_Sub11_Sub30 extends Class2_Sub11 {

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			super.aBoolean936 = arg1.method8581(-17416) == 1;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(27) int[] local27 = this.method9540(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static301.anInt10214; local29++) {
				local17[local29] = 4096 - local27[local29];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846) {
			@Pc(21) int[][] local21 = this.method9538(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static301.anInt10214; local47++) {
				local37[local47] = 4096 - local25[local47];
				local41[local47] = 4096 - local29[local47];
				local45[local47] = 4096 - local33[local47];
			}
		}
		return local11;
	}
}
