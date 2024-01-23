import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
	private int anInt1601 = 4096;

	@OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
	private int anInt1603 = 0;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub11() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(26) int[] local26 = this.method3203(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static62.anInt1675; local28++) {
				@Pc(34) int local34 = local26[local28];
				local16[local28] = local34 >= this.anInt1603 && local34 <= this.anInt1601 ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1603 = arg0.method163();
		} else if (arg1 == 1) {
			this.anInt1601 = arg0.method163();
		}
	}
}
