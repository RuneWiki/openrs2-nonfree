import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class5_Sub3_Sub33 extends Class5_Sub3 {

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83) {
			@Pc(29) int[][] local29 = this.method6023(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static7.anInt129; local55++) {
				local45[local55] = 4096 - local33[local55];
				local49[local55] = 4096 - local37[local55];
				local53[local55] = 4096 - local41[local55];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(27) int[] local27 = this.method6020(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static7.anInt129; local29++) {
				local17[local29] = 4096 - local27[local29];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean592 = arg0.method5115() == 1;
		}
	}
}
