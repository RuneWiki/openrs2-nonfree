import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ab", name = "W", descriptor = "I")
	private int anInt105 = 4096;

	@OriginalMember(owner = "client!ab", name = "db", descriptor = "I")
	private int anInt109 = 0;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt109 = arg0.method2095();
		} else if (arg1 == 1) {
			this.anInt105 = arg0.method2095();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(26) int[] local26 = this.method3955(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static54.anInt953; local28++) {
				@Pc(34) int local34 = local26[local28];
				local16[local28] = this.anInt109 <= local34 && this.anInt105 >= local34 ? 4096 : 0;
			}
		}
		return local16;
	}
}
