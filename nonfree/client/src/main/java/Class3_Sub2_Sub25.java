import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class3_Sub2_Sub25 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ou", name = "F", descriptor = "I")
	private int anInt8260 = 0;

	@OriginalMember(owner = "client!ou", name = "G", descriptor = "I")
	private int anInt8267 = 4096;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(28) int[] local28 = this.method9204(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static636.anInt10302; local30++) {
				@Pc(36) int local36 = local28[local30];
				local11[local30] = local36 >= this.anInt8260 && local36 <= this.anInt8267 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt8260 = arg1.method5272();
		} else if (arg0 == 1) {
			this.anInt8267 = arg1.method5272();
		}
	}
}
