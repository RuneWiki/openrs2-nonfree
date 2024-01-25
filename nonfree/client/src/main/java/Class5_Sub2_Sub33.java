import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public final class Class5_Sub2_Sub33 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ufa", name = "D", descriptor = "I")
	private int anInt9546 = 0;

	@OriginalMember(owner = "client!ufa", name = "H", descriptor = "I")
	private int anInt9550 = 4096;

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub33() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(28) int[] local28 = this.method9042(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static597.anInt10025; local30++) {
				@Pc(36) int local36 = local28[local30];
				local16[local30] = this.anInt9546 <= local36 && local36 <= this.anInt9550 ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9546 = arg0.method5968();
		} else if (arg1 == 1) {
			this.anInt9550 = arg0.method5968();
		}
	}
}
