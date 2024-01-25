import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class3_Sub1_Sub10 extends Class3_Sub1 {

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			super.aBoolean850 = arg1.method6538() == 1;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(26) int[] local26 = this.method8362(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static131.anInt2935; local28++) {
				local16[local28] = 4096 - local26[local28];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587) {
			@Pc(21) int[][] local21 = this.method8360(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static131.anInt2935; local47++) {
				local37[local47] = 4096 - local25[local47];
				local41[local47] = 4096 - local29[local47];
				local45[local47] = 4096 - local33[local47];
			}
		}
		return local11;
	}
}
