import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class3_Sub1_Sub5 extends Class3_Sub1 {

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			super.aBoolean773 = arg1.method2048(255) == 1;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(21) int[] local21 = this.method9577(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static379.anInt5859; local23++) {
				local11[local23] = 4096 - local21[local23];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509) {
			@Pc(21) int[][] local21 = this.method9576(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static379.anInt5859; local47++) {
				local37[local47] = 4096 - local25[local47];
				local41[local47] = 4096 - local29[local47];
				local45[local47] = 4096 - local33[local47];
			}
		}
		return local11;
	}
}
