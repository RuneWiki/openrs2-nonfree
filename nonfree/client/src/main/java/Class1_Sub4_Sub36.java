import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class1_Sub4_Sub36 extends Class1_Sub4 {

	@OriginalMember(owner = "client!vf", name = "lb", descriptor = "I")
	private int anInt4602;

	@OriginalMember(owner = "client!vf", name = "mb", descriptor = "I")
	private int anInt4603;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(26) int[] local26 = this.method3215(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static73.anInt1888; local28++) {
				@Pc(34) int local34 = local26[local28];
				local11[local28] = local34 >= this.anInt4603 && this.anInt4602 >= local34 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4603 = arg0.method546();
		} else if (arg1 == 1) {
			this.anInt4602 = arg0.method546();
		}
	}
}
