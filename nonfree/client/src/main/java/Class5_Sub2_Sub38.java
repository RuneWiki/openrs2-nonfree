import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class5_Sub2_Sub38 extends Class5_Sub2 {

	@OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
	private int anInt6512 = 4096;

	@OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
	private int anInt6516 = 0;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub38() {
		super(1, true);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6516 = arg0.method1845();
		} else if (arg1 == 1) {
			this.anInt6512 = arg0.method1845();
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(28) int[] local28 = this.method5808(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static15.anInt493; local30++) {
				@Pc(36) int local36 = local28[local30];
				local18[local30] = local36 >= this.anInt6516 && this.anInt6512 >= local36 ? 4096 : 0;
			}
		}
		return local18;
	}
}
