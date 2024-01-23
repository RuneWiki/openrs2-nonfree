import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class1_Sub1_Sub38 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vg", name = "ab", descriptor = "I")
	private int anInt4866 = 4096;

	@OriginalMember(owner = "client!vg", name = "db", descriptor = "I")
	private int anInt4868 = 0;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub38() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(26) int[] local26 = this.method3706(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static11.anInt294; local28++) {
				@Pc(34) int local34 = local26[local28];
				local16[local28] = this.anInt4868 <= local34 && local34 <= this.anInt4866 ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4868 = arg0.method2964();
		} else if (arg1 == 1) {
			this.anInt4866 = arg0.method2964();
		}
	}
}
