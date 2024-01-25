import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class5_Sub3_Sub39 extends Class5_Sub3 {

	@OriginalMember(owner = "client!wu", name = "R", descriptor = "I")
	private int anInt10919 = 0;

	@OriginalMember(owner = "client!wu", name = "O", descriptor = "I")
	private int anInt10921 = 4096;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub39() {
		super(1, true);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt10919 = arg0.method7333();
		} else if (arg1 == 1) {
			this.anInt10921 = arg0.method7333();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(30) int[] local30 = this.method9205(arg0, 0);
			for (@Pc(32) int local32 = 0; local32 < Static7.anInt102; local32++) {
				@Pc(38) int local38 = local30[local32];
				local18[local32] = local38 >= this.anInt10919 && this.anInt10921 >= local38 ? 4096 : 0;
			}
		}
		return local18;
	}
}
