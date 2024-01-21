import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class2_Sub3_Sub4 extends Class2_Sub3 {

	@OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
	private int anInt500;

	@OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
	private int anInt504;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt500 = arg1.method2933();
		} else if (arg0 == 1) {
			this.anInt504 = arg1.method2933();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(26) int[] local26 = this.method3011(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static53.anInt1184; local28++) {
				@Pc(34) int local34 = local26[local28];
				local16[local28] = local34 >= this.anInt500 && this.anInt504 >= local34 ? 4096 : 0;
			}
		}
		return local16;
	}
}
