import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aia")
public final class Class2_Sub6_Sub1 extends Class2_Sub6 {

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(26) int[] local26 = this.method8461(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static51.anInt1085; local28++) {
				local16[local28] = 4096 - local26[local28];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(II)[[I")
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
				local41[local51] = 4096 - local29[local51];
				local45[local51] = 4096 - local33[local51];
				local49[local51] = 4096 - local37[local51];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			super.aBoolean743 = arg1.method8547() == 1;
		}
	}
}
