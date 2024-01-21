import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class2_Sub1_Sub22 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ne", name = "lb", descriptor = "I")
	private int anInt2611;

	@OriginalMember(owner = "client!ne", name = "rb", descriptor = "I")
	private int anInt2612;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2611 = arg0.method2353();
		} else if (arg1 == 1) {
			this.anInt2612 = arg0.method2353();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(26) int[] local26 = this.method2980(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static129.anInt3118; local28++) {
				@Pc(34) int local34 = local26[local28];
				local11[local28] = local34 >= this.anInt2611 && local34 <= this.anInt2612 ? 4096 : 0;
			}
		}
		return local11;
	}
}
