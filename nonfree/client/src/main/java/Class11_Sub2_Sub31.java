import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class11_Sub2_Sub31 extends Class11_Sub2 {

	@OriginalMember(owner = "client!qp", name = "I", descriptor = "I")
	private int anInt5226 = 0;

	@OriginalMember(owner = "client!qp", name = "K", descriptor = "I")
	private int anInt5228 = 4096;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub31() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(26) int[] local26 = this.method5710(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static339.anInt6549; local28++) {
				@Pc(34) int local34 = local26[local28];
				local16[local28] = this.anInt5226 <= local34 && local34 <= this.anInt5228 ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5226 = arg0.method5187();
		} else if (arg1 == 1) {
			this.anInt5228 = arg0.method5187();
		}
	}
}
